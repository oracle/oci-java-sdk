/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.databasetoolsruntime.internal.http.*;
import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;
import com.oracle.bmc.util.CircuitBreakerUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class DatabaseToolsRuntimeClient implements DatabaseToolsRuntime {
    /**
     * Service instance for DatabaseToolsRuntime.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsRuntimeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsRuntimeClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final DatabaseToolsRuntimeWaiters waiters;

    private final DatabaseToolsRuntimePaginators paginators;
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

    // This pattern matches substrings that are enclosed within curly braces {}
    private static final Pattern PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES =
            Pattern.compile("\\{([^}]+)\\}");

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
    public DatabaseToolsRuntimeClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    protected DatabaseToolsRuntimeClient(
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
        java.util.List<com.oracle.bmc.internal.SpiClientConfigurator>
                additionalSpiClientConfigurators =
                        com.oracle.bmc.util.internal.SpiClientConfiguratorUtils
                                .getEnabledSpiClientConfigurators();
        allConfigurators.addAll(additionalSpiClientConfigurators);
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
                                    .nameFormat("DatabaseToolsRuntime-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatabaseToolsRuntimeWaiters(executorService, this);

        this.paginators = new DatabaseToolsRuntimePaginators(this);

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
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                            "DatabaseToolsRuntimeClient",
                            "getDatabaseToolsDatabaseApiGatewayConfigContent"));
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
                    Builder, DatabaseToolsRuntimeClient> {
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
        public DatabaseToolsRuntimeClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DatabaseToolsRuntimeClient(
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
        String value = client.getEndpoint();
        if (value.contains("{")) {
            Matcher matcher = PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES.matcher(value);
            java.lang.StringBuilder params = new java.lang.StringBuilder();
            while (matcher.find()) {
                if (params.length() > 0) {
                    params.append(", ");
                }
                params.append("{").append(matcher.group(1)).append("}");
            }
            LOG.warn(
                    "Parameters like {} get replaced with appropriate values at request time.",
                    params.toString());
        }
        return client.getEndpoint();
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

    @Override
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
                        "DatabaseToolsRuntime",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "");
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
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) {
        LOG.trace("Called createCredential");
        final CreateCredentialRequest interceptedRequest =
                CreateCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateCredentialResponse>
                transformer =
                        CreateCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCredentialExecuteGranteeResponse createCredentialExecuteGrantee(
            CreateCredentialExecuteGranteeRequest request) {
        LOG.trace("Called createCredentialExecuteGrantee");
        final CreateCredentialExecuteGranteeRequest interceptedRequest =
                CreateCredentialExecuteGranteeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCredentialExecuteGranteeResponse>
                transformer =
                        CreateCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getCreateCredentialExecuteGranteeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCredentialPublicSynonymResponse createCredentialPublicSynonym(
            CreateCredentialPublicSynonymRequest request) {
        LOG.trace("Called createCredentialPublicSynonym");
        final CreateCredentialPublicSynonymRequest interceptedRequest =
                CreateCredentialPublicSynonymConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCredentialPublicSynonymResponse>
                transformer =
                        CreateCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getCreateCredentialPublicSynonymDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {
        LOG.trace("Called createDatabaseToolsDatabaseApiGatewayConfigPool");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {
        LOG.trace("Called createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {
        LOG.trace("Called createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest request) {
        LOG.trace("Called deleteCredential");
        final DeleteCredentialRequest interceptedRequest =
                DeleteCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteCredentialResponse>
                transformer =
                        DeleteCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteCredentialExecuteGranteeResponse deleteCredentialExecuteGrantee(
            DeleteCredentialExecuteGranteeRequest request) {
        LOG.trace("Called deleteCredentialExecuteGrantee");
        final DeleteCredentialExecuteGranteeRequest interceptedRequest =
                DeleteCredentialExecuteGranteeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCredentialExecuteGranteeResponse>
                transformer =
                        DeleteCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteCredentialPublicSynonymResponse deleteCredentialPublicSynonym(
            DeleteCredentialPublicSynonymRequest request) {
        LOG.trace("Called deleteCredentialPublicSynonym");
        final DeleteCredentialPublicSynonymRequest interceptedRequest =
                DeleteCredentialPublicSynonymConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCredentialPublicSynonymResponse>
                transformer =
                        DeleteCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {
        LOG.trace("Called deleteDatabaseToolsDatabaseApiGatewayConfigPool");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {
        LOG.trace("Called deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {
        LOG.trace("Called deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ExecuteSqlDatabaseToolsConnectionResponse executeSqlDatabaseToolsConnection(
            ExecuteSqlDatabaseToolsConnectionRequest request) {
        LOG.trace("Called executeSqlDatabaseToolsConnection");
        final ExecuteSqlDatabaseToolsConnectionRequest interceptedRequest =
                ExecuteSqlDatabaseToolsConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExecuteSqlDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ExecuteSqlDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ExecuteSqlDatabaseToolsConnectionResponse>
                transformer =
                        ExecuteSqlDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getExecuteSqlDatabaseToolsConnectionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetCredentialResponse getCredential(GetCredentialRequest request) {
        LOG.trace("Called getCredential");
        final GetCredentialRequest interceptedRequest =
                GetCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime", "GetCredential", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, GetCredentialResponse> transformer =
                GetCredentialConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetCredentialExecuteGranteeResponse getCredentialExecuteGrantee(
            GetCredentialExecuteGranteeRequest request) {
        LOG.trace("Called getCredentialExecuteGrantee");
        final GetCredentialExecuteGranteeRequest interceptedRequest =
                GetCredentialExecuteGranteeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetCredentialExecuteGranteeResponse>
                transformer =
                        GetCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetCredentialPublicSynonymResponse getCredentialPublicSynonym(
            GetCredentialPublicSynonymRequest request) {
        LOG.trace("Called getCredentialPublicSynonym");
        final GetCredentialPublicSynonymRequest interceptedRequest =
                GetCredentialPublicSynonymConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetCredentialPublicSynonymResponse>
                transformer =
                        GetCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigContentResponse
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request) {
        LOG.trace("Called getDatabaseToolsDatabaseApiGatewayConfigContent");
        final GetDatabaseToolsDatabaseApiGatewayConfigContentRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigContent",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request) {
        LOG.trace("Called getDatabaseToolsDatabaseApiGatewayConfigGlobal");
        final GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {
        LOG.trace("Called getDatabaseToolsDatabaseApiGatewayConfigPool");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {
        LOG.trace("Called getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {
        LOG.trace("Called getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
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
    public GetPropertySetResponse getPropertySet(GetPropertySetRequest request) {
        LOG.trace("Called getPropertySet");
        final GetPropertySetRequest interceptedRequest =
                GetPropertySetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPropertySetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetPropertySet",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetPropertySetResponse> transformer =
                GetPropertySetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetUserCredentialResponse getUserCredential(GetUserCredentialRequest request) {
        LOG.trace("Called getUserCredential");
        final GetUserCredentialRequest interceptedRequest =
                GetUserCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetUserCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetUserCredentialResponse>
                transformer =
                        GetUserCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
                        "DatabaseToolsRuntime",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "");
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
    public ListCredentialExecuteGranteesResponse listCredentialExecuteGrantees(
            ListCredentialExecuteGranteesRequest request) {
        LOG.trace("Called listCredentialExecuteGrantees");
        final ListCredentialExecuteGranteesRequest interceptedRequest =
                ListCredentialExecuteGranteesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialExecuteGranteesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialExecuteGrantees",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListCredentialExecuteGranteesResponse>
                transformer =
                        ListCredentialExecuteGranteesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListCredentialPublicSynonymsResponse listCredentialPublicSynonyms(
            ListCredentialPublicSynonymsRequest request) {
        LOG.trace("Called listCredentialPublicSynonyms");
        final ListCredentialPublicSynonymsRequest interceptedRequest =
                ListCredentialPublicSynonymsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialPublicSynonymsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialPublicSynonyms",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListCredentialPublicSynonymsResponse>
                transformer =
                        ListCredentialPublicSynonymsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) {
        LOG.trace("Called listCredentials");
        final ListCredentialsRequest interceptedRequest =
                ListCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentials",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListCredentialsResponse>
                transformer =
                        ListCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request) {
        LOG.trace("Called listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties");
        final ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest
                interceptedRequest =
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter
                                .interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter
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
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {
        LOG.trace("Called listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request) {
        LOG.trace("Called listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter
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
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {
        LOG.trace("Called listDatabaseToolsDatabaseApiGatewayConfigPools");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPools",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListUserCredentialsResponse listUserCredentials(ListUserCredentialsRequest request) {
        LOG.trace("Called listUserCredentials");
        final ListUserCredentialsRequest interceptedRequest =
                ListUserCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListUserCredentials",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListUserCredentialsResponse>
                transformer =
                        ListUserCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "");
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "");
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "");
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
    public UpdateCredentialResponse updateCredential(UpdateCredentialRequest request) {
        LOG.trace("Called updateCredential");
        final UpdateCredentialRequest interceptedRequest =
                UpdateCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateCredentialResponse>
                transformer =
                        UpdateCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request) {
        LOG.trace("Called updateDatabaseToolsDatabaseApiGatewayConfigGlobal");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigGlobalDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {
        LOG.trace("Called updateDatabaseToolsDatabaseApiGatewayConfigPool");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {
        LOG.trace("Called updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {
        LOG.trace("Called updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
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
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdatePropertySetResponse updatePropertySet(UpdatePropertySetRequest request) {
        LOG.trace("Called updatePropertySet");
        final UpdatePropertySetRequest interceptedRequest =
                UpdatePropertySetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePropertySetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdatePropertySet",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdatePropertySetResponse>
                transformer =
                        UpdatePropertySetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdatePropertySetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateDatabaseToolsConnectionResponse validateDatabaseToolsConnection(
            ValidateDatabaseToolsConnectionRequest request) {
        LOG.trace("Called validateDatabaseToolsConnection");
        final ValidateDatabaseToolsConnectionRequest interceptedRequest =
                ValidateDatabaseToolsConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateDatabaseToolsConnectionResponse>
                transformer =
                        ValidateDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getValidateDatabaseToolsConnectionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ValidateDatabaseToolsIdentityCredentialResponse validateDatabaseToolsIdentityCredential(
            ValidateDatabaseToolsIdentityCredentialRequest request) {
        LOG.trace("Called validateDatabaseToolsIdentityCredential");
        final ValidateDatabaseToolsIdentityCredentialRequest interceptedRequest =
                ValidateDatabaseToolsIdentityCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDatabaseToolsIdentityCredentialConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsIdentityCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateDatabaseToolsIdentityCredentialResponse>
                transformer =
                        ValidateDatabaseToolsIdentityCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getValidateDatabaseToolsIdentityCredentialDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DatabaseToolsRuntimeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatabaseToolsRuntimePaginators getPaginators() {
        return paginators;
    }
}
