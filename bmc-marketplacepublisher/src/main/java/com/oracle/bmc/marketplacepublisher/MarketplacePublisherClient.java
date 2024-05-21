/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.internal.http.*;
import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class MarketplacePublisherClient implements MarketplacePublisher {
    /**
     * Service instance for MarketplacePublisher.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MARKETPLACEPUBLISHER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://marketplace-publisher.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplacePublisherClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final MarketplacePublisherWaiters waiters;

    private final MarketplacePublisherPaginators paginators;
    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;
    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;
    private final com.oracle.bmc.http.internal.RestClientFactory restClientFactory;
    private final com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory;
    private final java.util.Map<
                    com.oracle.bmc.http.signing.SigningStrategy,
                    com.oracle.bmc.http.signing.RequestSignerFactory>
            signingStrategyRequestSignerFactories;
    private final boolean isNonBufferingApacheClient;
    private final com.oracle.bmc.ClientConfiguration clientConfigurationToUse;
    private final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration
            circuitBreakerConfiguration;
    private String regionId;

    /**
     * Used to synchronize any updates on the `this.client` object.
     */
    private final Object clientUpdate = new Object();

    /**
     * Stores the actual client object used to make the API calls.
     * Note: This object can get refreshed periodically, hence it's important to keep any updates synchronized.
     *       For any writes to the object, please synchronize on `this.clientUpdate`.
     */
    private volatile com.oracle.bmc.http.internal.RestClient client;

    /**
     * Keeps track of the last endpoint that was assigned to the client, which in turn can be used when the client is refreshed.
     * Note: Always synchronize on `this.clientUpdate` when reading/writing this field.
     */
    private volatile String overrideEndpoint = null;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     */
    public MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                executorService,
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * Use the {@link Builder} to get access to all these parameters.
     *
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    protected MarketplacePublisherClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService,
            com.oracle.bmc.http.internal.RestClientFactoryBuilder restClientFactoryBuilder) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators =
                new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((com.oracle.bmc.auth.ProvidesClientConfigurators)
                                    this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators =
                new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        this.restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        this.isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        this.restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());

        this.clientConfigurationToUse =
                (configuration != null)
                        ? configuration
                        : com.oracle.bmc.ClientConfiguration.builder().build();
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
        final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration
                userCircuitBreakerConfiguration =
                        CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(
                                configuration);
        if (userCircuitBreakerConfiguration == null) {
            this.circuitBreakerConfiguration =
                    CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        } else {
            this.circuitBreakerConfiguration = userCircuitBreakerConfiguration;
        }

        this.refreshClient();

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("MarketplacePublisher-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MarketplacePublisherWaiters(executorService, this);

        this.paginators = new MarketplacePublisherPaginators(this);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.regionId = provider.getRegion().getRegionId();
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, MarketplacePublisherClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MarketplacePublisherClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new MarketplacePublisherClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    executorService,
                    restClientFactoryBuilder);
        }
    }

    @Override
    public void refreshClient() {
        LOG.info("Refreshing client '{}'.", this.client != null ? this.client.getClass() : null);
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                this.defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);

        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        this.signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, this.authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient =
                this.restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        this.clientConfigurationToUse,
                        this.isNonBufferingApacheClient,
                        null,
                        this.circuitBreakerConfiguration);

        synchronized (clientUpdate) {
            if (this.overrideEndpoint != null) {
                refreshedClient.setEndpoint(this.overrideEndpoint);
            }

            this.client = refreshedClient;
        }

        LOG.info("Refreshed client '{}'.", this.client != null ? this.client.getClass() : null);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);

        synchronized (clientUpdate) {
            this.overrideEndpoint = endpoint;
            client.setEndpoint(endpoint);
        }
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        this.regionId = region.getRegionId();
        java.util.Optional<String> endpoint =
                com.oracle.bmc.internal.GuavaUtils.adaptFromGuava(region.getEndpoint(SERVICE));
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        this.regionId = regionId;
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     * enable or disable the use of realm-specific endpoint template respectively
     */
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        setEndpoint(
                com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils
                        .getRealmSpecificEndpointTemplate(
                                useOfRealmSpecificEndpointTemplateEnabled, this.regionId, SERVICE));
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public ActivateTermVersionResponse activateTermVersion(ActivateTermVersionRequest request) {
        LOG.trace("Called activateTermVersion");
        final ActivateTermVersionRequest interceptedRequest =
                ActivateTermVersionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateTermVersionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ActivateTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/ActivateTermVersion");
        java.util.function.Function<javax.ws.rs.core.Response, ActivateTermVersionResponse>
                transformer =
                        ActivateTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {
        LOG.trace("Called cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/CancelWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer =
                        CancelWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CascadingDeleteListingResponse cascadingDeleteListing(
            CascadingDeleteListingRequest request) {
        LOG.trace("Called cascadingDeleteListing");
        final CascadingDeleteListingRequest interceptedRequest =
                CascadingDeleteListingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadingDeleteListingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/CascadingDeleteListing");
        java.util.function.Function<javax.ws.rs.core.Response, CascadingDeleteListingResponse>
                transformer =
                        CascadingDeleteListingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CascadingDeleteListingRevisionResponse cascadingDeleteListingRevision(
            CascadingDeleteListingRevisionRequest request) {
        LOG.trace("Called cascadingDeleteListingRevision");
        final CascadingDeleteListingRevisionRequest interceptedRequest =
                CascadingDeleteListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadingDeleteListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CascadingDeleteListingRevision");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CascadingDeleteListingRevisionResponse>
                transformer =
                        CascadingDeleteListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeArtifactCompartmentResponse changeArtifactCompartment(
            ChangeArtifactCompartmentRequest request) {
        LOG.trace("Called changeArtifactCompartment");
        final ChangeArtifactCompartmentRequest interceptedRequest =
                ChangeArtifactCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeArtifactCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeArtifactCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/ChangeArtifactCompartment");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeArtifactCompartmentResponse>
                transformer =
                        ChangeArtifactCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeArtifactCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeListingCompartmentResponse changeListingCompartment(
            ChangeListingCompartmentRequest request) {
        LOG.trace("Called changeListingCompartment");
        final ChangeListingCompartmentRequest interceptedRequest =
                ChangeListingCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeListingCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeListingCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/ChangeListingCompartment");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeListingCompartmentResponse>
                transformer =
                        ChangeListingCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getChangeListingCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeListingRevisionToNewStatusResponse changeListingRevisionToNewStatus(
            ChangeListingRevisionToNewStatusRequest request) {
        LOG.trace("Called changeListingRevisionToNewStatus");
        final ChangeListingRevisionToNewStatusRequest interceptedRequest =
                ChangeListingRevisionToNewStatusConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeListingRevisionToNewStatusConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeListingRevisionToNewStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/ChangeListingRevisionToNewStatus");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeListingRevisionToNewStatusResponse>
                transformer =
                        ChangeListingRevisionToNewStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeTermCompartmentResponse changeTermCompartment(
            ChangeTermCompartmentRequest request) {
        LOG.trace("Called changeTermCompartment");
        final ChangeTermCompartmentRequest interceptedRequest =
                ChangeTermCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTermCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeTermCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/ChangeTermCompartment");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeTermCompartmentResponse>
                transformer =
                        ChangeTermCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getChangeTermCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CloneListingRevisionResponse cloneListingRevision(CloneListingRevisionRequest request) {
        LOG.trace("Called cloneListingRevision");
        final CloneListingRevisionRequest interceptedRequest =
                CloneListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CloneListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CloneListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CloneListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, CloneListingRevisionResponse>
                transformer =
                        CloneListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateArtifactResponse createArtifact(CreateArtifactRequest request) {
        LOG.trace("Called createArtifact");
        final CreateArtifactRequest interceptedRequest =
                CreateArtifactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateArtifactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/CreateArtifact");
        java.util.function.Function<javax.ws.rs.core.Response, CreateArtifactResponse> transformer =
                CreateArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateArtifactDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListingResponse createListing(CreateListingRequest request) {
        LOG.trace("Called createListing");
        final CreateListingRequest interceptedRequest =
                CreateListingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/CreateListing");
        java.util.function.Function<javax.ws.rs.core.Response, CreateListingResponse> transformer =
                CreateListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateListingDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListingRevisionResponse createListingRevision(
            CreateListingRevisionRequest request) {
        LOG.trace("Called createListingRevision");
        final CreateListingRevisionRequest interceptedRequest =
                CreateListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CreateListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, CreateListingRevisionResponse>
                transformer =
                        CreateListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateListingRevisionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListingRevisionAttachmentResponse createListingRevisionAttachment(
            CreateListingRevisionAttachmentRequest request) {
        LOG.trace("Called createListingRevisionAttachment");
        final CreateListingRevisionAttachmentRequest interceptedRequest =
                CreateListingRevisionAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/CreateListingRevisionAttachment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateListingRevisionAttachmentResponse>
                transformer =
                        CreateListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateListingRevisionAttachmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListingRevisionNoteResponse createListingRevisionNote(
            CreateListingRevisionNoteRequest request) {
        LOG.trace("Called createListingRevisionNote");
        final CreateListingRevisionNoteRequest interceptedRequest =
                CreateListingRevisionNoteConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionNoteConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/CreateListingRevisionNote");
        java.util.function.Function<javax.ws.rs.core.Response, CreateListingRevisionNoteResponse>
                transformer =
                        CreateListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateListingRevisionNoteDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListingRevisionPackageResponse createListingRevisionPackage(
            CreateListingRevisionPackageRequest request) {
        LOG.trace("Called createListingRevisionPackage");
        final CreateListingRevisionPackageRequest interceptedRequest =
                CreateListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/CreateListingRevisionPackage");
        java.util.function.Function<javax.ws.rs.core.Response, CreateListingRevisionPackageResponse>
                transformer =
                        CreateListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateListingRevisionPackageDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTermResponse createTerm(CreateTermRequest request) {
        LOG.trace("Called createTerm");
        final CreateTermRequest interceptedRequest = CreateTermConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTermConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/CreateTerm");
        java.util.function.Function<javax.ws.rs.core.Response, CreateTermResponse> transformer =
                CreateTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateTermDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTermVersionResponse createTermVersion(CreateTermVersionRequest request) {
        LOG.trace("Called createTermVersion");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, CreateTermVersionRequest.builder());
            }
            final CreateTermVersionRequest interceptedRequest =
                    CreateTermVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    CreateTermVersionConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "MarketplacePublisher",
                            "CreateTermVersion",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/CreateTermVersion");
            java.util.function.Function<javax.ws.rs.core.Response, CreateTermVersionResponse>
                    transformer =
                            CreateTermVersionConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                        authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> {
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.post(
                                                        ib,
                                                        retriedRequest
                                                                .getCreateTermVersionContent(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getCreateTermVersionContent(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getCreateTermVersionContent());
        }
    }

    @Override
    public DeleteArtifactResponse deleteArtifact(DeleteArtifactRequest request) {
        LOG.trace("Called deleteArtifact");
        final DeleteArtifactRequest interceptedRequest =
                DeleteArtifactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteArtifactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/DeleteArtifact");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteArtifactResponse> transformer =
                DeleteArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteListingResponse deleteListing(DeleteListingRequest request) {
        LOG.trace("Called deleteListing");
        final DeleteListingRequest interceptedRequest =
                DeleteListingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/DeleteListing");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteListingResponse> transformer =
                DeleteListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteListingRevisionResponse deleteListingRevision(
            DeleteListingRevisionRequest request) {
        LOG.trace("Called deleteListingRevision");
        final DeleteListingRevisionRequest interceptedRequest =
                DeleteListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/DeleteListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteListingRevisionResponse>
                transformer =
                        DeleteListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteListingRevisionAttachmentResponse deleteListingRevisionAttachment(
            DeleteListingRevisionAttachmentRequest request) {
        LOG.trace("Called deleteListingRevisionAttachment");
        final DeleteListingRevisionAttachmentRequest interceptedRequest =
                DeleteListingRevisionAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/DeleteListingRevisionAttachment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteListingRevisionAttachmentResponse>
                transformer =
                        DeleteListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteListingRevisionNoteResponse deleteListingRevisionNote(
            DeleteListingRevisionNoteRequest request) {
        LOG.trace("Called deleteListingRevisionNote");
        final DeleteListingRevisionNoteRequest interceptedRequest =
                DeleteListingRevisionNoteConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionNoteConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/DeleteListingRevisionNote");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteListingRevisionNoteResponse>
                transformer =
                        DeleteListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteListingRevisionPackageResponse deleteListingRevisionPackage(
            DeleteListingRevisionPackageRequest request) {
        LOG.trace("Called deleteListingRevisionPackage");
        final DeleteListingRevisionPackageRequest interceptedRequest =
                DeleteListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/DeleteListingRevisionPackage");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteListingRevisionPackageResponse>
                transformer =
                        DeleteListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteTermResponse deleteTerm(DeleteTermRequest request) {
        LOG.trace("Called deleteTerm");
        final DeleteTermRequest interceptedRequest = DeleteTermConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTermConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/DeleteTerm");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteTermResponse> transformer =
                DeleteTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteTermVersionResponse deleteTermVersion(DeleteTermVersionRequest request) {
        LOG.trace("Called deleteTermVersion");
        final DeleteTermVersionRequest interceptedRequest =
                DeleteTermVersionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTermVersionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/DeleteTermVersion");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteTermVersionResponse>
                transformer =
                        DeleteTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetArtifactResponse getArtifact(GetArtifactRequest request) {
        LOG.trace("Called getArtifact");
        final GetArtifactRequest interceptedRequest =
                GetArtifactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetArtifactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/GetArtifact");
        java.util.function.Function<javax.ws.rs.core.Response, GetArtifactResponse> transformer =
                GetArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetCategoryResponse getCategory(GetCategoryRequest request) {
        LOG.trace("Called getCategory");
        final GetCategoryRequest interceptedRequest =
                GetCategoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCategoryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetCategory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Category/GetCategory");
        java.util.function.Function<javax.ws.rs.core.Response, GetCategoryResponse> transformer =
                GetCategoryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListingResponse getListing(GetListingRequest request) {
        LOG.trace("Called getListing");
        final GetListingRequest interceptedRequest = GetListingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/GetListing");
        java.util.function.Function<javax.ws.rs.core.Response, GetListingResponse> transformer =
                GetListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListingRevisionResponse getListingRevision(GetListingRevisionRequest request) {
        LOG.trace("Called getListingRevision");
        final GetListingRevisionRequest interceptedRequest =
                GetListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/GetListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionResponse>
                transformer =
                        GetListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListingRevisionAttachmentResponse getListingRevisionAttachment(
            GetListingRevisionAttachmentRequest request) {
        LOG.trace("Called getListingRevisionAttachment");
        final GetListingRevisionAttachmentRequest interceptedRequest =
                GetListingRevisionAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/GetListingRevisionAttachment");
        java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionAttachmentResponse>
                transformer =
                        GetListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListingRevisionNoteResponse getListingRevisionNote(
            GetListingRevisionNoteRequest request) {
        LOG.trace("Called getListingRevisionNote");
        final GetListingRevisionNoteRequest interceptedRequest =
                GetListingRevisionNoteConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionNoteConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/GetListingRevisionNote");
        java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionNoteResponse>
                transformer =
                        GetListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListingRevisionPackageResponse getListingRevisionPackage(
            GetListingRevisionPackageRequest request) {
        LOG.trace("Called getListingRevisionPackage");
        final GetListingRevisionPackageRequest interceptedRequest =
                GetListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/GetListingRevisionPackage");
        java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionPackageResponse>
                transformer =
                        GetListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMarketResponse getMarket(GetMarketRequest request) {
        LOG.trace("Called getMarket");
        final GetMarketRequest interceptedRequest = GetMarketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMarketConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetMarket",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Market/GetMarket");
        java.util.function.Function<javax.ws.rs.core.Response, GetMarketResponse> transformer =
                GetMarketConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetProductResponse getProduct(GetProductRequest request) {
        LOG.trace("Called getProduct");
        final GetProductRequest interceptedRequest = GetProductConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProductConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetProduct",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Product/GetProduct");
        java.util.function.Function<javax.ws.rs.core.Response, GetProductResponse> transformer =
                GetProductConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetPublisherResponse getPublisher(GetPublisherRequest request) {
        LOG.trace("Called getPublisher");
        final GetPublisherRequest interceptedRequest =
                GetPublisherConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublisherConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetPublisher",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Publisher/GetPublisher");
        java.util.function.Function<javax.ws.rs.core.Response, GetPublisherResponse> transformer =
                GetPublisherConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetTermResponse getTerm(GetTermRequest request) {
        LOG.trace("Called getTerm");
        final GetTermRequest interceptedRequest = GetTermConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTermConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/GetTerm");
        java.util.function.Function<javax.ws.rs.core.Response, GetTermResponse> transformer =
                GetTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetTermVersionResponse getTermVersion(GetTermVersionRequest request) {
        LOG.trace("Called getTermVersion");
        final GetTermVersionRequest interceptedRequest =
                GetTermVersionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTermVersionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/GetTermVersion");
        java.util.function.Function<javax.ws.rs.core.Response, GetTermVersionResponse> transformer =
                GetTermVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/GetWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, GetWorkRequestResponse> transformer =
                GetWorkRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
        LOG.trace("Called listArtifacts");
        final ListArtifactsRequest interceptedRequest =
                ListArtifactsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListArtifactsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListArtifacts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ArtifactCollection/ListArtifacts");
        java.util.function.Function<javax.ws.rs.core.Response, ListArtifactsResponse> transformer =
                ListArtifactsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) {
        LOG.trace("Called listCategories");
        final ListCategoriesRequest interceptedRequest =
                ListCategoriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCategoriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/CategoryCollection/ListCategories");
        java.util.function.Function<javax.ws.rs.core.Response, ListCategoriesResponse> transformer =
                ListCategoriesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListingRevisionAttachmentsResponse listListingRevisionAttachments(
            ListListingRevisionAttachmentsRequest request) {
        LOG.trace("Called listListingRevisionAttachments");
        final ListListingRevisionAttachmentsRequest interceptedRequest =
                ListListingRevisionAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionAttachmentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachmentCollection/ListListingRevisionAttachments");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListListingRevisionAttachmentsResponse>
                transformer =
                        ListListingRevisionAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListingRevisionNotesResponse listListingRevisionNotes(
            ListListingRevisionNotesRequest request) {
        LOG.trace("Called listListingRevisionNotes");
        final ListListingRevisionNotesRequest interceptedRequest =
                ListListingRevisionNotesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionNotesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionNotes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNoteCollection/ListListingRevisionNotes");
        java.util.function.Function<javax.ws.rs.core.Response, ListListingRevisionNotesResponse>
                transformer =
                        ListListingRevisionNotesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListingRevisionPackagesResponse listListingRevisionPackages(
            ListListingRevisionPackagesRequest request) {
        LOG.trace("Called listListingRevisionPackages");
        final ListListingRevisionPackagesRequest interceptedRequest =
                ListListingRevisionPackagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionPackagesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionPackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackageCollection/ListListingRevisionPackages");
        java.util.function.Function<javax.ws.rs.core.Response, ListListingRevisionPackagesResponse>
                transformer =
                        ListListingRevisionPackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListingRevisionsResponse listListingRevisions(ListListingRevisionsRequest request) {
        LOG.trace("Called listListingRevisions");
        final ListListingRevisionsRequest interceptedRequest =
                ListListingRevisionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionCollection/ListListingRevisions");
        java.util.function.Function<javax.ws.rs.core.Response, ListListingRevisionsResponse>
                transformer =
                        ListListingRevisionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListingsResponse listListings(ListListingsRequest request) {
        LOG.trace("Called listListings");
        final ListListingsRequest interceptedRequest =
                ListListingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingCollection/ListListings");
        java.util.function.Function<javax.ws.rs.core.Response, ListListingsResponse> transformer =
                ListListingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMarketsResponse listMarkets(ListMarketsRequest request) {
        LOG.trace("Called listMarkets");
        final ListMarketsRequest interceptedRequest =
                ListMarketsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMarketsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListMarkets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/MarketCollection/ListMarkets");
        java.util.function.Function<javax.ws.rs.core.Response, ListMarketsResponse> transformer =
                ListMarketsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListProductsResponse listProducts(ListProductsRequest request) {
        LOG.trace("Called listProducts");
        final ListProductsRequest interceptedRequest =
                ListProductsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProductsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListProducts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ProductCollection/ListProducts");
        java.util.function.Function<javax.ws.rs.core.Response, ListProductsResponse> transformer =
                ListProductsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListPublishersResponse listPublishers(ListPublishersRequest request) {
        LOG.trace("Called listPublishers");
        final ListPublishersRequest interceptedRequest =
                ListPublishersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublishersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListPublishers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/PublisherCollection/ListPublishers");
        java.util.function.Function<javax.ws.rs.core.Response, ListPublishersResponse> transformer =
                ListPublishersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListTermVersionsResponse listTermVersions(ListTermVersionsRequest request) {
        LOG.trace("Called listTermVersions");
        final ListTermVersionsRequest interceptedRequest =
                ListTermVersionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTermVersionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListTermVersions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersionCollection/ListTermVersions");
        java.util.function.Function<javax.ws.rs.core.Response, ListTermVersionsResponse>
                transformer =
                        ListTermVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListTermsResponse listTerms(ListTermsRequest request) {
        LOG.trace("Called listTerms");
        final ListTermsRequest interceptedRequest = ListTermsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTermsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListTerms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermCollection/ListTerms");
        java.util.function.Function<javax.ws.rs.core.Response, ListTermsResponse> transformer =
                ListTermsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {
        LOG.trace("Called listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequestError/ListWorkRequestErrors");
        java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {
        LOG.trace("Called listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequestLogEntry/ListWorkRequestLogs");
        java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/ListWorkRequests");
        java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer =
                        ListWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public MarkListingRevisionPackageAsDefaultResponse markListingRevisionPackageAsDefault(
            MarkListingRevisionPackageAsDefaultRequest request) {
        LOG.trace("Called markListingRevisionPackageAsDefault");
        final MarkListingRevisionPackageAsDefaultRequest interceptedRequest =
                MarkListingRevisionPackageAsDefaultConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MarkListingRevisionPackageAsDefaultConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "MarkListingRevisionPackageAsDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/MarkListingRevisionPackageAsDefault");
        java.util.function.Function<
                        javax.ws.rs.core.Response, MarkListingRevisionPackageAsDefaultResponse>
                transformer =
                        MarkListingRevisionPackageAsDefaultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PublishListingRevisionResponse publishListingRevision(
            PublishListingRevisionRequest request) {
        LOG.trace("Called publishListingRevision");
        final PublishListingRevisionRequest interceptedRequest =
                PublishListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/PublishListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, PublishListingRevisionResponse>
                transformer =
                        PublishListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PublishListingRevisionAsPrivateResponse publishListingRevisionAsPrivate(
            PublishListingRevisionAsPrivateRequest request) {
        LOG.trace("Called publishListingRevisionAsPrivate");
        final PublishListingRevisionAsPrivateRequest interceptedRequest =
                PublishListingRevisionAsPrivateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionAsPrivateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionAsPrivate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/PublishListingRevisionAsPrivate");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PublishListingRevisionAsPrivateResponse>
                transformer =
                        PublishListingRevisionAsPrivateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getPublishListingRevisionAsPrivateDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PublishListingRevisionPackageResponse publishListingRevisionPackage(
            PublishListingRevisionPackageRequest request) {
        LOG.trace("Called publishListingRevisionPackage");
        final PublishListingRevisionPackageRequest interceptedRequest =
                PublishListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/PublishListingRevisionPackage");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PublishListingRevisionPackageResponse>
                transformer =
                        PublishListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SubmitListingRevisionForReviewResponse submitListingRevisionForReview(
            SubmitListingRevisionForReviewRequest request) {
        LOG.trace("Called submitListingRevisionForReview");
        final SubmitListingRevisionForReviewRequest interceptedRequest =
                SubmitListingRevisionForReviewConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SubmitListingRevisionForReviewConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "SubmitListingRevisionForReview",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/SubmitListingRevisionForReview");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SubmitListingRevisionForReviewResponse>
                transformer =
                        SubmitListingRevisionForReviewConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getSubmitListingRevisionForReviewDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UnPublishListingRevisionPackageResponse unPublishListingRevisionPackage(
            UnPublishListingRevisionPackageRequest request) {
        LOG.trace("Called unPublishListingRevisionPackage");
        final UnPublishListingRevisionPackageRequest interceptedRequest =
                UnPublishListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnPublishListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UnPublishListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/UnPublishListingRevisionPackage");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UnPublishListingRevisionPackageResponse>
                transformer =
                        UnPublishListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateArtifactResponse updateArtifact(UpdateArtifactRequest request) {
        LOG.trace("Called updateArtifact");
        final UpdateArtifactRequest interceptedRequest =
                UpdateArtifactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateArtifactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/UpdateArtifact");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateArtifactResponse> transformer =
                UpdateArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateArtifactDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateListingResponse updateListing(UpdateListingRequest request) {
        LOG.trace("Called updateListing");
        final UpdateListingRequest interceptedRequest =
                UpdateListingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/UpdateListing");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateListingResponse> transformer =
                UpdateListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateListingDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateListingRevisionResponse updateListingRevision(
            UpdateListingRevisionRequest request) {
        LOG.trace("Called updateListingRevision");
        final UpdateListingRevisionRequest interceptedRequest =
                UpdateListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/UpdateListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateListingRevisionResponse>
                transformer =
                        UpdateListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateListingRevisionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateListingRevisionAttachmentResponse updateListingRevisionAttachment(
            UpdateListingRevisionAttachmentRequest request) {
        LOG.trace("Called updateListingRevisionAttachment");
        final UpdateListingRevisionAttachmentRequest interceptedRequest =
                UpdateListingRevisionAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/UpdateListingRevisionAttachment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateListingRevisionAttachmentResponse>
                transformer =
                        UpdateListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateListingRevisionAttachmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateListingRevisionAttachmentContentResponse updateListingRevisionAttachmentContent(
            UpdateListingRevisionAttachmentContentRequest request) {
        LOG.trace("Called updateListingRevisionAttachmentContent");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, UpdateListingRevisionAttachmentContentRequest.builder());
            }
            final UpdateListingRevisionAttachmentContentRequest interceptedRequest =
                    UpdateListingRevisionAttachmentContentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UpdateListingRevisionAttachmentContentConverter.fromRequest(
                            client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "MarketplacePublisher",
                            "UpdateListingRevisionAttachmentContent",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/UpdateListingRevisionAttachmentContent");
            java.util.function.Function<
                            javax.ws.rs.core.Response,
                            UpdateListingRevisionAttachmentContentResponse>
                    transformer =
                            UpdateListingRevisionAttachmentContentConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                        authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> {
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.put(
                                                        ib,
                                                        retriedRequest
                                                                .getUpdateListingRevisionAttachmentContent(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getUpdateListingRevisionAttachmentContent(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUpdateListingRevisionAttachmentContent());
        }
    }

    @Override
    public UpdateListingRevisionIconContentResponse updateListingRevisionIconContent(
            UpdateListingRevisionIconContentRequest request) {
        LOG.trace("Called updateListingRevisionIconContent");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, UpdateListingRevisionIconContentRequest.builder());
            }
            final UpdateListingRevisionIconContentRequest interceptedRequest =
                    UpdateListingRevisionIconContentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UpdateListingRevisionIconContentConverter.fromRequest(
                            client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "MarketplacePublisher",
                            "UpdateListingRevisionIconContent",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/UpdateListingRevisionIconContent");
            java.util.function.Function<
                            javax.ws.rs.core.Response, UpdateListingRevisionIconContentResponse>
                    transformer =
                            UpdateListingRevisionIconContentConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                        authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> {
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.put(
                                                        ib,
                                                        retriedRequest
                                                                .getUpdateListingRevisionIconContent(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getUpdateListingRevisionIconContent(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUpdateListingRevisionIconContent());
        }
    }

    @Override
    public UpdateListingRevisionPackageResponse updateListingRevisionPackage(
            UpdateListingRevisionPackageRequest request) {
        LOG.trace("Called updateListingRevisionPackage");
        final UpdateListingRevisionPackageRequest interceptedRequest =
                UpdateListingRevisionPackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionPackageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/UpdateListingRevisionPackage");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateListingRevisionPackageResponse>
                transformer =
                        UpdateListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateListingRevisionPackageDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTermResponse updateTerm(UpdateTermRequest request) {
        LOG.trace("Called updateTerm");
        final UpdateTermRequest interceptedRequest = UpdateTermConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/UpdateTerm");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateTermResponse> transformer =
                UpdateTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateTermDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTermVersionResponse updateTermVersion(UpdateTermVersionRequest request) {
        LOG.trace("Called updateTermVersion");
        final UpdateTermVersionRequest interceptedRequest =
                UpdateTermVersionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermVersionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/UpdateTermVersion");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateTermVersionResponse>
                transformer =
                        UpdateTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateTermVersionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTermVersionContentResponse updateTermVersionContent(
            UpdateTermVersionContentRequest request) {
        LOG.trace("Called updateTermVersionContent");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, UpdateTermVersionContentRequest.builder());
            }
            final UpdateTermVersionContentRequest interceptedRequest =
                    UpdateTermVersionContentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UpdateTermVersionContentConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "MarketplacePublisher",
                            "UpdateTermVersionContent",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/UpdateTermVersionContent");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateTermVersionContentResponse>
                    transformer =
                            UpdateTermVersionContentConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                        authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> {
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.put(
                                                        ib,
                                                        retriedRequest
                                                                .getUpdateTermVersionContent(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getUpdateTermVersionContent(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUpdateTermVersionContent());
        }
    }

    @Override
    public ValidateAndPublishArtifactResponse validateAndPublishArtifact(
            ValidateAndPublishArtifactRequest request) {
        LOG.trace("Called validateAndPublishArtifact");
        final ValidateAndPublishArtifactRequest interceptedRequest =
                ValidateAndPublishArtifactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAndPublishArtifactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ValidateAndPublishArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/ValidateAndPublishArtifact");
        java.util.function.Function<javax.ws.rs.core.Response, ValidateAndPublishArtifactResponse>
                transformer =
                        ValidateAndPublishArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public WithdrawListingRevisionResponse withdrawListingRevision(
            WithdrawListingRevisionRequest request) {
        LOG.trace("Called withdrawListingRevision");
        final WithdrawListingRevisionRequest interceptedRequest =
                WithdrawListingRevisionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                WithdrawListingRevisionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "WithdrawListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/WithdrawListingRevision");
        java.util.function.Function<javax.ws.rs.core.Response, WithdrawListingRevisionResponse>
                transformer =
                        WithdrawListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public MarketplacePublisherWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MarketplacePublisherPaginators getPaginators() {
        return paginators;
    }

    private static boolean shouldRetryBecauseOfWaiterConfiguration(
            com.oracle.bmc.retrier.BmcGenericRetrier retrier) {
        boolean hasTerminationStrategy = false;
        boolean isMaxAttemptsTerminationStrategy = false;
        if (retrier.getWaiter() != null && retrier.getWaiter().getWaiterConfiguration() != null) {
            hasTerminationStrategy =
                    retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy() != null;
            if (hasTerminationStrategy) {
                isMaxAttemptsTerminationStrategy =
                        retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy()
                                instanceof com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
            }
        }
        final boolean shouldRetry =
                hasTerminationStrategy
                        && (!isMaxAttemptsTerminationStrategy
                                || isMaxAttemptsTerminationStrategy
                                        && ((com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy)
                                                                retrier.getWaiter()
                                                                        .getWaiterConfiguration()
                                                                        .getTerminationStrategy())
                                                        .getMaxAttempts()
                                                > 1);
        return shouldRetry;
    }
}
