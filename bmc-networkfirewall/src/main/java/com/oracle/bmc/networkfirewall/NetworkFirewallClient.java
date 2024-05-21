/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.networkfirewall.internal.http.*;
import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class NetworkFirewallClient implements NetworkFirewall {
    /**
     * Service instance for NetworkFirewall.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKFIREWALL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-firewall.{region}.ocs.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkFirewallClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final NetworkFirewallWaiters waiters;

    private final NetworkFirewallPaginators paginators;
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
    public NetworkFirewallClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    protected NetworkFirewallClient(
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
                                    .nameFormat("NetworkFirewall-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NetworkFirewallWaiters(executorService, this);

        this.paginators = new NetworkFirewallPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NetworkFirewallClient> {
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
        public NetworkFirewallClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new NetworkFirewallClient(
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
    public ApplyNetworkFirewallPolicyResponse applyNetworkFirewallPolicy(
            ApplyNetworkFirewallPolicyRequest request) {
        LOG.trace("Called applyNetworkFirewallPolicy");
        final ApplyNetworkFirewallPolicyRequest interceptedRequest =
                ApplyNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplyNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ApplyNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ApplyNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, ApplyNetworkFirewallPolicyResponse>
                transformer =
                        ApplyNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getApplyNetworkFirewallPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public BulkUploadAddressListsResponse bulkUploadAddressLists(
            BulkUploadAddressListsRequest request) {
        LOG.trace("Called bulkUploadAddressLists");
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
                                request, BulkUploadAddressListsRequest.builder());
            }
            final BulkUploadAddressListsRequest interceptedRequest =
                    BulkUploadAddressListsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadAddressListsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadAddressLists",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/BulkUploadAddressLists");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadAddressListsResponse>
                    transformer =
                            BulkUploadAddressListsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadAddressListsDetails(),
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
                                                            .getBulkUploadAddressListsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadAddressListsDetails());
        }
    }

    @Override
    public BulkUploadApplicationGroupsResponse bulkUploadApplicationGroups(
            BulkUploadApplicationGroupsRequest request) {
        LOG.trace("Called bulkUploadApplicationGroups");
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
                                request, BulkUploadApplicationGroupsRequest.builder());
            }
            final BulkUploadApplicationGroupsRequest interceptedRequest =
                    BulkUploadApplicationGroupsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadApplicationGroupsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadApplicationGroups",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/BulkUploadApplicationGroups");
            java.util.function.Function<
                            javax.ws.rs.core.Response, BulkUploadApplicationGroupsResponse>
                    transformer =
                            BulkUploadApplicationGroupsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadApplicationGroupsDetails(),
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
                                                            .getBulkUploadApplicationGroupsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadApplicationGroupsDetails());
        }
    }

    @Override
    public BulkUploadApplicationsResponse bulkUploadApplications(
            BulkUploadApplicationsRequest request) {
        LOG.trace("Called bulkUploadApplications");
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
                                request, BulkUploadApplicationsRequest.builder());
            }
            final BulkUploadApplicationsRequest interceptedRequest =
                    BulkUploadApplicationsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadApplicationsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadApplications",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/BulkUploadApplications");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadApplicationsResponse>
                    transformer =
                            BulkUploadApplicationsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadApplicationsDetails(),
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
                                                            .getBulkUploadApplicationsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadApplicationsDetails());
        }
    }

    @Override
    public BulkUploadDecryptionProfilesResponse bulkUploadDecryptionProfiles(
            BulkUploadDecryptionProfilesRequest request) {
        LOG.trace("Called bulkUploadDecryptionProfiles");
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
                                request, BulkUploadDecryptionProfilesRequest.builder());
            }
            final BulkUploadDecryptionProfilesRequest interceptedRequest =
                    BulkUploadDecryptionProfilesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadDecryptionProfilesConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadDecryptionProfiles",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/BulkUploadDecryptionProfiles");
            java.util.function.Function<
                            javax.ws.rs.core.Response, BulkUploadDecryptionProfilesResponse>
                    transformer =
                            BulkUploadDecryptionProfilesConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadDecryptionProfilesDetails(),
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
                                                            .getBulkUploadDecryptionProfilesDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadDecryptionProfilesDetails());
        }
    }

    @Override
    public BulkUploadDecryptionRulesResponse bulkUploadDecryptionRules(
            BulkUploadDecryptionRulesRequest request) {
        LOG.trace("Called bulkUploadDecryptionRules");
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
                                request, BulkUploadDecryptionRulesRequest.builder());
            }
            final BulkUploadDecryptionRulesRequest interceptedRequest =
                    BulkUploadDecryptionRulesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadDecryptionRulesConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadDecryptionRules",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/BulkUploadDecryptionRules");
            java.util.function.Function<
                            javax.ws.rs.core.Response, BulkUploadDecryptionRulesResponse>
                    transformer =
                            BulkUploadDecryptionRulesConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadDecryptionRulesDetails(),
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
                                                            .getBulkUploadDecryptionRulesDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadDecryptionRulesDetails());
        }
    }

    @Override
    public BulkUploadMappedSecretsResponse bulkUploadMappedSecrets(
            BulkUploadMappedSecretsRequest request) {
        LOG.trace("Called bulkUploadMappedSecrets");
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
                                request, BulkUploadMappedSecretsRequest.builder());
            }
            final BulkUploadMappedSecretsRequest interceptedRequest =
                    BulkUploadMappedSecretsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadMappedSecretsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadMappedSecrets",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/BulkUploadMappedSecrets");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadMappedSecretsResponse>
                    transformer =
                            BulkUploadMappedSecretsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadMappedSecretsDetails(),
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
                                                            .getBulkUploadMappedSecretsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadMappedSecretsDetails());
        }
    }

    @Override
    public BulkUploadSecurityRulesResponse bulkUploadSecurityRules(
            BulkUploadSecurityRulesRequest request) {
        LOG.trace("Called bulkUploadSecurityRules");
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
                                request, BulkUploadSecurityRulesRequest.builder());
            }
            final BulkUploadSecurityRulesRequest interceptedRequest =
                    BulkUploadSecurityRulesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadSecurityRulesConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadSecurityRules",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/BulkUploadSecurityRules");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadSecurityRulesResponse>
                    transformer =
                            BulkUploadSecurityRulesConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadSecurityRulesDetails(),
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
                                                            .getBulkUploadSecurityRulesDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadSecurityRulesDetails());
        }
    }

    @Override
    public BulkUploadServiceListsResponse bulkUploadServiceLists(
            BulkUploadServiceListsRequest request) {
        LOG.trace("Called bulkUploadServiceLists");
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
                                request, BulkUploadServiceListsRequest.builder());
            }
            final BulkUploadServiceListsRequest interceptedRequest =
                    BulkUploadServiceListsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadServiceListsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadServiceLists",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/BulkUploadServiceLists");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadServiceListsResponse>
                    transformer =
                            BulkUploadServiceListsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadServiceListsDetails(),
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
                                                            .getBulkUploadServiceListsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadServiceListsDetails());
        }
    }

    @Override
    public BulkUploadServicesResponse bulkUploadServices(BulkUploadServicesRequest request) {
        LOG.trace("Called bulkUploadServices");
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
                                request, BulkUploadServicesRequest.builder());
            }
            final BulkUploadServicesRequest interceptedRequest =
                    BulkUploadServicesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadServicesConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadServices",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/BulkUploadServices");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadServicesResponse>
                    transformer =
                            BulkUploadServicesConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadServicesDetails(),
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
                                                            .getBulkUploadServicesDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadServicesDetails());
        }
    }

    @Override
    public BulkUploadUrlListsResponse bulkUploadUrlLists(BulkUploadUrlListsRequest request) {
        LOG.trace("Called bulkUploadUrlLists");
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
                                request, BulkUploadUrlListsRequest.builder());
            }
            final BulkUploadUrlListsRequest interceptedRequest =
                    BulkUploadUrlListsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    BulkUploadUrlListsConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "NetworkFirewall",
                            "BulkUploadUrlLists",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/BulkUploadUrlLists");
            java.util.function.Function<javax.ws.rs.core.Response, BulkUploadUrlListsResponse>
                    transformer =
                            BulkUploadUrlListsConverter.fromResponse(
                                    java.util.Optional.of(serviceDetails));
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
                                                                .getBulkUploadUrlListsDetails(),
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
                                                            .getBulkUploadUrlListsDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getBulkUploadUrlListsDetails());
        }
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
                        "NetworkFirewall",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/CancelWorkRequest");
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
    public ChangeNetworkFirewallCompartmentResponse changeNetworkFirewallCompartment(
            ChangeNetworkFirewallCompartmentRequest request) {
        LOG.trace("Called changeNetworkFirewallCompartment");
        final ChangeNetworkFirewallCompartmentRequest interceptedRequest =
                ChangeNetworkFirewallCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkFirewallCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ChangeNetworkFirewallCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkFirewallCompartmentResponse>
                transformer =
                        ChangeNetworkFirewallCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getChangeNetworkFirewallCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeNetworkFirewallPolicyCompartmentResponse changeNetworkFirewallPolicyCompartment(
            ChangeNetworkFirewallPolicyCompartmentRequest request) {
        LOG.trace("Called changeNetworkFirewallPolicyCompartment");
        final ChangeNetworkFirewallPolicyCompartmentRequest interceptedRequest =
                ChangeNetworkFirewallPolicyCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkFirewallPolicyCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ChangeNetworkFirewallPolicyCompartment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkFirewallPolicyCompartmentResponse>
                transformer =
                        ChangeNetworkFirewallPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getChangeNetworkFirewallPolicyCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CloneNetworkFirewallPolicyResponse cloneNetworkFirewallPolicy(
            CloneNetworkFirewallPolicyRequest request) {
        LOG.trace("Called cloneNetworkFirewallPolicy");
        final CloneNetworkFirewallPolicyRequest interceptedRequest =
                CloneNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CloneNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CloneNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CloneNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, CloneNetworkFirewallPolicyResponse>
                transformer =
                        CloneNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getCloneNetworkFirewallPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAddressListResponse createAddressList(CreateAddressListRequest request) {
        LOG.trace("Called createAddressList");
        final CreateAddressListRequest interceptedRequest =
                CreateAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAddressListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/CreateAddressList");
        java.util.function.Function<javax.ws.rs.core.Response, CreateAddressListResponse>
                transformer =
                        CreateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateAddressListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        LOG.trace("Called createApplication");
        final CreateApplicationRequest interceptedRequest =
                CreateApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/CreateApplication");
        java.util.function.Function<javax.ws.rs.core.Response, CreateApplicationResponse>
                transformer =
                        CreateApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApplicationGroupResponse createApplicationGroup(
            CreateApplicationGroupRequest request) {
        LOG.trace("Called createApplicationGroup");
        final CreateApplicationGroupRequest interceptedRequest =
                CreateApplicationGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/CreateApplicationGroup");
        java.util.function.Function<javax.ws.rs.core.Response, CreateApplicationGroupResponse>
                transformer =
                        CreateApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateApplicationGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDecryptionProfileResponse createDecryptionProfile(
            CreateDecryptionProfileRequest request) {
        LOG.trace("Called createDecryptionProfile");
        final CreateDecryptionProfileRequest interceptedRequest =
                CreateDecryptionProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDecryptionProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/CreateDecryptionProfile");
        java.util.function.Function<javax.ws.rs.core.Response, CreateDecryptionProfileResponse>
                transformer =
                        CreateDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateDecryptionProfileDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDecryptionRuleResponse createDecryptionRule(CreateDecryptionRuleRequest request) {
        LOG.trace("Called createDecryptionRule");
        final CreateDecryptionRuleRequest interceptedRequest =
                CreateDecryptionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDecryptionRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/CreateDecryptionRule");
        java.util.function.Function<javax.ws.rs.core.Response, CreateDecryptionRuleResponse>
                transformer =
                        CreateDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateDecryptionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMappedSecretResponse createMappedSecret(CreateMappedSecretRequest request) {
        LOG.trace("Called createMappedSecret");
        final CreateMappedSecretRequest interceptedRequest =
                CreateMappedSecretConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMappedSecretConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/CreateMappedSecret");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMappedSecretResponse>
                transformer =
                        CreateMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateMappedSecretDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateNetworkFirewallResponse createNetworkFirewall(
            CreateNetworkFirewallRequest request) {
        LOG.trace("Called createNetworkFirewall");
        final CreateNetworkFirewallRequest interceptedRequest =
                CreateNetworkFirewallConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkFirewallConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/CreateNetworkFirewall");
        java.util.function.Function<javax.ws.rs.core.Response, CreateNetworkFirewallResponse>
                transformer =
                        CreateNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateNetworkFirewallDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateNetworkFirewallPolicyResponse createNetworkFirewallPolicy(
            CreateNetworkFirewallPolicyRequest request) {
        LOG.trace("Called createNetworkFirewallPolicy");
        final CreateNetworkFirewallPolicyRequest interceptedRequest =
                CreateNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CreateNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, CreateNetworkFirewallPolicyResponse>
                transformer =
                        CreateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getCreateNetworkFirewallPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSecurityRuleResponse createSecurityRule(CreateSecurityRuleRequest request) {
        LOG.trace("Called createSecurityRule");
        final CreateSecurityRuleRequest interceptedRequest =
                CreateSecurityRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/CreateSecurityRule");
        java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityRuleResponse>
                transformer =
                        CreateSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateSecurityRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateServiceResponse createService(CreateServiceRequest request) {
        LOG.trace("Called createService");
        final CreateServiceRequest interceptedRequest =
                CreateServiceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/CreateService");
        java.util.function.Function<javax.ws.rs.core.Response, CreateServiceResponse> transformer =
                CreateServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateServiceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateServiceListResponse createServiceList(CreateServiceListRequest request) {
        LOG.trace("Called createServiceList");
        final CreateServiceListRequest interceptedRequest =
                CreateServiceListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/CreateServiceList");
        java.util.function.Function<javax.ws.rs.core.Response, CreateServiceListResponse>
                transformer =
                        CreateServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateServiceListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUrlListResponse createUrlList(CreateUrlListRequest request) {
        LOG.trace("Called createUrlList");
        final CreateUrlListRequest interceptedRequest =
                CreateUrlListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUrlListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/CreateUrlList");
        java.util.function.Function<javax.ws.rs.core.Response, CreateUrlListResponse> transformer =
                CreateUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getCreateUrlListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteAddressListResponse deleteAddressList(DeleteAddressListRequest request) {
        LOG.trace("Called deleteAddressList");
        final DeleteAddressListRequest interceptedRequest =
                DeleteAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAddressListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/DeleteAddressList");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteAddressListResponse>
                transformer =
                        DeleteAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        LOG.trace("Called deleteApplication");
        final DeleteApplicationRequest interceptedRequest =
                DeleteApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/DeleteApplication");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteApplicationResponse>
                transformer =
                        DeleteApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteApplicationGroupResponse deleteApplicationGroup(
            DeleteApplicationGroupRequest request) {
        LOG.trace("Called deleteApplicationGroup");
        final DeleteApplicationGroupRequest interceptedRequest =
                DeleteApplicationGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/DeleteApplicationGroup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteApplicationGroupResponse>
                transformer =
                        DeleteApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteDecryptionProfileResponse deleteDecryptionProfile(
            DeleteDecryptionProfileRequest request) {
        LOG.trace("Called deleteDecryptionProfile");
        final DeleteDecryptionProfileRequest interceptedRequest =
                DeleteDecryptionProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDecryptionProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/DeleteDecryptionProfile");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteDecryptionProfileResponse>
                transformer =
                        DeleteDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteDecryptionRuleResponse deleteDecryptionRule(DeleteDecryptionRuleRequest request) {
        LOG.trace("Called deleteDecryptionRule");
        final DeleteDecryptionRuleRequest interceptedRequest =
                DeleteDecryptionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDecryptionRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/DeleteDecryptionRule");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteDecryptionRuleResponse>
                transformer =
                        DeleteDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteMappedSecretResponse deleteMappedSecret(DeleteMappedSecretRequest request) {
        LOG.trace("Called deleteMappedSecret");
        final DeleteMappedSecretRequest interceptedRequest =
                DeleteMappedSecretConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMappedSecretConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/DeleteMappedSecret");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMappedSecretResponse>
                transformer =
                        DeleteMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteNetworkFirewallResponse deleteNetworkFirewall(
            DeleteNetworkFirewallRequest request) {
        LOG.trace("Called deleteNetworkFirewall");
        final DeleteNetworkFirewallRequest interceptedRequest =
                DeleteNetworkFirewallConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkFirewallConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/DeleteNetworkFirewall");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteNetworkFirewallResponse>
                transformer =
                        DeleteNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteNetworkFirewallPolicyResponse deleteNetworkFirewallPolicy(
            DeleteNetworkFirewallPolicyRequest request) {
        LOG.trace("Called deleteNetworkFirewallPolicy");
        final DeleteNetworkFirewallPolicyRequest interceptedRequest =
                DeleteNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/DeleteNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteNetworkFirewallPolicyResponse>
                transformer =
                        DeleteNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteSecurityRuleResponse deleteSecurityRule(DeleteSecurityRuleRequest request) {
        LOG.trace("Called deleteSecurityRule");
        final DeleteSecurityRuleRequest interceptedRequest =
                DeleteSecurityRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/DeleteSecurityRule");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityRuleResponse>
                transformer =
                        DeleteSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        LOG.trace("Called deleteService");
        final DeleteServiceRequest interceptedRequest =
                DeleteServiceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/DeleteService");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteServiceResponse> transformer =
                DeleteServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteServiceListResponse deleteServiceList(DeleteServiceListRequest request) {
        LOG.trace("Called deleteServiceList");
        final DeleteServiceListRequest interceptedRequest =
                DeleteServiceListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/DeleteServiceList");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteServiceListResponse>
                transformer =
                        DeleteServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteUrlListResponse deleteUrlList(DeleteUrlListRequest request) {
        LOG.trace("Called deleteUrlList");
        final DeleteUrlListRequest interceptedRequest =
                DeleteUrlListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUrlListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/DeleteUrlList");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUrlListResponse> transformer =
                DeleteUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public GetAddressListResponse getAddressList(GetAddressListRequest request) {
        LOG.trace("Called getAddressList");
        final GetAddressListRequest interceptedRequest =
                GetAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAddressListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/GetAddressList");
        java.util.function.Function<javax.ws.rs.core.Response, GetAddressListResponse> transformer =
                GetAddressListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetApplicationResponse getApplication(GetApplicationRequest request) {
        LOG.trace("Called getApplication");
        final GetApplicationRequest interceptedRequest =
                GetApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/GetApplication");
        java.util.function.Function<javax.ws.rs.core.Response, GetApplicationResponse> transformer =
                GetApplicationConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetApplicationGroupResponse getApplicationGroup(GetApplicationGroupRequest request) {
        LOG.trace("Called getApplicationGroup");
        final GetApplicationGroupRequest interceptedRequest =
                GetApplicationGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/GetApplicationGroup");
        java.util.function.Function<javax.ws.rs.core.Response, GetApplicationGroupResponse>
                transformer =
                        GetApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDecryptionProfileResponse getDecryptionProfile(GetDecryptionProfileRequest request) {
        LOG.trace("Called getDecryptionProfile");
        final GetDecryptionProfileRequest interceptedRequest =
                GetDecryptionProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDecryptionProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/GetDecryptionProfile");
        java.util.function.Function<javax.ws.rs.core.Response, GetDecryptionProfileResponse>
                transformer =
                        GetDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetDecryptionRuleResponse getDecryptionRule(GetDecryptionRuleRequest request) {
        LOG.trace("Called getDecryptionRule");
        final GetDecryptionRuleRequest interceptedRequest =
                GetDecryptionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDecryptionRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/GetDecryptionRule");
        java.util.function.Function<javax.ws.rs.core.Response, GetDecryptionRuleResponse>
                transformer =
                        GetDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMappedSecretResponse getMappedSecret(GetMappedSecretRequest request) {
        LOG.trace("Called getMappedSecret");
        final GetMappedSecretRequest interceptedRequest =
                GetMappedSecretConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMappedSecretConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/GetMappedSecret");
        java.util.function.Function<javax.ws.rs.core.Response, GetMappedSecretResponse>
                transformer =
                        GetMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetNetworkFirewallResponse getNetworkFirewall(GetNetworkFirewallRequest request) {
        LOG.trace("Called getNetworkFirewall");
        final GetNetworkFirewallRequest interceptedRequest =
                GetNetworkFirewallConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkFirewallConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/GetNetworkFirewall");
        java.util.function.Function<javax.ws.rs.core.Response, GetNetworkFirewallResponse>
                transformer =
                        GetNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetNetworkFirewallPolicyResponse getNetworkFirewallPolicy(
            GetNetworkFirewallPolicyRequest request) {
        LOG.trace("Called getNetworkFirewallPolicy");
        final GetNetworkFirewallPolicyRequest interceptedRequest =
                GetNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/GetNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, GetNetworkFirewallPolicyResponse>
                transformer =
                        GetNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetSecurityRuleResponse getSecurityRule(GetSecurityRuleRequest request) {
        LOG.trace("Called getSecurityRule");
        final GetSecurityRuleRequest interceptedRequest =
                GetSecurityRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/GetSecurityRule");
        java.util.function.Function<javax.ws.rs.core.Response, GetSecurityRuleResponse>
                transformer =
                        GetSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetServiceResponse getService(GetServiceRequest request) {
        LOG.trace("Called getService");
        final GetServiceRequest interceptedRequest = GetServiceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/GetService");
        java.util.function.Function<javax.ws.rs.core.Response, GetServiceResponse> transformer =
                GetServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetServiceListResponse getServiceList(GetServiceListRequest request) {
        LOG.trace("Called getServiceList");
        final GetServiceListRequest interceptedRequest =
                GetServiceListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/GetServiceList");
        java.util.function.Function<javax.ws.rs.core.Response, GetServiceListResponse> transformer =
                GetServiceListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetUrlListResponse getUrlList(GetUrlListRequest request) {
        LOG.trace("Called getUrlList");
        final GetUrlListRequest interceptedRequest = GetUrlListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUrlListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/GetUrlList");
        java.util.function.Function<javax.ws.rs.core.Response, GetUrlListResponse> transformer =
                GetUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
                        "NetworkFirewall",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/GetWorkRequest");
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
    public ListAddressListsResponse listAddressLists(ListAddressListsRequest request) {
        LOG.trace("Called listAddressLists");
        final ListAddressListsRequest interceptedRequest =
                ListAddressListsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAddressListsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListAddressLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/ListAddressLists");
        java.util.function.Function<javax.ws.rs.core.Response, ListAddressListsResponse>
                transformer =
                        ListAddressListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListApplicationGroupsResponse listApplicationGroups(
            ListApplicationGroupsRequest request) {
        LOG.trace("Called listApplicationGroups");
        final ListApplicationGroupsRequest interceptedRequest =
                ListApplicationGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListApplicationGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/ListApplicationGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListApplicationGroupsResponse>
                transformer =
                        ListApplicationGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        LOG.trace("Called listApplications");
        final ListApplicationsRequest interceptedRequest =
                ListApplicationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/ListApplications");
        java.util.function.Function<javax.ws.rs.core.Response, ListApplicationsResponse>
                transformer =
                        ListApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListDecryptionProfilesResponse listDecryptionProfiles(
            ListDecryptionProfilesRequest request) {
        LOG.trace("Called listDecryptionProfiles");
        final ListDecryptionProfilesRequest interceptedRequest =
                ListDecryptionProfilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDecryptionProfilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListDecryptionProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/ListDecryptionProfiles");
        java.util.function.Function<javax.ws.rs.core.Response, ListDecryptionProfilesResponse>
                transformer =
                        ListDecryptionProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListDecryptionRulesResponse listDecryptionRules(ListDecryptionRulesRequest request) {
        LOG.trace("Called listDecryptionRules");
        final ListDecryptionRulesRequest interceptedRequest =
                ListDecryptionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDecryptionRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListDecryptionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/ListDecryptionRules");
        java.util.function.Function<javax.ws.rs.core.Response, ListDecryptionRulesResponse>
                transformer =
                        ListDecryptionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMappedSecretsResponse listMappedSecrets(ListMappedSecretsRequest request) {
        LOG.trace("Called listMappedSecrets");
        final ListMappedSecretsRequest interceptedRequest =
                ListMappedSecretsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMappedSecretsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListMappedSecrets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/ListMappedSecrets");
        java.util.function.Function<javax.ws.rs.core.Response, ListMappedSecretsResponse>
                transformer =
                        ListMappedSecretsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkFirewallPoliciesResponse listNetworkFirewallPolicies(
            ListNetworkFirewallPoliciesRequest request) {
        LOG.trace("Called listNetworkFirewallPolicies");
        final ListNetworkFirewallPoliciesRequest interceptedRequest =
                ListNetworkFirewallPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkFirewallPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewallPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ListNetworkFirewallPolicies");
        java.util.function.Function<javax.ws.rs.core.Response, ListNetworkFirewallPoliciesResponse>
                transformer =
                        ListNetworkFirewallPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkFirewallsResponse listNetworkFirewalls(ListNetworkFirewallsRequest request) {
        LOG.trace("Called listNetworkFirewalls");
        final ListNetworkFirewallsRequest interceptedRequest =
                ListNetworkFirewallsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkFirewallsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewalls",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ListNetworkFirewalls");
        java.util.function.Function<javax.ws.rs.core.Response, ListNetworkFirewallsResponse>
                transformer =
                        ListNetworkFirewallsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListSecurityRulesResponse listSecurityRules(ListSecurityRulesRequest request) {
        LOG.trace("Called listSecurityRules");
        final ListSecurityRulesRequest interceptedRequest =
                ListSecurityRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/ListSecurityRules");
        java.util.function.Function<javax.ws.rs.core.Response, ListSecurityRulesResponse>
                transformer =
                        ListSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListServiceListsResponse listServiceLists(ListServiceListsRequest request) {
        LOG.trace("Called listServiceLists");
        final ListServiceListsRequest interceptedRequest =
                ListServiceListsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServiceListsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListServiceLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/ListServiceLists");
        java.util.function.Function<javax.ws.rs.core.Response, ListServiceListsResponse>
                transformer =
                        ListServiceListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListServicesResponse listServices(ListServicesRequest request) {
        LOG.trace("Called listServices");
        final ListServicesRequest interceptedRequest =
                ListServicesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServicesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/ListServices");
        java.util.function.Function<javax.ws.rs.core.Response, ListServicesResponse> transformer =
                ListServicesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListUrlListsResponse listUrlLists(ListUrlListsRequest request) {
        LOG.trace("Called listUrlLists");
        final ListUrlListsRequest interceptedRequest =
                ListUrlListsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUrlListsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListUrlLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/ListUrlLists");
        java.util.function.Function<javax.ws.rs.core.Response, ListUrlListsResponse> transformer =
                ListUrlListsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
                        "NetworkFirewall",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestError/ListWorkRequestErrors");
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
                        "NetworkFirewall",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "NetworkFirewall",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/ListWorkRequests");
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
    public MigrateNetworkFirewallPolicyResponse migrateNetworkFirewallPolicy(
            MigrateNetworkFirewallPolicyRequest request) {
        LOG.trace("Called migrateNetworkFirewallPolicy");
        final MigrateNetworkFirewallPolicyRequest interceptedRequest =
                MigrateNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MigrateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "MigrateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/MigrateNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, MigrateNetworkFirewallPolicyResponse>
                transformer =
                        MigrateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public UpdateAddressListResponse updateAddressList(UpdateAddressListRequest request) {
        LOG.trace("Called updateAddressList");
        final UpdateAddressListRequest interceptedRequest =
                UpdateAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAddressListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/UpdateAddressList");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateAddressListResponse>
                transformer =
                        UpdateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateAddressListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        LOG.trace("Called updateApplication");
        final UpdateApplicationRequest interceptedRequest =
                UpdateApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/UpdateApplication");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateApplicationResponse>
                transformer =
                        UpdateApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateApplicationGroupResponse updateApplicationGroup(
            UpdateApplicationGroupRequest request) {
        LOG.trace("Called updateApplicationGroup");
        final UpdateApplicationGroupRequest interceptedRequest =
                UpdateApplicationGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/UpdateApplicationGroup");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateApplicationGroupResponse>
                transformer =
                        UpdateApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateApplicationGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDecryptionProfileResponse updateDecryptionProfile(
            UpdateDecryptionProfileRequest request) {
        LOG.trace("Called updateDecryptionProfile");
        final UpdateDecryptionProfileRequest interceptedRequest =
                UpdateDecryptionProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDecryptionProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/UpdateDecryptionProfile");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateDecryptionProfileResponse>
                transformer =
                        UpdateDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateDecryptionProfileDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDecryptionRuleResponse updateDecryptionRule(UpdateDecryptionRuleRequest request) {
        LOG.trace("Called updateDecryptionRule");
        final UpdateDecryptionRuleRequest interceptedRequest =
                UpdateDecryptionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDecryptionRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/UpdateDecryptionRule");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateDecryptionRuleResponse>
                transformer =
                        UpdateDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateDecryptionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMappedSecretResponse updateMappedSecret(UpdateMappedSecretRequest request) {
        LOG.trace("Called updateMappedSecret");
        final UpdateMappedSecretRequest interceptedRequest =
                UpdateMappedSecretConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMappedSecretConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/UpdateMappedSecret");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateMappedSecretResponse>
                transformer =
                        UpdateMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateMappedSecretDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateNetworkFirewallResponse updateNetworkFirewall(
            UpdateNetworkFirewallRequest request) {
        LOG.trace("Called updateNetworkFirewall");
        final UpdateNetworkFirewallRequest interceptedRequest =
                UpdateNetworkFirewallConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkFirewallConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/UpdateNetworkFirewall");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateNetworkFirewallResponse>
                transformer =
                        UpdateNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateNetworkFirewallDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateNetworkFirewallPolicyResponse updateNetworkFirewallPolicy(
            UpdateNetworkFirewallPolicyRequest request) {
        LOG.trace("Called updateNetworkFirewallPolicy");
        final UpdateNetworkFirewallPolicyRequest interceptedRequest =
                UpdateNetworkFirewallPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/UpdateNetworkFirewallPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateNetworkFirewallPolicyResponse>
                transformer =
                        UpdateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                        .getUpdateNetworkFirewallPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSecurityRuleResponse updateSecurityRule(UpdateSecurityRuleRequest request) {
        LOG.trace("Called updateSecurityRule");
        final UpdateSecurityRuleRequest interceptedRequest =
                UpdateSecurityRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/UpdateSecurityRule");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityRuleResponse>
                transformer =
                        UpdateSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateSecurityRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        LOG.trace("Called updateService");
        final UpdateServiceRequest interceptedRequest =
                UpdateServiceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateServiceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/UpdateService");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateServiceResponse> transformer =
                UpdateServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateServiceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateServiceListResponse updateServiceList(UpdateServiceListRequest request) {
        LOG.trace("Called updateServiceList");
        final UpdateServiceListRequest interceptedRequest =
                UpdateServiceListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateServiceListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/UpdateServiceList");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateServiceListResponse>
                transformer =
                        UpdateServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateServiceListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateUrlListResponse updateUrlList(UpdateUrlListRequest request) {
        LOG.trace("Called updateUrlList");
        final UpdateUrlListRequest interceptedRequest =
                UpdateUrlListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUrlListConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/UpdateUrlList");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateUrlListResponse> transformer =
                UpdateUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUpdateUrlListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public NetworkFirewallWaiters getWaiters() {
        return waiters;
    }

    @Override
    public NetworkFirewallPaginators getPaginators() {
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
