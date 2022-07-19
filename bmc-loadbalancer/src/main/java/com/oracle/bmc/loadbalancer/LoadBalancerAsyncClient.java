/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.internal.http.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

/**
 * Async client implementation for LoadBalancer service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class LoadBalancerAsyncClient implements LoadBalancerAsync {
    /**
     * Service instance for LoadBalancer.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOADBALANCER")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LoadBalancerAsyncClient.class);

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
    public LoadBalancerAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
    public LoadBalancerAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LoadBalancerAsyncClient> {
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
        public LoadBalancerAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new LoadBalancerAsyncClient(
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
    public java.util.concurrent.Future<ChangeLoadBalancerCompartmentResponse>
            changeLoadBalancerCompartment(
                    ChangeLoadBalancerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLoadBalancerCompartmentRequest,
                                    ChangeLoadBalancerCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLoadBalancerCompartment");
        final ChangeLoadBalancerCompartmentRequest interceptedRequest =
                ChangeLoadBalancerCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLoadBalancerCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ChangeLoadBalancerCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/ChangeLoadBalancerCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLoadBalancerCompartmentResponse>
                transformer =
                        ChangeLoadBalancerCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLoadBalancerCompartmentRequest, ChangeLoadBalancerCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLoadBalancerCompartmentRequest,
                                ChangeLoadBalancerCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLoadBalancerCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeLoadBalancerCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLoadBalancerCompartmentRequest, ChangeLoadBalancerCompartmentResponse>(
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
                        "LoadBalancer", "CreateBackend", ib.getRequestUri().toString(), "");
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
                        "LoadBalancer", "CreateBackendSet", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        LOG.trace("Called async createCertificate");
        final CreateCertificateRequest interceptedRequest =
                CreateCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateCertificate", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer =
                        CreateCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCertificateRequest, CreateCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCertificateRequest, CreateCertificateResponse>,
                        java.util.concurrent.Future<CreateCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCertificateRequest, CreateCertificateResponse>(
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
    public java.util.concurrent.Future<CreateHostnameResponse> createHostname(
            CreateHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostnameRequest, CreateHostnameResponse>
                    handler) {
        LOG.trace("Called async createHostname");
        final CreateHostnameRequest interceptedRequest =
                CreateHostnameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostnameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateHostname", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateHostnameResponse>
                transformer =
                        CreateHostnameConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateHostnameRequest, CreateHostnameResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateHostnameRequest, CreateHostnameResponse>,
                        java.util.concurrent.Future<CreateHostnameResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateHostnameDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateHostnameRequest, CreateHostnameResponse>(
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
                        "LoadBalancer", "CreateListener", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async createLoadBalancer");
        final CreateLoadBalancerRequest interceptedRequest =
                CreateLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateLoadBalancer", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateLoadBalancerResponse>
                transformer =
                        CreateLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLoadBalancerRequest, CreateLoadBalancerResponse>,
                        java.util.concurrent.Future<CreateLoadBalancerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLoadBalancerRequest, CreateLoadBalancerResponse>(
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
    public java.util.concurrent.Future<CreatePathRouteSetResponse> createPathRouteSet(
            CreatePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePathRouteSetRequest, CreatePathRouteSetResponse>
                    handler) {
        LOG.trace("Called async createPathRouteSet");
        final CreatePathRouteSetRequest interceptedRequest =
                CreatePathRouteSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePathRouteSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreatePathRouteSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePathRouteSetResponse>
                transformer =
                        CreatePathRouteSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePathRouteSetRequest, CreatePathRouteSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePathRouteSetRequest, CreatePathRouteSetResponse>,
                        java.util.concurrent.Future<CreatePathRouteSetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePathRouteSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePathRouteSetRequest, CreatePathRouteSetResponse>(
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
    public java.util.concurrent.Future<CreateRoutingPolicyResponse> createRoutingPolicy(
            CreateRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>
                    handler) {
        LOG.trace("Called async createRoutingPolicy");
        final CreateRoutingPolicyRequest interceptedRequest =
                CreateRoutingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRoutingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateRoutingPolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRoutingPolicyResponse>
                transformer =
                        CreateRoutingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>,
                        java.util.concurrent.Future<CreateRoutingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRoutingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>(
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
    public java.util.concurrent.Future<CreateRuleSetResponse> createRuleSet(
            CreateRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResponse>
                    handler) {
        LOG.trace("Called async createRuleSet");
        final CreateRuleSetRequest interceptedRequest =
                CreateRuleSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRuleSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateRuleSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRuleSetResponse>
                transformer =
                        CreateRuleSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRuleSetRequest, CreateRuleSetResponse>,
                        java.util.concurrent.Future<CreateRuleSetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRuleSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRuleSetRequest, CreateRuleSetResponse>(
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
    public java.util.concurrent.Future<CreateSSLCipherSuiteResponse> createSSLCipherSuite(
            CreateSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>
                    handler) {
        LOG.trace("Called async createSSLCipherSuite");
        final CreateSSLCipherSuiteRequest interceptedRequest =
                CreateSSLCipherSuiteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSSLCipherSuiteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "CreateSSLCipherSuite", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSSLCipherSuiteResponse>
                transformer =
                        CreateSSLCipherSuiteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>,
                        java.util.concurrent.Future<CreateSSLCipherSuiteResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSSLCipherSuiteDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>(
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
                        "LoadBalancer", "DeleteBackend", ib.getRequestUri().toString(), "");
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
                        "LoadBalancer", "DeleteBackendSet", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler) {
        LOG.trace("Called async deleteCertificate");
        final DeleteCertificateRequest interceptedRequest =
                DeleteCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteCertificate", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer =
                        DeleteCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCertificateRequest, DeleteCertificateResponse>,
                        java.util.concurrent.Future<DeleteCertificateResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCertificateRequest, DeleteCertificateResponse>(
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
    public java.util.concurrent.Future<DeleteHostnameResponse> deleteHostname(
            DeleteHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostnameRequest, DeleteHostnameResponse>
                    handler) {
        LOG.trace("Called async deleteHostname");
        final DeleteHostnameRequest interceptedRequest =
                DeleteHostnameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostnameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteHostname", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteHostnameResponse>
                transformer =
                        DeleteHostnameConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteHostnameRequest, DeleteHostnameResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostnameRequest, DeleteHostnameResponse>,
                        java.util.concurrent.Future<DeleteHostnameResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostnameRequest, DeleteHostnameResponse>(
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
                        "LoadBalancer", "DeleteListener", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async deleteLoadBalancer");
        final DeleteLoadBalancerRequest interceptedRequest =
                DeleteLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteLoadBalancer", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteLoadBalancerResponse>
                transformer =
                        DeleteLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>,
                        java.util.concurrent.Future<DeleteLoadBalancerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(
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
    public java.util.concurrent.Future<DeletePathRouteSetResponse> deletePathRouteSet(
            DeletePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePathRouteSetRequest, DeletePathRouteSetResponse>
                    handler) {
        LOG.trace("Called async deletePathRouteSet");
        final DeletePathRouteSetRequest interceptedRequest =
                DeletePathRouteSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePathRouteSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeletePathRouteSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePathRouteSetResponse>
                transformer =
                        DeletePathRouteSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePathRouteSetRequest, DeletePathRouteSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePathRouteSetRequest, DeletePathRouteSetResponse>,
                        java.util.concurrent.Future<DeletePathRouteSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePathRouteSetRequest, DeletePathRouteSetResponse>(
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
    public java.util.concurrent.Future<DeleteRoutingPolicyResponse> deleteRoutingPolicy(
            DeleteRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteRoutingPolicy");
        final DeleteRoutingPolicyRequest interceptedRequest =
                DeleteRoutingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRoutingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteRoutingPolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRoutingPolicyResponse>
                transformer =
                        DeleteRoutingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>,
                        java.util.concurrent.Future<DeleteRoutingPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>(
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
    public java.util.concurrent.Future<DeleteRuleSetResponse> deleteRuleSet(
            DeleteRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResponse>
                    handler) {
        LOG.trace("Called async deleteRuleSet");
        final DeleteRuleSetRequest interceptedRequest =
                DeleteRuleSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRuleSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteRuleSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRuleSetResponse>
                transformer =
                        DeleteRuleSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRuleSetRequest, DeleteRuleSetResponse>,
                        java.util.concurrent.Future<DeleteRuleSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRuleSetRequest, DeleteRuleSetResponse>(
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
    public java.util.concurrent.Future<DeleteSSLCipherSuiteResponse> deleteSSLCipherSuite(
            DeleteSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>
                    handler) {
        LOG.trace("Called async deleteSSLCipherSuite");
        final DeleteSSLCipherSuiteRequest interceptedRequest =
                DeleteSSLCipherSuiteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSSLCipherSuiteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "DeleteSSLCipherSuite", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSSLCipherSuiteResponse>
                transformer =
                        DeleteSSLCipherSuiteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>,
                        java.util.concurrent.Future<DeleteSSLCipherSuiteResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>(
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
                        "LoadBalancer",
                        "GetBackend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Backend/GetBackend");
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
                        "LoadBalancer",
                        "GetBackendHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendHealth/GetBackendHealth");
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
                        "LoadBalancer",
                        "GetBackendSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSet/GetBackendSet");
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
                        "LoadBalancer",
                        "GetBackendSetHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSetHealth/GetBackendSetHealth");
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetHealthChecker",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/HealthChecker/GetHealthChecker");
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
    public java.util.concurrent.Future<GetHostnameResponse> getHostname(
            GetHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetHostnameRequest, GetHostnameResponse>
                    handler) {
        LOG.trace("Called async getHostname");
        final GetHostnameRequest interceptedRequest =
                GetHostnameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostnameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetHostname",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Hostname/GetHostname");
        final java.util.function.Function<javax.ws.rs.core.Response, GetHostnameResponse>
                transformer =
                        GetHostnameConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetHostnameRequest, GetHostnameResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHostnameRequest, GetHostnameResponse>,
                        java.util.concurrent.Future<GetHostnameResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHostnameRequest, GetHostnameResponse>(
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
    public java.util.concurrent.Future<GetLoadBalancerResponse> getLoadBalancer(
            GetLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerRequest, GetLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async getLoadBalancer");
        final GetLoadBalancerRequest interceptedRequest =
                GetLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/GetLoadBalancer");
        final java.util.function.Function<javax.ws.rs.core.Response, GetLoadBalancerResponse>
                transformer =
                        GetLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLoadBalancerRequest, GetLoadBalancerResponse>,
                        java.util.concurrent.Future<GetLoadBalancerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLoadBalancerRequest, GetLoadBalancerResponse>(
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
    public java.util.concurrent.Future<GetLoadBalancerHealthResponse> getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>
                    handler) {
        LOG.trace("Called async getLoadBalancerHealth");
        final GetLoadBalancerHealthRequest interceptedRequest =
                GetLoadBalancerHealthConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLoadBalancerHealthConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetLoadBalancerHealth",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerHealth/GetLoadBalancerHealth");
        final java.util.function.Function<javax.ws.rs.core.Response, GetLoadBalancerHealthResponse>
                transformer =
                        GetLoadBalancerHealthConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>,
                        java.util.concurrent.Future<GetLoadBalancerHealthResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>(
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
    public java.util.concurrent.Future<GetPathRouteSetResponse> getPathRouteSet(
            GetPathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPathRouteSetRequest, GetPathRouteSetResponse>
                    handler) {
        LOG.trace("Called async getPathRouteSet");
        final GetPathRouteSetRequest interceptedRequest =
                GetPathRouteSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPathRouteSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetPathRouteSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/PathRouteSet/GetPathRouteSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPathRouteSetResponse>
                transformer =
                        GetPathRouteSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPathRouteSetRequest, GetPathRouteSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPathRouteSetRequest, GetPathRouteSetResponse>,
                        java.util.concurrent.Future<GetPathRouteSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPathRouteSetRequest, GetPathRouteSetResponse>(
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
    public java.util.concurrent.Future<GetRoutingPolicyResponse> getRoutingPolicy(
            GetRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoutingPolicyRequest, GetRoutingPolicyResponse>
                    handler) {
        LOG.trace("Called async getRoutingPolicy");
        final GetRoutingPolicyRequest interceptedRequest =
                GetRoutingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRoutingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetRoutingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RoutingPolicy/GetRoutingPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRoutingPolicyResponse>
                transformer =
                        GetRoutingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRoutingPolicyRequest, GetRoutingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRoutingPolicyRequest, GetRoutingPolicyResponse>,
                        java.util.concurrent.Future<GetRoutingPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRoutingPolicyRequest, GetRoutingPolicyResponse>(
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
    public java.util.concurrent.Future<GetRuleSetResponse> getRuleSet(
            GetRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRuleSetRequest, GetRuleSetResponse>
                    handler) {
        LOG.trace("Called async getRuleSet");
        final GetRuleSetRequest interceptedRequest = GetRuleSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRuleSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetRuleSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/GetRuleSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRuleSetResponse>
                transformer =
                        GetRuleSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRuleSetRequest, GetRuleSetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRuleSetRequest, GetRuleSetResponse>,
                        java.util.concurrent.Future<GetRuleSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRuleSetRequest, GetRuleSetResponse>(
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
    public java.util.concurrent.Future<GetSSLCipherSuiteResponse> getSSLCipherSuite(
            GetSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>
                    handler) {
        LOG.trace("Called async getSSLCipherSuite");
        final GetSSLCipherSuiteRequest interceptedRequest =
                GetSSLCipherSuiteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSSLCipherSuiteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "GetSSLCipherSuite",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/SSLCipherSuite/GetSSLCipherSuite");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSSLCipherSuiteResponse>
                transformer =
                        GetSSLCipherSuiteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>,
                        java.util.concurrent.Future<GetSSLCipherSuiteResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>(
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
                        "LoadBalancer",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/WorkRequest/GetWorkRequest");
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
                        "LoadBalancer",
                        "ListBackendSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSet/ListBackendSets");
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
                        "LoadBalancer",
                        "ListBackends",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Backend/ListBackends");
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
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {
        LOG.trace("Called async listCertificates");
        final ListCertificatesRequest interceptedRequest =
                ListCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Certificate/ListCertificates");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer =
                        ListCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCertificatesRequest, ListCertificatesResponse>,
                        java.util.concurrent.Future<ListCertificatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCertificatesRequest, ListCertificatesResponse>(
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
    public java.util.concurrent.Future<ListHostnamesResponse> listHostnames(
            ListHostnamesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListHostnamesRequest, ListHostnamesResponse>
                    handler) {
        LOG.trace("Called async listHostnames");
        final ListHostnamesRequest interceptedRequest =
                ListHostnamesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostnamesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListHostnames",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/Hostname/ListHostnames");
        final java.util.function.Function<javax.ws.rs.core.Response, ListHostnamesResponse>
                transformer =
                        ListHostnamesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListHostnamesRequest, ListHostnamesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostnamesRequest, ListHostnamesResponse>,
                        java.util.concurrent.Future<ListHostnamesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostnamesRequest, ListHostnamesResponse>(
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
    public java.util.concurrent.Future<ListListenerRulesResponse> listListenerRules(
            ListListenerRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListListenerRulesRequest, ListListenerRulesResponse>
                    handler) {
        LOG.trace("Called async listListenerRules");
        final ListListenerRulesRequest interceptedRequest =
                ListListenerRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListenerRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListListenerRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/ListenerRuleSummary/ListListenerRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListListenerRulesResponse>
                transformer =
                        ListListenerRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListListenerRulesRequest, ListListenerRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListenerRulesRequest, ListListenerRulesResponse>,
                        java.util.concurrent.Future<ListListenerRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListenerRulesRequest, ListListenerRulesResponse>(
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
    public java.util.concurrent.Future<ListLoadBalancerHealthsResponse> listLoadBalancerHealths(
            ListLoadBalancerHealthsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>
                    handler) {
        LOG.trace("Called async listLoadBalancerHealths");
        final ListLoadBalancerHealthsRequest interceptedRequest =
                ListLoadBalancerHealthsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLoadBalancerHealthsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListLoadBalancerHealths",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerHealthSummary/ListLoadBalancerHealths");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListLoadBalancerHealthsResponse>
                transformer =
                        ListLoadBalancerHealthsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>,
                        java.util.concurrent.Future<ListLoadBalancerHealthsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>(
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
    public java.util.concurrent.Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancersRequest, ListLoadBalancersResponse>
                    handler) {
        LOG.trace("Called async listLoadBalancers");
        final ListLoadBalancersRequest interceptedRequest =
                ListLoadBalancersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLoadBalancersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListLoadBalancers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/ListLoadBalancers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListLoadBalancersResponse>
                transformer =
                        ListLoadBalancersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListLoadBalancersRequest, ListLoadBalancersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLoadBalancersRequest, ListLoadBalancersResponse>,
                        java.util.concurrent.Future<ListLoadBalancersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLoadBalancersRequest, ListLoadBalancersResponse>(
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
    public java.util.concurrent.Future<ListPathRouteSetsResponse> listPathRouteSets(
            ListPathRouteSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPathRouteSetsRequest, ListPathRouteSetsResponse>
                    handler) {
        LOG.trace("Called async listPathRouteSets");
        final ListPathRouteSetsRequest interceptedRequest =
                ListPathRouteSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPathRouteSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListPathRouteSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/PathRouteSet/ListPathRouteSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPathRouteSetsResponse>
                transformer =
                        ListPathRouteSetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPathRouteSetsRequest, ListPathRouteSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPathRouteSetsRequest, ListPathRouteSetsResponse>,
                        java.util.concurrent.Future<ListPathRouteSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPathRouteSetsRequest, ListPathRouteSetsResponse>(
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
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerPolicy/ListPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer =
                        ListPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPoliciesRequest, ListPoliciesResponse>,
                        java.util.concurrent.Future<ListPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPoliciesRequest, ListPoliciesResponse>(
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
    public java.util.concurrent.Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                    handler) {
        LOG.trace("Called async listProtocols");
        final ListProtocolsRequest interceptedRequest =
                ListProtocolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProtocolsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListProtocols",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerProtocol/ListProtocols");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProtocolsResponse>
                transformer =
                        ListProtocolsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProtocolsRequest, ListProtocolsResponse>,
                        java.util.concurrent.Future<ListProtocolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProtocolsRequest, ListProtocolsResponse>(
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
    public java.util.concurrent.Future<ListRoutingPoliciesResponse> listRoutingPolicies(
            ListRoutingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>
                    handler) {
        LOG.trace("Called async listRoutingPolicies");
        final ListRoutingPoliciesRequest interceptedRequest =
                ListRoutingPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRoutingPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListRoutingPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RoutingPolicy/ListRoutingPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRoutingPoliciesResponse>
                transformer =
                        ListRoutingPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>,
                        java.util.concurrent.Future<ListRoutingPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>(
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
    public java.util.concurrent.Future<ListRuleSetsResponse> listRuleSets(
            ListRuleSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResponse>
                    handler) {
        LOG.trace("Called async listRuleSets");
        final ListRuleSetsRequest interceptedRequest =
                ListRuleSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRuleSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListRuleSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/RuleSet/ListRuleSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRuleSetsResponse>
                transformer =
                        ListRuleSetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRuleSetsRequest, ListRuleSetsResponse>,
                        java.util.concurrent.Future<ListRuleSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRuleSetsRequest, ListRuleSetsResponse>(
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
    public java.util.concurrent.Future<ListSSLCipherSuitesResponse> listSSLCipherSuites(
            ListSSLCipherSuitesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>
                    handler) {
        LOG.trace("Called async listSSLCipherSuites");
        final ListSSLCipherSuitesRequest interceptedRequest =
                ListSSLCipherSuitesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSSLCipherSuitesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListSSLCipherSuites",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/SSLCipherSuite/ListSSLCipherSuites");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSSLCipherSuitesResponse>
                transformer =
                        ListSSLCipherSuitesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>,
                        java.util.concurrent.Future<ListSSLCipherSuitesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>(
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
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse>
                    handler) {
        LOG.trace("Called async listShapes");
        final ListShapesRequest interceptedRequest = ListShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "ListShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancerShape/ListShapes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListShapesResponse>
                transformer =
                        ListShapesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListShapesRequest, ListShapesResponse>,
                        java.util.concurrent.Future<ListShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListShapesRequest, ListShapesResponse>(
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
                        "LoadBalancer",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/WorkRequest/ListWorkRequests");
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
                        "LoadBalancer", "UpdateBackend", ib.getRequestUri().toString(), "");
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
                        "LoadBalancer", "UpdateBackendSet", ib.getRequestUri().toString(), "");
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
                        "LoadBalancer", "UpdateHealthChecker", ib.getRequestUri().toString(), "");
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
                                interceptedRequest.getHealthChecker(),
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
    public java.util.concurrent.Future<UpdateHostnameResponse> updateHostname(
            UpdateHostnameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostnameRequest, UpdateHostnameResponse>
                    handler) {
        LOG.trace("Called async updateHostname");
        final UpdateHostnameRequest interceptedRequest =
                UpdateHostnameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHostnameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdateHostname", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateHostnameResponse>
                transformer =
                        UpdateHostnameConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateHostnameRequest, UpdateHostnameResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHostnameRequest, UpdateHostnameResponse>,
                        java.util.concurrent.Future<UpdateHostnameResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHostnameDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHostnameRequest, UpdateHostnameResponse>(
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
                        "LoadBalancer", "UpdateListener", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async updateLoadBalancer");
        final UpdateLoadBalancerRequest interceptedRequest =
                UpdateLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdateLoadBalancer", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateLoadBalancerResponse>
                transformer =
                        UpdateLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>,
                        java.util.concurrent.Future<UpdateLoadBalancerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(
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
    public java.util.concurrent.Future<UpdateLoadBalancerShapeResponse> updateLoadBalancerShape(
            UpdateLoadBalancerShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>
                    handler) {
        LOG.trace("Called async updateLoadBalancerShape");
        final UpdateLoadBalancerShapeRequest interceptedRequest =
                UpdateLoadBalancerShapeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLoadBalancerShapeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer",
                        "UpdateLoadBalancerShape",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/LoadBalancer/UpdateLoadBalancerShape");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateLoadBalancerShapeResponse>
                transformer =
                        UpdateLoadBalancerShapeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>,
                        java.util.concurrent.Future<UpdateLoadBalancerShapeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLoadBalancerShapeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>(
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
                        "LoadBalancer",
                        "UpdateNetworkSecurityGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/loadbalancer/20170115/NetworkSecurityGroups/UpdateNetworkSecurityGroups");
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

    @Override
    public java.util.concurrent.Future<UpdatePathRouteSetResponse> updatePathRouteSet(
            UpdatePathRouteSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>
                    handler) {
        LOG.trace("Called async updatePathRouteSet");
        final UpdatePathRouteSetRequest interceptedRequest =
                UpdatePathRouteSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePathRouteSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdatePathRouteSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePathRouteSetResponse>
                transformer =
                        UpdatePathRouteSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>,
                        java.util.concurrent.Future<UpdatePathRouteSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePathRouteSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>(
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
    public java.util.concurrent.Future<UpdateRoutingPolicyResponse> updateRoutingPolicy(
            UpdateRoutingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>
                    handler) {
        LOG.trace("Called async updateRoutingPolicy");
        final UpdateRoutingPolicyRequest interceptedRequest =
                UpdateRoutingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRoutingPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdateRoutingPolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRoutingPolicyResponse>
                transformer =
                        UpdateRoutingPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>,
                        java.util.concurrent.Future<UpdateRoutingPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRoutingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>(
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
    public java.util.concurrent.Future<UpdateRuleSetResponse> updateRuleSet(
            UpdateRuleSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResponse>
                    handler) {
        LOG.trace("Called async updateRuleSet");
        final UpdateRuleSetRequest interceptedRequest =
                UpdateRuleSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRuleSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdateRuleSet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRuleSetResponse>
                transformer =
                        UpdateRuleSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRuleSetRequest, UpdateRuleSetResponse>,
                        java.util.concurrent.Future<UpdateRuleSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRuleSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRuleSetRequest, UpdateRuleSetResponse>(
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
    public java.util.concurrent.Future<UpdateSSLCipherSuiteResponse> updateSSLCipherSuite(
            UpdateSSLCipherSuiteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>
                    handler) {
        LOG.trace("Called async updateSSLCipherSuite");
        final UpdateSSLCipherSuiteRequest interceptedRequest =
                UpdateSSLCipherSuiteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSSLCipherSuiteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "LoadBalancer", "UpdateSSLCipherSuite", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSSLCipherSuiteResponse>
                transformer =
                        UpdateSSLCipherSuiteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>,
                        java.util.concurrent.Future<UpdateSSLCipherSuiteResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSSLCipherSuiteDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>(
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
