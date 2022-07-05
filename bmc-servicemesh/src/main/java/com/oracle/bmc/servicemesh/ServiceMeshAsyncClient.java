/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh;

import com.oracle.bmc.servicemesh.internal.http.*;
import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for ServiceMesh service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class ServiceMeshAsyncClient implements ServiceMeshAsync {
    /**
     * Service instance for ServiceMesh.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SERVICEMESH")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://servicemesh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ServiceMeshAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ServiceMeshAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
    public ServiceMeshAsyncClient(
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
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
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
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        configuration,
                        isNonBufferingApacheClient);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ServiceMeshAsyncClient> {
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
        public ServiceMeshAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ServiceMeshAsyncClient(
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
    public java.util.concurrent.Future<ChangeAccessPolicyCompartmentResponse>
            changeAccessPolicyCompartment(
                    ChangeAccessPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAccessPolicyCompartmentRequest,
                                    ChangeAccessPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAccessPolicyCompartment");
        final ChangeAccessPolicyCompartmentRequest interceptedRequest =
                ChangeAccessPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAccessPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeAccessPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/ChangeAccessPolicyCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAccessPolicyCompartmentResponse>
                transformer =
                        ChangeAccessPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAccessPolicyCompartmentRequest, ChangeAccessPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAccessPolicyCompartmentRequest,
                                ChangeAccessPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAccessPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAccessPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAccessPolicyCompartmentRequest, ChangeAccessPolicyCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeIngressGatewayCompartmentResponse>
            changeIngressGatewayCompartment(
                    ChangeIngressGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayCompartmentRequest,
                                    ChangeIngressGatewayCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeIngressGatewayCompartment");
        final ChangeIngressGatewayCompartmentRequest interceptedRequest =
                ChangeIngressGatewayCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIngressGatewayCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeIngressGatewayCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/ChangeIngressGatewayCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeIngressGatewayCompartmentResponse>
                transformer =
                        ChangeIngressGatewayCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIngressGatewayCompartmentRequest,
                        ChangeIngressGatewayCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIngressGatewayCompartmentRequest,
                                ChangeIngressGatewayCompartmentResponse>,
                        java.util.concurrent.Future<ChangeIngressGatewayCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeIngressGatewayCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIngressGatewayCompartmentRequest,
                    ChangeIngressGatewayCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeIngressGatewayRouteTableCompartmentResponse>
            changeIngressGatewayRouteTableCompartment(
                    ChangeIngressGatewayRouteTableCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngressGatewayRouteTableCompartmentRequest,
                                    ChangeIngressGatewayRouteTableCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeIngressGatewayRouteTableCompartment");
        final ChangeIngressGatewayRouteTableCompartmentRequest interceptedRequest =
                ChangeIngressGatewayRouteTableCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIngressGatewayRouteTableCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeIngressGatewayRouteTableCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/ChangeIngressGatewayRouteTableCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeIngressGatewayRouteTableCompartmentResponse>
                transformer =
                        ChangeIngressGatewayRouteTableCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIngressGatewayRouteTableCompartmentRequest,
                        ChangeIngressGatewayRouteTableCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIngressGatewayRouteTableCompartmentRequest,
                                ChangeIngressGatewayRouteTableCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeIngressGatewayRouteTableCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeIngressGatewayRouteTableCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIngressGatewayRouteTableCompartmentRequest,
                    ChangeIngressGatewayRouteTableCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeMeshCompartmentResponse> changeMeshCompartment(
            ChangeMeshCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeMeshCompartment");
        final ChangeMeshCompartmentRequest interceptedRequest =
                ChangeMeshCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMeshCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeMeshCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/ChangeMeshCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeMeshCompartmentResponse>
                transformer =
                        ChangeMeshCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMeshCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMeshCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMeshCompartmentRequest, ChangeMeshCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeVirtualDeploymentCompartmentResponse>
            changeVirtualDeploymentCompartment(
                    ChangeVirtualDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualDeploymentCompartmentRequest,
                                    ChangeVirtualDeploymentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVirtualDeploymentCompartment");
        final ChangeVirtualDeploymentCompartmentRequest interceptedRequest =
                ChangeVirtualDeploymentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVirtualDeploymentCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeVirtualDeploymentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/ChangeVirtualDeploymentCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVirtualDeploymentCompartmentResponse>
                transformer =
                        ChangeVirtualDeploymentCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVirtualDeploymentCompartmentRequest,
                        ChangeVirtualDeploymentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVirtualDeploymentCompartmentRequest,
                                ChangeVirtualDeploymentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVirtualDeploymentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVirtualDeploymentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVirtualDeploymentCompartmentRequest,
                    ChangeVirtualDeploymentCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeVirtualServiceCompartmentResponse>
            changeVirtualServiceCompartment(
                    ChangeVirtualServiceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceCompartmentRequest,
                                    ChangeVirtualServiceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVirtualServiceCompartment");
        final ChangeVirtualServiceCompartmentRequest interceptedRequest =
                ChangeVirtualServiceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVirtualServiceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeVirtualServiceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/ChangeVirtualServiceCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeVirtualServiceCompartmentResponse>
                transformer =
                        ChangeVirtualServiceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVirtualServiceCompartmentRequest,
                        ChangeVirtualServiceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVirtualServiceCompartmentRequest,
                                ChangeVirtualServiceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVirtualServiceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVirtualServiceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVirtualServiceCompartmentRequest,
                    ChangeVirtualServiceCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeVirtualServiceRouteTableCompartmentResponse>
            changeVirtualServiceRouteTableCompartment(
                    ChangeVirtualServiceRouteTableCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualServiceRouteTableCompartmentRequest,
                                    ChangeVirtualServiceRouteTableCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVirtualServiceRouteTableCompartment");
        final ChangeVirtualServiceRouteTableCompartmentRequest interceptedRequest =
                ChangeVirtualServiceRouteTableCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVirtualServiceRouteTableCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ChangeVirtualServiceRouteTableCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/ChangeVirtualServiceRouteTableCompartment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeVirtualServiceRouteTableCompartmentResponse>
                transformer =
                        ChangeVirtualServiceRouteTableCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVirtualServiceRouteTableCompartmentRequest,
                        ChangeVirtualServiceRouteTableCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVirtualServiceRouteTableCompartmentRequest,
                                ChangeVirtualServiceRouteTableCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeVirtualServiceRouteTableCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeVirtualServiceRouteTableCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVirtualServiceRouteTableCompartmentRequest,
                    ChangeVirtualServiceRouteTableCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateAccessPolicyResponse> createAccessPolicy(
            CreateAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAccessPolicyRequest, CreateAccessPolicyResponse>
                    handler) {
        LOG.trace("Called async createAccessPolicy");
        final CreateAccessPolicyRequest interceptedRequest =
                CreateAccessPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAccessPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateAccessPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/CreateAccessPolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAccessPolicyResponse>
                transformer =
                        CreateAccessPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAccessPolicyRequest, CreateAccessPolicyResponse>,
                        java.util.concurrent.Future<CreateAccessPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAccessPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAccessPolicyRequest, CreateAccessPolicyResponse>(
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
    public java.util.concurrent.Future<CreateIngressGatewayResponse> createIngressGateway(
            CreateIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIngressGatewayRequest, CreateIngressGatewayResponse>
                    handler) {
        LOG.trace("Called async createIngressGateway");
        final CreateIngressGatewayRequest interceptedRequest =
                CreateIngressGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIngressGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateIngressGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/CreateIngressGateway");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIngressGatewayResponse>
                transformer =
                        CreateIngressGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIngressGatewayRequest, CreateIngressGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIngressGatewayRequest, CreateIngressGatewayResponse>,
                        java.util.concurrent.Future<CreateIngressGatewayResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIngressGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIngressGatewayRequest, CreateIngressGatewayResponse>(
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
    public java.util.concurrent.Future<CreateIngressGatewayRouteTableResponse>
            createIngressGatewayRouteTable(
                    CreateIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateIngressGatewayRouteTableRequest,
                                    CreateIngressGatewayRouteTableResponse>
                            handler) {
        LOG.trace("Called async createIngressGatewayRouteTable");
        final CreateIngressGatewayRouteTableRequest interceptedRequest =
                CreateIngressGatewayRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIngressGatewayRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateIngressGatewayRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/CreateIngressGatewayRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIngressGatewayRouteTableResponse>
                transformer =
                        CreateIngressGatewayRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIngressGatewayRouteTableRequest,
                        CreateIngressGatewayRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIngressGatewayRouteTableRequest,
                                CreateIngressGatewayRouteTableResponse>,
                        java.util.concurrent.Future<CreateIngressGatewayRouteTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIngressGatewayRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIngressGatewayRouteTableRequest, CreateIngressGatewayRouteTableResponse>(
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
    public java.util.concurrent.Future<CreateMeshResponse> createMesh(
            CreateMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMeshRequest, CreateMeshResponse>
                    handler) {
        LOG.trace("Called async createMesh");
        final CreateMeshRequest interceptedRequest = CreateMeshConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMeshConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateMesh",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/CreateMesh");
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateMeshResponse>
                transformer =
                        CreateMeshConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMeshRequest, CreateMeshResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMeshRequest, CreateMeshResponse>,
                        java.util.concurrent.Future<CreateMeshResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMeshDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMeshRequest, CreateMeshResponse>(
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
    public java.util.concurrent.Future<CreateVirtualDeploymentResponse> createVirtualDeployment(
            CreateVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>
                    handler) {
        LOG.trace("Called async createVirtualDeployment");
        final CreateVirtualDeploymentRequest interceptedRequest =
                CreateVirtualDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVirtualDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateVirtualDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/CreateVirtualDeployment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVirtualDeploymentResponse>
                transformer =
                        CreateVirtualDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>,
                        java.util.concurrent.Future<CreateVirtualDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVirtualDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVirtualDeploymentRequest, CreateVirtualDeploymentResponse>(
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
    public java.util.concurrent.Future<CreateVirtualServiceResponse> createVirtualService(
            CreateVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualServiceRequest, CreateVirtualServiceResponse>
                    handler) {
        LOG.trace("Called async createVirtualService");
        final CreateVirtualServiceRequest interceptedRequest =
                CreateVirtualServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVirtualServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateVirtualService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/CreateVirtualService");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVirtualServiceResponse>
                transformer =
                        CreateVirtualServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVirtualServiceRequest, CreateVirtualServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVirtualServiceRequest, CreateVirtualServiceResponse>,
                        java.util.concurrent.Future<CreateVirtualServiceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVirtualServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVirtualServiceRequest, CreateVirtualServiceResponse>(
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
    public java.util.concurrent.Future<CreateVirtualServiceRouteTableResponse>
            createVirtualServiceRouteTable(
                    CreateVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVirtualServiceRouteTableRequest,
                                    CreateVirtualServiceRouteTableResponse>
                            handler) {
        LOG.trace("Called async createVirtualServiceRouteTable");
        final CreateVirtualServiceRouteTableRequest interceptedRequest =
                CreateVirtualServiceRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVirtualServiceRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "CreateVirtualServiceRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/CreateVirtualServiceRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateVirtualServiceRouteTableResponse>
                transformer =
                        CreateVirtualServiceRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVirtualServiceRouteTableRequest,
                        CreateVirtualServiceRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVirtualServiceRouteTableRequest,
                                CreateVirtualServiceRouteTableResponse>,
                        java.util.concurrent.Future<CreateVirtualServiceRouteTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVirtualServiceRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVirtualServiceRouteTableRequest, CreateVirtualServiceRouteTableResponse>(
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
    public java.util.concurrent.Future<DeleteAccessPolicyResponse> deleteAccessPolicy(
            DeleteAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteAccessPolicy");
        final DeleteAccessPolicyRequest interceptedRequest =
                DeleteAccessPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAccessPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteAccessPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/DeleteAccessPolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAccessPolicyResponse>
                transformer =
                        DeleteAccessPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>,
                        java.util.concurrent.Future<DeleteAccessPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAccessPolicyRequest, DeleteAccessPolicyResponse>(
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
    public java.util.concurrent.Future<DeleteIngressGatewayResponse> deleteIngressGateway(
            DeleteIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>
                    handler) {
        LOG.trace("Called async deleteIngressGateway");
        final DeleteIngressGatewayRequest interceptedRequest =
                DeleteIngressGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIngressGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteIngressGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/DeleteIngressGateway");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIngressGatewayResponse>
                transformer =
                        DeleteIngressGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>,
                        java.util.concurrent.Future<DeleteIngressGatewayResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIngressGatewayRequest, DeleteIngressGatewayResponse>(
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
    public java.util.concurrent.Future<DeleteIngressGatewayRouteTableResponse>
            deleteIngressGatewayRouteTable(
                    DeleteIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteIngressGatewayRouteTableRequest,
                                    DeleteIngressGatewayRouteTableResponse>
                            handler) {
        LOG.trace("Called async deleteIngressGatewayRouteTable");
        final DeleteIngressGatewayRouteTableRequest interceptedRequest =
                DeleteIngressGatewayRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIngressGatewayRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteIngressGatewayRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/DeleteIngressGatewayRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIngressGatewayRouteTableResponse>
                transformer =
                        DeleteIngressGatewayRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIngressGatewayRouteTableRequest,
                        DeleteIngressGatewayRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIngressGatewayRouteTableRequest,
                                DeleteIngressGatewayRouteTableResponse>,
                        java.util.concurrent.Future<DeleteIngressGatewayRouteTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIngressGatewayRouteTableRequest, DeleteIngressGatewayRouteTableResponse>(
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
    public java.util.concurrent.Future<DeleteMeshResponse> deleteMesh(
            DeleteMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteMeshRequest, DeleteMeshResponse>
                    handler) {
        LOG.trace("Called async deleteMesh");
        final DeleteMeshRequest interceptedRequest = DeleteMeshConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMeshConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteMesh",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/DeleteMesh");
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteMeshResponse>
                transformer =
                        DeleteMeshConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMeshRequest, DeleteMeshResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMeshRequest, DeleteMeshResponse>,
                        java.util.concurrent.Future<DeleteMeshResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMeshRequest, DeleteMeshResponse>(
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
    public java.util.concurrent.Future<DeleteVirtualDeploymentResponse> deleteVirtualDeployment(
            DeleteVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>
                    handler) {
        LOG.trace("Called async deleteVirtualDeployment");
        final DeleteVirtualDeploymentRequest interceptedRequest =
                DeleteVirtualDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVirtualDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteVirtualDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/DeleteVirtualDeployment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVirtualDeploymentResponse>
                transformer =
                        DeleteVirtualDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>,
                        java.util.concurrent.Future<DeleteVirtualDeploymentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVirtualDeploymentRequest, DeleteVirtualDeploymentResponse>(
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
    public java.util.concurrent.Future<DeleteVirtualServiceResponse> deleteVirtualService(
            DeleteVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>
                    handler) {
        LOG.trace("Called async deleteVirtualService");
        final DeleteVirtualServiceRequest interceptedRequest =
                DeleteVirtualServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVirtualServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteVirtualService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/DeleteVirtualService");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVirtualServiceResponse>
                transformer =
                        DeleteVirtualServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>,
                        java.util.concurrent.Future<DeleteVirtualServiceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVirtualServiceRequest, DeleteVirtualServiceResponse>(
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
    public java.util.concurrent.Future<DeleteVirtualServiceRouteTableResponse>
            deleteVirtualServiceRouteTable(
                    DeleteVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVirtualServiceRouteTableRequest,
                                    DeleteVirtualServiceRouteTableResponse>
                            handler) {
        LOG.trace("Called async deleteVirtualServiceRouteTable");
        final DeleteVirtualServiceRouteTableRequest interceptedRequest =
                DeleteVirtualServiceRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVirtualServiceRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "DeleteVirtualServiceRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/DeleteVirtualServiceRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteVirtualServiceRouteTableResponse>
                transformer =
                        DeleteVirtualServiceRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVirtualServiceRouteTableRequest,
                        DeleteVirtualServiceRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVirtualServiceRouteTableRequest,
                                DeleteVirtualServiceRouteTableResponse>,
                        java.util.concurrent.Future<DeleteVirtualServiceRouteTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVirtualServiceRouteTableRequest, DeleteVirtualServiceRouteTableResponse>(
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
    public java.util.concurrent.Future<GetAccessPolicyResponse> getAccessPolicy(
            GetAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccessPolicyRequest, GetAccessPolicyResponse>
                    handler) {
        LOG.trace("Called async getAccessPolicy");
        final GetAccessPolicyRequest interceptedRequest =
                GetAccessPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAccessPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetAccessPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/GetAccessPolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAccessPolicyResponse>
                transformer =
                        GetAccessPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAccessPolicyRequest, GetAccessPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAccessPolicyRequest, GetAccessPolicyResponse>,
                        java.util.concurrent.Future<GetAccessPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAccessPolicyRequest, GetAccessPolicyResponse>(
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
    public java.util.concurrent.Future<GetIngressGatewayResponse> getIngressGateway(
            GetIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIngressGatewayRequest, GetIngressGatewayResponse>
                    handler) {
        LOG.trace("Called async getIngressGateway");
        final GetIngressGatewayRequest interceptedRequest =
                GetIngressGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIngressGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetIngressGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/GetIngressGateway");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetIngressGatewayResponse>
                transformer =
                        GetIngressGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIngressGatewayRequest, GetIngressGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIngressGatewayRequest, GetIngressGatewayResponse>,
                        java.util.concurrent.Future<GetIngressGatewayResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIngressGatewayRequest, GetIngressGatewayResponse>(
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
    public java.util.concurrent.Future<GetIngressGatewayRouteTableResponse>
            getIngressGatewayRouteTable(
                    GetIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIngressGatewayRouteTableRequest,
                                    GetIngressGatewayRouteTableResponse>
                            handler) {
        LOG.trace("Called async getIngressGatewayRouteTable");
        final GetIngressGatewayRouteTableRequest interceptedRequest =
                GetIngressGatewayRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIngressGatewayRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetIngressGatewayRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/GetIngressGatewayRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetIngressGatewayRouteTableResponse>
                transformer =
                        GetIngressGatewayRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIngressGatewayRouteTableRequest,
                                GetIngressGatewayRouteTableResponse>,
                        java.util.concurrent.Future<GetIngressGatewayRouteTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>(
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
    public java.util.concurrent.Future<GetMeshResponse> getMesh(
            GetMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMeshRequest, GetMeshResponse> handler) {
        LOG.trace("Called async getMesh");
        final GetMeshRequest interceptedRequest = GetMeshConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMeshConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetMesh",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/GetMesh");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMeshResponse>
                transformer = GetMeshConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMeshRequest, GetMeshResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetMeshRequest, GetMeshResponse>,
                        java.util.concurrent.Future<GetMeshResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMeshRequest, GetMeshResponse>(
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
    public java.util.concurrent.Future<GetProxyDetailsResponse> getProxyDetails(
            GetProxyDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProxyDetailsRequest, GetProxyDetailsResponse>
                    handler) {
        LOG.trace("Called async getProxyDetails");
        final GetProxyDetailsRequest interceptedRequest =
                GetProxyDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProxyDetailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetProxyDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/ProxyDetails/GetProxyDetails");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetProxyDetailsResponse>
                transformer =
                        GetProxyDetailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProxyDetailsRequest, GetProxyDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProxyDetailsRequest, GetProxyDetailsResponse>,
                        java.util.concurrent.Future<GetProxyDetailsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProxyDetailsRequest, GetProxyDetailsResponse>(
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
    public java.util.concurrent.Future<GetVirtualDeploymentResponse> getVirtualDeployment(
            GetVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
                    handler) {
        LOG.trace("Called async getVirtualDeployment");
        final GetVirtualDeploymentRequest interceptedRequest =
                GetVirtualDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVirtualDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetVirtualDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/GetVirtualDeployment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVirtualDeploymentResponse>
                transformer =
                        GetVirtualDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>,
                        java.util.concurrent.Future<GetVirtualDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>(
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
    public java.util.concurrent.Future<GetVirtualServiceResponse> getVirtualService(
            GetVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualServiceRequest, GetVirtualServiceResponse>
                    handler) {
        LOG.trace("Called async getVirtualService");
        final GetVirtualServiceRequest interceptedRequest =
                GetVirtualServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVirtualServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetVirtualService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/GetVirtualService");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetVirtualServiceResponse>
                transformer =
                        GetVirtualServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVirtualServiceRequest, GetVirtualServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVirtualServiceRequest, GetVirtualServiceResponse>,
                        java.util.concurrent.Future<GetVirtualServiceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVirtualServiceRequest, GetVirtualServiceResponse>(
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
    public java.util.concurrent.Future<GetVirtualServiceRouteTableResponse>
            getVirtualServiceRouteTable(
                    GetVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVirtualServiceRouteTableRequest,
                                    GetVirtualServiceRouteTableResponse>
                            handler) {
        LOG.trace("Called async getVirtualServiceRouteTable");
        final GetVirtualServiceRouteTableRequest interceptedRequest =
                GetVirtualServiceRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVirtualServiceRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "GetVirtualServiceRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/GetVirtualServiceRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetVirtualServiceRouteTableResponse>
                transformer =
                        GetVirtualServiceRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVirtualServiceRouteTableRequest,
                                GetVirtualServiceRouteTableResponse>,
                        java.util.concurrent.Future<GetVirtualServiceRouteTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>(
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
                        "ServiceMesh",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/WorkRequest/GetWorkRequest");
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
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
    public java.util.concurrent.Future<ListAccessPoliciesResponse> listAccessPolicies(
            ListAccessPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessPoliciesRequest, ListAccessPoliciesResponse>
                    handler) {
        LOG.trace("Called async listAccessPolicies");
        final ListAccessPoliciesRequest interceptedRequest =
                ListAccessPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccessPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListAccessPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/ListAccessPolicies");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAccessPoliciesResponse>
                transformer =
                        ListAccessPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAccessPoliciesRequest, ListAccessPoliciesResponse>,
                        java.util.concurrent.Future<ListAccessPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAccessPoliciesRequest, ListAccessPoliciesResponse>(
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
    public java.util.concurrent.Future<ListIngressGatewayRouteTablesResponse>
            listIngressGatewayRouteTables(
                    ListIngressGatewayRouteTablesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIngressGatewayRouteTablesRequest,
                                    ListIngressGatewayRouteTablesResponse>
                            handler) {
        LOG.trace("Called async listIngressGatewayRouteTables");
        final ListIngressGatewayRouteTablesRequest interceptedRequest =
                ListIngressGatewayRouteTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIngressGatewayRouteTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListIngressGatewayRouteTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/ListIngressGatewayRouteTables");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIngressGatewayRouteTablesResponse>
                transformer =
                        ListIngressGatewayRouteTablesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIngressGatewayRouteTablesRequest, ListIngressGatewayRouteTablesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIngressGatewayRouteTablesRequest,
                                ListIngressGatewayRouteTablesResponse>,
                        java.util.concurrent.Future<ListIngressGatewayRouteTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIngressGatewayRouteTablesRequest, ListIngressGatewayRouteTablesResponse>(
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
    public java.util.concurrent.Future<ListIngressGatewaysResponse> listIngressGateways(
            ListIngressGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIngressGatewaysRequest, ListIngressGatewaysResponse>
                    handler) {
        LOG.trace("Called async listIngressGateways");
        final ListIngressGatewaysRequest interceptedRequest =
                ListIngressGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIngressGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListIngressGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/ListIngressGateways");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIngressGatewaysResponse>
                transformer =
                        ListIngressGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIngressGatewaysRequest, ListIngressGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIngressGatewaysRequest, ListIngressGatewaysResponse>,
                        java.util.concurrent.Future<ListIngressGatewaysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIngressGatewaysRequest, ListIngressGatewaysResponse>(
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
    public java.util.concurrent.Future<ListMeshesResponse> listMeshes(
            ListMeshesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMeshesRequest, ListMeshesResponse>
                    handler) {
        LOG.trace("Called async listMeshes");
        final ListMeshesRequest interceptedRequest = ListMeshesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMeshesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListMeshes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/ListMeshes");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMeshesResponse>
                transformer =
                        ListMeshesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMeshesRequest, ListMeshesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMeshesRequest, ListMeshesResponse>,
                        java.util.concurrent.Future<ListMeshesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMeshesRequest, ListMeshesResponse>(
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
    public java.util.concurrent.Future<ListVirtualDeploymentsResponse> listVirtualDeployments(
            ListVirtualDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>
                    handler) {
        LOG.trace("Called async listVirtualDeployments");
        final ListVirtualDeploymentsRequest interceptedRequest =
                ListVirtualDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualDeploymentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListVirtualDeployments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/ListVirtualDeployments");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVirtualDeploymentsResponse>
                transformer =
                        ListVirtualDeploymentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>,
                        java.util.concurrent.Future<ListVirtualDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>(
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
    public java.util.concurrent.Future<ListVirtualServiceRouteTablesResponse>
            listVirtualServiceRouteTables(
                    ListVirtualServiceRouteTablesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualServiceRouteTablesRequest,
                                    ListVirtualServiceRouteTablesResponse>
                            handler) {
        LOG.trace("Called async listVirtualServiceRouteTables");
        final ListVirtualServiceRouteTablesRequest interceptedRequest =
                ListVirtualServiceRouteTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualServiceRouteTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListVirtualServiceRouteTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/ListVirtualServiceRouteTables");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVirtualServiceRouteTablesResponse>
                transformer =
                        ListVirtualServiceRouteTablesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualServiceRouteTablesRequest, ListVirtualServiceRouteTablesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualServiceRouteTablesRequest,
                                ListVirtualServiceRouteTablesResponse>,
                        java.util.concurrent.Future<ListVirtualServiceRouteTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualServiceRouteTablesRequest, ListVirtualServiceRouteTablesResponse>(
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
    public java.util.concurrent.Future<ListVirtualServicesResponse> listVirtualServices(
            ListVirtualServicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualServicesRequest, ListVirtualServicesResponse>
                    handler) {
        LOG.trace("Called async listVirtualServices");
        final ListVirtualServicesRequest interceptedRequest =
                ListVirtualServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "ListVirtualServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/ListVirtualServices");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListVirtualServicesResponse>
                transformer =
                        ListVirtualServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualServicesRequest, ListVirtualServicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualServicesRequest, ListVirtualServicesResponse>,
                        java.util.concurrent.Future<ListVirtualServicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualServicesRequest, ListVirtualServicesResponse>(
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
                        "ServiceMesh",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/WorkRequest/ListWorkRequestErrors");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
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
                        "ServiceMesh",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/WorkRequest/ListWorkRequestLogs");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
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
                        "ServiceMesh",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/WorkRequest/ListWorkRequests");
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
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
    public java.util.concurrent.Future<UpdateAccessPolicyResponse> updateAccessPolicy(
            UpdateAccessPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
                    handler) {
        LOG.trace("Called async updateAccessPolicy");
        final UpdateAccessPolicyRequest interceptedRequest =
                UpdateAccessPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAccessPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateAccessPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/AccessPolicy/UpdateAccessPolicy");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAccessPolicyResponse>
                transformer =
                        UpdateAccessPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>,
                        java.util.concurrent.Future<UpdateAccessPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAccessPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>(
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
    public java.util.concurrent.Future<UpdateIngressGatewayResponse> updateIngressGateway(
            UpdateIngressGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>
                    handler) {
        LOG.trace("Called async updateIngressGateway");
        final UpdateIngressGatewayRequest interceptedRequest =
                UpdateIngressGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIngressGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateIngressGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGateway/UpdateIngressGateway");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIngressGatewayResponse>
                transformer =
                        UpdateIngressGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>,
                        java.util.concurrent.Future<UpdateIngressGatewayResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIngressGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIngressGatewayRequest, UpdateIngressGatewayResponse>(
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
    public java.util.concurrent.Future<UpdateIngressGatewayRouteTableResponse>
            updateIngressGatewayRouteTable(
                    UpdateIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIngressGatewayRouteTableRequest,
                                    UpdateIngressGatewayRouteTableResponse>
                            handler) {
        LOG.trace("Called async updateIngressGatewayRouteTable");
        final UpdateIngressGatewayRouteTableRequest interceptedRequest =
                UpdateIngressGatewayRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIngressGatewayRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateIngressGatewayRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/IngressGatewayRouteTable/UpdateIngressGatewayRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIngressGatewayRouteTableResponse>
                transformer =
                        UpdateIngressGatewayRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIngressGatewayRouteTableRequest,
                        UpdateIngressGatewayRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIngressGatewayRouteTableRequest,
                                UpdateIngressGatewayRouteTableResponse>,
                        java.util.concurrent.Future<UpdateIngressGatewayRouteTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIngressGatewayRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIngressGatewayRouteTableRequest, UpdateIngressGatewayRouteTableResponse>(
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
    public java.util.concurrent.Future<UpdateMeshResponse> updateMesh(
            UpdateMeshRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateMeshRequest, UpdateMeshResponse>
                    handler) {
        LOG.trace("Called async updateMesh");
        final UpdateMeshRequest interceptedRequest = UpdateMeshConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMeshConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateMesh",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/Mesh/UpdateMesh");
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateMeshResponse>
                transformer =
                        UpdateMeshConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateMeshRequest, UpdateMeshResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMeshRequest, UpdateMeshResponse>,
                        java.util.concurrent.Future<UpdateMeshResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMeshDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMeshRequest, UpdateMeshResponse>(
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
    public java.util.concurrent.Future<UpdateVirtualDeploymentResponse> updateVirtualDeployment(
            UpdateVirtualDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>
                    handler) {
        LOG.trace("Called async updateVirtualDeployment");
        final UpdateVirtualDeploymentRequest interceptedRequest =
                UpdateVirtualDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVirtualDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateVirtualDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualDeployment/UpdateVirtualDeployment");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVirtualDeploymentResponse>
                transformer =
                        UpdateVirtualDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>,
                        java.util.concurrent.Future<UpdateVirtualDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVirtualDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVirtualDeploymentRequest, UpdateVirtualDeploymentResponse>(
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
    public java.util.concurrent.Future<UpdateVirtualServiceResponse> updateVirtualService(
            UpdateVirtualServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>
                    handler) {
        LOG.trace("Called async updateVirtualService");
        final UpdateVirtualServiceRequest interceptedRequest =
                UpdateVirtualServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVirtualServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateVirtualService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualService/UpdateVirtualService");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVirtualServiceResponse>
                transformer =
                        UpdateVirtualServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>,
                        java.util.concurrent.Future<UpdateVirtualServiceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVirtualServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVirtualServiceRequest, UpdateVirtualServiceResponse>(
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
    public java.util.concurrent.Future<UpdateVirtualServiceRouteTableResponse>
            updateVirtualServiceRouteTable(
                    UpdateVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVirtualServiceRouteTableRequest,
                                    UpdateVirtualServiceRouteTableResponse>
                            handler) {
        LOG.trace("Called async updateVirtualServiceRouteTable");
        final UpdateVirtualServiceRouteTableRequest interceptedRequest =
                UpdateVirtualServiceRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVirtualServiceRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ServiceMesh",
                        "UpdateVirtualServiceRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/service-mesh/20210930/VirtualServiceRouteTable/UpdateVirtualServiceRouteTable");
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateVirtualServiceRouteTableResponse>
                transformer =
                        UpdateVirtualServiceRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVirtualServiceRouteTableRequest,
                        UpdateVirtualServiceRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVirtualServiceRouteTableRequest,
                                UpdateVirtualServiceRouteTableResponse>,
                        java.util.concurrent.Future<UpdateVirtualServiceRouteTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVirtualServiceRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVirtualServiceRouteTableRequest, UpdateVirtualServiceRouteTableResponse>(
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
