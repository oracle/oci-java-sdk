/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import jakarta.annotation.Nonnull;
import javax.security.auth.Refreshable;

import org.slf4j.Logger;

import com.oracle.bmc.auth.internal.X509CertificateWithOriginalPem;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;
import com.oracle.bmc.util.StreamUtils;

/**
 * {@link X509CertificateSupplier} implementation that reads both certificate and private key off of
 * URL. This class also provides a way to manually refresh the certificate and private key at any
 * point.
 */
public class URLBasedX509CertificateSupplier implements X509CertificateSupplier, Refreshable {
    private static final String CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS_VAR_NAME =
            "OCI_JAVASDK_CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS";
    private static final String CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS_VAR_NAME =
            "OCI_JAVASDK_CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS";

    /**
     * Set the environment variables to configure read timeout and connection timeout (in
     * milliseconds) for URL Connection
     */
    protected static final String CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS =
            System.getenv(CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS_VAR_NAME);

    protected static final String CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS =
            System.getenv(CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS_VAR_NAME);

    /**
     * Provide a way for the application environment to disable the X509 workaround by setting a
     * system property to "true". On the command line, this can be done using
     * `-Doci.sdk.experimental.suppressX509Workaround=true`
     */
    private static final boolean EXPERIMENTAL_SUPPRESS_X509_WORKAROUND =
            Boolean.getBoolean("oci.sdk.experimental.suppressX509Workaround");

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(URLBasedX509CertificateSupplier.class);

    static {
        LOG.info("suppressX509Workaround flag set to {}", EXPERIMENTAL_SUPPRESS_X509_WORKAROUND);
    }

    public static class ResourceDetails {
        /** The url of the resource */
        private final URL url;

        /** Headers to be sent along with the resource fetch request */
        private final Map<String, String> headers;

        @java.beans.ConstructorProperties({"url", "headers"})
        ResourceDetails(URL url, Map<String, String> headers) {
            this.url = url;
            this.headers = headers;
        }

        public static ResourceDetailsBuilder builder() {
            return new ResourceDetailsBuilder();
        }

