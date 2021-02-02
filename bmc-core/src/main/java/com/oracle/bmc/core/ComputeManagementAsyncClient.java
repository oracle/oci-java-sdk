/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for ComputeManagement service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ComputeManagementAsyncClient implements ComputeManagementAsync {
    /**
     * Service instance for ComputeManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEMANAGEMENT")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
        this.client = restClientFactory.create(defaultRequestSigner, requestSigners, configuration);

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
                    Builder, ComputeManagementAsyncClient> {
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
        public ComputeManagementAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new ComputeManagementAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
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
    public java.util.concurrent.Future<AttachLoadBalancerResponse> attachLoadBalancer(
            AttachLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AttachLoadBalancerRequest, AttachLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async attachLoadBalancer");
        final AttachLoadBalancerRequest interceptedRequest =
                AttachLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachLoadBalancerConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AttachLoadBalancerResponse>
                transformer = AttachLoadBalancerConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<AttachLoadBalancerRequest, AttachLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachLoadBalancerRequest, AttachLoadBalancerResponse>,
                        java.util.concurrent.Future<AttachLoadBalancerResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachLoadBalancerRequest, AttachLoadBalancerResponse>(
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
    public java.util.concurrent.Future<ChangeClusterNetworkCompartmentResponse>
            changeClusterNetworkCompartment(
                    ChangeClusterNetworkCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeClusterNetworkCompartmentRequest,
                                    ChangeClusterNetworkCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeClusterNetworkCompartment");
        final ChangeClusterNetworkCompartmentRequest interceptedRequest =
                ChangeClusterNetworkCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeClusterNetworkCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeClusterNetworkCompartmentResponse>
                transformer = ChangeClusterNetworkCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeClusterNetworkCompartmentRequest,
                        ChangeClusterNetworkCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeClusterNetworkCompartmentRequest,
                                ChangeClusterNetworkCompartmentResponse>,
                        java.util.concurrent.Future<ChangeClusterNetworkCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeClusterNetworkCompartmentRequest,
                    ChangeClusterNetworkCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeInstanceConfigurationCompartmentResponse>
            changeInstanceConfigurationCompartment(
                    ChangeInstanceConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInstanceConfigurationCompartmentRequest,
                                    ChangeInstanceConfigurationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeInstanceConfigurationCompartment");
        final ChangeInstanceConfigurationCompartmentRequest interceptedRequest =
                ChangeInstanceConfigurationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstanceConfigurationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeInstanceConfigurationCompartmentResponse>
                transformer = ChangeInstanceConfigurationCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstanceConfigurationCompartmentRequest,
                        ChangeInstanceConfigurationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstanceConfigurationCompartmentRequest,
                                ChangeInstanceConfigurationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstanceConfigurationCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstanceConfigurationCompartmentRequest,
                    ChangeInstanceConfigurationCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeInstancePoolCompartmentResponse>
            changeInstancePoolCompartment(
                    ChangeInstancePoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInstancePoolCompartmentRequest,
                                    ChangeInstancePoolCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeInstancePoolCompartment");
        final ChangeInstancePoolCompartmentRequest interceptedRequest =
                ChangeInstancePoolCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstancePoolCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeInstancePoolCompartmentResponse>
                transformer = ChangeInstancePoolCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstancePoolCompartmentRequest, ChangeInstancePoolCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstancePoolCompartmentRequest,
                                ChangeInstancePoolCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstancePoolCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstancePoolCompartmentRequest, ChangeInstancePoolCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateClusterNetworkResponse> createClusterNetwork(
            CreateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateClusterNetworkRequest, CreateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async createClusterNetwork");
        final CreateClusterNetworkRequest interceptedRequest =
                CreateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateClusterNetworkResponse>
                transformer = CreateClusterNetworkConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateClusterNetworkRequest, CreateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateClusterNetworkRequest, CreateClusterNetworkResponse>,
                        java.util.concurrent.Future<CreateClusterNetworkResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateClusterNetworkRequest, CreateClusterNetworkResponse>(
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
    public java.util.concurrent.Future<CreateInstanceConfigurationResponse>
            createInstanceConfiguration(
                    CreateInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConfigurationRequest,
                                    CreateInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async createInstanceConfiguration");
        final CreateInstanceConfigurationRequest interceptedRequest =
                CreateInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateInstanceConfigurationResponse>
                transformer = CreateInstanceConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateInstanceConfigurationRequest, CreateInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstanceConfigurationRequest,
                                CreateInstanceConfigurationResponse>,
                        java.util.concurrent.Future<CreateInstanceConfigurationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstanceConfigurationRequest, CreateInstanceConfigurationResponse>(
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
    public java.util.concurrent.Future<CreateInstancePoolResponse> createInstancePool(
            CreateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInstancePoolRequest, CreateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async createInstancePool");
        final CreateInstancePoolRequest interceptedRequest =
                CreateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateInstancePoolResponse>
                transformer = CreateInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateInstancePoolRequest, CreateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstancePoolRequest, CreateInstancePoolResponse>,
                        java.util.concurrent.Future<CreateInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstancePoolRequest, CreateInstancePoolResponse>(
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
    public java.util.concurrent.Future<DeleteInstanceConfigurationResponse>
            deleteInstanceConfiguration(
                    DeleteInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConfigurationRequest,
                                    DeleteInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async deleteInstanceConfiguration");
        final DeleteInstanceConfigurationRequest interceptedRequest =
                DeleteInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConfigurationResponse>
                transformer = DeleteInstanceConfigurationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteInstanceConfigurationRequest, DeleteInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteInstanceConfigurationRequest,
                                DeleteInstanceConfigurationResponse>,
                        java.util.concurrent.Future<DeleteInstanceConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteInstanceConfigurationRequest, DeleteInstanceConfigurationResponse>(
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
    public java.util.concurrent.Future<DetachLoadBalancerResponse> detachLoadBalancer(
            DetachLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetachLoadBalancerRequest, DetachLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async detachLoadBalancer");
        final DetachLoadBalancerRequest interceptedRequest =
                DetachLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachLoadBalancerConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DetachLoadBalancerResponse>
                transformer = DetachLoadBalancerConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DetachLoadBalancerRequest, DetachLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachLoadBalancerRequest, DetachLoadBalancerResponse>,
                        java.util.concurrent.Future<DetachLoadBalancerResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachLoadBalancerRequest, DetachLoadBalancerResponse>(
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
    public java.util.concurrent.Future<GetClusterNetworkResponse> getClusterNetwork(
            GetClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterNetworkRequest, GetClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async getClusterNetwork");
        final GetClusterNetworkRequest interceptedRequest =
                GetClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetClusterNetworkResponse>
                transformer = GetClusterNetworkConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetClusterNetworkRequest, GetClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetClusterNetworkRequest, GetClusterNetworkResponse>,
                        java.util.concurrent.Future<GetClusterNetworkResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetClusterNetworkRequest, GetClusterNetworkResponse>(
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
    public java.util.concurrent.Future<GetInstanceConfigurationResponse> getInstanceConfiguration(
            GetInstanceConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>
                    handler) {
        LOG.trace("Called async getInstanceConfiguration");
        final GetInstanceConfigurationRequest interceptedRequest =
                GetInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetInstanceConfigurationResponse>
                transformer = GetInstanceConfigurationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>,
                        java.util.concurrent.Future<GetInstanceConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>(
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
    public java.util.concurrent.Future<GetInstancePoolResponse> getInstancePool(
            GetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInstancePoolRequest, GetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async getInstancePool");
        final GetInstancePoolRequest interceptedRequest =
                GetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetInstancePoolResponse>
                transformer = GetInstancePoolConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetInstancePoolRequest, GetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstancePoolRequest, GetInstancePoolResponse>,
                        java.util.concurrent.Future<GetInstancePoolResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstancePoolRequest, GetInstancePoolResponse>(
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
    public java.util.concurrent.Future<GetInstancePoolLoadBalancerAttachmentResponse>
            getInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstancePoolLoadBalancerAttachmentRequest,
                                    GetInstancePoolLoadBalancerAttachmentResponse>
                            handler) {
        LOG.trace("Called async getInstancePoolLoadBalancerAttachment");
        final GetInstancePoolLoadBalancerAttachmentRequest interceptedRequest =
                GetInstancePoolLoadBalancerAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolLoadBalancerAttachmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetInstancePoolLoadBalancerAttachmentResponse>
                transformer = GetInstancePoolLoadBalancerAttachmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetInstancePoolLoadBalancerAttachmentRequest,
                        GetInstancePoolLoadBalancerAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstancePoolLoadBalancerAttachmentRequest,
                                GetInstancePoolLoadBalancerAttachmentResponse>,
                        java.util.concurrent.Future<GetInstancePoolLoadBalancerAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>(
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
    public java.util.concurrent.Future<LaunchInstanceConfigurationResponse>
            launchInstanceConfiguration(
                    LaunchInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LaunchInstanceConfigurationRequest,
                                    LaunchInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async launchInstanceConfiguration");
        final LaunchInstanceConfigurationRequest interceptedRequest =
                LaunchInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, LaunchInstanceConfigurationResponse>
                transformer = LaunchInstanceConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchInstanceConfigurationRequest,
                                LaunchInstanceConfigurationResponse>,
                        java.util.concurrent.Future<LaunchInstanceConfigurationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>(
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
    public java.util.concurrent.Future<ListClusterNetworkInstancesResponse>
            listClusterNetworkInstances(
                    ListClusterNetworkInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListClusterNetworkInstancesRequest,
                                    ListClusterNetworkInstancesResponse>
                            handler) {
        LOG.trace("Called async listClusterNetworkInstances");
        final ListClusterNetworkInstancesRequest interceptedRequest =
                ListClusterNetworkInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListClusterNetworkInstancesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListClusterNetworkInstancesResponse>
                transformer = ListClusterNetworkInstancesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListClusterNetworkInstancesRequest,
                                ListClusterNetworkInstancesResponse>,
                        java.util.concurrent.Future<ListClusterNetworkInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>(
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
    public java.util.concurrent.Future<ListClusterNetworksResponse> listClusterNetworks(
            ListClusterNetworksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListClusterNetworksRequest, ListClusterNetworksResponse>
                    handler) {
        LOG.trace("Called async listClusterNetworks");
        final ListClusterNetworksRequest interceptedRequest =
                ListClusterNetworksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListClusterNetworksConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListClusterNetworksResponse>
                transformer = ListClusterNetworksConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListClusterNetworksRequest, ListClusterNetworksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListClusterNetworksRequest, ListClusterNetworksResponse>,
                        java.util.concurrent.Future<ListClusterNetworksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListClusterNetworksRequest, ListClusterNetworksResponse>(
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
    public java.util.concurrent.Future<ListInstanceConfigurationsResponse>
            listInstanceConfigurations(
                    ListInstanceConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConfigurationsRequest,
                                    ListInstanceConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listInstanceConfigurations");
        final ListInstanceConfigurationsRequest interceptedRequest =
                ListInstanceConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConfigurationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceConfigurationsResponse>
                transformer = ListInstanceConfigurationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceConfigurationsRequest,
                                ListInstanceConfigurationsResponse>,
                        java.util.concurrent.Future<ListInstanceConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>(
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
    public java.util.concurrent.Future<ListInstancePoolInstancesResponse> listInstancePoolInstances(
            ListInstancePoolInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>
                    handler) {
        LOG.trace("Called async listInstancePoolInstances");
        final ListInstancePoolInstancesRequest interceptedRequest =
                ListInstancePoolInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolInstancesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstancePoolInstancesResponse>
                transformer = ListInstancePoolInstancesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancePoolInstancesRequest,
                                ListInstancePoolInstancesResponse>,
                        java.util.concurrent.Future<ListInstancePoolInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>(
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
    public java.util.concurrent.Future<ListInstancePoolsResponse> listInstancePools(
            ListInstancePoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolsRequest, ListInstancePoolsResponse>
                    handler) {
        LOG.trace("Called async listInstancePools");
        final ListInstancePoolsRequest interceptedRequest =
                ListInstancePoolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancePoolsResponse>
                transformer = ListInstancePoolsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListInstancePoolsRequest, ListInstancePoolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancePoolsRequest, ListInstancePoolsResponse>,
                        java.util.concurrent.Future<ListInstancePoolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancePoolsRequest, ListInstancePoolsResponse>(
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
    public java.util.concurrent.Future<ResetInstancePoolResponse> resetInstancePool(
            ResetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetInstancePoolRequest, ResetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async resetInstancePool");
        final ResetInstancePoolRequest interceptedRequest =
                ResetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ResetInstancePoolResponse>
                transformer = ResetInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<ResetInstancePoolRequest, ResetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetInstancePoolRequest, ResetInstancePoolResponse>,
                        java.util.concurrent.Future<ResetInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetInstancePoolRequest, ResetInstancePoolResponse>(
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
    public java.util.concurrent.Future<SoftresetInstancePoolResponse> softresetInstancePool(
            SoftresetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async softresetInstancePool");
        final SoftresetInstancePoolRequest interceptedRequest =
                SoftresetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SoftresetInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SoftresetInstancePoolResponse>
                transformer = SoftresetInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>,
                        java.util.concurrent.Future<SoftresetInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>(
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
    public java.util.concurrent.Future<StartInstancePoolResponse> startInstancePool(
            StartInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartInstancePoolRequest, StartInstancePoolResponse>
                    handler) {
        LOG.trace("Called async startInstancePool");
        final StartInstancePoolRequest interceptedRequest =
                StartInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StartInstancePoolResponse>
                transformer = StartInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<StartInstancePoolRequest, StartInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartInstancePoolRequest, StartInstancePoolResponse>,
                        java.util.concurrent.Future<StartInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartInstancePoolRequest, StartInstancePoolResponse>(
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
    public java.util.concurrent.Future<StopInstancePoolResponse> stopInstancePool(
            StopInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopInstancePoolRequest, StopInstancePoolResponse>
                    handler) {
        LOG.trace("Called async stopInstancePool");
        final StopInstancePoolRequest interceptedRequest =
                StopInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StopInstancePoolResponse>
                transformer = StopInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<StopInstancePoolRequest, StopInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopInstancePoolRequest, StopInstancePoolResponse>,
                        java.util.concurrent.Future<StopInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopInstancePoolRequest, StopInstancePoolResponse>(
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
    public java.util.concurrent.Future<TerminateClusterNetworkResponse> terminateClusterNetwork(
            TerminateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async terminateClusterNetwork");
        final TerminateClusterNetworkRequest interceptedRequest =
                TerminateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, TerminateClusterNetworkResponse>
                transformer = TerminateClusterNetworkConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>,
                        java.util.concurrent.Future<TerminateClusterNetworkResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>(
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
    public java.util.concurrent.Future<TerminateInstancePoolResponse> terminateInstancePool(
            TerminateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstancePoolRequest, TerminateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async terminateInstancePool");
        final TerminateInstancePoolRequest interceptedRequest =
                TerminateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, TerminateInstancePoolResponse>
                transformer = TerminateInstancePoolConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        TerminateInstancePoolRequest, TerminateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateInstancePoolRequest, TerminateInstancePoolResponse>,
                        java.util.concurrent.Future<TerminateInstancePoolResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateInstancePoolRequest, TerminateInstancePoolResponse>(
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
    public java.util.concurrent.Future<UpdateClusterNetworkResponse> updateClusterNetwork(
            UpdateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async updateClusterNetwork");
        final UpdateClusterNetworkRequest interceptedRequest =
                UpdateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateClusterNetworkResponse>
                transformer = UpdateClusterNetworkConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>,
                        java.util.concurrent.Future<UpdateClusterNetworkResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>(
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
    public java.util.concurrent.Future<UpdateInstanceConfigurationResponse>
            updateInstanceConfiguration(
                    UpdateInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceConfigurationRequest,
                                    UpdateInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateInstanceConfiguration");
        final UpdateInstanceConfigurationRequest interceptedRequest =
                UpdateInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateInstanceConfigurationResponse>
                transformer = UpdateInstanceConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceConfigurationRequest,
                                UpdateInstanceConfigurationResponse>,
                        java.util.concurrent.Future<UpdateInstanceConfigurationResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(
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
    public java.util.concurrent.Future<UpdateInstancePoolResponse> updateInstancePool(
            UpdateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstancePoolRequest, UpdateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async updateInstancePool");
        final UpdateInstancePoolRequest interceptedRequest =
                UpdateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstancePoolConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstancePoolResponse>
                transformer = UpdateInstancePoolConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpdateInstancePoolRequest, UpdateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstancePoolRequest, UpdateInstancePoolResponse>,
                        java.util.concurrent.Future<UpdateInstancePoolResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstancePoolRequest, UpdateInstancePoolResponse>(
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
