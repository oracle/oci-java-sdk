/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.waa.internal.http.*;
import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for Waa service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class WaaAsyncClient implements WaaAsync {
    /**
     * Service instance for Waa.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAA")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://waa.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WaaAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public WaaAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
    public WaaAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaaAsyncClient> {
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
        public WaaAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new WaaAsyncClient(
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
    public java.util.concurrent.Future<ChangeWebAppAccelerationCompartmentResponse>
            changeWebAppAccelerationCompartment(
                    ChangeWebAppAccelerationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationCompartmentRequest,
                                    ChangeWebAppAccelerationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeWebAppAccelerationCompartment");
        final ChangeWebAppAccelerationCompartmentRequest interceptedRequest =
                ChangeWebAppAccelerationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeWebAppAccelerationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeWebAppAccelerationCompartmentResponse>
                transformer = ChangeWebAppAccelerationCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "ChangeWebAppAccelerationCompartment", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeWebAppAccelerationCompartmentRequest,
                        ChangeWebAppAccelerationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeWebAppAccelerationCompartmentRequest,
                                ChangeWebAppAccelerationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeWebAppAccelerationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeWebAppAccelerationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeWebAppAccelerationCompartmentRequest,
                    ChangeWebAppAccelerationCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeWebAppAccelerationPolicyCompartmentResponse>
            changeWebAppAccelerationPolicyCompartment(
                    ChangeWebAppAccelerationPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationPolicyCompartmentRequest,
                                    ChangeWebAppAccelerationPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeWebAppAccelerationPolicyCompartment");
        final ChangeWebAppAccelerationPolicyCompartmentRequest interceptedRequest =
                ChangeWebAppAccelerationPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeWebAppAccelerationPolicyCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeWebAppAccelerationPolicyCompartmentResponse>
                transformer = ChangeWebAppAccelerationPolicyCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa",
                "ChangeWebAppAccelerationPolicyCompartment",
                ib.getRequestUri().toString(),
                "");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeWebAppAccelerationPolicyCompartmentRequest,
                        ChangeWebAppAccelerationPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeWebAppAccelerationPolicyCompartmentRequest,
                                ChangeWebAppAccelerationPolicyCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeWebAppAccelerationPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeWebAppAccelerationPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeWebAppAccelerationPolicyCompartmentRequest,
                    ChangeWebAppAccelerationPolicyCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateWebAppAccelerationResponse> createWebAppAcceleration(
            CreateWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>
                    handler) {
        LOG.trace("Called async createWebAppAcceleration");
        final CreateWebAppAccelerationRequest interceptedRequest =
                CreateWebAppAccelerationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWebAppAccelerationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateWebAppAccelerationResponse>
                transformer = CreateWebAppAccelerationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "CreateWebAppAcceleration", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>,
                        java.util.concurrent.Future<CreateWebAppAccelerationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateWebAppAccelerationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>(
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
    public java.util.concurrent.Future<CreateWebAppAccelerationPolicyResponse>
            createWebAppAccelerationPolicy(
                    CreateWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateWebAppAccelerationPolicyRequest,
                                    CreateWebAppAccelerationPolicyResponse>
                            handler) {
        LOG.trace("Called async createWebAppAccelerationPolicy");
        final CreateWebAppAccelerationPolicyRequest interceptedRequest =
                CreateWebAppAccelerationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWebAppAccelerationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateWebAppAccelerationPolicyResponse>
                transformer = CreateWebAppAccelerationPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "CreateWebAppAccelerationPolicy", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateWebAppAccelerationPolicyRequest,
                        CreateWebAppAccelerationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateWebAppAccelerationPolicyRequest,
                                CreateWebAppAccelerationPolicyResponse>,
                        java.util.concurrent.Future<CreateWebAppAccelerationPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateWebAppAccelerationPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateWebAppAccelerationPolicyRequest, CreateWebAppAccelerationPolicyResponse>(
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
    public java.util.concurrent.Future<DeleteWebAppAccelerationResponse> deleteWebAppAcceleration(
            DeleteWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>
                    handler) {
        LOG.trace("Called async deleteWebAppAcceleration");
        final DeleteWebAppAccelerationRequest interceptedRequest =
                DeleteWebAppAccelerationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWebAppAccelerationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteWebAppAccelerationResponse>
                transformer = DeleteWebAppAccelerationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "DeleteWebAppAcceleration", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>,
                        java.util.concurrent.Future<DeleteWebAppAccelerationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>(
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
    public java.util.concurrent.Future<DeleteWebAppAccelerationPolicyResponse>
            deleteWebAppAccelerationPolicy(
                    DeleteWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteWebAppAccelerationPolicyRequest,
                                    DeleteWebAppAccelerationPolicyResponse>
                            handler) {
        LOG.trace("Called async deleteWebAppAccelerationPolicy");
        final DeleteWebAppAccelerationPolicyRequest interceptedRequest =
                DeleteWebAppAccelerationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWebAppAccelerationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteWebAppAccelerationPolicyResponse>
                transformer = DeleteWebAppAccelerationPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "DeleteWebAppAccelerationPolicy", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteWebAppAccelerationPolicyRequest,
                        DeleteWebAppAccelerationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWebAppAccelerationPolicyRequest,
                                DeleteWebAppAccelerationPolicyResponse>,
                        java.util.concurrent.Future<DeleteWebAppAccelerationPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWebAppAccelerationPolicyRequest, DeleteWebAppAccelerationPolicyResponse>(
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
    public java.util.concurrent.Future<GetWebAppAccelerationResponse> getWebAppAcceleration(
            GetWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
                    handler) {
        LOG.trace("Called async getWebAppAcceleration");
        final GetWebAppAccelerationRequest interceptedRequest =
                GetWebAppAccelerationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWebAppAccelerationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWebAppAccelerationResponse>
                transformer = GetWebAppAccelerationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "GetWebAppAcceleration", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>,
                        java.util.concurrent.Future<GetWebAppAccelerationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>(
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
    public java.util.concurrent.Future<GetWebAppAccelerationPolicyResponse>
            getWebAppAccelerationPolicy(
                    GetWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetWebAppAccelerationPolicyRequest,
                                    GetWebAppAccelerationPolicyResponse>
                            handler) {
        LOG.trace("Called async getWebAppAccelerationPolicy");
        final GetWebAppAccelerationPolicyRequest interceptedRequest =
                GetWebAppAccelerationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWebAppAccelerationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWebAppAccelerationPolicyResponse>
                transformer = GetWebAppAccelerationPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "GetWebAppAccelerationPolicy", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWebAppAccelerationPolicyRequest,
                                GetWebAppAccelerationPolicyResponse>,
                        java.util.concurrent.Future<GetWebAppAccelerationPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>(
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
    public java.util.concurrent.Future<ListWebAppAccelerationPoliciesResponse>
            listWebAppAccelerationPolicies(
                    ListWebAppAccelerationPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListWebAppAccelerationPoliciesRequest,
                                    ListWebAppAccelerationPoliciesResponse>
                            handler) {
        LOG.trace("Called async listWebAppAccelerationPolicies");
        final ListWebAppAccelerationPoliciesRequest interceptedRequest =
                ListWebAppAccelerationPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWebAppAccelerationPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWebAppAccelerationPoliciesResponse>
                transformer = ListWebAppAccelerationPoliciesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "ListWebAppAccelerationPolicies", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWebAppAccelerationPoliciesRequest,
                        ListWebAppAccelerationPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWebAppAccelerationPoliciesRequest,
                                ListWebAppAccelerationPoliciesResponse>,
                        java.util.concurrent.Future<ListWebAppAccelerationPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWebAppAccelerationPoliciesRequest, ListWebAppAccelerationPoliciesResponse>(
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
    public java.util.concurrent.Future<ListWebAppAccelerationsResponse> listWebAppAccelerations(
            ListWebAppAccelerationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>
                    handler) {
        LOG.trace("Called async listWebAppAccelerations");
        final ListWebAppAccelerationsRequest interceptedRequest =
                ListWebAppAccelerationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWebAppAccelerationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWebAppAccelerationsResponse>
                transformer = ListWebAppAccelerationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "ListWebAppAccelerations", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>,
                        java.util.concurrent.Future<ListWebAppAccelerationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>(
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
    public java.util.concurrent.Future<PurgeWebAppAccelerationCacheResponse>
            purgeWebAppAccelerationCache(
                    PurgeWebAppAccelerationCacheRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PurgeWebAppAccelerationCacheRequest,
                                    PurgeWebAppAccelerationCacheResponse>
                            handler) {
        LOG.trace("Called async purgeWebAppAccelerationCache");
        final PurgeWebAppAccelerationCacheRequest interceptedRequest =
                PurgeWebAppAccelerationCacheConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeWebAppAccelerationCacheConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PurgeWebAppAccelerationCacheResponse>
                transformer = PurgeWebAppAccelerationCacheConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "PurgeWebAppAccelerationCache", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        PurgeWebAppAccelerationCacheRequest, PurgeWebAppAccelerationCacheResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PurgeWebAppAccelerationCacheRequest,
                                PurgeWebAppAccelerationCacheResponse>,
                        java.util.concurrent.Future<PurgeWebAppAccelerationCacheResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPurgeWebAppAccelerationCacheDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PurgeWebAppAccelerationCacheRequest, PurgeWebAppAccelerationCacheResponse>(
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
    public java.util.concurrent.Future<UpdateWebAppAccelerationResponse> updateWebAppAcceleration(
            UpdateWebAppAccelerationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>
                    handler) {
        LOG.trace("Called async updateWebAppAcceleration");
        final UpdateWebAppAccelerationRequest interceptedRequest =
                UpdateWebAppAccelerationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWebAppAccelerationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateWebAppAccelerationResponse>
                transformer = UpdateWebAppAccelerationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "UpdateWebAppAcceleration", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>,
                        java.util.concurrent.Future<UpdateWebAppAccelerationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWebAppAccelerationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>(
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
    public java.util.concurrent.Future<UpdateWebAppAccelerationPolicyResponse>
            updateWebAppAccelerationPolicy(
                    UpdateWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWebAppAccelerationPolicyRequest,
                                    UpdateWebAppAccelerationPolicyResponse>
                            handler) {
        LOG.trace("Called async updateWebAppAccelerationPolicy");
        final UpdateWebAppAccelerationPolicyRequest interceptedRequest =
                UpdateWebAppAccelerationPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWebAppAccelerationPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateWebAppAccelerationPolicyResponse>
                transformer = UpdateWebAppAccelerationPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waa", "UpdateWebAppAccelerationPolicy", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateWebAppAccelerationPolicyRequest,
                        UpdateWebAppAccelerationPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWebAppAccelerationPolicyRequest,
                                UpdateWebAppAccelerationPolicyResponse>,
                        java.util.concurrent.Future<UpdateWebAppAccelerationPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWebAppAccelerationPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWebAppAccelerationPolicyRequest, UpdateWebAppAccelerationPolicyResponse>(
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