        public URL getUrl() {
            return this.url;
        }

        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ResourceDetails)) return false;
            final ResourceDetails other = (ResourceDetails) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$url = this.getUrl();
            final Object other$url = other.getUrl();
            if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
            final Object this$headers = this.getHeaders();
            final Object other$headers = other.getHeaders();
            if (this$headers == null ? other$headers != null : !this$headers.equals(other$headers))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ResourceDetails;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $url = this.getUrl();
            result = result * PRIME + ($url == null ? 43 : $url.hashCode());
            final Object $headers = this.getHeaders();
            result = result * PRIME + ($headers == null ? 43 : $headers.hashCode());
            return result;
        }

        public String toString() {
            return "URLBasedX509CertificateSupplier.ResourceDetails(url="
                    + this.getUrl()
                    + ", headers="
                    + this.getHeaders()
                    + ")";
        }

        public static class ResourceDetailsBuilder {
            private URL url;
            private Map<String, String> headers;

            ResourceDetailsBuilder() {}

            public ResourceDetailsBuilder url(URL url) {
                this.url = url;
                return this;
            }

            public ResourceDetailsBuilder headers(Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            public ResourceDetails build() {
                return new ResourceDetails(url, headers);
            }

            public String toString() {
                return "URLBasedX509CertificateSupplier.ResourceDetails.ResourceDetailsBuilder(url="
                        + this.url
                        + ", headers="
                        + this.headers
                        + ")";
            }
        }
    }

    /** The certificate and the private key of certificate. */
    private final AtomicReference<CertificateAndPrivateKeyPair> certificateAndKeyPair =
            new AtomicReference<>(null);

    /** The resource details of certificate. */
    private final ResourceDetails certificateDetails;

    /** The resource details of private key. */
    private final ResourceDetails privateKeyDetails;

    /** The passphrase of private key. */
    private final char[] privateKeyPassphraseCharacters;

    /**
     * Constructor.
     *
     * @param certificateResourceDetails The certificate resource details
     * @param privateKeyResourceDetails The private key resource details, may be null for
     *     intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted
     *     private keys
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
     *
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted
     *     private keys
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
     *
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphrase The private key passphrase, may be null for unencrypted private
     *     keys
     * @deprecated use {@link URLBasedX509CertificateSupplier#URLBasedX509CertificateSupplier(URL,
     *     URL, char[])} instead
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
     *
     * @return The certificate, must not be null
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Override
    @Deprecated
    public X509Certificate getCertificate() {
        return certificateAndKeyPair.get().getCertificate();
    }

    /** A method to refresh the X509 certificate. */
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
     *
     * @return false always.
     */
    @Override
    public boolean isCurrent() {
        return false;
    }

    /**
     * Read the certificate from a raw string.
     *
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
        final int MAX_RETRIES = 3;
        IOException lastException = null;
        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try (InputStream is = getResourceStream(certificateResourceDetails)) {
                return StreamUtils.toString(is, StandardCharsets.UTF_8);
            } catch (IOException e) {
                LOG.info("Attempt {} to open stream of certificate failed.", (retry + 1), e);
                lastException = e;
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(30));
                } catch (InterruptedException interruptedException) {
                    LOG.debug(
                            "Thread interrupted while waiting to make next readRawCertificate call to instance "
                                    + "metadata service",
                            interruptedException);
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Open stream of certificate failed.", lastException);
    }

    private static InputStream getResourceStream(@Nonnull final ResourceDetails resourceDetails)
            throws IOException {
        if (resourceDetails == null) {
            throw new java.lang.NullPointerException(
                    "resourceDetails is marked non-null but is null");
        }
        Objects.requireNonNull(resourceDetails.getUrl(), "Resource url cannot be null.");
        final URLConnection urlConnection = resourceDetails.getUrl().openConnection();
        if (CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS != null) {
            urlConnection.setReadTimeout(
                    Integer.parseInt(CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS));
        }
        if (CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS != null) {
            urlConnection.setConnectTimeout(
                    Integer.parseInt(CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS));
        }
        if (resourceDetails.getHeaders() != null) {
            resourceDetails.getHeaders().forEach(urlConnection::setRequestProperty);
        }
        return urlConnection.getInputStream();
    }

    /**
     * Read the private key from url.
     *
     * @param privateKeyResourceDetails the private key resource details.
     * @param privateKeyPassphrase the private key passhprase
     * @return the private key
     */
    private static RSAPrivateKey readPrivateKey(
            final ResourceDetails privateKeyResourceDetails, char[] privateKeyPassphrase) {
        if (privateKeyResourceDetails == null || privateKeyResourceDetails.getUrl() == null) {
            return null;
        }

        final int MAX_RETRIES = 3;
        Exception lastException = null;
        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try (InputStream inputStream = getResourceStream(privateKeyResourceDetails)) {
                return new PEMFileRSAPrivateKeySupplier(inputStream, privateKeyPassphrase)
                        .supplyKey(null)
                        .orElse(null);
            } catch (IOException
                    | PEMFileRSAPrivateKeySupplier.PEMFileRSAPrivateKeySupplierException e) {
                LOG.info("Attempt {} to read private key failed. ", (retry + 1), e);
                lastException = e;
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(30));
                } catch (InterruptedException interruptedException) {
                    LOG.debug(
                            "Thread interrupted while waiting to make next readPrivateKey call to instance"
                                    + " metadata service ",
                            interruptedException);
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        throw new IllegalArgumentException("No file for private key ", lastException);
    }

    /**
     * Corresponding private key of the certificate. You must implement this method for leaf
     * certificates (to sign the request made to the auth service to get a security token). For
     * intermediate certificates, you can return null.
     *
     * @return The private key
     * @deprecated use {@link X509CertificateSupplier#getCertificateAndKeyPair()} instead
     */
    @Override
    @Deprecated
    public RSAPrivateKey getPrivateKey() {
        return getCertificateAndKeyPair().getPrivateKey();
    }

    /**
     * Returns the X509 certificate and private key. The X509 certificate will always be valid. The
     * private key may be null for intermediate certificates. For leaf certificates, the private key
     * will always be valid.
     *
     * @return The certificate and private key pair.
     */
    @Override
    public CertificateAndPrivateKeyPair getCertificateAndKeyPair() {
        return certificateAndKeyPair.get();
    }
}
