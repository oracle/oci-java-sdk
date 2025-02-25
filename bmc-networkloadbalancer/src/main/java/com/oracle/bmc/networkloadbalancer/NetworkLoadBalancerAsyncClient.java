/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer;

import com.oracle.bmc.networkloadbalancer.internal.http.*;
import com.oracle.bmc.networkloadbalancer.requests.*;
import com.oracle.bmc.networkloadbalancer.responses.*;

/**
 * Async client implementation for NetworkLoadBalancer service. <br/>
 * There are two ways to use async client:
 * 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
 * getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else,
 * because the stream will be closed right after the AsyncHandler is invoked. <br/>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
 * but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
 * is used, it is still safe to use the Future to determine whether or not the request was completed via
 * Future.isDone/isCancelled.<br/>
 * Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class NetworkLoadBalancerAsyncClient implements NetworkLoadBalancerAsync {
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

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkLoadBalancerAsyncClient.class);

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

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
    public NetworkLoadBalancerAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
    public NetworkLoadBalancerAsyncClient(
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
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
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
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    public NetworkLoadBalancerAsyncClient(
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
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.clientConfigurationToUse = configuration;

        this.refreshClient();

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
                    Builder, NetworkLoadBalancerAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public NetworkLoadBalancerAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new NetworkLoadBalancerAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
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
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient =
                this.restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        this.clientConfigurationToUse,
                        this.isNonBufferingApacheClient);

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
    public java.util.concurrent.Future<ChangeNetworkLoadBalancerCompartmentResponse>
            changeNetworkLoadBalancerCompartment(
                    ChangeNetworkLoadBalancerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkLoadBalancerCompartmentRequest,
                                    ChangeNetworkLoadBalancerCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNetworkLoadBalancerCompartment");
        final ChangeNetworkLoadBalancerCompartmentRequest interceptedRequest =
                ChangeNetworkLoadBalancerCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkLoadBalancerCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ChangeNetworkLoadBalancerCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ChangeNetworkLoadBalancerCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkLoadBalancerCompartmentResponse>
                transformer =
                        ChangeNetworkLoadBalancerCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNetworkLoadBalancerCompartmentRequest,
                        ChangeNetworkLoadBalancerCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNetworkLoadBalancerCompartmentRequest,
                                ChangeNetworkLoadBalancerCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNetworkLoadBalancerCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNetworkLoadBalancerCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNetworkLoadBalancerCompartmentRequest,
                    ChangeNetworkLoadBalancerCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                    handler) {
        LOG.trace("Called async createBackend");
        final CreateBackendRequest interceptedRequest =
                CreateBackendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "CreateBackend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/CreateBackend");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBackendResponse>
                transformer =
                        CreateBackendConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBackendRequest, CreateBackendResponse>,
                        java.util.concurrent.Future<CreateBackendResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBackendDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBackendRequest, CreateBackendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBackendSetRequest, CreateBackendSetResponse>
                    handler) {
        LOG.trace("Called async createBackendSet");
        final CreateBackendSetRequest interceptedRequest =
                CreateBackendSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackendSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "CreateBackendSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/CreateBackendSet");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBackendSetResponse>
                transformer =
                        CreateBackendSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBackendSetRequest, CreateBackendSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBackendSetRequest, CreateBackendSetResponse>,
                        java.util.concurrent.Future<CreateBackendSetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBackendSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBackendSetRequest, CreateBackendSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateListenerRequest, CreateListenerResponse>
                    handler) {
        LOG.trace("Called async createListener");
        final CreateListenerRequest interceptedRequest =
                CreateListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "CreateListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/CreateListener");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateListenerResponse>
                transformer =
                        CreateListenerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateListenerRequest, CreateListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListenerRequest, CreateListenerResponse>,
                        java.util.concurrent.Future<CreateListenerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListenerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListenerRequest, CreateListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkLoadBalancerResponse> createNetworkLoadBalancer(
            CreateNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkLoadBalancerRequest, CreateNetworkLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async createNetworkLoadBalancer");
        final CreateNetworkLoadBalancerRequest interceptedRequest =
                CreateNetworkLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "CreateNetworkLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/CreateNetworkLoadBalancer");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateNetworkLoadBalancerResponse>
                transformer =
                        CreateNetworkLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkLoadBalancerRequest, CreateNetworkLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkLoadBalancerRequest,
                                CreateNetworkLoadBalancerResponse>,
                        java.util.concurrent.Future<CreateNetworkLoadBalancerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNetworkLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkLoadBalancerRequest, CreateNetworkLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler) {
        LOG.trace("Called async deleteBackend");
        final DeleteBackendRequest interceptedRequest =
                DeleteBackendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "DeleteBackend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/DeleteBackend");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBackendResponse>
                transformer =
                        DeleteBackendConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBackendRequest, DeleteBackendResponse>,
                        java.util.concurrent.Future<DeleteBackendResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBackendRequest, DeleteBackendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBackendSetRequest, DeleteBackendSetResponse>
                    handler) {
        LOG.trace("Called async deleteBackendSet");
        final DeleteBackendSetRequest interceptedRequest =
                DeleteBackendSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackendSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "DeleteBackendSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/DeleteBackendSet");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBackendSetResponse>
                transformer =
                        DeleteBackendSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBackendSetRequest, DeleteBackendSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBackendSetRequest, DeleteBackendSetResponse>,
                        java.util.concurrent.Future<DeleteBackendSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBackendSetRequest, DeleteBackendSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteListenerRequest, DeleteListenerResponse>
                    handler) {
        LOG.trace("Called async deleteListener");
        final DeleteListenerRequest interceptedRequest =
                DeleteListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "DeleteListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/DeleteListener");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteListenerResponse>
                transformer =
                        DeleteListenerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteListenerRequest, DeleteListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListenerRequest, DeleteListenerResponse>,
                        java.util.concurrent.Future<DeleteListenerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListenerRequest, DeleteListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkLoadBalancerResponse> deleteNetworkLoadBalancer(
            DeleteNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkLoadBalancerRequest, DeleteNetworkLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async deleteNetworkLoadBalancer");
        final DeleteNetworkLoadBalancerRequest interceptedRequest =
                DeleteNetworkLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "DeleteNetworkLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/DeleteNetworkLoadBalancer");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteNetworkLoadBalancerResponse>
                transformer =
                        DeleteNetworkLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkLoadBalancerRequest, DeleteNetworkLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkLoadBalancerRequest,
                                DeleteNetworkLoadBalancerResponse>,
                        java.util.concurrent.Future<DeleteNetworkLoadBalancerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkLoadBalancerRequest, DeleteNetworkLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse>
                    handler) {
        LOG.trace("Called async getBackend");
        final GetBackendRequest interceptedRequest = GetBackendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetBackend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/GetBackend");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBackendResponse>
                transformer =
                        GetBackendConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackendRequest, GetBackendResponse>,
                        java.util.concurrent.Future<GetBackendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackendRequest, GetBackendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackendHealthResponse> getBackendHealth(
            GetBackendHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendHealthRequest, GetBackendHealthResponse>
                    handler) {
        LOG.trace("Called async getBackendHealth");
        final GetBackendHealthRequest interceptedRequest =
                GetBackendHealthConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendHealthConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendHealth/GetBackendHealth");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBackendHealthResponse>
                transformer =
                        GetBackendHealthConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBackendHealthRequest, GetBackendHealthResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackendHealthRequest, GetBackendHealthResponse>,
                        java.util.concurrent.Future<GetBackendHealthResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackendHealthRequest, GetBackendHealthResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackendOperationalStatusResponse>
            getBackendOperationalStatus(
                    GetBackendOperationalStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetBackendOperationalStatusRequest,
                                    GetBackendOperationalStatusResponse>
                            handler) {
        LOG.trace("Called async getBackendOperationalStatus");
        final GetBackendOperationalStatusRequest interceptedRequest =
                GetBackendOperationalStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendOperationalStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendOperationalStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendOperationalStatus/GetBackendOperationalStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetBackendOperationalStatusResponse>
                transformer =
                        GetBackendOperationalStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBackendOperationalStatusRequest, GetBackendOperationalStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackendOperationalStatusRequest,
                                GetBackendOperationalStatusResponse>,
                        java.util.concurrent.Future<GetBackendOperationalStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackendOperationalStatusRequest, GetBackendOperationalStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                    handler) {
        LOG.trace("Called async getBackendSet");
        final GetBackendSetRequest interceptedRequest =
                GetBackendSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/GetBackendSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBackendSetResponse>
                transformer =
                        GetBackendSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackendSetRequest, GetBackendSetResponse>,
                        java.util.concurrent.Future<GetBackendSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackendSetRequest, GetBackendSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackendSetHealthResponse> getBackendSetHealth(
            GetBackendSetHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBackendSetHealthRequest, GetBackendSetHealthResponse>
                    handler) {
        LOG.trace("Called async getBackendSetHealth");
        final GetBackendSetHealthRequest interceptedRequest =
                GetBackendSetHealthConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackendSetHealthConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetBackendSetHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetHealth/GetBackendSetHealth");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBackendSetHealthResponse>
                transformer =
                        GetBackendSetHealthConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBackendSetHealthRequest, GetBackendSetHealthResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBackendSetHealthRequest, GetBackendSetHealthResponse>,
                        java.util.concurrent.Future<GetBackendSetHealthResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBackendSetHealthRequest, GetBackendSetHealthResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler) {
        LOG.trace("Called async getHealthChecker");
        final GetHealthCheckerRequest interceptedRequest =
                GetHealthCheckerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHealthCheckerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetHealthChecker",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/GetHealthChecker");
        final java.util.function.Function<javax.ws.rs.core.Response, GetHealthCheckerResponse>
                transformer =
                        GetHealthCheckerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetHealthCheckerRequest, GetHealthCheckerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHealthCheckerRequest, GetHealthCheckerResponse>,
                        java.util.concurrent.Future<GetHealthCheckerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHealthCheckerRequest, GetHealthCheckerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetListenerResponse> getListener(
            GetListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetListenerRequest, GetListenerResponse>
                    handler) {
        LOG.trace("Called async getListener");
        final GetListenerRequest interceptedRequest =
                GetListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/GetListener");
        final java.util.function.Function<javax.ws.rs.core.Response, GetListenerResponse>
                transformer =
                        GetListenerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetListenerRequest, GetListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListenerRequest, GetListenerResponse>,
                        java.util.concurrent.Future<GetListenerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListenerRequest, GetListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkLoadBalancerResponse> getNetworkLoadBalancer(
            GetNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkLoadBalancerRequest, GetNetworkLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async getNetworkLoadBalancer");
        final GetNetworkLoadBalancerRequest interceptedRequest =
                GetNetworkLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetNetworkLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/GetNetworkLoadBalancer");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNetworkLoadBalancerResponse>
                transformer =
                        GetNetworkLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkLoadBalancerRequest, GetNetworkLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkLoadBalancerRequest, GetNetworkLoadBalancerResponse>,
                        java.util.concurrent.Future<GetNetworkLoadBalancerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkLoadBalancerRequest, GetNetworkLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkLoadBalancerHealthResponse>
            getNetworkLoadBalancerHealth(
                    GetNetworkLoadBalancerHealthRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNetworkLoadBalancerHealthRequest,
                                    GetNetworkLoadBalancerHealthResponse>
                            handler) {
        LOG.trace("Called async getNetworkLoadBalancerHealth");
        final GetNetworkLoadBalancerHealthRequest interceptedRequest =
                GetNetworkLoadBalancerHealthConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkLoadBalancerHealthConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetNetworkLoadBalancerHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/GetNetworkLoadBalancerHealth");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetNetworkLoadBalancerHealthResponse>
                transformer =
                        GetNetworkLoadBalancerHealthConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkLoadBalancerHealthRequest, GetNetworkLoadBalancerHealthResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkLoadBalancerHealthRequest,
                                GetNetworkLoadBalancerHealthResponse>,
                        java.util.concurrent.Future<GetNetworkLoadBalancerHealthResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkLoadBalancerHealthRequest, GetNetworkLoadBalancerHealthResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/GetWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer =
                        GetWorkRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWorkRequestRequest, GetWorkRequestResponse>,
                        java.util.concurrent.Future<GetWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWorkRequestRequest, GetWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBackendSetsRequest, ListBackendSetsResponse>
                    handler) {
        LOG.trace("Called async listBackendSets");
        final ListBackendSetsRequest interceptedRequest =
                ListBackendSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListBackendSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSetSummary/ListBackendSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBackendSetsResponse>
                transformer =
                        ListBackendSetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBackendSetsRequest, ListBackendSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBackendSetsRequest, ListBackendSetsResponse>,
                        java.util.concurrent.Future<ListBackendSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBackendSetsRequest, ListBackendSetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler) {
        LOG.trace("Called async listBackends");
        final ListBackendsRequest interceptedRequest =
                ListBackendsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackendsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListBackends",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSummary/ListBackends");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBackendsResponse>
                transformer =
                        ListBackendsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBackendsRequest, ListBackendsResponse>,
                        java.util.concurrent.Future<ListBackendsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBackendsRequest, ListBackendsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListListenersResponse> listListeners(
            ListListenersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListListenersRequest, ListListenersResponse>
                    handler) {
        LOG.trace("Called async listListeners");
        final ListListenersRequest interceptedRequest =
                ListListenersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListenersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListListeners",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerSummary/ListListeners");
        final java.util.function.Function<javax.ws.rs.core.Response, ListListenersResponse>
                transformer =
                        ListListenersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListListenersRequest, ListListenersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListenersRequest, ListListenersResponse>,
                        java.util.concurrent.Future<ListListenersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListenersRequest, ListListenersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancerHealthsResponse>
            listNetworkLoadBalancerHealths(
                    ListNetworkLoadBalancerHealthsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancerHealthsRequest,
                                    ListNetworkLoadBalancerHealthsResponse>
                            handler) {
        LOG.trace("Called async listNetworkLoadBalancerHealths");
        final ListNetworkLoadBalancerHealthsRequest interceptedRequest =
                ListNetworkLoadBalancerHealthsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancerHealthsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancerHealths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancerHealth/ListNetworkLoadBalancerHealths");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancerHealthsResponse>
                transformer =
                        ListNetworkLoadBalancerHealthsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkLoadBalancerHealthsRequest,
                        ListNetworkLoadBalancerHealthsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkLoadBalancerHealthsRequest,
                                ListNetworkLoadBalancerHealthsResponse>,
                        java.util.concurrent.Future<ListNetworkLoadBalancerHealthsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkLoadBalancerHealthsRequest, ListNetworkLoadBalancerHealthsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersResponse> listNetworkLoadBalancers(
            ListNetworkLoadBalancersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>
                    handler) {
        LOG.trace("Called async listNetworkLoadBalancers");
        final ListNetworkLoadBalancersRequest interceptedRequest =
                ListNetworkLoadBalancersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/ListNetworkLoadBalancers");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancersResponse>
                transformer =
                        ListNetworkLoadBalancersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>,
                        java.util.concurrent.Future<ListNetworkLoadBalancersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersPoliciesResponse>
            listNetworkLoadBalancersPolicies(
                    ListNetworkLoadBalancersPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancersPoliciesRequest,
                                    ListNetworkLoadBalancersPoliciesResponse>
                            handler) {
        LOG.trace("Called async listNetworkLoadBalancersPolicies");
        final ListNetworkLoadBalancersPoliciesRequest interceptedRequest =
                ListNetworkLoadBalancersPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancersPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancingPolicy/ListNetworkLoadBalancersPolicies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancersPoliciesResponse>
                transformer =
                        ListNetworkLoadBalancersPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkLoadBalancersPoliciesRequest,
                        ListNetworkLoadBalancersPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkLoadBalancersPoliciesRequest,
                                ListNetworkLoadBalancersPoliciesResponse>,
                        java.util.concurrent.Future<ListNetworkLoadBalancersPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkLoadBalancersPoliciesRequest,
                    ListNetworkLoadBalancersPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkLoadBalancersProtocolsResponse>
            listNetworkLoadBalancersProtocols(
                    ListNetworkLoadBalancersProtocolsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkLoadBalancersProtocolsRequest,
                                    ListNetworkLoadBalancersProtocolsResponse>
                            handler) {
        LOG.trace("Called async listNetworkLoadBalancersProtocols");
        final ListNetworkLoadBalancersProtocolsRequest interceptedRequest =
                ListNetworkLoadBalancersProtocolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkLoadBalancersProtocolsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListNetworkLoadBalancersProtocols",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/ListenerProtocols/ListNetworkLoadBalancersProtocols");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkLoadBalancersProtocolsResponse>
                transformer =
                        ListNetworkLoadBalancersProtocolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkLoadBalancersProtocolsRequest,
                        ListNetworkLoadBalancersProtocolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkLoadBalancersProtocolsRequest,
                                ListNetworkLoadBalancersProtocolsResponse>,
                        java.util.concurrent.Future<ListNetworkLoadBalancersProtocolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkLoadBalancersProtocolsRequest,
                    ListNetworkLoadBalancersProtocolsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestError/ListWorkRequestErrors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequestLogEntry/ListWorkRequestLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/WorkRequest/ListWorkRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer =
                        ListWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestsRequest, ListWorkRequestsResponse>,
                        java.util.concurrent.Future<ListWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestsRequest, ListWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendResponse> updateBackend(
            UpdateBackendRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBackendRequest, UpdateBackendResponse>
                    handler) {
        LOG.trace("Called async updateBackend");
        final UpdateBackendRequest interceptedRequest =
                UpdateBackendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateBackend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Backend/UpdateBackend");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBackendResponse>
                transformer =
                        UpdateBackendConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBackendRequest, UpdateBackendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBackendRequest, UpdateBackendResponse>,
                        java.util.concurrent.Future<UpdateBackendResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBackendDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBackendRequest, UpdateBackendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendSetResponse> updateBackendSet(
            UpdateBackendSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBackendSetRequest, UpdateBackendSetResponse>
                    handler) {
        LOG.trace("Called async updateBackendSet");
        final UpdateBackendSetRequest interceptedRequest =
                UpdateBackendSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackendSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateBackendSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/BackendSet/UpdateBackendSet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBackendSetResponse>
                transformer =
                        UpdateBackendSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBackendSetRequest, UpdateBackendSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBackendSetRequest, UpdateBackendSetResponse>,
                        java.util.concurrent.Future<UpdateBackendSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBackendSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBackendSetRequest, UpdateBackendSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                    handler) {
        LOG.trace("Called async updateHealthChecker");
        final UpdateHealthCheckerRequest interceptedRequest =
                UpdateHealthCheckerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHealthCheckerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateHealthChecker",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/HealthChecker/UpdateHealthChecker");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateHealthCheckerResponse>
                transformer =
                        UpdateHealthCheckerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>,
                        java.util.concurrent.Future<UpdateHealthCheckerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHealthCheckerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateListenerRequest, UpdateListenerResponse>
                    handler) {
        LOG.trace("Called async updateListener");
        final UpdateListenerRequest interceptedRequest =
                UpdateListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/Listener/UpdateListener");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateListenerResponse>
                transformer =
                        UpdateListenerConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateListenerRequest, UpdateListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListenerRequest, UpdateListenerResponse>,
                        java.util.concurrent.Future<UpdateListenerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListenerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListenerRequest, UpdateListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkLoadBalancerResponse> updateNetworkLoadBalancer(
            UpdateNetworkLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkLoadBalancerRequest, UpdateNetworkLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async updateNetworkLoadBalancer");
        final UpdateNetworkLoadBalancerRequest interceptedRequest =
                UpdateNetworkLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateNetworkLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkLoadBalancer");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNetworkLoadBalancerResponse>
                transformer =
                        UpdateNetworkLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkLoadBalancerRequest, UpdateNetworkLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkLoadBalancerRequest,
                                UpdateNetworkLoadBalancerResponse>,
                        java.util.concurrent.Future<UpdateNetworkLoadBalancerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkLoadBalancerRequest, UpdateNetworkLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSecurityGroupsResponse>
            updateNetworkSecurityGroups(
                    UpdateNetworkSecurityGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkSecurityGroupsRequest,
                                    UpdateNetworkSecurityGroupsResponse>
                            handler) {
        LOG.trace("Called async updateNetworkSecurityGroups");
        final UpdateNetworkSecurityGroupsRequest interceptedRequest =
                UpdateNetworkSecurityGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkSecurityGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkLoadBalancer",
                        "UpdateNetworkSecurityGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/networkloadbalancer/20200501/NetworkLoadBalancer/UpdateNetworkSecurityGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSecurityGroupsResponse>
                transformer =
                        UpdateNetworkSecurityGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkSecurityGroupsRequest, UpdateNetworkSecurityGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkSecurityGroupsRequest,
                                UpdateNetworkSecurityGroupsResponse>,
                        java.util.concurrent.Future<UpdateNetworkSecurityGroupsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkSecurityGroupsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkSecurityGroupsRequest, UpdateNetworkSecurityGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
