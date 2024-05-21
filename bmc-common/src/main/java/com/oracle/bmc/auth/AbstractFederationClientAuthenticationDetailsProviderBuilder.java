/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;

import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.util.CircuitBreakerUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
import com.oracle.bmc.waiter.WaiterConfiguration;
import org.slf4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Abstract builder base class for authentication details provider extending
 * {@link AbstractRequestingAuthenticationDetailsProvider}
 * @param <B> builder class
 * @param <P> provider class
 */
@InternalSdk
public abstract class AbstractFederationClientAuthenticationDetailsProviderBuilder<
                B extends AbstractFederationClientAuthenticationDetailsProviderBuilder<B, P>,
                P extends AbstractAuthenticationDetailsProvider>
        extends AbstractRequestingAuthenticationDetailsProvider.Builder<B> {

    /**
     * Service instance for auth.
     */
    protected static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AUTH")
                    .serviceEndpointPrefix("auth")
                    .build();

    /**
     * Default base url of metadata service.
     */
    public static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    /**
     * Fallback url of metadata service.
     */
    protected static final String FALLBACK_METADATA_SERVICE_URL = "http://169.254.169.254/opc/v1/";

    /**
     * The Authorization header value to be sent for requests to the metadata service.
     */
    public static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    private static final String REGION_PATH_LITERAL = "region";

    private static final Client CLIENT = ClientBuilder.newClient();
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    AbstractFederationClientAuthenticationDetailsProviderBuilder.class);

    /**
     * A facade that makes Slf4j, which the OCI Java SDK uses, look like Java Unified Logging
     * (JUL, hence JulFacade), which is what Jersey knows how to use.
     */
    private static class JulFacade extends java.util.logging.Logger {
        JulFacade() {
            super("Jersey", null);
        }

        @Override
        public void log(java.util.logging.Level level, String msg) {
            LOG.info(msg);
        }
    }

    private static final String OCI_JAVASDK_EXTRA_IMDS_LOGS_ENABLED_PROP_NAME =
            "oci.javasdk.extra.imds.logs.enabled";

    static {
        String v = System.getProperty(OCI_JAVASDK_EXTRA_IMDS_LOGS_ENABLED_PROP_NAME, "false");
        if (Boolean.parseBoolean(v)) {
            LOG.info(
                    "{} was set to {}, adding logging to AbstractFederationClientAuthenticationDetailsProviderBuilder.CLIENT",
                    OCI_JAVASDK_EXTRA_IMDS_LOGS_ENABLED_PROP_NAME,
                    v);
            javax.ws.rs.core.Feature feature =
                    new org.glassfish.jersey.logging.LoggingFeature(
                            new JulFacade(),
                            java.util.logging.Level.INFO,
                            org.glassfish.jersey.logging.LoggingFeature.Verbosity.PAYLOAD_TEXT,
                            8192);
            CLIENT.register(feature);
        } else {
            LOG.debug(
                    "{} was set to {}, adding logging to AbstractFederationClientAuthenticationDetailsProviderBuilder.CLIENT",
                    OCI_JAVASDK_EXTRA_IMDS_LOGS_ENABLED_PROP_NAME,
                    System.getProperty(OCI_JAVASDK_EXTRA_IMDS_LOGS_ENABLED_PROP_NAME));
        }
    }

    /**
     * Base url of metadata service.
     */
    protected volatile String metadataBaseUrl = METADATA_SERVICE_BASE_URL;

    /**
     * The federation endpoint url.
     */
    protected String federationEndpoint;

    /**
     * Flag to ensure fallback logic executed only once.
     */
    private volatile boolean wasFallbackCheckExecuted = false;

    /**
     * The leaf certificate, or null if detecting from instance metadata.
     */
    protected X509CertificateSupplier leafCertificateSupplier;

    /**
     * Tenancy OCI, or null if detecting from instance metadata.
     */
    protected String tenancyId;

    /**
     * The configuration for the circuit breaker.
     */
    private CircuitBreakerConfiguration circuitBreakerConfiguration;

    private String purpose = null;

    /**
     * Detected region.
     */
    protected Region region = null;

    /**
     * Configure the metadata endpoint to use when retrieving the instance data and principal for federation.
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
     * @param federationEndpoint the federation endpoint
     * @return this builder
     */
    public B federationEndpoint(String federationEndpoint) {
        this.federationEndpoint = federationEndpoint;
        return (B) this;
    }

    /**
     * Configures the custom leafCertificateSupplier to use.
     * @param leafCertificateSupplier
     * @return this builder
     */
    public B leafCertificateSupplier(X509CertificateSupplier leafCertificateSupplier) {
        this.leafCertificateSupplier = leafCertificateSupplier;
        return (B) this;
    }

    /**
     * Configures the tenancy id to use.
     * @param tenancyId the tenancy OCID
     * @return this builder
     */
    public B tenancyId(String tenancyId) {
        this.tenancyId = tenancyId;
        return (B) this;
    }

    /**
     * Configure the purpose to be used.
     * @param purpose the purpose string
     * @return this builder
     */
    protected B purpose(String purpose) {
        this.purpose = purpose;
        return (B) this;
    }

    /**
     * Configures the Circuit Breaker to use, if any.
     * @param circuitBreakerConfiguration the circuit breaker to use
     * @return this builder
     */
    public B circuitBreakerConfigurator(CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this.circuitBreakerConfiguration = circuitBreakerConfiguration;
        return (B) this;
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
     * @param sessionKeySupplier the session key supplier
     * @return the federation client
     */
    protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {

        CircuitBreakerConfiguration circuitBreakerConfig =
                circuitBreakerConfiguration != null
                        ? circuitBreakerConfiguration
                        : CircuitBreakerUtils.getDefaultCircuitBreakerConfiguration();

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

    /**
     * Auto-detect endpoint and certificate information using Instance metadata.
     */
    protected void autoDetectUsingMetadataUrl() {
        autoDetectEndpointUsingMetadataUrl();
        autoDetectCertificatesUsingMetadataUrl();
    }

    /**
     * Auto detects the endpoint that should be used when talking to OCI Auth, if no endpoint
     * has been configured already.
     * @return The auto-detected, or currently set, auth endpoint.
     */
    protected String autoDetectEndpointUsingMetadataUrl() {
        if (federationEndpoint == null) {

            executeInstanceFallback();
            String regionStr =
                    simpleRetry(
                            base -> {
                                String region =
                                        base.path(REGION_PATH_LITERAL)
                                                .request(MediaType.TEXT_PLAIN)
                                                .header(
                                                        HttpHeaders.AUTHORIZATION,
                                                        AUTHORIZATION_HEADER_VALUE)
                                                .get(String.class);
                                return region;
                            },
                            getMetadataBaseUrl(),
                            REGION_PATH_LITERAL);
            LOG.info("Looking up region for {}", regionStr);

            try {
                // TODO: we should start using 'canonicalRegionName' instead of 'region' and call
                // Region.fromRegionId, and fall back to 'region' only for backwards compat.
                region = Region.fromRegionCodeOrId(regionStr);
                LOG.info("Using region {}", region.getRegionId());
            } catch (IllegalArgumentException e) {
                LOG.warn(
                        "Region not supported by this version of the SDK, registering region '{}' under OC1",
                        regionStr,
                        e);
                // Proceed by assuming the region id belongs to the OC1 realm.
                region = Region.register(regionStr, Realm.OC1);
            }

            Optional<String> endpoint = GuavaUtils.adaptFromGuava(region.getEndpoint(SERVICE));

            if (!endpoint.isPresent()) {
                throw new IllegalArgumentException(
                        "Endpoint for " + SERVICE + " is not known in region " + region);
            } else {
                federationEndpoint = endpoint.get();
            }
        }
        return federationEndpoint;
    }

    /**
     * Auto detects and configures the certificates needed using Instance metadata.
     *
     */
    protected void autoDetectCertificatesUsingMetadataUrl() {
        try {

            if (!wasFallbackCheckExecuted) {
                LOG.info(
                        " Executing fallback check for certificates as federation endpoint was already set to {}",
                        getFederationEndpoint());
                executeInstanceFallback();
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

    /**
     * Checks and falls back to V1 endpoint for both federation endpoint detection & certificates if necessary.
     */
    private void executeInstanceFallback() {
        try {
            Response response =
                    simpleRetry(
                            base -> {
                                Response fallbackResponse =
                                        base.path(REGION_PATH_LITERAL)
                                                .request(MediaType.TEXT_PLAIN)
                                                .header(
                                                        HttpHeaders.AUTHORIZATION,
                                                        AUTHORIZATION_HEADER_VALUE)
                                                .get();
                                return fallbackResponse;
                            },
                            getMetadataBaseUrl(),
                            REGION_PATH_LITERAL);
            LOG.info(
                    "Rest call to verify if v2 endpoint exists, response from v2 was {}",
                    response.getStatus());

            //fallback to v1 if v2 endpoint throws resource not found else raise exception
            if (response.getStatus() == 404) {
                LOG.warn("Falling back to v1, response from v2 was {}", response.getStatus());
                this.metadataBaseUrl = FALLBACK_METADATA_SERVICE_URL;
            } else if (!Response.Status.Family.SUCCESSFUL.equals(
                    response.getStatusInfo().getFamily())) {
                throw new RuntimeException(
                        "Rest call to v2 endpoint failed : HTTP error code : "
                                + response.getStatus());
            }
            wasFallbackCheckExecuted = true;
            LOG.info(
                    " Metadata base url on executing instance fallback is {}",
                    getMetadataBaseUrl());
        } catch (RuntimeException e) {
            LOG.warn("Rest call to v2 endpoint failed & cannot fallback as it's not 404 ", e);
        }
    }

    private static final Map<String, String> AUTHORIZATION_HEADER;

    static {
        Map<String, String> temp = new HashMap<>();
        temp.put(HttpHeaders.AUTHORIZATION, AUTHORIZATION_HEADER_VALUE);
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
     * @param sessionKeySupplierToUse the session key supplier to use
     * @return authentication details provider
     */
    protected abstract P buildProvider(SessionKeySupplier sessionKeySupplierToUse);

    public String getMetadataBaseUrl() {
        return this.metadataBaseUrl;
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
     * <p>
     * The thread safety of this class is ensured through the Caching class above
     * which synchronizes on all methods.
     */
    static class SessionKeySupplierImpl implements SessionKeySupplier {
        private final static KeyPairGenerator GENERATOR;
        private KeyPair keyPair = null;

        static {
            try {
                GENERATOR = KeyPairGenerator.getInstance("RSA");
                GENERATOR.initialize(2048);
            } catch (NoSuchAlgorithmException e) {
                throw new Error(e.getMessage(), e);
            }
        }

        SessionKeySupplierImpl() {
            this.keyPair = GENERATOR.generateKeyPair();
        }

        @Override
        public KeyPair getKeyPair() {
            return keyPair;
        }

        /**
         * Gets the public key
         * @return the public key, not null
         * @deprecated use getKeyPair() instead
         */
        @Override
        @Deprecated
        public RSAPublicKey getPublicKey() {
            return (RSAPublicKey) keyPair.getPublic();
        }

        /**
         * Gets the private key
         * @return the private key, not null
         * @deprecated use getKeyPair() instead
         */
        @Override
        @Deprecated
        public RSAPrivateKey getPrivateKey() {
            return (RSAPrivateKey) keyPair.getPrivate();
        }

        @Override
        public void refreshKeys() {
            this.keyPair = GENERATOR.generateKeyPair();
        }
    }

    /**
     * @deprecated use the function without Guava parameters instead
     * Retry logic to get endpoint from instance metadata service
     *
     * @param retryOperation
     * @param metadataServiceUrl
     * @param endpoint
     * @return The function result
     */
    @Deprecated
    public static <T> T simpleRetry(
            com.google.common /*Guava will be removed soon*/.base.Function<WebTarget, T>
                    retryOperation,
            final String metadataServiceUrl,
            final String endpoint) {
        return simpleRetry(GuavaUtils.adaptFromGuava(retryOperation), metadataServiceUrl, endpoint);
    }

    /**
     * Retry logic to get endpoint from instance metadata service
     *
     * @param retryOperation
     * @param metadataServiceUrl
     * @param endpoint
     * @return The function result
     */
    public static <T> T simpleRetry(
            Function<WebTarget, T> retryOperation,
            final String metadataServiceUrl,
            final String endpoint) {

        ExponentialBackoffDelayStrategyWithJitter strategy =
                new ExponentialBackoffDelayStrategyWithJitter(TimeUnit.SECONDS.toMillis(100));
        WaiterConfiguration.WaitContext context =
                new WaiterConfiguration.WaitContext(System.currentTimeMillis());

        final int MAX_RETRIES = 8;
        RuntimeException lastException = null;
        for (int retry = 0; retry < MAX_RETRIES; retry++) {
            try {
                WebTarget base = CLIENT.target(metadataServiceUrl + "instance/");
                return retryOperation.apply(base);
            } catch (RuntimeException e) {
                LOG.warn(
                        "Attempt {} - Rest call to get "
                                + endpoint
                                + " from metadata service failed ",
                        (retry + 1),
                        e);
                lastException = e;
                try {
                    long waitTime = strategy.nextDelay(context);
                    Thread.sleep(waitTime);
                    context.incrementAttempts();
                    LOG.info("Exiting retry {} with wait time: {} millis", (retry + 1), waitTime);
                } catch (InterruptedException interruptedException) {
                    LOG.debug(
                            "Thread interrupted while waiting to make next call to get "
                                    + endpoint
                                    + " from instance metadata service",
                            interruptedException);
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        CLIENT.close();
        throw lastException;
    }
}
