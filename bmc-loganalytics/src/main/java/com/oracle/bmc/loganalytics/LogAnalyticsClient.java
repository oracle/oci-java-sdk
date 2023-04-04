/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.internal.http.*;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class LogAnalyticsClient implements LogAnalytics {
    /**
     * Service instance for LogAnalytics.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOGANALYTICS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://loganalytics.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogAnalyticsClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final LogAnalyticsWaiters waiters;

    private final LogAnalyticsPaginators paginators;
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
    public LogAnalyticsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    protected LogAnalyticsClient(
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
                                    .nameFormat("LogAnalytics-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LogAnalyticsWaiters(executorService, this);

        this.paginators = new LogAnalyticsPaginators(this);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LogAnalyticsClient> {
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
        public LogAnalyticsClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new LogAnalyticsClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    executorService);
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
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public AddEntityAssociationResponse addEntityAssociation(AddEntityAssociationRequest request) {
        LOG.trace("Called addEntityAssociation");
        final AddEntityAssociationRequest interceptedRequest =
                AddEntityAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddEntityAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "AddEntityAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/AddEntityAssociation");
        java.util.function.Function<javax.ws.rs.core.Response, AddEntityAssociationResponse>
                transformer =
                        AddEntityAssociationConverter.fromResponse(
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
                                                retriedRequest.getAddEntityAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AddSourceEventTypesResponse addSourceEventTypes(AddSourceEventTypesRequest request) {
        LOG.trace("Called addSourceEventTypes");
        final AddSourceEventTypesRequest interceptedRequest =
                AddSourceEventTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddSourceEventTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "AddSourceEventTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/AddSourceEventTypes");
        java.util.function.Function<javax.ws.rs.core.Response, AddSourceEventTypesResponse>
                transformer =
                        AddSourceEventTypesConverter.fromResponse(
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
                                                retriedRequest.getAddEventTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AppendLookupDataResponse appendLookupData(AppendLookupDataRequest request) {
        LOG.trace("Called appendLookupData");
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
                                request, AppendLookupDataRequest.builder());
            }
            final AppendLookupDataRequest interceptedRequest =
                    AppendLookupDataConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    AppendLookupDataConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "AppendLookupData",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/AppendLookupData");
            java.util.function.Function<javax.ws.rs.core.Response, AppendLookupDataResponse>
                    transformer =
                            AppendLookupDataConverter.fromResponse(
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
                                                        retriedRequest.getAppendLookupFileBody(),
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
                                                    interceptedRequest.getAppendLookupFileBody(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getAppendLookupFileBody());
        }
    }

    @Override
    public AssignEncryptionKeyResponse assignEncryptionKey(AssignEncryptionKeyRequest request) {
        LOG.trace("Called assignEncryptionKey");
        final AssignEncryptionKeyRequest interceptedRequest =
                AssignEncryptionKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AssignEncryptionKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "AssignEncryptionKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/AssignEncryptionKey");
        java.util.function.Function<javax.ws.rs.core.Response, AssignEncryptionKeyResponse>
                transformer =
                        AssignEncryptionKeyConverter.fromResponse(
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
                                                retriedRequest.getAssignEncryptionKeyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public BatchGetBasicInfoResponse batchGetBasicInfo(BatchGetBasicInfoRequest request) {
        LOG.trace("Called batchGetBasicInfo");
        final BatchGetBasicInfoRequest interceptedRequest =
                BatchGetBasicInfoConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchGetBasicInfoConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "BatchGetBasicInfo",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/BatchGetBasicInfo");
        java.util.function.Function<javax.ws.rs.core.Response, BatchGetBasicInfoResponse>
                transformer =
                        BatchGetBasicInfoConverter.fromResponse(
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
                                                retriedRequest.getBasicDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CancelQueryWorkRequestResponse cancelQueryWorkRequest(
            CancelQueryWorkRequestRequest request) {
        LOG.trace("Called cancelQueryWorkRequest");
        final CancelQueryWorkRequestRequest interceptedRequest =
                CancelQueryWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelQueryWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CancelQueryWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/CancelQueryWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, CancelQueryWorkRequestResponse>
                transformer =
                        CancelQueryWorkRequestConverter.fromResponse(
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
    public ChangeIngestTimeRuleCompartmentResponse changeIngestTimeRuleCompartment(
            ChangeIngestTimeRuleCompartmentRequest request) {
        LOG.trace("Called changeIngestTimeRuleCompartment");
        final ChangeIngestTimeRuleCompartmentRequest interceptedRequest =
                ChangeIngestTimeRuleCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIngestTimeRuleCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeIngestTimeRuleCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/ChangeIngestTimeRuleCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeIngestTimeRuleCompartmentResponse>
                transformer =
                        ChangeIngestTimeRuleCompartmentConverter.fromResponse(
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
                                                        .getChangeIngestTimeRuleCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeLogAnalyticsEmBridgeCompartmentResponse changeLogAnalyticsEmBridgeCompartment(
            ChangeLogAnalyticsEmBridgeCompartmentRequest request) {
        LOG.trace("Called changeLogAnalyticsEmBridgeCompartment");
        final ChangeLogAnalyticsEmBridgeCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsEmBridgeCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsEmBridgeCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsEmBridgeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/ChangeLogAnalyticsEmBridgeCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsEmBridgeCompartmentResponse>
                transformer =
                        ChangeLogAnalyticsEmBridgeCompartmentConverter.fromResponse(
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
                                                        .getChangeLogAnalyticsEmBridgeCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeLogAnalyticsEntityCompartmentResponse changeLogAnalyticsEntityCompartment(
            ChangeLogAnalyticsEntityCompartmentRequest request) {
        LOG.trace("Called changeLogAnalyticsEntityCompartment");
        final ChangeLogAnalyticsEntityCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsEntityCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsEntityCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsEntityCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ChangeLogAnalyticsEntityCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsEntityCompartmentResponse>
                transformer =
                        ChangeLogAnalyticsEntityCompartmentConverter.fromResponse(
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
                                                        .getChangeLogAnalyticsEntityCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeLogAnalyticsLogGroupCompartmentResponse changeLogAnalyticsLogGroupCompartment(
            ChangeLogAnalyticsLogGroupCompartmentRequest request) {
        LOG.trace("Called changeLogAnalyticsLogGroupCompartment");
        final ChangeLogAnalyticsLogGroupCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsLogGroupCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsLogGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsLogGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/ChangeLogAnalyticsLogGroupCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsLogGroupCompartmentResponse>
                transformer =
                        ChangeLogAnalyticsLogGroupCompartmentConverter.fromResponse(
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
                                                        .getChangeLogAnalyticsLogGroupCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request) {
        LOG.trace("Called changeLogAnalyticsObjectCollectionRuleCompartment");
        final ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsObjectCollectionRuleCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/ChangeLogAnalyticsObjectCollectionRuleCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                transformer =
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.fromResponse(
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
                                                        .getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeScheduledTaskCompartmentResponse changeScheduledTaskCompartment(
            ChangeScheduledTaskCompartmentRequest request) {
        LOG.trace("Called changeScheduledTaskCompartment");
        final ChangeScheduledTaskCompartmentRequest interceptedRequest =
                ChangeScheduledTaskCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeScheduledTaskCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ChangeScheduledTaskCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ChangeScheduledTaskCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeScheduledTaskCompartmentResponse>
                transformer =
                        ChangeScheduledTaskCompartmentConverter.fromResponse(
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
                                                        .getChangeScheduledTaskCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CleanResponse clean(CleanRequest request) {
        LOG.trace("Called clean");
        final CleanRequest interceptedRequest = CleanConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CleanConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Clean",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Clean");
        java.util.function.Function<javax.ws.rs.core.Response, CleanResponse> transformer =
                CleanConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public CompareContentResponse compareContent(CompareContentRequest request) {
        LOG.trace("Called compareContent");
        final CompareContentRequest interceptedRequest =
                CompareContentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareContentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CompareContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/CompareContent");
        java.util.function.Function<javax.ws.rs.core.Response, CompareContentResponse> transformer =
                CompareContentConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCompareContentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateIngestTimeRuleResponse createIngestTimeRule(CreateIngestTimeRuleRequest request) {
        LOG.trace("Called createIngestTimeRule");
        final CreateIngestTimeRuleRequest interceptedRequest =
                CreateIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/CreateIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, CreateIngestTimeRuleResponse>
                transformer =
                        CreateIngestTimeRuleConverter.fromResponse(
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
                                                retriedRequest.getCreateIngestTimeRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLogAnalyticsEmBridgeResponse createLogAnalyticsEmBridge(
            CreateLogAnalyticsEmBridgeRequest request) {
        LOG.trace("Called createLogAnalyticsEmBridge");
        final CreateLogAnalyticsEmBridgeRequest interceptedRequest =
                CreateLogAnalyticsEmBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEmBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/CreateLogAnalyticsEmBridge");
        java.util.function.Function<javax.ws.rs.core.Response, CreateLogAnalyticsEmBridgeResponse>
                transformer =
                        CreateLogAnalyticsEmBridgeConverter.fromResponse(
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
                                                        .getCreateLogAnalyticsEmBridgeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLogAnalyticsEntityResponse createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request) {
        LOG.trace("Called createLogAnalyticsEntity");
        final CreateLogAnalyticsEntityRequest interceptedRequest =
                CreateLogAnalyticsEntityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEntity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/CreateLogAnalyticsEntity");
        java.util.function.Function<javax.ws.rs.core.Response, CreateLogAnalyticsEntityResponse>
                transformer =
                        CreateLogAnalyticsEntityConverter.fromResponse(
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
                                                retriedRequest.getCreateLogAnalyticsEntityDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLogAnalyticsEntityTypeResponse createLogAnalyticsEntityType(
            CreateLogAnalyticsEntityTypeRequest request) {
        LOG.trace("Called createLogAnalyticsEntityType");
        final CreateLogAnalyticsEntityTypeRequest interceptedRequest =
                CreateLogAnalyticsEntityTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEntityType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/CreateLogAnalyticsEntityType");
        java.util.function.Function<javax.ws.rs.core.Response, CreateLogAnalyticsEntityTypeResponse>
                transformer =
                        CreateLogAnalyticsEntityTypeConverter.fromResponse(
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
                                                        .getCreateLogAnalyticsEntityTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLogAnalyticsLogGroupResponse createLogAnalyticsLogGroup(
            CreateLogAnalyticsLogGroupRequest request) {
        LOG.trace("Called createLogAnalyticsLogGroup");
        final CreateLogAnalyticsLogGroupRequest interceptedRequest =
                CreateLogAnalyticsLogGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsLogGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/CreateLogAnalyticsLogGroup");
        java.util.function.Function<javax.ws.rs.core.Response, CreateLogAnalyticsLogGroupResponse>
                transformer =
                        CreateLogAnalyticsLogGroupConverter.fromResponse(
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
                                                        .getCreateLogAnalyticsLogGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLogAnalyticsObjectCollectionRuleResponse createLogAnalyticsObjectCollectionRule(
            CreateLogAnalyticsObjectCollectionRuleRequest request) {
        LOG.trace("Called createLogAnalyticsObjectCollectionRule");
        final CreateLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                CreateLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsObjectCollectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/CreateLogAnalyticsObjectCollectionRule");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsObjectCollectionRuleResponse>
                transformer =
                        CreateLogAnalyticsObjectCollectionRuleConverter.fromResponse(
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
                                                        .getCreateLogAnalyticsObjectCollectionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) {
        LOG.trace("Called createScheduledTask");
        final CreateScheduledTaskRequest interceptedRequest =
                CreateScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "CreateScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/CreateScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, CreateScheduledTaskResponse>
                transformer =
                        CreateScheduledTaskConverter.fromResponse(
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
                                                retriedRequest.getCreateScheduledTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteAssociationsResponse deleteAssociations(DeleteAssociationsRequest request) {
        LOG.trace("Called deleteAssociations");
        final DeleteAssociationsRequest interceptedRequest =
                DeleteAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/DeleteAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteAssociationsResponse>
                transformer =
                        DeleteAssociationsConverter.fromResponse(
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
                                                        .getDeleteLogAnalyticsAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteFieldResponse deleteField(DeleteFieldRequest request) {
        LOG.trace("Called deleteField");
        final DeleteFieldRequest interceptedRequest =
                DeleteFieldConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFieldConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteField",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/DeleteField");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteFieldResponse> transformer =
                DeleteFieldConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteIngestTimeRuleResponse deleteIngestTimeRule(DeleteIngestTimeRuleRequest request) {
        LOG.trace("Called deleteIngestTimeRule");
        final DeleteIngestTimeRuleRequest interceptedRequest =
                DeleteIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/DeleteIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteIngestTimeRuleResponse>
                transformer =
                        DeleteIngestTimeRuleConverter.fromResponse(
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
    public DeleteLabelResponse deleteLabel(DeleteLabelRequest request) {
        LOG.trace("Called deleteLabel");
        final DeleteLabelRequest interceptedRequest =
                DeleteLabelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLabelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLabel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/DeleteLabel");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLabelResponse> transformer =
                DeleteLabelConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteLogAnalyticsEmBridgeResponse deleteLogAnalyticsEmBridge(
            DeleteLogAnalyticsEmBridgeRequest request) {
        LOG.trace("Called deleteLogAnalyticsEmBridge");
        final DeleteLogAnalyticsEmBridgeRequest interceptedRequest =
                DeleteLogAnalyticsEmBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEmBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/DeleteLogAnalyticsEmBridge");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLogAnalyticsEmBridgeResponse>
                transformer =
                        DeleteLogAnalyticsEmBridgeConverter.fromResponse(
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
    public DeleteLogAnalyticsEntityResponse deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request) {
        LOG.trace("Called deleteLogAnalyticsEntity");
        final DeleteLogAnalyticsEntityRequest interceptedRequest =
                DeleteLogAnalyticsEntityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEntity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/DeleteLogAnalyticsEntity");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLogAnalyticsEntityResponse>
                transformer =
                        DeleteLogAnalyticsEntityConverter.fromResponse(
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
    public DeleteLogAnalyticsEntityTypeResponse deleteLogAnalyticsEntityType(
            DeleteLogAnalyticsEntityTypeRequest request) {
        LOG.trace("Called deleteLogAnalyticsEntityType");
        final DeleteLogAnalyticsEntityTypeRequest interceptedRequest =
                DeleteLogAnalyticsEntityTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEntityType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/DeleteLogAnalyticsEntityType");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLogAnalyticsEntityTypeResponse>
                transformer =
                        DeleteLogAnalyticsEntityTypeConverter.fromResponse(
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
    public DeleteLogAnalyticsLogGroupResponse deleteLogAnalyticsLogGroup(
            DeleteLogAnalyticsLogGroupRequest request) {
        LOG.trace("Called deleteLogAnalyticsLogGroup");
        final DeleteLogAnalyticsLogGroupRequest interceptedRequest =
                DeleteLogAnalyticsLogGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsLogGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/DeleteLogAnalyticsLogGroup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLogAnalyticsLogGroupResponse>
                transformer =
                        DeleteLogAnalyticsLogGroupConverter.fromResponse(
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
    public DeleteLogAnalyticsObjectCollectionRuleResponse deleteLogAnalyticsObjectCollectionRule(
            DeleteLogAnalyticsObjectCollectionRuleRequest request) {
        LOG.trace("Called deleteLogAnalyticsObjectCollectionRule");
        final DeleteLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                DeleteLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsObjectCollectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/DeleteLogAnalyticsObjectCollectionRule");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsObjectCollectionRuleResponse>
                transformer =
                        DeleteLogAnalyticsObjectCollectionRuleConverter.fromResponse(
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
    public DeleteLookupResponse deleteLookup(DeleteLookupRequest request) {
        LOG.trace("Called deleteLookup");
        final DeleteLookupRequest interceptedRequest =
                DeleteLookupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLookupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteLookup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/DeleteLookup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteLookupResponse> transformer =
                DeleteLookupConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteParserResponse deleteParser(DeleteParserRequest request) {
        LOG.trace("Called deleteParser");
        final DeleteParserRequest interceptedRequest =
                DeleteParserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteParserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteParser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/DeleteParser");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteParserResponse> transformer =
                DeleteParserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {
        LOG.trace("Called deleteScheduledTask");
        final DeleteScheduledTaskRequest interceptedRequest =
                DeleteScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/DeleteScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteScheduledTaskResponse>
                transformer =
                        DeleteScheduledTaskConverter.fromResponse(
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
    public DeleteSourceResponse deleteSource(DeleteSourceRequest request) {
        LOG.trace("Called deleteSource");
        final DeleteSourceRequest interceptedRequest =
                DeleteSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSourceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DeleteSource");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteSourceResponse> transformer =
                DeleteSourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteUploadResponse deleteUpload(DeleteUploadRequest request) {
        LOG.trace("Called deleteUpload");
        final DeleteUploadRequest interceptedRequest =
                DeleteUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteUpload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUpload");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUploadResponse> transformer =
                DeleteUploadConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteUploadFileResponse deleteUploadFile(DeleteUploadFileRequest request) {
        LOG.trace("Called deleteUploadFile");
        final DeleteUploadFileRequest interceptedRequest =
                DeleteUploadFileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadFileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteUploadFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUploadFile");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUploadFileResponse>
                transformer =
                        DeleteUploadFileConverter.fromResponse(
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
    public DeleteUploadWarningResponse deleteUploadWarning(DeleteUploadWarningRequest request) {
        LOG.trace("Called deleteUploadWarning");
        final DeleteUploadWarningRequest interceptedRequest =
                DeleteUploadWarningConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadWarningConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DeleteUploadWarning",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUploadWarning");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUploadWarningResponse>
                transformer =
                        DeleteUploadWarningConverter.fromResponse(
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
    public DisableArchivingResponse disableArchiving(DisableArchivingRequest request) {
        LOG.trace("Called disableArchiving");
        final DisableArchivingRequest interceptedRequest =
                DisableArchivingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableArchivingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DisableArchiving",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/DisableArchiving");
        java.util.function.Function<javax.ws.rs.core.Response, DisableArchivingResponse>
                transformer =
                        DisableArchivingConverter.fromResponse(
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
    public DisableAutoAssociationResponse disableAutoAssociation(
            DisableAutoAssociationRequest request) {
        LOG.trace("Called disableAutoAssociation");
        final DisableAutoAssociationRequest interceptedRequest =
                DisableAutoAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutoAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DisableAutoAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DisableAutoAssociation");
        java.util.function.Function<javax.ws.rs.core.Response, DisableAutoAssociationResponse>
                transformer =
                        DisableAutoAssociationConverter.fromResponse(
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
                                                retriedRequest.getDisableAutoAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableIngestTimeRuleResponse disableIngestTimeRule(
            DisableIngestTimeRuleRequest request) {
        LOG.trace("Called disableIngestTimeRule");
        final DisableIngestTimeRuleRequest interceptedRequest =
                DisableIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DisableIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/DisableIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, DisableIngestTimeRuleResponse>
                transformer =
                        DisableIngestTimeRuleConverter.fromResponse(
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
    public DisableSourceEventTypesResponse disableSourceEventTypes(
            DisableSourceEventTypesRequest request) {
        LOG.trace("Called disableSourceEventTypes");
        final DisableSourceEventTypesRequest interceptedRequest =
                DisableSourceEventTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableSourceEventTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "DisableSourceEventTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DisableSourceEventTypes");
        java.util.function.Function<javax.ws.rs.core.Response, DisableSourceEventTypesResponse>
                transformer =
                        DisableSourceEventTypesConverter.fromResponse(
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
                                                retriedRequest.getDisableEventTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableArchivingResponse enableArchiving(EnableArchivingRequest request) {
        LOG.trace("Called enableArchiving");
        final EnableArchivingRequest interceptedRequest =
                EnableArchivingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableArchivingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EnableArchiving",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EnableArchiving");
        java.util.function.Function<javax.ws.rs.core.Response, EnableArchivingResponse>
                transformer =
                        EnableArchivingConverter.fromResponse(
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
    public EnableAutoAssociationResponse enableAutoAssociation(
            EnableAutoAssociationRequest request) {
        LOG.trace("Called enableAutoAssociation");
        final EnableAutoAssociationRequest interceptedRequest =
                EnableAutoAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutoAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EnableAutoAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/EnableAutoAssociation");
        java.util.function.Function<javax.ws.rs.core.Response, EnableAutoAssociationResponse>
                transformer =
                        EnableAutoAssociationConverter.fromResponse(
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
                                                retriedRequest.getEnableAutoAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableIngestTimeRuleResponse enableIngestTimeRule(EnableIngestTimeRuleRequest request) {
        LOG.trace("Called enableIngestTimeRule");
        final EnableIngestTimeRuleRequest interceptedRequest =
                EnableIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EnableIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/EnableIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, EnableIngestTimeRuleResponse>
                transformer =
                        EnableIngestTimeRuleConverter.fromResponse(
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
    public EnableSourceEventTypesResponse enableSourceEventTypes(
            EnableSourceEventTypesRequest request) {
        LOG.trace("Called enableSourceEventTypes");
        final EnableSourceEventTypesRequest interceptedRequest =
                EnableSourceEventTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableSourceEventTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EnableSourceEventTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/EnableSourceEventTypes");
        java.util.function.Function<javax.ws.rs.core.Response, EnableSourceEventTypesResponse>
                transformer =
                        EnableSourceEventTypesConverter.fromResponse(
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
                                                retriedRequest.getEnableEventTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EstimatePurgeDataSizeResponse estimatePurgeDataSize(
            EstimatePurgeDataSizeRequest request) {
        LOG.trace("Called estimatePurgeDataSize");
        final EstimatePurgeDataSizeRequest interceptedRequest =
                EstimatePurgeDataSizeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimatePurgeDataSizeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EstimatePurgeDataSize",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimatePurgeDataSize");
        java.util.function.Function<javax.ws.rs.core.Response, EstimatePurgeDataSizeResponse>
                transformer =
                        EstimatePurgeDataSizeConverter.fromResponse(
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
                                                retriedRequest.getEstimatePurgeDataSizeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EstimateRecallDataSizeResponse estimateRecallDataSize(
            EstimateRecallDataSizeRequest request) {
        LOG.trace("Called estimateRecallDataSize");
        final EstimateRecallDataSizeRequest interceptedRequest =
                EstimateRecallDataSizeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimateRecallDataSizeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EstimateRecallDataSize",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimateRecallDataSize");
        java.util.function.Function<javax.ws.rs.core.Response, EstimateRecallDataSizeResponse>
                transformer =
                        EstimateRecallDataSizeConverter.fromResponse(
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
                                                retriedRequest.getEstimateRecallDataSizeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EstimateReleaseDataSizeResponse estimateReleaseDataSize(
            EstimateReleaseDataSizeRequest request) {
        LOG.trace("Called estimateReleaseDataSize");
        final EstimateReleaseDataSizeRequest interceptedRequest =
                EstimateReleaseDataSizeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimateReleaseDataSizeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "EstimateReleaseDataSize",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimateReleaseDataSize");
        java.util.function.Function<javax.ws.rs.core.Response, EstimateReleaseDataSizeResponse>
                transformer =
                        EstimateReleaseDataSizeConverter.fromResponse(
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
                                                retriedRequest.getEstimateReleaseDataSizeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ExportCustomContentResponse exportCustomContent(ExportCustomContentRequest request) {
        LOG.trace("Called exportCustomContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "exportCustomContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final ExportCustomContentRequest interceptedRequest =
                ExportCustomContentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportCustomContentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics", "ExportCustomContent", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, ExportCustomContentResponse>
                transformer =
                        ExportCustomContentConverter.fromResponse(
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
                                                retriedRequest.getExportCustomContentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ExportQueryResultResponse exportQueryResult(ExportQueryResultRequest request) {
        LOG.trace("Called exportQueryResult");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "exportQueryResult returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final ExportQueryResultRequest interceptedRequest =
                ExportQueryResultConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportQueryResultConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ExportQueryResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/ExportQueryResult");
        java.util.function.Function<javax.ws.rs.core.Response, ExportQueryResultResponse>
                transformer =
                        ExportQueryResultConverter.fromResponse(
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
                                                retriedRequest.getExportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ExtractStructuredLogFieldPathsResponse extractStructuredLogFieldPaths(
            ExtractStructuredLogFieldPathsRequest request) {
        LOG.trace("Called extractStructuredLogFieldPaths");
        final ExtractStructuredLogFieldPathsRequest interceptedRequest =
                ExtractStructuredLogFieldPathsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExtractStructuredLogFieldPathsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ExtractStructuredLogFieldPaths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ExtractStructuredLogFieldPaths");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ExtractStructuredLogFieldPathsResponse>
                transformer =
                        ExtractStructuredLogFieldPathsConverter.fromResponse(
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
                                                retriedRequest.getLoganParserDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ExtractStructuredLogHeaderPathsResponse extractStructuredLogHeaderPaths(
            ExtractStructuredLogHeaderPathsRequest request) {
        LOG.trace("Called extractStructuredLogHeaderPaths");
        final ExtractStructuredLogHeaderPathsRequest interceptedRequest =
                ExtractStructuredLogHeaderPathsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExtractStructuredLogHeaderPathsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ExtractStructuredLogHeaderPaths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ExtractStructuredLogHeaderPaths");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ExtractStructuredLogHeaderPathsResponse>
                transformer =
                        ExtractStructuredLogHeaderPathsConverter.fromResponse(
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
                                                retriedRequest.getLoganParserDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public FilterResponse filter(FilterRequest request) {
        LOG.trace("Called filter");
        final FilterRequest interceptedRequest = FilterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FilterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Filter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Filter");
        java.util.function.Function<javax.ws.rs.core.Response, FilterResponse> transformer =
                FilterConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getFilterDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetAssociationSummaryResponse getAssociationSummary(
            GetAssociationSummaryRequest request) {
        LOG.trace("Called getAssociationSummary");
        final GetAssociationSummaryRequest interceptedRequest =
                GetAssociationSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAssociationSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetAssociationSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/GetAssociationSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetAssociationSummaryResponse>
                transformer =
                        GetAssociationSummaryConverter.fromResponse(
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
                        "LogAnalytics",
                        "GetCategory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/GetCategory");
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
    public GetColumnNamesResponse getColumnNames(GetColumnNamesRequest request) {
        LOG.trace("Called getColumnNames");
        final GetColumnNamesRequest interceptedRequest =
                GetColumnNamesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetColumnNamesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetColumnNames",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetColumnNames");
        java.util.function.Function<javax.ws.rs.core.Response, GetColumnNamesResponse> transformer =
                GetColumnNamesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetConfigWorkRequestResponse getConfigWorkRequest(GetConfigWorkRequestRequest request) {
        LOG.trace("Called getConfigWorkRequest");
        final GetConfigWorkRequestRequest interceptedRequest =
                GetConfigWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConfigWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetConfigWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsConfigWorkRequest/GetConfigWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, GetConfigWorkRequestResponse>
                transformer =
                        GetConfigWorkRequestConverter.fromResponse(
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
    public GetFieldResponse getField(GetFieldRequest request) {
        LOG.trace("Called getField");
        final GetFieldRequest interceptedRequest = GetFieldConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFieldConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetField",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/GetField");
        java.util.function.Function<javax.ws.rs.core.Response, GetFieldResponse> transformer =
                GetFieldConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetFieldsSummaryResponse getFieldsSummary(GetFieldsSummaryRequest request) {
        LOG.trace("Called getFieldsSummary");
        final GetFieldsSummaryRequest interceptedRequest =
                GetFieldsSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFieldsSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetFieldsSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/GetFieldsSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetFieldsSummaryResponse>
                transformer =
                        GetFieldsSummaryConverter.fromResponse(
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
    public GetIngestTimeRuleResponse getIngestTimeRule(GetIngestTimeRuleRequest request) {
        LOG.trace("Called getIngestTimeRule");
        final GetIngestTimeRuleRequest interceptedRequest =
                GetIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/GetIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, GetIngestTimeRuleResponse>
                transformer =
                        GetIngestTimeRuleConverter.fromResponse(
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
    public GetLabelResponse getLabel(GetLabelRequest request) {
        LOG.trace("Called getLabel");
        final GetLabelRequest interceptedRequest = GetLabelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLabelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLabel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/GetLabel");
        java.util.function.Function<javax.ws.rs.core.Response, GetLabelResponse> transformer =
                GetLabelConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetLabelSummaryResponse getLabelSummary(GetLabelSummaryRequest request) {
        LOG.trace("Called getLabelSummary");
        final GetLabelSummaryRequest interceptedRequest =
                GetLabelSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLabelSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLabelSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/GetLabelSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetLabelSummaryResponse>
                transformer =
                        GetLabelSummaryConverter.fromResponse(
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
    public GetLogAnalyticsEmBridgeResponse getLogAnalyticsEmBridge(
            GetLogAnalyticsEmBridgeRequest request) {
        LOG.trace("Called getLogAnalyticsEmBridge");
        final GetLogAnalyticsEmBridgeRequest interceptedRequest =
                GetLogAnalyticsEmBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEmBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/GetLogAnalyticsEmBridge");
        java.util.function.Function<javax.ws.rs.core.Response, GetLogAnalyticsEmBridgeResponse>
                transformer =
                        GetLogAnalyticsEmBridgeConverter.fromResponse(
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
    public GetLogAnalyticsEmBridgeSummaryResponse getLogAnalyticsEmBridgeSummary(
            GetLogAnalyticsEmBridgeSummaryRequest request) {
        LOG.trace("Called getLogAnalyticsEmBridgeSummary");
        final GetLogAnalyticsEmBridgeSummaryRequest interceptedRequest =
                GetLogAnalyticsEmBridgeSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEmBridgeSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEmBridgeSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/GetLogAnalyticsEmBridgeSummary");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEmBridgeSummaryResponse>
                transformer =
                        GetLogAnalyticsEmBridgeSummaryConverter.fromResponse(
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
    public GetLogAnalyticsEntitiesSummaryResponse getLogAnalyticsEntitiesSummary(
            GetLogAnalyticsEntitiesSummaryRequest request) {
        LOG.trace("Called getLogAnalyticsEntitiesSummary");
        final GetLogAnalyticsEntitiesSummaryRequest interceptedRequest =
                GetLogAnalyticsEntitiesSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntitiesSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntitiesSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/GetLogAnalyticsEntitiesSummary");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEntitiesSummaryResponse>
                transformer =
                        GetLogAnalyticsEntitiesSummaryConverter.fromResponse(
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
    public GetLogAnalyticsEntityResponse getLogAnalyticsEntity(
            GetLogAnalyticsEntityRequest request) {
        LOG.trace("Called getLogAnalyticsEntity");
        final GetLogAnalyticsEntityRequest interceptedRequest =
                GetLogAnalyticsEntityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/GetLogAnalyticsEntity");
        java.util.function.Function<javax.ws.rs.core.Response, GetLogAnalyticsEntityResponse>
                transformer =
                        GetLogAnalyticsEntityConverter.fromResponse(
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
    public GetLogAnalyticsEntityTypeResponse getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request) {
        LOG.trace("Called getLogAnalyticsEntityType");
        final GetLogAnalyticsEntityTypeRequest interceptedRequest =
                GetLogAnalyticsEntityTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntityType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/GetLogAnalyticsEntityType");
        java.util.function.Function<javax.ws.rs.core.Response, GetLogAnalyticsEntityTypeResponse>
                transformer =
                        GetLogAnalyticsEntityTypeConverter.fromResponse(
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
    public GetLogAnalyticsLogGroupResponse getLogAnalyticsLogGroup(
            GetLogAnalyticsLogGroupRequest request) {
        LOG.trace("Called getLogAnalyticsLogGroup");
        final GetLogAnalyticsLogGroupRequest interceptedRequest =
                GetLogAnalyticsLogGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsLogGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/GetLogAnalyticsLogGroup");
        java.util.function.Function<javax.ws.rs.core.Response, GetLogAnalyticsLogGroupResponse>
                transformer =
                        GetLogAnalyticsLogGroupConverter.fromResponse(
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
    public GetLogAnalyticsLogGroupsSummaryResponse getLogAnalyticsLogGroupsSummary(
            GetLogAnalyticsLogGroupsSummaryRequest request) {
        LOG.trace("Called getLogAnalyticsLogGroupsSummary");
        final GetLogAnalyticsLogGroupsSummaryRequest interceptedRequest =
                GetLogAnalyticsLogGroupsSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsLogGroupsSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsLogGroupsSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/GetLogAnalyticsLogGroupsSummary");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsLogGroupsSummaryResponse>
                transformer =
                        GetLogAnalyticsLogGroupsSummaryConverter.fromResponse(
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
    public GetLogAnalyticsObjectCollectionRuleResponse getLogAnalyticsObjectCollectionRule(
            GetLogAnalyticsObjectCollectionRuleRequest request) {
        LOG.trace("Called getLogAnalyticsObjectCollectionRule");
        final GetLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                GetLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsObjectCollectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/GetLogAnalyticsObjectCollectionRule");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsObjectCollectionRuleResponse>
                transformer =
                        GetLogAnalyticsObjectCollectionRuleConverter.fromResponse(
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
    public GetLogSetsCountResponse getLogSetsCount(GetLogSetsCountRequest request) {
        LOG.trace("Called getLogSetsCount");
        final GetLogSetsCountRequest interceptedRequest =
                GetLogSetsCountConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogSetsCountConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLogSetsCount",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetLogSetsCount");
        java.util.function.Function<javax.ws.rs.core.Response, GetLogSetsCountResponse>
                transformer =
                        GetLogSetsCountConverter.fromResponse(
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
    public GetLookupResponse getLookup(GetLookupRequest request) {
        LOG.trace("Called getLookup");
        final GetLookupRequest interceptedRequest = GetLookupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLookupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLookup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/GetLookup");
        java.util.function.Function<javax.ws.rs.core.Response, GetLookupResponse> transformer =
                GetLookupConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetLookupSummaryResponse getLookupSummary(GetLookupSummaryRequest request) {
        LOG.trace("Called getLookupSummary");
        final GetLookupSummaryRequest interceptedRequest =
                GetLookupSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLookupSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetLookupSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/GetLookupSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetLookupSummaryResponse>
                transformer =
                        GetLookupSummaryConverter.fromResponse(
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
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {
        LOG.trace("Called getNamespace");
        final GetNamespaceRequest interceptedRequest =
                GetNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/GetNamespace");
        java.util.function.Function<javax.ws.rs.core.Response, GetNamespaceResponse> transformer =
                GetNamespaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetParserResponse getParser(GetParserRequest request) {
        LOG.trace("Called getParser");
        final GetParserRequest interceptedRequest = GetParserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetParserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetParser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/GetParser");
        java.util.function.Function<javax.ws.rs.core.Response, GetParserResponse> transformer =
                GetParserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetParserSummaryResponse getParserSummary(GetParserSummaryRequest request) {
        LOG.trace("Called getParserSummary");
        final GetParserSummaryRequest interceptedRequest =
                GetParserSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetParserSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetParserSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/GetParserSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetParserSummaryResponse>
                transformer =
                        GetParserSummaryConverter.fromResponse(
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
    public GetPreferencesResponse getPreferences(GetPreferencesRequest request) {
        LOG.trace("Called getPreferences");
        final GetPreferencesRequest interceptedRequest =
                GetPreferencesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreferencesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetPreferences",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/GetPreferences");
        java.util.function.Function<javax.ws.rs.core.Response, GetPreferencesResponse> transformer =
                GetPreferencesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetQueryResultResponse getQueryResult(GetQueryResultRequest request) {
        LOG.trace("Called getQueryResult");
        final GetQueryResultRequest interceptedRequest =
                GetQueryResultConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetQueryResultConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetQueryResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/GetQueryResult");
        java.util.function.Function<javax.ws.rs.core.Response, GetQueryResultResponse> transformer =
                GetQueryResultConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetQueryWorkRequestResponse getQueryWorkRequest(GetQueryWorkRequestRequest request) {
        LOG.trace("Called getQueryWorkRequest");
        final GetQueryWorkRequestRequest interceptedRequest =
                GetQueryWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetQueryWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetQueryWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/GetQueryWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, GetQueryWorkRequestResponse>
                transformer =
                        GetQueryWorkRequestConverter.fromResponse(
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
    public GetScheduledTaskResponse getScheduledTask(GetScheduledTaskRequest request) {
        LOG.trace("Called getScheduledTask");
        final GetScheduledTaskRequest interceptedRequest =
                GetScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/GetScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, GetScheduledTaskResponse>
                transformer =
                        GetScheduledTaskConverter.fromResponse(
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
    public GetSourceResponse getSource(GetSourceRequest request) {
        LOG.trace("Called getSource");
        final GetSourceRequest interceptedRequest = GetSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSourceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetSource");
        java.util.function.Function<javax.ws.rs.core.Response, GetSourceResponse> transformer =
                GetSourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetSourceSummaryResponse getSourceSummary(GetSourceSummaryRequest request) {
        LOG.trace("Called getSourceSummary");
        final GetSourceSummaryRequest interceptedRequest =
                GetSourceSummaryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSourceSummaryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetSourceSummary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetSourceSummary");
        java.util.function.Function<javax.ws.rs.core.Response, GetSourceSummaryResponse>
                transformer =
                        GetSourceSummaryConverter.fromResponse(
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
    public GetStorageResponse getStorage(GetStorageRequest request) {
        LOG.trace("Called getStorage");
        final GetStorageRequest interceptedRequest = GetStorageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorage");
        java.util.function.Function<javax.ws.rs.core.Response, GetStorageResponse> transformer =
                GetStorageConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetStorageUsageResponse getStorageUsage(GetStorageUsageRequest request) {
        LOG.trace("Called getStorageUsage");
        final GetStorageUsageRequest interceptedRequest =
                GetStorageUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageUsageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetStorageUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorageUsage");
        java.util.function.Function<javax.ws.rs.core.Response, GetStorageUsageResponse>
                transformer =
                        GetStorageUsageConverter.fromResponse(
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
    public GetStorageWorkRequestResponse getStorageWorkRequest(
            GetStorageWorkRequestRequest request) {
        LOG.trace("Called getStorageWorkRequest");
        final GetStorageWorkRequestRequest interceptedRequest =
                GetStorageWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetStorageWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorageWorkRequest");
        java.util.function.Function<javax.ws.rs.core.Response, GetStorageWorkRequestResponse>
                transformer =
                        GetStorageWorkRequestConverter.fromResponse(
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
    public GetUnprocessedDataBucketResponse getUnprocessedDataBucket(
            GetUnprocessedDataBucketRequest request) {
        LOG.trace("Called getUnprocessedDataBucket");
        final GetUnprocessedDataBucketRequest interceptedRequest =
                GetUnprocessedDataBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUnprocessedDataBucketConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetUnprocessedDataBucket",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/GetUnprocessedDataBucket");
        java.util.function.Function<javax.ws.rs.core.Response, GetUnprocessedDataBucketResponse>
                transformer =
                        GetUnprocessedDataBucketConverter.fromResponse(
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
    public GetUploadResponse getUpload(GetUploadRequest request) {
        LOG.trace("Called getUpload");
        final GetUploadRequest interceptedRequest = GetUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUploadConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetUpload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/GetUpload");
        java.util.function.Function<javax.ws.rs.core.Response, GetUploadResponse> transformer =
                GetUploadConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequest/GetWorkRequest");
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
    public ImportCustomContentResponse importCustomContent(ImportCustomContentRequest request) {
        LOG.trace("Called importCustomContent");
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
                                request, ImportCustomContentRequest.builder());
            }
            final ImportCustomContentRequest interceptedRequest =
                    ImportCustomContentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    ImportCustomContentConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "ImportCustomContent",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsImportCustomContent/ImportCustomContent");
            java.util.function.Function<javax.ws.rs.core.Response, ImportCustomContentResponse>
                    transformer =
                            ImportCustomContentConverter.fromResponse(
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
                                                                .getImportCustomContentFileBody(),
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
                                                            .getImportCustomContentFileBody(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getImportCustomContentFileBody());
        }
    }

    @Override
    public ListAssociableEntitiesResponse listAssociableEntities(
            ListAssociableEntitiesRequest request) {
        LOG.trace("Called listAssociableEntities");
        final ListAssociableEntitiesRequest interceptedRequest =
                ListAssociableEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociableEntitiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListAssociableEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListAssociableEntities");
        java.util.function.Function<javax.ws.rs.core.Response, ListAssociableEntitiesResponse>
                transformer =
                        ListAssociableEntitiesConverter.fromResponse(
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
    public ListAssociatedEntitiesResponse listAssociatedEntities(
            ListAssociatedEntitiesRequest request) {
        LOG.trace("Called listAssociatedEntities");
        final ListAssociatedEntitiesRequest interceptedRequest =
                ListAssociatedEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociatedEntitiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListAssociatedEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListAssociatedEntities");
        java.util.function.Function<javax.ws.rs.core.Response, ListAssociatedEntitiesResponse>
                transformer =
                        ListAssociatedEntitiesConverter.fromResponse(
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
    public ListAutoAssociationsResponse listAutoAssociations(ListAutoAssociationsRequest request) {
        LOG.trace("Called listAutoAssociations");
        final ListAutoAssociationsRequest interceptedRequest =
                ListAutoAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutoAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListAutoAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListAutoAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, ListAutoAssociationsResponse>
                transformer =
                        ListAutoAssociationsConverter.fromResponse(
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
                        "LogAnalytics",
                        "ListCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/ListCategories");
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
    public ListConfigWorkRequestsResponse listConfigWorkRequests(
            ListConfigWorkRequestsRequest request) {
        LOG.trace("Called listConfigWorkRequests");
        final ListConfigWorkRequestsRequest interceptedRequest =
                ListConfigWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConfigWorkRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListConfigWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsConfigWorkRequest/ListConfigWorkRequests");
        java.util.function.Function<javax.ws.rs.core.Response, ListConfigWorkRequestsResponse>
                transformer =
                        ListConfigWorkRequestsConverter.fromResponse(
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
    public ListEncryptionKeyInfoResponse listEncryptionKeyInfo(
            ListEncryptionKeyInfoRequest request) {
        LOG.trace("Called listEncryptionKeyInfo");
        final ListEncryptionKeyInfoRequest interceptedRequest =
                ListEncryptionKeyInfoConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEncryptionKeyInfoConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListEncryptionKeyInfo",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListEncryptionKeyInfo");
        java.util.function.Function<javax.ws.rs.core.Response, ListEncryptionKeyInfoResponse>
                transformer =
                        ListEncryptionKeyInfoConverter.fromResponse(
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
    public ListEntityAssociationsResponse listEntityAssociations(
            ListEntityAssociationsRequest request) {
        LOG.trace("Called listEntityAssociations");
        final ListEntityAssociationsRequest interceptedRequest =
                ListEntityAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntityAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListEntityAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ListEntityAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, ListEntityAssociationsResponse>
                transformer =
                        ListEntityAssociationsConverter.fromResponse(
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
    public ListEntitySourceAssociationsResponse listEntitySourceAssociations(
            ListEntitySourceAssociationsRequest request) {
        LOG.trace("Called listEntitySourceAssociations");
        final ListEntitySourceAssociationsRequest interceptedRequest =
                ListEntitySourceAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntitySourceAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListEntitySourceAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListEntitySourceAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, ListEntitySourceAssociationsResponse>
                transformer =
                        ListEntitySourceAssociationsConverter.fromResponse(
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
    public ListFieldsResponse listFields(ListFieldsRequest request) {
        LOG.trace("Called listFields");
        final ListFieldsRequest interceptedRequest = ListFieldsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFieldsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListFields",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/ListFields");
        java.util.function.Function<javax.ws.rs.core.Response, ListFieldsResponse> transformer =
                ListFieldsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListIngestTimeRulesResponse listIngestTimeRules(ListIngestTimeRulesRequest request) {
        LOG.trace("Called listIngestTimeRules");
        final ListIngestTimeRulesRequest interceptedRequest =
                ListIngestTimeRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIngestTimeRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListIngestTimeRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/ListIngestTimeRules");
        java.util.function.Function<javax.ws.rs.core.Response, ListIngestTimeRulesResponse>
                transformer =
                        ListIngestTimeRulesConverter.fromResponse(
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
    public ListLabelPrioritiesResponse listLabelPriorities(ListLabelPrioritiesRequest request) {
        LOG.trace("Called listLabelPriorities");
        final ListLabelPrioritiesRequest interceptedRequest =
                ListLabelPrioritiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelPrioritiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLabelPriorities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabelPriorities");
        java.util.function.Function<javax.ws.rs.core.Response, ListLabelPrioritiesResponse>
                transformer =
                        ListLabelPrioritiesConverter.fromResponse(
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
    public ListLabelSourceDetailsResponse listLabelSourceDetails(
            ListLabelSourceDetailsRequest request) {
        LOG.trace("Called listLabelSourceDetails");
        final ListLabelSourceDetailsRequest interceptedRequest =
                ListLabelSourceDetailsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelSourceDetailsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLabelSourceDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabelSourceDetails");
        java.util.function.Function<javax.ws.rs.core.Response, ListLabelSourceDetailsResponse>
                transformer =
                        ListLabelSourceDetailsConverter.fromResponse(
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
    public ListLabelsResponse listLabels(ListLabelsRequest request) {
        LOG.trace("Called listLabels");
        final ListLabelsRequest interceptedRequest = ListLabelsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLabels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabels");
        java.util.function.Function<javax.ws.rs.core.Response, ListLabelsResponse> transformer =
                ListLabelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListLogAnalyticsEmBridgesResponse listLogAnalyticsEmBridges(
            ListLogAnalyticsEmBridgesRequest request) {
        LOG.trace("Called listLogAnalyticsEmBridges");
        final ListLogAnalyticsEmBridgesRequest interceptedRequest =
                ListLogAnalyticsEmBridgesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEmBridgesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEmBridges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/ListLogAnalyticsEmBridges");
        java.util.function.Function<javax.ws.rs.core.Response, ListLogAnalyticsEmBridgesResponse>
                transformer =
                        ListLogAnalyticsEmBridgesConverter.fromResponse(
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
    public ListLogAnalyticsEntitiesResponse listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request) {
        LOG.trace("Called listLogAnalyticsEntities");
        final ListLogAnalyticsEntitiesRequest interceptedRequest =
                ListLogAnalyticsEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntitiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ListLogAnalyticsEntities");
        java.util.function.Function<javax.ws.rs.core.Response, ListLogAnalyticsEntitiesResponse>
                transformer =
                        ListLogAnalyticsEntitiesConverter.fromResponse(
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
    public ListLogAnalyticsEntityTopologyResponse listLogAnalyticsEntityTopology(
            ListLogAnalyticsEntityTopologyRequest request) {
        LOG.trace("Called listLogAnalyticsEntityTopology");
        final ListLogAnalyticsEntityTopologyRequest interceptedRequest =
                ListLogAnalyticsEntityTopologyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntityTopologyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntityTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntitySummary/ListLogAnalyticsEntityTopology");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsEntityTopologyResponse>
                transformer =
                        ListLogAnalyticsEntityTopologyConverter.fromResponse(
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
    public ListLogAnalyticsEntityTypesResponse listLogAnalyticsEntityTypes(
            ListLogAnalyticsEntityTypesRequest request) {
        LOG.trace("Called listLogAnalyticsEntityTypes");
        final ListLogAnalyticsEntityTypesRequest interceptedRequest =
                ListLogAnalyticsEntityTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntityTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntityTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/ListLogAnalyticsEntityTypes");
        java.util.function.Function<javax.ws.rs.core.Response, ListLogAnalyticsEntityTypesResponse>
                transformer =
                        ListLogAnalyticsEntityTypesConverter.fromResponse(
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
    public ListLogAnalyticsLogGroupsResponse listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request) {
        LOG.trace("Called listLogAnalyticsLogGroups");
        final ListLogAnalyticsLogGroupsRequest interceptedRequest =
                ListLogAnalyticsLogGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsLogGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsLogGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/ListLogAnalyticsLogGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListLogAnalyticsLogGroupsResponse>
                transformer =
                        ListLogAnalyticsLogGroupsConverter.fromResponse(
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
    public ListLogAnalyticsObjectCollectionRulesResponse listLogAnalyticsObjectCollectionRules(
            ListLogAnalyticsObjectCollectionRulesRequest request) {
        LOG.trace("Called listLogAnalyticsObjectCollectionRules");
        final ListLogAnalyticsObjectCollectionRulesRequest interceptedRequest =
                ListLogAnalyticsObjectCollectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsObjectCollectionRulesConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsObjectCollectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/ListLogAnalyticsObjectCollectionRules");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsObjectCollectionRulesResponse>
                transformer =
                        ListLogAnalyticsObjectCollectionRulesConverter.fromResponse(
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
    public ListLogSetsResponse listLogSets(ListLogSetsRequest request) {
        LOG.trace("Called listLogSets");
        final ListLogSetsRequest interceptedRequest =
                ListLogSetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogSetsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLogSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListLogSets");
        java.util.function.Function<javax.ws.rs.core.Response, ListLogSetsResponse> transformer =
                ListLogSetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListLookupsResponse listLookups(ListLookupsRequest request) {
        LOG.trace("Called listLookups");
        final ListLookupsRequest interceptedRequest =
                ListLookupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLookupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListLookups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/ListLookups");
        java.util.function.Function<javax.ws.rs.core.Response, ListLookupsResponse> transformer =
                ListLookupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMetaSourceTypesResponse listMetaSourceTypes(ListMetaSourceTypesRequest request) {
        LOG.trace("Called listMetaSourceTypes");
        final ListMetaSourceTypesRequest interceptedRequest =
                ListMetaSourceTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMetaSourceTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListMetaSourceTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListMetaSourceTypes");
        java.util.function.Function<javax.ws.rs.core.Response, ListMetaSourceTypesResponse>
                transformer =
                        ListMetaSourceTypesConverter.fromResponse(
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
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        LOG.trace("Called listNamespaces");
        final ListNamespacesRequest interceptedRequest =
                ListNamespacesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNamespacesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListNamespaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/ListNamespaces");
        java.util.function.Function<javax.ws.rs.core.Response, ListNamespacesResponse> transformer =
                ListNamespacesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListParserFunctionsResponse listParserFunctions(ListParserFunctionsRequest request) {
        LOG.trace("Called listParserFunctions");
        final ListParserFunctionsRequest interceptedRequest =
                ListParserFunctionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParserFunctionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListParserFunctions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParserFunctions");
        java.util.function.Function<javax.ws.rs.core.Response, ListParserFunctionsResponse>
                transformer =
                        ListParserFunctionsConverter.fromResponse(
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
    public ListParserMetaPluginsResponse listParserMetaPlugins(
            ListParserMetaPluginsRequest request) {
        LOG.trace("Called listParserMetaPlugins");
        final ListParserMetaPluginsRequest interceptedRequest =
                ListParserMetaPluginsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParserMetaPluginsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListParserMetaPlugins",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParserMetaPlugins");
        java.util.function.Function<javax.ws.rs.core.Response, ListParserMetaPluginsResponse>
                transformer =
                        ListParserMetaPluginsConverter.fromResponse(
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
    public ListParsersResponse listParsers(ListParsersRequest request) {
        LOG.trace("Called listParsers");
        final ListParsersRequest interceptedRequest =
                ListParsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListParsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListParsersResponse> transformer =
                ListParsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListQueryWorkRequestsResponse listQueryWorkRequests(
            ListQueryWorkRequestsRequest request) {
        LOG.trace("Called listQueryWorkRequests");
        final ListQueryWorkRequestsRequest interceptedRequest =
                ListQueryWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListQueryWorkRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListQueryWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/ListQueryWorkRequests");
        java.util.function.Function<javax.ws.rs.core.Response, ListQueryWorkRequestsResponse>
                transformer =
                        ListQueryWorkRequestsConverter.fromResponse(
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
    public ListRecalledDataResponse listRecalledData(ListRecalledDataRequest request) {
        LOG.trace("Called listRecalledData");
        final ListRecalledDataRequest interceptedRequest =
                ListRecalledDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecalledDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListRecalledData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListRecalledData");
        java.util.function.Function<javax.ws.rs.core.Response, ListRecalledDataResponse>
                transformer =
                        ListRecalledDataConverter.fromResponse(
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
    public ListResourceCategoriesResponse listResourceCategories(
            ListResourceCategoriesRequest request) {
        LOG.trace("Called listResourceCategories");
        final ListResourceCategoriesRequest interceptedRequest =
                ListResourceCategoriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceCategoriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListResourceCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/ListResourceCategories");
        java.util.function.Function<javax.ws.rs.core.Response, ListResourceCategoriesResponse>
                transformer =
                        ListResourceCategoriesConverter.fromResponse(
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
    public ListRulesResponse listRules(ListRulesRequest request) {
        LOG.trace("Called listRules");
        final ListRulesRequest interceptedRequest = ListRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Rule/ListRules");
        java.util.function.Function<javax.ws.rs.core.Response, ListRulesResponse> transformer =
                ListRulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) {
        LOG.trace("Called listScheduledTasks");
        final ListScheduledTasksRequest interceptedRequest =
                ListScheduledTasksConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledTasksConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListScheduledTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ListScheduledTasks");
        java.util.function.Function<javax.ws.rs.core.Response, ListScheduledTasksResponse>
                transformer =
                        ListScheduledTasksConverter.fromResponse(
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
    public ListSourceAssociationsResponse listSourceAssociations(
            ListSourceAssociationsRequest request) {
        LOG.trace("Called listSourceAssociations");
        final ListSourceAssociationsRequest interceptedRequest =
                ListSourceAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourceAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListSourceAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourceAssociationsResponse>
                transformer =
                        ListSourceAssociationsConverter.fromResponse(
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
    public ListSourceEventTypesResponse listSourceEventTypes(ListSourceEventTypesRequest request) {
        LOG.trace("Called listSourceEventTypes");
        final ListSourceEventTypesRequest interceptedRequest =
                ListSourceEventTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceEventTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourceEventTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceEventTypes");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourceEventTypesResponse>
                transformer =
                        ListSourceEventTypesConverter.fromResponse(
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
    public ListSourceExtendedFieldDefinitionsResponse listSourceExtendedFieldDefinitions(
            ListSourceExtendedFieldDefinitionsRequest request) {
        LOG.trace("Called listSourceExtendedFieldDefinitions");
        final ListSourceExtendedFieldDefinitionsRequest interceptedRequest =
                ListSourceExtendedFieldDefinitionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceExtendedFieldDefinitionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourceExtendedFieldDefinitions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceExtendedFieldDefinitions");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListSourceExtendedFieldDefinitionsResponse>
                transformer =
                        ListSourceExtendedFieldDefinitionsConverter.fromResponse(
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
    public ListSourceLabelOperatorsResponse listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request) {
        LOG.trace("Called listSourceLabelOperators");
        final ListSourceLabelOperatorsRequest interceptedRequest =
                ListSourceLabelOperatorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceLabelOperatorsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourceLabelOperators",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceLabelOperators");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourceLabelOperatorsResponse>
                transformer =
                        ListSourceLabelOperatorsConverter.fromResponse(
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
    public ListSourceMetaFunctionsResponse listSourceMetaFunctions(
            ListSourceMetaFunctionsRequest request) {
        LOG.trace("Called listSourceMetaFunctions");
        final ListSourceMetaFunctionsRequest interceptedRequest =
                ListSourceMetaFunctionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceMetaFunctionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourceMetaFunctions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceMetaFunctions");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourceMetaFunctionsResponse>
                transformer =
                        ListSourceMetaFunctionsConverter.fromResponse(
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
    public ListSourcePatternsResponse listSourcePatterns(ListSourcePatternsRequest request) {
        LOG.trace("Called listSourcePatterns");
        final ListSourcePatternsRequest interceptedRequest =
                ListSourcePatternsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourcePatternsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSourcePatterns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourcePatterns");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourcePatternsResponse>
                transformer =
                        ListSourcePatternsConverter.fromResponse(
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
    public ListSourcesResponse listSources(ListSourcesRequest request) {
        LOG.trace("Called listSources");
        final ListSourcesRequest interceptedRequest =
                ListSourcesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourcesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSources");
        java.util.function.Function<javax.ws.rs.core.Response, ListSourcesResponse> transformer =
                ListSourcesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListStorageWorkRequestErrorsResponse listStorageWorkRequestErrors(
            ListStorageWorkRequestErrorsRequest request) {
        LOG.trace("Called listStorageWorkRequestErrors");
        final ListStorageWorkRequestErrorsRequest interceptedRequest =
                ListStorageWorkRequestErrorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStorageWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListStorageWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListStorageWorkRequestErrors");
        java.util.function.Function<javax.ws.rs.core.Response, ListStorageWorkRequestErrorsResponse>
                transformer =
                        ListStorageWorkRequestErrorsConverter.fromResponse(
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
    public ListStorageWorkRequestsResponse listStorageWorkRequests(
            ListStorageWorkRequestsRequest request) {
        LOG.trace("Called listStorageWorkRequests");
        final ListStorageWorkRequestsRequest interceptedRequest =
                ListStorageWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStorageWorkRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListStorageWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListStorageWorkRequests");
        java.util.function.Function<javax.ws.rs.core.Response, ListStorageWorkRequestsResponse>
                transformer =
                        ListStorageWorkRequestsConverter.fromResponse(
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
    public ListSupportedCharEncodingsResponse listSupportedCharEncodings(
            ListSupportedCharEncodingsRequest request) {
        LOG.trace("Called listSupportedCharEncodings");
        final ListSupportedCharEncodingsRequest interceptedRequest =
                ListSupportedCharEncodingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSupportedCharEncodingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSupportedCharEncodings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/CharEncodingCollection/ListSupportedCharEncodings");
        java.util.function.Function<javax.ws.rs.core.Response, ListSupportedCharEncodingsResponse>
                transformer =
                        ListSupportedCharEncodingsConverter.fromResponse(
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
    public ListSupportedTimezonesResponse listSupportedTimezones(
            ListSupportedTimezonesRequest request) {
        LOG.trace("Called listSupportedTimezones");
        final ListSupportedTimezonesRequest interceptedRequest =
                ListSupportedTimezonesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSupportedTimezonesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListSupportedTimezones",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/TimezoneCollection/ListSupportedTimezones");
        java.util.function.Function<javax.ws.rs.core.Response, ListSupportedTimezonesResponse>
                transformer =
                        ListSupportedTimezonesConverter.fromResponse(
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
    public ListUploadFilesResponse listUploadFiles(ListUploadFilesRequest request) {
        LOG.trace("Called listUploadFiles");
        final ListUploadFilesRequest interceptedRequest =
                ListUploadFilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadFilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListUploadFiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploadFiles");
        java.util.function.Function<javax.ws.rs.core.Response, ListUploadFilesResponse>
                transformer =
                        ListUploadFilesConverter.fromResponse(
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
    public ListUploadWarningsResponse listUploadWarnings(ListUploadWarningsRequest request) {
        LOG.trace("Called listUploadWarnings");
        final ListUploadWarningsRequest interceptedRequest =
                ListUploadWarningsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadWarningsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListUploadWarnings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploadWarnings");
        java.util.function.Function<javax.ws.rs.core.Response, ListUploadWarningsResponse>
                transformer =
                        ListUploadWarningsConverter.fromResponse(
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
    public ListUploadsResponse listUploads(ListUploadsRequest request) {
        LOG.trace("Called listUploads");
        final ListUploadsRequest interceptedRequest =
                ListUploadsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListUploads",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploads");
        java.util.function.Function<javax.ws.rs.core.Response, ListUploadsResponse> transformer =
                ListUploadsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListWarningsResponse listWarnings(ListWarningsRequest request) {
        LOG.trace("Called listWarnings");
        final ListWarningsRequest interceptedRequest =
                ListWarningsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWarningsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListWarnings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/ListWarnings");
        java.util.function.Function<javax.ws.rs.core.Response, ListWarningsResponse> transformer =
                ListWarningsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequestError/ListWorkRequestErrors");
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequestLog/ListWorkRequestLogs");
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequest/ListWorkRequests");
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
    public OffboardNamespaceResponse offboardNamespace(OffboardNamespaceRequest request) {
        LOG.trace("Called offboardNamespace");
        final OffboardNamespaceRequest interceptedRequest =
                OffboardNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                OffboardNamespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "OffboardNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/OffboardNamespace");
        java.util.function.Function<javax.ws.rs.core.Response, OffboardNamespaceResponse>
                transformer =
                        OffboardNamespaceConverter.fromResponse(
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
    public OnboardNamespaceResponse onboardNamespace(OnboardNamespaceRequest request) {
        LOG.trace("Called onboardNamespace");
        final OnboardNamespaceRequest interceptedRequest =
                OnboardNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                OnboardNamespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "OnboardNamespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/OnboardNamespace");
        java.util.function.Function<javax.ws.rs.core.Response, OnboardNamespaceResponse>
                transformer =
                        OnboardNamespaceConverter.fromResponse(
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
    public ParseQueryResponse parseQuery(ParseQueryRequest request) {
        LOG.trace("Called parseQuery");
        final ParseQueryRequest interceptedRequest = ParseQueryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ParseQueryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ParseQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/ParseQuery");
        java.util.function.Function<javax.ws.rs.core.Response, ParseQueryResponse> transformer =
                ParseQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getParseQueryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PauseScheduledTaskResponse pauseScheduledTask(PauseScheduledTaskRequest request) {
        LOG.trace("Called pauseScheduledTask");
        final PauseScheduledTaskRequest interceptedRequest =
                PauseScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PauseScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "PauseScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/PauseScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, PauseScheduledTaskResponse>
                transformer =
                        PauseScheduledTaskConverter.fromResponse(
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
    public PurgeStorageDataResponse purgeStorageData(PurgeStorageDataRequest request) {
        LOG.trace("Called purgeStorageData");
        final PurgeStorageDataRequest interceptedRequest =
                PurgeStorageDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeStorageDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "PurgeStorageData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/PurgeStorageData");
        java.util.function.Function<javax.ws.rs.core.Response, PurgeStorageDataResponse>
                transformer =
                        PurgeStorageDataConverter.fromResponse(
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
                                                retriedRequest.getPurgeStorageDataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutQueryWorkRequestBackgroundResponse putQueryWorkRequestBackground(
            PutQueryWorkRequestBackgroundRequest request) {
        LOG.trace("Called putQueryWorkRequestBackground");
        final PutQueryWorkRequestBackgroundRequest interceptedRequest =
                PutQueryWorkRequestBackgroundConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutQueryWorkRequestBackgroundConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "PutQueryWorkRequestBackground",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/PutQueryWorkRequestBackground");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PutQueryWorkRequestBackgroundResponse>
                transformer =
                        PutQueryWorkRequestBackgroundConverter.fromResponse(
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
                                javax.ws.rs.core.Response response = client.put(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public QueryResponse query(QueryRequest request) {
        LOG.trace("Called query");
        final QueryRequest interceptedRequest = QueryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                QueryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Query",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Query");
        java.util.function.Function<javax.ws.rs.core.Response, QueryResponse> transformer =
                QueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getQueryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RecallArchivedDataResponse recallArchivedData(RecallArchivedDataRequest request) {
        LOG.trace("Called recallArchivedData");
        final RecallArchivedDataRequest interceptedRequest =
                RecallArchivedDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecallArchivedDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "RecallArchivedData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/RecallArchivedData");
        java.util.function.Function<javax.ws.rs.core.Response, RecallArchivedDataResponse>
                transformer =
                        RecallArchivedDataConverter.fromResponse(
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
                                                retriedRequest.getRecallArchivedDataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RegisterLookupResponse registerLookup(RegisterLookupRequest request) {
        LOG.trace("Called registerLookup");
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
                                request, RegisterLookupRequest.builder());
            }
            final RegisterLookupRequest interceptedRequest =
                    RegisterLookupConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    RegisterLookupConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "RegisterLookup",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/RegisterLookup");
            java.util.function.Function<javax.ws.rs.core.Response, RegisterLookupResponse>
                    transformer =
                            RegisterLookupConverter.fromResponse(
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
                                                                .getRegisterLookupContentFileBody(),
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
                                                            .getRegisterLookupContentFileBody(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getRegisterLookupContentFileBody());
        }
    }

    @Override
    public ReleaseRecalledDataResponse releaseRecalledData(ReleaseRecalledDataRequest request) {
        LOG.trace("Called releaseRecalledData");
        final ReleaseRecalledDataRequest interceptedRequest =
                ReleaseRecalledDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReleaseRecalledDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ReleaseRecalledData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ReleaseRecalledData");
        java.util.function.Function<javax.ws.rs.core.Response, ReleaseRecalledDataResponse>
                transformer =
                        ReleaseRecalledDataConverter.fromResponse(
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
                                                retriedRequest.getReleaseRecalledDataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemoveEntityAssociationsResponse removeEntityAssociations(
            RemoveEntityAssociationsRequest request) {
        LOG.trace("Called removeEntityAssociations");
        final RemoveEntityAssociationsRequest interceptedRequest =
                RemoveEntityAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveEntityAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "RemoveEntityAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/RemoveEntityAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, RemoveEntityAssociationsResponse>
                transformer =
                        RemoveEntityAssociationsConverter.fromResponse(
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
                                                retriedRequest.getRemoveEntityAssociationsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemovePreferencesResponse removePreferences(RemovePreferencesRequest request) {
        LOG.trace("Called removePreferences");
        final RemovePreferencesRequest interceptedRequest =
                RemovePreferencesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePreferencesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "RemovePreferences",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/RemovePreferences");
        java.util.function.Function<javax.ws.rs.core.Response, RemovePreferencesResponse>
                transformer =
                        RemovePreferencesConverter.fromResponse(
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
                                                retriedRequest.getRemovePreferencesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemoveResourceCategoriesResponse removeResourceCategories(
            RemoveResourceCategoriesRequest request) {
        LOG.trace("Called removeResourceCategories");
        final RemoveResourceCategoriesRequest interceptedRequest =
                RemoveResourceCategoriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveResourceCategoriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "RemoveResourceCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/RemoveResourceCategories");
        java.util.function.Function<javax.ws.rs.core.Response, RemoveResourceCategoriesResponse>
                transformer =
                        RemoveResourceCategoriesConverter.fromResponse(
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
                                                retriedRequest.getRemoveResourceCategoriesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemoveSourceEventTypesResponse removeSourceEventTypes(
            RemoveSourceEventTypesRequest request) {
        LOG.trace("Called removeSourceEventTypes");
        final RemoveSourceEventTypesRequest interceptedRequest =
                RemoveSourceEventTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveSourceEventTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "RemoveSourceEventTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/RemoveSourceEventTypes");
        java.util.function.Function<javax.ws.rs.core.Response, RemoveSourceEventTypesResponse>
                transformer =
                        RemoveSourceEventTypesConverter.fromResponse(
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
                                                retriedRequest.getRemoveEventTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ResumeScheduledTaskResponse resumeScheduledTask(ResumeScheduledTaskRequest request) {
        LOG.trace("Called resumeScheduledTask");
        final ResumeScheduledTaskRequest interceptedRequest =
                ResumeScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ResumeScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ResumeScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, ResumeScheduledTaskResponse>
                transformer =
                        ResumeScheduledTaskConverter.fromResponse(
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
    public RunResponse run(RunRequest request) {
        LOG.trace("Called run");
        final RunRequest interceptedRequest = RunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Run",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Run");
        java.util.function.Function<javax.ws.rs.core.Response, RunResponse> transformer =
                RunConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public SetUnprocessedDataBucketResponse setUnprocessedDataBucket(
            SetUnprocessedDataBucketRequest request) {
        LOG.trace("Called setUnprocessedDataBucket");
        final SetUnprocessedDataBucketRequest interceptedRequest =
                SetUnprocessedDataBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetUnprocessedDataBucketConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "SetUnprocessedDataBucket",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/SetUnprocessedDataBucket");
        java.util.function.Function<javax.ws.rs.core.Response, SetUnprocessedDataBucketResponse>
                transformer =
                        SetUnprocessedDataBucketConverter.fromResponse(
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
    public SuggestResponse suggest(SuggestRequest request) {
        LOG.trace("Called suggest");
        final SuggestRequest interceptedRequest = SuggestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuggestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Suggest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Suggest");
        java.util.function.Function<javax.ws.rs.core.Response, SuggestResponse> transformer =
                SuggestConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getSuggestDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SuppressWarningResponse suppressWarning(SuppressWarningRequest request) {
        LOG.trace("Called suppressWarning");
        final SuppressWarningRequest interceptedRequest =
                SuppressWarningConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuppressWarningConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "SuppressWarning",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/SuppressWarning");
        java.util.function.Function<javax.ws.rs.core.Response, SuppressWarningResponse>
                transformer =
                        SuppressWarningConverter.fromResponse(
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
                                                retriedRequest.getWarningReferenceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public TestParserResponse testParser(TestParserRequest request) {
        LOG.trace("Called testParser");
        final TestParserRequest interceptedRequest = TestParserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestParserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "TestParser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/TestParser");
        java.util.function.Function<javax.ws.rs.core.Response, TestParserResponse> transformer =
                TestParserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getTestParserPayloadDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UnsuppressWarningResponse unsuppressWarning(UnsuppressWarningRequest request) {
        LOG.trace("Called unsuppressWarning");
        final UnsuppressWarningRequest interceptedRequest =
                UnsuppressWarningConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsuppressWarningConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UnsuppressWarning",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/UnsuppressWarning");
        java.util.function.Function<javax.ws.rs.core.Response, UnsuppressWarningResponse>
                transformer =
                        UnsuppressWarningConverter.fromResponse(
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
                                                retriedRequest.getWarningReferenceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateIngestTimeRuleResponse updateIngestTimeRule(UpdateIngestTimeRuleRequest request) {
        LOG.trace("Called updateIngestTimeRule");
        final UpdateIngestTimeRuleRequest interceptedRequest =
                UpdateIngestTimeRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIngestTimeRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateIngestTimeRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/UpdateIngestTimeRule");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateIngestTimeRuleResponse>
                transformer =
                        UpdateIngestTimeRuleConverter.fromResponse(
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
                                                retriedRequest.getUpdateIngestTimeRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLogAnalyticsEmBridgeResponse updateLogAnalyticsEmBridge(
            UpdateLogAnalyticsEmBridgeRequest request) {
        LOG.trace("Called updateLogAnalyticsEmBridge");
        final UpdateLogAnalyticsEmBridgeRequest interceptedRequest =
                UpdateLogAnalyticsEmBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEmBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/UpdateLogAnalyticsEmBridge");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateLogAnalyticsEmBridgeResponse>
                transformer =
                        UpdateLogAnalyticsEmBridgeConverter.fromResponse(
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
                                                        .getUpdateLogAnalyticsEmBridgeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLogAnalyticsEntityResponse updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request) {
        LOG.trace("Called updateLogAnalyticsEntity");
        final UpdateLogAnalyticsEntityRequest interceptedRequest =
                UpdateLogAnalyticsEntityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEntity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/UpdateLogAnalyticsEntity");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateLogAnalyticsEntityResponse>
                transformer =
                        UpdateLogAnalyticsEntityConverter.fromResponse(
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
                                                retriedRequest.getUpdateLogAnalyticsEntityDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLogAnalyticsEntityTypeResponse updateLogAnalyticsEntityType(
            UpdateLogAnalyticsEntityTypeRequest request) {
        LOG.trace("Called updateLogAnalyticsEntityType");
        final UpdateLogAnalyticsEntityTypeRequest interceptedRequest =
                UpdateLogAnalyticsEntityTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEntityType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/UpdateLogAnalyticsEntityType");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateLogAnalyticsEntityTypeResponse>
                transformer =
                        UpdateLogAnalyticsEntityTypeConverter.fromResponse(
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
                                                        .getUpdateLogAnalyticsEntityTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLogAnalyticsLogGroupResponse updateLogAnalyticsLogGroup(
            UpdateLogAnalyticsLogGroupRequest request) {
        LOG.trace("Called updateLogAnalyticsLogGroup");
        final UpdateLogAnalyticsLogGroupRequest interceptedRequest =
                UpdateLogAnalyticsLogGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsLogGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/UpdateLogAnalyticsLogGroup");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateLogAnalyticsLogGroupResponse>
                transformer =
                        UpdateLogAnalyticsLogGroupConverter.fromResponse(
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
                                                        .getUpdateLogAnalyticsLogGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLogAnalyticsObjectCollectionRuleResponse updateLogAnalyticsObjectCollectionRule(
            UpdateLogAnalyticsObjectCollectionRuleRequest request) {
        LOG.trace("Called updateLogAnalyticsObjectCollectionRule");
        final UpdateLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                UpdateLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsObjectCollectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/UpdateLogAnalyticsObjectCollectionRule");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsObjectCollectionRuleResponse>
                transformer =
                        UpdateLogAnalyticsObjectCollectionRuleConverter.fromResponse(
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
                                                        .getUpdateLogAnalyticsObjectCollectionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLookupResponse updateLookup(UpdateLookupRequest request) {
        LOG.trace("Called updateLookup");
        final UpdateLookupRequest interceptedRequest =
                UpdateLookupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLookupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateLookup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/UpdateLookup");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateLookupResponse> transformer =
                UpdateLookupConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateLookupMetadataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLookupDataResponse updateLookupData(UpdateLookupDataRequest request) {
        LOG.trace("Called updateLookupData");
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
                                request, UpdateLookupDataRequest.builder());
            }
            final UpdateLookupDataRequest interceptedRequest =
                    UpdateLookupDataConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UpdateLookupDataConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "UpdateLookupData",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/UpdateLookupData");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateLookupDataResponse>
                    transformer =
                            UpdateLookupDataConverter.fromResponse(
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
                                                        retriedRequest.getUpdateLookupFileBody(),
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
                                                    interceptedRequest.getUpdateLookupFileBody(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUpdateLookupFileBody());
        }
    }

    @Override
    public UpdatePreferencesResponse updatePreferences(UpdatePreferencesRequest request) {
        LOG.trace("Called updatePreferences");
        final UpdatePreferencesRequest interceptedRequest =
                UpdatePreferencesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePreferencesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdatePreferences",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/UpdatePreferences");
        java.util.function.Function<javax.ws.rs.core.Response, UpdatePreferencesResponse>
                transformer =
                        UpdatePreferencesConverter.fromResponse(
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
                                                retriedRequest.getUpdatePreferencesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateResourceCategoriesResponse updateResourceCategories(
            UpdateResourceCategoriesRequest request) {
        LOG.trace("Called updateResourceCategories");
        final UpdateResourceCategoriesRequest interceptedRequest =
                UpdateResourceCategoriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResourceCategoriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateResourceCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/UpdateResourceCategories");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateResourceCategoriesResponse>
                transformer =
                        UpdateResourceCategoriesConverter.fromResponse(
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
                                                retriedRequest.getUpdateResourceCategoriesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {
        LOG.trace("Called updateScheduledTask");
        final UpdateScheduledTaskRequest interceptedRequest =
                UpdateScheduledTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduledTaskConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateScheduledTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/UpdateScheduledTask");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateScheduledTaskResponse>
                transformer =
                        UpdateScheduledTaskConverter.fromResponse(
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
                                                retriedRequest.getUpdateScheduledTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateStorageResponse updateStorage(UpdateStorageRequest request) {
        LOG.trace("Called updateStorage");
        final UpdateStorageRequest interceptedRequest =
                UpdateStorageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStorageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpdateStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/UpdateStorage");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateStorageResponse> transformer =
                UpdateStorageConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateStorageDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UploadLogEventsFileResponse uploadLogEventsFile(UploadLogEventsFileRequest request) {
        LOG.trace("Called uploadLogEventsFile");
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
                                request, UploadLogEventsFileRequest.builder());
            }
            final UploadLogEventsFileRequest interceptedRequest =
                    UploadLogEventsFileConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UploadLogEventsFileConverter.fromRequest(client, interceptedRequest);

            ib.property(
                    com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                    com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "UploadLogEventsFile",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/UploadLogEventsFile");
            java.util.function.Function<javax.ws.rs.core.Response, UploadLogEventsFileResponse>
                    transformer =
                            UploadLogEventsFileConverter.fromResponse(
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
                                                                .getUploadLogEventsFileDetails(),
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
                                                            .getUploadLogEventsFileDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUploadLogEventsFileDetails());
        }
    }

    @Override
    public UploadLogFileResponse uploadLogFile(UploadLogFileRequest request) {
        LOG.trace("Called uploadLogFile");
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
                                request, UploadLogFileRequest.builder());
            }
            final UploadLogFileRequest interceptedRequest =
                    UploadLogFileConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UploadLogFileConverter.fromRequest(client, interceptedRequest);

            ib.property(
                    com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                    com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "LogAnalytics",
                            "UploadLogFile",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/UploadLogFile");
            java.util.function.Function<javax.ws.rs.core.Response, UploadLogFileResponse>
                    transformer =
                            UploadLogFileConverter.fromResponse(
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
                                                        retriedRequest.getUploadLogFileBody(),
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
                                                    interceptedRequest.getUploadLogFileBody(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUploadLogFileBody());
        }
    }

    @Override
    public UpsertAssociationsResponse upsertAssociations(UpsertAssociationsRequest request) {
        LOG.trace("Called upsertAssociations");
        final UpsertAssociationsRequest interceptedRequest =
                UpsertAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpsertAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/UpsertAssociations");
        java.util.function.Function<javax.ws.rs.core.Response, UpsertAssociationsResponse>
                transformer =
                        UpsertAssociationsConverter.fromResponse(
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
                                                        .getUpsertLogAnalyticsAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpsertFieldResponse upsertField(UpsertFieldRequest request) {
        LOG.trace("Called upsertField");
        final UpsertFieldRequest interceptedRequest =
                UpsertFieldConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertFieldConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpsertField",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/UpsertField");
        java.util.function.Function<javax.ws.rs.core.Response, UpsertFieldResponse> transformer =
                UpsertFieldConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpsertLogAnalyticsFieldDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpsertLabelResponse upsertLabel(UpsertLabelRequest request) {
        LOG.trace("Called upsertLabel");
        final UpsertLabelRequest interceptedRequest =
                UpsertLabelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertLabelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpsertLabel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/UpsertLabel");
        java.util.function.Function<javax.ws.rs.core.Response, UpsertLabelResponse> transformer =
                UpsertLabelConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpsertLogAnalyticsLabelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpsertParserResponse upsertParser(UpsertParserRequest request) {
        LOG.trace("Called upsertParser");
        final UpsertParserRequest interceptedRequest =
                UpsertParserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertParserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpsertParser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/UpsertParser");
        java.util.function.Function<javax.ws.rs.core.Response, UpsertParserResponse> transformer =
                UpsertParserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpsertLogAnalyticsParserDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpsertSourceResponse upsertSource(UpsertSourceRequest request) {
        LOG.trace("Called upsertSource");
        final UpsertSourceRequest interceptedRequest =
                UpsertSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertSourceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "UpsertSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/UpsertSource");
        java.util.function.Function<javax.ws.rs.core.Response, UpsertSourceResponse> transformer =
                UpsertSourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpsertLogAnalyticsSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateAssociationParametersResponse validateAssociationParameters(
            ValidateAssociationParametersRequest request) {
        LOG.trace("Called validateAssociationParameters");
        final ValidateAssociationParametersRequest interceptedRequest =
                ValidateAssociationParametersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAssociationParametersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ValidateAssociationParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ValidateAssociationParameters");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateAssociationParametersResponse>
                transformer =
                        ValidateAssociationParametersConverter.fromResponse(
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
                                                        .getUpsertLogAnalyticsAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateFileResponse validateFile(ValidateFileRequest request) {
        LOG.trace("Called validateFile");
        final ValidateFileRequest interceptedRequest =
                ValidateFileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateFileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ValidateFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ValidateFile");
        java.util.function.Function<javax.ws.rs.core.Response, ValidateFileResponse> transformer =
                ValidateFileConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ValidateSourceResponse validateSource(ValidateSourceRequest request) {
        LOG.trace("Called validateSource");
        final ValidateSourceRequest interceptedRequest =
                ValidateSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ValidateSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateSource");
        java.util.function.Function<javax.ws.rs.core.Response, ValidateSourceResponse> transformer =
                ValidateSourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpsertLogAnalyticsSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateSourceExtendedFieldDetailsResponse validateSourceExtendedFieldDetails(
            ValidateSourceExtendedFieldDetailsRequest request) {
        LOG.trace("Called validateSourceExtendedFieldDetails");
        final ValidateSourceExtendedFieldDetailsRequest interceptedRequest =
                ValidateSourceExtendedFieldDetailsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceExtendedFieldDetailsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ValidateSourceExtendedFieldDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateSourceExtendedFieldDetails");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateSourceExtendedFieldDetailsResponse>
                transformer =
                        ValidateSourceExtendedFieldDetailsConverter.fromResponse(
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
                                                retriedRequest.getLogAnalyticsSource(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateSourceMappingResponse validateSourceMapping(
            ValidateSourceMappingRequest request) {
        LOG.trace("Called validateSourceMapping");
        final ValidateSourceMappingRequest interceptedRequest =
                ValidateSourceMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "ValidateSourceMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ValidateSourceMapping");
        java.util.function.Function<javax.ws.rs.core.Response, ValidateSourceMappingResponse>
                transformer =
                        ValidateSourceMappingConverter.fromResponse(
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
    public VerifyResponse verify(VerifyRequest request) {
        LOG.trace("Called verify");
        final VerifyRequest interceptedRequest = VerifyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                VerifyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LogAnalytics",
                        "Verify",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Verify");
        java.util.function.Function<javax.ws.rs.core.Response, VerifyResponse> transformer =
                VerifyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public LogAnalyticsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LogAnalyticsPaginators getPaginators() {
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
