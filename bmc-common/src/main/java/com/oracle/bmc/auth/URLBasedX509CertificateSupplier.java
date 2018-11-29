/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.concurrent.atomic.AtomicReference;

import javax.security.auth.Refreshable;

import org.apache.commons.io.IOUtils;

import com.oracle.bmc.auth.internal.X509CertificateWithOriginalPem;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;

import lombok.extern.slf4j.Slf4j;

/**
 * {@link X509CertificateSupplier} implementation that reads both certificate and private key
 * off of URL.  This class also provides a way to manually refresh the certificate and
 * private key at any point.
 */
@Slf4j
public class URLBasedX509CertificateSupplier implements X509CertificateSupplier, Refreshable {
    /**
     * Provide a way for the application environment to disable the X509 workaround by setting
     * a system property to "true". On the command line, this can be done using
     * `-Doci.sdk.experimental.suppressX509Workaround=true`
     */
    private static final boolean EXPERIMENTAL_SUPPRESS_X509_WORKAROUND =
            Boolean.getBoolean("oci.sdk.experimental.suppressX509Workaround");

    static {
        LOG.info("suppressX509Workaround flag set to {}", EXPERIMENTAL_SUPPRESS_X509_WORKAROUND);
    }

    /**
     * The certificate and the private key of certificate.
     */
    private final AtomicReference<CertificateAndPrivateKeyPair> certificateAndKeyPair =
            new AtomicReference<>(null);

    /**
     * The url of certificate.
     */
    private final URL certificateUrl;

    /**
     * The url of private key.
     */
    private final URL privateKeyUrl;

    /**
     * The passphrase of private key.
     */
    private final char[] privateKeyPassphraseCharacters;

    /**
     * Constructor.
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted private keys
     */
    public URLBasedX509CertificateSupplier(
            URL certificateUrl, URL privateKeyUrl, char[] privateKeyPassphraseCharacters) {
        this.certificateUrl = certificateUrl;
        this.privateKeyUrl = privateKeyUrl;
        this.privateKeyPassphraseCharacters = privateKeyPassphraseCharacters;

        refresh();
    }

    /**
     * Constructor.
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphrase The private key passphrase, may be null for unencrypted private keys
     *
     * @deprecated use {@link URLBasedX509CertificateSupplier#URLBasedX509CertificateSupplier(URL, URL, char[])} instead
     */
    @Deprecated
    public URLBasedX509CertificateSupplier(
            URL certificateUrl, URL privateKeyUrl, String privateKeyPassphrase) {
        this.certificateUrl = certificateUrl;
        this.privateKeyUrl = privateKeyUrl;
        this.privateKeyPassphraseCharacters =
                privateKeyPassphrase != null ? privateKeyPassphrase.toCharArray() : null;

        refresh();
    }

    /**
     * Gets the certificate
     * @return The certificate, must not be null
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Override
    @Deprecated
    public X509Certificate getCertificate() {
        return certificateAndKeyPair.get().getCertificate();
    }

    /**
     * A method to refresh the X509 certificate.
     */
    @Override
    public void refresh() {
        String rawCertificate = readRawCertificate(certificateUrl);
        X509Certificate certificate = readCertificate(rawCertificate);
        RSAPrivateKey privateKey = readPrivateKey(privateKeyUrl, privateKeyPassphraseCharacters);
        if (EXPERIMENTAL_SUPPRESS_X509_WORKAROUND) {
            this.certificateAndKeyPair.set(
                    new CertificateAndPrivateKeyPair(certificate, privateKey));
        } else {
            X509CertificateWithOriginalPem wrappedCertificate =
                    new X509CertificateWithOriginalPem(certificate, rawCertificate);
            this.certificateAndKeyPair.set(
                    new CertificateAndPrivateKeyPair(wrappedCertificate, privateKey));
        }
    }

    /**
     * So far we don't care whether the certificate is current or not.
     * @return false always.
     */
    @Override
    public boolean isCurrent() {
        return false;
    }

    /**
     * Read the certificate from url.
     * @param certificateUrl the certificate url
     * @return the certificate
     */
    private static X509Certificate readCertificate(String certificate) {
        try {
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            return (X509Certificate)
                    factory.generateCertificate(new ByteArrayInputStream(certificate.getBytes()));
        } catch (CertificateException e) {
            throw new IllegalArgumentException("Invalid certificate.", e);
        }
    }

    private static String readRawCertificate(URL certificateUrl) {
        try (InputStream is = certificateUrl.openStream()) {
            return IOUtils.toString(is, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalArgumentException("Open stream of certificate failed.", e);
        }
    }

    /**
     * Read the private key from url.
     * @param privateKeyUrl the private key url.
     * @param privateKeyPassphrase the private key passhprase
     * @return the private key
     */
    private static RSAPrivateKey readPrivateKey(URL privateKeyUrl, char[] privateKeyPassphrase) {
        if (privateKeyUrl == null) {
            return null;
        }

        try {
            return new PEMFileRSAPrivateKeySupplier(
                            privateKeyUrl.openStream(), privateKeyPassphrase)
                    .getKey(null)
                    .orNull();
        } catch (IOException e) {
            throw new IllegalArgumentException("No file for private key", e);
        }
    }

    /**
     * Corresponding private key of the certificate. You must implement this
     * method for leaf certificates (to sign the request made to the auth service
     * to get a security token). For intermediate certificates, you can return null.
     * @return The private key
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Override
    @Deprecated
    public RSAPrivateKey getPrivateKey() {
        return getCertificateAndKeyPair().getPrivateKey();
    }

    /**
     * Returns the X509 certificate and private key.  The X509 certificate will always
     * be valid.  The private key may be null for intermediate certificates.  For leaf
     * certificates, the private key will always be valid.
     * @return The certificate and private key pair.
     */
    @Override
    public CertificateAndPrivateKeyPair getCertificateAndKeyPair() {
        return certificateAndKeyPair.get();
    }
}
