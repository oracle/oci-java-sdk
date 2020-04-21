/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

import javax.security.auth.Refreshable;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
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

    @Builder
    @Data
    public static class ResourceDetails {
        /**
         * The url of the resource
         */
        private final URL url;

        /**
         * Headers to be sent along with the resource fetch request
         */
        private final Map<String, String> headers;
    }

    /**
     * The certificate and the private key of certificate.
     */
    private final AtomicReference<CertificateAndPrivateKeyPair> certificateAndKeyPair =
            new AtomicReference<>(null);

    /**
     * The resource details of certificate.
     */
    private final ResourceDetails certificateDetails;

    /**
     * The resource details of private key.
     */
    private final ResourceDetails privateKeyDetails;

    /**
     * The passphrase of private key.
     */
    private final char[] privateKeyPassphraseCharacters;

    /**
     * Constructor.
     * @param certificateResourceDetails The certificate resource details
     * @param privateKeyResourceDetails The private key resource details, may be null for intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted private keys
     */
    public URLBasedX509CertificateSupplier(
            ResourceDetails certificateResourceDetails,
            ResourceDetails privateKeyResourceDetails,
            char[] privateKeyPassphraseCharacters) {
        this.certificateDetails = certificateResourceDetails;
        this.privateKeyDetails = privateKeyResourceDetails;
        this.privateKeyPassphraseCharacters = privateKeyPassphraseCharacters;

        refresh();
    }

    /**
     * Constructor.
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted private keys
     */
    public URLBasedX509CertificateSupplier(
            URL certificateUrl, URL privateKeyUrl, char[] privateKeyPassphraseCharacters) {
        this(
                ResourceDetails.builder().url(certificateUrl).build(),
                ResourceDetails.builder().url(privateKeyUrl).build(),
                privateKeyPassphraseCharacters);
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
        this(
                certificateUrl,
                privateKeyUrl,
                privateKeyPassphrase != null ? privateKeyPassphrase.toCharArray() : null);
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
        String rawCertificate = readRawCertificate(certificateDetails);
        X509Certificate certificate = readCertificate(rawCertificate);
        RSAPrivateKey privateKey =
                readPrivateKey(privateKeyDetails, privateKeyPassphraseCharacters);
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
     * Read the certificate from a raw string.
     * @param certificate the certificate
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

    private static String readRawCertificate(final ResourceDetails certificateResourceDetails) {
        try (InputStream is = getResourceStream(certificateResourceDetails)) {
            return IOUtils.toString(is, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalArgumentException("Open stream of certificate failed.", e);
        }
    }

    private static InputStream getResourceStream(@NonNull final ResourceDetails resourceDetails)
            throws IOException {
        Objects.requireNonNull(resourceDetails.getUrl(), "Resource url cannot be null.");
        final URLConnection urlConnection = resourceDetails.getUrl().openConnection();
        if (resourceDetails.getHeaders() != null) {
            resourceDetails.getHeaders().forEach(urlConnection::setRequestProperty);
        }
        return urlConnection.getInputStream();
    }

    /**
     * Read the private key from url.
     * @param privateKeyResouceDetails the private key resource details.
     * @param privateKeyPassphrase the private key passhprase
     * @return the private key
     */
    private static RSAPrivateKey readPrivateKey(
            final ResourceDetails privateKeyResouceDetails, char[] privateKeyPassphrase) {
        if (privateKeyResouceDetails == null || privateKeyResouceDetails.getUrl() == null) {
            return null;
        }

        try {
            return new PEMFileRSAPrivateKeySupplier(
                            getResourceStream(privateKeyResouceDetails), privateKeyPassphrase)
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
