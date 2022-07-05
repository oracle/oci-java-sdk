/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.internal.http.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;
import javax.annotation.Nonnull;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperationsInsightsClient implements OperationsInsights {
    /**
     * Service instance for OperationsInsights.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATIONSINSIGHTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operationsinsights.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperationsInsightsAsyncClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final OperationsInsightsWaiters waiters;

    private final OperationsInsightsPaginators paginators;
    private final com.oracle.bmc.http.internal.RestClient client;
    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;
    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public OperationsInsightsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    public OperationsInsightsClient(
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
    protected OperationsInsightsClient(
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
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
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
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        final com.oracle.bmc.ClientConfiguration clientConfigurationToUse =
                (configuration != null)
                        ? configuration
                        : com.oracle.bmc.ClientConfiguration.builder().build();
        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(configuration);
        if (circuitBreakerConfiguration == null) {
            circuitBreakerConfiguration = CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        clientConfigurationToUse,
                        isNonBufferingApacheClient,
                        null,
                        circuitBreakerConfiguration);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            new com.google.common.util.concurrent.ThreadFactoryBuilder()
                                    .setDaemon(true)
                                    .setNameFormat("OperationsInsights-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OperationsInsightsWaiters(executorService, this);

        this.paginators = new OperationsInsightsPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OperationsInsightsClient> {
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
        public OperationsInsightsClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new OperationsInsightsClient(
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
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
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
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
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
    public AddExadataInsightMembersResponse addExadataInsightMembers(
            AddExadataInsightMembersRequest request) {
        LOG.trace("Called addExadataInsightMembers");
        final AddExadataInsightMembersRequest interceptedRequest =
                AddExadataInsightMembersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddExadataInsightMembersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "AddExadataInsightMembers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/AddExadataInsightMembers");
        com.google.common.base.Function<javax.ws.rs.core.Response, AddExadataInsightMembersResponse>
                transformer =
                        AddExadataInsightMembersConverter.fromResponse(
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
                                                retriedRequest.getAddExadataInsightMembersDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeDatabaseInsightCompartmentResponse changeDatabaseInsightCompartment(
            ChangeDatabaseInsightCompartmentRequest request) {
        LOG.trace("Called changeDatabaseInsightCompartment");
        final ChangeDatabaseInsightCompartmentRequest interceptedRequest =
                ChangeDatabaseInsightCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseInsightCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangeDatabaseInsightCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ChangeDatabaseInsightCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseInsightCompartmentResponse>
                transformer =
                        ChangeDatabaseInsightCompartmentConverter.fromResponse(
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
                                                        .getChangeDatabaseInsightCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeEnterpriseManagerBridgeCompartmentResponse
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request) {
        LOG.trace("Called changeEnterpriseManagerBridgeCompartment");
        final ChangeEnterpriseManagerBridgeCompartmentRequest interceptedRequest =
                ChangeEnterpriseManagerBridgeCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeEnterpriseManagerBridgeCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangeEnterpriseManagerBridgeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ChangeEnterpriseManagerBridgeCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeEnterpriseManagerBridgeCompartmentResponse>
                transformer =
                        ChangeEnterpriseManagerBridgeCompartmentConverter.fromResponse(
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
                                                        .getChangeEnterpriseManagerBridgeCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeExadataInsightCompartmentResponse changeExadataInsightCompartment(
            ChangeExadataInsightCompartmentRequest request) {
        LOG.trace("Called changeExadataInsightCompartment");
        final ChangeExadataInsightCompartmentRequest interceptedRequest =
                ChangeExadataInsightCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExadataInsightCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangeExadataInsightCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ChangeExadataInsightCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeExadataInsightCompartmentResponse>
                transformer =
                        ChangeExadataInsightCompartmentConverter.fromResponse(
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
                                                        .getChangeExadataInsightCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeHostInsightCompartmentResponse changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request) {
        LOG.trace("Called changeHostInsightCompartment");
        final ChangeHostInsightCompartmentRequest interceptedRequest =
                ChangeHostInsightCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeHostInsightCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangeHostInsightCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ChangeHostInsightCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeHostInsightCompartmentResponse>
                transformer =
                        ChangeHostInsightCompartmentConverter.fromResponse(
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
                                                        .getChangeHostInsightCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeOperationsInsightsPrivateEndpointCompartmentResponse
            changeOperationsInsightsPrivateEndpointCompartment(
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest request) {
        LOG.trace("Called changeOperationsInsightsPrivateEndpointCompartment");
        final ChangeOperationsInsightsPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeOperationsInsightsPrivateEndpointCompartmentConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOperationsInsightsPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangeOperationsInsightsPrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/ChangeOperationsInsightsPrivateEndpointCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeOperationsInsightsPrivateEndpointCompartmentResponse>
                transformer =
                        ChangeOperationsInsightsPrivateEndpointCompartmentConverter.fromResponse(
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
                                                        .getChangeOperationsInsightsPrivateEndpointCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangePeComanagedDatabaseInsightResponse changePeComanagedDatabaseInsight(
            ChangePeComanagedDatabaseInsightRequest request) {
        LOG.trace("Called changePeComanagedDatabaseInsight");
        final ChangePeComanagedDatabaseInsightRequest interceptedRequest =
                ChangePeComanagedDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePeComanagedDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ChangePeComanagedDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ChangePeComanagedDatabaseInsight");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangePeComanagedDatabaseInsightResponse>
                transformer =
                        ChangePeComanagedDatabaseInsightConverter.fromResponse(
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
                                                        .getChangePeComanagedDatabaseInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAwrHubResponse createAwrHub(CreateAwrHubRequest request) {
        LOG.trace("Called createAwrHub");
        final CreateAwrHubRequest interceptedRequest =
                CreateAwrHubConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAwrHubConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateAwrHub",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/CreateAwrHub");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateAwrHubResponse>
                transformer =
                        CreateAwrHubConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateAwrHubDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDatabaseInsightResponse createDatabaseInsight(
            CreateDatabaseInsightRequest request) {
        LOG.trace("Called createDatabaseInsight");
        final CreateDatabaseInsightRequest interceptedRequest =
                CreateDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/CreateDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDatabaseInsightResponse>
                transformer =
                        CreateDatabaseInsightConverter.fromResponse(
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
                                                retriedRequest.getCreateDatabaseInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateEnterpriseManagerBridgeResponse createEnterpriseManagerBridge(
            CreateEnterpriseManagerBridgeRequest request) {
        LOG.trace("Called createEnterpriseManagerBridge");
        final CreateEnterpriseManagerBridgeRequest interceptedRequest =
                CreateEnterpriseManagerBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateEnterpriseManagerBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/CreateEnterpriseManagerBridge");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateEnterpriseManagerBridgeResponse>
                transformer =
                        CreateEnterpriseManagerBridgeConverter.fromResponse(
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
                                                        .getCreateEnterpriseManagerBridgeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExadataInsightResponse createExadataInsight(CreateExadataInsightRequest request) {
        LOG.trace("Called createExadataInsight");
        final CreateExadataInsightRequest interceptedRequest =
                CreateExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/CreateExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateExadataInsightResponse>
                transformer =
                        CreateExadataInsightConverter.fromResponse(
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
                                                retriedRequest.getCreateExadataInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateHostInsightResponse createHostInsight(CreateHostInsightRequest request) {
        LOG.trace("Called createHostInsight");
        final CreateHostInsightRequest interceptedRequest =
                CreateHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/CreateHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateHostInsightResponse>
                transformer =
                        CreateHostInsightConverter.fromResponse(
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
                                                retriedRequest.getCreateHostInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOperationsInsightsPrivateEndpointResponse createOperationsInsightsPrivateEndpoint(
            CreateOperationsInsightsPrivateEndpointRequest request) {
        LOG.trace("Called createOperationsInsightsPrivateEndpoint");
        final CreateOperationsInsightsPrivateEndpointRequest interceptedRequest =
                CreateOperationsInsightsPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOperationsInsightsPrivateEndpointConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/CreateOperationsInsightsPrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOperationsInsightsPrivateEndpointResponse>
                transformer =
                        CreateOperationsInsightsPrivateEndpointConverter.fromResponse(
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
                                                        .getCreateOperationsInsightsPrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOperationsInsightsWarehouseResponse createOperationsInsightsWarehouse(
            CreateOperationsInsightsWarehouseRequest request) {
        LOG.trace("Called createOperationsInsightsWarehouse");
        final CreateOperationsInsightsWarehouseRequest interceptedRequest =
                CreateOperationsInsightsWarehouseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOperationsInsightsWarehouseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsWarehouse",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/CreateOperationsInsightsWarehouse");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOperationsInsightsWarehouseResponse>
                transformer =
                        CreateOperationsInsightsWarehouseConverter.fromResponse(
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
                                                        .getCreateOperationsInsightsWarehouseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOperationsInsightsWarehouseUserResponse createOperationsInsightsWarehouseUser(
            CreateOperationsInsightsWarehouseUserRequest request) {
        LOG.trace("Called createOperationsInsightsWarehouseUser");
        final CreateOperationsInsightsWarehouseUserRequest interceptedRequest =
                CreateOperationsInsightsWarehouseUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOperationsInsightsWarehouseUserConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "CreateOperationsInsightsWarehouseUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/CreateOperationsInsightsWarehouseUser");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOperationsInsightsWarehouseUserResponse>
                transformer =
                        CreateOperationsInsightsWarehouseUserConverter.fromResponse(
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
                                                        .getCreateOperationsInsightsWarehouseUserDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteAwrHubResponse deleteAwrHub(DeleteAwrHubRequest request) {
        LOG.trace("Called deleteAwrHub");
        final DeleteAwrHubRequest interceptedRequest =
                DeleteAwrHubConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAwrHubConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteAwrHub",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/DeleteAwrHub");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAwrHubResponse>
                transformer =
                        DeleteAwrHubConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteDatabaseInsightResponse deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request) {
        LOG.trace("Called deleteDatabaseInsight");
        final DeleteDatabaseInsightRequest interceptedRequest =
                DeleteDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/DeleteDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDatabaseInsightResponse>
                transformer =
                        DeleteDatabaseInsightConverter.fromResponse(
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
    public DeleteEnterpriseManagerBridgeResponse deleteEnterpriseManagerBridge(
            DeleteEnterpriseManagerBridgeRequest request) {
        LOG.trace("Called deleteEnterpriseManagerBridge");
        final DeleteEnterpriseManagerBridgeRequest interceptedRequest =
                DeleteEnterpriseManagerBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteEnterpriseManagerBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/DeleteEnterpriseManagerBridge");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteEnterpriseManagerBridgeResponse>
                transformer =
                        DeleteEnterpriseManagerBridgeConverter.fromResponse(
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
    public DeleteExadataInsightResponse deleteExadataInsight(DeleteExadataInsightRequest request) {
        LOG.trace("Called deleteExadataInsight");
        final DeleteExadataInsightRequest interceptedRequest =
                DeleteExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/DeleteExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteExadataInsightResponse>
                transformer =
                        DeleteExadataInsightConverter.fromResponse(
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
    public DeleteHostInsightResponse deleteHostInsight(DeleteHostInsightRequest request) {
        LOG.trace("Called deleteHostInsight");
        final DeleteHostInsightRequest interceptedRequest =
                DeleteHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/DeleteHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteHostInsightResponse>
                transformer =
                        DeleteHostInsightConverter.fromResponse(
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
    public DeleteOperationsInsightsPrivateEndpointResponse deleteOperationsInsightsPrivateEndpoint(
            DeleteOperationsInsightsPrivateEndpointRequest request) {
        LOG.trace("Called deleteOperationsInsightsPrivateEndpoint");
        final DeleteOperationsInsightsPrivateEndpointRequest interceptedRequest =
                DeleteOperationsInsightsPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOperationsInsightsPrivateEndpointConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/DeleteOperationsInsightsPrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOperationsInsightsPrivateEndpointResponse>
                transformer =
                        DeleteOperationsInsightsPrivateEndpointConverter.fromResponse(
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
    public DeleteOperationsInsightsWarehouseResponse deleteOperationsInsightsWarehouse(
            DeleteOperationsInsightsWarehouseRequest request) {
        LOG.trace("Called deleteOperationsInsightsWarehouse");
        final DeleteOperationsInsightsWarehouseRequest interceptedRequest =
                DeleteOperationsInsightsWarehouseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOperationsInsightsWarehouseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsWarehouse",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/DeleteOperationsInsightsWarehouse");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOperationsInsightsWarehouseResponse>
                transformer =
                        DeleteOperationsInsightsWarehouseConverter.fromResponse(
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
    public DeleteOperationsInsightsWarehouseUserResponse deleteOperationsInsightsWarehouseUser(
            DeleteOperationsInsightsWarehouseUserRequest request) {
        LOG.trace("Called deleteOperationsInsightsWarehouseUser");
        final DeleteOperationsInsightsWarehouseUserRequest interceptedRequest =
                DeleteOperationsInsightsWarehouseUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOperationsInsightsWarehouseUserConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DeleteOperationsInsightsWarehouseUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/DeleteOperationsInsightsWarehouseUser");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOperationsInsightsWarehouseUserResponse>
                transformer =
                        DeleteOperationsInsightsWarehouseUserConverter.fromResponse(
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
    public DisableDatabaseInsightResponse disableDatabaseInsight(
            DisableDatabaseInsightRequest request) {
        LOG.trace("Called disableDatabaseInsight");
        final DisableDatabaseInsightRequest interceptedRequest =
                DisableDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DisableDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/DisableDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DisableDatabaseInsightResponse>
                transformer =
                        DisableDatabaseInsightConverter.fromResponse(
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
    public DisableExadataInsightResponse disableExadataInsight(
            DisableExadataInsightRequest request) {
        LOG.trace("Called disableExadataInsight");
        final DisableExadataInsightRequest interceptedRequest =
                DisableExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DisableExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/DisableExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DisableExadataInsightResponse>
                transformer =
                        DisableExadataInsightConverter.fromResponse(
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
    public DisableHostInsightResponse disableHostInsight(DisableHostInsightRequest request) {
        LOG.trace("Called disableHostInsight");
        final DisableHostInsightRequest interceptedRequest =
                DisableHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DisableHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/DisableHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, DisableHostInsightResponse>
                transformer =
                        DisableHostInsightConverter.fromResponse(
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
    public DownloadOperationsInsightsWarehouseWalletResponse
            downloadOperationsInsightsWarehouseWallet(
                    DownloadOperationsInsightsWarehouseWalletRequest request) {
        LOG.trace("Called downloadOperationsInsightsWarehouseWallet");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadOperationsInsightsWarehouseWallet returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadOperationsInsightsWarehouseWalletRequest interceptedRequest =
                DownloadOperationsInsightsWarehouseWalletConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadOperationsInsightsWarehouseWalletConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "DownloadOperationsInsightsWarehouseWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/DownloadOperationsInsightsWarehouseWallet");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DownloadOperationsInsightsWarehouseWalletResponse>
                transformer =
                        DownloadOperationsInsightsWarehouseWalletConverter.fromResponse(
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
                                                        .getDownloadOperationsInsightsWarehouseWalletDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableDatabaseInsightResponse enableDatabaseInsight(
            EnableDatabaseInsightRequest request) {
        LOG.trace("Called enableDatabaseInsight");
        final EnableDatabaseInsightRequest interceptedRequest =
                EnableDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "EnableDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/EnableDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, EnableDatabaseInsightResponse>
                transformer =
                        EnableDatabaseInsightConverter.fromResponse(
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
                                                retriedRequest.getEnableDatabaseInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExadataInsightResponse enableExadataInsight(EnableExadataInsightRequest request) {
        LOG.trace("Called enableExadataInsight");
        final EnableExadataInsightRequest interceptedRequest =
                EnableExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "EnableExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/EnableExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, EnableExadataInsightResponse>
                transformer =
                        EnableExadataInsightConverter.fromResponse(
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
                                                retriedRequest.getEnableExadataInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableHostInsightResponse enableHostInsight(EnableHostInsightRequest request) {
        LOG.trace("Called enableHostInsight");
        final EnableHostInsightRequest interceptedRequest =
                EnableHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "EnableHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/EnableHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, EnableHostInsightResponse>
                transformer =
                        EnableHostInsightConverter.fromResponse(
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
                                                retriedRequest.getEnableHostInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetAwrHubResponse getAwrHub(GetAwrHubRequest request) {
        LOG.trace("Called getAwrHub");
        final GetAwrHubRequest interceptedRequest = GetAwrHubConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrHubConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetAwrHub",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrHub");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAwrHubResponse> transformer =
                GetAwrHubConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAwrReportResponse getAwrReport(GetAwrReportRequest request) {
        LOG.trace("Called getAwrReport");
        final GetAwrReportRequest interceptedRequest =
                GetAwrReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetAwrReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/GetAwrReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAwrReportResponse>
                transformer =
                        GetAwrReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetDatabaseInsightResponse getDatabaseInsight(GetDatabaseInsightRequest request) {
        LOG.trace("Called getDatabaseInsight");
        final GetDatabaseInsightRequest interceptedRequest =
                GetDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/GetDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseInsightResponse>
                transformer =
                        GetDatabaseInsightConverter.fromResponse(
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
    public GetEnterpriseManagerBridgeResponse getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request) {
        LOG.trace("Called getEnterpriseManagerBridge");
        final GetEnterpriseManagerBridgeRequest interceptedRequest =
                GetEnterpriseManagerBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetEnterpriseManagerBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/GetEnterpriseManagerBridge");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetEnterpriseManagerBridgeResponse>
                transformer =
                        GetEnterpriseManagerBridgeConverter.fromResponse(
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
    public GetExadataInsightResponse getExadataInsight(GetExadataInsightRequest request) {
        LOG.trace("Called getExadataInsight");
        final GetExadataInsightRequest interceptedRequest =
                GetExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/GetExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetExadataInsightResponse>
                transformer =
                        GetExadataInsightConverter.fromResponse(
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
    public GetHostInsightResponse getHostInsight(GetHostInsightRequest request) {
        LOG.trace("Called getHostInsight");
        final GetHostInsightRequest interceptedRequest =
                GetHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/GetHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetHostInsightResponse>
                transformer =
                        GetHostInsightConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetOperationsInsightsPrivateEndpointResponse getOperationsInsightsPrivateEndpoint(
            GetOperationsInsightsPrivateEndpointRequest request) {
        LOG.trace("Called getOperationsInsightsPrivateEndpoint");
        final GetOperationsInsightsPrivateEndpointRequest interceptedRequest =
                GetOperationsInsightsPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOperationsInsightsPrivateEndpointConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/GetOperationsInsightsPrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetOperationsInsightsPrivateEndpointResponse>
                transformer =
                        GetOperationsInsightsPrivateEndpointConverter.fromResponse(
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
    public GetOperationsInsightsWarehouseResponse getOperationsInsightsWarehouse(
            GetOperationsInsightsWarehouseRequest request) {
        LOG.trace("Called getOperationsInsightsWarehouse");
        final GetOperationsInsightsWarehouseRequest interceptedRequest =
                GetOperationsInsightsWarehouseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOperationsInsightsWarehouseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsWarehouse",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/GetOperationsInsightsWarehouse");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetOperationsInsightsWarehouseResponse>
                transformer =
                        GetOperationsInsightsWarehouseConverter.fromResponse(
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
    public GetOperationsInsightsWarehouseUserResponse getOperationsInsightsWarehouseUser(
            GetOperationsInsightsWarehouseUserRequest request) {
        LOG.trace("Called getOperationsInsightsWarehouseUser");
        final GetOperationsInsightsWarehouseUserRequest interceptedRequest =
                GetOperationsInsightsWarehouseUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOperationsInsightsWarehouseUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetOperationsInsightsWarehouseUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/GetOperationsInsightsWarehouseUser");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetOperationsInsightsWarehouseUserResponse>
                transformer =
                        GetOperationsInsightsWarehouseUserConverter.fromResponse(
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
    public GetOpsiDataObjectResponse getOpsiDataObject(GetOpsiDataObjectRequest request) {
        LOG.trace("Called getOpsiDataObject");
        final GetOpsiDataObjectRequest interceptedRequest =
                GetOpsiDataObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOpsiDataObjectConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "GetOpsiDataObject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/GetOpsiDataObject");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetOpsiDataObjectResponse>
                transformer =
                        GetOpsiDataObjectConverter.fromResponse(
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
                        "OperationsInsights",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/GetWorkRequest");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer =
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
    public IngestDatabaseConfigurationResponse ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request) {
        LOG.trace("Called ingestDatabaseConfiguration");
        final IngestDatabaseConfigurationRequest interceptedRequest =
                IngestDatabaseConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestDatabaseConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestDatabaseConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestDatabaseConfiguration");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, IngestDatabaseConfigurationResponse>
                transformer =
                        IngestDatabaseConfigurationConverter.fromResponse(
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
                                                        .getIngestDatabaseConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestHostConfigurationResponse ingestHostConfiguration(
            IngestHostConfigurationRequest request) {
        LOG.trace("Called ingestHostConfiguration");
        final IngestHostConfigurationRequest interceptedRequest =
                IngestHostConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestHostConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestHostConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/IngestHostConfiguration");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestHostConfigurationResponse>
                transformer =
                        IngestHostConfigurationConverter.fromResponse(
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
                                                retriedRequest.getIngestHostConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestHostMetricsResponse ingestHostMetrics(IngestHostMetricsRequest request) {
        LOG.trace("Called ingestHostMetrics");
        final IngestHostMetricsRequest interceptedRequest =
                IngestHostMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestHostMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestHostMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/IngestHostMetrics");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestHostMetricsResponse>
                transformer =
                        IngestHostMetricsConverter.fromResponse(
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
                                                retriedRequest.getIngestHostMetricsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestSqlBucketResponse ingestSqlBucket(IngestSqlBucketRequest request) {
        LOG.trace("Called ingestSqlBucket");
        final IngestSqlBucketRequest interceptedRequest =
                IngestSqlBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlBucketConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestSqlBucket",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlBucket");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlBucketResponse>
                transformer =
                        IngestSqlBucketConverter.fromResponse(
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
                                                retriedRequest.getIngestSqlBucketDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestSqlPlanLinesResponse ingestSqlPlanLines(IngestSqlPlanLinesRequest request) {
        LOG.trace("Called ingestSqlPlanLines");
        final IngestSqlPlanLinesRequest interceptedRequest =
                IngestSqlPlanLinesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlPlanLinesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestSqlPlanLines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlPlanLines");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlPlanLinesResponse>
                transformer =
                        IngestSqlPlanLinesConverter.fromResponse(
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
                                                retriedRequest.getIngestSqlPlanLinesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestSqlStatsResponse ingestSqlStats(IngestSqlStatsRequest request) {
        LOG.trace("Called ingestSqlStats");
        final IngestSqlStatsRequest interceptedRequest =
                IngestSqlStatsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlStatsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestSqlStats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlStats");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlStatsResponse>
                transformer =
                        IngestSqlStatsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getIngestSqlStatsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestSqlTextResponse ingestSqlText(IngestSqlTextRequest request) {
        LOG.trace("Called ingestSqlText");
        final IngestSqlTextRequest interceptedRequest =
                IngestSqlTextConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlTextConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "IngestSqlText",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/IngestSqlText");
        com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlTextResponse>
                transformer =
                        IngestSqlTextConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getIngestSqlTextDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListAwrHubsResponse listAwrHubs(ListAwrHubsRequest request) {
        LOG.trace("Called listAwrHubs");
        final ListAwrHubsRequest interceptedRequest =
                ListAwrHubsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrHubsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListAwrHubs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrHubs");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAwrHubsResponse>
                transformer =
                        ListAwrHubsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAwrSnapshotsResponse listAwrSnapshots(ListAwrSnapshotsRequest request) {
        LOG.trace("Called listAwrSnapshots");
        final ListAwrSnapshotsRequest interceptedRequest =
                ListAwrSnapshotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrSnapshotsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListAwrSnapshots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/ListAwrSnapshots");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAwrSnapshotsResponse>
                transformer =
                        ListAwrSnapshotsConverter.fromResponse(
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
    public ListDatabaseConfigurationsResponse listDatabaseConfigurations(
            ListDatabaseConfigurationsRequest request) {
        LOG.trace("Called listDatabaseConfigurations");
        final ListDatabaseConfigurationsRequest interceptedRequest =
                ListDatabaseConfigurationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseConfigurationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListDatabaseConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListDatabaseConfigurations");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseConfigurationsResponse>
                transformer =
                        ListDatabaseConfigurationsConverter.fromResponse(
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
    public ListDatabaseInsightsResponse listDatabaseInsights(ListDatabaseInsightsRequest request) {
        LOG.trace("Called listDatabaseInsights");
        final ListDatabaseInsightsRequest interceptedRequest =
                ListDatabaseInsightsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseInsightsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListDatabaseInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListDatabaseInsights");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDatabaseInsightsResponse>
                transformer =
                        ListDatabaseInsightsConverter.fromResponse(
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
    public ListEnterpriseManagerBridgesResponse listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request) {
        LOG.trace("Called listEnterpriseManagerBridges");
        final ListEnterpriseManagerBridgesRequest interceptedRequest =
                ListEnterpriseManagerBridgesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEnterpriseManagerBridgesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListEnterpriseManagerBridges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ListEnterpriseManagerBridges");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListEnterpriseManagerBridgesResponse>
                transformer =
                        ListEnterpriseManagerBridgesConverter.fromResponse(
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
    public ListExadataConfigurationsResponse listExadataConfigurations(
            ListExadataConfigurationsRequest request) {
        LOG.trace("Called listExadataConfigurations");
        final ListExadataConfigurationsRequest interceptedRequest =
                ListExadataConfigurationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExadataConfigurationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListExadataConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ListExadataConfigurations");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExadataConfigurationsResponse>
                transformer =
                        ListExadataConfigurationsConverter.fromResponse(
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
    public ListExadataInsightsResponse listExadataInsights(ListExadataInsightsRequest request) {
        LOG.trace("Called listExadataInsights");
        final ListExadataInsightsRequest interceptedRequest =
                ListExadataInsightsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExadataInsightsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListExadataInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/ListExadataInsights");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListExadataInsightsResponse>
                transformer =
                        ListExadataInsightsConverter.fromResponse(
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
    public ListHostConfigurationsResponse listHostConfigurations(
            ListHostConfigurationsRequest request) {
        LOG.trace("Called listHostConfigurations");
        final ListHostConfigurationsRequest interceptedRequest =
                ListHostConfigurationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostConfigurationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListHostConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostConfigurations");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListHostConfigurationsResponse>
                transformer =
                        ListHostConfigurationsConverter.fromResponse(
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
    public ListHostInsightsResponse listHostInsights(ListHostInsightsRequest request) {
        LOG.trace("Called listHostInsights");
        final ListHostInsightsRequest interceptedRequest =
                ListHostInsightsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostInsightsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListHostInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostInsights");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListHostInsightsResponse>
                transformer =
                        ListHostInsightsConverter.fromResponse(
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
    public ListHostedEntitiesResponse listHostedEntities(ListHostedEntitiesRequest request) {
        LOG.trace("Called listHostedEntities");
        final ListHostedEntitiesRequest interceptedRequest =
                ListHostedEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostedEntitiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListHostedEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListHostedEntities");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListHostedEntitiesResponse>
                transformer =
                        ListHostedEntitiesConverter.fromResponse(
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
    public ListImportableAgentEntitiesResponse listImportableAgentEntities(
            ListImportableAgentEntitiesRequest request) {
        LOG.trace("Called listImportableAgentEntities");
        final ListImportableAgentEntitiesRequest interceptedRequest =
                ListImportableAgentEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImportableAgentEntitiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListImportableAgentEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/ListImportableAgentEntities");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListImportableAgentEntitiesResponse>
                transformer =
                        ListImportableAgentEntitiesConverter.fromResponse(
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
    public ListImportableEnterpriseManagerEntitiesResponse listImportableEnterpriseManagerEntities(
            ListImportableEnterpriseManagerEntitiesRequest request) {
        LOG.trace("Called listImportableEnterpriseManagerEntities");
        final ListImportableEnterpriseManagerEntitiesRequest interceptedRequest =
                ListImportableEnterpriseManagerEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImportableEnterpriseManagerEntitiesConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListImportableEnterpriseManagerEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/ListImportableEnterpriseManagerEntities");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListImportableEnterpriseManagerEntitiesResponse>
                transformer =
                        ListImportableEnterpriseManagerEntitiesConverter.fromResponse(
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
    public ListOperationsInsightsPrivateEndpointsResponse listOperationsInsightsPrivateEndpoints(
            ListOperationsInsightsPrivateEndpointsRequest request) {
        LOG.trace("Called listOperationsInsightsPrivateEndpoints");
        final ListOperationsInsightsPrivateEndpointsRequest interceptedRequest =
                ListOperationsInsightsPrivateEndpointsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOperationsInsightsPrivateEndpointsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsPrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/ListOperationsInsightsPrivateEndpoints");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOperationsInsightsPrivateEndpointsResponse>
                transformer =
                        ListOperationsInsightsPrivateEndpointsConverter.fromResponse(
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
    public ListOperationsInsightsWarehouseUsersResponse listOperationsInsightsWarehouseUsers(
            ListOperationsInsightsWarehouseUsersRequest request) {
        LOG.trace("Called listOperationsInsightsWarehouseUsers");
        final ListOperationsInsightsWarehouseUsersRequest interceptedRequest =
                ListOperationsInsightsWarehouseUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOperationsInsightsWarehouseUsersConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsWarehouseUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/ListOperationsInsightsWarehouseUsers");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOperationsInsightsWarehouseUsersResponse>
                transformer =
                        ListOperationsInsightsWarehouseUsersConverter.fromResponse(
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
    public ListOperationsInsightsWarehousesResponse listOperationsInsightsWarehouses(
            ListOperationsInsightsWarehousesRequest request) {
        LOG.trace("Called listOperationsInsightsWarehouses");
        final ListOperationsInsightsWarehousesRequest interceptedRequest =
                ListOperationsInsightsWarehousesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOperationsInsightsWarehousesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListOperationsInsightsWarehouses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/ListOperationsInsightsWarehouses");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOperationsInsightsWarehousesResponse>
                transformer =
                        ListOperationsInsightsWarehousesConverter.fromResponse(
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
    public ListOpsiDataObjectsResponse listOpsiDataObjects(ListOpsiDataObjectsRequest request) {
        LOG.trace("Called listOpsiDataObjects");
        final ListOpsiDataObjectsRequest interceptedRequest =
                ListOpsiDataObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOpsiDataObjectsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListOpsiDataObjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/ListOpsiDataObjects");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListOpsiDataObjectsResponse>
                transformer =
                        ListOpsiDataObjectsConverter.fromResponse(
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
    public ListSqlPlansResponse listSqlPlans(ListSqlPlansRequest request) {
        LOG.trace("Called listSqlPlans");
        final ListSqlPlansRequest interceptedRequest =
                ListSqlPlansConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlansConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListSqlPlans",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlPlans");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlPlansResponse>
                transformer =
                        ListSqlPlansConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSqlSearchesResponse listSqlSearches(ListSqlSearchesRequest request) {
        LOG.trace("Called listSqlSearches");
        final ListSqlSearchesRequest interceptedRequest =
                ListSqlSearchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlSearchesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListSqlSearches",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlSearches");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlSearchesResponse>
                transformer =
                        ListSqlSearchesConverter.fromResponse(
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
    public ListSqlTextsResponse listSqlTexts(ListSqlTextsRequest request) {
        LOG.trace("Called listSqlTexts");
        final ListSqlTextsRequest interceptedRequest =
                ListSqlTextsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlTextsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "ListSqlTexts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/ListSqlTexts");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlTextsResponse>
                transformer =
                        ListSqlTextsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        "OperationsInsights",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequestErrors");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
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
                        "OperationsInsights",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequestLogs");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
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
                        "OperationsInsights",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/WorkRequests/ListWorkRequests");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
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
    public QueryOpsiDataObjectDataResponse queryOpsiDataObjectData(
            QueryOpsiDataObjectDataRequest request) {
        LOG.trace("Called queryOpsiDataObjectData");
        final QueryOpsiDataObjectDataRequest interceptedRequest =
                QueryOpsiDataObjectDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                QueryOpsiDataObjectDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "QueryOpsiDataObjectData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OpsiDataObjects/QueryOpsiDataObjectData");
        com.google.common.base.Function<javax.ws.rs.core.Response, QueryOpsiDataObjectDataResponse>
                transformer =
                        QueryOpsiDataObjectDataConverter.fromResponse(
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
                                                retriedRequest.getQueryOpsiDataObjectDataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RotateOperationsInsightsWarehouseWalletResponse rotateOperationsInsightsWarehouseWallet(
            RotateOperationsInsightsWarehouseWalletRequest request) {
        LOG.trace("Called rotateOperationsInsightsWarehouseWallet");
        final RotateOperationsInsightsWarehouseWalletRequest interceptedRequest =
                RotateOperationsInsightsWarehouseWalletConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateOperationsInsightsWarehouseWalletConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "RotateOperationsInsightsWarehouseWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/RotateOperationsInsightsWarehouseWallet");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, RotateOperationsInsightsWarehouseWalletResponse>
                transformer =
                        RotateOperationsInsightsWarehouseWalletConverter.fromResponse(
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
    public SummarizeAwrSourcesSummariesResponse summarizeAwrSourcesSummaries(
            SummarizeAwrSourcesSummariesRequest request) {
        LOG.trace("Called summarizeAwrSourcesSummaries");
        final SummarizeAwrSourcesSummariesRequest interceptedRequest =
                SummarizeAwrSourcesSummariesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrSourcesSummariesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeAwrSourcesSummaries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/SummarizeAwrSourcesSummaries");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrSourcesSummariesResponse>
                transformer =
                        SummarizeAwrSourcesSummariesConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceCapacityTrendResponse
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceCapacityTrend");
        final SummarizeDatabaseInsightResourceCapacityTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceCapacityTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceCapacityTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceCapacityTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceCapacityTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceCapacityTrendResponse>
                transformer =
                        SummarizeDatabaseInsightResourceCapacityTrendConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceForecastTrendResponse
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceForecastTrend");
        final SummarizeDatabaseInsightResourceForecastTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceForecastTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceForecastTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceForecastTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceForecastTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceForecastTrendResponse>
                transformer =
                        SummarizeDatabaseInsightResourceForecastTrendConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceStatisticsResponse
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceStatistics");
        final SummarizeDatabaseInsightResourceStatisticsRequest interceptedRequest =
                SummarizeDatabaseInsightResourceStatisticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceStatisticsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceStatistics");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceStatisticsResponse>
                transformer =
                        SummarizeDatabaseInsightResourceStatisticsConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceUsageResponse summarizeDatabaseInsightResourceUsage(
            SummarizeDatabaseInsightResourceUsageRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceUsage");
        final SummarizeDatabaseInsightResourceUsageRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUsageConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUsage");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeDatabaseInsightResourceUsageResponse>
                transformer =
                        SummarizeDatabaseInsightResourceUsageConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceUsageTrendResponse
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceUsageTrend");
        final SummarizeDatabaseInsightResourceUsageTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUsageTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUsageTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUsageTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceUsageTrendResponse>
                transformer =
                        SummarizeDatabaseInsightResourceUsageTrendConverter.fromResponse(
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
    public SummarizeDatabaseInsightResourceUtilizationInsightResponse
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request) {
        LOG.trace("Called summarizeDatabaseInsightResourceUtilizationInsight");
        final SummarizeDatabaseInsightResourceUtilizationInsightRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUtilizationInsightConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUtilizationInsightConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightResourceUtilizationInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightResourceUtilizationInsight");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                transformer =
                        SummarizeDatabaseInsightResourceUtilizationInsightConverter.fromResponse(
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
    public SummarizeDatabaseInsightTablespaceUsageTrendResponse
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request) {
        LOG.trace("Called summarizeDatabaseInsightTablespaceUsageTrend");
        final SummarizeDatabaseInsightTablespaceUsageTrendRequest interceptedRequest =
                SummarizeDatabaseInsightTablespaceUsageTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightTablespaceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeDatabaseInsightTablespaceUsageTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeDatabaseInsightTablespaceUsageTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                transformer =
                        SummarizeDatabaseInsightTablespaceUsageTrendConverter.fromResponse(
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
    public SummarizeExadataInsightResourceCapacityTrendResponse
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceCapacityTrend");
        final SummarizeExadataInsightResourceCapacityTrendRequest interceptedRequest =
                SummarizeExadataInsightResourceCapacityTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceCapacityTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceCapacityTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceCapacityTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceCapacityTrendResponse>
                transformer =
                        SummarizeExadataInsightResourceCapacityTrendConverter.fromResponse(
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
    public SummarizeExadataInsightResourceCapacityTrendAggregatedResponse
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceCapacityTrendAggregated");
        final SummarizeExadataInsightResourceCapacityTrendAggregatedRequest interceptedRequest =
                SummarizeExadataInsightResourceCapacityTrendAggregatedConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceCapacityTrendAggregatedConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceCapacityTrendAggregated",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceCapacityTrendAggregated");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
                transformer =
                        SummarizeExadataInsightResourceCapacityTrendAggregatedConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
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
    public SummarizeExadataInsightResourceForecastTrendResponse
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceForecastTrend");
        final SummarizeExadataInsightResourceForecastTrendRequest interceptedRequest =
                SummarizeExadataInsightResourceForecastTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceForecastTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceForecastTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceForecastTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceForecastTrendResponse>
                transformer =
                        SummarizeExadataInsightResourceForecastTrendConverter.fromResponse(
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
    public SummarizeExadataInsightResourceForecastTrendAggregatedResponse
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceForecastTrendAggregated");
        final SummarizeExadataInsightResourceForecastTrendAggregatedRequest interceptedRequest =
                SummarizeExadataInsightResourceForecastTrendAggregatedConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceForecastTrendAggregatedConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceForecastTrendAggregated",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceForecastTrendAggregated");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
                transformer =
                        SummarizeExadataInsightResourceForecastTrendAggregatedConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
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
    public SummarizeExadataInsightResourceStatisticsResponse
            summarizeExadataInsightResourceStatistics(
                    SummarizeExadataInsightResourceStatisticsRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceStatistics");
        final SummarizeExadataInsightResourceStatisticsRequest interceptedRequest =
                SummarizeExadataInsightResourceStatisticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceStatisticsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceStatistics");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceStatisticsResponse>
                transformer =
                        SummarizeExadataInsightResourceStatisticsConverter.fromResponse(
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
    public SummarizeExadataInsightResourceUsageResponse summarizeExadataInsightResourceUsage(
            SummarizeExadataInsightResourceUsageRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceUsage");
        final SummarizeExadataInsightResourceUsageRequest interceptedRequest =
                SummarizeExadataInsightResourceUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceUsageConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUsage");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeExadataInsightResourceUsageResponse>
                transformer =
                        SummarizeExadataInsightResourceUsageConverter.fromResponse(
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
    public SummarizeExadataInsightResourceUsageAggregatedResponse
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceUsageAggregated");
        final SummarizeExadataInsightResourceUsageAggregatedRequest interceptedRequest =
                SummarizeExadataInsightResourceUsageAggregatedConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceUsageAggregatedConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUsageAggregated",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUsageAggregated");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceUsageAggregatedResponse>
                transformer =
                        SummarizeExadataInsightResourceUsageAggregatedConverter.fromResponse(
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
    public SummarizeExadataInsightResourceUtilizationInsightResponse
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request) {
        LOG.trace("Called summarizeExadataInsightResourceUtilizationInsight");
        final SummarizeExadataInsightResourceUtilizationInsightRequest interceptedRequest =
                SummarizeExadataInsightResourceUtilizationInsightConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataInsightResourceUtilizationInsightConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataInsightResourceUtilizationInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataInsightResourceUtilizationInsight");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExadataInsightResourceUtilizationInsightResponse>
                transformer =
                        SummarizeExadataInsightResourceUtilizationInsightConverter.fromResponse(
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
    public SummarizeExadataMembersResponse summarizeExadataMembers(
            SummarizeExadataMembersRequest request) {
        LOG.trace("Called summarizeExadataMembers");
        final SummarizeExadataMembersRequest interceptedRequest =
                SummarizeExadataMembersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExadataMembersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeExadataMembers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/SummarizeExadataMembers");
        com.google.common.base.Function<javax.ws.rs.core.Response, SummarizeExadataMembersResponse>
                transformer =
                        SummarizeExadataMembersConverter.fromResponse(
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
    public SummarizeHostInsightResourceCapacityTrendResponse
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request) {
        LOG.trace("Called summarizeHostInsightResourceCapacityTrend");
        final SummarizeHostInsightResourceCapacityTrendRequest interceptedRequest =
                SummarizeHostInsightResourceCapacityTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceCapacityTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceCapacityTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceCapacityTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceCapacityTrendResponse>
                transformer =
                        SummarizeHostInsightResourceCapacityTrendConverter.fromResponse(
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
    public SummarizeHostInsightResourceForecastTrendResponse
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request) {
        LOG.trace("Called summarizeHostInsightResourceForecastTrend");
        final SummarizeHostInsightResourceForecastTrendRequest interceptedRequest =
                SummarizeHostInsightResourceForecastTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceForecastTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceForecastTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceForecastTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceForecastTrendResponse>
                transformer =
                        SummarizeHostInsightResourceForecastTrendConverter.fromResponse(
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
    public SummarizeHostInsightResourceStatisticsResponse summarizeHostInsightResourceStatistics(
            SummarizeHostInsightResourceStatisticsRequest request) {
        LOG.trace("Called summarizeHostInsightResourceStatistics");
        final SummarizeHostInsightResourceStatisticsRequest interceptedRequest =
                SummarizeHostInsightResourceStatisticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceStatisticsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceStatistics");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceStatisticsResponse>
                transformer =
                        SummarizeHostInsightResourceStatisticsConverter.fromResponse(
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
    public SummarizeHostInsightResourceUsageResponse summarizeHostInsightResourceUsage(
            SummarizeHostInsightResourceUsageRequest request) {
        LOG.trace("Called summarizeHostInsightResourceUsage");
        final SummarizeHostInsightResourceUsageRequest interceptedRequest =
                SummarizeHostInsightResourceUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUsageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUsage");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceUsageResponse>
                transformer =
                        SummarizeHostInsightResourceUsageConverter.fromResponse(
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
    public SummarizeHostInsightResourceUsageTrendResponse summarizeHostInsightResourceUsageTrend(
            SummarizeHostInsightResourceUsageTrendRequest request) {
        LOG.trace("Called summarizeHostInsightResourceUsageTrend");
        final SummarizeHostInsightResourceUsageTrendRequest interceptedRequest =
                SummarizeHostInsightResourceUsageTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUsageTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUsageTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceUsageTrendResponse>
                transformer =
                        SummarizeHostInsightResourceUsageTrendConverter.fromResponse(
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
    public SummarizeHostInsightResourceUtilizationInsightResponse
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request) {
        LOG.trace("Called summarizeHostInsightResourceUtilizationInsight");
        final SummarizeHostInsightResourceUtilizationInsightRequest interceptedRequest =
                SummarizeHostInsightResourceUtilizationInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUtilizationInsightConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightResourceUtilizationInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightResourceUtilizationInsight");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceUtilizationInsightResponse>
                transformer =
                        SummarizeHostInsightResourceUtilizationInsightConverter.fromResponse(
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
    public SummarizeHostInsightTopProcessesUsageTrendResponse
            summarizeHostInsightTopProcessesUsageTrend(
                    SummarizeHostInsightTopProcessesUsageTrendRequest request) {
        LOG.trace("Called summarizeHostInsightTopProcessesUsageTrend");
        final SummarizeHostInsightTopProcessesUsageTrendRequest interceptedRequest =
                SummarizeHostInsightTopProcessesUsageTrendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightTopProcessesUsageTrendConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeHostInsightTopProcessesUsageTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/SummarizeHostInsightTopProcessesUsageTrend");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightTopProcessesUsageTrendResponse>
                transformer =
                        SummarizeHostInsightTopProcessesUsageTrendConverter.fromResponse(
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
    public SummarizeOperationsInsightsWarehouseResourceUsageResponse
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request) {
        LOG.trace("Called summarizeOperationsInsightsWarehouseResourceUsage");
        final SummarizeOperationsInsightsWarehouseResourceUsageRequest interceptedRequest =
                SummarizeOperationsInsightsWarehouseResourceUsageConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeOperationsInsightsWarehouseResourceUsageConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeOperationsInsightsWarehouseResourceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/SummarizeOperationsInsightsWarehouseResourceUsage");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeOperationsInsightsWarehouseResourceUsageResponse>
                transformer =
                        SummarizeOperationsInsightsWarehouseResourceUsageConverter.fromResponse(
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
    public SummarizeSqlInsightsResponse summarizeSqlInsights(SummarizeSqlInsightsRequest request) {
        LOG.trace("Called summarizeSqlInsights");
        final SummarizeSqlInsightsRequest interceptedRequest =
                SummarizeSqlInsightsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlInsightsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlInsights");
        com.google.common.base.Function<javax.ws.rs.core.Response, SummarizeSqlInsightsResponse>
                transformer =
                        SummarizeSqlInsightsConverter.fromResponse(
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
    public SummarizeSqlPlanInsightsResponse summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request) {
        LOG.trace("Called summarizeSqlPlanInsights");
        final SummarizeSqlPlanInsightsRequest interceptedRequest =
                SummarizeSqlPlanInsightsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanInsightsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlPlanInsights",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlPlanInsights");
        com.google.common.base.Function<javax.ws.rs.core.Response, SummarizeSqlPlanInsightsResponse>
                transformer =
                        SummarizeSqlPlanInsightsConverter.fromResponse(
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
    public SummarizeSqlResponseTimeDistributionsResponse summarizeSqlResponseTimeDistributions(
            SummarizeSqlResponseTimeDistributionsRequest request) {
        LOG.trace("Called summarizeSqlResponseTimeDistributions");
        final SummarizeSqlResponseTimeDistributionsRequest interceptedRequest =
                SummarizeSqlResponseTimeDistributionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlResponseTimeDistributionsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlResponseTimeDistributions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlResponseTimeDistributions");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlResponseTimeDistributionsResponse>
                transformer =
                        SummarizeSqlResponseTimeDistributionsConverter.fromResponse(
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
    public SummarizeSqlStatisticsResponse summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request) {
        LOG.trace("Called summarizeSqlStatistics");
        final SummarizeSqlStatisticsRequest interceptedRequest =
                SummarizeSqlStatisticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatistics");
        com.google.common.base.Function<javax.ws.rs.core.Response, SummarizeSqlStatisticsResponse>
                transformer =
                        SummarizeSqlStatisticsConverter.fromResponse(
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
    public SummarizeSqlStatisticsTimeSeriesResponse summarizeSqlStatisticsTimeSeries(
            SummarizeSqlStatisticsTimeSeriesRequest request) {
        LOG.trace("Called summarizeSqlStatisticsTimeSeries");
        final SummarizeSqlStatisticsTimeSeriesRequest interceptedRequest =
                SummarizeSqlStatisticsTimeSeriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsTimeSeriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatisticsTimeSeries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatisticsTimeSeries");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlStatisticsTimeSeriesResponse>
                transformer =
                        SummarizeSqlStatisticsTimeSeriesConverter.fromResponse(
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
    public SummarizeSqlStatisticsTimeSeriesByPlanResponse summarizeSqlStatisticsTimeSeriesByPlan(
            SummarizeSqlStatisticsTimeSeriesByPlanRequest request) {
        LOG.trace("Called summarizeSqlStatisticsTimeSeriesByPlan");
        final SummarizeSqlStatisticsTimeSeriesByPlanRequest interceptedRequest =
                SummarizeSqlStatisticsTimeSeriesByPlanConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsTimeSeriesByPlanConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "SummarizeSqlStatisticsTimeSeriesByPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/SummarizeSqlStatisticsTimeSeriesByPlan");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                transformer =
                        SummarizeSqlStatisticsTimeSeriesByPlanConverter.fromResponse(
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
    public UpdateAwrHubResponse updateAwrHub(UpdateAwrHubRequest request) {
        LOG.trace("Called updateAwrHub");
        final UpdateAwrHubRequest interceptedRequest =
                UpdateAwrHubConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAwrHubConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateAwrHub",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/AwrHubs/UpdateAwrHub");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAwrHubResponse>
                transformer =
                        UpdateAwrHubConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateAwrHubDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDatabaseInsightResponse updateDatabaseInsight(
            UpdateDatabaseInsightRequest request) {
        LOG.trace("Called updateDatabaseInsight");
        final UpdateDatabaseInsightRequest interceptedRequest =
                UpdateDatabaseInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateDatabaseInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/DatabaseInsights/UpdateDatabaseInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDatabaseInsightResponse>
                transformer =
                        UpdateDatabaseInsightConverter.fromResponse(
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
                                                retriedRequest.getUpdateDatabaseInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateEnterpriseManagerBridgeResponse updateEnterpriseManagerBridge(
            UpdateEnterpriseManagerBridgeRequest request) {
        LOG.trace("Called updateEnterpriseManagerBridge");
        final UpdateEnterpriseManagerBridgeRequest interceptedRequest =
                UpdateEnterpriseManagerBridgeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateEnterpriseManagerBridge",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/EnterpriseManagerBridges/UpdateEnterpriseManagerBridge");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateEnterpriseManagerBridgeResponse>
                transformer =
                        UpdateEnterpriseManagerBridgeConverter.fromResponse(
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
                                                        .getUpdateEnterpriseManagerBridgeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExadataInsightResponse updateExadataInsight(UpdateExadataInsightRequest request) {
        LOG.trace("Called updateExadataInsight");
        final UpdateExadataInsightRequest interceptedRequest =
                UpdateExadataInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExadataInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateExadataInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/ExadataInsights/UpdateExadataInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateExadataInsightResponse>
                transformer =
                        UpdateExadataInsightConverter.fromResponse(
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
                                                retriedRequest.getUpdateExadataInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateHostInsightResponse updateHostInsight(UpdateHostInsightRequest request) {
        LOG.trace("Called updateHostInsight");
        final UpdateHostInsightRequest interceptedRequest =
                UpdateHostInsightConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHostInsightConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateHostInsight",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/HostInsights/UpdateHostInsight");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateHostInsightResponse>
                transformer =
                        UpdateHostInsightConverter.fromResponse(
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
                                                retriedRequest.getUpdateHostInsightDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateOperationsInsightsPrivateEndpointResponse updateOperationsInsightsPrivateEndpoint(
            UpdateOperationsInsightsPrivateEndpointRequest request) {
        LOG.trace("Called updateOperationsInsightsPrivateEndpoint");
        final UpdateOperationsInsightsPrivateEndpointRequest interceptedRequest =
                UpdateOperationsInsightsPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOperationsInsightsPrivateEndpointConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsPrivateEndpoint/UpdateOperationsInsightsPrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOperationsInsightsPrivateEndpointResponse>
                transformer =
                        UpdateOperationsInsightsPrivateEndpointConverter.fromResponse(
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
                                                        .getUpdateOperationsInsightsPrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateOperationsInsightsWarehouseResponse updateOperationsInsightsWarehouse(
            UpdateOperationsInsightsWarehouseRequest request) {
        LOG.trace("Called updateOperationsInsightsWarehouse");
        final UpdateOperationsInsightsWarehouseRequest interceptedRequest =
                UpdateOperationsInsightsWarehouseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOperationsInsightsWarehouseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsWarehouse",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouses/UpdateOperationsInsightsWarehouse");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOperationsInsightsWarehouseResponse>
                transformer =
                        UpdateOperationsInsightsWarehouseConverter.fromResponse(
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
                                                        .getUpdateOperationsInsightsWarehouseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateOperationsInsightsWarehouseUserResponse updateOperationsInsightsWarehouseUser(
            UpdateOperationsInsightsWarehouseUserRequest request) {
        LOG.trace("Called updateOperationsInsightsWarehouseUser");
        final UpdateOperationsInsightsWarehouseUserRequest interceptedRequest =
                UpdateOperationsInsightsWarehouseUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOperationsInsightsWarehouseUserConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "OperationsInsights",
                        "UpdateOperationsInsightsWarehouseUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/operations-insights/20200630/OperationsInsightsWarehouseUsers/UpdateOperationsInsightsWarehouseUser");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOperationsInsightsWarehouseUserResponse>
                transformer =
                        UpdateOperationsInsightsWarehouseUserConverter.fromResponse(
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
                                                        .getUpdateOperationsInsightsWarehouseUserDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public OperationsInsightsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OperationsInsightsPaginators getPaginators() {
        return paginators;
    }
}
