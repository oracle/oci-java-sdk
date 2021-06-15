/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.internal.http.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Async client implementation for OperationsInsights service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public class OperationsInsightsAsyncClient implements OperationsInsightsAsync {
    /**
     * Service instance for OperationsInsights.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATIONSINSIGHTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operationsinsights.{region}.oci.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public OperationsInsightsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
    public OperationsInsightsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, OperationsInsightsAsyncClient> {
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
        public OperationsInsightsAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new OperationsInsightsAsyncClient(
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
    public java.util.concurrent.Future<ChangeDatabaseInsightCompartmentResponse>
            changeDatabaseInsightCompartment(
                    ChangeDatabaseInsightCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseInsightCompartmentRequest,
                                    ChangeDatabaseInsightCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseInsightCompartment");
        final ChangeDatabaseInsightCompartmentRequest interceptedRequest =
                ChangeDatabaseInsightCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseInsightCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseInsightCompartmentResponse>
                transformer = ChangeDatabaseInsightCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseInsightCompartmentRequest,
                        ChangeDatabaseInsightCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseInsightCompartmentRequest,
                                ChangeDatabaseInsightCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDatabaseInsightCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseInsightCompartmentRequest,
                    ChangeDatabaseInsightCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeEnterpriseManagerBridgeCompartmentResponse>
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                                    ChangeEnterpriseManagerBridgeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeEnterpriseManagerBridgeCompartment");
        final ChangeEnterpriseManagerBridgeCompartmentRequest interceptedRequest =
                ChangeEnterpriseManagerBridgeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeEnterpriseManagerBridgeCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeEnterpriseManagerBridgeCompartmentResponse>
                transformer = ChangeEnterpriseManagerBridgeCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeEnterpriseManagerBridgeCompartmentRequest,
                        ChangeEnterpriseManagerBridgeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeEnterpriseManagerBridgeCompartmentRequest,
                                ChangeEnterpriseManagerBridgeCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeEnterpriseManagerBridgeCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                    ChangeEnterpriseManagerBridgeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeHostInsightCompartmentResponse>
            changeHostInsightCompartment(
                    ChangeHostInsightCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostInsightCompartmentRequest,
                                    ChangeHostInsightCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeHostInsightCompartment");
        final ChangeHostInsightCompartmentRequest interceptedRequest =
                ChangeHostInsightCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeHostInsightCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeHostInsightCompartmentResponse>
                transformer = ChangeHostInsightCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeHostInsightCompartmentRequest, ChangeHostInsightCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeHostInsightCompartmentRequest,
                                ChangeHostInsightCompartmentResponse>,
                        java.util.concurrent.Future<ChangeHostInsightCompartmentResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeHostInsightCompartmentRequest, ChangeHostInsightCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseInsightResponse> createDatabaseInsight(
            CreateDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async createDatabaseInsight");
        final CreateDatabaseInsightRequest interceptedRequest =
                CreateDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDatabaseInsightResponse>
                transformer = CreateDatabaseInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>,
                        java.util.concurrent.Future<CreateDatabaseInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEnterpriseManagerBridgeResponse>
            createEnterpriseManagerBridge(
                    CreateEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateEnterpriseManagerBridgeRequest,
                                    CreateEnterpriseManagerBridgeResponse>
                            handler) {
        LOG.trace("Called async createEnterpriseManagerBridge");
        final CreateEnterpriseManagerBridgeRequest interceptedRequest =
                CreateEnterpriseManagerBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateEnterpriseManagerBridgeResponse>
                transformer = CreateEnterpriseManagerBridgeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateEnterpriseManagerBridgeRequest, CreateEnterpriseManagerBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEnterpriseManagerBridgeRequest,
                                CreateEnterpriseManagerBridgeResponse>,
                        java.util.concurrent.Future<CreateEnterpriseManagerBridgeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEnterpriseManagerBridgeRequest, CreateEnterpriseManagerBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateHostInsightResponse> createHostInsight(
            CreateHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostInsightRequest, CreateHostInsightResponse>
                    handler) {
        LOG.trace("Called async createHostInsight");
        final CreateHostInsightRequest interceptedRequest =
                CreateHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateHostInsightResponse>
                transformer = CreateHostInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateHostInsightRequest, CreateHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateHostInsightRequest, CreateHostInsightResponse>,
                        java.util.concurrent.Future<CreateHostInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateHostInsightRequest, CreateHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseInsightResponse> deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async deleteDatabaseInsight");
        final DeleteDatabaseInsightRequest interceptedRequest =
                DeleteDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseInsightResponse>
                transformer = DeleteDatabaseInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>,
                        java.util.concurrent.Future<DeleteDatabaseInsightResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteEnterpriseManagerBridgeResponse>
            deleteEnterpriseManagerBridge(
                    DeleteEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEnterpriseManagerBridgeRequest,
                                    DeleteEnterpriseManagerBridgeResponse>
                            handler) {
        LOG.trace("Called async deleteEnterpriseManagerBridge");
        final DeleteEnterpriseManagerBridgeRequest interceptedRequest =
                DeleteEnterpriseManagerBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteEnterpriseManagerBridgeResponse>
                transformer = DeleteEnterpriseManagerBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteEnterpriseManagerBridgeRequest, DeleteEnterpriseManagerBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEnterpriseManagerBridgeRequest,
                                DeleteEnterpriseManagerBridgeResponse>,
                        java.util.concurrent.Future<DeleteEnterpriseManagerBridgeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEnterpriseManagerBridgeRequest, DeleteEnterpriseManagerBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHostInsightResponse> deleteHostInsight(
            DeleteHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostInsightRequest, DeleteHostInsightResponse>
                    handler) {
        LOG.trace("Called async deleteHostInsight");
        final DeleteHostInsightRequest interceptedRequest =
                DeleteHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteHostInsightResponse>
                transformer = DeleteHostInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteHostInsightRequest, DeleteHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostInsightRequest, DeleteHostInsightResponse>,
                        java.util.concurrent.Future<DeleteHostInsightResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostInsightRequest, DeleteHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableDatabaseInsightResponse> disableDatabaseInsight(
            DisableDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async disableDatabaseInsight");
        final DisableDatabaseInsightRequest interceptedRequest =
                DisableDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisableDatabaseInsightResponse>
                transformer = DisableDatabaseInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>,
                        java.util.concurrent.Future<DisableDatabaseInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableHostInsightResponse> disableHostInsight(
            DisableHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableHostInsightRequest, DisableHostInsightResponse>
                    handler) {
        LOG.trace("Called async disableHostInsight");
        final DisableHostInsightRequest interceptedRequest =
                DisableHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DisableHostInsightResponse>
                transformer = DisableHostInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DisableHostInsightRequest, DisableHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableHostInsightRequest, DisableHostInsightResponse>,
                        java.util.concurrent.Future<DisableHostInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableHostInsightRequest, DisableHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableDatabaseInsightResponse> enableDatabaseInsight(
            EnableDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async enableDatabaseInsight");
        final EnableDatabaseInsightRequest interceptedRequest =
                EnableDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableDatabaseInsightResponse>
                transformer = EnableDatabaseInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>,
                        java.util.concurrent.Future<EnableDatabaseInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableHostInsightResponse> enableHostInsight(
            EnableHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableHostInsightRequest, EnableHostInsightResponse>
                    handler) {
        LOG.trace("Called async enableHostInsight");
        final EnableHostInsightRequest interceptedRequest =
                EnableHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, EnableHostInsightResponse>
                transformer = EnableHostInsightConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<EnableHostInsightRequest, EnableHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableHostInsightRequest, EnableHostInsightResponse>,
                        java.util.concurrent.Future<EnableHostInsightResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableHostInsightRequest, EnableHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseInsightResponse> getDatabaseInsight(
            GetDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseInsightRequest, GetDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async getDatabaseInsight");
        final GetDatabaseInsightRequest interceptedRequest =
                GetDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDatabaseInsightResponse>
                transformer = GetDatabaseInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseInsightRequest, GetDatabaseInsightResponse>,
                        java.util.concurrent.Future<GetDatabaseInsightResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseInsightRequest, GetDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetEnterpriseManagerBridgeResponse>
            getEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetEnterpriseManagerBridgeRequest,
                                    GetEnterpriseManagerBridgeResponse>
                            handler) {
        LOG.trace("Called async getEnterpriseManagerBridge");
        final GetEnterpriseManagerBridgeRequest interceptedRequest =
                GetEnterpriseManagerBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetEnterpriseManagerBridgeResponse>
                transformer = GetEnterpriseManagerBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEnterpriseManagerBridgeRequest,
                                GetEnterpriseManagerBridgeResponse>,
                        java.util.concurrent.Future<GetEnterpriseManagerBridgeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHostInsightResponse> getHostInsight(
            GetHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHostInsightRequest, GetHostInsightResponse>
                    handler) {
        LOG.trace("Called async getHostInsight");
        final GetHostInsightRequest interceptedRequest =
                GetHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetHostInsightResponse>
                transformer = GetHostInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetHostInsightRequest, GetHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHostInsightRequest, GetHostInsightResponse>,
                        java.util.concurrent.Future<GetHostInsightResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHostInsightRequest, GetHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

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
    public java.util.concurrent.Future<IngestDatabaseConfigurationResponse>
            ingestDatabaseConfiguration(
                    IngestDatabaseConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    IngestDatabaseConfigurationRequest,
                                    IngestDatabaseConfigurationResponse>
                            handler) {
        LOG.trace("Called async ingestDatabaseConfiguration");
        final IngestDatabaseConfigurationRequest interceptedRequest =
                IngestDatabaseConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestDatabaseConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, IngestDatabaseConfigurationResponse>
                transformer = IngestDatabaseConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        IngestDatabaseConfigurationRequest, IngestDatabaseConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestDatabaseConfigurationRequest,
                                IngestDatabaseConfigurationResponse>,
                        java.util.concurrent.Future<IngestDatabaseConfigurationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestDatabaseConfigurationRequest, IngestDatabaseConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestHostConfigurationResponse> ingestHostConfiguration(
            IngestHostConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestHostConfigurationRequest, IngestHostConfigurationResponse>
                    handler) {
        LOG.trace("Called async ingestHostConfiguration");
        final IngestHostConfigurationRequest interceptedRequest =
                IngestHostConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestHostConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, IngestHostConfigurationResponse>
                transformer = IngestHostConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        IngestHostConfigurationRequest, IngestHostConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestHostConfigurationRequest, IngestHostConfigurationResponse>,
                        java.util.concurrent.Future<IngestHostConfigurationResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestHostConfigurationRequest, IngestHostConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestHostMetricsResponse> ingestHostMetrics(
            IngestHostMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestHostMetricsRequest, IngestHostMetricsResponse>
                    handler) {
        LOG.trace("Called async ingestHostMetrics");
        final IngestHostMetricsRequest interceptedRequest =
                IngestHostMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestHostMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, IngestHostMetricsResponse>
                transformer = IngestHostMetricsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<IngestHostMetricsRequest, IngestHostMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestHostMetricsRequest, IngestHostMetricsResponse>,
                        java.util.concurrent.Future<IngestHostMetricsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestHostMetricsRequest, IngestHostMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestSqlBucketResponse> ingestSqlBucket(
            IngestSqlBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlBucketRequest, IngestSqlBucketResponse>
                    handler) {
        LOG.trace("Called async ingestSqlBucket");
        final IngestSqlBucketRequest interceptedRequest =
                IngestSqlBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlBucketResponse>
                transformer = IngestSqlBucketConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<IngestSqlBucketRequest, IngestSqlBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestSqlBucketRequest, IngestSqlBucketResponse>,
                        java.util.concurrent.Future<IngestSqlBucketResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestSqlBucketRequest, IngestSqlBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestSqlPlanLinesResponse> ingestSqlPlanLines(
            IngestSqlPlanLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>
                    handler) {
        LOG.trace("Called async ingestSqlPlanLines");
        final IngestSqlPlanLinesRequest interceptedRequest =
                IngestSqlPlanLinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlPlanLinesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlPlanLinesResponse>
                transformer = IngestSqlPlanLinesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>,
                        java.util.concurrent.Future<IngestSqlPlanLinesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestSqlTextResponse> ingestSqlText(
            IngestSqlTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<IngestSqlTextRequest, IngestSqlTextResponse>
                    handler) {
        LOG.trace("Called async ingestSqlText");
        final IngestSqlTextRequest interceptedRequest =
                IngestSqlTextConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestSqlTextConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, IngestSqlTextResponse>
                transformer = IngestSqlTextConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<IngestSqlTextRequest, IngestSqlTextResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestSqlTextRequest, IngestSqlTextResponse>,
                        java.util.concurrent.Future<IngestSqlTextResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestSqlTextRequest, IngestSqlTextResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseConfigurationsResponse>
            listDatabaseConfigurations(
                    ListDatabaseConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseConfigurationsRequest,
                                    ListDatabaseConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseConfigurations");
        final ListDatabaseConfigurationsRequest interceptedRequest =
                ListDatabaseConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseConfigurationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseConfigurationsResponse>
                transformer = ListDatabaseConfigurationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseConfigurationsRequest,
                                ListDatabaseConfigurationsResponse>,
                        java.util.concurrent.Future<ListDatabaseConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseInsightsResponse> listDatabaseInsights(
            ListDatabaseInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>
                    handler) {
        LOG.trace("Called async listDatabaseInsights");
        final ListDatabaseInsightsRequest interceptedRequest =
                ListDatabaseInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseInsightsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseInsightsResponse>
                transformer = ListDatabaseInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>,
                        java.util.concurrent.Future<ListDatabaseInsightsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEnterpriseManagerBridgesResponse>
            listEnterpriseManagerBridges(
                    ListEnterpriseManagerBridgesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListEnterpriseManagerBridgesRequest,
                                    ListEnterpriseManagerBridgesResponse>
                            handler) {
        LOG.trace("Called async listEnterpriseManagerBridges");
        final ListEnterpriseManagerBridgesRequest interceptedRequest =
                ListEnterpriseManagerBridgesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEnterpriseManagerBridgesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListEnterpriseManagerBridgesResponse>
                transformer = ListEnterpriseManagerBridgesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListEnterpriseManagerBridgesRequest, ListEnterpriseManagerBridgesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEnterpriseManagerBridgesRequest,
                                ListEnterpriseManagerBridgesResponse>,
                        java.util.concurrent.Future<ListEnterpriseManagerBridgesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEnterpriseManagerBridgesRequest, ListEnterpriseManagerBridgesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListHostInsightsResponse> listHostInsights(
            ListHostInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostInsightsRequest, ListHostInsightsResponse>
                    handler) {
        LOG.trace("Called async listHostInsights");
        final ListHostInsightsRequest interceptedRequest =
                ListHostInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostInsightsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListHostInsightsResponse>
                transformer = ListHostInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListHostInsightsRequest, ListHostInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostInsightsRequest, ListHostInsightsResponse>,
                        java.util.concurrent.Future<ListHostInsightsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostInsightsRequest, ListHostInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListHostedEntitiesResponse> listHostedEntities(
            ListHostedEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostedEntitiesRequest, ListHostedEntitiesResponse>
                    handler) {
        LOG.trace("Called async listHostedEntities");
        final ListHostedEntitiesRequest interceptedRequest =
                ListHostedEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostedEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListHostedEntitiesResponse>
                transformer = ListHostedEntitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListHostedEntitiesRequest, ListHostedEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostedEntitiesRequest, ListHostedEntitiesResponse>,
                        java.util.concurrent.Future<ListHostedEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostedEntitiesRequest, ListHostedEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImportableEnterpriseManagerEntitiesResponse>
            listImportableEnterpriseManagerEntities(
                    ListImportableEnterpriseManagerEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableEnterpriseManagerEntitiesRequest,
                                    ListImportableEnterpriseManagerEntitiesResponse>
                            handler) {
        LOG.trace("Called async listImportableEnterpriseManagerEntities");
        final ListImportableEnterpriseManagerEntitiesRequest interceptedRequest =
                ListImportableEnterpriseManagerEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImportableEnterpriseManagerEntitiesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListImportableEnterpriseManagerEntitiesResponse>
                transformer = ListImportableEnterpriseManagerEntitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListImportableEnterpriseManagerEntitiesRequest,
                        ListImportableEnterpriseManagerEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImportableEnterpriseManagerEntitiesRequest,
                                ListImportableEnterpriseManagerEntitiesResponse>,
                        java.util.concurrent.Future<
                                ListImportableEnterpriseManagerEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImportableEnterpriseManagerEntitiesRequest,
                    ListImportableEnterpriseManagerEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlPlansResponse> listSqlPlans(
            ListSqlPlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSqlPlansRequest, ListSqlPlansResponse>
                    handler) {
        LOG.trace("Called async listSqlPlans");
        final ListSqlPlansRequest interceptedRequest =
                ListSqlPlansConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlansConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlPlansResponse>
                transformer = ListSqlPlansConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSqlPlansRequest, ListSqlPlansResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlPlansRequest, ListSqlPlansResponse>,
                        java.util.concurrent.Future<ListSqlPlansResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlPlansRequest, ListSqlPlansResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlSearchesResponse> listSqlSearches(
            ListSqlSearchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlSearchesRequest, ListSqlSearchesResponse>
                    handler) {
        LOG.trace("Called async listSqlSearches");
        final ListSqlSearchesRequest interceptedRequest =
                ListSqlSearchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlSearchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlSearchesResponse>
                transformer = ListSqlSearchesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSqlSearchesRequest, ListSqlSearchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlSearchesRequest, ListSqlSearchesResponse>,
                        java.util.concurrent.Future<ListSqlSearchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlSearchesRequest, ListSqlSearchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlTextsResponse> listSqlTexts(
            ListSqlTextsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSqlTextsRequest, ListSqlTextsResponse>
                    handler) {
        LOG.trace("Called async listSqlTexts");
        final ListSqlTextsRequest interceptedRequest =
                ListSqlTextsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlTextsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSqlTextsResponse>
                transformer = ListSqlTextsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSqlTextsRequest, ListSqlTextsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlTextsRequest, ListSqlTextsResponse>,
                        java.util.concurrent.Future<ListSqlTextsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlTextsRequest, ListSqlTextsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();

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
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();

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
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

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
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceCapacityTrendResponse>
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceCapacityTrendRequest,
                                    SummarizeDatabaseInsightResourceCapacityTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceCapacityTrend");
        final SummarizeDatabaseInsightResourceCapacityTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceCapacityTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceCapacityTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceCapacityTrendResponse>
                transformer = SummarizeDatabaseInsightResourceCapacityTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceCapacityTrendRequest,
                        SummarizeDatabaseInsightResourceCapacityTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceCapacityTrendRequest,
                                SummarizeDatabaseInsightResourceCapacityTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightResourceCapacityTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceCapacityTrendRequest,
                    SummarizeDatabaseInsightResourceCapacityTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceForecastTrendResponse>
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceForecastTrendRequest,
                                    SummarizeDatabaseInsightResourceForecastTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceForecastTrend");
        final SummarizeDatabaseInsightResourceForecastTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceForecastTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceForecastTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceForecastTrendResponse>
                transformer = SummarizeDatabaseInsightResourceForecastTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceForecastTrendRequest,
                        SummarizeDatabaseInsightResourceForecastTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceForecastTrendRequest,
                                SummarizeDatabaseInsightResourceForecastTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightResourceForecastTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceForecastTrendRequest,
                    SummarizeDatabaseInsightResourceForecastTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceStatisticsResponse>
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceStatisticsRequest,
                                    SummarizeDatabaseInsightResourceStatisticsResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceStatistics");
        final SummarizeDatabaseInsightResourceStatisticsRequest interceptedRequest =
                SummarizeDatabaseInsightResourceStatisticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceStatisticsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceStatisticsResponse>
                transformer = SummarizeDatabaseInsightResourceStatisticsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceStatisticsRequest,
                        SummarizeDatabaseInsightResourceStatisticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceStatisticsRequest,
                                SummarizeDatabaseInsightResourceStatisticsResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightResourceStatisticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceStatisticsRequest,
                    SummarizeDatabaseInsightResourceStatisticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageResponse>
            summarizeDatabaseInsightResourceUsage(
                    SummarizeDatabaseInsightResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageRequest,
                                    SummarizeDatabaseInsightResourceUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceUsage");
        final SummarizeDatabaseInsightResourceUsageRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUsageConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeDatabaseInsightResourceUsageResponse>
                transformer = SummarizeDatabaseInsightResourceUsageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceUsageRequest,
                        SummarizeDatabaseInsightResourceUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceUsageRequest,
                                SummarizeDatabaseInsightResourceUsageResponse>,
                        java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceUsageRequest,
                    SummarizeDatabaseInsightResourceUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageTrendResponse>
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageTrendRequest,
                                    SummarizeDatabaseInsightResourceUsageTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceUsageTrend");
        final SummarizeDatabaseInsightResourceUsageTrendRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUsageTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceUsageTrendResponse>
                transformer = SummarizeDatabaseInsightResourceUsageTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceUsageTrendRequest,
                        SummarizeDatabaseInsightResourceUsageTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceUsageTrendRequest,
                                SummarizeDatabaseInsightResourceUsageTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightResourceUsageTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceUsageTrendRequest,
                    SummarizeDatabaseInsightResourceUsageTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightResourceUtilizationInsightResponse>
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                                    SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightResourceUtilizationInsight");
        final SummarizeDatabaseInsightResourceUtilizationInsightRequest interceptedRequest =
                SummarizeDatabaseInsightResourceUtilizationInsightConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightResourceUtilizationInsightConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                transformer =
                        SummarizeDatabaseInsightResourceUtilizationInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                        SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                                SummarizeDatabaseInsightResourceUtilizationInsightResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightResourceUtilizationInsightResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                    SummarizeDatabaseInsightResourceUtilizationInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDatabaseInsightTablespaceUsageTrendResponse>
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                                    SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeDatabaseInsightTablespaceUsageTrend");
        final SummarizeDatabaseInsightTablespaceUsageTrendRequest interceptedRequest =
                SummarizeDatabaseInsightTablespaceUsageTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDatabaseInsightTablespaceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                transformer = SummarizeDatabaseInsightTablespaceUsageTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                        SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                                SummarizeDatabaseInsightTablespaceUsageTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeDatabaseInsightTablespaceUsageTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                    SummarizeDatabaseInsightTablespaceUsageTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceCapacityTrendResponse>
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceCapacityTrendRequest,
                                    SummarizeHostInsightResourceCapacityTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceCapacityTrend");
        final SummarizeHostInsightResourceCapacityTrendRequest interceptedRequest =
                SummarizeHostInsightResourceCapacityTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceCapacityTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceCapacityTrendResponse>
                transformer = SummarizeHostInsightResourceCapacityTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceCapacityTrendRequest,
                        SummarizeHostInsightResourceCapacityTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceCapacityTrendRequest,
                                SummarizeHostInsightResourceCapacityTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeHostInsightResourceCapacityTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceCapacityTrendRequest,
                    SummarizeHostInsightResourceCapacityTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceForecastTrendResponse>
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceForecastTrendRequest,
                                    SummarizeHostInsightResourceForecastTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceForecastTrend");
        final SummarizeHostInsightResourceForecastTrendRequest interceptedRequest =
                SummarizeHostInsightResourceForecastTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceForecastTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceForecastTrendResponse>
                transformer = SummarizeHostInsightResourceForecastTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceForecastTrendRequest,
                        SummarizeHostInsightResourceForecastTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceForecastTrendRequest,
                                SummarizeHostInsightResourceForecastTrendResponse>,
                        java.util.concurrent.Future<
                                SummarizeHostInsightResourceForecastTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceForecastTrendRequest,
                    SummarizeHostInsightResourceForecastTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceStatisticsResponse>
            summarizeHostInsightResourceStatistics(
                    SummarizeHostInsightResourceStatisticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceStatisticsRequest,
                                    SummarizeHostInsightResourceStatisticsResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceStatistics");
        final SummarizeHostInsightResourceStatisticsRequest interceptedRequest =
                SummarizeHostInsightResourceStatisticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceStatisticsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceStatisticsResponse>
                transformer = SummarizeHostInsightResourceStatisticsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceStatisticsRequest,
                        SummarizeHostInsightResourceStatisticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceStatisticsRequest,
                                SummarizeHostInsightResourceStatisticsResponse>,
                        java.util.concurrent.Future<SummarizeHostInsightResourceStatisticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceStatisticsRequest,
                    SummarizeHostInsightResourceStatisticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUsageResponse>
            summarizeHostInsightResourceUsage(
                    SummarizeHostInsightResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageRequest,
                                    SummarizeHostInsightResourceUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceUsage");
        final SummarizeHostInsightResourceUsageRequest interceptedRequest =
                SummarizeHostInsightResourceUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUsageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceUsageResponse>
                transformer = SummarizeHostInsightResourceUsageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceUsageRequest,
                        SummarizeHostInsightResourceUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceUsageRequest,
                                SummarizeHostInsightResourceUsageResponse>,
                        java.util.concurrent.Future<SummarizeHostInsightResourceUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceUsageRequest,
                    SummarizeHostInsightResourceUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUsageTrendResponse>
            summarizeHostInsightResourceUsageTrend(
                    SummarizeHostInsightResourceUsageTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageTrendRequest,
                                    SummarizeHostInsightResourceUsageTrendResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceUsageTrend");
        final SummarizeHostInsightResourceUsageTrendRequest interceptedRequest =
                SummarizeHostInsightResourceUsageTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUsageTrendConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeHostInsightResourceUsageTrendResponse>
                transformer = SummarizeHostInsightResourceUsageTrendConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceUsageTrendRequest,
                        SummarizeHostInsightResourceUsageTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceUsageTrendRequest,
                                SummarizeHostInsightResourceUsageTrendResponse>,
                        java.util.concurrent.Future<SummarizeHostInsightResourceUsageTrendResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceUsageTrendRequest,
                    SummarizeHostInsightResourceUsageTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeHostInsightResourceUtilizationInsightResponse>
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUtilizationInsightRequest,
                                    SummarizeHostInsightResourceUtilizationInsightResponse>
                            handler) {
        LOG.trace("Called async summarizeHostInsightResourceUtilizationInsight");
        final SummarizeHostInsightResourceUtilizationInsightRequest interceptedRequest =
                SummarizeHostInsightResourceUtilizationInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeHostInsightResourceUtilizationInsightConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        SummarizeHostInsightResourceUtilizationInsightResponse>
                transformer =
                        SummarizeHostInsightResourceUtilizationInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeHostInsightResourceUtilizationInsightRequest,
                        SummarizeHostInsightResourceUtilizationInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeHostInsightResourceUtilizationInsightRequest,
                                SummarizeHostInsightResourceUtilizationInsightResponse>,
                        java.util.concurrent.Future<
                                SummarizeHostInsightResourceUtilizationInsightResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeHostInsightResourceUtilizationInsightRequest,
                    SummarizeHostInsightResourceUtilizationInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlInsightsResponse> summarizeSqlInsights(
            SummarizeSqlInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>
                    handler) {
        LOG.trace("Called async summarizeSqlInsights");
        final SummarizeSqlInsightsRequest interceptedRequest =
                SummarizeSqlInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlInsightsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlInsightsResponse>
                transformer = SummarizeSqlInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>,
                        java.util.concurrent.Future<SummarizeSqlInsightsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanInsightsResponse> summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>
                    handler) {
        LOG.trace("Called async summarizeSqlPlanInsights");
        final SummarizeSqlPlanInsightsRequest interceptedRequest =
                SummarizeSqlPlanInsightsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanInsightsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlPlanInsightsResponse>
                transformer = SummarizeSqlPlanInsightsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>,
                        java.util.concurrent.Future<SummarizeSqlPlanInsightsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlResponseTimeDistributionsResponse>
            summarizeSqlResponseTimeDistributions(
                    SummarizeSqlResponseTimeDistributionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlResponseTimeDistributionsRequest,
                                    SummarizeSqlResponseTimeDistributionsResponse>
                            handler) {
        LOG.trace("Called async summarizeSqlResponseTimeDistributions");
        final SummarizeSqlResponseTimeDistributionsRequest interceptedRequest =
                SummarizeSqlResponseTimeDistributionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlResponseTimeDistributionsConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlResponseTimeDistributionsResponse>
                transformer = SummarizeSqlResponseTimeDistributionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlResponseTimeDistributionsRequest,
                        SummarizeSqlResponseTimeDistributionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlResponseTimeDistributionsRequest,
                                SummarizeSqlResponseTimeDistributionsResponse>,
                        java.util.concurrent.Future<SummarizeSqlResponseTimeDistributionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlResponseTimeDistributionsRequest,
                    SummarizeSqlResponseTimeDistributionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsResponse> summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>
                    handler) {
        LOG.trace("Called async summarizeSqlStatistics");
        final SummarizeSqlStatisticsRequest interceptedRequest =
                SummarizeSqlStatisticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlStatisticsResponse>
                transformer = SummarizeSqlStatisticsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>,
                        java.util.concurrent.Future<SummarizeSqlStatisticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesResponse>
            summarizeSqlStatisticsTimeSeries(
                    SummarizeSqlStatisticsTimeSeriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesRequest,
                                    SummarizeSqlStatisticsTimeSeriesResponse>
                            handler) {
        LOG.trace("Called async summarizeSqlStatisticsTimeSeries");
        final SummarizeSqlStatisticsTimeSeriesRequest interceptedRequest =
                SummarizeSqlStatisticsTimeSeriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsTimeSeriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlStatisticsTimeSeriesResponse>
                transformer = SummarizeSqlStatisticsTimeSeriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlStatisticsTimeSeriesRequest,
                        SummarizeSqlStatisticsTimeSeriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlStatisticsTimeSeriesRequest,
                                SummarizeSqlStatisticsTimeSeriesResponse>,
                        java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlStatisticsTimeSeriesRequest,
                    SummarizeSqlStatisticsTimeSeriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesByPlanResponse>
            summarizeSqlStatisticsTimeSeriesByPlan(
                    SummarizeSqlStatisticsTimeSeriesByPlanRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                                    SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                            handler) {
        LOG.trace("Called async summarizeSqlStatisticsTimeSeriesByPlan");
        final SummarizeSqlStatisticsTimeSeriesByPlanRequest interceptedRequest =
                SummarizeSqlStatisticsTimeSeriesByPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlStatisticsTimeSeriesByPlanConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                transformer = SummarizeSqlStatisticsTimeSeriesByPlanConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                        SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                                SummarizeSqlStatisticsTimeSeriesByPlanResponse>,
                        java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesByPlanResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                    SummarizeSqlStatisticsTimeSeriesByPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseInsightResponse> updateDatabaseInsight(
            UpdateDatabaseInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>
                    handler) {
        LOG.trace("Called async updateDatabaseInsight");
        final UpdateDatabaseInsightRequest interceptedRequest =
                UpdateDatabaseInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseInsightResponse>
                transformer = UpdateDatabaseInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>,
                        java.util.concurrent.Future<UpdateDatabaseInsightResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateEnterpriseManagerBridgeResponse>
            updateEnterpriseManagerBridge(
                    UpdateEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEnterpriseManagerBridgeRequest,
                                    UpdateEnterpriseManagerBridgeResponse>
                            handler) {
        LOG.trace("Called async updateEnterpriseManagerBridge");
        final UpdateEnterpriseManagerBridgeRequest interceptedRequest =
                UpdateEnterpriseManagerBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEnterpriseManagerBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateEnterpriseManagerBridgeResponse>
                transformer = UpdateEnterpriseManagerBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateEnterpriseManagerBridgeRequest, UpdateEnterpriseManagerBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateEnterpriseManagerBridgeRequest,
                                UpdateEnterpriseManagerBridgeResponse>,
                        java.util.concurrent.Future<UpdateEnterpriseManagerBridgeResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateEnterpriseManagerBridgeRequest, UpdateEnterpriseManagerBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateHostInsightResponse> updateHostInsight(
            UpdateHostInsightRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostInsightRequest, UpdateHostInsightResponse>
                    handler) {
        LOG.trace("Called async updateHostInsight");
        final UpdateHostInsightRequest interceptedRequest =
                UpdateHostInsightConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHostInsightConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateHostInsightResponse>
                transformer = UpdateHostInsightConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateHostInsightRequest, UpdateHostInsightResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHostInsightRequest, UpdateHostInsightResponse>,
                        java.util.concurrent.Future<UpdateHostInsightResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHostInsightRequest, UpdateHostInsightResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
