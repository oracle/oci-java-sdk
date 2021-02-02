/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.internal.http.*;
import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Async client implementation for CloudGuard service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.extern.slf4j.Slf4j
public class CloudGuardAsyncClient implements CloudGuardAsync {
    /**
     * Service instance for CloudGuard.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CLOUDGUARD")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cloudguard-cp-api.{region}.oci.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public CloudGuardAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CloudGuardAsyncClient> {
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
        public CloudGuardAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new CloudGuardAsyncClient(
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
    public java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>
            changeDetectorRecipeCompartment(
                    ChangeDetectorRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDetectorRecipeCompartmentRequest,
                                    ChangeDetectorRecipeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDetectorRecipeCompartment");
        final ChangeDetectorRecipeCompartmentRequest interceptedRequest =
                ChangeDetectorRecipeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDetectorRecipeCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDetectorRecipeCompartmentResponse>
                transformer = ChangeDetectorRecipeCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDetectorRecipeCompartmentRequest,
                        ChangeDetectorRecipeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDetectorRecipeCompartmentRequest,
                                ChangeDetectorRecipeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDetectorRecipeCompartmentRequest,
                    ChangeDetectorRecipeCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeManagedListCompartmentResponse>
            changeManagedListCompartment(
                    ChangeManagedListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedListCompartmentRequest,
                                    ChangeManagedListCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeManagedListCompartment");
        final ChangeManagedListCompartmentRequest interceptedRequest =
                ChangeManagedListCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedListCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeManagedListCompartmentResponse>
                transformer = ChangeManagedListCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeManagedListCompartmentRequest, ChangeManagedListCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeManagedListCompartmentRequest,
                                ChangeManagedListCompartmentResponse>,
                        java.util.concurrent.Future<ChangeManagedListCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeManagedListCompartmentRequest, ChangeManagedListCompartmentResponse>(
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
    public java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>
            changeResponderRecipeCompartment(
                    ChangeResponderRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeResponderRecipeCompartmentRequest,
                                    ChangeResponderRecipeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeResponderRecipeCompartment");
        final ChangeResponderRecipeCompartmentRequest interceptedRequest =
                ChangeResponderRecipeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeResponderRecipeCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeResponderRecipeCompartmentResponse>
                transformer = ChangeResponderRecipeCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeResponderRecipeCompartmentRequest,
                        ChangeResponderRecipeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeResponderRecipeCompartmentRequest,
                                ChangeResponderRecipeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeResponderRecipeCompartmentRequest,
                    ChangeResponderRecipeCompartmentResponse>(
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
    public java.util.concurrent.Future<CreateDetectorRecipeResponse> createDetectorRecipe(
            CreateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async createDetectorRecipe");
        final CreateDetectorRecipeRequest interceptedRequest =
                CreateDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDetectorRecipeResponse>
                transformer = CreateDetectorRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>,
                        java.util.concurrent.Future<CreateDetectorRecipeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<CreateManagedListResponse> createManagedList(
            CreateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedListRequest, CreateManagedListResponse>
                    handler) {
        LOG.trace("Called async createManagedList");
        final CreateManagedListRequest interceptedRequest =
                CreateManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedListConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateManagedListResponse>
                transformer = CreateManagedListConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateManagedListRequest, CreateManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateManagedListRequest, CreateManagedListResponse>,
                        java.util.concurrent.Future<CreateManagedListResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateManagedListRequest, CreateManagedListResponse>(
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
    public java.util.concurrent.Future<CreateResponderRecipeResponse> createResponderRecipe(
            CreateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async createResponderRecipe");
        final CreateResponderRecipeRequest interceptedRequest =
                CreateResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateResponderRecipeResponse>
                transformer = CreateResponderRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateResponderRecipeRequest, CreateResponderRecipeResponse>,
                        java.util.concurrent.Future<CreateResponderRecipeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateResponderRecipeRequest, CreateResponderRecipeResponse>(
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
    public java.util.concurrent.Future<CreateTargetResponse> createTarget(
            CreateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                    handler) {
        LOG.trace("Called async createTarget");
        final CreateTargetRequest interceptedRequest =
                CreateTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTargetResponse>
                transformer = CreateTargetConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetRequest, CreateTargetResponse>,
                        java.util.concurrent.Future<CreateTargetResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetRequest, CreateTargetResponse>(
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
    public java.util.concurrent.Future<CreateTargetDetectorRecipeResponse>
            createTargetDetectorRecipe(
                    CreateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetDetectorRecipeRequest,
                                    CreateTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async createTargetDetectorRecipe");
        final CreateTargetDetectorRecipeRequest interceptedRequest =
                CreateTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetDetectorRecipeResponse>
                transformer = CreateTargetDetectorRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetDetectorRecipeRequest, CreateTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetDetectorRecipeRequest,
                                CreateTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<CreateTargetDetectorRecipeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetDetectorRecipeRequest, CreateTargetDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<CreateTargetResponderRecipeResponse>
            createTargetResponderRecipe(
                    CreateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetResponderRecipeRequest,
                                    CreateTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async createTargetResponderRecipe");
        final CreateTargetResponderRecipeRequest interceptedRequest =
                CreateTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetResponderRecipeResponse>
                transformer = CreateTargetResponderRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetResponderRecipeRequest, CreateTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetResponderRecipeRequest,
                                CreateTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<CreateTargetResponderRecipeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetResponderRecipeRequest, CreateTargetResponderRecipeResponse>(
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
    public java.util.concurrent.Future<DeleteDetectorRecipeResponse> deleteDetectorRecipe(
            DeleteDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async deleteDetectorRecipe");
        final DeleteDetectorRecipeRequest interceptedRequest =
                DeleteDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDetectorRecipeResponse>
                transformer = DeleteDetectorRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>,
                        java.util.concurrent.Future<DeleteDetectorRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<DeleteManagedListResponse> deleteManagedList(
            DeleteManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedListRequest, DeleteManagedListResponse>
                    handler) {
        LOG.trace("Called async deleteManagedList");
        final DeleteManagedListRequest interceptedRequest =
                DeleteManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedListConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteManagedListResponse>
                transformer = DeleteManagedListConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteManagedListRequest, DeleteManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedListRequest, DeleteManagedListResponse>,
                        java.util.concurrent.Future<DeleteManagedListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedListRequest, DeleteManagedListResponse>(
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
    public java.util.concurrent.Future<DeleteResponderRecipeResponse> deleteResponderRecipe(
            DeleteResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async deleteResponderRecipe");
        final DeleteResponderRecipeRequest interceptedRequest =
                DeleteResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteResponderRecipeResponse>
                transformer = DeleteResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>,
                        java.util.concurrent.Future<DeleteResponderRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>(
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
    public java.util.concurrent.Future<DeleteTargetResponse> deleteTarget(
            DeleteTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                    handler) {
        LOG.trace("Called async deleteTarget");
        final DeleteTargetRequest interceptedRequest =
                DeleteTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTargetResponse>
                transformer = DeleteTargetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetRequest, DeleteTargetResponse>,
                        java.util.concurrent.Future<DeleteTargetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetRequest, DeleteTargetResponse>(
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
    public java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse>
            deleteTargetDetectorRecipe(
                    DeleteTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetDetectorRecipeRequest,
                                    DeleteTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async deleteTargetDetectorRecipe");
        final DeleteTargetDetectorRecipeRequest interceptedRequest =
                DeleteTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetDetectorRecipeResponse>
                transformer = DeleteTargetDetectorRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetDetectorRecipeRequest, DeleteTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetDetectorRecipeRequest,
                                DeleteTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetDetectorRecipeRequest, DeleteTargetDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<DeleteTargetResponderRecipeResponse>
            deleteTargetResponderRecipe(
                    DeleteTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetResponderRecipeRequest,
                                    DeleteTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async deleteTargetResponderRecipe");
        final DeleteTargetResponderRecipeRequest interceptedRequest =
                DeleteTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetResponderRecipeResponse>
                transformer = DeleteTargetResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetResponderRecipeRequest, DeleteTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetResponderRecipeRequest,
                                DeleteTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<DeleteTargetResponderRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetResponderRecipeRequest, DeleteTargetResponderRecipeResponse>(
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
    public java.util.concurrent.Future<ExecuteResponderExecutionResponse> executeResponderExecution(
            ExecuteResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async executeResponderExecution");
        final ExecuteResponderExecutionRequest interceptedRequest =
                ExecuteResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExecuteResponderExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ExecuteResponderExecutionResponse>
                transformer = ExecuteResponderExecutionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExecuteResponderExecutionRequest,
                                ExecuteResponderExecutionResponse>,
                        java.util.concurrent.Future<ExecuteResponderExecutionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>(
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
    public java.util.concurrent.Future<GetConditionMetadataTypeResponse> getConditionMetadataType(
            GetConditionMetadataTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                    handler) {
        LOG.trace("Called async getConditionMetadataType");
        final GetConditionMetadataTypeRequest interceptedRequest =
                GetConditionMetadataTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConditionMetadataTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetConditionMetadataTypeResponse>
                transformer = GetConditionMetadataTypeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>,
                        java.util.concurrent.Future<GetConditionMetadataTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>(
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
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {
        LOG.trace("Called async getConfiguration");
        final GetConfigurationRequest interceptedRequest =
                GetConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetConfigurationResponse>
                transformer = GetConfigurationConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetConfigurationRequest, GetConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConfigurationRequest, GetConfigurationResponse>,
                        java.util.concurrent.Future<GetConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConfigurationRequest, GetConfigurationResponse>(
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
    public java.util.concurrent.Future<GetDetectorResponse> getDetector(
            GetDetectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse>
                    handler) {
        LOG.trace("Called async getDetector");
        final GetDetectorRequest interceptedRequest =
                GetDetectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDetectorResponse>
                transformer = GetDetectorConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRequest, GetDetectorResponse>,
                        java.util.concurrent.Future<GetDetectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRequest, GetDetectorResponse>(
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
    public java.util.concurrent.Future<GetDetectorRecipeResponse> getDetectorRecipe(
            GetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async getDetectorRecipe");
        final GetDetectorRecipeRequest interceptedRequest =
                GetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDetectorRecipeResponse>
                transformer = GetDetectorRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRecipeRequest, GetDetectorRecipeResponse>,
                        java.util.concurrent.Future<GetDetectorRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRecipeRequest, GetDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>
            getDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDetectorRecipeDetectorRuleRequest,
                                    GetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async getDetectorRecipeDetectorRule");
        final GetDetectorRecipeDetectorRuleRequest interceptedRequest =
                GetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDetectorRecipeDetectorRuleResponse>
                transformer = GetDetectorRecipeDetectorRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRecipeDetectorRuleRequest,
                                GetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>(
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
    public java.util.concurrent.Future<GetDetectorRuleResponse> getDetectorRule(
            GetDetectorRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRuleRequest, GetDetectorRuleResponse>
                    handler) {
        LOG.trace("Called async getDetectorRule");
        final GetDetectorRuleRequest interceptedRequest =
                GetDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDetectorRuleResponse>
                transformer = GetDetectorRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDetectorRuleRequest, GetDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRuleRequest, GetDetectorRuleResponse>,
                        java.util.concurrent.Future<GetDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRuleRequest, GetDetectorRuleResponse>(
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
    public java.util.concurrent.Future<GetManagedListResponse> getManagedList(
            GetManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedListRequest, GetManagedListResponse>
                    handler) {
        LOG.trace("Called async getManagedList");
        final GetManagedListRequest interceptedRequest =
                GetManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedListConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetManagedListResponse>
                transformer = GetManagedListConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetManagedListRequest, GetManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedListRequest, GetManagedListResponse>,
                        java.util.concurrent.Future<GetManagedListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedListRequest, GetManagedListResponse>(
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
    public java.util.concurrent.Future<GetProblemResponse> getProblem(
            GetProblemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse>
                    handler) {
        LOG.trace("Called async getProblem");
        final GetProblemRequest interceptedRequest = GetProblemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProblemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetProblemResponse>
                transformer = GetProblemConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProblemRequest, GetProblemResponse>,
                        java.util.concurrent.Future<GetProblemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProblemRequest, GetProblemResponse>(
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
    public java.util.concurrent.Future<GetResponderExecutionResponse> getResponderExecution(
            GetResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderExecutionRequest, GetResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async getResponderExecution");
        final GetResponderExecutionRequest interceptedRequest =
                GetResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetResponderExecutionResponse>
                transformer = GetResponderExecutionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetResponderExecutionRequest, GetResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderExecutionRequest, GetResponderExecutionResponse>,
                        java.util.concurrent.Future<GetResponderExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderExecutionRequest, GetResponderExecutionResponse>(
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
    public java.util.concurrent.Future<GetResponderRecipeResponse> getResponderRecipe(
            GetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRecipeRequest, GetResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async getResponderRecipe");
        final GetResponderRecipeRequest interceptedRequest =
                GetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetResponderRecipeResponse>
                transformer = GetResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetResponderRecipeRequest, GetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRecipeRequest, GetResponderRecipeResponse>,
                        java.util.concurrent.Future<GetResponderRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRecipeRequest, GetResponderRecipeResponse>(
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
    public java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>
            getResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetResponderRecipeResponderRuleRequest,
                                    GetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async getResponderRecipeResponderRule");
        final GetResponderRecipeResponderRuleRequest interceptedRequest =
                GetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRecipeResponderRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetResponderRecipeResponderRuleResponse>
                transformer = GetResponderRecipeResponderRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetResponderRecipeResponderRuleRequest,
                        GetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRecipeResponderRuleRequest,
                                GetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRecipeResponderRuleRequest,
                    GetResponderRecipeResponderRuleResponse>(
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
    public java.util.concurrent.Future<GetResponderRuleResponse> getResponderRule(
            GetResponderRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRuleRequest, GetResponderRuleResponse>
                    handler) {
        LOG.trace("Called async getResponderRule");
        final GetResponderRuleRequest interceptedRequest =
                GetResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetResponderRuleResponse>
                transformer = GetResponderRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetResponderRuleRequest, GetResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRuleRequest, GetResponderRuleResponse>,
                        java.util.concurrent.Future<GetResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRuleRequest, GetResponderRuleResponse>(
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
    public java.util.concurrent.Future<GetTargetResponse> getTarget(
            GetTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse>
                    handler) {
        LOG.trace("Called async getTarget");
        final GetTargetRequest interceptedRequest = GetTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTargetResponse>
                transformer = GetTargetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse>,
                        java.util.concurrent.Future<GetTargetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetRequest, GetTargetResponse>(
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
    public java.util.concurrent.Future<GetTargetDetectorRecipeResponse> getTargetDetectorRecipe(
            GetTargetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async getTargetDetectorRecipe");
        final GetTargetDetectorRecipeRequest interceptedRequest =
                GetTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetDetectorRecipeResponse>
                transformer = GetTargetDetectorRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<GetTargetDetectorRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>
            getTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetDetectorRecipeDetectorRuleRequest,
                                    GetTargetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async getTargetDetectorRecipeDetectorRule");
        final GetTargetDetectorRecipeDetectorRuleRequest interceptedRequest =
                GetTargetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDetectorRecipeDetectorRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetDetectorRecipeDetectorRuleResponse>
                transformer = GetTargetDetectorRecipeDetectorRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetDetectorRecipeDetectorRuleRequest,
                        GetTargetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDetectorRecipeDetectorRuleRequest,
                                GetTargetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>(
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
    public java.util.concurrent.Future<GetTargetResponderRecipeResponse> getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async getTargetResponderRecipe");
        final GetTargetResponderRecipeRequest interceptedRequest =
                GetTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetResponderRecipeResponse>
                transformer = GetTargetResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<GetTargetResponderRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>(
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
    public java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>
            getTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetResponderRecipeResponderRuleRequest,
                                    GetTargetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async getTargetResponderRecipeResponderRule");
        final GetTargetResponderRecipeResponderRuleRequest interceptedRequest =
                GetTargetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetResponderRecipeResponderRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetResponderRecipeResponderRuleResponse>
                transformer = GetTargetResponderRecipeResponderRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetResponderRecipeResponderRuleRequest,
                        GetTargetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetResponderRecipeResponderRuleRequest,
                                GetTargetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>(
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
    public java.util.concurrent.Future<ListConditionMetadataTypesResponse>
            listConditionMetadataTypes(
                    ListConditionMetadataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConditionMetadataTypesRequest,
                                    ListConditionMetadataTypesResponse>
                            handler) {
        LOG.trace("Called async listConditionMetadataTypes");
        final ListConditionMetadataTypesRequest interceptedRequest =
                ListConditionMetadataTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConditionMetadataTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConditionMetadataTypesResponse>
                transformer = ListConditionMetadataTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConditionMetadataTypesRequest,
                                ListConditionMetadataTypesResponse>,
                        java.util.concurrent.Future<ListConditionMetadataTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>(
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
    public java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRules(
                    ListDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDetectorRecipeDetectorRulesRequest,
                                    ListDetectorRecipeDetectorRulesResponse>
                            handler) {
        LOG.trace("Called async listDetectorRecipeDetectorRules");
        final ListDetectorRecipeDetectorRulesRequest interceptedRequest =
                ListDetectorRecipeDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRecipeDetectorRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDetectorRecipeDetectorRulesResponse>
                transformer = ListDetectorRecipeDetectorRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRecipeDetectorRulesRequest,
                                ListDetectorRecipeDetectorRulesResponse>,
                        java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRecipeDetectorRulesRequest,
                    ListDetectorRecipeDetectorRulesResponse>(
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
    public java.util.concurrent.Future<ListDetectorRecipesResponse> listDetectorRecipes(
            ListDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                    handler) {
        LOG.trace("Called async listDetectorRecipes");
        final ListDetectorRecipesRequest interceptedRequest =
                ListDetectorRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRecipesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDetectorRecipesResponse>
                transformer = ListDetectorRecipesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRecipesRequest, ListDetectorRecipesResponse>,
                        java.util.concurrent.Future<ListDetectorRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRecipesRequest, ListDetectorRecipesResponse>(
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
    public java.util.concurrent.Future<ListDetectorRulesResponse> listDetectorRules(
            ListDetectorRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRulesRequest, ListDetectorRulesResponse>
                    handler) {
        LOG.trace("Called async listDetectorRules");
        final ListDetectorRulesRequest interceptedRequest =
                ListDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDetectorRulesResponse>
                transformer = ListDetectorRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDetectorRulesRequest, ListDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRulesRequest, ListDetectorRulesResponse>,
                        java.util.concurrent.Future<ListDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRulesRequest, ListDetectorRulesResponse>(
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
    public java.util.concurrent.Future<ListDetectorsResponse> listDetectors(
            ListDetectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                    handler) {
        LOG.trace("Called async listDetectors");
        final ListDetectorsRequest interceptedRequest =
                ListDetectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDetectorsResponse>
                transformer = ListDetectorsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorsRequest, ListDetectorsResponse>,
                        java.util.concurrent.Future<ListDetectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorsRequest, ListDetectorsResponse>(
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
    public java.util.concurrent.Future<ListImpactedResourcesResponse> listImpactedResources(
            ListImpactedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                    handler) {
        LOG.trace("Called async listImpactedResources");
        final ListImpactedResourcesRequest interceptedRequest =
                ListImpactedResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImpactedResourcesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListImpactedResourcesResponse>
                transformer = ListImpactedResourcesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImpactedResourcesRequest, ListImpactedResourcesResponse>,
                        java.util.concurrent.Future<ListImpactedResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImpactedResourcesRequest, ListImpactedResourcesResponse>(
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
    public java.util.concurrent.Future<ListManagedListTypesResponse> listManagedListTypes(
            ListManagedListTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListTypesRequest, ListManagedListTypesResponse>
                    handler) {
        LOG.trace("Called async listManagedListTypes");
        final ListManagedListTypesRequest interceptedRequest =
                ListManagedListTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedListTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedListTypesResponse>
                transformer = ListManagedListTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedListTypesRequest, ListManagedListTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedListTypesRequest, ListManagedListTypesResponse>,
                        java.util.concurrent.Future<ListManagedListTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedListTypesRequest, ListManagedListTypesResponse>(
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
    public java.util.concurrent.Future<ListManagedListsResponse> listManagedLists(
            ListManagedListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListsRequest, ListManagedListsResponse>
                    handler) {
        LOG.trace("Called async listManagedLists");
        final ListManagedListsRequest interceptedRequest =
                ListManagedListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedListsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListManagedListsResponse>
                transformer = ListManagedListsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListManagedListsRequest, ListManagedListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedListsRequest, ListManagedListsResponse>,
                        java.util.concurrent.Future<ListManagedListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedListsRequest, ListManagedListsResponse>(
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
    public java.util.concurrent.Future<ListProblemHistoriesResponse> listProblemHistories(
            ListProblemHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                    handler) {
        LOG.trace("Called async listProblemHistories");
        final ListProblemHistoriesRequest interceptedRequest =
                ListProblemHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemHistoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListProblemHistoriesResponse>
                transformer = ListProblemHistoriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemHistoriesRequest, ListProblemHistoriesResponse>,
                        java.util.concurrent.Future<ListProblemHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemHistoriesRequest, ListProblemHistoriesResponse>(
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
    public java.util.concurrent.Future<ListProblemsResponse> listProblems(
            ListProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                    handler) {
        LOG.trace("Called async listProblems");
        final ListProblemsRequest interceptedRequest =
                ListProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListProblemsResponse>
                transformer = ListProblemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemsRequest, ListProblemsResponse>,
                        java.util.concurrent.Future<ListProblemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemsRequest, ListProblemsResponse>(
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
    public java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler) {
        LOG.trace("Called async listRecommendations");
        final ListRecommendationsRequest interceptedRequest =
                ListRecommendationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecommendationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListRecommendationsResponse>
                transformer = ListRecommendationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListRecommendationsRequest, ListRecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRecommendationsRequest, ListRecommendationsResponse>,
                        java.util.concurrent.Future<ListRecommendationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRecommendationsRequest, ListRecommendationsResponse>(
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
    public java.util.concurrent.Future<ListResourceTypesResponse> listResourceTypes(
            ListResourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceTypesRequest, ListResourceTypesResponse>
                    handler) {
        LOG.trace("Called async listResourceTypes");
        final ListResourceTypesRequest interceptedRequest =
                ListResourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListResourceTypesResponse>
                transformer = ListResourceTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListResourceTypesRequest, ListResourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceTypesRequest, ListResourceTypesResponse>,
                        java.util.concurrent.Future<ListResourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceTypesRequest, ListResourceTypesResponse>(
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
    public java.util.concurrent.Future<ListResponderActivitiesResponse> listResponderActivities(
            ListResponderActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                    handler) {
        LOG.trace("Called async listResponderActivities");
        final ListResponderActivitiesRequest interceptedRequest =
                ListResponderActivitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderActivitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResponderActivitiesResponse>
                transformer = ListResponderActivitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderActivitiesRequest, ListResponderActivitiesResponse>,
                        java.util.concurrent.Future<ListResponderActivitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderActivitiesRequest, ListResponderActivitiesResponse>(
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
    public java.util.concurrent.Future<ListResponderExecutionsResponse> listResponderExecutions(
            ListResponderExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                    handler) {
        LOG.trace("Called async listResponderExecutions");
        final ListResponderExecutionsRequest interceptedRequest =
                ListResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderExecutionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResponderExecutionsResponse>
                transformer = ListResponderExecutionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderExecutionsRequest, ListResponderExecutionsResponse>,
                        java.util.concurrent.Future<ListResponderExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderExecutionsRequest, ListResponderExecutionsResponse>(
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
    public java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRules(
                    ListResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResponderRecipeResponderRulesRequest,
                                    ListResponderRecipeResponderRulesResponse>
                            handler) {
        LOG.trace("Called async listResponderRecipeResponderRules");
        final ListResponderRecipeResponderRulesRequest interceptedRequest =
                ListResponderRecipeResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRecipeResponderRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResponderRecipeResponderRulesResponse>
                transformer = ListResponderRecipeResponderRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRecipeResponderRulesRequest,
                                ListResponderRecipeResponderRulesResponse>,
                        java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRecipeResponderRulesRequest,
                    ListResponderRecipeResponderRulesResponse>(
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
    public java.util.concurrent.Future<ListResponderRecipesResponse> listResponderRecipes(
            ListResponderRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRecipesRequest, ListResponderRecipesResponse>
                    handler) {
        LOG.trace("Called async listResponderRecipes");
        final ListResponderRecipesRequest interceptedRequest =
                ListResponderRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRecipesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResponderRecipesResponse>
                transformer = ListResponderRecipesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderRecipesRequest, ListResponderRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRecipesRequest, ListResponderRecipesResponse>,
                        java.util.concurrent.Future<ListResponderRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRecipesRequest, ListResponderRecipesResponse>(
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
    public java.util.concurrent.Future<ListResponderRulesResponse> listResponderRules(
            ListResponderRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRulesRequest, ListResponderRulesResponse>
                    handler) {
        LOG.trace("Called async listResponderRules");
        final ListResponderRulesRequest interceptedRequest =
                ListResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListResponderRulesResponse>
                transformer = ListResponderRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListResponderRulesRequest, ListResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRulesRequest, ListResponderRulesResponse>,
                        java.util.concurrent.Future<ListResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRulesRequest, ListResponderRulesResponse>(
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
    public java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRules(
                    ListTargetDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetDetectorRecipeDetectorRulesRequest,
                                    ListTargetDetectorRecipeDetectorRulesResponse>
                            handler) {
        LOG.trace("Called async listTargetDetectorRecipeDetectorRules");
        final ListTargetDetectorRecipeDetectorRulesRequest interceptedRequest =
                ListTargetDetectorRecipeDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDetectorRecipeDetectorRulesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetDetectorRecipeDetectorRulesResponse>
                transformer = ListTargetDetectorRecipeDetectorRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDetectorRecipeDetectorRulesRequest,
                                ListTargetDetectorRecipeDetectorRulesResponse>,
                        java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDetectorRecipeDetectorRulesRequest,
                    ListTargetDetectorRecipeDetectorRulesResponse>(
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
    public java.util.concurrent.Future<ListTargetDetectorRecipesResponse> listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                    handler) {
        LOG.trace("Called async listTargetDetectorRecipes");
        final ListTargetDetectorRecipesRequest interceptedRequest =
                ListTargetDetectorRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDetectorRecipesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetDetectorRecipesResponse>
                transformer = ListTargetDetectorRecipesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDetectorRecipesRequest,
                                ListTargetDetectorRecipesResponse>,
                        java.util.concurrent.Future<ListTargetDetectorRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>(
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
    public java.util.concurrent.Future<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRules(
                    ListTargetResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipeResponderRulesRequest,
                                    ListTargetResponderRecipeResponderRulesResponse>
                            handler) {
        LOG.trace("Called async listTargetResponderRecipeResponderRules");
        final ListTargetResponderRecipeResponderRulesRequest interceptedRequest =
                ListTargetResponderRecipeResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetResponderRecipeResponderRulesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetResponderRecipeResponderRulesResponse>
                transformer = ListTargetResponderRecipeResponderRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetResponderRecipeResponderRulesRequest,
                                ListTargetResponderRecipeResponderRulesResponse>,
                        java.util.concurrent.Future<
                                ListTargetResponderRecipeResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetResponderRecipeResponderRulesRequest,
                    ListTargetResponderRecipeResponderRulesResponse>(
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
    public java.util.concurrent.Future<ListTargetResponderRecipesResponse>
            listTargetResponderRecipes(
                    ListTargetResponderRecipesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipesRequest,
                                    ListTargetResponderRecipesResponse>
                            handler) {
        LOG.trace("Called async listTargetResponderRecipes");
        final ListTargetResponderRecipesRequest interceptedRequest =
                ListTargetResponderRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetResponderRecipesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetResponderRecipesResponse>
                transformer = ListTargetResponderRecipesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetResponderRecipesRequest,
                                ListTargetResponderRecipesResponse>,
                        java.util.concurrent.Future<ListTargetResponderRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>(
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
    public java.util.concurrent.Future<ListTargetsResponse> listTargets(
            ListTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                    handler) {
        LOG.trace("Called async listTargets");
        final ListTargetsRequest interceptedRequest =
                ListTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTargetsResponse>
                transformer = ListTargetsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetsRequest, ListTargetsResponse>,
                        java.util.concurrent.Future<ListTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetsRequest, ListTargetsResponse>(
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
    public java.util.concurrent.Future<RequestRiskScoresResponse> requestRiskScores(
            RequestRiskScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestRiskScoresRequest, RequestRiskScoresResponse>
                    handler) {
        LOG.trace("Called async requestRiskScores");
        final RequestRiskScoresRequest interceptedRequest =
                RequestRiskScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestRiskScoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RequestRiskScoresResponse>
                transformer = RequestRiskScoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<RequestRiskScoresRequest, RequestRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestRiskScoresRequest, RequestRiskScoresResponse>,
                        java.util.concurrent.Future<RequestRiskScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestRiskScoresRequest, RequestRiskScoresResponse>(
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
    public java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>
            requestSecurityScoreSummarizedTrend(
                    RequestSecurityScoreSummarizedTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSecurityScoreSummarizedTrendRequest,
                                    RequestSecurityScoreSummarizedTrendResponse>
                            handler) {
        LOG.trace("Called async requestSecurityScoreSummarizedTrend");
        final RequestSecurityScoreSummarizedTrendRequest interceptedRequest =
                RequestSecurityScoreSummarizedTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSecurityScoreSummarizedTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSecurityScoreSummarizedTrendResponse>
                transformer = RequestSecurityScoreSummarizedTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSecurityScoreSummarizedTrendRequest,
                        RequestSecurityScoreSummarizedTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSecurityScoreSummarizedTrendRequest,
                                RequestSecurityScoreSummarizedTrendResponse>,
                        java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSecurityScoreSummarizedTrendRequest,
                    RequestSecurityScoreSummarizedTrendResponse>(
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
    public java.util.concurrent.Future<RequestSecurityScoresResponse> requestSecurityScores(
            RequestSecurityScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                    handler) {
        LOG.trace("Called async requestSecurityScores");
        final RequestSecurityScoresRequest interceptedRequest =
                RequestSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSecurityScoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSecurityScoresResponse>
                transformer = RequestSecurityScoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSecurityScoresRequest, RequestSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSecurityScoresRequest, RequestSecurityScoresResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>
            requestSummarizedActivityProblems(
                    RequestSummarizedActivityProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedActivityProblemsRequest,
                                    RequestSummarizedActivityProblemsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedActivityProblems");
        final RequestSummarizedActivityProblemsRequest interceptedRequest =
                RequestSummarizedActivityProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedActivityProblemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedActivityProblemsResponse>
                transformer = RequestSummarizedActivityProblemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedActivityProblemsRequest,
                        RequestSummarizedActivityProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedActivityProblemsRequest,
                                RequestSummarizedActivityProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedActivityProblemsRequest,
                    RequestSummarizedActivityProblemsResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedProblemsResponse> requestSummarizedProblems(
            RequestSummarizedProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                    handler) {
        LOG.trace("Called async requestSummarizedProblems");
        final RequestSummarizedProblemsRequest interceptedRequest =
                RequestSummarizedProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedProblemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedProblemsResponse>
                transformer = RequestSummarizedProblemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedProblemsRequest,
                                RequestSummarizedProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>
            requestSummarizedResponderExecutions(
                    RequestSummarizedResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedResponderExecutionsRequest,
                                    RequestSummarizedResponderExecutionsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedResponderExecutions");
        final RequestSummarizedResponderExecutionsRequest interceptedRequest =
                RequestSummarizedResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedResponderExecutionsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedResponderExecutionsResponse>
                transformer = RequestSummarizedResponderExecutionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedResponderExecutionsRequest,
                        RequestSummarizedResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedResponderExecutionsRequest,
                                RequestSummarizedResponderExecutionsResponse>,
                        java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedResponderExecutionsRequest,
                    RequestSummarizedResponderExecutionsResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedRiskScoresResponse>
            requestSummarizedRiskScores(
                    RequestSummarizedRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedRiskScoresRequest,
                                    RequestSummarizedRiskScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedRiskScores");
        final RequestSummarizedRiskScoresRequest interceptedRequest =
                RequestSummarizedRiskScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedRiskScoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedRiskScoresResponse>
                transformer = RequestSummarizedRiskScoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedRiskScoresRequest, RequestSummarizedRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedRiskScoresRequest,
                                RequestSummarizedRiskScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedRiskScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedRiskScoresRequest, RequestSummarizedRiskScoresResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>
            requestSummarizedSecurityScores(
                    RequestSummarizedSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedSecurityScoresRequest,
                                    RequestSummarizedSecurityScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedSecurityScores");
        final RequestSummarizedSecurityScoresRequest interceptedRequest =
                RequestSummarizedSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedSecurityScoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedSecurityScoresResponse>
                transformer = RequestSummarizedSecurityScoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedSecurityScoresRequest,
                        RequestSummarizedSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedSecurityScoresRequest,
                                RequestSummarizedSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedSecurityScoresRequest,
                    RequestSummarizedSecurityScoresResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>
            requestSummarizedTrendProblems(
                    RequestSummarizedTrendProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendProblemsRequest,
                                    RequestSummarizedTrendProblemsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendProblems");
        final RequestSummarizedTrendProblemsRequest interceptedRequest =
                RequestSummarizedTrendProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendProblemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedTrendProblemsResponse>
                transformer = RequestSummarizedTrendProblemsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendProblemsRequest,
                        RequestSummarizedTrendProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendProblemsRequest,
                                RequestSummarizedTrendProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendProblemsRequest, RequestSummarizedTrendProblemsResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedTrendResponderExecutionsResponse>
            requestSummarizedTrendResponderExecutions(
                    RequestSummarizedTrendResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResponderExecutionsRequest,
                                    RequestSummarizedTrendResponderExecutionsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendResponderExecutions");
        final RequestSummarizedTrendResponderExecutionsRequest interceptedRequest =
                RequestSummarizedTrendResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendResponderExecutionsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        RequestSummarizedTrendResponderExecutionsResponse>
                transformer = RequestSummarizedTrendResponderExecutionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendResponderExecutionsRequest,
                        RequestSummarizedTrendResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendResponderExecutionsRequest,
                                RequestSummarizedTrendResponderExecutionsResponse>,
                        java.util.concurrent.Future<
                                RequestSummarizedTrendResponderExecutionsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendResponderExecutionsRequest,
                    RequestSummarizedTrendResponderExecutionsResponse>(
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
    public java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>
            requestSummarizedTrendSecurityScores(
                    RequestSummarizedTrendSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendSecurityScoresRequest,
                                    RequestSummarizedTrendSecurityScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendSecurityScores");
        final RequestSummarizedTrendSecurityScoresRequest interceptedRequest =
                RequestSummarizedTrendSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendSecurityScoresConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RequestSummarizedTrendSecurityScoresResponse>
                transformer = RequestSummarizedTrendSecurityScoresConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendSecurityScoresRequest,
                        RequestSummarizedTrendSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendSecurityScoresRequest,
                                RequestSummarizedTrendSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendSecurityScoresRequest,
                    RequestSummarizedTrendSecurityScoresResponse>(
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
    public java.util.concurrent.Future<SkipBulkResponderExecutionResponse>
            skipBulkResponderExecution(
                    SkipBulkResponderExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SkipBulkResponderExecutionRequest,
                                    SkipBulkResponderExecutionResponse>
                            handler) {
        LOG.trace("Called async skipBulkResponderExecution");
        final SkipBulkResponderExecutionRequest interceptedRequest =
                SkipBulkResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipBulkResponderExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SkipBulkResponderExecutionResponse>
                transformer = SkipBulkResponderExecutionConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SkipBulkResponderExecutionRequest, SkipBulkResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SkipBulkResponderExecutionRequest,
                                SkipBulkResponderExecutionResponse>,
                        java.util.concurrent.Future<SkipBulkResponderExecutionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SkipBulkResponderExecutionRequest, SkipBulkResponderExecutionResponse>(
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
    public java.util.concurrent.Future<SkipResponderExecutionResponse> skipResponderExecution(
            SkipResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async skipResponderExecution");
        final SkipResponderExecutionRequest interceptedRequest =
                SkipResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipResponderExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SkipResponderExecutionResponse>
                transformer = SkipResponderExecutionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SkipResponderExecutionRequest, SkipResponderExecutionResponse>,
                        java.util.concurrent.Future<SkipResponderExecutionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SkipResponderExecutionRequest, SkipResponderExecutionResponse>(
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
    public java.util.concurrent.Future<TriggerResponderResponse> triggerResponder(
            TriggerResponderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TriggerResponderRequest, TriggerResponderResponse>
                    handler) {
        LOG.trace("Called async triggerResponder");
        final TriggerResponderRequest interceptedRequest =
                TriggerResponderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TriggerResponderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TriggerResponderResponse>
                transformer = TriggerResponderConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<TriggerResponderRequest, TriggerResponderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TriggerResponderRequest, TriggerResponderResponse>,
                        java.util.concurrent.Future<TriggerResponderResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TriggerResponderRequest, TriggerResponderResponse>(
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
    public java.util.concurrent.Future<UpdateBulkProblemStatusResponse> updateBulkProblemStatus(
            UpdateBulkProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                    handler) {
        LOG.trace("Called async updateBulkProblemStatus");
        final UpdateBulkProblemStatusRequest interceptedRequest =
                UpdateBulkProblemStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBulkProblemStatusConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateBulkProblemStatusResponse>
                transformer = UpdateBulkProblemStatusConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>,
                        java.util.concurrent.Future<UpdateBulkProblemStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>(
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
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {
        LOG.trace("Called async updateConfiguration");
        final UpdateConfigurationRequest interceptedRequest =
                UpdateConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateConfigurationResponse>
                transformer = UpdateConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateConfigurationRequest, UpdateConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConfigurationRequest, UpdateConfigurationResponse>,
                        java.util.concurrent.Future<UpdateConfigurationResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConfigurationRequest, UpdateConfigurationResponse>(
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
    public java.util.concurrent.Future<UpdateDetectorRecipeResponse> updateDetectorRecipe(
            UpdateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async updateDetectorRecipe");
        final UpdateDetectorRecipeRequest interceptedRequest =
                UpdateDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDetectorRecipeResponse>
                transformer = UpdateDetectorRecipeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>,
                        java.util.concurrent.Future<UpdateDetectorRecipeResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>
            updateDetectorRecipeDetectorRule(
                    UpdateDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDetectorRecipeDetectorRuleRequest,
                                    UpdateDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async updateDetectorRecipeDetectorRule");
        final UpdateDetectorRecipeDetectorRuleRequest interceptedRequest =
                UpdateDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDetectorRecipeDetectorRuleResponse>
                transformer = UpdateDetectorRecipeDetectorRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDetectorRecipeDetectorRuleRequest,
                        UpdateDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDetectorRecipeDetectorRuleRequest,
                                UpdateDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDetectorRecipeDetectorRuleRequest,
                    UpdateDetectorRecipeDetectorRuleResponse>(
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
    public java.util.concurrent.Future<UpdateManagedListResponse> updateManagedList(
            UpdateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedListRequest, UpdateManagedListResponse>
                    handler) {
        LOG.trace("Called async updateManagedList");
        final UpdateManagedListRequest interceptedRequest =
                UpdateManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedListConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateManagedListResponse>
                transformer = UpdateManagedListConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpdateManagedListRequest, UpdateManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedListRequest, UpdateManagedListResponse>,
                        java.util.concurrent.Future<UpdateManagedListResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedListRequest, UpdateManagedListResponse>(
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
    public java.util.concurrent.Future<UpdateProblemStatusResponse> updateProblemStatus(
            UpdateProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                    handler) {
        LOG.trace("Called async updateProblemStatus");
        final UpdateProblemStatusRequest interceptedRequest =
                UpdateProblemStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProblemStatusConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateProblemStatusResponse>
                transformer = UpdateProblemStatusConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProblemStatusRequest, UpdateProblemStatusResponse>,
                        java.util.concurrent.Future<UpdateProblemStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProblemStatusRequest, UpdateProblemStatusResponse>(
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
    public java.util.concurrent.Future<UpdateResponderRecipeResponse> updateResponderRecipe(
            UpdateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async updateResponderRecipe");
        final UpdateResponderRecipeRequest interceptedRequest =
                UpdateResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateResponderRecipeResponse>
                transformer = UpdateResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>,
                        java.util.concurrent.Future<UpdateResponderRecipeResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>(
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
    public java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>
            updateResponderRecipeResponderRule(
                    UpdateResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResponderRecipeResponderRuleRequest,
                                    UpdateResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async updateResponderRecipeResponderRule");
        final UpdateResponderRecipeResponderRuleRequest interceptedRequest =
                UpdateResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResponderRecipeResponderRuleConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateResponderRecipeResponderRuleResponse>
                transformer = UpdateResponderRecipeResponderRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResponderRecipeResponderRuleRequest,
                        UpdateResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResponderRecipeResponderRuleRequest,
                                UpdateResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResponderRecipeResponderRuleRequest,
                    UpdateResponderRecipeResponderRuleResponse>(
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
    public java.util.concurrent.Future<UpdateTargetResponse> updateTarget(
            UpdateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                    handler) {
        LOG.trace("Called async updateTarget");
        final UpdateTargetRequest interceptedRequest =
                UpdateTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTargetResponse>
                transformer = UpdateTargetConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetRequest, UpdateTargetResponse>,
                        java.util.concurrent.Future<UpdateTargetResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetRequest, UpdateTargetResponse>(
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
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse>
            updateTargetDetectorRecipe(
                    UpdateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeRequest,
                                    UpdateTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async updateTargetDetectorRecipe");
        final UpdateTargetDetectorRecipeRequest interceptedRequest =
                UpdateTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetDetectorRecipeResponse>
                transformer = UpdateTargetDetectorRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDetectorRecipeRequest, UpdateTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDetectorRecipeRequest,
                                UpdateTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDetectorRecipeRequest, UpdateTargetDetectorRecipeResponse>(
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
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>
            updateTargetDetectorRecipeDetectorRule(
                    UpdateTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                                    UpdateTargetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async updateTargetDetectorRecipeDetectorRule");
        final UpdateTargetDetectorRecipeDetectorRuleRequest interceptedRequest =
                UpdateTargetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDetectorRecipeDetectorRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetDetectorRecipeDetectorRuleResponse>
                transformer = UpdateTargetDetectorRecipeDetectorRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDetectorRecipeDetectorRuleRequest,
                        UpdateTargetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDetectorRecipeDetectorRuleRequest,
                                UpdateTargetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                    UpdateTargetDetectorRecipeDetectorRuleResponse>(
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
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponse>
            updateTargetResponderRecipe(
                    UpdateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeRequest,
                                    UpdateTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async updateTargetResponderRecipe");
        final UpdateTargetResponderRecipeRequest interceptedRequest =
                UpdateTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetResponderRecipeResponse>
                transformer = UpdateTargetResponderRecipeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetResponderRecipeRequest, UpdateTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetResponderRecipeRequest,
                                UpdateTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<UpdateTargetResponderRecipeResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetResponderRecipeRequest, UpdateTargetResponderRecipeResponse>(
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
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponderRuleResponse>
            updateTargetResponderRecipeResponderRule(
                    UpdateTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeResponderRuleRequest,
                                    UpdateTargetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async updateTargetResponderRecipeResponderRule");
        final UpdateTargetResponderRecipeResponderRuleRequest interceptedRequest =
                UpdateTargetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetResponderRecipeResponderRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetResponderRecipeResponderRuleResponse>
                transformer = UpdateTargetResponderRecipeResponderRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetResponderRecipeResponderRuleRequest,
                        UpdateTargetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetResponderRecipeResponderRuleRequest,
                                UpdateTargetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<
                                UpdateTargetResponderRecipeResponderRuleResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetResponderRecipeResponderRuleRequest,
                    UpdateTargetResponderRecipeResponderRuleResponse>(
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
