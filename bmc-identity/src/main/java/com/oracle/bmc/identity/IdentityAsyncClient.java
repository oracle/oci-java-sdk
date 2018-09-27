/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import java.util.Locale;
import com.oracle.bmc.identity.internal.http.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class IdentityAsyncClient implements IdentityAsync {
    /**
     * Service instance for Identity.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITY")
                    .serviceEndpointPrefix("identity")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public IdentityAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
    public IdentityAsyncClient(
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
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
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
     * {@link #build(AbstractAuthenticationDetailsProvider)} or {@link #buildAsync(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IdentityAsyncClient> {
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
        public IdentityAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new IdentityAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
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
        regionId = regionId.toLowerCase(Locale.ENGLISH);
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
    public java.util.concurrent.Future<AddUserToGroupResponse> addUserToGroup(
            final AddUserToGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddUserToGroupRequest, AddUserToGroupResponse>
                    handler) {
        LOG.trace("Called async addUserToGroup");
        final AddUserToGroupRequest interceptedRequest =
                AddUserToGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddUserToGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddUserToGroupResponse>
                transformer = AddUserToGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            AddUserToGroupRequest, AddUserToGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getAddUserToGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getAddUserToGroupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, AddUserToGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getAddUserToGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            final CreateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler) {
        LOG.trace("Called async createAuthToken");
        final CreateAuthTokenRequest interceptedRequest =
                CreateAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthTokenConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAuthTokenResponse>
                transformer = CreateAuthTokenConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateAuthTokenRequest, CreateAuthTokenResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateAuthTokenDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateAuthTokenDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateAuthTokenResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateAuthTokenDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCompartmentResponse> createCompartment(
            final CreateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>
                    handler) {
        LOG.trace("Called async createCompartment");
        final CreateCompartmentRequest interceptedRequest =
                CreateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateCompartmentResponse>
                transformer = CreateCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateCompartmentRequest, CreateCompartmentResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateCompartmentRequest, CreateCompartmentResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateCompartmentDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateCompartmentDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateCompartmentResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateCompartmentDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            final CreateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async createCustomerSecretKey");
        final CreateCustomerSecretKeyRequest interceptedRequest =
                CreateCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>
                transformer = CreateCustomerSecretKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateCustomerSecretKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateCustomerSecretKeyDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateCustomerSecretKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDynamicGroupResponse> createDynamicGroup(
            final CreateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async createDynamicGroup");
        final CreateDynamicGroupRequest interceptedRequest =
                CreateDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDynamicGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDynamicGroupResponse>
                transformer = CreateDynamicGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateDynamicGroupRequest, CreateDynamicGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateDynamicGroupRequest, CreateDynamicGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateDynamicGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateDynamicGroupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateDynamicGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateDynamicGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            final CreateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {
        LOG.trace("Called async createGroup");
        final CreateGroupRequest interceptedRequest =
                CreateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer = CreateGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateGroupRequest, CreateGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateGroupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            final CreateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async createIdentityProvider");
        final CreateIdentityProviderRequest interceptedRequest =
                CreateIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityProviderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer = CreateIdentityProviderConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateIdentityProviderDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateIdentityProviderDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateIdentityProviderResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateIdentityProviderDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIdpGroupMappingResponse> createIdpGroupMapping(
            final CreateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async createIdpGroupMapping");
        final CreateIdpGroupMappingRequest interceptedRequest =
                CreateIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateIdpGroupMappingResponse>
                transformer = CreateIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateIdpGroupMappingRequest, CreateIdpGroupMappingResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateIdpGroupMappingDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateIdpGroupMappingDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateIdpGroupMappingResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateIdpGroupMappingDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOrResetUIPasswordResponse> createOrResetUIPassword(
            final CreateOrResetUIPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                    handler) {
        LOG.trace("Called async createOrResetUIPassword");
        final CreateOrResetUIPasswordRequest interceptedRequest =
                CreateOrResetUIPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOrResetUIPasswordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOrResetUIPasswordResponse>
                transformer = CreateOrResetUIPasswordConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateOrResetUIPasswordRequest, CreateOrResetUIPasswordResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateOrResetUIPasswordResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            final CreatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler) {
        LOG.trace("Called async createPolicy");
        final CreatePolicyRequest interceptedRequest =
                CreatePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer = CreatePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreatePolicyRequest, CreatePolicyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreatePolicyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreatePolicyDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreatePolicyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreatePolicyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRegionSubscriptionResponse> createRegionSubscription(
            final CreateRegionSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                    handler) {
        LOG.trace("Called async createRegionSubscription");
        final CreateRegionSubscriptionRequest interceptedRequest =
                CreateRegionSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRegionSubscriptionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateRegionSubscriptionResponse>
                transformer = CreateRegionSubscriptionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateRegionSubscriptionRequest, CreateRegionSubscriptionResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateRegionSubscriptionDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateRegionSubscriptionDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateRegionSubscriptionResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateRegionSubscriptionDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            final CreateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async createSmtpCredential");
        final CreateSmtpCredentialRequest interceptedRequest =
                CreateSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSmtpCredentialResponse>
                transformer = CreateSmtpCredentialConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateSmtpCredentialDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateSmtpCredentialDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateSmtpCredentialResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateSmtpCredentialDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSwiftPasswordResponse> createSwiftPassword(
            final CreateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async createSwiftPassword");
        final CreateSwiftPasswordRequest interceptedRequest =
                CreateSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer = CreateSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateSwiftPasswordRequest, CreateSwiftPasswordResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateSwiftPasswordDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateSwiftPasswordDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateSwiftPasswordResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateSwiftPasswordDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTagResponse> createTag(
            final CreateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse>
                    handler) {
        LOG.trace("Called async createTag");
        final CreateTagRequest interceptedRequest = CreateTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagResponse>
                transformer = CreateTagConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateTagRequest, CreateTagResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateTagRequest, CreateTagResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateTagDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateTagDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateTagResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateTagDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTagNamespaceResponse> createTagNamespace(
            final CreateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async createTagNamespace");
        final CreateTagNamespaceRequest interceptedRequest =
                CreateTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTagNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTagNamespaceResponse>
                transformer = CreateTagNamespaceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateTagNamespaceRequest, CreateTagNamespaceResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateTagNamespaceRequest, CreateTagNamespaceResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateTagNamespaceDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateTagNamespaceDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateTagNamespaceResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateTagNamespaceDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            final CreateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse>
                    handler) {
        LOG.trace("Called async createUser");
        final CreateUserRequest interceptedRequest = CreateUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserResponse>
                transformer = CreateUserConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateUserRequest, CreateUserResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateUserDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateUserDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateUserResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateUserDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            final DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteApiKey");
        final DeleteApiKeyRequest interceptedRequest =
                DeleteApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer = DeleteApiKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteApiKeyRequest, DeleteApiKeyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteApiKeyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            final DeleteAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler) {
        LOG.trace("Called async deleteAuthToken");
        final DeleteAuthTokenRequest interceptedRequest =
                DeleteAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthTokenConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAuthTokenResponse>
                transformer = DeleteAuthTokenConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteAuthTokenResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            final DeleteCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async deleteCustomerSecretKey");
        final DeleteCustomerSecretKeyRequest interceptedRequest =
                DeleteCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>
                transformer = DeleteCustomerSecretKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDynamicGroupResponse> deleteDynamicGroup(
            final DeleteDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async deleteDynamicGroup");
        final DeleteDynamicGroupRequest interceptedRequest =
                DeleteDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDynamicGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDynamicGroupResponse>
                transformer = DeleteDynamicGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteDynamicGroupRequest, DeleteDynamicGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteDynamicGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            final DeleteGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {
        LOG.trace("Called async deleteGroup");
        final DeleteGroupRequest interceptedRequest =
                DeleteGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer = DeleteGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteGroupRequest, DeleteGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            final DeleteIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async deleteIdentityProvider");
        final DeleteIdentityProviderRequest interceptedRequest =
                DeleteIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityProviderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer = DeleteIdentityProviderConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteIdentityProviderResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIdpGroupMappingResponse> deleteIdpGroupMapping(
            final DeleteIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async deleteIdpGroupMapping");
        final DeleteIdpGroupMappingRequest interceptedRequest =
                DeleteIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteIdpGroupMappingResponse>
                transformer = DeleteIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteIdpGroupMappingRequest, DeleteIdpGroupMappingResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteIdpGroupMappingResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            final DeletePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler) {
        LOG.trace("Called async deletePolicy");
        final DeletePolicyRequest interceptedRequest =
                DeletePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer = DeletePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeletePolicyRequest, DeletePolicyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeletePolicyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            final DeleteSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteSmtpCredential");
        final DeleteSmtpCredentialRequest interceptedRequest =
                DeleteSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>
                transformer = DeleteSmtpCredentialConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSwiftPasswordResponse> deleteSwiftPassword(
            final DeleteSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async deleteSwiftPassword");
        final DeleteSwiftPasswordRequest interceptedRequest =
                DeleteSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>
                transformer = DeleteSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteSwiftPasswordRequest, DeleteSwiftPasswordResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteSwiftPasswordResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            final DeleteUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse>
                    handler) {
        LOG.trace("Called async deleteUser");
        final DeleteUserRequest interceptedRequest = DeleteUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserResponse>
                transformer = DeleteUserConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteUserRequest, DeleteUserResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteUserResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompartmentResponse> getCompartment(
            final GetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompartmentRequest, GetCompartmentResponse>
                    handler) {
        LOG.trace("Called async getCompartment");
        final GetCompartmentRequest interceptedRequest =
                GetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCompartmentResponse>
                transformer = GetCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetCompartmentRequest, GetCompartmentResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetCompartmentRequest, GetCompartmentResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetCompartmentResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDynamicGroupResponse> getDynamicGroup(
            final GetDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDynamicGroupRequest, GetDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async getDynamicGroup");
        final GetDynamicGroupRequest interceptedRequest =
                GetDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDynamicGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDynamicGroupResponse>
                transformer = GetDynamicGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDynamicGroupRequest, GetDynamicGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetDynamicGroupRequest, GetDynamicGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetDynamicGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            final GetGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>
                    handler) {
        LOG.trace("Called async getGroup");
        final GetGroupRequest interceptedRequest = GetGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetGroupResponse>
                transformer = GetGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetGroupRequest, GetGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            final GetIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async getIdentityProvider");
        final GetIdentityProviderRequest interceptedRequest =
                GetIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer = GetIdentityProviderConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetIdentityProviderRequest, GetIdentityProviderResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetIdentityProviderResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIdpGroupMappingResponse> getIdpGroupMapping(
            final GetIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async getIdpGroupMapping");
        final GetIdpGroupMappingRequest interceptedRequest =
                GetIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer = GetIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetIdpGroupMappingResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            final GetPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>
                    handler) {
        LOG.trace("Called async getPolicy");
        final GetPolicyRequest interceptedRequest = GetPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyResponse>
                transformer = GetPolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetPolicyRequest, GetPolicyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetPolicyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTagResponse> getTag(
            final GetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handler) {
        LOG.trace("Called async getTag");
        final GetTagRequest interceptedRequest = GetTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTagResponse>
                transformer = GetTagConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTagRequest, GetTagResponse> handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetTagRequest, GetTagResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetTagResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTagNamespaceResponse> getTagNamespace(
            final GetTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTagNamespaceRequest, GetTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async getTagNamespace");
        final GetTagNamespaceRequest interceptedRequest =
                GetTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTagNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTagNamespaceResponse>
                transformer = GetTagNamespaceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTagNamespaceRequest, GetTagNamespaceResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetTagNamespaceRequest, GetTagNamespaceResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetTagNamespaceResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTenancyResponse> getTenancy(
            final GetTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse>
                    handler) {
        LOG.trace("Called async getTenancy");
        final GetTenancyRequest interceptedRequest = GetTenancyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTenancyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTenancyResponse>
                transformer = GetTenancyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTenancyRequest, GetTenancyResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetTenancyRequest, GetTenancyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetTenancyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            final GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse>
                transformer = GetUserConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetUserRequest, GetUserResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetUserResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserGroupMembershipResponse> getUserGroupMembership(
            final GetUserGroupMembershipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                    handler) {
        LOG.trace("Called async getUserGroupMembership");
        final GetUserGroupMembershipRequest interceptedRequest =
                GetUserGroupMembershipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserGroupMembershipConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserGroupMembershipResponse>
                transformer = GetUserGroupMembershipConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetUserGroupMembershipResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            final ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {
        LOG.trace("Called async listApiKeys");
        final ListApiKeysRequest interceptedRequest =
                ListApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer = ListApiKeysConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListApiKeysRequest, ListApiKeysResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListApiKeysResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            final ListAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>
                    handler) {
        LOG.trace("Called async listAuthTokens");
        final ListAuthTokensRequest interceptedRequest =
                ListAuthTokensConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthTokensConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuthTokensResponse>
                transformer = ListAuthTokensConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListAuthTokensRequest, ListAuthTokensResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListAuthTokensResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAvailabilityDomainsResponse> listAvailabilityDomains(
            final ListAvailabilityDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    handler) {
        LOG.trace("Called async listAvailabilityDomains");
        final ListAvailabilityDomainsRequest interceptedRequest =
                ListAvailabilityDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailabilityDomainsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailabilityDomainsResponse>
                transformer = ListAvailabilityDomainsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListAvailabilityDomainsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCompartmentsResponse> listCompartments(
            final ListCompartmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCompartmentsRequest, ListCompartmentsResponse>
                    handler) {
        LOG.trace("Called async listCompartments");
        final ListCompartmentsRequest interceptedRequest =
                ListCompartmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCompartmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCompartmentsResponse>
                transformer = ListCompartmentsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListCompartmentsRequest, ListCompartmentsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListCompartmentsRequest, ListCompartmentsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListCompartmentsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            final ListCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler) {
        LOG.trace("Called async listCustomerSecretKeys");
        final ListCustomerSecretKeysRequest interceptedRequest =
                ListCustomerSecretKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>
                transformer = ListCustomerSecretKeysConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDynamicGroupsResponse> listDynamicGroups(
            final ListDynamicGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                    handler) {
        LOG.trace("Called async listDynamicGroups");
        final ListDynamicGroupsRequest interceptedRequest =
                ListDynamicGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDynamicGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDynamicGroupsResponse>
                transformer = ListDynamicGroupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDynamicGroupsRequest, ListDynamicGroupsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListDynamicGroupsRequest, ListDynamicGroupsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListDynamicGroupsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFaultDomainsResponse> listFaultDomains(
            final ListFaultDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFaultDomainsRequest, ListFaultDomainsResponse>
                    handler) {
        LOG.trace("Called async listFaultDomains");
        final ListFaultDomainsRequest interceptedRequest =
                ListFaultDomainsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFaultDomainsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFaultDomainsResponse>
                transformer = ListFaultDomainsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListFaultDomainsRequest, ListFaultDomainsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListFaultDomainsRequest, ListFaultDomainsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListFaultDomainsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            final ListGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse>
                    handler) {
        LOG.trace("Called async listGroups");
        final ListGroupsRequest interceptedRequest = ListGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGroupsResponse>
                transformer = ListGroupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListGroupsRequest, ListGroupsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListGroupsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            final ListIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {
        LOG.trace("Called async listIdentityProviders");
        final ListIdentityProvidersRequest interceptedRequest =
                ListIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer = ListIdentityProvidersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListIdentityProvidersResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIdpGroupMappingsResponse> listIdpGroupMappings(
            final ListIdpGroupMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                    handler) {
        LOG.trace("Called async listIdpGroupMappings");
        final ListIdpGroupMappingsRequest interceptedRequest =
                ListIdpGroupMappingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdpGroupMappingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>
                transformer = ListIdpGroupMappingsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListIdpGroupMappingsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            final ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer = ListPoliciesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListPoliciesRequest, ListPoliciesResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListPoliciesResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRegionSubscriptionsResponse> listRegionSubscriptions(
            final ListRegionSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                    handler) {
        LOG.trace("Called async listRegionSubscriptions");
        final ListRegionSubscriptionsRequest interceptedRequest =
                ListRegionSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionSubscriptionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListRegionSubscriptionsResponse>
                transformer = ListRegionSubscriptionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListRegionSubscriptionsRequest, ListRegionSubscriptionsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListRegionSubscriptionsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRegionsResponse> listRegions(
            final ListRegionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                    handler) {
        LOG.trace("Called async listRegions");
        final ListRegionsRequest interceptedRequest =
                ListRegionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRegionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer = ListRegionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListRegionsRequest, ListRegionsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListRegionsRequest, ListRegionsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListRegionsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            final ListSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler) {
        LOG.trace("Called async listSmtpCredentials");
        final ListSmtpCredentialsRequest interceptedRequest =
                ListSmtpCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSmtpCredentialsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSmtpCredentialsResponse>
                transformer = ListSmtpCredentialsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListSmtpCredentialsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSwiftPasswordsResponse> listSwiftPasswords(
            final ListSwiftPasswordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                    handler) {
        LOG.trace("Called async listSwiftPasswords");
        final ListSwiftPasswordsRequest interceptedRequest =
                ListSwiftPasswordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSwiftPasswordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSwiftPasswordsResponse>
                transformer = ListSwiftPasswordsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListSwiftPasswordsRequest, ListSwiftPasswordsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListSwiftPasswordsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagNamespacesResponse> listTagNamespaces(
            final ListTagNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>
                    handler) {
        LOG.trace("Called async listTagNamespaces");
        final ListTagNamespacesRequest interceptedRequest =
                ListTagNamespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagNamespacesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagNamespacesResponse>
                transformer = ListTagNamespacesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListTagNamespacesRequest, ListTagNamespacesResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListTagNamespacesRequest, ListTagNamespacesResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListTagNamespacesResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagsResponse> listTags(
            final ListTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>
                    handler) {
        LOG.trace("Called async listTags");
        final ListTagsRequest interceptedRequest = ListTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagsResponse>
                transformer = ListTagsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListTagsRequest, ListTagsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListTagsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupMembershipsResponse> listUserGroupMemberships(
            final ListUserGroupMembershipsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                    handler) {
        LOG.trace("Called async listUserGroupMemberships");
        final ListUserGroupMembershipsRequest interceptedRequest =
                ListUserGroupMembershipsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserGroupMembershipsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
                transformer = ListUserGroupMembershipsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            final ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        LOG.trace("Called async listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer = ListUsersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListUsersRequest, ListUsersResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListUsersResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResponse> removeUserFromGroup(
            final RemoveUserFromGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                    handler) {
        LOG.trace("Called async removeUserFromGroup");
        final RemoveUserFromGroupRequest interceptedRequest =
                RemoveUserFromGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveUserFromGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveUserFromGroupResponse>
                transformer = RemoveUserFromGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            RemoveUserFromGroupRequest, RemoveUserFromGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, RemoveUserFromGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthTokenResponse> updateAuthToken(
            final UpdateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                    handler) {
        LOG.trace("Called async updateAuthToken");
        final UpdateAuthTokenRequest interceptedRequest =
                UpdateAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuthTokenConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuthTokenResponse>
                transformer = UpdateAuthTokenConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateAuthTokenRequest, UpdateAuthTokenResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateAuthTokenRequest, UpdateAuthTokenResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateAuthTokenDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateAuthTokenDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateAuthTokenResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateAuthTokenDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCompartmentResponse> updateCompartment(
            final UpdateCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>
                    handler) {
        LOG.trace("Called async updateCompartment");
        final UpdateCompartmentRequest interceptedRequest =
                UpdateCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCompartmentResponse>
                transformer = UpdateCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateCompartmentRequest, UpdateCompartmentResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateCompartmentRequest, UpdateCompartmentResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateCompartmentDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateCompartmentDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateCompartmentResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateCompartmentDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomerSecretKeyResponse> updateCustomerSecretKey(
            final UpdateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async updateCustomerSecretKey");
        final UpdateCustomerSecretKeyRequest interceptedRequest =
                UpdateCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCustomerSecretKeyResponse>
                transformer = UpdateCustomerSecretKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateCustomerSecretKeyRequest, UpdateCustomerSecretKeyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateCustomerSecretKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateCustomerSecretKeyDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateCustomerSecretKeyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateCustomerSecretKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDynamicGroupResponse> updateDynamicGroup(
            final UpdateDynamicGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                    handler) {
        LOG.trace("Called async updateDynamicGroup");
        final UpdateDynamicGroupRequest interceptedRequest =
                UpdateDynamicGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDynamicGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDynamicGroupResponse>
                transformer = UpdateDynamicGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateDynamicGroupRequest, UpdateDynamicGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateDynamicGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateDynamicGroupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateDynamicGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateDynamicGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            final UpdateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                    handler) {
        LOG.trace("Called async updateGroup");
        final UpdateGroupRequest interceptedRequest =
                UpdateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer = UpdateGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateGroupRequest, UpdateGroupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateGroupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateGroupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateGroupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResponse> updateIdentityProvider(
            final UpdateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async updateIdentityProvider");
        final UpdateIdentityProviderRequest interceptedRequest =
                UpdateIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdentityProviderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIdentityProviderResponse>
                transformer = UpdateIdentityProviderConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateIdentityProviderRequest, UpdateIdentityProviderResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateIdentityProviderDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateIdentityProviderDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateIdentityProviderResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateIdentityProviderDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIdpGroupMappingResponse> updateIdpGroupMapping(
            final UpdateIdpGroupMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                    handler) {
        LOG.trace("Called async updateIdpGroupMapping");
        final UpdateIdpGroupMappingRequest interceptedRequest =
                UpdateIdpGroupMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIdpGroupMappingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateIdpGroupMappingResponse>
                transformer = UpdateIdpGroupMappingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateIdpGroupMappingRequest, UpdateIdpGroupMappingResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateIdpGroupMappingDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateIdpGroupMappingDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateIdpGroupMappingResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateIdpGroupMappingDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePolicyResponse> updatePolicy(
            final UpdatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                    handler) {
        LOG.trace("Called async updatePolicy");
        final UpdatePolicyRequest interceptedRequest =
                UpdatePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyResponse>
                transformer = UpdatePolicyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdatePolicyRequest, UpdatePolicyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdatePolicyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdatePolicyDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdatePolicyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdatePolicyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSmtpCredentialResponse> updateSmtpCredential(
            final UpdateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async updateSmtpCredential");
        final UpdateSmtpCredentialRequest interceptedRequest =
                UpdateSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSmtpCredentialResponse>
                transformer = UpdateSmtpCredentialConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateSmtpCredentialRequest, UpdateSmtpCredentialResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateSmtpCredentialDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateSmtpCredentialDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateSmtpCredentialResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateSmtpCredentialDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSwiftPasswordResponse> updateSwiftPassword(
            final UpdateSwiftPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                    handler) {
        LOG.trace("Called async updateSwiftPassword");
        final UpdateSwiftPasswordRequest interceptedRequest =
                UpdateSwiftPasswordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSwiftPasswordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>
                transformer = UpdateSwiftPasswordConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateSwiftPasswordRequest, UpdateSwiftPasswordResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateSwiftPasswordDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateSwiftPasswordDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateSwiftPasswordResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateSwiftPasswordDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTagResponse> updateTag(
            final UpdateTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse>
                    handler) {
        LOG.trace("Called async updateTag");
        final UpdateTagRequest interceptedRequest = UpdateTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagResponse>
                transformer = UpdateTagConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateTagRequest, UpdateTagResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateTagRequest, UpdateTagResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateTagDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateTagDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateTagResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateTagDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTagNamespaceResponse> updateTagNamespace(
            final UpdateTagNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                    handler) {
        LOG.trace("Called async updateTagNamespace");
        final UpdateTagNamespaceRequest interceptedRequest =
                UpdateTagNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTagNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTagNamespaceResponse>
                transformer = UpdateTagNamespaceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateTagNamespaceRequest, UpdateTagNamespaceResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateTagNamespaceDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateTagNamespaceDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateTagNamespaceResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateTagNamespaceDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResponse> updateUser(
            final UpdateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse>
                    handler) {
        LOG.trace("Called async updateUser");
        final UpdateUserRequest interceptedRequest = UpdateUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserResponse>
                transformer = UpdateUserConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateUserRequest, UpdateUserResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateUserRequest, UpdateUserResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateUserDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateUserDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateUserResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateUserDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserStateResponse> updateUserState(
            final UpdateUserStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserStateRequest, UpdateUserStateResponse>
                    handler) {
        LOG.trace("Called async updateUserState");
        final UpdateUserStateRequest interceptedRequest =
                UpdateUserStateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserStateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserStateResponse>
                transformer = UpdateUserStateConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateUserStateRequest, UpdateUserStateResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateUserStateRequest, UpdateUserStateResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateStateDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateStateDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateUserStateResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateStateDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadApiKeyResponse> uploadApiKey(
            final UploadApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                    handler) {
        LOG.trace("Called async uploadApiKey");
        final UploadApiKeyRequest interceptedRequest =
                UploadApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadApiKeyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UploadApiKeyResponse>
                transformer = UploadApiKeyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UploadApiKeyRequest, UploadApiKeyResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UploadApiKeyRequest, UploadApiKeyResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateApiKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(
                        handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateApiKeyDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UploadApiKeyResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateApiKeyDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }
}
