/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.internal.SyncFutureWaiter;
import com.oracle.bmc.util.CircuitBreakerUtils;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
import com.oracle.bmc.waiter.WaiterConfiguration;
import org.slf4j.Logger;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static com.oracle.bmc.http.internal.HeaderUtils.AUTHORIZATION_HEADER_NAME;

/**
 * Abstract builder base class for authentication details provider extending {@link
 * AbstractRequestingAuthenticationDetailsProvider}
 *
 * @param <B> builder class
 * @param <P> provider class
 */
@InternalSdk
public abstract class AbstractFederationClientAuthenticationDetailsProviderBuilder<
                B extends AbstractFederationClientAuthenticationDetailsProviderBuilder<B, P>,
                P extends AbstractAuthenticationDetailsProvider>
        extends AbstractRequestingAuthenticationDetailsProvider.Builder<B> {

    /** Service instance for auth. */
    protected static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AUTH")
                    .serviceEndpointPrefix("auth")
                    .build();

    /** Default base url of metadata service. */
    public static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    /** Environment variable used to overwrite the default metadata base url. */
    public static final String METADATA_BASE_URL_ENV_VAR = "OCI_METADATA_BASE_URL";

    /** Metadata URL from environment variable, to use if present. */
    public static final String METADATA_URL_OVERRIDE = System.getenv(METADATA_BASE_URL_ENV_VAR);

    /** Environment variable used to disable circuit breaker. */
    public static final String ENABLE_DEFAULT_CIRCUIT_BREAKER_CONFIG =
            "OCI_SDK_DEFAULT_AUTH_CIRCUITBREAKER_ENABLED";

    /** The Authorization header value to be sent for requests to the metadata service. */
    public static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    private static final String REGION_PATH_LITERAL = "region";

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    AbstractFederationClientAuthenticationDetailsProviderBuilder.class);

    /** Base url of metadata service. */
    protected volatile String metadataBaseUrl = METADATA_SERVICE_BASE_URL;

    /** The federation endpoint url. */
    protected String federationEndpoint;

    /** The number of retries for auto-detecting endpoint. */
    protected int detectEndpointRetries = 8;

    /** The custom timeout for each retry for auto-detecting endpoint. */
    protected int timeoutForEachRetry = 0;

    /** Flag to ensure V2 endpoint is only checked once, if successful. */
    private volatile boolean wasImdsV2CheckExecuted = false;

    /** The leaf certificate, or null if detecting from instance metadata. */
    protected X509CertificateSupplier leafCertificateSupplier;

    /** Tenancy OCI, or null if detecting from instance metadata. */
    protected String tenancyId;

    /** The configuration for the circuit breaker. */
    protected CircuitBreakerConfiguration circuitBreakerConfiguration;

    private String purpose = null;

    /** Detected region. */
    protected Region region = null;

    /**
     * Configure the metadata endpoint to use when retrieving the instance data and principal for
     * federation.
     *
     * @param metadataBaseUrl the metadata base url
     * @return this builder
     */
    public B metadataBaseUrl(String metadataBaseUrl) {
        this.metadataBaseUrl = metadataBaseUrl;
        if (!this.metadataBaseUrl.endsWith("/")) {
            this.metadataBaseUrl += "/";
        }
        return (B) this;
    }

    /**
     * Configures the custom federationEndpoint to use.
     *
     * @param federationEndpoint the federation endpoint
     * @return this builder
     */
    public B federationEndpoint(String federationEndpoint) {
        this.federationEndpoint = federationEndpoint;
        return (B) this;
    }

    /**
     * Configures the custom retries to use for detecting endpoint.
     *
     * @param detectEndpointRetries the number of retries
     * @return this builder
     */
    public B detectEndpointRetries(int detectEndpointRetries) {
        this.detectEndpointRetries = detectEndpointRetries;
        return (B) this;
    }

    /**
     * Configures the custom timeout for each retry to use for detecting endpoint.
     *
     * @param timeoutForEachRetry the custom timeout
     * @return this builder
     */
    public B timeoutForEachRetry(int timeoutForEachRetry) {
        this.timeoutForEachRetry = timeoutForEachRetry;
        return (B) this;
    }

    /**
     * Configures the custom leafCertificateSupplier to use.
     *
     * @param leafCertificateSupplier
     * @return this builder
     */
    public B leafCertificateSupplier(X509CertificateSupplier leafCertificateSupplier) {
        this.leafCertificateSupplier = leafCertificateSupplier;
        return (B) this;
    }

    /**
     * Configures the tenancy id to use.
     *
     * @param tenancyId the tenancy OCID
     * @return this builder
     */
    public B tenancyId(String tenancyId) {
        this.tenancyId = tenancyId;
        return (B) this;
    }

    /**
     * Configure the purpose to be used.
     *
     * @param purpose the purpose string
     * @return this builder
     */
    protected B purpose(String purpose) {
        this.purpose = purpose;
        return (B) this;
    }

    /**
     * Configures the Circuit Breaker to use, if any.
     *
     * @param circuitBreakerConfiguration the circuit breaker to use
     * @return this builder
     */
    public B circuitBreakerConfigurator(CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        return (B) this;
    }

    /** Fetch the value from environment variable for disabling circuit breaker. */
    protected boolean getDefaultCircuitBreakerOverride() {
        String envValue = System.getenv(ENABLE_DEFAULT_CIRCUIT_BREAKER_CONFIG);
        return StringUtils.isEmpty(envValue) || Boolean.valueOf(envValue).equals(Boolean.TRUE);
    }

    /**
     * Build a new AuthenticationDetailsProvider that uses the FederationClient.
     *
     * @return A new provider instance.
     */
    public P build() {
        SessionKeySupplier sessionKeySupplierToUse =
                sessionKeySupplier != null ? sessionKeySupplier : new SessionKeySupplierImpl();

        this.federationClient = createFederationClient(sessionKeySupplierToUse);

        return buildProvider(sessionKeySupplierToUse);
    }

    /**
     * Create the federation client.
     *
     * @param sessionKeySupplier the session key supplier
     * @return the federation client
     */
    protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {
        CircuitBreakerConfiguration circuitBreakerConfig;
        if (getDefaultCircuitBreakerOverride()) {
            circuitBreakerConfig =
                    circuitBreakerConfiguration != null
                            ? circuitBreakerConfiguration
                            : CircuitBreakerUtils.getDefaultAuthClientCircuitBreakerConfiguration();
        } else {
            circuitBreakerConfig =
                    circuitBreakerConfiguration != null
                            ? circuitBreakerConfiguration
                            : CircuitBreakerUtils.getNoCircuitBreakerConfiguration();
        }

        if (purpose != null) {
            return new X509FederationClient(
                    federationEndpoint,
                    tenancyId,
                    leafCertificateSupplier,
                    sessionKeySupplier,
                    intermediateCertificateSuppliers,
                    federationClientConfigurator,
                    additionalFederationClientConfigurators,
                    circuitBreakerConfig,
                    purpose);
        } else {
            return new X509FederationClient(
                    federationEndpoint,
                    tenancyId,
                    leafCertificateSupplier,
                    sessionKeySupplier,
                    intermediateCertificateSuppliers,
                    federationClientConfigurator,
                    additionalFederationClientConfigurators,
                    circuitBreakerConfig);
        }
    }

    /** Auto-detect endpoint and certificate information using Instance metadata. */
    protected void autoDetectUsingMetadataUrl() {
        autoDetectEndpointUsingMetadataUrl();
        autoDetectCertificatesUsingMetadataUrl();
    }

    /**
     * Auto detects the endpoint that should be used when talking to OCI Auth, if no endpoint has
     * been configured already.
     *
     * @return The auto-detected, or currently set, auth endpoint.
     */
    protected String autoDetectEndpointUsingMetadataUrl() {
        if (federationEndpoint == null) {

            executeImdsV2EndpointCheck();
            String regionStr = fetchRegion(resp -> resp.textBody());
            LOG.info("Looking up region for {}", regionStr);

            try {
                // TODO: we should start using 'canonicalRegionName' instead of 'region' and call
                // Region.fromRegionId, and fall back to 'region' only for backwards compat.
                region = Region.fromRegionCodeOrId(regionStr);
                LOG.info("Using region {}", region.getRegionId());
            } catch (IllegalArgumentException e) {
                Alloy.throwUnknownAlloyRegionIfAppropriate(regionStr, e);
                LOG.warn(
                        "Region not supported by this version of the SDK, registering region '{}' under OC1",
                        regionStr,
                        e);
                // Proceed by assuming the region id belongs to the OC1 realm.
                region = Region.register(regionStr, Realm.OC1);
            }

            Optional<String> endpoint = region.getEndpoint(SERVICE);

            if (!endpoint.isPresent()) {
                throw new IllegalArgumentException(
                        "Endpoint for " + SERVICE + " is not known in region " + region);
            } else {
                federationEndpoint = endpoint.get();
            }
        }
        return federationEndpoint;
    }

    /** Auto detects and configures the certificates needed using Instance metadata. */
    protected void autoDetectCertificatesUsingMetadataUrl() {
        try {

            if (!wasImdsV2CheckExecuted) {
                LOG.info(
                        "Executing V2 endpoint check for certificates as federation endpoint was already set to {}",
                        getFederationEndpoint());
                executeImdsV2EndpointCheck();
            }

            if (leafCertificateSupplier == null) {
                leafCertificateSupplier =
                        new URLBasedX509CertificateSupplier(
                                getMetadataResourceDetails("identity/cert.pem"),
                                getMetadataResourceDetails("identity/key.pem"),
                                (char[]) null);
            }

            if (tenancyId == null) {
                tenancyId =
                        AuthUtils.getTenantIdFromCertificate(
                                leafCertificateSupplier
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
            }

            if (intermediateCertificateSuppliers == null) {
                intermediateCertificateSuppliers = new HashSet<>();

                intermediateCertificateSuppliers.add(
                        new URLBasedX509CertificateSupplier(
                                getMetadataResourceDetails("identity/intermediate.pem"),
                                null,
                                (char[]) null));
            }
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The metadata service url is invalid.", ex);
        }
    }

    private <R> R fetchRegion(Function<HttpResponse, CompletionStage<R>> responseHandler) {
        Throwable lastException = null;
        try (HttpClient client =
                HttpProvider.getDefault()
                        .newBuilder()
                        .property(StandardClientProperties.ASYNC_POOL_SIZE, 1)
                        .property(
                                StandardClientProperties.CONNECT_TIMEOUT,
                                Duration.ofMillis(timeoutForEachRetry))
                        .baseUri(URI.create(getMetadataBaseUrl() + "instance/"))
                        .build()) {

            ExponentialBackoffDelayStrategyWithJitter strategy =
                    new ExponentialBackoffDelayStrategyWithJitter(TimeUnit.SECONDS.toMillis(30));
            WaiterConfiguration.WaitContext context =
                    new WaiterConfiguration.WaitContext(System.currentTimeMillis());

            if (detectEndpointRetries < 0) {
                lastException =
                        new RuntimeException(
                                "detectEndpointRetries is "
                                        + detectEndpointRetries
                                        + ". Retries cannot be negative.");
            }
            for (int retry = 0; retry <= detectEndpointRetries; retry++) {
                try {
                    SyncFutureWaiter waiter = new SyncFutureWaiter();
                    try (HttpResponse response =
                            waiter.listenForResult(
                                    client.createRequest(Method.GET)
                                            .offloadExecutor(waiter)
                                            .appendPathPart(REGION_PATH_LITERAL)
                                            .header("Accept", "text/plain")
                                            .header(
                                                    AUTHORIZATION_HEADER_NAME,
                                                    AUTHORIZATION_HEADER_VALUE)
                                            .execute())) {
                        return waiter.listenForResult(responseHandler.apply(response));
                    }
                } catch (Throwable e) {
                    LOG.warn(
                            "Attempt {} - Rest call to get region from metadata service failed ",
                            (retry + 1),
                            e);
                    lastException = e;
                    try {
                        long waitTime = strategy.nextDelay(context);
                        Thread.sleep(waitTime);
                        context.incrementAttempts();
                        LOG.info(
                                "Exiting retry {} with wait time: {} millis",
                                (retry + 1),
                                waitTime);
                    } catch (InterruptedException interruptedException) {
                        LOG.debug(
                                "Thread interrupted while waiting to make next call to get region from instance metadata service",
                                interruptedException);
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        }

        if (lastException instanceof RuntimeException) {
            throw (RuntimeException) lastException;
        } else if (lastException != null) {
            throw new RuntimeException(lastException);
        } else {
            throw new RuntimeException("Failed to fetch region, lastException was null");
        }
    }

    /**
     * Checks the V2 endpoint for both federation endpoint detection & certificates if necessary.
     */
    private void executeImdsV2EndpointCheck() {
        try {
            // don't care about the body, just get me the status!
            int status = fetchRegion(resp -> CompletableFuture.completedFuture(resp.status()));
            LOG.info(
                    "REST request to verify if IMDS v2 endpoint exists, response from v2 was {}",
                    status);

            // fallback to v1 if v2 endpoint throws resource not found else raise exception
            if (status >= 300) {
                throw new RuntimeException(
                        "REST request to IMDS v2 endpoint failed : HTTP error code : " + status);
            }
            wasImdsV2CheckExecuted = true;
            LOG.info("Metadata base url {}", getMetadataBaseUrl());
        } catch (RuntimeException e) {
            LOG.warn(
                    "REST request to IMDS v2 endpoint failed with unexpected Runtime exception ",
                    e);
        }
    }

    private static final Map<String, String> AUTHORIZATION_HEADER;

    static {
        Map<String, String> temp = new HashMap<>();
        temp.put("Authorization", AUTHORIZATION_HEADER_VALUE);
        AUTHORIZATION_HEADER = Collections.unmodifiableMap(temp);
    }

    private URLBasedX509CertificateSupplier.ResourceDetails getMetadataResourceDetails(
            final String path) throws MalformedURLException {
        return URLBasedX509CertificateSupplier.ResourceDetails.builder()
                .url(new URL(getMetadataBaseUrl() + path))
                .headers(AUTHORIZATION_HEADER)
                .build();
    }

    /**
     * Build the actual provider.
     *
     * @param sessionKeySupplierToUse the session key supplier to use
     * @return authentication details provider
     */
    protected abstract P buildProvider(SessionKeySupplier sessionKeySupplierToUse);

    public String getMetadataBaseUrl() {
        if (!StringUtils.isBlank(METADATA_URL_OVERRIDE)) {
            LOG.info(
                    "Environment Variable OCI_METADATA_BASE_URL is present. Overriding default base url to: {}",
                    METADATA_URL_OVERRIDE);
            return METADATA_URL_OVERRIDE;
        } else {
            LOG.info(
                    "Environment Variable OCI_METADATA_BASE_URL is not present. Using url: {}",
                    this.metadataBaseUrl);
            return this.metadataBaseUrl;
        }
    }

    public String getFederationEndpoint() {
        return this.federationEndpoint;
    }

    public X509CertificateSupplier getLeafCertificateSupplier() {
        return this.leafCertificateSupplier;
    }

    public String getTenancyId() {
        return this.tenancyId;
    }

    public Region getRegion() {
        return this.region;
    }

    /**
     * This is a helper class to generate in-memory temporary session keys.
     *
     * <p>The thread safety of this class is ensured through the Caching class above which
     * synchronizes on all methods.
     *
     * <p>The class is implemented in a lazy way to avoid generating the key if it is not needed or
     * if refresh is immediately called.
     */
    static class SessionKeySupplierImpl implements SessionKeySupplier {
        private static final KeyPairGenerator GENERATOR;
        private KeyPair keyPair = null;

        static {
            try {
                GENERATOR = KeyPairGenerator.getInstance("RSA");
                GENERATOR.initialize(2048);
            } catch (NoSuchAlgorithmException e) {
                throw new Error(e.getMessage(), e);
            }
        }

        SessionKeySupplierImpl() {}

        @Override
        public KeyPair getKeyPair() {
            if (this.keyPair == null) {
                this.keyPair = GENERATOR.generateKeyPair();
            }
            return keyPair;
        }

        @Override
        public void refreshKeys() {
            this.keyPair = GENERATOR.generateKeyPair();
        }
    }
}
