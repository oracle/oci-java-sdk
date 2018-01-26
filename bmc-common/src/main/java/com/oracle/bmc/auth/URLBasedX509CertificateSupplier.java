/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;
import com.oracle.bmc.util.StreamUtils;

import javax.security.auth.Refreshable;
import java.io.*;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.concurrent.atomic.AtomicReference;

/**
 * {@link X509CertificateSupplier} implementation that reads both certificate and private key
 * off of URL.  This class also provides a way to manually refresh the certificate and
 * private key at any point.
 */
public class URLBasedX509CertificateSupplier implements X509CertificateSupplier, Refreshable {
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
    private final String privateKeyPassphrase;

    /**
     * ctor
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphrase The private key passphrase, may be null for unencrypted private keys
     */
    public URLBasedX509CertificateSupplier(
            URL certificateUrl, URL privateKeyUrl, String privateKeyPassphrase) {
        this.certificateUrl = certificateUrl;
        this.privateKeyUrl = privateKeyUrl;
        this.privateKeyPassphrase = privateKeyPassphrase;

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
        X509Certificate certificate = readCertificate(certificateUrl);
        RSAPrivateKey privateKey = readPrivateKey(privateKeyUrl, privateKeyPassphrase);

        this.certificateAndKeyPair.set(new CertificateAndPrivateKeyPair(certificate, privateKey));
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
    private static X509Certificate readCertificate(URL certificateUrl) {
        InputStream is = null;
        try {
            is = certificateUrl.openStream();
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            return (X509Certificate) factory.generateCertificate(is);
        } catch (CertificateException e) {
            throw new IllegalArgumentException("Invalid certificate.", e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Open stream of certificate failed.", e);
        } finally {
            StreamUtils.closeQuietly(is);
        }
    }

    /**
     * Read the private key from url.
     * @param privateKeyUrl the private key url.
     * @param privateKeyPassphrase the private key passhprase
     * @return the private key
     */
    private static RSAPrivateKey readPrivateKey(URL privateKeyUrl, String privateKeyPassphrase) {
        if (privateKeyUrl == null) {
            return null;
        }

        try {
            return new PEMFileRSAPrivateKeySupplier(
                            privateKeyUrl.openStream(),
                            privateKeyPassphrase != null
                                    ? privateKeyPassphrase.toCharArray()
                                    : null)
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
