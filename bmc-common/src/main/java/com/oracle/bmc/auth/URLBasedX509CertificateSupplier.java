/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.internal.SyncFutureWaiter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.time.Duration;
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

    /** Optional configurator for HTTP(S) resource fetches. */
    private final ClientConfigurator clientConfigurator;

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
        this(
                certificateResourceDetails,
                privateKeyResourceDetails,
                privateKeyPassphraseCharacters,
                null);
    }

    /**
     * Constructor.
     *
     * @param certificateResourceDetails The certificate resource details
     * @param privateKeyResourceDetails The private key resource details, may be null for
     *     intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted
     *     private keys
     * @param clientConfigurator optional configurator for the underlying HTTP(S) client
     */
    public URLBasedX509CertificateSupplier(
            ResourceDetails certificateResourceDetails,
            ResourceDetails privateKeyResourceDetails,
            char[] privateKeyPassphraseCharacters,
            ClientConfigurator clientConfigurator) {
        this.certificateDetails = certificateResourceDetails;
        this.privateKeyDetails = privateKeyResourceDetails;
        this.privateKeyPassphraseCharacters = privateKeyPassphraseCharacters;
        this.clientConfigurator = clientConfigurator;

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
        this(certificateUrl, privateKeyUrl, privateKeyPassphraseCharacters, null);
    }

    /**
     * Constructor.
     *
     * @param certificateUrl The certificate url
     * @param privateKeyUrl The private key url, may be null for intermediate certificates
     * @param privateKeyPassphraseCharacters The private key passphrase, may be null for unencrypted
     *     private keys
     * @param clientConfigurator optional configurator for the underlying HTTP(S) client
     */
    public URLBasedX509CertificateSupplier(
            URL certificateUrl,
            URL privateKeyUrl,
            char[] privateKeyPassphraseCharacters,
            ClientConfigurator clientConfigurator) {
        this(
                ResourceDetails.builder().url(certificateUrl).build(),
                ResourceDetails.builder().url(privateKeyUrl).build(),
                privateKeyPassphraseCharacters,
                clientConfigurator);
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
                privateKeyPassphrase != null ? privateKeyPassphrase.toCharArray() : null,
                null);
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
        String rawCertificate = readRawCertificate(certificateDetails, clientConfigurator);
        X509Certificate certificate = readCertificate(rawCertificate);
        RSAPrivateKey privateKey =
                readPrivateKey(
                        privateKeyDetails, privateKeyPassphraseCharacters, clientConfigurator);
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

    /**
     * Reads the raw X.509 certificate data from the configured certificate resource.
     *
     * <p>The certificate is retrieved using {@link #readResource(ResourceDetails,
     * ClientConfigurator)} and decoded as a UTF-8 string. The method will retry up to three times
     * if an {@link IOException} occurs while reading the resource, waiting 30 seconds between each
     * attempt. If all retry attempts fail, an {@link IllegalArgumentException} is thrown wrapping
     * the last encountered exception.
     *
     * @param certificateResourceDetails details of the certificate resource to read from; must not
     *     be null
     * @param clientConfigurator optional configurator used when the resource is fetched via
     *     HTTP(S); may be {@code null} if no HTTP client customization is required
     * @return the raw certificate contents as a UTF-8 encoded string
     * @throws IllegalArgumentException if the certificate cannot be read after all retry attempts
     */
    private static String readRawCertificate(
            final ResourceDetails certificateResourceDetails,
            final ClientConfigurator clientConfigurator) {
        final int MAX_RETRIES = 3;
        Exception lastException = null;
        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try {
                return new String(
                        readResource(certificateResourceDetails, clientConfigurator),
                        StandardCharsets.UTF_8);
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

    /**
     * Reads the contents of the given resource into a byte array.
     *
     * <p>If a non-null {@link ClientConfigurator} is provided and the resource URL uses the {@code
     * http} or {@code https} protocol, the resource will be fetched using the SDK's {@link
     * HttpClient}, allowing customization of the underlying HTTP client. For all other protocols,
     * or when no {@code ClientConfigurator} is supplied, the resource is read using a standard
     * {@link URLConnection} obtained from {@link #getResourceStream(ResourceDetails)}.
     *
     * @param resourceDetails details of the resource to be read; must not be {@code null} and must
     *     contain a non-null URL
     * @param clientConfigurator optional configurator used when the resource is fetched via
     *     HTTP(S); may be {@code null} if no HTTP client customization is required
     * @return the full contents of the resource as a byte array
     * @throws IOException if an I/O error occurs while opening or reading the resource
     */
    private static byte[] readResource(
            @Nonnull final ResourceDetails resourceDetails,
            final ClientConfigurator clientConfigurator)
            throws IOException {
        if (shouldUseHttpClient(resourceDetails, clientConfigurator)) {
            return getResourceBytesUsingHttpClient(resourceDetails, clientConfigurator);
        }
        try (InputStream is = getResourceStream(resourceDetails)) {
            return StreamUtils.toByteArray(is);
        }
    }

    /**
     * Determines whether the given resource should be fetched using the SDK {@link HttpClient}.
     *
     * <p>This method returns {@code true} only when:
     *
     * <ul>
     *   <li>a non-{@code null} {@link ClientConfigurator} is provided, and
     *   <li>the resource URL is non-{@code null} and uses the {@code http} or {@code https}
     *       protocol (case-insensitive).
     * </ul>
     *
     * <p>If either the {@code clientConfigurator} is {@code null} or the resource URL is {@code
     * null}, {@code false} is returned and the caller is expected to fall back to using a standard
     * {@link URLConnection}-based access (see {@link #getResourceStream(ResourceDetails)}).
     *
     * @param resourceDetails details of the resource for which the HTTP client decision is made;
     *     must not be {@code null} and must contain the resource {@link URL}
     * @param clientConfigurator optional configurator used to customize the underlying HTTP client;
     *     if {@code null}, the HTTP client will not be used
     * @return {@code true} if the resource should be fetched using the SDK {@link HttpClient}
     *     (i.e., HTTP(S) URL and a non-{@code null} configurator); {@code false} otherwise
     */
    private static boolean shouldUseHttpClient(
            @Nonnull final ResourceDetails resourceDetails,
            final ClientConfigurator clientConfigurator) {
        if (clientConfigurator == null || resourceDetails.getUrl() == null) {
            return false;
        }
        String protocol = resourceDetails.getUrl().getProtocol();
        return "http".equalsIgnoreCase(protocol) || "https".equalsIgnoreCase(protocol);
    }

    /**
     * Fetches the contents of the given HTTP(S) resource using the SDK {@link HttpClient}.
     *
     * <p>The client is created via {@link HttpProvider#getDefault()} and configured with:
     *
     * <ul>
     *   <li>Base URI derived from {@link ResourceDetails#getUrl()},
     *   <li>an async pool size of {@code 1},
     *   <li>optional read and connect timeouts taken from the environment variables {@value
     *       #CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS_VAR_NAME} and {@value
     *       #CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS_VAR_NAME}, and
     *   <li>any additional customization supplied through the provided {@link ClientConfigurator}.
     * </ul>
     *
     * <p>A synchronous {@code GET} request is then executed against the resource URL. Any headers
     * present in {@link ResourceDetails#getHeaders()} are added to the request. If the HTTP
     * response status code is {@code 400} or greater, an {@link IOException} is thrown. Otherwise,
     * the response body stream is fully consumed and returned as a byte array.
     *
     * <p>This method is intended to be invoked only when {@link
     * #shouldUseHttpClient(ResourceDetails, ClientConfigurator)} has already determined that the
     * resource should be fetched over HTTP(S) with a non-{@code null} configurator.
     *
     * @param resourceDetails details of the HTTP(S) resource to fetch; must not be {@code null} and
     *     must contain a non-{@code null} {@link URL}
     * @param clientConfigurator configurator used to customize the underlying {@link HttpClient};
     *     must not be {@code null}
     * @return the full contents of the HTTP(S) resource as a byte array
     * @throws IOException if an error occurs while building the client, executing the request,
     *     receiving the response, or reading the response body, or if the response HTTP status is
     *     {@code 400} or greater
     */
    private static byte[] getResourceBytesUsingHttpClient(
            @Nonnull final ResourceDetails resourceDetails,
            final ClientConfigurator clientConfigurator)
            throws IOException {
        HttpClientBuilder builder =
                HttpProvider.getDefault()
                        .newBuilder()
                        .baseUri(URI.create(resourceDetails.getUrl().toExternalForm()))
                        .property(StandardClientProperties.ASYNC_POOL_SIZE, 1);

        if (CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS != null) {
            builder.property(
                    StandardClientProperties.READ_TIMEOUT,
                    Duration.ofMillis(
                            Integer.parseInt(CERTIFICATE_URL_CONNECTION_READ_TIMEOUT_IN_MILLIS)));
        }
        if (CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS != null) {
            builder.property(
                    StandardClientProperties.CONNECT_TIMEOUT,
                    Duration.ofMillis(
                            Integer.parseInt(CERTIFICATE_URL_CONNECTION_TIMEOUT_IN_MILLIS)));
        }
        clientConfigurator.customizeClient(builder);

        try (HttpClient client = builder.build()) {
            SyncFutureWaiter waiter = new SyncFutureWaiter();
            HttpRequest request = client.createRequest(Method.GET).offloadExecutor(waiter);
            if (resourceDetails.getHeaders() != null) {
                resourceDetails.getHeaders().forEach(request::header);
            }
            try (HttpResponse response = waitForResult(waiter, request.execute())) {
                if (response.status() >= 400) {
                    throw new IOException(
                            "Open stream of certificate failed with HTTP status "
                                    + response.status());
                }
                try (InputStream body = waitForResult(waiter, response.streamBody())) {
                    return StreamUtils.toByteArray(body);
                }
            }
        }
    }

    /**
     * Synchronously waits for the completion of the given {@link CompletionStage} using the
     * provided {@link SyncFutureWaiter}, translating any failure into an {@link IOException}.
     *
     * <p>This method delegates to {@link SyncFutureWaiter#listenForResult(CompletionStage)} to
     * block until the asynchronous operation represented by {@code stage} completes. If the
     * operation completes normally, the computed result is returned. If it completes exceptionally,
     * the underlying cause is unwrapped and:
     *
     * <ul>
     *   <li>re-thrown directly if it is already an {@link IOException}, or
     *   <li>wrapped in a new {@link IOException} with a descriptive message.
     * </ul>
     *
     * @param waiter the {@code SyncFutureWaiter} used to wait for and process the completion of
     *     {@code stage}; must not be {@code null}
     * @param stage the asynchronous computation whose result is to be waited for; must not be
     *     {@code null}
     * @param <T> the type of the result produced by the {@code CompletionStage}
     * @return the result produced by the completed {@code CompletionStage}
     * @throws IOException if the {@code CompletionStage} completes exceptionally, or if waiting for
     *     its completion fails for any reason other than an {@link Error}
     */
    private static <T> T waitForResult(
            SyncFutureWaiter waiter, java.util.concurrent.CompletionStage<T> stage)
            throws IOException {
        try {
            return waiter.listenForResult(stage);
        } catch (Throwable t) {
            if (t instanceof IOException) {
                throw (IOException) t;
            }
            throw new IOException("Failed to read HTTP resource", t);
        }
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
            final ResourceDetails privateKeyResourceDetails,
            char[] privateKeyPassphrase,
            final ClientConfigurator clientConfigurator) {
        if (privateKeyResourceDetails == null || privateKeyResourceDetails.getUrl() == null) {
            return null;
        }

        final int MAX_RETRIES = 3;
        Exception lastException = null;
        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try (InputStream inputStream =
                    new ByteArrayInputStream(
                            readResource(privateKeyResourceDetails, clientConfigurator))) {
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
