/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer;

import com.oracle.bmc.networkloadbalancer.internal.http.*;
import com.oracle.bmc.networkloadbalancer.requests.*;
import com.oracle.bmc.networkloadbalancer.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.extern.slf4j.Slf4j
public class NetworkLoadBalancerClient implements NetworkLoadBalancer {
    /**
     * Service instance for NetworkLoadBalancer.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKLOADBALANCER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-load-balancer-api.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final NetworkLoadBalancerWaiters waiters;

    private final NetworkLoadBalancerPaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
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
    public NetworkLoadBalancerClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    public NetworkLoadBalancerClient(
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
    protected NetworkLoadBalancerClient(
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
                                    .setNameFormat("NetworkLoadBalancer-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NetworkLoadBalancerWaiters(executorService, this);

        this.paginators = new NetworkLoadBalancerPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, NetworkLoadBalancerClient> {
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
        public NetworkLoadBalancerClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new NetworkLoadBalancerClient(
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
    public ChangeNetworkLoadBalancerCompartmentResponse changeNetworkLoadBalancerCompartment(
            ChangeNetworkLoadBalancerCompartmentRequest request) {
        LOG.trace("Called changeNetworkLoadBalancerCompartment");
        final ChangeNetworkLoadBalancerCompartmentRequest interceptedRequest =
                ChangeNetworkLoadBalancerCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkLoadBalancerCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeNetworkLoadBalancerCompartmentResponse>
                transformer = ChangeNetworkLoadBalancerCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ChangeNetworkLoadBalancerCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ChangeNetworkLoadBalancerCompartment");
        return retrier.execute(
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
                                                        .getChangeNetworkLoadBalancerCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateBackendResponse createBackend(CreateBackendRequest request) {
        LOG.trace("Called createBackend");
        final CreateBackendRequest interceptedRequest =
                CreateBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendResponse>
                transformer = CreateBackendConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "CreateBackend",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/CreateBackend");
        return retrier.execute(
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
                                                retriedRequest.getCreateBackendDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request) {
        LOG.trace("Called createBackendSet");
        final CreateBackendSetRequest interceptedRequest =
                CreateBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendSetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackendSetResponse>
                transformer = CreateBackendSetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "CreateBackendSet",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/CreateBackendSet");
        return retrier.execute(
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
                                                retriedRequest.getCreateBackendSetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        LOG.trace("Called createListener");
        final CreateListenerRequest interceptedRequest =
                CreateListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListenerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateListenerResponse>
                transformer = CreateListenerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "CreateListener",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/CreateListener");
        return retrier.execute(
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
                                                retriedRequest.getCreateListenerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateNetworkLoadBalancerResponse createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request) {
        LOG.trace("Called createNetworkLoadBalancer");
        final CreateNetworkLoadBalancerRequest interceptedRequest =
                CreateNetworkLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateNetworkLoadBalancerResponse>
                transformer = CreateNetworkLoadBalancerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "CreateNetworkLoadBalancer",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/CreateNetworkLoadBalancer");
        return retrier.execute(
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
                                                        .getCreateNetworkLoadBalancerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteBackendResponse deleteBackend(DeleteBackendRequest request) {
        LOG.trace("Called deleteBackend");
        final DeleteBackendRequest interceptedRequest =
                DeleteBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendResponse>
                transformer = DeleteBackendConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "DeleteBackend",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/DeleteBackend");
        return retrier.execute(
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
    public DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request) {
        LOG.trace("Called deleteBackendSet");
        final DeleteBackendSetRequest interceptedRequest =
                DeleteBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendSetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackendSetResponse>
                transformer = DeleteBackendSetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "DeleteBackendSet",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/DeleteBackendSet");
        return retrier.execute(
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
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        LOG.trace("Called deleteListener");
        final DeleteListenerRequest interceptedRequest =
                DeleteListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListenerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteListenerResponse>
                transformer = DeleteListenerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "DeleteListener",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/DeleteListener");
        return retrier.execute(
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
    public DeleteNetworkLoadBalancerResponse deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request) {
        LOG.trace("Called deleteNetworkLoadBalancer");
        final DeleteNetworkLoadBalancerRequest interceptedRequest =
                DeleteNetworkLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteNetworkLoadBalancerResponse>
                transformer = DeleteNetworkLoadBalancerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "DeleteNetworkLoadBalancer",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/DeleteNetworkLoadBalancer");
        return retrier.execute(
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
    public GetBackendResponse getBackend(GetBackendRequest request) {
        LOG.trace("Called getBackend");
        final GetBackendRequest interceptedRequest = GetBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendResponse> transformer =
                GetBackendConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetBackend",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/GetBackend");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request) {
        LOG.trace("Called getBackendHealth");
        final GetBackendHealthRequest interceptedRequest =
                GetBackendHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendHealthConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendHealthResponse>
                transformer = GetBackendHealthConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetBackendHealth",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendHealth/GetBackendHealth");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetBackendSetResponse getBackendSet(GetBackendSetRequest request) {
        LOG.trace("Called getBackendSet");
        final GetBackendSetRequest interceptedRequest =
                GetBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendSetResponse>
                transformer = GetBackendSetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetBackendSet",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/GetBackendSet");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request) {
        LOG.trace("Called getBackendSetHealth");
        final GetBackendSetHealthRequest interceptedRequest =
                GetBackendSetHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetHealthConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBackendSetHealthResponse>
                transformer = GetBackendSetHealthConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetBackendSetHealth",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetHealth/GetBackendSetHealth");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request) {
        LOG.trace("Called getHealthChecker");
        final GetHealthCheckerRequest interceptedRequest =
                GetHealthCheckerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHealthCheckerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetHealthCheckerResponse>
                transformer = GetHealthCheckerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetHealthChecker",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/GetHealthChecker");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetListenerResponse getListener(GetListenerRequest request) {
        LOG.trace("Called getListener");
        final GetListenerRequest interceptedRequest =
                GetListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListenerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetListenerResponse>
                transformer = GetListenerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetListener",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/GetListener");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetNetworkLoadBalancerResponse getNetworkLoadBalancer(
            GetNetworkLoadBalancerRequest request) {
        LOG.trace("Called getNetworkLoadBalancer");
        final GetNetworkLoadBalancerRequest interceptedRequest =
                GetNetworkLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetNetworkLoadBalancerResponse>
                transformer = GetNetworkLoadBalancerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetNetworkLoadBalancer",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/GetNetworkLoadBalancer");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetNetworkLoadBalancerHealthResponse getNetworkLoadBalancerHealth(
            GetNetworkLoadBalancerHealthRequest request) {
        LOG.trace("Called getNetworkLoadBalancerHealth");
        final GetNetworkLoadBalancerHealthRequest interceptedRequest =
                GetNetworkLoadBalancerHealthConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkLoadBalancerHealthConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetNetworkLoadBalancerHealthResponse>
                transformer = GetNetworkLoadBalancerHealthConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetNetworkLoadBalancerHealth",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/GetNetworkLoadBalancerHealth");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/GetWorkRequest");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request) {
        LOG.trace("Called listBackendSets");
        final ListBackendSetsRequest interceptedRequest =
                ListBackendSetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendSetsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendSetsResponse>
                transformer = ListBackendSetsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListBackendSets",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetSummary/ListBackendSets");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListBackendsResponse listBackends(ListBackendsRequest request) {
        LOG.trace("Called listBackends");
        final ListBackendsRequest interceptedRequest =
                ListBackendsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBackendsResponse>
                transformer = ListBackendsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListBackends",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSummary/ListBackends");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListListenersResponse listListeners(ListListenersRequest request) {
        LOG.trace("Called listListeners");
        final ListListenersRequest interceptedRequest =
                ListListenersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListenersConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListListenersResponse>
                transformer = ListListenersConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListListeners",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerSummary/ListListeners");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkLoadBalancerHealthsResponse listNetworkLoadBalancerHealths(
            ListNetworkLoadBalancerHealthsRequest request) {
        LOG.trace("Called listNetworkLoadBalancerHealths");
        final ListNetworkLoadBalancerHealthsRequest interceptedRequest =
                ListNetworkLoadBalancerHealthsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancerHealthsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancerHealthsResponse>
                transformer = ListNetworkLoadBalancerHealthsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListNetworkLoadBalancerHealths",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/ListNetworkLoadBalancerHealths");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkLoadBalancersResponse listNetworkLoadBalancers(
            ListNetworkLoadBalancersRequest request) {
        LOG.trace("Called listNetworkLoadBalancers");
        final ListNetworkLoadBalancersRequest interceptedRequest =
                ListNetworkLoadBalancersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListNetworkLoadBalancersResponse>
                transformer = ListNetworkLoadBalancersConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListNetworkLoadBalancers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ListNetworkLoadBalancers");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkLoadBalancersPoliciesResponse listNetworkLoadBalancersPolicies(
            ListNetworkLoadBalancersPoliciesRequest request) {
        LOG.trace("Called listNetworkLoadBalancersPolicies");
        final ListNetworkLoadBalancersPoliciesRequest interceptedRequest =
                ListNetworkLoadBalancersPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersPoliciesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancersPoliciesResponse>
                transformer = ListNetworkLoadBalancersPoliciesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListNetworkLoadBalancersPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancingPolicy/ListNetworkLoadBalancersPolicies");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListNetworkLoadBalancersProtocolsResponse listNetworkLoadBalancersProtocols(
            ListNetworkLoadBalancersProtocolsRequest request) {
        LOG.trace("Called listNetworkLoadBalancersProtocols");
        final ListNetworkLoadBalancersProtocolsRequest interceptedRequest =
                ListNetworkLoadBalancersProtocolsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersProtocolsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancersProtocolsResponse>
                transformer = ListNetworkLoadBalancersProtocolsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListNetworkLoadBalancersProtocols",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerProtocols/ListNetworkLoadBalancersProtocols");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestError/ListWorkRequestErrors");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestLogEntry/ListWorkRequestLogs");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
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
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/ListWorkRequests");
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateBackendResponse updateBackend(UpdateBackendRequest request) {
        LOG.trace("Called updateBackend");
        final UpdateBackendRequest interceptedRequest =
                UpdateBackendConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendResponse>
                transformer = UpdateBackendConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateBackend",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/UpdateBackend");
        return retrier.execute(
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
                                                retriedRequest.getUpdateBackendDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request) {
        LOG.trace("Called updateBackendSet");
        final UpdateBackendSetRequest interceptedRequest =
                UpdateBackendSetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendSetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackendSetResponse>
                transformer = UpdateBackendSetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateBackendSet",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/UpdateBackendSet");
        return retrier.execute(
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
                                                retriedRequest.getUpdateBackendSetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request) {
        LOG.trace("Called updateHealthChecker");
        final UpdateHealthCheckerRequest interceptedRequest =
                UpdateHealthCheckerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHealthCheckerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateHealthCheckerResponse>
                transformer = UpdateHealthCheckerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateHealthChecker",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/UpdateHealthChecker");
        return retrier.execute(
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
                                                retriedRequest.getUpdateHealthCheckerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        LOG.trace("Called updateListener");
        final UpdateListenerRequest interceptedRequest =
                UpdateListenerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListenerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateListenerResponse>
                transformer = UpdateListenerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateListener",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/UpdateListener");
        return retrier.execute(
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
                                                retriedRequest.getUpdateListenerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateNetworkLoadBalancerResponse updateNetworkLoadBalancer(
            UpdateNetworkLoadBalancerRequest request) {
        LOG.trace("Called updateNetworkLoadBalancer");
        final UpdateNetworkLoadBalancerRequest interceptedRequest =
                UpdateNetworkLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNetworkLoadBalancerResponse>
                transformer = UpdateNetworkLoadBalancerConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateNetworkLoadBalancer",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkLoadBalancer");
        return retrier.execute(
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
                                                        .getUpdateNetworkLoadBalancerDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateNetworkSecurityGroupsResponse updateNetworkSecurityGroups(
            UpdateNetworkSecurityGroupsRequest request) {
        LOG.trace("Called updateNetworkSecurityGroups");
        final UpdateNetworkSecurityGroupsRequest interceptedRequest =
                UpdateNetworkSecurityGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkSecurityGroupsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSecurityGroupsResponse>
                transformer = UpdateNetworkSecurityGroupsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "NetworkLoadBalancer",
                "UpdateNetworkSecurityGroups",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkSecurityGroups");
        return retrier.execute(
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
                                                        .getUpdateNetworkSecurityGroupsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public NetworkLoadBalancerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public NetworkLoadBalancerPaginators getPaginators() {
        return paginators;
    }
}
