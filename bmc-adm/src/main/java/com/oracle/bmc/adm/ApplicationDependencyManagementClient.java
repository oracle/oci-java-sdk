/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.adm.internal.http.*;
import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementClient implements ApplicationDependencyManagement {
    /**
     * Service instance for ApplicationDependencyManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APPLICATIONDEPENDENCYMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://adm.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApplicationDependencyManagementClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final ApplicationDependencyManagementWaiters waiters;

    private final ApplicationDependencyManagementPaginators paginators;
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
    public ApplicationDependencyManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    protected ApplicationDependencyManagementClient(
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
                                    .nameFormat("ApplicationDependencyManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ApplicationDependencyManagementWaiters(executorService, this);

        this.paginators = new ApplicationDependencyManagementPaginators(this);

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
                    Builder, ApplicationDependencyManagementClient> {
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
        public ApplicationDependencyManagementClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ApplicationDependencyManagementClient(
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
    public ActivateRemediationRecipeResponse activateRemediationRecipe(
            ActivateRemediationRecipeRequest request) {
        LOG.trace("Called activateRemediationRecipe");
        final ActivateRemediationRecipeRequest interceptedRequest =
                ActivateRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ActivateRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ActivateRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, ActivateRemediationRecipeResponse>
                transformer =
                        ActivateRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public CancelRemediationRunResponse cancelRemediationRun(CancelRemediationRunRequest request) {
        LOG.trace("Called cancelRemediationRun");
        final CancelRemediationRunRequest interceptedRequest =
                CancelRemediationRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelRemediationRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "CancelRemediationRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/CancelRemediationRun");
        java.util.function.Function<javax.ws.rs.core.Response, CancelRemediationRunResponse>
                transformer =
                        CancelRemediationRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                        "ApplicationDependencyManagement",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/CancelWorkRequest");
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
    public ChangeKnowledgeBaseCompartmentResponse changeKnowledgeBaseCompartment(
            ChangeKnowledgeBaseCompartmentRequest request) {
        LOG.trace("Called changeKnowledgeBaseCompartment");
        final ChangeKnowledgeBaseCompartmentRequest interceptedRequest =
                ChangeKnowledgeBaseCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeKnowledgeBaseCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeKnowledgeBaseCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/ChangeKnowledgeBaseCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeKnowledgeBaseCompartmentResponse>
                transformer =
                        ChangeKnowledgeBaseCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeKnowledgeBaseCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeRemediationRecipeCompartmentResponse changeRemediationRecipeCompartment(
            ChangeRemediationRecipeCompartmentRequest request) {
        LOG.trace("Called changeRemediationRecipeCompartment");
        final ChangeRemediationRecipeCompartmentRequest interceptedRequest =
                ChangeRemediationRecipeCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRemediationRecipeCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeRemediationRecipeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ChangeRemediationRecipeCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeRemediationRecipeCompartmentResponse>
                transformer =
                        ChangeRemediationRecipeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeRemediationRecipeCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeRemediationRunCompartmentResponse changeRemediationRunCompartment(
            ChangeRemediationRunCompartmentRequest request) {
        LOG.trace("Called changeRemediationRunCompartment");
        final ChangeRemediationRunCompartmentRequest interceptedRequest =
                ChangeRemediationRunCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRemediationRunCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeRemediationRunCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ChangeRemediationRunCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeRemediationRunCompartmentResponse>
                transformer =
                        ChangeRemediationRunCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeRemediationRunCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeVulnerabilityAuditCompartmentResponse changeVulnerabilityAuditCompartment(
            ChangeVulnerabilityAuditCompartmentRequest request) {
        LOG.trace("Called changeVulnerabilityAuditCompartment");
        final ChangeVulnerabilityAuditCompartmentRequest interceptedRequest =
                ChangeVulnerabilityAuditCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVulnerabilityAuditCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeVulnerabilityAuditCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ChangeVulnerabilityAuditCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeVulnerabilityAuditCompartmentResponse>
                transformer =
                        ChangeVulnerabilityAuditCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeVulnerabilityAuditCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request) {
        LOG.trace("Called createKnowledgeBase");
        final CreateKnowledgeBaseRequest interceptedRequest =
                CreateKnowledgeBaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateKnowledgeBaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "CreateKnowledgeBase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/CreateKnowledgeBase");
        java.util.function.Function<javax.ws.rs.core.Response, CreateKnowledgeBaseResponse>
                transformer =
                        CreateKnowledgeBaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateKnowledgeBaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateRemediationRecipeResponse createRemediationRecipe(
            CreateRemediationRecipeRequest request) {
        LOG.trace("Called createRemediationRecipe");
        final CreateRemediationRecipeRequest interceptedRequest =
                CreateRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "CreateRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/CreateRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, CreateRemediationRecipeResponse>
                transformer =
                        CreateRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateRemediationRecipeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateRemediationRunResponse createRemediationRun(CreateRemediationRunRequest request) {
        LOG.trace("Called createRemediationRun");
        final CreateRemediationRunRequest interceptedRequest =
                CreateRemediationRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRemediationRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "CreateRemediationRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/CreateRemediationRun");
        java.util.function.Function<javax.ws.rs.core.Response, CreateRemediationRunResponse>
                transformer =
                        CreateRemediationRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateRemediationRunDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateVulnerabilityAuditResponse createVulnerabilityAudit(
            CreateVulnerabilityAuditRequest request) {
        LOG.trace("Called createVulnerabilityAudit");
        final CreateVulnerabilityAuditRequest interceptedRequest =
                CreateVulnerabilityAuditConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVulnerabilityAuditConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "CreateVulnerabilityAudit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/CreateVulnerabilityAudit");
        java.util.function.Function<javax.ws.rs.core.Response, CreateVulnerabilityAuditResponse>
                transformer =
                        CreateVulnerabilityAuditConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateVulnerabilityAuditDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeactivateRemediationRecipeResponse deactivateRemediationRecipe(
            DeactivateRemediationRecipeRequest request) {
        LOG.trace("Called deactivateRemediationRecipe");
        final DeactivateRemediationRecipeRequest interceptedRequest =
                DeactivateRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "DeactivateRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/DeactivateRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, DeactivateRemediationRecipeResponse>
                transformer =
                        DeactivateRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteKnowledgeBaseResponse deleteKnowledgeBase(DeleteKnowledgeBaseRequest request) {
        LOG.trace("Called deleteKnowledgeBase");
        final DeleteKnowledgeBaseRequest interceptedRequest =
                DeleteKnowledgeBaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteKnowledgeBaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteKnowledgeBase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/DeleteKnowledgeBase");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteKnowledgeBaseResponse>
                transformer =
                        DeleteKnowledgeBaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteRemediationRecipeResponse deleteRemediationRecipe(
            DeleteRemediationRecipeRequest request) {
        LOG.trace("Called deleteRemediationRecipe");
        final DeleteRemediationRecipeRequest interceptedRequest =
                DeleteRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/DeleteRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteRemediationRecipeResponse>
                transformer =
                        DeleteRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteRemediationRunResponse deleteRemediationRun(DeleteRemediationRunRequest request) {
        LOG.trace("Called deleteRemediationRun");
        final DeleteRemediationRunRequest interceptedRequest =
                DeleteRemediationRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRemediationRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteRemediationRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/DeleteRemediationRun");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteRemediationRunResponse>
                transformer =
                        DeleteRemediationRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteVulnerabilityAuditResponse deleteVulnerabilityAudit(
            DeleteVulnerabilityAuditRequest request) {
        LOG.trace("Called deleteVulnerabilityAudit");
        final DeleteVulnerabilityAuditRequest interceptedRequest =
                DeleteVulnerabilityAuditConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVulnerabilityAuditConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteVulnerabilityAudit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/DeleteVulnerabilityAudit");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteVulnerabilityAuditResponse>
                transformer =
                        DeleteVulnerabilityAuditConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetKnowledgeBaseResponse getKnowledgeBase(GetKnowledgeBaseRequest request) {
        LOG.trace("Called getKnowledgeBase");
        final GetKnowledgeBaseRequest interceptedRequest =
                GetKnowledgeBaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetKnowledgeBaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "GetKnowledgeBase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/GetKnowledgeBase");
        java.util.function.Function<javax.ws.rs.core.Response, GetKnowledgeBaseResponse>
                transformer =
                        GetKnowledgeBaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetRemediationRecipeResponse getRemediationRecipe(GetRemediationRecipeRequest request) {
        LOG.trace("Called getRemediationRecipe");
        final GetRemediationRecipeRequest interceptedRequest =
                GetRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "GetRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/GetRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, GetRemediationRecipeResponse>
                transformer =
                        GetRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetRemediationRunResponse getRemediationRun(GetRemediationRunRequest request) {
        LOG.trace("Called getRemediationRun");
        final GetRemediationRunRequest interceptedRequest =
                GetRemediationRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRemediationRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "GetRemediationRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/GetRemediationRun");
        java.util.function.Function<javax.ws.rs.core.Response, GetRemediationRunResponse>
                transformer =
                        GetRemediationRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetStageResponse getStage(GetStageRequest request) {
        LOG.trace("Called getStage");
        final GetStageRequest interceptedRequest = GetStageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "GetStage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRunStage/GetStage");
        java.util.function.Function<javax.ws.rs.core.Response, GetStageResponse> transformer =
                GetStageConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetVulnerabilityAuditResponse getVulnerabilityAudit(
            GetVulnerabilityAuditRequest request) {
        LOG.trace("Called getVulnerabilityAudit");
        final GetVulnerabilityAuditRequest interceptedRequest =
                GetVulnerabilityAuditConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVulnerabilityAuditConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "GetVulnerabilityAudit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/GetVulnerabilityAudit");
        java.util.function.Function<javax.ws.rs.core.Response, GetVulnerabilityAuditResponse>
                transformer =
                        GetVulnerabilityAuditConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                        "ApplicationDependencyManagement",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/GetWorkRequest");
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
    public ListApplicationDependencyRecommendationsResponse
            listApplicationDependencyRecommendations(
                    ListApplicationDependencyRecommendationsRequest request) {
        LOG.trace("Called listApplicationDependencyRecommendations");
        final ListApplicationDependencyRecommendationsRequest interceptedRequest =
                ListApplicationDependencyRecommendationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationDependencyRecommendationsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListApplicationDependencyRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ListApplicationDependencyRecommendations");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListApplicationDependencyRecommendationsResponse>
                transformer =
                        ListApplicationDependencyRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListApplicationDependencyVulnerabilitiesResponse
            listApplicationDependencyVulnerabilities(
                    ListApplicationDependencyVulnerabilitiesRequest request) {
        LOG.trace("Called listApplicationDependencyVulnerabilities");
        final ListApplicationDependencyVulnerabilitiesRequest interceptedRequest =
                ListApplicationDependencyVulnerabilitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationDependencyVulnerabilitiesConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListApplicationDependencyVulnerabilities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ListApplicationDependencyVulnerabilities");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListApplicationDependencyVulnerabilitiesResponse>
                transformer =
                        ListApplicationDependencyVulnerabilitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) {
        LOG.trace("Called listKnowledgeBases");
        final ListKnowledgeBasesRequest interceptedRequest =
                ListKnowledgeBasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListKnowledgeBasesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListKnowledgeBases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/ListKnowledgeBases");
        java.util.function.Function<javax.ws.rs.core.Response, ListKnowledgeBasesResponse>
                transformer =
                        ListKnowledgeBasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListRemediationRecipesResponse listRemediationRecipes(
            ListRemediationRecipesRequest request) {
        LOG.trace("Called listRemediationRecipes");
        final ListRemediationRecipesRequest interceptedRequest =
                ListRemediationRecipesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRemediationRecipesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListRemediationRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ListRemediationRecipes");
        java.util.function.Function<javax.ws.rs.core.Response, ListRemediationRecipesResponse>
                transformer =
                        ListRemediationRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListRemediationRunsResponse listRemediationRuns(ListRemediationRunsRequest request) {
        LOG.trace("Called listRemediationRuns");
        final ListRemediationRunsRequest interceptedRequest =
                ListRemediationRunsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRemediationRunsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListRemediationRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ListRemediationRuns");
        java.util.function.Function<javax.ws.rs.core.Response, ListRemediationRunsResponse>
                transformer =
                        ListRemediationRunsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListStagesResponse listStages(ListStagesRequest request) {
        LOG.trace("Called listStages");
        final ListStagesRequest interceptedRequest = ListStagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStagesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListStages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRunStage/ListStages");
        java.util.function.Function<javax.ws.rs.core.Response, ListStagesResponse> transformer =
                ListStagesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListVulnerabilityAuditsResponse listVulnerabilityAudits(
            ListVulnerabilityAuditsRequest request) {
        LOG.trace("Called listVulnerabilityAudits");
        final ListVulnerabilityAuditsRequest interceptedRequest =
                ListVulnerabilityAuditsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVulnerabilityAuditsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "ListVulnerabilityAudits",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ListVulnerabilityAudits");
        java.util.function.Function<javax.ws.rs.core.Response, ListVulnerabilityAuditsResponse>
                transformer =
                        ListVulnerabilityAuditsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                        "ApplicationDependencyManagement",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequestError/ListWorkRequestErrors");
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
                        "ApplicationDependencyManagement",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "ApplicationDependencyManagement",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/ListWorkRequests");
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
    public UpdateKnowledgeBaseResponse updateKnowledgeBase(UpdateKnowledgeBaseRequest request) {
        LOG.trace("Called updateKnowledgeBase");
        final UpdateKnowledgeBaseRequest interceptedRequest =
                UpdateKnowledgeBaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateKnowledgeBaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateKnowledgeBase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/UpdateKnowledgeBase");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateKnowledgeBaseResponse>
                transformer =
                        UpdateKnowledgeBaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateKnowledgeBaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateRemediationRecipeResponse updateRemediationRecipe(
            UpdateRemediationRecipeRequest request) {
        LOG.trace("Called updateRemediationRecipe");
        final UpdateRemediationRecipeRequest interceptedRequest =
                UpdateRemediationRecipeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRemediationRecipeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateRemediationRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/UpdateRemediationRecipe");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateRemediationRecipeResponse>
                transformer =
                        UpdateRemediationRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateRemediationRecipeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateRemediationRunResponse updateRemediationRun(UpdateRemediationRunRequest request) {
        LOG.trace("Called updateRemediationRun");
        final UpdateRemediationRunRequest interceptedRequest =
                UpdateRemediationRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRemediationRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateRemediationRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/UpdateRemediationRun");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateRemediationRunResponse>
                transformer =
                        UpdateRemediationRunConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateRemediationRunDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateVulnerabilityAuditResponse updateVulnerabilityAudit(
            UpdateVulnerabilityAuditRequest request) {
        LOG.trace("Called updateVulnerabilityAudit");
        final UpdateVulnerabilityAuditRequest interceptedRequest =
                UpdateVulnerabilityAuditConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVulnerabilityAuditConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateVulnerabilityAudit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/UpdateVulnerabilityAudit");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateVulnerabilityAuditResponse>
                transformer =
                        UpdateVulnerabilityAuditConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateVulnerabilityAuditDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ApplicationDependencyManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ApplicationDependencyManagementPaginators getPaginators() {
        return paginators;
    }
}
