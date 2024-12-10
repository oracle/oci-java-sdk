/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.internal.http.*;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementClient implements DbManagement {
    /**
     * Service instance for DbManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final DbManagementWaiters waiters;

    private final DbManagementPaginators paginators;
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
    public DbManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    public DbManagementClient(
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
    protected DbManagementClient(
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
                                    .nameFormat("DbManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbManagementWaiters(executorService, this);

        this.paginators = new DbManagementPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbManagementClient> {
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
        public DbManagementClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DbManagementClient(
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
    public AddDataFilesResponse addDataFiles(AddDataFilesRequest request) {
        LOG.trace("Called addDataFiles");
        final AddDataFilesRequest interceptedRequest =
                AddDataFilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDataFilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddDataFiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/AddDataFiles");
        java.util.function.Function<javax.ws.rs.core.Response, AddDataFilesResponse> transformer =
                AddDataFilesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getAddDataFilesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AddManagedDatabaseToManagedDatabaseGroupResponse
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request) {
        LOG.trace("Called addManagedDatabaseToManagedDatabaseGroup");
        final AddManagedDatabaseToManagedDatabaseGroupRequest interceptedRequest =
                AddManagedDatabaseToManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddManagedDatabaseToManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddManagedDatabaseToManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/AddManagedDatabaseToManagedDatabaseGroup");
        java.util.function.Function<
                        javax.ws.rs.core.Response, AddManagedDatabaseToManagedDatabaseGroupResponse>
                transformer =
                        AddManagedDatabaseToManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getAddManagedDatabaseToManagedDatabaseGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AddmTasksResponse addmTasks(AddmTasksRequest request) {
        LOG.trace("Called addmTasks");
        final AddmTasksRequest interceptedRequest = AddmTasksConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddmTasksConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddmTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AddmTasksCollection/AddmTasks");
        java.util.function.Function<javax.ws.rs.core.Response, AddmTasksResponse> transformer =
                AddmTasksConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ChangeDatabaseParametersResponse changeDatabaseParameters(
            ChangeDatabaseParametersRequest request) {
        LOG.trace("Called changeDatabaseParameters");
        final ChangeDatabaseParametersRequest interceptedRequest =
                ChangeDatabaseParametersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseParametersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeDatabaseParameters");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeDatabaseParametersResponse>
                transformer =
                        ChangeDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getChangeDatabaseParametersDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeDbManagementPrivateEndpointCompartmentResponse
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request) {
        LOG.trace("Called changeDbManagementPrivateEndpointCompartment");
        final ChangeDbManagementPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDbManagementPrivateEndpointCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDbManagementPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeDbManagementPrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ChangeDbManagementPrivateEndpointCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDbManagementPrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDbManagementPrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeDbManagementPrivateEndpointCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeExternalDbSystemCompartmentResponse changeExternalDbSystemCompartment(
            ChangeExternalDbSystemCompartmentRequest request) {
        LOG.trace("Called changeExternalDbSystemCompartment");
        final ChangeExternalDbSystemCompartmentRequest interceptedRequest =
                ChangeExternalDbSystemCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalDbSystemCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeExternalDbSystemCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ChangeExternalDbSystemCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeExternalDbSystemCompartmentResponse>
                transformer =
                        ChangeExternalDbSystemCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeExternalDbSystemCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeExternalExadataInfrastructureCompartmentResponse
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request) {
        LOG.trace("Called changeExternalExadataInfrastructureCompartment");
        final ChangeExternalExadataInfrastructureCompartmentRequest interceptedRequest =
                ChangeExternalExadataInfrastructureCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalExadataInfrastructureCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeExternalExadataInfrastructureCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ChangeExternalExadataInfrastructureCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeExternalExadataInfrastructureCompartmentResponse>
                transformer =
                        ChangeExternalExadataInfrastructureCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeExternalExadataInfrastructureCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeJobCompartmentResponse changeJobCompartment(ChangeJobCompartmentRequest request) {
        LOG.trace("Called changeJobCompartment");
        final ChangeJobCompartmentRequest interceptedRequest =
                ChangeJobCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ChangeJobCompartment");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeJobCompartmentResponse>
                transformer =
                        ChangeJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getChangeJobCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeManagedDatabaseGroupCompartmentResponse changeManagedDatabaseGroupCompartment(
            ChangeManagedDatabaseGroupCompartmentRequest request) {
        LOG.trace("Called changeManagedDatabaseGroupCompartment");
        final ChangeManagedDatabaseGroupCompartmentRequest interceptedRequest =
                ChangeManagedDatabaseGroupCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedDatabaseGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeManagedDatabaseGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ChangeManagedDatabaseGroupCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeManagedDatabaseGroupCompartmentResponse>
                transformer =
                        ChangeManagedDatabaseGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeManagedDatabaseGroupCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeNamedCredentialCompartmentResponse changeNamedCredentialCompartment(
            ChangeNamedCredentialCompartmentRequest request) {
        LOG.trace("Called changeNamedCredentialCompartment");
        final ChangeNamedCredentialCompartmentRequest interceptedRequest =
                ChangeNamedCredentialCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNamedCredentialCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeNamedCredentialCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ChangeNamedCredentialCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNamedCredentialCompartmentResponse>
                transformer =
                        ChangeNamedCredentialCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeNamedCredentialCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangePlanRetentionResponse changePlanRetention(ChangePlanRetentionRequest request) {
        LOG.trace("Called changePlanRetention");
        final ChangePlanRetentionRequest interceptedRequest =
                ChangePlanRetentionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePlanRetentionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangePlanRetention",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangePlanRetention");
        java.util.function.Function<javax.ws.rs.core.Response, ChangePlanRetentionResponse>
                transformer =
                        ChangePlanRetentionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getChangePlanRetentionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSpaceBudgetResponse changeSpaceBudget(ChangeSpaceBudgetRequest request) {
        LOG.trace("Called changeSpaceBudget");
        final ChangeSpaceBudgetRequest interceptedRequest =
                ChangeSpaceBudgetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSpaceBudgetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeSpaceBudget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSpaceBudget");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeSpaceBudgetResponse>
                transformer =
                        ChangeSpaceBudgetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getChangeSpaceBudgetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSqlPlanBaselinesAttributesResponse changeSqlPlanBaselinesAttributes(
            ChangeSqlPlanBaselinesAttributesRequest request) {
        LOG.trace("Called changeSqlPlanBaselinesAttributes");
        final ChangeSqlPlanBaselinesAttributesRequest interceptedRequest =
                ChangeSqlPlanBaselinesAttributesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSqlPlanBaselinesAttributesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeSqlPlanBaselinesAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSqlPlanBaselinesAttributes");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSqlPlanBaselinesAttributesResponse>
                transformer =
                        ChangeSqlPlanBaselinesAttributesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getChangeSqlPlanBaselinesAttributesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CheckExternalDbSystemConnectorConnectionStatusResponse
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request) {
        LOG.trace("Called checkExternalDbSystemConnectorConnectionStatus");
        final CheckExternalDbSystemConnectorConnectionStatusRequest interceptedRequest =
                CheckExternalDbSystemConnectorConnectionStatusConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalDbSystemConnectorConnectionStatusConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CheckExternalDbSystemConnectorConnectionStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CheckExternalDbSystemConnectorConnectionStatus");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CheckExternalDbSystemConnectorConnectionStatusResponse>
                transformer =
                        CheckExternalDbSystemConnectorConnectionStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public CheckExternalExadataStorageConnectorResponse checkExternalExadataStorageConnector(
            CheckExternalExadataStorageConnectorRequest request) {
        LOG.trace("Called checkExternalExadataStorageConnector");
        final CheckExternalExadataStorageConnectorRequest interceptedRequest =
                CheckExternalExadataStorageConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CheckExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CheckExternalExadataStorageConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CheckExternalExadataStorageConnectorResponse>
                transformer =
                        CheckExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ConfigureAutomaticCaptureFiltersResponse configureAutomaticCaptureFilters(
            ConfigureAutomaticCaptureFiltersRequest request) {
        LOG.trace("Called configureAutomaticCaptureFilters");
        final ConfigureAutomaticCaptureFiltersRequest interceptedRequest =
                ConfigureAutomaticCaptureFiltersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureAutomaticCaptureFiltersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ConfigureAutomaticCaptureFilters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticCaptureFilters");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureAutomaticCaptureFiltersResponse>
                transformer =
                        ConfigureAutomaticCaptureFiltersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getConfigureAutomaticCaptureFiltersDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ConfigureAutomaticSpmEvolveAdvisorTaskResponse configureAutomaticSpmEvolveAdvisorTask(
            ConfigureAutomaticSpmEvolveAdvisorTaskRequest request) {
        LOG.trace("Called configureAutomaticSpmEvolveAdvisorTask");
        final ConfigureAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                ConfigureAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ConfigureAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticSpmEvolveAdvisorTask");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        ConfigureAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getConfigureAutomaticSpmEvolveAdvisorTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDbManagementPrivateEndpointResponse createDbManagementPrivateEndpoint(
            CreateDbManagementPrivateEndpointRequest request) {
        LOG.trace("Called createDbManagementPrivateEndpoint");
        final CreateDbManagementPrivateEndpointRequest interceptedRequest =
                CreateDbManagementPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/CreateDbManagementPrivateEndpoint");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDbManagementPrivateEndpointResponse>
                transformer =
                        CreateDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateDbManagementPrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalDbSystemResponse createExternalDbSystem(
            CreateExternalDbSystemRequest request) {
        LOG.trace("Called createExternalDbSystem");
        final CreateExternalDbSystemRequest interceptedRequest =
                CreateExternalDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/CreateExternalDbSystem");
        java.util.function.Function<javax.ws.rs.core.Response, CreateExternalDbSystemResponse>
                transformer =
                        CreateExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateExternalDbSystemDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalDbSystemConnectorResponse createExternalDbSystemConnector(
            CreateExternalDbSystemConnectorRequest request) {
        LOG.trace("Called createExternalDbSystemConnector");
        final CreateExternalDbSystemConnectorRequest interceptedRequest =
                CreateExternalDbSystemConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CreateExternalDbSystemConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalDbSystemConnectorResponse>
                transformer =
                        CreateExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateExternalDbSystemConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalDbSystemDiscoveryResponse createExternalDbSystemDiscovery(
            CreateExternalDbSystemDiscoveryRequest request) {
        LOG.trace("Called createExternalDbSystemDiscovery");
        final CreateExternalDbSystemDiscoveryRequest interceptedRequest =
                CreateExternalDbSystemDiscoveryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/CreateExternalDbSystemDiscovery");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalDbSystemDiscoveryResponse>
                transformer =
                        CreateExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateExternalDbSystemDiscoveryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalExadataInfrastructureResponse createExternalExadataInfrastructure(
            CreateExternalExadataInfrastructureRequest request) {
        LOG.trace("Called createExternalExadataInfrastructure");
        final CreateExternalExadataInfrastructureRequest interceptedRequest =
                CreateExternalExadataInfrastructureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/CreateExternalExadataInfrastructure");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalExadataInfrastructureResponse>
                transformer =
                        CreateExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateExternalExadataInfrastructureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalExadataStorageConnectorResponse createExternalExadataStorageConnector(
            CreateExternalExadataStorageConnectorRequest request) {
        LOG.trace("Called createExternalExadataStorageConnector");
        final CreateExternalExadataStorageConnectorRequest interceptedRequest =
                CreateExternalExadataStorageConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CreateExternalExadataStorageConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalExadataStorageConnectorResponse>
                transformer =
                        CreateExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateExternalExadataStorageConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateJobResponse createJob(CreateJobRequest request) {
        LOG.trace("Called createJob");
        final CreateJobRequest interceptedRequest = CreateJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/CreateJob");
        java.util.function.Function<javax.ws.rs.core.Response, CreateJobResponse> transformer =
                CreateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateManagedDatabaseGroupResponse createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request) {
        LOG.trace("Called createManagedDatabaseGroup");
        final CreateManagedDatabaseGroupRequest interceptedRequest =
                CreateManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/CreateManagedDatabaseGroup");
        java.util.function.Function<javax.ws.rs.core.Response, CreateManagedDatabaseGroupResponse>
                transformer =
                        CreateManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getCreateManagedDatabaseGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateNamedCredentialResponse createNamedCredential(
            CreateNamedCredentialRequest request) {
        LOG.trace("Called createNamedCredential");
        final CreateNamedCredentialRequest interceptedRequest =
                CreateNamedCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNamedCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/CreateNamedCredential");
        java.util.function.Function<javax.ws.rs.core.Response, CreateNamedCredentialResponse>
                transformer =
                        CreateNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateNamedCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTablespaceResponse createTablespace(CreateTablespaceRequest request) {
        LOG.trace("Called createTablespace");
        final CreateTablespaceRequest interceptedRequest =
                CreateTablespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTablespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/CreateTablespace");
        java.util.function.Function<javax.ws.rs.core.Response, CreateTablespaceResponse>
                transformer =
                        CreateTablespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getCreateTablespaceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteDbManagementPrivateEndpointResponse deleteDbManagementPrivateEndpoint(
            DeleteDbManagementPrivateEndpointRequest request) {
        LOG.trace("Called deleteDbManagementPrivateEndpoint");
        final DeleteDbManagementPrivateEndpointRequest interceptedRequest =
                DeleteDbManagementPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/DeleteDbManagementPrivateEndpoint");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDbManagementPrivateEndpointResponse>
                transformer =
                        DeleteDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteExternalDbSystemResponse deleteExternalDbSystem(
            DeleteExternalDbSystemRequest request) {
        LOG.trace("Called deleteExternalDbSystem");
        final DeleteExternalDbSystemRequest interceptedRequest =
                DeleteExternalDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DeleteExternalDbSystem");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteExternalDbSystemResponse>
                transformer =
                        DeleteExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteExternalDbSystemConnectorResponse deleteExternalDbSystemConnector(
            DeleteExternalDbSystemConnectorRequest request) {
        LOG.trace("Called deleteExternalDbSystemConnector");
        final DeleteExternalDbSystemConnectorRequest interceptedRequest =
                DeleteExternalDbSystemConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/DeleteExternalDbSystemConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalDbSystemConnectorResponse>
                transformer =
                        DeleteExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteExternalDbSystemDiscoveryResponse deleteExternalDbSystemDiscovery(
            DeleteExternalDbSystemDiscoveryRequest request) {
        LOG.trace("Called deleteExternalDbSystemDiscovery");
        final DeleteExternalDbSystemDiscoveryRequest interceptedRequest =
                DeleteExternalDbSystemDiscoveryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/DeleteExternalDbSystemDiscovery");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalDbSystemDiscoveryResponse>
                transformer =
                        DeleteExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteExternalExadataInfrastructureResponse deleteExternalExadataInfrastructure(
            DeleteExternalExadataInfrastructureRequest request) {
        LOG.trace("Called deleteExternalExadataInfrastructure");
        final DeleteExternalExadataInfrastructureRequest interceptedRequest =
                DeleteExternalExadataInfrastructureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DeleteExternalExadataInfrastructure");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalExadataInfrastructureResponse>
                transformer =
                        DeleteExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteExternalExadataStorageConnectorResponse deleteExternalExadataStorageConnector(
            DeleteExternalExadataStorageConnectorRequest request) {
        LOG.trace("Called deleteExternalExadataStorageConnector");
        final DeleteExternalExadataStorageConnectorRequest interceptedRequest =
                DeleteExternalExadataStorageConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/DeleteExternalExadataStorageConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalExadataStorageConnectorResponse>
                transformer =
                        DeleteExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        LOG.trace("Called deleteJob");
        final DeleteJobRequest interceptedRequest = DeleteJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/DeleteJob");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteJobResponse> transformer =
                DeleteJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteManagedDatabaseGroupResponse deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request) {
        LOG.trace("Called deleteManagedDatabaseGroup");
        final DeleteManagedDatabaseGroupRequest interceptedRequest =
                DeleteManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/DeleteManagedDatabaseGroup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteManagedDatabaseGroupResponse>
                transformer =
                        DeleteManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeleteNamedCredentialResponse deleteNamedCredential(
            DeleteNamedCredentialRequest request) {
        LOG.trace("Called deleteNamedCredential");
        final DeleteNamedCredentialRequest interceptedRequest =
                DeleteNamedCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNamedCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/DeleteNamedCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteNamedCredentialResponse>
                transformer =
                        DeleteNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DeletePreferredCredentialResponse deletePreferredCredential(
            DeletePreferredCredentialRequest request) {
        LOG.trace("Called deletePreferredCredential");
        final DeletePreferredCredentialRequest interceptedRequest =
                DeletePreferredCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePreferredCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeletePreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/DeletePreferredCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeletePreferredCredentialResponse>
                transformer =
                        DeletePreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DisableAutomaticInitialPlanCaptureResponse disableAutomaticInitialPlanCapture(
            DisableAutomaticInitialPlanCaptureRequest request) {
        LOG.trace("Called disableAutomaticInitialPlanCapture");
        final DisableAutomaticInitialPlanCaptureRequest interceptedRequest =
                DisableAutomaticInitialPlanCaptureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutomaticInitialPlanCaptureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutomaticInitialPlanCapture",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticInitialPlanCapture");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DisableAutomaticInitialPlanCaptureResponse>
                transformer =
                        DisableAutomaticInitialPlanCaptureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableAutomaticInitialPlanCaptureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableAutomaticSpmEvolveAdvisorTaskResponse disableAutomaticSpmEvolveAdvisorTask(
            DisableAutomaticSpmEvolveAdvisorTaskRequest request) {
        LOG.trace("Called disableAutomaticSpmEvolveAdvisorTask");
        final DisableAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                DisableAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticSpmEvolveAdvisorTask");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DisableAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        DisableAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableAutomaticSpmEvolveAdvisorTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableAutonomousDatabaseManagementFeatureResponse
            disableAutonomousDatabaseManagementFeature(
                    DisableAutonomousDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disableAutonomousDatabaseManagementFeature");
        final DisableAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                DisableAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutonomousDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        DisableAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableAutonomousDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableDatabaseManagementFeatureResponse disableDatabaseManagementFeature(
            DisableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disableDatabaseManagementFeature");
        final DisableDatabaseManagementFeatureRequest interceptedRequest =
                DisableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DisableDatabaseManagementFeatureResponse>
                transformer =
                        DisableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableExternalContainerDatabaseManagementFeatureResponse
            disableExternalContainerDatabaseManagementFeature(
                    DisableExternalContainerDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disableExternalContainerDatabaseManagementFeature");
        final DisableExternalContainerDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalContainerDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalContainerDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableExternalContainerDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableExternalDbSystemDatabaseManagementResponse
            disableExternalDbSystemDatabaseManagement(
                    DisableExternalDbSystemDatabaseManagementRequest request) {
        LOG.trace("Called disableExternalDbSystemDatabaseManagement");
        final DisableExternalDbSystemDatabaseManagementRequest interceptedRequest =
                DisableExternalDbSystemDatabaseManagementConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalDbSystemDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemDatabaseManagement");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalDbSystemDatabaseManagementResponse>
                transformer =
                        DisableExternalDbSystemDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DisableExternalDbSystemStackMonitoringResponse disableExternalDbSystemStackMonitoring(
            DisableExternalDbSystemStackMonitoringRequest request) {
        LOG.trace("Called disableExternalDbSystemStackMonitoring");
        final DisableExternalDbSystemStackMonitoringRequest interceptedRequest =
                DisableExternalDbSystemStackMonitoringConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalDbSystemStackMonitoringConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemStackMonitoring",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemStackMonitoring");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DisableExternalDbSystemStackMonitoringResponse>
                transformer =
                        DisableExternalDbSystemStackMonitoringConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DisableExternalExadataInfrastructureManagementResponse
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request) {
        LOG.trace("Called disableExternalExadataInfrastructureManagement");
        final DisableExternalExadataInfrastructureManagementRequest interceptedRequest =
                DisableExternalExadataInfrastructureManagementConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalExadataInfrastructureManagementConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalExadataInfrastructureManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DisableExternalExadataInfrastructureManagement");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalExadataInfrastructureManagementResponse>
                transformer =
                        DisableExternalExadataInfrastructureManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public DisableExternalNonContainerDatabaseManagementFeatureResponse
            disableExternalNonContainerDatabaseManagementFeature(
                    DisableExternalNonContainerDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disableExternalNonContainerDatabaseManagementFeature");
        final DisableExternalNonContainerDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalNonContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalNonContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalNonContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalNonContainerDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalNonContainerDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalNonContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableExternalNonContainerDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableExternalPluggableDatabaseManagementFeatureResponse
            disableExternalPluggableDatabaseManagementFeature(
                    DisableExternalPluggableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disableExternalPluggableDatabaseManagementFeature");
        final DisableExternalPluggableDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalPluggableDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalPluggableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalPluggableDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableExternalPluggableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request) {
        LOG.trace("Called disableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisablePluggableDatabaseManagementFeatureResponse
            disablePluggableDatabaseManagementFeature(
                    DisablePluggableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called disablePluggableDatabaseManagementFeature");
        final DisablePluggableDatabaseManagementFeatureRequest interceptedRequest =
                DisablePluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisablePluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisablePluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisablePluggableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisablePluggableDatabaseManagementFeatureResponse>
                transformer =
                        DisablePluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisablePluggableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DisableSqlPlanBaselinesUsageResponse disableSqlPlanBaselinesUsage(
            DisableSqlPlanBaselinesUsageRequest request) {
        LOG.trace("Called disableSqlPlanBaselinesUsage");
        final DisableSqlPlanBaselinesUsageRequest interceptedRequest =
                DisableSqlPlanBaselinesUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableSqlPlanBaselinesUsageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableSqlPlanBaselinesUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableSqlPlanBaselinesUsage");
        java.util.function.Function<javax.ws.rs.core.Response, DisableSqlPlanBaselinesUsageResponse>
                transformer =
                        DisableSqlPlanBaselinesUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDisableSqlPlanBaselinesUsageDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DiscoverExternalExadataInfrastructureResponse discoverExternalExadataInfrastructure(
            DiscoverExternalExadataInfrastructureRequest request) {
        LOG.trace("Called discoverExternalExadataInfrastructure");
        final DiscoverExternalExadataInfrastructureRequest interceptedRequest =
                DiscoverExternalExadataInfrastructureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DiscoverExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DiscoverExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DiscoverExternalExadataInfrastructure");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DiscoverExternalExadataInfrastructureResponse>
                transformer =
                        DiscoverExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getDiscoverExternalExadataInfrastructureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DropSqlPlanBaselinesResponse dropSqlPlanBaselines(DropSqlPlanBaselinesRequest request) {
        LOG.trace("Called dropSqlPlanBaselines");
        final DropSqlPlanBaselinesRequest interceptedRequest =
                DropSqlPlanBaselinesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DropSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DropSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DropSqlPlanBaselines");
        java.util.function.Function<javax.ws.rs.core.Response, DropSqlPlanBaselinesResponse>
                transformer =
                        DropSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getDropSqlPlanBaselinesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DropTablespaceResponse dropTablespace(DropTablespaceRequest request) {
        LOG.trace("Called dropTablespace");
        final DropTablespaceRequest interceptedRequest =
                DropTablespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DropTablespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DropTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/DropTablespace");
        java.util.function.Function<javax.ws.rs.core.Response, DropTablespaceResponse> transformer =
                DropTablespaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getDropTablespaceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableAutomaticInitialPlanCaptureResponse enableAutomaticInitialPlanCapture(
            EnableAutomaticInitialPlanCaptureRequest request) {
        LOG.trace("Called enableAutomaticInitialPlanCapture");
        final EnableAutomaticInitialPlanCaptureRequest interceptedRequest =
                EnableAutomaticInitialPlanCaptureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutomaticInitialPlanCaptureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutomaticInitialPlanCapture",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticInitialPlanCapture");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnableAutomaticInitialPlanCaptureResponse>
                transformer =
                        EnableAutomaticInitialPlanCaptureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableAutomaticInitialPlanCaptureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableAutomaticSpmEvolveAdvisorTaskResponse enableAutomaticSpmEvolveAdvisorTask(
            EnableAutomaticSpmEvolveAdvisorTaskRequest request) {
        LOG.trace("Called enableAutomaticSpmEvolveAdvisorTask");
        final EnableAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                EnableAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticSpmEvolveAdvisorTask");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnableAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        EnableAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableAutomaticSpmEvolveAdvisorTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableAutonomousDatabaseManagementFeatureResponse
            enableAutonomousDatabaseManagementFeature(
                    EnableAutonomousDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enableAutonomousDatabaseManagementFeature");
        final EnableAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                EnableAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutonomousDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        EnableAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableAutonomousDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableDatabaseManagementFeatureResponse enableDatabaseManagementFeature(
            EnableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enableDatabaseManagementFeature");
        final EnableDatabaseManagementFeatureRequest interceptedRequest =
                EnableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnableDatabaseManagementFeatureResponse>
                transformer =
                        EnableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalContainerDatabaseManagementFeatureResponse
            enableExternalContainerDatabaseManagementFeature(
                    EnableExternalContainerDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enableExternalContainerDatabaseManagementFeature");
        final EnableExternalContainerDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalContainerDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalContainerDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalContainerDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalContainerDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalDbSystemDatabaseManagementResponse
            enableExternalDbSystemDatabaseManagement(
                    EnableExternalDbSystemDatabaseManagementRequest request) {
        LOG.trace("Called enableExternalDbSystemDatabaseManagement");
        final EnableExternalDbSystemDatabaseManagementRequest interceptedRequest =
                EnableExternalDbSystemDatabaseManagementConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalDbSystemDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemDatabaseManagement");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnableExternalDbSystemDatabaseManagementResponse>
                transformer =
                        EnableExternalDbSystemDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalDbSystemDatabaseManagementDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalDbSystemStackMonitoringResponse enableExternalDbSystemStackMonitoring(
            EnableExternalDbSystemStackMonitoringRequest request) {
        LOG.trace("Called enableExternalDbSystemStackMonitoring");
        final EnableExternalDbSystemStackMonitoringRequest interceptedRequest =
                EnableExternalDbSystemStackMonitoringConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalDbSystemStackMonitoringConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemStackMonitoring",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemStackMonitoring");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnableExternalDbSystemStackMonitoringResponse>
                transformer =
                        EnableExternalDbSystemStackMonitoringConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalDbSystemStackMonitoringDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalExadataInfrastructureManagementResponse
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request) {
        LOG.trace("Called enableExternalExadataInfrastructureManagement");
        final EnableExternalExadataInfrastructureManagementRequest interceptedRequest =
                EnableExternalExadataInfrastructureManagementConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalExadataInfrastructureManagementConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalExadataInfrastructureManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/EnableExternalExadataInfrastructureManagement");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalExadataInfrastructureManagementResponse>
                transformer =
                        EnableExternalExadataInfrastructureManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalExadataInfrastructureManagementDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalNonContainerDatabaseManagementFeatureResponse
            enableExternalNonContainerDatabaseManagementFeature(
                    EnableExternalNonContainerDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enableExternalNonContainerDatabaseManagementFeature");
        final EnableExternalNonContainerDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalNonContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalNonContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalNonContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalNonContainerDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalNonContainerDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalNonContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalNonContainerDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableExternalPluggableDatabaseManagementFeatureResponse
            enableExternalPluggableDatabaseManagementFeature(
                    EnableExternalPluggableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enableExternalPluggableDatabaseManagementFeature");
        final EnableExternalPluggableDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalPluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalPluggableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalPluggableDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableExternalPluggableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request) {
        LOG.trace("Called enableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnablePluggableDatabaseManagementFeatureResponse
            enablePluggableDatabaseManagementFeature(
                    EnablePluggableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called enablePluggableDatabaseManagementFeature");
        final EnablePluggableDatabaseManagementFeatureRequest interceptedRequest =
                EnablePluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnablePluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnablePluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnablePluggableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response, EnablePluggableDatabaseManagementFeatureResponse>
                transformer =
                        EnablePluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnablePluggableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableSqlPlanBaselinesUsageResponse enableSqlPlanBaselinesUsage(
            EnableSqlPlanBaselinesUsageRequest request) {
        LOG.trace("Called enableSqlPlanBaselinesUsage");
        final EnableSqlPlanBaselinesUsageRequest interceptedRequest =
                EnableSqlPlanBaselinesUsageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableSqlPlanBaselinesUsageConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableSqlPlanBaselinesUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableSqlPlanBaselinesUsage");
        java.util.function.Function<javax.ws.rs.core.Response, EnableSqlPlanBaselinesUsageResponse>
                transformer =
                        EnableSqlPlanBaselinesUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getEnableSqlPlanBaselinesUsageDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateAwrSnapshotResponse generateAwrSnapshot(GenerateAwrSnapshotRequest request) {
        LOG.trace("Called generateAwrSnapshot");
        final GenerateAwrSnapshotRequest interceptedRequest =
                GenerateAwrSnapshotConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAwrSnapshotConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GenerateAwrSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/SnapshotDetails/GenerateAwrSnapshot");
        java.util.function.Function<javax.ws.rs.core.Response, GenerateAwrSnapshotResponse>
                transformer =
                        GenerateAwrSnapshotConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetAwrDbReportResponse getAwrDbReport(GetAwrDbReportRequest request) {
        LOG.trace("Called getAwrDbReport");
        final GetAwrDbReportRequest interceptedRequest =
                GetAwrDbReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetAwrDbReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbReport");
        java.util.function.Function<javax.ws.rs.core.Response, GetAwrDbReportResponse> transformer =
                GetAwrDbReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAwrDbSqlReportResponse getAwrDbSqlReport(GetAwrDbSqlReportRequest request) {
        LOG.trace("Called getAwrDbSqlReport");
        final GetAwrDbSqlReportRequest interceptedRequest =
                GetAwrDbSqlReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbSqlReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetAwrDbSqlReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbSqlReport");
        java.util.function.Function<javax.ws.rs.core.Response, GetAwrDbSqlReportResponse>
                transformer =
                        GetAwrDbSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetClusterCacheMetricResponse getClusterCacheMetric(
            GetClusterCacheMetricRequest request) {
        LOG.trace("Called getClusterCacheMetric");
        final GetClusterCacheMetricRequest interceptedRequest =
                GetClusterCacheMetricConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetClusterCacheMetricConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetClusterCacheMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ClusterCacheMetric/GetClusterCacheMetric");
        java.util.function.Function<javax.ws.rs.core.Response, GetClusterCacheMetricResponse>
                transformer =
                        GetClusterCacheMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetDatabaseFleetHealthMetricsResponse getDatabaseFleetHealthMetrics(
            GetDatabaseFleetHealthMetricsRequest request) {
        LOG.trace("Called getDatabaseFleetHealthMetrics");
        final GetDatabaseFleetHealthMetricsRequest interceptedRequest =
                GetDatabaseFleetHealthMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetHealthMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseFleetHealthMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetHealthMetrics/GetDatabaseFleetHealthMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetHealthMetricsResponse>
                transformer =
                        GetDatabaseFleetHealthMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetDatabaseHomeMetricsResponse getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request) {
        LOG.trace("Called getDatabaseHomeMetrics");
        final GetDatabaseHomeMetricsRequest interceptedRequest =
                GetDatabaseHomeMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseHomeMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseHomeMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseHomeMetrics/GetDatabaseHomeMetrics");
        java.util.function.Function<javax.ws.rs.core.Response, GetDatabaseHomeMetricsResponse>
                transformer =
                        GetDatabaseHomeMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetDataguardPerformanceMetricsResponse getDataguardPerformanceMetrics(
            GetDataguardPerformanceMetricsRequest request) {
        LOG.trace("Called getDataguardPerformanceMetrics");
        final GetDataguardPerformanceMetricsRequest interceptedRequest =
                GetDataguardPerformanceMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataguardPerformanceMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDataguardPerformanceMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DataguardPerformanceMetrics/GetDataguardPerformanceMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetDataguardPerformanceMetricsResponse>
                transformer =
                        GetDataguardPerformanceMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetDbManagementPrivateEndpointResponse getDbManagementPrivateEndpoint(
            GetDbManagementPrivateEndpointRequest request) {
        LOG.trace("Called getDbManagementPrivateEndpoint");
        final GetDbManagementPrivateEndpointRequest interceptedRequest =
                GetDbManagementPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/GetDbManagementPrivateEndpoint");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetDbManagementPrivateEndpointResponse>
                transformer =
                        GetDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalAsmResponse getExternalAsm(GetExternalAsmRequest request) {
        LOG.trace("Called getExternalAsm");
        final GetExternalAsmRequest interceptedRequest =
                GetExternalAsmConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsm");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalAsmResponse> transformer =
                GetExternalAsmConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetExternalAsmConfigurationResponse getExternalAsmConfiguration(
            GetExternalAsmConfigurationRequest request) {
        LOG.trace("Called getExternalAsmConfiguration");
        final GetExternalAsmConfigurationRequest interceptedRequest =
                GetExternalAsmConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsmConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsmConfiguration");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalAsmConfigurationResponse>
                transformer =
                        GetExternalAsmConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalAsmInstanceResponse getExternalAsmInstance(
            GetExternalAsmInstanceRequest request) {
        LOG.trace("Called getExternalAsmInstance");
        final GetExternalAsmInstanceRequest interceptedRequest =
                GetExternalAsmInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmInstanceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsmInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/GetExternalAsmInstance");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalAsmInstanceResponse>
                transformer =
                        GetExternalAsmInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalClusterResponse getExternalCluster(GetExternalClusterRequest request) {
        LOG.trace("Called getExternalCluster");
        final GetExternalClusterRequest interceptedRequest =
                GetExternalClusterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalClusterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/GetExternalCluster");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalClusterResponse>
                transformer =
                        GetExternalClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalClusterInstanceResponse getExternalClusterInstance(
            GetExternalClusterInstanceRequest request) {
        LOG.trace("Called getExternalClusterInstance");
        final GetExternalClusterInstanceRequest interceptedRequest =
                GetExternalClusterInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalClusterInstanceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalClusterInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/GetExternalClusterInstance");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalClusterInstanceResponse>
                transformer =
                        GetExternalClusterInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalDbHomeResponse getExternalDbHome(GetExternalDbHomeRequest request) {
        LOG.trace("Called getExternalDbHome");
        final GetExternalDbHomeRequest interceptedRequest =
                GetExternalDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbHomeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbHome",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/GetExternalDbHome");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbHomeResponse>
                transformer =
                        GetExternalDbHomeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalDbNodeResponse getExternalDbNode(GetExternalDbNodeRequest request) {
        LOG.trace("Called getExternalDbNode");
        final GetExternalDbNodeRequest interceptedRequest =
                GetExternalDbNodeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbNodeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/GetExternalDbNode");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbNodeResponse>
                transformer =
                        GetExternalDbNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalDbSystemResponse getExternalDbSystem(GetExternalDbSystemRequest request) {
        LOG.trace("Called getExternalDbSystem");
        final GetExternalDbSystemRequest interceptedRequest =
                GetExternalDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/GetExternalDbSystem");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbSystemResponse>
                transformer =
                        GetExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalDbSystemConnectorResponse getExternalDbSystemConnector(
            GetExternalDbSystemConnectorRequest request) {
        LOG.trace("Called getExternalDbSystemConnector");
        final GetExternalDbSystemConnectorRequest interceptedRequest =
                GetExternalDbSystemConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/GetExternalDbSystemConnector");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbSystemConnectorResponse>
                transformer =
                        GetExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalDbSystemDiscoveryResponse getExternalDbSystemDiscovery(
            GetExternalDbSystemDiscoveryRequest request) {
        LOG.trace("Called getExternalDbSystemDiscovery");
        final GetExternalDbSystemDiscoveryRequest interceptedRequest =
                GetExternalDbSystemDiscoveryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/GetExternalDbSystemDiscovery");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbSystemDiscoveryResponse>
                transformer =
                        GetExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalExadataInfrastructureResponse getExternalExadataInfrastructure(
            GetExternalExadataInfrastructureRequest request) {
        LOG.trace("Called getExternalExadataInfrastructure");
        final GetExternalExadataInfrastructureRequest interceptedRequest =
                GetExternalExadataInfrastructureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataInfrastructureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/GetExternalExadataInfrastructure");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataInfrastructureResponse>
                transformer =
                        GetExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalExadataStorageConnectorResponse getExternalExadataStorageConnector(
            GetExternalExadataStorageConnectorRequest request) {
        LOG.trace("Called getExternalExadataStorageConnector");
        final GetExternalExadataStorageConnectorRequest interceptedRequest =
                GetExternalExadataStorageConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/GetExternalExadataStorageConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageConnectorResponse>
                transformer =
                        GetExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalExadataStorageGridResponse getExternalExadataStorageGrid(
            GetExternalExadataStorageGridRequest request) {
        LOG.trace("Called getExternalExadataStorageGrid");
        final GetExternalExadataStorageGridRequest interceptedRequest =
                GetExternalExadataStorageGridConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageGridConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageGrid",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/GetExternalExadataStorageGrid");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageGridResponse>
                transformer =
                        GetExternalExadataStorageGridConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalExadataStorageServerResponse getExternalExadataStorageServer(
            GetExternalExadataStorageServerRequest request) {
        LOG.trace("Called getExternalExadataStorageServer");
        final GetExternalExadataStorageServerRequest interceptedRequest =
                GetExternalExadataStorageServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetExternalExadataStorageServer");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageServerResponse>
                transformer =
                        GetExternalExadataStorageServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetExternalListenerResponse getExternalListener(GetExternalListenerRequest request) {
        LOG.trace("Called getExternalListener");
        final GetExternalListenerRequest interceptedRequest =
                GetExternalListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalListenerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/GetExternalListener");
        java.util.function.Function<javax.ws.rs.core.Response, GetExternalListenerResponse>
                transformer =
                        GetExternalListenerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetIormPlanResponse getIormPlan(GetIormPlanRequest request) {
        LOG.trace("Called getIormPlan");
        final GetIormPlanRequest interceptedRequest =
                GetIormPlanConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIormPlanConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetIormPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetIormPlan");
        java.util.function.Function<javax.ws.rs.core.Response, GetIormPlanResponse> transformer =
                GetIormPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetJobResponse getJob(GetJobRequest request) {
        LOG.trace("Called getJob");
        final GetJobRequest interceptedRequest = GetJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/GetJob");
        java.util.function.Function<javax.ws.rs.core.Response, GetJobResponse> transformer =
                GetJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request) {
        LOG.trace("Called getJobExecution");
        final GetJobExecutionRequest interceptedRequest =
                GetJobExecutionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobExecutionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJobExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/GetJobExecution");
        java.util.function.Function<javax.ws.rs.core.Response, GetJobExecutionResponse>
                transformer =
                        GetJobExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetJobRunResponse getJobRun(GetJobRunRequest request) {
        LOG.trace("Called getJobRun");
        final GetJobRunRequest interceptedRequest = GetJobRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobRunConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/GetJobRun");
        java.util.function.Function<javax.ws.rs.core.Response, GetJobRunResponse> transformer =
                GetJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetManagedDatabaseResponse getManagedDatabase(GetManagedDatabaseRequest request) {
        LOG.trace("Called getManagedDatabase");
        final GetManagedDatabaseRequest interceptedRequest =
                GetManagedDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetManagedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetManagedDatabase");
        java.util.function.Function<javax.ws.rs.core.Response, GetManagedDatabaseResponse>
                transformer =
                        GetManagedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetManagedDatabaseGroupResponse getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request) {
        LOG.trace("Called getManagedDatabaseGroup");
        final GetManagedDatabaseGroupRequest interceptedRequest =
                GetManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/GetManagedDatabaseGroup");
        java.util.function.Function<javax.ws.rs.core.Response, GetManagedDatabaseGroupResponse>
                transformer =
                        GetManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetNamedCredentialResponse getNamedCredential(GetNamedCredentialRequest request) {
        LOG.trace("Called getNamedCredential");
        final GetNamedCredentialRequest interceptedRequest =
                GetNamedCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamedCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/GetNamedCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetNamedCredentialResponse>
                transformer =
                        GetNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetOpenAlertHistoryResponse getOpenAlertHistory(GetOpenAlertHistoryRequest request) {
        LOG.trace("Called getOpenAlertHistory");
        final GetOpenAlertHistoryRequest interceptedRequest =
                GetOpenAlertHistoryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOpenAlertHistoryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOpenAlertHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetOpenAlertHistory");
        java.util.function.Function<javax.ws.rs.core.Response, GetOpenAlertHistoryResponse>
                transformer =
                        GetOpenAlertHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetOptimizerStatisticsAdvisorExecutionResponse getOptimizerStatisticsAdvisorExecution(
            GetOptimizerStatisticsAdvisorExecutionRequest request) {
        LOG.trace("Called getOptimizerStatisticsAdvisorExecution");
        final GetOptimizerStatisticsAdvisorExecutionRequest interceptedRequest =
                GetOptimizerStatisticsAdvisorExecutionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsAdvisorExecutionConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecution");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetOptimizerStatisticsAdvisorExecutionResponse>
                transformer =
                        GetOptimizerStatisticsAdvisorExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetOptimizerStatisticsAdvisorExecutionScriptResponse
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request) {
        LOG.trace("Called getOptimizerStatisticsAdvisorExecutionScript");
        final GetOptimizerStatisticsAdvisorExecutionScriptRequest interceptedRequest =
                GetOptimizerStatisticsAdvisorExecutionScriptConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsAdvisorExecutionScriptConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecutionScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecutionScript");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                transformer =
                        GetOptimizerStatisticsAdvisorExecutionScriptConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetOptimizerStatisticsCollectionOperationResponse
            getOptimizerStatisticsCollectionOperation(
                    GetOptimizerStatisticsCollectionOperationRequest request) {
        LOG.trace("Called getOptimizerStatisticsCollectionOperation");
        final GetOptimizerStatisticsCollectionOperationRequest interceptedRequest =
                GetOptimizerStatisticsCollectionOperationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsCollectionOperationConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsCollectionOperation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsCollectionOperation");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetOptimizerStatisticsCollectionOperationResponse>
                transformer =
                        GetOptimizerStatisticsCollectionOperationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetPdbMetricsResponse getPdbMetrics(GetPdbMetricsRequest request) {
        LOG.trace("Called getPdbMetrics");
        final GetPdbMetricsRequest interceptedRequest =
                GetPdbMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPdbMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPdbMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PdbMetrics/GetPdbMetrics");
        java.util.function.Function<javax.ws.rs.core.Response, GetPdbMetricsResponse> transformer =
                GetPdbMetricsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetPeerDatabaseMetricsResponse getPeerDatabaseMetrics(
            GetPeerDatabaseMetricsRequest request) {
        LOG.trace("Called getPeerDatabaseMetrics");
        final GetPeerDatabaseMetricsRequest interceptedRequest =
                GetPeerDatabaseMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPeerDatabaseMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPeerDatabaseMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PeerDatabaseMetrics/GetPeerDatabaseMetrics");
        java.util.function.Function<javax.ws.rs.core.Response, GetPeerDatabaseMetricsResponse>
                transformer =
                        GetPeerDatabaseMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetPreferredCredentialResponse getPreferredCredential(
            GetPreferredCredentialRequest request) {
        LOG.trace("Called getPreferredCredential");
        final GetPreferredCredentialRequest interceptedRequest =
                GetPreferredCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreferredCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/GetPreferredCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetPreferredCredentialResponse>
                transformer =
                        GetPreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetSqlPlanBaselineResponse getSqlPlanBaseline(GetSqlPlanBaselineRequest request) {
        LOG.trace("Called getSqlPlanBaseline");
        final GetSqlPlanBaselineRequest interceptedRequest =
                GetSqlPlanBaselineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlPlanBaselineConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetSqlPlanBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaseline");
        java.util.function.Function<javax.ws.rs.core.Response, GetSqlPlanBaselineResponse>
                transformer =
                        GetSqlPlanBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetSqlPlanBaselineConfigurationResponse getSqlPlanBaselineConfiguration(
            GetSqlPlanBaselineConfigurationRequest request) {
        LOG.trace("Called getSqlPlanBaselineConfiguration");
        final GetSqlPlanBaselineConfigurationRequest interceptedRequest =
                GetSqlPlanBaselineConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlPlanBaselineConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetSqlPlanBaselineConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaselineConfiguration");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetSqlPlanBaselineConfigurationResponse>
                transformer =
                        GetSqlPlanBaselineConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetTablespaceResponse getTablespace(GetTablespaceRequest request) {
        LOG.trace("Called getTablespace");
        final GetTablespaceRequest interceptedRequest =
                GetTablespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTablespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/GetTablespace");
        java.util.function.Function<javax.ws.rs.core.Response, GetTablespaceResponse> transformer =
                GetTablespaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetTopSqlCpuActivityResponse getTopSqlCpuActivity(GetTopSqlCpuActivityRequest request) {
        LOG.trace("Called getTopSqlCpuActivity");
        final GetTopSqlCpuActivityRequest interceptedRequest =
                GetTopSqlCpuActivityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTopSqlCpuActivityConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetTopSqlCpuActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetTopSqlCpuActivity");
        java.util.function.Function<javax.ws.rs.core.Response, GetTopSqlCpuActivityResponse>
                transformer =
                        GetTopSqlCpuActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public GetUserResponse getUser(GetUserRequest request) {
        LOG.trace("Called getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetUser");
        java.util.function.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        "DbManagement",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/GetWorkRequest");
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
    public ImplementOptimizerStatisticsAdvisorRecommendationsResponse
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request) {
        LOG.trace("Called implementOptimizerStatisticsAdvisorRecommendations");
        final ImplementOptimizerStatisticsAdvisorRecommendationsRequest interceptedRequest =
                ImplementOptimizerStatisticsAdvisorRecommendationsConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImplementOptimizerStatisticsAdvisorRecommendationsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ImplementOptimizerStatisticsAdvisorRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ImplementOptimizerStatisticsAdvisorRecommendations");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                transformer =
                        ImplementOptimizerStatisticsAdvisorRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getImplementOptimizerStatisticsAdvisorRecommendationsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListAsmPropertiesResponse listAsmProperties(ListAsmPropertiesRequest request) {
        LOG.trace("Called listAsmProperties");
        final ListAsmPropertiesRequest interceptedRequest =
                ListAsmPropertiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAsmPropertiesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAsmProperties",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAsmProperties");
        java.util.function.Function<javax.ws.rs.core.Response, ListAsmPropertiesResponse>
                transformer =
                        ListAsmPropertiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListAssociatedDatabasesResponse listAssociatedDatabases(
            ListAssociatedDatabasesRequest request) {
        LOG.trace("Called listAssociatedDatabases");
        final ListAssociatedDatabasesRequest interceptedRequest =
                ListAssociatedDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociatedDatabasesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAssociatedDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AssociatedDatabaseSummary/ListAssociatedDatabases");
        java.util.function.Function<javax.ws.rs.core.Response, ListAssociatedDatabasesResponse>
                transformer =
                        ListAssociatedDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListAwrDbSnapshotsResponse listAwrDbSnapshots(ListAwrDbSnapshotsRequest request) {
        LOG.trace("Called listAwrDbSnapshots");
        final ListAwrDbSnapshotsRequest interceptedRequest =
                ListAwrDbSnapshotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbSnapshotsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAwrDbSnapshots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbSnapshots");
        java.util.function.Function<javax.ws.rs.core.Response, ListAwrDbSnapshotsResponse>
                transformer =
                        ListAwrDbSnapshotsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListAwrDbsResponse listAwrDbs(ListAwrDbsRequest request) {
        LOG.trace("Called listAwrDbs");
        final ListAwrDbsRequest interceptedRequest = ListAwrDbsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAwrDbs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbs");
        java.util.function.Function<javax.ws.rs.core.Response, ListAwrDbsResponse> transformer =
                ListAwrDbsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListConsumerGroupPrivilegesResponse listConsumerGroupPrivileges(
            ListConsumerGroupPrivilegesRequest request) {
        LOG.trace("Called listConsumerGroupPrivileges");
        final ListConsumerGroupPrivilegesRequest interceptedRequest =
                ListConsumerGroupPrivilegesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsumerGroupPrivilegesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListConsumerGroupPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListConsumerGroupPrivileges");
        java.util.function.Function<javax.ws.rs.core.Response, ListConsumerGroupPrivilegesResponse>
                transformer =
                        ListConsumerGroupPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListCursorCacheStatementsResponse listCursorCacheStatements(
            ListCursorCacheStatementsRequest request) {
        LOG.trace("Called listCursorCacheStatements");
        final ListCursorCacheStatementsRequest interceptedRequest =
                ListCursorCacheStatementsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCursorCacheStatementsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListCursorCacheStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListCursorCacheStatements");
        java.util.function.Function<javax.ws.rs.core.Response, ListCursorCacheStatementsResponse>
                transformer =
                        ListCursorCacheStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListDataAccessContainersResponse listDataAccessContainers(
            ListDataAccessContainersRequest request) {
        LOG.trace("Called listDataAccessContainers");
        final ListDataAccessContainersRequest interceptedRequest =
                ListDataAccessContainersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAccessContainersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDataAccessContainers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDataAccessContainers");
        java.util.function.Function<javax.ws.rs.core.Response, ListDataAccessContainersResponse>
                transformer =
                        ListDataAccessContainersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListDatabaseParametersResponse listDatabaseParameters(
            ListDatabaseParametersRequest request) {
        LOG.trace("Called listDatabaseParameters");
        final ListDatabaseParametersRequest interceptedRequest =
                ListDatabaseParametersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseParametersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDatabaseParameters");
        java.util.function.Function<javax.ws.rs.core.Response, ListDatabaseParametersResponse>
                transformer =
                        ListDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListDbManagementPrivateEndpointsResponse listDbManagementPrivateEndpoints(
            ListDbManagementPrivateEndpointsRequest request) {
        LOG.trace("Called listDbManagementPrivateEndpoints");
        final ListDbManagementPrivateEndpointsRequest interceptedRequest =
                ListDbManagementPrivateEndpointsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbManagementPrivateEndpointsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDbManagementPrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ListDbManagementPrivateEndpoints");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListDbManagementPrivateEndpointsResponse>
                transformer =
                        ListDbManagementPrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalAsmDiskGroupsResponse listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request) {
        LOG.trace("Called listExternalAsmDiskGroups");
        final ListExternalAsmDiskGroupsRequest interceptedRequest =
                ListExternalAsmDiskGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmDiskGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmDiskGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmDiskGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmDiskGroupsResponse>
                transformer =
                        ListExternalAsmDiskGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalAsmInstancesResponse listExternalAsmInstances(
            ListExternalAsmInstancesRequest request) {
        LOG.trace("Called listExternalAsmInstances");
        final ListExternalAsmInstancesRequest interceptedRequest =
                ListExternalAsmInstancesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmInstancesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/ListExternalAsmInstances");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmInstancesResponse>
                transformer =
                        ListExternalAsmInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalAsmUsersResponse listExternalAsmUsers(ListExternalAsmUsersRequest request) {
        LOG.trace("Called listExternalAsmUsers");
        final ListExternalAsmUsersRequest interceptedRequest =
                ListExternalAsmUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmUsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmUsersResponse>
                transformer =
                        ListExternalAsmUsersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalAsmsResponse listExternalAsms(ListExternalAsmsRequest request) {
        LOG.trace("Called listExternalAsms");
        final ListExternalAsmsRequest interceptedRequest =
                ListExternalAsmsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsms");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmsResponse>
                transformer =
                        ListExternalAsmsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalClusterInstancesResponse listExternalClusterInstances(
            ListExternalClusterInstancesRequest request) {
        LOG.trace("Called listExternalClusterInstances");
        final ListExternalClusterInstancesRequest interceptedRequest =
                ListExternalClusterInstancesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalClusterInstancesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalClusterInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/ListExternalClusterInstances");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalClusterInstancesResponse>
                transformer =
                        ListExternalClusterInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalClustersResponse listExternalClusters(ListExternalClustersRequest request) {
        LOG.trace("Called listExternalClusters");
        final ListExternalClustersRequest interceptedRequest =
                ListExternalClustersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalClustersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalClusters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/ListExternalClusters");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalClustersResponse>
                transformer =
                        ListExternalClustersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDatabasesResponse listExternalDatabases(
            ListExternalDatabasesRequest request) {
        LOG.trace("Called listExternalDatabases");
        final ListExternalDatabasesRequest interceptedRequest =
                ListExternalDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDatabasesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDatabaseCollection/ListExternalDatabases");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalDatabasesResponse>
                transformer =
                        ListExternalDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDbHomesResponse listExternalDbHomes(ListExternalDbHomesRequest request) {
        LOG.trace("Called listExternalDbHomes");
        final ListExternalDbHomesRequest interceptedRequest =
                ListExternalDbHomesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbHomesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbHomes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/ListExternalDbHomes");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbHomesResponse>
                transformer =
                        ListExternalDbHomesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDbNodesResponse listExternalDbNodes(ListExternalDbNodesRequest request) {
        LOG.trace("Called listExternalDbNodes");
        final ListExternalDbNodesRequest interceptedRequest =
                ListExternalDbNodesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbNodesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbNodes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/ListExternalDbNodes");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbNodesResponse>
                transformer =
                        ListExternalDbNodesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDbSystemConnectorsResponse listExternalDbSystemConnectors(
            ListExternalDbSystemConnectorsRequest request) {
        LOG.trace("Called listExternalDbSystemConnectors");
        final ListExternalDbSystemConnectorsRequest interceptedRequest =
                ListExternalDbSystemConnectorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemConnectorsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystemConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/ListExternalDbSystemConnectors");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalDbSystemConnectorsResponse>
                transformer =
                        ListExternalDbSystemConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDbSystemDiscoveriesResponse listExternalDbSystemDiscoveries(
            ListExternalDbSystemDiscoveriesRequest request) {
        LOG.trace("Called listExternalDbSystemDiscoveries");
        final ListExternalDbSystemDiscoveriesRequest interceptedRequest =
                ListExternalDbSystemDiscoveriesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemDiscoveriesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystemDiscoveries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/ListExternalDbSystemDiscoveries");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalDbSystemDiscoveriesResponse>
                transformer =
                        ListExternalDbSystemDiscoveriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalDbSystemsResponse listExternalDbSystems(
            ListExternalDbSystemsRequest request) {
        LOG.trace("Called listExternalDbSystems");
        final ListExternalDbSystemsRequest interceptedRequest =
                ListExternalDbSystemsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ListExternalDbSystems");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbSystemsResponse>
                transformer =
                        ListExternalDbSystemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalExadataInfrastructuresResponse listExternalExadataInfrastructures(
            ListExternalExadataInfrastructuresRequest request) {
        LOG.trace("Called listExternalExadataInfrastructures");
        final ListExternalExadataInfrastructuresRequest interceptedRequest =
                ListExternalExadataInfrastructuresConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataInfrastructuresConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataInfrastructures",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ListExternalExadataInfrastructures");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataInfrastructuresResponse>
                transformer =
                        ListExternalExadataInfrastructuresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalExadataStorageConnectorsResponse listExternalExadataStorageConnectors(
            ListExternalExadataStorageConnectorsRequest request) {
        LOG.trace("Called listExternalExadataStorageConnectors");
        final ListExternalExadataStorageConnectorsRequest interceptedRequest =
                ListExternalExadataStorageConnectorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataStorageConnectorsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/ListExternalExadataStorageConnectors");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataStorageConnectorsResponse>
                transformer =
                        ListExternalExadataStorageConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalExadataStorageServersResponse listExternalExadataStorageServers(
            ListExternalExadataStorageServersRequest request) {
        LOG.trace("Called listExternalExadataStorageServers");
        final ListExternalExadataStorageServersRequest interceptedRequest =
                ListExternalExadataStorageServersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataStorageServersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/ListExternalExadataStorageServers");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataStorageServersResponse>
                transformer =
                        ListExternalExadataStorageServersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalListenerServicesResponse listExternalListenerServices(
            ListExternalListenerServicesRequest request) {
        LOG.trace("Called listExternalListenerServices");
        final ListExternalListenerServicesRequest interceptedRequest =
                ListExternalListenerServicesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalListenerServicesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalListenerServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListenerServices");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalListenerServicesResponse>
                transformer =
                        ListExternalListenerServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListExternalListenersResponse listExternalListeners(
            ListExternalListenersRequest request) {
        LOG.trace("Called listExternalListeners");
        final ListExternalListenersRequest interceptedRequest =
                ListExternalListenersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalListenersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalListeners",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListeners");
        java.util.function.Function<javax.ws.rs.core.Response, ListExternalListenersResponse>
                transformer =
                        ListExternalListenersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request) {
        LOG.trace("Called listJobExecutions");
        final ListJobExecutionsRequest interceptedRequest =
                ListJobExecutionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobExecutionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/ListJobExecutions");
        java.util.function.Function<javax.ws.rs.core.Response, ListJobExecutionsResponse>
                transformer =
                        ListJobExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListJobRunsResponse listJobRuns(ListJobRunsRequest request) {
        LOG.trace("Called listJobRuns");
        final ListJobRunsRequest interceptedRequest =
                ListJobRunsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobRunsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/ListJobRuns");
        java.util.function.Function<javax.ws.rs.core.Response, ListJobRunsResponse> transformer =
                ListJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListJobsResponse listJobs(ListJobsRequest request) {
        LOG.trace("Called listJobs");
        final ListJobsRequest interceptedRequest = ListJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ListJobs");
        java.util.function.Function<javax.ws.rs.core.Response, ListJobsResponse> transformer =
                ListJobsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListManagedDatabaseGroupsResponse listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request) {
        LOG.trace("Called listManagedDatabaseGroups");
        final ListManagedDatabaseGroupsRequest interceptedRequest =
                ListManagedDatabaseGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabaseGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListManagedDatabaseGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ListManagedDatabaseGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListManagedDatabaseGroupsResponse>
                transformer =
                        ListManagedDatabaseGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListManagedDatabasesResponse listManagedDatabases(ListManagedDatabasesRequest request) {
        LOG.trace("Called listManagedDatabases");
        final ListManagedDatabasesRequest interceptedRequest =
                ListManagedDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabasesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListManagedDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListManagedDatabases");
        java.util.function.Function<javax.ws.rs.core.Response, ListManagedDatabasesResponse>
                transformer =
                        ListManagedDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListNamedCredentialsResponse listNamedCredentials(ListNamedCredentialsRequest request) {
        LOG.trace("Called listNamedCredentials");
        final ListNamedCredentialsRequest interceptedRequest =
                ListNamedCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNamedCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListNamedCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ListNamedCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListNamedCredentialsResponse>
                transformer =
                        ListNamedCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListObjectPrivilegesResponse listObjectPrivileges(ListObjectPrivilegesRequest request) {
        LOG.trace("Called listObjectPrivileges");
        final ListObjectPrivilegesRequest interceptedRequest =
                ListObjectPrivilegesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectPrivilegesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListObjectPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListObjectPrivileges");
        java.util.function.Function<javax.ws.rs.core.Response, ListObjectPrivilegesResponse>
                transformer =
                        ListObjectPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListOptimizerStatisticsAdvisorExecutionsResponse
            listOptimizerStatisticsAdvisorExecutions(
                    ListOptimizerStatisticsAdvisorExecutionsRequest request) {
        LOG.trace("Called listOptimizerStatisticsAdvisorExecutions");
        final ListOptimizerStatisticsAdvisorExecutionsRequest interceptedRequest =
                ListOptimizerStatisticsAdvisorExecutionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsAdvisorExecutionsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsAdvisorExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsAdvisorExecutions");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListOptimizerStatisticsAdvisorExecutionsResponse>
                transformer =
                        ListOptimizerStatisticsAdvisorExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListOptimizerStatisticsCollectionAggregationsResponse
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request) {
        LOG.trace("Called listOptimizerStatisticsCollectionAggregations");
        final ListOptimizerStatisticsCollectionAggregationsRequest interceptedRequest =
                ListOptimizerStatisticsCollectionAggregationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsCollectionAggregationsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionAggregations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionAggregations");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListOptimizerStatisticsCollectionAggregationsResponse>
                transformer =
                        ListOptimizerStatisticsCollectionAggregationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListOptimizerStatisticsCollectionOperationsResponse
            listOptimizerStatisticsCollectionOperations(
                    ListOptimizerStatisticsCollectionOperationsRequest request) {
        LOG.trace("Called listOptimizerStatisticsCollectionOperations");
        final ListOptimizerStatisticsCollectionOperationsRequest interceptedRequest =
                ListOptimizerStatisticsCollectionOperationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsCollectionOperationsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionOperations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionOperations");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListOptimizerStatisticsCollectionOperationsResponse>
                transformer =
                        ListOptimizerStatisticsCollectionOperationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListPreferredCredentialsResponse listPreferredCredentials(
            ListPreferredCredentialsRequest request) {
        LOG.trace("Called listPreferredCredentials");
        final ListPreferredCredentialsRequest interceptedRequest =
                ListPreferredCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPreferredCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListPreferredCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/ListPreferredCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListPreferredCredentialsResponse>
                transformer =
                        ListPreferredCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListProxiedForUsersResponse listProxiedForUsers(ListProxiedForUsersRequest request) {
        LOG.trace("Called listProxiedForUsers");
        final ListProxiedForUsersRequest interceptedRequest =
                ListProxiedForUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxiedForUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListProxiedForUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxiedForUsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListProxiedForUsersResponse>
                transformer =
                        ListProxiedForUsersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListProxyUsersResponse listProxyUsers(ListProxyUsersRequest request) {
        LOG.trace("Called listProxyUsers");
        final ListProxyUsersRequest interceptedRequest =
                ListProxyUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxyUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListProxyUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxyUsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListProxyUsersResponse> transformer =
                ListProxyUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListRolesResponse listRoles(ListRolesRequest request) {
        LOG.trace("Called listRoles");
        final ListRolesRequest interceptedRequest = ListRolesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRolesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListRoles");
        java.util.function.Function<javax.ws.rs.core.Response, ListRolesResponse> transformer =
                ListRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSqlPlanBaselineJobsResponse listSqlPlanBaselineJobs(
            ListSqlPlanBaselineJobsRequest request) {
        LOG.trace("Called listSqlPlanBaselineJobs");
        final ListSqlPlanBaselineJobsRequest interceptedRequest =
                ListSqlPlanBaselineJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlanBaselineJobsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselineJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselineJobs");
        java.util.function.Function<javax.ws.rs.core.Response, ListSqlPlanBaselineJobsResponse>
                transformer =
                        ListSqlPlanBaselineJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListSqlPlanBaselinesResponse listSqlPlanBaselines(ListSqlPlanBaselinesRequest request) {
        LOG.trace("Called listSqlPlanBaselines");
        final ListSqlPlanBaselinesRequest interceptedRequest =
                ListSqlPlanBaselinesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselines");
        java.util.function.Function<javax.ws.rs.core.Response, ListSqlPlanBaselinesResponse>
                transformer =
                        ListSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListSystemPrivilegesResponse listSystemPrivileges(ListSystemPrivilegesRequest request) {
        LOG.trace("Called listSystemPrivileges");
        final ListSystemPrivilegesRequest interceptedRequest =
                ListSystemPrivilegesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSystemPrivilegesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSystemPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSystemPrivileges");
        java.util.function.Function<javax.ws.rs.core.Response, ListSystemPrivilegesResponse>
                transformer =
                        ListSystemPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListTableStatisticsResponse listTableStatistics(ListTableStatisticsRequest request) {
        LOG.trace("Called listTableStatistics");
        final ListTableStatisticsRequest interceptedRequest =
                ListTableStatisticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTableStatisticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListTableStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListTableStatistics");
        java.util.function.Function<javax.ws.rs.core.Response, ListTableStatisticsResponse>
                transformer =
                        ListTableStatisticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListTablespacesResponse listTablespaces(ListTablespacesRequest request) {
        LOG.trace("Called listTablespaces");
        final ListTablespacesRequest interceptedRequest =
                ListTablespacesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablespacesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListTablespaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ListTablespaces");
        java.util.function.Function<javax.ws.rs.core.Response, ListTablespacesResponse>
                transformer =
                        ListTablespacesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public ListUsersResponse listUsers(ListUsersRequest request) {
        LOG.trace("Called listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListUsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
                ListUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        "DbManagement",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestError/ListWorkRequestErrors");
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
                        "DbManagement",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "DbManagement",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/ListWorkRequests");
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
    public LoadSqlPlanBaselinesFromAwrResponse loadSqlPlanBaselinesFromAwr(
            LoadSqlPlanBaselinesFromAwrRequest request) {
        LOG.trace("Called loadSqlPlanBaselinesFromAwr");
        final LoadSqlPlanBaselinesFromAwrRequest interceptedRequest =
                LoadSqlPlanBaselinesFromAwrConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LoadSqlPlanBaselinesFromAwrConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromAwr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromAwr");
        java.util.function.Function<javax.ws.rs.core.Response, LoadSqlPlanBaselinesFromAwrResponse>
                transformer =
                        LoadSqlPlanBaselinesFromAwrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getLoadSqlPlanBaselinesFromAwrDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public LoadSqlPlanBaselinesFromCursorCacheResponse loadSqlPlanBaselinesFromCursorCache(
            LoadSqlPlanBaselinesFromCursorCacheRequest request) {
        LOG.trace("Called loadSqlPlanBaselinesFromCursorCache");
        final LoadSqlPlanBaselinesFromCursorCacheRequest interceptedRequest =
                LoadSqlPlanBaselinesFromCursorCacheConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LoadSqlPlanBaselinesFromCursorCacheConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromCursorCache",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromCursorCache");
        java.util.function.Function<
                        javax.ws.rs.core.Response, LoadSqlPlanBaselinesFromCursorCacheResponse>
                transformer =
                        LoadSqlPlanBaselinesFromCursorCacheConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getLoadSqlPlanBaselinesFromCursorCacheDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ModifyAutonomousDatabaseManagementFeatureResponse
            modifyAutonomousDatabaseManagementFeature(
                    ModifyAutonomousDatabaseManagementFeatureRequest request) {
        LOG.trace("Called modifyAutonomousDatabaseManagementFeature");
        final ModifyAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                ModifyAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyAutonomousDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ModifyAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        ModifyAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getModifyAutonomousDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ModifyDatabaseManagementFeatureResponse modifyDatabaseManagementFeature(
            ModifyDatabaseManagementFeatureRequest request) {
        LOG.trace("Called modifyDatabaseManagementFeature");
        final ModifyDatabaseManagementFeatureRequest interceptedRequest =
                ModifyDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ModifyDatabaseManagementFeatureResponse>
                transformer =
                        ModifyDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getModifyDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ModifyPluggableDatabaseManagementFeatureResponse
            modifyPluggableDatabaseManagementFeature(
                    ModifyPluggableDatabaseManagementFeatureRequest request) {
        LOG.trace("Called modifyPluggableDatabaseManagementFeature");
        final ModifyPluggableDatabaseManagementFeatureRequest interceptedRequest =
                ModifyPluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyPluggableDatabaseManagementFeature");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ModifyPluggableDatabaseManagementFeatureResponse>
                transformer =
                        ModifyPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getModifyPluggableDatabaseManagementFeatureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchExternalDbSystemDiscoveryResponse patchExternalDbSystemDiscovery(
            PatchExternalDbSystemDiscoveryRequest request) {
        LOG.trace("Called patchExternalDbSystemDiscovery");
        final PatchExternalDbSystemDiscoveryRequest interceptedRequest =
                PatchExternalDbSystemDiscoveryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "PatchExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/PatchExternalDbSystemDiscovery");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PatchExternalDbSystemDiscoveryResponse>
                transformer =
                        PatchExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                        client.patch(
                                                ib,
                                                retriedRequest
                                                        .getPatchExternalDbSystemDiscoveryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemoveDataFileResponse removeDataFile(RemoveDataFileRequest request) {
        LOG.trace("Called removeDataFile");
        final RemoveDataFileRequest interceptedRequest =
                RemoveDataFileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDataFileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RemoveDataFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/RemoveDataFile");
        java.util.function.Function<javax.ws.rs.core.Response, RemoveDataFileResponse> transformer =
                RemoveDataFileConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getRemoveDataFileDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RemoveManagedDatabaseFromManagedDatabaseGroupResponse
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request) {
        LOG.trace("Called removeManagedDatabaseFromManagedDatabaseGroup");
        final RemoveManagedDatabaseFromManagedDatabaseGroupRequest interceptedRequest =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RemoveManagedDatabaseFromManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/RemoveManagedDatabaseFromManagedDatabaseGroup");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                transformer =
                        RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getRemoveManagedDatabaseFromManagedDatabaseGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ResetDatabaseParametersResponse resetDatabaseParameters(
            ResetDatabaseParametersRequest request) {
        LOG.trace("Called resetDatabaseParameters");
        final ResetDatabaseParametersRequest interceptedRequest =
                ResetDatabaseParametersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetDatabaseParametersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ResetDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ResetDatabaseParameters");
        java.util.function.Function<javax.ws.rs.core.Response, ResetDatabaseParametersResponse>
                transformer =
                        ResetDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getResetDatabaseParametersDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ResizeDataFileResponse resizeDataFile(ResizeDataFileRequest request) {
        LOG.trace("Called resizeDataFile");
        final ResizeDataFileRequest interceptedRequest =
                ResizeDataFileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResizeDataFileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ResizeDataFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ResizeDataFile");
        java.util.function.Function<javax.ws.rs.core.Response, ResizeDataFileResponse> transformer =
                ResizeDataFileConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getResizeDataFileDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RunHistoricAddmResponse runHistoricAddm(RunHistoricAddmRequest request) {
        LOG.trace("Called runHistoricAddm");
        final RunHistoricAddmRequest interceptedRequest =
                RunHistoricAddmConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunHistoricAddmConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RunHistoricAddm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/HistoricAddmResult/RunHistoricAddm");
        java.util.function.Function<javax.ws.rs.core.Response, RunHistoricAddmResponse>
                transformer =
                        RunHistoricAddmConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getRunHistoricAddmDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SummarizeAwrDbCpuUsagesResponse summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request) {
        LOG.trace("Called summarizeAwrDbCpuUsages");
        final SummarizeAwrDbCpuUsagesRequest interceptedRequest =
                SummarizeAwrDbCpuUsagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbCpuUsagesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbCpuUsages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbCpuUsages");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbCpuUsagesResponse>
                transformer =
                        SummarizeAwrDbCpuUsagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbMetricsResponse summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request) {
        LOG.trace("Called summarizeAwrDbMetrics");
        final SummarizeAwrDbMetricsRequest interceptedRequest =
                SummarizeAwrDbMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbMetrics");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbMetricsResponse>
                transformer =
                        SummarizeAwrDbMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbParameterChangesResponse summarizeAwrDbParameterChanges(
            SummarizeAwrDbParameterChangesRequest request) {
        LOG.trace("Called summarizeAwrDbParameterChanges");
        final SummarizeAwrDbParameterChangesRequest interceptedRequest =
                SummarizeAwrDbParameterChangesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParameterChangesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameterChanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameterChanges");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbParameterChangesResponse>
                transformer =
                        SummarizeAwrDbParameterChangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbParametersResponse summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request) {
        LOG.trace("Called summarizeAwrDbParameters");
        final SummarizeAwrDbParametersRequest interceptedRequest =
                SummarizeAwrDbParametersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParametersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameters");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbParametersResponse>
                transformer =
                        SummarizeAwrDbParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbSnapshotRangesResponse summarizeAwrDbSnapshotRanges(
            SummarizeAwrDbSnapshotRangesRequest request) {
        LOG.trace("Called summarizeAwrDbSnapshotRanges");
        final SummarizeAwrDbSnapshotRangesRequest interceptedRequest =
                SummarizeAwrDbSnapshotRangesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSnapshotRangesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSnapshotRanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSnapshotRanges");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbSnapshotRangesResponse>
                transformer =
                        SummarizeAwrDbSnapshotRangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbSysstatsResponse summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request) {
        LOG.trace("Called summarizeAwrDbSysstats");
        final SummarizeAwrDbSysstatsRequest interceptedRequest =
                SummarizeAwrDbSysstatsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSysstatsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSysstats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSysstats");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbSysstatsResponse>
                transformer =
                        SummarizeAwrDbSysstatsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbTopWaitEventsResponse summarizeAwrDbTopWaitEvents(
            SummarizeAwrDbTopWaitEventsRequest request) {
        LOG.trace("Called summarizeAwrDbTopWaitEvents");
        final SummarizeAwrDbTopWaitEventsRequest interceptedRequest =
                SummarizeAwrDbTopWaitEventsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbTopWaitEventsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbTopWaitEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbTopWaitEvents");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbTopWaitEventsResponse>
                transformer =
                        SummarizeAwrDbTopWaitEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbWaitEventBucketsResponse summarizeAwrDbWaitEventBuckets(
            SummarizeAwrDbWaitEventBucketsRequest request) {
        LOG.trace("Called summarizeAwrDbWaitEventBuckets");
        final SummarizeAwrDbWaitEventBucketsRequest interceptedRequest =
                SummarizeAwrDbWaitEventBucketsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventBucketsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEventBuckets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEventBuckets");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbWaitEventBucketsResponse>
                transformer =
                        SummarizeAwrDbWaitEventBucketsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeAwrDbWaitEventsResponse summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request) {
        LOG.trace("Called summarizeAwrDbWaitEvents");
        final SummarizeAwrDbWaitEventsRequest interceptedRequest =
                SummarizeAwrDbWaitEventsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEvents");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbWaitEventsResponse>
                transformer =
                        SummarizeAwrDbWaitEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeExternalAsmMetricsResponse summarizeExternalAsmMetrics(
            SummarizeExternalAsmMetricsRequest request) {
        LOG.trace("Called summarizeExternalAsmMetrics");
        final SummarizeExternalAsmMetricsRequest interceptedRequest =
                SummarizeExternalAsmMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalAsmMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalAsmMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/SummarizeExternalAsmMetrics");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeExternalAsmMetricsResponse>
                transformer =
                        SummarizeExternalAsmMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeExternalClusterMetricsResponse summarizeExternalClusterMetrics(
            SummarizeExternalClusterMetricsRequest request) {
        LOG.trace("Called summarizeExternalClusterMetrics");
        final SummarizeExternalClusterMetricsRequest interceptedRequest =
                SummarizeExternalClusterMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalClusterMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalClusterMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/SummarizeExternalClusterMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalClusterMetricsResponse>
                transformer =
                        SummarizeExternalClusterMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeExternalDbNodeMetricsResponse summarizeExternalDbNodeMetrics(
            SummarizeExternalDbNodeMetricsRequest request) {
        LOG.trace("Called summarizeExternalDbNodeMetrics");
        final SummarizeExternalDbNodeMetricsRequest interceptedRequest =
                SummarizeExternalDbNodeMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalDbNodeMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalDbNodeMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/SummarizeExternalDbNodeMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalDbNodeMetricsResponse>
                transformer =
                        SummarizeExternalDbNodeMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeExternalDbSystemAvailabilityMetricsResponse
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request) {
        LOG.trace("Called summarizeExternalDbSystemAvailabilityMetrics");
        final SummarizeExternalDbSystemAvailabilityMetricsRequest interceptedRequest =
                SummarizeExternalDbSystemAvailabilityMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalDbSystemAvailabilityMetricsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalDbSystemAvailabilityMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/SummarizeExternalDbSystemAvailabilityMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExternalDbSystemAvailabilityMetricsResponse>
                transformer =
                        SummarizeExternalDbSystemAvailabilityMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeExternalListenerMetricsResponse summarizeExternalListenerMetrics(
            SummarizeExternalListenerMetricsRequest request) {
        LOG.trace("Called summarizeExternalListenerMetrics");
        final SummarizeExternalListenerMetricsRequest interceptedRequest =
                SummarizeExternalListenerMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalListenerMetricsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalListenerMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/SummarizeExternalListenerMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalListenerMetricsResponse>
                transformer =
                        SummarizeExternalListenerMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeJobExecutionsStatusesResponse summarizeJobExecutionsStatuses(
            SummarizeJobExecutionsStatusesRequest request) {
        LOG.trace("Called summarizeJobExecutionsStatuses");
        final SummarizeJobExecutionsStatusesRequest interceptedRequest =
                SummarizeJobExecutionsStatusesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJobExecutionsStatusesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeJobExecutionsStatuses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecutionsStatusSummaryCollection/SummarizeJobExecutionsStatuses");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeJobExecutionsStatusesResponse>
                transformer =
                        SummarizeJobExecutionsStatusesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeManagedDatabaseAvailabilityMetricsResponse
            summarizeManagedDatabaseAvailabilityMetrics(
                    SummarizeManagedDatabaseAvailabilityMetricsRequest request) {
        LOG.trace("Called summarizeManagedDatabaseAvailabilityMetrics");
        final SummarizeManagedDatabaseAvailabilityMetricsRequest interceptedRequest =
                SummarizeManagedDatabaseAvailabilityMetricsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeManagedDatabaseAvailabilityMetricsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeManagedDatabaseAvailabilityMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeManagedDatabaseAvailabilityMetrics");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        SummarizeManagedDatabaseAvailabilityMetricsResponse>
                transformer =
                        SummarizeManagedDatabaseAvailabilityMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeSqlPlanBaselinesResponse summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request) {
        LOG.trace("Called summarizeSqlPlanBaselines");
        final SummarizeSqlPlanBaselinesRequest interceptedRequest =
                SummarizeSqlPlanBaselinesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselines");
        java.util.function.Function<javax.ws.rs.core.Response, SummarizeSqlPlanBaselinesResponse>
                transformer =
                        SummarizeSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public SummarizeSqlPlanBaselinesByLastExecutionResponse
            summarizeSqlPlanBaselinesByLastExecution(
                    SummarizeSqlPlanBaselinesByLastExecutionRequest request) {
        LOG.trace("Called summarizeSqlPlanBaselinesByLastExecution");
        final SummarizeSqlPlanBaselinesByLastExecutionRequest interceptedRequest =
                SummarizeSqlPlanBaselinesByLastExecutionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanBaselinesByLastExecutionConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselinesByLastExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselinesByLastExecution");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeSqlPlanBaselinesByLastExecutionResponse>
                transformer =
                        SummarizeSqlPlanBaselinesByLastExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public TestNamedCredentialResponse testNamedCredential(TestNamedCredentialRequest request) {
        LOG.trace("Called testNamedCredential");
        final TestNamedCredentialRequest interceptedRequest =
                TestNamedCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestNamedCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "TestNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/TestNamedCredential");
        java.util.function.Function<javax.ws.rs.core.Response, TestNamedCredentialResponse>
                transformer =
                        TestNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getTestNamedCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public TestPreferredCredentialResponse testPreferredCredential(
            TestPreferredCredentialRequest request) {
        LOG.trace("Called testPreferredCredential");
        final TestPreferredCredentialRequest interceptedRequest =
                TestPreferredCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestPreferredCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "TestPreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/TestPreferredCredential");
        java.util.function.Function<javax.ws.rs.core.Response, TestPreferredCredentialResponse>
                transformer =
                        TestPreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getTestPreferredCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDbManagementPrivateEndpointResponse updateDbManagementPrivateEndpoint(
            UpdateDbManagementPrivateEndpointRequest request) {
        LOG.trace("Called updateDbManagementPrivateEndpoint");
        final UpdateDbManagementPrivateEndpointRequest interceptedRequest =
                UpdateDbManagementPrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/UpdateDbManagementPrivateEndpoint");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDbManagementPrivateEndpointResponse>
                transformer =
                        UpdateDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateDbManagementPrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalAsmResponse updateExternalAsm(UpdateExternalAsmRequest request) {
        LOG.trace("Called updateExternalAsm");
        final UpdateExternalAsmRequest interceptedRequest =
                UpdateExternalAsmConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalAsmConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalAsm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/UpdateExternalAsm");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalAsmResponse>
                transformer =
                        UpdateExternalAsmConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalAsmDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalAsmInstanceResponse updateExternalAsmInstance(
            UpdateExternalAsmInstanceRequest request) {
        LOG.trace("Called updateExternalAsmInstance");
        final UpdateExternalAsmInstanceRequest interceptedRequest =
                UpdateExternalAsmInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalAsmInstanceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalAsmInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/UpdateExternalAsmInstance");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalAsmInstanceResponse>
                transformer =
                        UpdateExternalAsmInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalAsmInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalClusterResponse updateExternalCluster(
            UpdateExternalClusterRequest request) {
        LOG.trace("Called updateExternalCluster");
        final UpdateExternalClusterRequest interceptedRequest =
                UpdateExternalClusterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalClusterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/UpdateExternalCluster");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalClusterResponse>
                transformer =
                        UpdateExternalClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalClusterDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalClusterInstanceResponse updateExternalClusterInstance(
            UpdateExternalClusterInstanceRequest request) {
        LOG.trace("Called updateExternalClusterInstance");
        final UpdateExternalClusterInstanceRequest interceptedRequest =
                UpdateExternalClusterInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalClusterInstanceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalClusterInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/UpdateExternalClusterInstance");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalClusterInstanceResponse>
                transformer =
                        UpdateExternalClusterInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalClusterInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalDbHomeResponse updateExternalDbHome(UpdateExternalDbHomeRequest request) {
        LOG.trace("Called updateExternalDbHome");
        final UpdateExternalDbHomeRequest interceptedRequest =
                UpdateExternalDbHomeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbHomeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbHome",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/UpdateExternalDbHome");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbHomeResponse>
                transformer =
                        UpdateExternalDbHomeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalDbHomeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalDbNodeResponse updateExternalDbNode(UpdateExternalDbNodeRequest request) {
        LOG.trace("Called updateExternalDbNode");
        final UpdateExternalDbNodeRequest interceptedRequest =
                UpdateExternalDbNodeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbNodeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/UpdateExternalDbNode");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbNodeResponse>
                transformer =
                        UpdateExternalDbNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalDbNodeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalDbSystemResponse updateExternalDbSystem(
            UpdateExternalDbSystemRequest request) {
        LOG.trace("Called updateExternalDbSystem");
        final UpdateExternalDbSystemRequest interceptedRequest =
                UpdateExternalDbSystemConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/UpdateExternalDbSystem");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbSystemResponse>
                transformer =
                        UpdateExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalDbSystemDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalDbSystemConnectorResponse updateExternalDbSystemConnector(
            UpdateExternalDbSystemConnectorRequest request) {
        LOG.trace("Called updateExternalDbSystemConnector");
        final UpdateExternalDbSystemConnectorRequest interceptedRequest =
                UpdateExternalDbSystemConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/UpdateExternalDbSystemConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalDbSystemConnectorResponse>
                transformer =
                        UpdateExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalDbSystemConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalDbSystemDiscoveryResponse updateExternalDbSystemDiscovery(
            UpdateExternalDbSystemDiscoveryRequest request) {
        LOG.trace("Called updateExternalDbSystemDiscovery");
        final UpdateExternalDbSystemDiscoveryRequest interceptedRequest =
                UpdateExternalDbSystemDiscoveryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/UpdateExternalDbSystemDiscovery");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalDbSystemDiscoveryResponse>
                transformer =
                        UpdateExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalDbSystemDiscoveryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalExadataInfrastructureResponse updateExternalExadataInfrastructure(
            UpdateExternalExadataInfrastructureRequest request) {
        LOG.trace("Called updateExternalExadataInfrastructure");
        final UpdateExternalExadataInfrastructureRequest interceptedRequest =
                UpdateExternalExadataInfrastructureConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/UpdateExternalExadataInfrastructure");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataInfrastructureResponse>
                transformer =
                        UpdateExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalExadataInfrastructureDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalExadataStorageConnectorResponse updateExternalExadataStorageConnector(
            UpdateExternalExadataStorageConnectorRequest request) {
        LOG.trace("Called updateExternalExadataStorageConnector");
        final UpdateExternalExadataStorageConnectorRequest interceptedRequest =
                UpdateExternalExadataStorageConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/UpdateExternalExadataStorageConnector");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageConnectorResponse>
                transformer =
                        UpdateExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalExadataStorageConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalExadataStorageGridResponse updateExternalExadataStorageGrid(
            UpdateExternalExadataStorageGridRequest request) {
        LOG.trace("Called updateExternalExadataStorageGrid");
        final UpdateExternalExadataStorageGridRequest interceptedRequest =
                UpdateExternalExadataStorageGridConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageGridConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageGrid",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/UpdateExternalExadataStorageGrid");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageGridResponse>
                transformer =
                        UpdateExternalExadataStorageGridConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalExadataStorageGridDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalExadataStorageServerResponse updateExternalExadataStorageServer(
            UpdateExternalExadataStorageServerRequest request) {
        LOG.trace("Called updateExternalExadataStorageServer");
        final UpdateExternalExadataStorageServerRequest interceptedRequest =
                UpdateExternalExadataStorageServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/UpdateExternalExadataStorageServer");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageServerResponse>
                transformer =
                        UpdateExternalExadataStorageServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateExternalExadataStorageServerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalListenerResponse updateExternalListener(
            UpdateExternalListenerRequest request) {
        LOG.trace("Called updateExternalListener");
        final UpdateExternalListenerRequest interceptedRequest =
                UpdateExternalListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalListenerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/UpdateExternalListener");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalListenerResponse>
                transformer =
                        UpdateExternalListenerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateExternalListenerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        LOG.trace("Called updateJob");
        final UpdateJobRequest interceptedRequest = UpdateJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/UpdateJob");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateJobResponse> transformer =
                UpdateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateManagedDatabaseResponse updateManagedDatabase(
            UpdateManagedDatabaseRequest request) {
        LOG.trace("Called updateManagedDatabase");
        final UpdateManagedDatabaseRequest interceptedRequest =
                UpdateManagedDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateManagedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/UpdateManagedDatabase");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateManagedDatabaseResponse>
                transformer =
                        UpdateManagedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateManagedDatabaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateManagedDatabaseGroupResponse updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request) {
        LOG.trace("Called updateManagedDatabaseGroup");
        final UpdateManagedDatabaseGroupRequest interceptedRequest =
                UpdateManagedDatabaseGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/UpdateManagedDatabaseGroup");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateManagedDatabaseGroupResponse>
                transformer =
                        UpdateManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdateManagedDatabaseGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateNamedCredentialResponse updateNamedCredential(
            UpdateNamedCredentialRequest request) {
        LOG.trace("Called updateNamedCredential");
        final UpdateNamedCredentialRequest interceptedRequest =
                UpdateNamedCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamedCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/UpdateNamedCredential");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateNamedCredentialResponse>
                transformer =
                        UpdateNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateNamedCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdatePreferredCredentialResponse updatePreferredCredential(
            UpdatePreferredCredentialRequest request) {
        LOG.trace("Called updatePreferredCredential");
        final UpdatePreferredCredentialRequest interceptedRequest =
                UpdatePreferredCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePreferredCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdatePreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/UpdatePreferredCredential");
        java.util.function.Function<javax.ws.rs.core.Response, UpdatePreferredCredentialResponse>
                transformer =
                        UpdatePreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                        .getUpdatePreferredCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTablespaceResponse updateTablespace(UpdateTablespaceRequest request) {
        LOG.trace("Called updateTablespace");
        final UpdateTablespaceRequest interceptedRequest =
                UpdateTablespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTablespaceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/UpdateTablespace");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateTablespaceResponse>
                transformer =
                        UpdateTablespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateTablespaceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DbManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbManagementPaginators getPaginators() {
        return paginators;
    }
}
