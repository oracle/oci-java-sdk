/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.internal.http.*;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * Async client implementation for LogAnalytics service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.extern.slf4j.Slf4j
public class LogAnalyticsAsyncClient implements LogAnalyticsAsync {
    /**
     * Service instance for LogAnalytics.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOGANALYTICS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://loganalytics.{region}.oci.{secondLevelDomain}")
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
    public LogAnalyticsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LogAnalyticsAsyncClient> {
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
        public LogAnalyticsAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new LogAnalyticsAsyncClient(
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
    public java.util.concurrent.Future<AddEntityAssociationResponse> addEntityAssociation(
            AddEntityAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddEntityAssociationRequest, AddEntityAssociationResponse>
                    handler) {
        LOG.trace("Called async addEntityAssociation");
        final AddEntityAssociationRequest interceptedRequest =
                AddEntityAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddEntityAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddEntityAssociationResponse>
                transformer = AddEntityAssociationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        AddEntityAssociationRequest, AddEntityAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddEntityAssociationRequest, AddEntityAssociationResponse>,
                        java.util.concurrent.Future<AddEntityAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddEntityAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddEntityAssociationRequest, AddEntityAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddSourceEventTypesResponse> addSourceEventTypes(
            AddSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddSourceEventTypesRequest, AddSourceEventTypesResponse>
                    handler) {
        LOG.trace("Called async addSourceEventTypes");
        final AddSourceEventTypesRequest interceptedRequest =
                AddSourceEventTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddSourceEventTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddSourceEventTypesResponse>
                transformer = AddSourceEventTypesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        AddSourceEventTypesRequest, AddSourceEventTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddSourceEventTypesRequest, AddSourceEventTypesResponse>,
                        java.util.concurrent.Future<AddSourceEventTypesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddEventTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddSourceEventTypesRequest, AddSourceEventTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AppendLookupDataResponse> appendLookupData(
            AppendLookupDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AppendLookupDataRequest, AppendLookupDataResponse>
                    handler) {
        LOG.trace("Called async appendLookupData");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, AppendLookupDataRequest.builder());
        }
        final AppendLookupDataRequest interceptedRequest =
                AppendLookupDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AppendLookupDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AppendLookupDataResponse>
                transformer = AppendLookupDataConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<AppendLookupDataRequest, AppendLookupDataResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AppendLookupDataRequest, AppendLookupDataResponse>,
                        java.util.concurrent.Future<AppendLookupDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAppendLookupFileBody(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AppendLookupDataRequest, AppendLookupDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getAppendLookupFileBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BatchGetBasicInfoResponse> batchGetBasicInfo(
            BatchGetBasicInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>
                    handler) {
        LOG.trace("Called async batchGetBasicInfo");
        final BatchGetBasicInfoRequest interceptedRequest =
                BatchGetBasicInfoConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BatchGetBasicInfoConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, BatchGetBasicInfoResponse>
                transformer = BatchGetBasicInfoConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>,
                        java.util.concurrent.Future<BatchGetBasicInfoResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBasicDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelQueryWorkRequestResponse> cancelQueryWorkRequest(
            CancelQueryWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>
                    handler) {
        LOG.trace("Called async cancelQueryWorkRequest");
        final CancelQueryWorkRequestRequest interceptedRequest =
                CancelQueryWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelQueryWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CancelQueryWorkRequestResponse>
                transformer = CancelQueryWorkRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>,
                        java.util.concurrent.Future<CancelQueryWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsEmBridgeCompartmentResponse>
            changeLogAnalyticsEmBridgeCompartment(
                    ChangeLogAnalyticsEmBridgeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEmBridgeCompartmentRequest,
                                    ChangeLogAnalyticsEmBridgeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLogAnalyticsEmBridgeCompartment");
        final ChangeLogAnalyticsEmBridgeCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsEmBridgeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsEmBridgeCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsEmBridgeCompartmentResponse>
                transformer = ChangeLogAnalyticsEmBridgeCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLogAnalyticsEmBridgeCompartmentRequest,
                        ChangeLogAnalyticsEmBridgeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLogAnalyticsEmBridgeCompartmentRequest,
                                ChangeLogAnalyticsEmBridgeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLogAnalyticsEmBridgeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeLogAnalyticsEmBridgeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLogAnalyticsEmBridgeCompartmentRequest,
                    ChangeLogAnalyticsEmBridgeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsEntityCompartmentResponse>
            changeLogAnalyticsEntityCompartment(
                    ChangeLogAnalyticsEntityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEntityCompartmentRequest,
                                    ChangeLogAnalyticsEntityCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLogAnalyticsEntityCompartment");
        final ChangeLogAnalyticsEntityCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsEntityCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsEntityCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsEntityCompartmentResponse>
                transformer = ChangeLogAnalyticsEntityCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLogAnalyticsEntityCompartmentRequest,
                        ChangeLogAnalyticsEntityCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLogAnalyticsEntityCompartmentRequest,
                                ChangeLogAnalyticsEntityCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLogAnalyticsEntityCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeLogAnalyticsEntityCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLogAnalyticsEntityCompartmentRequest,
                    ChangeLogAnalyticsEntityCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsLogGroupCompartmentResponse>
            changeLogAnalyticsLogGroupCompartment(
                    ChangeLogAnalyticsLogGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsLogGroupCompartmentRequest,
                                    ChangeLogAnalyticsLogGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLogAnalyticsLogGroupCompartment");
        final ChangeLogAnalyticsLogGroupCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsLogGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsLogGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeLogAnalyticsLogGroupCompartmentResponse>
                transformer = ChangeLogAnalyticsLogGroupCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLogAnalyticsLogGroupCompartmentRequest,
                        ChangeLogAnalyticsLogGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLogAnalyticsLogGroupCompartmentRequest,
                                ChangeLogAnalyticsLogGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLogAnalyticsLogGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeLogAnalyticsLogGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLogAnalyticsLogGroupCompartmentRequest,
                    ChangeLogAnalyticsLogGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLogAnalyticsObjectCollectionRuleCompartment");
        final ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest interceptedRequest =
                ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                transformer =
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                                ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeScheduledTaskCompartmentResponse>
            changeScheduledTaskCompartment(
                    ChangeScheduledTaskCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledTaskCompartmentRequest,
                                    ChangeScheduledTaskCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeScheduledTaskCompartment");
        final ChangeScheduledTaskCompartmentRequest interceptedRequest =
                ChangeScheduledTaskCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeScheduledTaskCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeScheduledTaskCompartmentResponse>
                transformer = ChangeScheduledTaskCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeScheduledTaskCompartmentRequest,
                        ChangeScheduledTaskCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeScheduledTaskCompartmentRequest,
                                ChangeScheduledTaskCompartmentResponse>,
                        java.util.concurrent.Future<ChangeScheduledTaskCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeScheduledTaskCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeScheduledTaskCompartmentRequest, ChangeScheduledTaskCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CleanResponse> clean(
            CleanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CleanRequest, CleanResponse> handler) {
        LOG.trace("Called async clean");
        final CleanRequest interceptedRequest = CleanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CleanConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CleanResponse>
                transformer = CleanConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CleanRequest, CleanResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CleanRequest, CleanResponse>,
                        java.util.concurrent.Future<CleanResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CleanRequest, CleanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompareContentResponse> compareContent(
            CompareContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareContentRequest, CompareContentResponse>
                    handler) {
        LOG.trace("Called async compareContent");
        final CompareContentRequest interceptedRequest =
                CompareContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CompareContentResponse>
                transformer = CompareContentConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<CompareContentRequest, CompareContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompareContentRequest, CompareContentResponse>,
                        java.util.concurrent.Future<CompareContentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompareContentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompareContentRequest, CompareContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEmBridgeResponse>
            createLogAnalyticsEmBridge(
                    CreateLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsEmBridgeRequest,
                                    CreateLogAnalyticsEmBridgeResponse>
                            handler) {
        LOG.trace("Called async createLogAnalyticsEmBridge");
        final CreateLogAnalyticsEmBridgeRequest interceptedRequest =
                CreateLogAnalyticsEmBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsEmBridgeResponse>
                transformer = CreateLogAnalyticsEmBridgeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLogAnalyticsEmBridgeRequest, CreateLogAnalyticsEmBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLogAnalyticsEmBridgeRequest,
                                CreateLogAnalyticsEmBridgeResponse>,
                        java.util.concurrent.Future<CreateLogAnalyticsEmBridgeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLogAnalyticsEmBridgeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLogAnalyticsEmBridgeRequest, CreateLogAnalyticsEmBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEntityResponse> createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>
                    handler) {
        LOG.trace("Called async createLogAnalyticsEntity");
        final CreateLogAnalyticsEntityRequest interceptedRequest =
                CreateLogAnalyticsEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsEntityResponse>
                transformer = CreateLogAnalyticsEntityConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>,
                        java.util.concurrent.Future<CreateLogAnalyticsEntityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLogAnalyticsEntityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEntityTypeResponse>
            createLogAnalyticsEntityType(
                    CreateLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsEntityTypeRequest,
                                    CreateLogAnalyticsEntityTypeResponse>
                            handler) {
        LOG.trace("Called async createLogAnalyticsEntityType");
        final CreateLogAnalyticsEntityTypeRequest interceptedRequest =
                CreateLogAnalyticsEntityTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsEntityTypeResponse>
                transformer = CreateLogAnalyticsEntityTypeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLogAnalyticsEntityTypeRequest, CreateLogAnalyticsEntityTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLogAnalyticsEntityTypeRequest,
                                CreateLogAnalyticsEntityTypeResponse>,
                        java.util.concurrent.Future<CreateLogAnalyticsEntityTypeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLogAnalyticsEntityTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLogAnalyticsEntityTypeRequest, CreateLogAnalyticsEntityTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsLogGroupResponse>
            createLogAnalyticsLogGroup(
                    CreateLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsLogGroupRequest,
                                    CreateLogAnalyticsLogGroupResponse>
                            handler) {
        LOG.trace("Called async createLogAnalyticsLogGroup");
        final CreateLogAnalyticsLogGroupRequest interceptedRequest =
                CreateLogAnalyticsLogGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsLogGroupResponse>
                transformer = CreateLogAnalyticsLogGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLogAnalyticsLogGroupRequest, CreateLogAnalyticsLogGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLogAnalyticsLogGroupRequest,
                                CreateLogAnalyticsLogGroupResponse>,
                        java.util.concurrent.Future<CreateLogAnalyticsLogGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLogAnalyticsLogGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLogAnalyticsLogGroupRequest, CreateLogAnalyticsLogGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsObjectCollectionRuleResponse>
            createLogAnalyticsObjectCollectionRule(
                    CreateLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsObjectCollectionRuleRequest,
                                    CreateLogAnalyticsObjectCollectionRuleResponse>
                            handler) {
        LOG.trace("Called async createLogAnalyticsObjectCollectionRule");
        final CreateLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                CreateLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLogAnalyticsObjectCollectionRuleResponse>
                transformer = CreateLogAnalyticsObjectCollectionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLogAnalyticsObjectCollectionRuleRequest,
                        CreateLogAnalyticsObjectCollectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLogAnalyticsObjectCollectionRuleRequest,
                                CreateLogAnalyticsObjectCollectionRuleResponse>,
                        java.util.concurrent.Future<CreateLogAnalyticsObjectCollectionRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateLogAnalyticsObjectCollectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLogAnalyticsObjectCollectionRuleRequest,
                    CreateLogAnalyticsObjectCollectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledTaskResponse> createScheduledTask(
            CreateScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledTaskRequest, CreateScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async createScheduledTask");
        final CreateScheduledTaskRequest interceptedRequest =
                CreateScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateScheduledTaskResponse>
                transformer = CreateScheduledTaskConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        CreateScheduledTaskRequest, CreateScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateScheduledTaskRequest, CreateScheduledTaskResponse>,
                        java.util.concurrent.Future<CreateScheduledTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateScheduledTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateScheduledTaskRequest, CreateScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationsResponse> deleteAssociations(
            DeleteAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAssociationsRequest, DeleteAssociationsResponse>
                    handler) {
        LOG.trace("Called async deleteAssociations");
        final DeleteAssociationsRequest interceptedRequest =
                DeleteAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAssociationsResponse>
                transformer = DeleteAssociationsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteAssociationsRequest, DeleteAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAssociationsRequest, DeleteAssociationsResponse>,
                        java.util.concurrent.Future<DeleteAssociationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDeleteLogAnalyticsAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAssociationsRequest, DeleteAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldResponse> deleteField(
            DeleteFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFieldRequest, DeleteFieldResponse>
                    handler) {
        LOG.trace("Called async deleteField");
        final DeleteFieldRequest interceptedRequest =
                DeleteFieldConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFieldConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFieldResponse>
                transformer = DeleteFieldConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteFieldRequest, DeleteFieldResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFieldRequest, DeleteFieldResponse>,
                        java.util.concurrent.Future<DeleteFieldResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFieldRequest, DeleteFieldResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResponse> deleteLabel(
            DeleteLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteLabelRequest, DeleteLabelResponse>
                    handler) {
        LOG.trace("Called async deleteLabel");
        final DeleteLabelRequest interceptedRequest =
                DeleteLabelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLabelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteLabelResponse>
                transformer = DeleteLabelConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteLabelRequest, DeleteLabelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLabelRequest, DeleteLabelResponse>,
                        java.util.concurrent.Future<DeleteLabelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLabelRequest, DeleteLabelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEmBridgeResponse>
            deleteLogAnalyticsEmBridge(
                    DeleteLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsEmBridgeRequest,
                                    DeleteLogAnalyticsEmBridgeResponse>
                            handler) {
        LOG.trace("Called async deleteLogAnalyticsEmBridge");
        final DeleteLogAnalyticsEmBridgeRequest interceptedRequest =
                DeleteLogAnalyticsEmBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsEmBridgeResponse>
                transformer = DeleteLogAnalyticsEmBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLogAnalyticsEmBridgeRequest, DeleteLogAnalyticsEmBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLogAnalyticsEmBridgeRequest,
                                DeleteLogAnalyticsEmBridgeResponse>,
                        java.util.concurrent.Future<DeleteLogAnalyticsEmBridgeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLogAnalyticsEmBridgeRequest, DeleteLogAnalyticsEmBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEntityResponse> deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>
                    handler) {
        LOG.trace("Called async deleteLogAnalyticsEntity");
        final DeleteLogAnalyticsEntityRequest interceptedRequest =
                DeleteLogAnalyticsEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsEntityResponse>
                transformer = DeleteLogAnalyticsEntityConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>,
                        java.util.concurrent.Future<DeleteLogAnalyticsEntityResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEntityTypeResponse>
            deleteLogAnalyticsEntityType(
                    DeleteLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsEntityTypeRequest,
                                    DeleteLogAnalyticsEntityTypeResponse>
                            handler) {
        LOG.trace("Called async deleteLogAnalyticsEntityType");
        final DeleteLogAnalyticsEntityTypeRequest interceptedRequest =
                DeleteLogAnalyticsEntityTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsEntityTypeResponse>
                transformer = DeleteLogAnalyticsEntityTypeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLogAnalyticsEntityTypeRequest, DeleteLogAnalyticsEntityTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLogAnalyticsEntityTypeRequest,
                                DeleteLogAnalyticsEntityTypeResponse>,
                        java.util.concurrent.Future<DeleteLogAnalyticsEntityTypeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLogAnalyticsEntityTypeRequest, DeleteLogAnalyticsEntityTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsLogGroupResponse>
            deleteLogAnalyticsLogGroup(
                    DeleteLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsLogGroupRequest,
                                    DeleteLogAnalyticsLogGroupResponse>
                            handler) {
        LOG.trace("Called async deleteLogAnalyticsLogGroup");
        final DeleteLogAnalyticsLogGroupRequest interceptedRequest =
                DeleteLogAnalyticsLogGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsLogGroupResponse>
                transformer = DeleteLogAnalyticsLogGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLogAnalyticsLogGroupRequest, DeleteLogAnalyticsLogGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLogAnalyticsLogGroupRequest,
                                DeleteLogAnalyticsLogGroupResponse>,
                        java.util.concurrent.Future<DeleteLogAnalyticsLogGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLogAnalyticsLogGroupRequest, DeleteLogAnalyticsLogGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsObjectCollectionRuleResponse>
            deleteLogAnalyticsObjectCollectionRule(
                    DeleteLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsObjectCollectionRuleRequest,
                                    DeleteLogAnalyticsObjectCollectionRuleResponse>
                            handler) {
        LOG.trace("Called async deleteLogAnalyticsObjectCollectionRule");
        final DeleteLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                DeleteLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLogAnalyticsObjectCollectionRuleResponse>
                transformer = DeleteLogAnalyticsObjectCollectionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLogAnalyticsObjectCollectionRuleRequest,
                        DeleteLogAnalyticsObjectCollectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLogAnalyticsObjectCollectionRuleRequest,
                                DeleteLogAnalyticsObjectCollectionRuleResponse>,
                        java.util.concurrent.Future<DeleteLogAnalyticsObjectCollectionRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLogAnalyticsObjectCollectionRuleRequest,
                    DeleteLogAnalyticsObjectCollectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLookupResponse> deleteLookup(
            DeleteLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteLookupRequest, DeleteLookupResponse>
                    handler) {
        LOG.trace("Called async deleteLookup");
        final DeleteLookupRequest interceptedRequest =
                DeleteLookupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLookupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteLookupResponse>
                transformer = DeleteLookupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteLookupRequest, DeleteLookupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLookupRequest, DeleteLookupResponse>,
                        java.util.concurrent.Future<DeleteLookupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLookupRequest, DeleteLookupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteParserResponse> deleteParser(
            DeleteParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteParserRequest, DeleteParserResponse>
                    handler) {
        LOG.trace("Called async deleteParser");
        final DeleteParserRequest interceptedRequest =
                DeleteParserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteParserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteParserResponse>
                transformer = DeleteParserConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteParserRequest, DeleteParserResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteParserRequest, DeleteParserResponse>,
                        java.util.concurrent.Future<DeleteParserResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteParserRequest, DeleteParserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledTaskResponse> deleteScheduledTask(
            DeleteScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async deleteScheduledTask");
        final DeleteScheduledTaskRequest interceptedRequest =
                DeleteScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteScheduledTaskResponse>
                transformer = DeleteScheduledTaskConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>,
                        java.util.concurrent.Future<DeleteScheduledTaskResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceResponse> deleteSource(
            DeleteSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSourceRequest, DeleteSourceResponse>
                    handler) {
        LOG.trace("Called async deleteSource");
        final DeleteSourceRequest interceptedRequest =
                DeleteSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSourceResponse>
                transformer = DeleteSourceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<DeleteSourceRequest, DeleteSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSourceRequest, DeleteSourceResponse>,
                        java.util.concurrent.Future<DeleteSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSourceRequest, DeleteSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResponse> deleteUpload(
            DeleteUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUploadRequest, DeleteUploadResponse>
                    handler) {
        LOG.trace("Called async deleteUpload");
        final DeleteUploadRequest interceptedRequest =
                DeleteUploadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUploadResponse>
                transformer = DeleteUploadConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteUploadRequest, DeleteUploadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUploadRequest, DeleteUploadResponse>,
                        java.util.concurrent.Future<DeleteUploadResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUploadRequest, DeleteUploadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadFileResponse> deleteUploadFile(
            DeleteUploadFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUploadFileRequest, DeleteUploadFileResponse>
                    handler) {
        LOG.trace("Called async deleteUploadFile");
        final DeleteUploadFileRequest interceptedRequest =
                DeleteUploadFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUploadFileResponse>
                transformer = DeleteUploadFileConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteUploadFileRequest, DeleteUploadFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUploadFileRequest, DeleteUploadFileResponse>,
                        java.util.concurrent.Future<DeleteUploadFileResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUploadFileRequest, DeleteUploadFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadWarningResponse> deleteUploadWarning(
            DeleteUploadWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUploadWarningRequest, DeleteUploadWarningResponse>
                    handler) {
        LOG.trace("Called async deleteUploadWarning");
        final DeleteUploadWarningRequest interceptedRequest =
                DeleteUploadWarningConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUploadWarningConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteUploadWarningResponse>
                transformer = DeleteUploadWarningConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUploadWarningRequest, DeleteUploadWarningResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUploadWarningRequest, DeleteUploadWarningResponse>,
                        java.util.concurrent.Future<DeleteUploadWarningResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUploadWarningRequest, DeleteUploadWarningResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableArchivingResponse> disableArchiving(
            DisableArchivingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableArchivingRequest, DisableArchivingResponse>
                    handler) {
        LOG.trace("Called async disableArchiving");
        final DisableArchivingRequest interceptedRequest =
                DisableArchivingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableArchivingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DisableArchivingResponse>
                transformer = DisableArchivingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DisableArchivingRequest, DisableArchivingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableArchivingRequest, DisableArchivingResponse>,
                        java.util.concurrent.Future<DisableArchivingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableArchivingRequest, DisableArchivingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableAutoAssociationResponse> disableAutoAssociation(
            DisableAutoAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableAutoAssociationRequest, DisableAutoAssociationResponse>
                    handler) {
        LOG.trace("Called async disableAutoAssociation");
        final DisableAutoAssociationRequest interceptedRequest =
                DisableAutoAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutoAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisableAutoAssociationResponse>
                transformer = DisableAutoAssociationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableAutoAssociationRequest, DisableAutoAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableAutoAssociationRequest, DisableAutoAssociationResponse>,
                        java.util.concurrent.Future<DisableAutoAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableAutoAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableAutoAssociationRequest, DisableAutoAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableSourceEventTypesResponse> disableSourceEventTypes(
            DisableSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>
                    handler) {
        LOG.trace("Called async disableSourceEventTypes");
        final DisableSourceEventTypesRequest interceptedRequest =
                DisableSourceEventTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableSourceEventTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisableSourceEventTypesResponse>
                transformer = DisableSourceEventTypesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>,
                        java.util.concurrent.Future<DisableSourceEventTypesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableEventTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableArchivingResponse> enableArchiving(
            EnableArchivingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableArchivingRequest, EnableArchivingResponse>
                    handler) {
        LOG.trace("Called async enableArchiving");
        final EnableArchivingRequest interceptedRequest =
                EnableArchivingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableArchivingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, EnableArchivingResponse>
                transformer = EnableArchivingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<EnableArchivingRequest, EnableArchivingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableArchivingRequest, EnableArchivingResponse>,
                        java.util.concurrent.Future<EnableArchivingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableArchivingRequest, EnableArchivingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableAutoAssociationResponse> enableAutoAssociation(
            EnableAutoAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableAutoAssociationRequest, EnableAutoAssociationResponse>
                    handler) {
        LOG.trace("Called async enableAutoAssociation");
        final EnableAutoAssociationRequest interceptedRequest =
                EnableAutoAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutoAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableAutoAssociationResponse>
                transformer = EnableAutoAssociationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableAutoAssociationRequest, EnableAutoAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableAutoAssociationRequest, EnableAutoAssociationResponse>,
                        java.util.concurrent.Future<EnableAutoAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableAutoAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableAutoAssociationRequest, EnableAutoAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableSourceEventTypesResponse> enableSourceEventTypes(
            EnableSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>
                    handler) {
        LOG.trace("Called async enableSourceEventTypes");
        final EnableSourceEventTypesRequest interceptedRequest =
                EnableSourceEventTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableSourceEventTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableSourceEventTypesResponse>
                transformer = EnableSourceEventTypesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>,
                        java.util.concurrent.Future<EnableSourceEventTypesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableEventTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EstimatePurgeDataSizeResponse> estimatePurgeDataSize(
            EstimatePurgeDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>
                    handler) {
        LOG.trace("Called async estimatePurgeDataSize");
        final EstimatePurgeDataSizeRequest interceptedRequest =
                EstimatePurgeDataSizeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimatePurgeDataSizeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EstimatePurgeDataSizeResponse>
                transformer = EstimatePurgeDataSizeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>,
                        java.util.concurrent.Future<EstimatePurgeDataSizeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEstimatePurgeDataSizeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EstimateRecallDataSizeResponse> estimateRecallDataSize(
            EstimateRecallDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>
                    handler) {
        LOG.trace("Called async estimateRecallDataSize");
        final EstimateRecallDataSizeRequest interceptedRequest =
                EstimateRecallDataSizeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimateRecallDataSizeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EstimateRecallDataSizeResponse>
                transformer = EstimateRecallDataSizeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>,
                        java.util.concurrent.Future<EstimateRecallDataSizeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEstimateRecallDataSizeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EstimateReleaseDataSizeResponse> estimateReleaseDataSize(
            EstimateReleaseDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>
                    handler) {
        LOG.trace("Called async estimateReleaseDataSize");
        final EstimateReleaseDataSizeRequest interceptedRequest =
                EstimateReleaseDataSizeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EstimateReleaseDataSizeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EstimateReleaseDataSizeResponse>
                transformer = EstimateReleaseDataSizeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>,
                        java.util.concurrent.Future<EstimateReleaseDataSizeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEstimateReleaseDataSizeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportCustomContentResponse> exportCustomContent(
            ExportCustomContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportCustomContentRequest, ExportCustomContentResponse>
                    handler) {
        LOG.trace("Called async exportCustomContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "exportCustomContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final ExportCustomContentRequest interceptedRequest =
                ExportCustomContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportCustomContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ExportCustomContentResponse>
                transformer = ExportCustomContentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ExportCustomContentRequest, ExportCustomContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportCustomContentRequest, ExportCustomContentResponse>,
                        java.util.concurrent.Future<ExportCustomContentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportCustomContentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportCustomContentRequest, ExportCustomContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportQueryResultResponse> exportQueryResult(
            ExportQueryResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportQueryResultRequest, ExportQueryResultResponse>
                    handler) {
        LOG.trace("Called async exportQueryResult");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "exportQueryResult returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final ExportQueryResultRequest interceptedRequest =
                ExportQueryResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportQueryResultConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ExportQueryResultResponse>
                transformer = ExportQueryResultConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ExportQueryResultRequest, ExportQueryResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportQueryResultRequest, ExportQueryResultResponse>,
                        java.util.concurrent.Future<ExportQueryResultResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportQueryResultRequest, ExportQueryResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExtractStructuredLogFieldPathsResponse>
            extractStructuredLogFieldPaths(
                    ExtractStructuredLogFieldPathsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogFieldPathsRequest,
                                    ExtractStructuredLogFieldPathsResponse>
                            handler) {
        LOG.trace("Called async extractStructuredLogFieldPaths");
        final ExtractStructuredLogFieldPathsRequest interceptedRequest =
                ExtractStructuredLogFieldPathsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExtractStructuredLogFieldPathsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ExtractStructuredLogFieldPathsResponse>
                transformer = ExtractStructuredLogFieldPathsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ExtractStructuredLogFieldPathsRequest,
                        ExtractStructuredLogFieldPathsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExtractStructuredLogFieldPathsRequest,
                                ExtractStructuredLogFieldPathsResponse>,
                        java.util.concurrent.Future<ExtractStructuredLogFieldPathsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLoganParserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExtractStructuredLogFieldPathsRequest, ExtractStructuredLogFieldPathsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExtractStructuredLogHeaderPathsResponse>
            extractStructuredLogHeaderPaths(
                    ExtractStructuredLogHeaderPathsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogHeaderPathsRequest,
                                    ExtractStructuredLogHeaderPathsResponse>
                            handler) {
        LOG.trace("Called async extractStructuredLogHeaderPaths");
        final ExtractStructuredLogHeaderPathsRequest interceptedRequest =
                ExtractStructuredLogHeaderPathsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExtractStructuredLogHeaderPathsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ExtractStructuredLogHeaderPathsResponse>
                transformer = ExtractStructuredLogHeaderPathsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ExtractStructuredLogHeaderPathsRequest,
                        ExtractStructuredLogHeaderPathsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExtractStructuredLogHeaderPathsRequest,
                                ExtractStructuredLogHeaderPathsResponse>,
                        java.util.concurrent.Future<ExtractStructuredLogHeaderPathsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLoganParserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExtractStructuredLogHeaderPathsRequest,
                    ExtractStructuredLogHeaderPathsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<FilterResponse> filter(
            FilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<FilterRequest, FilterResponse> handler) {
        LOG.trace("Called async filter");
        final FilterRequest interceptedRequest = FilterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                FilterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, FilterResponse>
                transformer = FilterConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<FilterRequest, FilterResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<FilterRequest, FilterResponse>,
                        java.util.concurrent.Future<FilterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getFilterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    FilterRequest, FilterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAssociationSummaryResponse> getAssociationSummary(
            GetAssociationSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssociationSummaryRequest, GetAssociationSummaryResponse>
                    handler) {
        LOG.trace("Called async getAssociationSummary");
        final GetAssociationSummaryRequest interceptedRequest =
                GetAssociationSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAssociationSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAssociationSummaryResponse>
                transformer = GetAssociationSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetAssociationSummaryRequest, GetAssociationSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAssociationSummaryRequest, GetAssociationSummaryResponse>,
                        java.util.concurrent.Future<GetAssociationSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAssociationSummaryRequest, GetAssociationSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCategoryResponse> getCategory(
            GetCategoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCategoryRequest, GetCategoryResponse>
                    handler) {
        LOG.trace("Called async getCategory");
        final GetCategoryRequest interceptedRequest =
                GetCategoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCategoryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCategoryResponse>
                transformer = GetCategoryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetCategoryRequest, GetCategoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCategoryRequest, GetCategoryResponse>,
                        java.util.concurrent.Future<GetCategoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCategoryRequest, GetCategoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetColumnNamesResponse> getColumnNames(
            GetColumnNamesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetColumnNamesRequest, GetColumnNamesResponse>
                    handler) {
        LOG.trace("Called async getColumnNames");
        final GetColumnNamesRequest interceptedRequest =
                GetColumnNamesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetColumnNamesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetColumnNamesResponse>
                transformer = GetColumnNamesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<GetColumnNamesRequest, GetColumnNamesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetColumnNamesRequest, GetColumnNamesResponse>,
                        java.util.concurrent.Future<GetColumnNamesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetColumnNamesRequest, GetColumnNamesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConfigWorkRequestResponse> getConfigWorkRequest(
            GetConfigWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getConfigWorkRequest");
        final GetConfigWorkRequestRequest interceptedRequest =
                GetConfigWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConfigWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetConfigWorkRequestResponse>
                transformer = GetConfigWorkRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>,
                        java.util.concurrent.Future<GetConfigWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFieldResponse> getField(
            GetFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFieldRequest, GetFieldResponse>
                    handler) {
        LOG.trace("Called async getField");
        final GetFieldRequest interceptedRequest = GetFieldConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFieldConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetFieldResponse>
                transformer = GetFieldConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetFieldRequest, GetFieldResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetFieldRequest, GetFieldResponse>,
                        java.util.concurrent.Future<GetFieldResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFieldRequest, GetFieldResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFieldsSummaryResponse> getFieldsSummary(
            GetFieldsSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFieldsSummaryRequest, GetFieldsSummaryResponse>
                    handler) {
        LOG.trace("Called async getFieldsSummary");
        final GetFieldsSummaryRequest interceptedRequest =
                GetFieldsSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFieldsSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetFieldsSummaryResponse>
                transformer = GetFieldsSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetFieldsSummaryRequest, GetFieldsSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFieldsSummaryRequest, GetFieldsSummaryResponse>,
                        java.util.concurrent.Future<GetFieldsSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFieldsSummaryRequest, GetFieldsSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLabelResponse> getLabel(
            GetLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetLabelRequest, GetLabelResponse>
                    handler) {
        LOG.trace("Called async getLabel");
        final GetLabelRequest interceptedRequest = GetLabelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLabelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetLabelResponse>
                transformer = GetLabelConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetLabelRequest, GetLabelResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetLabelRequest, GetLabelResponse>,
                        java.util.concurrent.Future<GetLabelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLabelRequest, GetLabelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLabelSummaryResponse> getLabelSummary(
            GetLabelSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLabelSummaryRequest, GetLabelSummaryResponse>
                    handler) {
        LOG.trace("Called async getLabelSummary");
        final GetLabelSummaryRequest interceptedRequest =
                GetLabelSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLabelSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetLabelSummaryResponse>
                transformer = GetLabelSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetLabelSummaryRequest, GetLabelSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLabelSummaryRequest, GetLabelSummaryResponse>,
                        java.util.concurrent.Future<GetLabelSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLabelSummaryRequest, GetLabelSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEmBridgeResponse> getLogAnalyticsEmBridge(
            GetLogAnalyticsEmBridgeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
                    handler) {
        LOG.trace("Called async getLogAnalyticsEmBridge");
        final GetLogAnalyticsEmBridgeRequest interceptedRequest =
                GetLogAnalyticsEmBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEmBridgeResponse>
                transformer = GetLogAnalyticsEmBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsEmBridgeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEmBridgeSummaryResponse>
            getLogAnalyticsEmBridgeSummary(
                    GetLogAnalyticsEmBridgeSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEmBridgeSummaryRequest,
                                    GetLogAnalyticsEmBridgeSummaryResponse>
                            handler) {
        LOG.trace("Called async getLogAnalyticsEmBridgeSummary");
        final GetLogAnalyticsEmBridgeSummaryRequest interceptedRequest =
                GetLogAnalyticsEmBridgeSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEmBridgeSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEmBridgeSummaryResponse>
                transformer = GetLogAnalyticsEmBridgeSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsEmBridgeSummaryRequest,
                        GetLogAnalyticsEmBridgeSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsEmBridgeSummaryRequest,
                                GetLogAnalyticsEmBridgeSummaryResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsEmBridgeSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsEmBridgeSummaryRequest, GetLogAnalyticsEmBridgeSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntitiesSummaryResponse>
            getLogAnalyticsEntitiesSummary(
                    GetLogAnalyticsEntitiesSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEntitiesSummaryRequest,
                                    GetLogAnalyticsEntitiesSummaryResponse>
                            handler) {
        LOG.trace("Called async getLogAnalyticsEntitiesSummary");
        final GetLogAnalyticsEntitiesSummaryRequest interceptedRequest =
                GetLogAnalyticsEntitiesSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntitiesSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEntitiesSummaryResponse>
                transformer = GetLogAnalyticsEntitiesSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsEntitiesSummaryRequest,
                        GetLogAnalyticsEntitiesSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsEntitiesSummaryRequest,
                                GetLogAnalyticsEntitiesSummaryResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsEntitiesSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsEntitiesSummaryRequest, GetLogAnalyticsEntitiesSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntityResponse> getLogAnalyticsEntity(
            GetLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
                    handler) {
        LOG.trace("Called async getLogAnalyticsEntity");
        final GetLogAnalyticsEntityRequest interceptedRequest =
                GetLogAnalyticsEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEntityResponse>
                transformer = GetLogAnalyticsEntityConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsEntityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntityTypeResponse> getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
                    handler) {
        LOG.trace("Called async getLogAnalyticsEntityType");
        final GetLogAnalyticsEntityTypeRequest interceptedRequest =
                GetLogAnalyticsEntityTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsEntityTypeResponse>
                transformer = GetLogAnalyticsEntityTypeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsEntityTypeRequest,
                                GetLogAnalyticsEntityTypeResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsEntityTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsLogGroupResponse> getLogAnalyticsLogGroup(
            GetLogAnalyticsLogGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>
                    handler) {
        LOG.trace("Called async getLogAnalyticsLogGroup");
        final GetLogAnalyticsLogGroupRequest interceptedRequest =
                GetLogAnalyticsLogGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsLogGroupResponse>
                transformer = GetLogAnalyticsLogGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsLogGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsLogGroupsSummaryResponse>
            getLogAnalyticsLogGroupsSummary(
                    GetLogAnalyticsLogGroupsSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsLogGroupsSummaryRequest,
                                    GetLogAnalyticsLogGroupsSummaryResponse>
                            handler) {
        LOG.trace("Called async getLogAnalyticsLogGroupsSummary");
        final GetLogAnalyticsLogGroupsSummaryRequest interceptedRequest =
                GetLogAnalyticsLogGroupsSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsLogGroupsSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsLogGroupsSummaryResponse>
                transformer = GetLogAnalyticsLogGroupsSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsLogGroupsSummaryRequest,
                        GetLogAnalyticsLogGroupsSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsLogGroupsSummaryRequest,
                                GetLogAnalyticsLogGroupsSummaryResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsLogGroupsSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsLogGroupsSummaryRequest,
                    GetLogAnalyticsLogGroupsSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsObjectCollectionRuleResponse>
            getLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsObjectCollectionRuleRequest,
                                    GetLogAnalyticsObjectCollectionRuleResponse>
                            handler) {
        LOG.trace("Called async getLogAnalyticsObjectCollectionRule");
        final GetLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                GetLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLogAnalyticsObjectCollectionRuleResponse>
                transformer = GetLogAnalyticsObjectCollectionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetLogAnalyticsObjectCollectionRuleRequest,
                        GetLogAnalyticsObjectCollectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogAnalyticsObjectCollectionRuleRequest,
                                GetLogAnalyticsObjectCollectionRuleResponse>,
                        java.util.concurrent.Future<GetLogAnalyticsObjectCollectionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLogSetsCountResponse> getLogSetsCount(
            GetLogSetsCountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogSetsCountRequest, GetLogSetsCountResponse>
                    handler) {
        LOG.trace("Called async getLogSetsCount");
        final GetLogSetsCountRequest interceptedRequest =
                GetLogSetsCountConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLogSetsCountConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetLogSetsCountResponse>
                transformer = GetLogSetsCountConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetLogSetsCountRequest, GetLogSetsCountResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLogSetsCountRequest, GetLogSetsCountResponse>,
                        java.util.concurrent.Future<GetLogSetsCountResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLogSetsCountRequest, GetLogSetsCountResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLookupResponse> getLookup(
            GetLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetLookupRequest, GetLookupResponse>
                    handler) {
        LOG.trace("Called async getLookup");
        final GetLookupRequest interceptedRequest = GetLookupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLookupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetLookupResponse>
                transformer = GetLookupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetLookupRequest, GetLookupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetLookupRequest, GetLookupResponse>,
                        java.util.concurrent.Future<GetLookupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLookupRequest, GetLookupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLookupSummaryResponse> getLookupSummary(
            GetLookupSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLookupSummaryRequest, GetLookupSummaryResponse>
                    handler) {
        LOG.trace("Called async getLookupSummary");
        final GetLookupSummaryRequest interceptedRequest =
                GetLookupSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLookupSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetLookupSummaryResponse>
                transformer = GetLookupSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetLookupSummaryRequest, GetLookupSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLookupSummaryRequest, GetLookupSummaryResponse>,
                        java.util.concurrent.Future<GetLookupSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLookupSummaryRequest, GetLookupSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {
        LOG.trace("Called async getNamespace");
        final GetNamespaceRequest interceptedRequest =
                GetNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
                transformer = GetNamespaceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNamespaceRequest, GetNamespaceResponse>,
                        java.util.concurrent.Future<GetNamespaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNamespaceRequest, GetNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetParserResponse> getParser(
            GetParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetParserRequest, GetParserResponse>
                    handler) {
        LOG.trace("Called async getParser");
        final GetParserRequest interceptedRequest = GetParserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetParserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetParserResponse>
                transformer = GetParserConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetParserRequest, GetParserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetParserRequest, GetParserResponse>,
                        java.util.concurrent.Future<GetParserResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetParserRequest, GetParserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetParserSummaryResponse> getParserSummary(
            GetParserSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetParserSummaryRequest, GetParserSummaryResponse>
                    handler) {
        LOG.trace("Called async getParserSummary");
        final GetParserSummaryRequest interceptedRequest =
                GetParserSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetParserSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetParserSummaryResponse>
                transformer = GetParserSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetParserSummaryRequest, GetParserSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetParserSummaryRequest, GetParserSummaryResponse>,
                        java.util.concurrent.Future<GetParserSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetParserSummaryRequest, GetParserSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPreferencesResponse> getPreferences(
            GetPreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPreferencesRequest, GetPreferencesResponse>
                    handler) {
        LOG.trace("Called async getPreferences");
        final GetPreferencesRequest interceptedRequest =
                GetPreferencesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreferencesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetPreferencesResponse>
                transformer = GetPreferencesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetPreferencesRequest, GetPreferencesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPreferencesRequest, GetPreferencesResponse>,
                        java.util.concurrent.Future<GetPreferencesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPreferencesRequest, GetPreferencesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultResponse> getQueryResult(
            GetQueryResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQueryResultRequest, GetQueryResultResponse>
                    handler) {
        LOG.trace("Called async getQueryResult");
        final GetQueryResultRequest interceptedRequest =
                GetQueryResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetQueryResultConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetQueryResultResponse>
                transformer = GetQueryResultConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetQueryResultRequest, GetQueryResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetQueryResultRequest, GetQueryResultResponse>,
                        java.util.concurrent.Future<GetQueryResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetQueryResultRequest, GetQueryResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetQueryWorkRequestResponse> getQueryWorkRequest(
            GetQueryWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getQueryWorkRequest");
        final GetQueryWorkRequestRequest interceptedRequest =
                GetQueryWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetQueryWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetQueryWorkRequestResponse>
                transformer = GetQueryWorkRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>,
                        java.util.concurrent.Future<GetQueryWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetScheduledTaskResponse> getScheduledTask(
            GetScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledTaskRequest, GetScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async getScheduledTask");
        final GetScheduledTaskRequest interceptedRequest =
                GetScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetScheduledTaskResponse>
                transformer = GetScheduledTaskConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetScheduledTaskRequest, GetScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduledTaskRequest, GetScheduledTaskResponse>,
                        java.util.concurrent.Future<GetScheduledTaskResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduledTaskRequest, GetScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSourceResponse> getSource(
            GetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse>
                    handler) {
        LOG.trace("Called async getSource");
        final GetSourceRequest interceptedRequest = GetSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSourceResponse>
                transformer = GetSourceConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse>,
                        java.util.concurrent.Future<GetSourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSourceRequest, GetSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSourceSummaryResponse> getSourceSummary(
            GetSourceSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSourceSummaryRequest, GetSourceSummaryResponse>
                    handler) {
        LOG.trace("Called async getSourceSummary");
        final GetSourceSummaryRequest interceptedRequest =
                GetSourceSummaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSourceSummaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSourceSummaryResponse>
                transformer = GetSourceSummaryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetSourceSummaryRequest, GetSourceSummaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSourceSummaryRequest, GetSourceSummaryResponse>,
                        java.util.concurrent.Future<GetSourceSummaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSourceSummaryRequest, GetSourceSummaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStorageResponse> getStorage(
            GetStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStorageRequest, GetStorageResponse>
                    handler) {
        LOG.trace("Called async getStorage");
        final GetStorageRequest interceptedRequest = GetStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetStorageResponse>
                transformer = GetStorageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetStorageRequest, GetStorageResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStorageRequest, GetStorageResponse>,
                        java.util.concurrent.Future<GetStorageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStorageRequest, GetStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStorageUsageResponse> getStorageUsage(
            GetStorageUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStorageUsageRequest, GetStorageUsageResponse>
                    handler) {
        LOG.trace("Called async getStorageUsage");
        final GetStorageUsageRequest interceptedRequest =
                GetStorageUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageUsageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetStorageUsageResponse>
                transformer = GetStorageUsageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetStorageUsageRequest, GetStorageUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStorageUsageRequest, GetStorageUsageResponse>,
                        java.util.concurrent.Future<GetStorageUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStorageUsageRequest, GetStorageUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStorageWorkRequestResponse> getStorageWorkRequest(
            GetStorageWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getStorageWorkRequest");
        final GetStorageWorkRequestRequest interceptedRequest =
                GetStorageWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStorageWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetStorageWorkRequestResponse>
                transformer = GetStorageWorkRequestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>,
                        java.util.concurrent.Future<GetStorageWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUnprocessedDataBucketResponse> getUnprocessedDataBucket(
            GetUnprocessedDataBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>
                    handler) {
        LOG.trace("Called async getUnprocessedDataBucket");
        final GetUnprocessedDataBucketRequest interceptedRequest =
                GetUnprocessedDataBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUnprocessedDataBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUnprocessedDataBucketResponse>
                transformer = GetUnprocessedDataBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>,
                        java.util.concurrent.Future<GetUnprocessedDataBucketResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUploadResponse> getUpload(
            GetUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUploadRequest, GetUploadResponse>
                    handler) {
        LOG.trace("Called async getUpload");
        final GetUploadRequest interceptedRequest = GetUploadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUploadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUploadResponse>
                transformer = GetUploadConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetUploadRequest, GetUploadResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetUploadRequest, GetUploadResponse>,
                        java.util.concurrent.Future<GetUploadResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUploadRequest, GetUploadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
    public java.util.concurrent.Future<ImportCustomContentResponse> importCustomContent(
            ImportCustomContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportCustomContentRequest, ImportCustomContentResponse>
                    handler) {
        LOG.trace("Called async importCustomContent");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, ImportCustomContentRequest.builder());
        }
        final ImportCustomContentRequest interceptedRequest =
                ImportCustomContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportCustomContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ImportCustomContentResponse>
                transformer = ImportCustomContentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ImportCustomContentRequest, ImportCustomContentResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportCustomContentRequest, ImportCustomContentResponse>,
                        java.util.concurrent.Future<ImportCustomContentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportCustomContentFileBody(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportCustomContentRequest, ImportCustomContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getImportCustomContentFileBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAssociableEntitiesResponse> listAssociableEntities(
            ListAssociableEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>
                    handler) {
        LOG.trace("Called async listAssociableEntities");
        final ListAssociableEntitiesRequest interceptedRequest =
                ListAssociableEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociableEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAssociableEntitiesResponse>
                transformer = ListAssociableEntitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>,
                        java.util.concurrent.Future<ListAssociableEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedEntitiesResponse> listAssociatedEntities(
            ListAssociatedEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>
                    handler) {
        LOG.trace("Called async listAssociatedEntities");
        final ListAssociatedEntitiesRequest interceptedRequest =
                ListAssociatedEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociatedEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAssociatedEntitiesResponse>
                transformer = ListAssociatedEntitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>,
                        java.util.concurrent.Future<ListAssociatedEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutoAssociationsResponse> listAutoAssociations(
            ListAutoAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutoAssociationsRequest, ListAutoAssociationsResponse>
                    handler) {
        LOG.trace("Called async listAutoAssociations");
        final ListAutoAssociationsRequest interceptedRequest =
                ListAutoAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutoAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAutoAssociationsResponse>
                transformer = ListAutoAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListAutoAssociationsRequest, ListAutoAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutoAssociationsRequest, ListAutoAssociationsResponse>,
                        java.util.concurrent.Future<ListAutoAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutoAssociationsRequest, ListAutoAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCategoriesRequest, ListCategoriesResponse>
                    handler) {
        LOG.trace("Called async listCategories");
        final ListCategoriesRequest interceptedRequest =
                ListCategoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCategoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCategoriesResponse>
                transformer = ListCategoriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListCategoriesRequest, ListCategoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCategoriesRequest, ListCategoriesResponse>,
                        java.util.concurrent.Future<ListCategoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCategoriesRequest, ListCategoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConfigWorkRequestsResponse> listConfigWorkRequests(
            ListConfigWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listConfigWorkRequests");
        final ListConfigWorkRequestsRequest interceptedRequest =
                ListConfigWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConfigWorkRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConfigWorkRequestsResponse>
                transformer = ListConfigWorkRequestsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>,
                        java.util.concurrent.Future<ListConfigWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEntityAssociationsResponse> listEntityAssociations(
            ListEntityAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntityAssociationsRequest, ListEntityAssociationsResponse>
                    handler) {
        LOG.trace("Called async listEntityAssociations");
        final ListEntityAssociationsRequest interceptedRequest =
                ListEntityAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntityAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListEntityAssociationsResponse>
                transformer = ListEntityAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListEntityAssociationsRequest, ListEntityAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEntityAssociationsRequest, ListEntityAssociationsResponse>,
                        java.util.concurrent.Future<ListEntityAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEntityAssociationsRequest, ListEntityAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEntitySourceAssociationsResponse>
            listEntitySourceAssociations(
                    ListEntitySourceAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListEntitySourceAssociationsRequest,
                                    ListEntitySourceAssociationsResponse>
                            handler) {
        LOG.trace("Called async listEntitySourceAssociations");
        final ListEntitySourceAssociationsRequest interceptedRequest =
                ListEntitySourceAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntitySourceAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListEntitySourceAssociationsResponse>
                transformer = ListEntitySourceAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListEntitySourceAssociationsRequest, ListEntitySourceAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEntitySourceAssociationsRequest,
                                ListEntitySourceAssociationsResponse>,
                        java.util.concurrent.Future<ListEntitySourceAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEntitySourceAssociationsRequest, ListEntitySourceAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFieldsResponse> listFields(
            ListFieldsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFieldsRequest, ListFieldsResponse>
                    handler) {
        LOG.trace("Called async listFields");
        final ListFieldsRequest interceptedRequest = ListFieldsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFieldsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFieldsResponse>
                transformer = ListFieldsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListFieldsRequest, ListFieldsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFieldsRequest, ListFieldsResponse>,
                        java.util.concurrent.Future<ListFieldsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFieldsRequest, ListFieldsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLabelPrioritiesResponse> listLabelPriorities(
            ListLabelPrioritiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>
                    handler) {
        LOG.trace("Called async listLabelPriorities");
        final ListLabelPrioritiesRequest interceptedRequest =
                ListLabelPrioritiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelPrioritiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLabelPrioritiesResponse>
                transformer = ListLabelPrioritiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>,
                        java.util.concurrent.Future<ListLabelPrioritiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLabelSourceDetailsResponse> listLabelSourceDetails(
            ListLabelSourceDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>
                    handler) {
        LOG.trace("Called async listLabelSourceDetails");
        final ListLabelSourceDetailsRequest interceptedRequest =
                ListLabelSourceDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelSourceDetailsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLabelSourceDetailsResponse>
                transformer = ListLabelSourceDetailsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>,
                        java.util.concurrent.Future<ListLabelSourceDetailsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLabelsResponse> listLabels(
            ListLabelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLabelsRequest, ListLabelsResponse>
                    handler) {
        LOG.trace("Called async listLabels");
        final ListLabelsRequest interceptedRequest = ListLabelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLabelsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListLabelsResponse>
                transformer = ListLabelsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListLabelsRequest, ListLabelsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLabelsRequest, ListLabelsResponse>,
                        java.util.concurrent.Future<ListLabelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLabelsRequest, ListLabelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEmBridgesResponse> listLogAnalyticsEmBridges(
            ListLogAnalyticsEmBridgesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>
                    handler) {
        LOG.trace("Called async listLogAnalyticsEmBridges");
        final ListLogAnalyticsEmBridgesRequest interceptedRequest =
                ListLogAnalyticsEmBridgesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEmBridgesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsEmBridgesResponse>
                transformer = ListLogAnalyticsEmBridgesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsEmBridgesRequest,
                                ListLogAnalyticsEmBridgesResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsEmBridgesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntitiesResponse> listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>
                    handler) {
        LOG.trace("Called async listLogAnalyticsEntities");
        final ListLogAnalyticsEntitiesRequest interceptedRequest =
                ListLogAnalyticsEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsEntitiesResponse>
                transformer = ListLogAnalyticsEntitiesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntityTopologyResponse>
            listLogAnalyticsEntityTopology(
                    ListLogAnalyticsEntityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsEntityTopologyRequest,
                                    ListLogAnalyticsEntityTopologyResponse>
                            handler) {
        LOG.trace("Called async listLogAnalyticsEntityTopology");
        final ListLogAnalyticsEntityTopologyRequest interceptedRequest =
                ListLogAnalyticsEntityTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntityTopologyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsEntityTopologyResponse>
                transformer = ListLogAnalyticsEntityTopologyConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsEntityTopologyRequest,
                        ListLogAnalyticsEntityTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsEntityTopologyRequest,
                                ListLogAnalyticsEntityTopologyResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsEntityTopologyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsEntityTopologyRequest, ListLogAnalyticsEntityTopologyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntityTypesResponse>
            listLogAnalyticsEntityTypes(
                    ListLogAnalyticsEntityTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsEntityTypesRequest,
                                    ListLogAnalyticsEntityTypesResponse>
                            handler) {
        LOG.trace("Called async listLogAnalyticsEntityTypes");
        final ListLogAnalyticsEntityTypesRequest interceptedRequest =
                ListLogAnalyticsEntityTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsEntityTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsEntityTypesResponse>
                transformer = ListLogAnalyticsEntityTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsEntityTypesRequest,
                                ListLogAnalyticsEntityTypesResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsEntityTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsLogGroupsResponse> listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>
                    handler) {
        LOG.trace("Called async listLogAnalyticsLogGroups");
        final ListLogAnalyticsLogGroupsRequest interceptedRequest =
                ListLogAnalyticsLogGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsLogGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsLogGroupsResponse>
                transformer = ListLogAnalyticsLogGroupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsLogGroupsRequest,
                                ListLogAnalyticsLogGroupsResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsLogGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsObjectCollectionRulesResponse>
            listLogAnalyticsObjectCollectionRules(
                    ListLogAnalyticsObjectCollectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsObjectCollectionRulesRequest,
                                    ListLogAnalyticsObjectCollectionRulesResponse>
                            handler) {
        LOG.trace("Called async listLogAnalyticsObjectCollectionRules");
        final ListLogAnalyticsObjectCollectionRulesRequest interceptedRequest =
                ListLogAnalyticsObjectCollectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogAnalyticsObjectCollectionRulesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLogAnalyticsObjectCollectionRulesResponse>
                transformer = ListLogAnalyticsObjectCollectionRulesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListLogAnalyticsObjectCollectionRulesRequest,
                        ListLogAnalyticsObjectCollectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogAnalyticsObjectCollectionRulesRequest,
                                ListLogAnalyticsObjectCollectionRulesResponse>,
                        java.util.concurrent.Future<ListLogAnalyticsObjectCollectionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogAnalyticsObjectCollectionRulesRequest,
                    ListLogAnalyticsObjectCollectionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLogSetsResponse> listLogSets(
            ListLogSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLogSetsRequest, ListLogSetsResponse>
                    handler) {
        LOG.trace("Called async listLogSets");
        final ListLogSetsRequest interceptedRequest =
                ListLogSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLogSetsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListLogSetsResponse>
                transformer = ListLogSetsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListLogSetsRequest, ListLogSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLogSetsRequest, ListLogSetsResponse>,
                        java.util.concurrent.Future<ListLogSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLogSetsRequest, ListLogSetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLookupsResponse> listLookups(
            ListLookupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLookupsRequest, ListLookupsResponse>
                    handler) {
        LOG.trace("Called async listLookups");
        final ListLookupsRequest interceptedRequest =
                ListLookupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLookupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListLookupsResponse>
                transformer = ListLookupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListLookupsRequest, ListLookupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLookupsRequest, ListLookupsResponse>,
                        java.util.concurrent.Future<ListLookupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLookupsRequest, ListLookupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMetaSourceTypesResponse> listMetaSourceTypes(
            ListMetaSourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>
                    handler) {
        LOG.trace("Called async listMetaSourceTypes");
        final ListMetaSourceTypesRequest interceptedRequest =
                ListMetaSourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMetaSourceTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMetaSourceTypesResponse>
                transformer = ListMetaSourceTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>,
                        java.util.concurrent.Future<ListMetaSourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNamespacesRequest, ListNamespacesResponse>
                    handler) {
        LOG.trace("Called async listNamespaces");
        final ListNamespacesRequest interceptedRequest =
                ListNamespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNamespacesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListNamespacesResponse>
                transformer = ListNamespacesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListNamespacesRequest, ListNamespacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNamespacesRequest, ListNamespacesResponse>,
                        java.util.concurrent.Future<ListNamespacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNamespacesRequest, ListNamespacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListParserFunctionsResponse> listParserFunctions(
            ListParserFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListParserFunctionsRequest, ListParserFunctionsResponse>
                    handler) {
        LOG.trace("Called async listParserFunctions");
        final ListParserFunctionsRequest interceptedRequest =
                ListParserFunctionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParserFunctionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListParserFunctionsResponse>
                transformer = ListParserFunctionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListParserFunctionsRequest, ListParserFunctionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListParserFunctionsRequest, ListParserFunctionsResponse>,
                        java.util.concurrent.Future<ListParserFunctionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListParserFunctionsRequest, ListParserFunctionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListParserMetaPluginsResponse> listParserMetaPlugins(
            ListParserMetaPluginsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>
                    handler) {
        LOG.trace("Called async listParserMetaPlugins");
        final ListParserMetaPluginsRequest interceptedRequest =
                ListParserMetaPluginsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParserMetaPluginsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListParserMetaPluginsResponse>
                transformer = ListParserMetaPluginsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>,
                        java.util.concurrent.Future<ListParserMetaPluginsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListParsersResponse> listParsers(
            ListParsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListParsersRequest, ListParsersResponse>
                    handler) {
        LOG.trace("Called async listParsers");
        final ListParsersRequest interceptedRequest =
                ListParsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListParsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListParsersResponse>
                transformer = ListParsersConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListParsersRequest, ListParsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListParsersRequest, ListParsersResponse>,
                        java.util.concurrent.Future<ListParsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListParsersRequest, ListParsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListQueryWorkRequestsResponse> listQueryWorkRequests(
            ListQueryWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listQueryWorkRequests");
        final ListQueryWorkRequestsRequest interceptedRequest =
                ListQueryWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListQueryWorkRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListQueryWorkRequestsResponse>
                transformer = ListQueryWorkRequestsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>,
                        java.util.concurrent.Future<ListQueryWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRecalledDataResponse> listRecalledData(
            ListRecalledDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecalledDataRequest, ListRecalledDataResponse>
                    handler) {
        LOG.trace("Called async listRecalledData");
        final ListRecalledDataRequest interceptedRequest =
                ListRecalledDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecalledDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRecalledDataResponse>
                transformer = ListRecalledDataConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListRecalledDataRequest, ListRecalledDataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRecalledDataRequest, ListRecalledDataResponse>,
                        java.util.concurrent.Future<ListRecalledDataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRecalledDataRequest, ListRecalledDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceCategoriesResponse> listResourceCategories(
            ListResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceCategoriesRequest, ListResourceCategoriesResponse>
                    handler) {
        LOG.trace("Called async listResourceCategories");
        final ListResourceCategoriesRequest interceptedRequest =
                ListResourceCategoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceCategoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListResourceCategoriesResponse>
                transformer = ListResourceCategoriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceCategoriesRequest, ListResourceCategoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceCategoriesRequest, ListResourceCategoriesResponse>,
                        java.util.concurrent.Future<ListResourceCategoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceCategoriesRequest, ListResourceCategoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListScheduledTasksResponse> listScheduledTasks(
            ListScheduledTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledTasksRequest, ListScheduledTasksResponse>
                    handler) {
        LOG.trace("Called async listScheduledTasks");
        final ListScheduledTasksRequest interceptedRequest =
                ListScheduledTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledTasksConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListScheduledTasksResponse>
                transformer = ListScheduledTasksConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListScheduledTasksRequest, ListScheduledTasksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScheduledTasksRequest, ListScheduledTasksResponse>,
                        java.util.concurrent.Future<ListScheduledTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScheduledTasksRequest, ListScheduledTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourceAssociationsResponse> listSourceAssociations(
            ListSourceAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceAssociationsRequest, ListSourceAssociationsResponse>
                    handler) {
        LOG.trace("Called async listSourceAssociations");
        final ListSourceAssociationsRequest interceptedRequest =
                ListSourceAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSourceAssociationsResponse>
                transformer = ListSourceAssociationsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSourceAssociationsRequest, ListSourceAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourceAssociationsRequest, ListSourceAssociationsResponse>,
                        java.util.concurrent.Future<ListSourceAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourceAssociationsRequest, ListSourceAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourceEventTypesResponse> listSourceEventTypes(
            ListSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceEventTypesRequest, ListSourceEventTypesResponse>
                    handler) {
        LOG.trace("Called async listSourceEventTypes");
        final ListSourceEventTypesRequest interceptedRequest =
                ListSourceEventTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceEventTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSourceEventTypesResponse>
                transformer = ListSourceEventTypesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSourceEventTypesRequest, ListSourceEventTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourceEventTypesRequest, ListSourceEventTypesResponse>,
                        java.util.concurrent.Future<ListSourceEventTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourceEventTypesRequest, ListSourceEventTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourceExtendedFieldDefinitionsResponse>
            listSourceExtendedFieldDefinitions(
                    ListSourceExtendedFieldDefinitionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSourceExtendedFieldDefinitionsRequest,
                                    ListSourceExtendedFieldDefinitionsResponse>
                            handler) {
        LOG.trace("Called async listSourceExtendedFieldDefinitions");
        final ListSourceExtendedFieldDefinitionsRequest interceptedRequest =
                ListSourceExtendedFieldDefinitionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceExtendedFieldDefinitionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSourceExtendedFieldDefinitionsResponse>
                transformer = ListSourceExtendedFieldDefinitionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSourceExtendedFieldDefinitionsRequest,
                        ListSourceExtendedFieldDefinitionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourceExtendedFieldDefinitionsRequest,
                                ListSourceExtendedFieldDefinitionsResponse>,
                        java.util.concurrent.Future<ListSourceExtendedFieldDefinitionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourceExtendedFieldDefinitionsRequest,
                    ListSourceExtendedFieldDefinitionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourceLabelOperatorsResponse> listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>
                    handler) {
        LOG.trace("Called async listSourceLabelOperators");
        final ListSourceLabelOperatorsRequest interceptedRequest =
                ListSourceLabelOperatorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceLabelOperatorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSourceLabelOperatorsResponse>
                transformer = ListSourceLabelOperatorsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>,
                        java.util.concurrent.Future<ListSourceLabelOperatorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourceMetaFunctionsResponse> listSourceMetaFunctions(
            ListSourceMetaFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>
                    handler) {
        LOG.trace("Called async listSourceMetaFunctions");
        final ListSourceMetaFunctionsRequest interceptedRequest =
                ListSourceMetaFunctionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourceMetaFunctionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSourceMetaFunctionsResponse>
                transformer = ListSourceMetaFunctionsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>,
                        java.util.concurrent.Future<ListSourceMetaFunctionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourcePatternsResponse> listSourcePatterns(
            ListSourcePatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourcePatternsRequest, ListSourcePatternsResponse>
                    handler) {
        LOG.trace("Called async listSourcePatterns");
        final ListSourcePatternsRequest interceptedRequest =
                ListSourcePatternsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourcePatternsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSourcePatternsResponse>
                transformer = ListSourcePatternsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSourcePatternsRequest, ListSourcePatternsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourcePatternsRequest, ListSourcePatternsResponse>,
                        java.util.concurrent.Future<ListSourcePatternsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourcePatternsRequest, ListSourcePatternsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSourcesResponse> listSources(
            ListSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSourcesRequest, ListSourcesResponse>
                    handler) {
        LOG.trace("Called async listSources");
        final ListSourcesRequest interceptedRequest =
                ListSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSourcesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSourcesResponse>
                transformer = ListSourcesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListSourcesRequest, ListSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSourcesRequest, ListSourcesResponse>,
                        java.util.concurrent.Future<ListSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSourcesRequest, ListSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStorageWorkRequestErrorsResponse>
            listStorageWorkRequestErrors(
                    ListStorageWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStorageWorkRequestErrorsRequest,
                                    ListStorageWorkRequestErrorsResponse>
                            handler) {
        LOG.trace("Called async listStorageWorkRequestErrors");
        final ListStorageWorkRequestErrorsRequest interceptedRequest =
                ListStorageWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStorageWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListStorageWorkRequestErrorsResponse>
                transformer = ListStorageWorkRequestErrorsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListStorageWorkRequestErrorsRequest, ListStorageWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStorageWorkRequestErrorsRequest,
                                ListStorageWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListStorageWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStorageWorkRequestErrorsRequest, ListStorageWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStorageWorkRequestsResponse> listStorageWorkRequests(
            ListStorageWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listStorageWorkRequests");
        final ListStorageWorkRequestsRequest interceptedRequest =
                ListStorageWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStorageWorkRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListStorageWorkRequestsResponse>
                transformer = ListStorageWorkRequestsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>,
                        java.util.concurrent.Future<ListStorageWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSupportedCharEncodingsResponse>
            listSupportedCharEncodings(
                    ListSupportedCharEncodingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSupportedCharEncodingsRequest,
                                    ListSupportedCharEncodingsResponse>
                            handler) {
        LOG.trace("Called async listSupportedCharEncodings");
        final ListSupportedCharEncodingsRequest interceptedRequest =
                ListSupportedCharEncodingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSupportedCharEncodingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSupportedCharEncodingsResponse>
                transformer = ListSupportedCharEncodingsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSupportedCharEncodingsRequest, ListSupportedCharEncodingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSupportedCharEncodingsRequest,
                                ListSupportedCharEncodingsResponse>,
                        java.util.concurrent.Future<ListSupportedCharEncodingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSupportedCharEncodingsRequest, ListSupportedCharEncodingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSupportedTimezonesResponse> listSupportedTimezones(
            ListSupportedTimezonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>
                    handler) {
        LOG.trace("Called async listSupportedTimezones");
        final ListSupportedTimezonesRequest interceptedRequest =
                ListSupportedTimezonesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSupportedTimezonesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSupportedTimezonesResponse>
                transformer = ListSupportedTimezonesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>,
                        java.util.concurrent.Future<ListSupportedTimezonesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUploadFilesResponse> listUploadFiles(
            ListUploadFilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUploadFilesRequest, ListUploadFilesResponse>
                    handler) {
        LOG.trace("Called async listUploadFiles");
        final ListUploadFilesRequest interceptedRequest =
                ListUploadFilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadFilesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUploadFilesResponse>
                transformer = ListUploadFilesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListUploadFilesRequest, ListUploadFilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUploadFilesRequest, ListUploadFilesResponse>,
                        java.util.concurrent.Future<ListUploadFilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUploadFilesRequest, ListUploadFilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUploadWarningsResponse> listUploadWarnings(
            ListUploadWarningsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUploadWarningsRequest, ListUploadWarningsResponse>
                    handler) {
        LOG.trace("Called async listUploadWarnings");
        final ListUploadWarningsRequest interceptedRequest =
                ListUploadWarningsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadWarningsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUploadWarningsResponse>
                transformer = ListUploadWarningsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListUploadWarningsRequest, ListUploadWarningsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUploadWarningsRequest, ListUploadWarningsResponse>,
                        java.util.concurrent.Future<ListUploadWarningsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUploadWarningsRequest, ListUploadWarningsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResponse> listUploads(
            ListUploadsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUploadsRequest, ListUploadsResponse>
                    handler) {
        LOG.trace("Called async listUploads");
        final ListUploadsRequest interceptedRequest =
                ListUploadsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUploadsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUploadsResponse>
                transformer = ListUploadsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListUploadsRequest, ListUploadsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUploadsRequest, ListUploadsResponse>,
                        java.util.concurrent.Future<ListUploadsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUploadsRequest, ListUploadsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWarningsResponse> listWarnings(
            ListWarningsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWarningsRequest, ListWarningsResponse>
                    handler) {
        LOG.trace("Called async listWarnings");
        final ListWarningsRequest interceptedRequest =
                ListWarningsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWarningsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWarningsResponse>
                transformer = ListWarningsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListWarningsRequest, ListWarningsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWarningsRequest, ListWarningsResponse>,
                        java.util.concurrent.Future<ListWarningsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWarningsRequest, ListWarningsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
    public java.util.concurrent.Future<OffboardNamespaceResponse> offboardNamespace(
            OffboardNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            OffboardNamespaceRequest, OffboardNamespaceResponse>
                    handler) {
        LOG.trace("Called async offboardNamespace");
        final OffboardNamespaceRequest interceptedRequest =
                OffboardNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                OffboardNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, OffboardNamespaceResponse>
                transformer = OffboardNamespaceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<OffboardNamespaceRequest, OffboardNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                OffboardNamespaceRequest, OffboardNamespaceResponse>,
                        java.util.concurrent.Future<OffboardNamespaceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    OffboardNamespaceRequest, OffboardNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<OnboardNamespaceResponse> onboardNamespace(
            OnboardNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            OnboardNamespaceRequest, OnboardNamespaceResponse>
                    handler) {
        LOG.trace("Called async onboardNamespace");
        final OnboardNamespaceRequest interceptedRequest =
                OnboardNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                OnboardNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, OnboardNamespaceResponse>
                transformer = OnboardNamespaceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<OnboardNamespaceRequest, OnboardNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                OnboardNamespaceRequest, OnboardNamespaceResponse>,
                        java.util.concurrent.Future<OnboardNamespaceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    OnboardNamespaceRequest, OnboardNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ParseQueryResponse> parseQuery(
            ParseQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ParseQueryRequest, ParseQueryResponse>
                    handler) {
        LOG.trace("Called async parseQuery");
        final ParseQueryRequest interceptedRequest = ParseQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ParseQueryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ParseQueryResponse>
                transformer = ParseQueryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ParseQueryRequest, ParseQueryResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ParseQueryRequest, ParseQueryResponse>,
                        java.util.concurrent.Future<ParseQueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getParseQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ParseQueryRequest, ParseQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PauseScheduledTaskResponse> pauseScheduledTask(
            PauseScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PauseScheduledTaskRequest, PauseScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async pauseScheduledTask");
        final PauseScheduledTaskRequest interceptedRequest =
                PauseScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PauseScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PauseScheduledTaskResponse>
                transformer = PauseScheduledTaskConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<PauseScheduledTaskRequest, PauseScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PauseScheduledTaskRequest, PauseScheduledTaskResponse>,
                        java.util.concurrent.Future<PauseScheduledTaskResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PauseScheduledTaskRequest, PauseScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PurgeStorageDataResponse> purgeStorageData(
            PurgeStorageDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PurgeStorageDataRequest, PurgeStorageDataResponse>
                    handler) {
        LOG.trace("Called async purgeStorageData");
        final PurgeStorageDataRequest interceptedRequest =
                PurgeStorageDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeStorageDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PurgeStorageDataResponse>
                transformer = PurgeStorageDataConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<PurgeStorageDataRequest, PurgeStorageDataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PurgeStorageDataRequest, PurgeStorageDataResponse>,
                        java.util.concurrent.Future<PurgeStorageDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPurgeStorageDataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PurgeStorageDataRequest, PurgeStorageDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PutQueryWorkRequestBackgroundResponse>
            putQueryWorkRequestBackground(
                    PutQueryWorkRequestBackgroundRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutQueryWorkRequestBackgroundRequest,
                                    PutQueryWorkRequestBackgroundResponse>
                            handler) {
        LOG.trace("Called async putQueryWorkRequestBackground");
        final PutQueryWorkRequestBackgroundRequest interceptedRequest =
                PutQueryWorkRequestBackgroundConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutQueryWorkRequestBackgroundConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PutQueryWorkRequestBackgroundResponse>
                transformer = PutQueryWorkRequestBackgroundConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        PutQueryWorkRequestBackgroundRequest, PutQueryWorkRequestBackgroundResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutQueryWorkRequestBackgroundRequest,
                                PutQueryWorkRequestBackgroundResponse>,
                        java.util.concurrent.Future<PutQueryWorkRequestBackgroundResponse>>
                futureSupplier = client.putFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutQueryWorkRequestBackgroundRequest, PutQueryWorkRequestBackgroundResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<QueryResponse> query(
            QueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handler) {
        LOG.trace("Called async query");
        final QueryRequest interceptedRequest = QueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                QueryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, QueryResponse>
                transformer = QueryConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse>,
                        java.util.concurrent.Future<QueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    QueryRequest, QueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecallArchivedDataResponse> recallArchivedData(
            RecallArchivedDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecallArchivedDataRequest, RecallArchivedDataResponse>
                    handler) {
        LOG.trace("Called async recallArchivedData");
        final RecallArchivedDataRequest interceptedRequest =
                RecallArchivedDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecallArchivedDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RecallArchivedDataResponse>
                transformer = RecallArchivedDataConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RecallArchivedDataRequest, RecallArchivedDataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecallArchivedDataRequest, RecallArchivedDataResponse>,
                        java.util.concurrent.Future<RecallArchivedDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRecallArchivedDataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecallArchivedDataRequest, RecallArchivedDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RegisterLookupResponse> registerLookup(
            RegisterLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RegisterLookupRequest, RegisterLookupResponse>
                    handler) {
        LOG.trace("Called async registerLookup");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, RegisterLookupRequest.builder());
        }
        final RegisterLookupRequest interceptedRequest =
                RegisterLookupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RegisterLookupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RegisterLookupResponse>
                transformer = RegisterLookupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RegisterLookupRequest, RegisterLookupResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RegisterLookupRequest, RegisterLookupResponse>,
                        java.util.concurrent.Future<RegisterLookupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRegisterLookupContentFileBody(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RegisterLookupRequest, RegisterLookupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getRegisterLookupContentFileBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ReleaseRecalledDataResponse> releaseRecalledData(
            ReleaseRecalledDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>
                    handler) {
        LOG.trace("Called async releaseRecalledData");
        final ReleaseRecalledDataRequest interceptedRequest =
                ReleaseRecalledDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReleaseRecalledDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ReleaseRecalledDataResponse>
                transformer = ReleaseRecalledDataConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>,
                        java.util.concurrent.Future<ReleaseRecalledDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getReleaseRecalledDataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveEntityAssociationsResponse> removeEntityAssociations(
            RemoveEntityAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>
                    handler) {
        LOG.trace("Called async removeEntityAssociations");
        final RemoveEntityAssociationsRequest interceptedRequest =
                RemoveEntityAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveEntityAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveEntityAssociationsResponse>
                transformer = RemoveEntityAssociationsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>,
                        java.util.concurrent.Future<RemoveEntityAssociationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveEntityAssociationsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemovePreferencesResponse> removePreferences(
            RemovePreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemovePreferencesRequest, RemovePreferencesResponse>
                    handler) {
        LOG.trace("Called async removePreferences");
        final RemovePreferencesRequest interceptedRequest =
                RemovePreferencesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePreferencesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RemovePreferencesResponse>
                transformer = RemovePreferencesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RemovePreferencesRequest, RemovePreferencesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemovePreferencesRequest, RemovePreferencesResponse>,
                        java.util.concurrent.Future<RemovePreferencesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemovePreferencesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemovePreferencesRequest, RemovePreferencesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveResourceCategoriesResponse> removeResourceCategories(
            RemoveResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>
                    handler) {
        LOG.trace("Called async removeResourceCategories");
        final RemoveResourceCategoriesRequest interceptedRequest =
                RemoveResourceCategoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveResourceCategoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveResourceCategoriesResponse>
                transformer = RemoveResourceCategoriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>,
                        java.util.concurrent.Future<RemoveResourceCategoriesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceCategoriesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveSourceEventTypesResponse> removeSourceEventTypes(
            RemoveSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>
                    handler) {
        LOG.trace("Called async removeSourceEventTypes");
        final RemoveSourceEventTypesRequest interceptedRequest =
                RemoveSourceEventTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveSourceEventTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveSourceEventTypesResponse>
                transformer = RemoveSourceEventTypesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>,
                        java.util.concurrent.Future<RemoveSourceEventTypesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveEventTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeScheduledTaskResponse> resumeScheduledTask(
            ResumeScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async resumeScheduledTask");
        final ResumeScheduledTaskRequest interceptedRequest =
                ResumeScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ResumeScheduledTaskResponse>
                transformer = ResumeScheduledTaskConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>,
                        java.util.concurrent.Future<ResumeScheduledTaskResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RunResponse> run(
            RunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RunRequest, RunResponse> handler) {
        LOG.trace("Called async run");
        final RunRequest interceptedRequest = RunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RunResponse> transformer =
                RunConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<RunRequest, RunResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<RunRequest, RunResponse>,
                        java.util.concurrent.Future<RunResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RunRequest, RunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetUnprocessedDataBucketResponse> setUnprocessedDataBucket(
            SetUnprocessedDataBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>
                    handler) {
        LOG.trace("Called async setUnprocessedDataBucket");
        final SetUnprocessedDataBucketRequest interceptedRequest =
                SetUnprocessedDataBucketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetUnprocessedDataBucketConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetUnprocessedDataBucketResponse>
                transformer = SetUnprocessedDataBucketConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>,
                        java.util.concurrent.Future<SetUnprocessedDataBucketResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SuggestResponse> suggest(
            SuggestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SuggestRequest, SuggestResponse> handler) {
        LOG.trace("Called async suggest");
        final SuggestRequest interceptedRequest = SuggestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuggestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, SuggestResponse>
                transformer = SuggestConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<SuggestRequest, SuggestResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<SuggestRequest, SuggestResponse>,
                        java.util.concurrent.Future<SuggestResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSuggestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SuggestRequest, SuggestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SuppressWarningResponse> suppressWarning(
            SuppressWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuppressWarningRequest, SuppressWarningResponse>
                    handler) {
        LOG.trace("Called async suppressWarning");
        final SuppressWarningRequest interceptedRequest =
                SuppressWarningConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuppressWarningConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, SuppressWarningResponse>
                transformer = SuppressWarningConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<SuppressWarningRequest, SuppressWarningResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SuppressWarningRequest, SuppressWarningResponse>,
                        java.util.concurrent.Future<SuppressWarningResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getWarningReferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SuppressWarningRequest, SuppressWarningResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestParserResponse> testParser(
            TestParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<TestParserRequest, TestParserResponse>
                    handler) {
        LOG.trace("Called async testParser");
        final TestParserRequest interceptedRequest = TestParserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestParserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TestParserResponse>
                transformer = TestParserConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<TestParserRequest, TestParserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestParserRequest, TestParserResponse>,
                        java.util.concurrent.Future<TestParserResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestParserPayloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestParserRequest, TestParserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnsuppressWarningResponse> unsuppressWarning(
            UnsuppressWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnsuppressWarningRequest, UnsuppressWarningResponse>
                    handler) {
        LOG.trace("Called async unsuppressWarning");
        final UnsuppressWarningRequest interceptedRequest =
                UnsuppressWarningConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsuppressWarningConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UnsuppressWarningResponse>
                transformer = UnsuppressWarningConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UnsuppressWarningRequest, UnsuppressWarningResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnsuppressWarningRequest, UnsuppressWarningResponse>,
                        java.util.concurrent.Future<UnsuppressWarningResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getWarningReferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnsuppressWarningRequest, UnsuppressWarningResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEmBridgeResponse>
            updateLogAnalyticsEmBridge(
                    UpdateLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsEmBridgeRequest,
                                    UpdateLogAnalyticsEmBridgeResponse>
                            handler) {
        LOG.trace("Called async updateLogAnalyticsEmBridge");
        final UpdateLogAnalyticsEmBridgeRequest interceptedRequest =
                UpdateLogAnalyticsEmBridgeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEmBridgeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsEmBridgeResponse>
                transformer = UpdateLogAnalyticsEmBridgeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLogAnalyticsEmBridgeRequest, UpdateLogAnalyticsEmBridgeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLogAnalyticsEmBridgeRequest,
                                UpdateLogAnalyticsEmBridgeResponse>,
                        java.util.concurrent.Future<UpdateLogAnalyticsEmBridgeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLogAnalyticsEmBridgeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLogAnalyticsEmBridgeRequest, UpdateLogAnalyticsEmBridgeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEntityResponse> updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>
                    handler) {
        LOG.trace("Called async updateLogAnalyticsEntity");
        final UpdateLogAnalyticsEntityRequest interceptedRequest =
                UpdateLogAnalyticsEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsEntityResponse>
                transformer = UpdateLogAnalyticsEntityConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>,
                        java.util.concurrent.Future<UpdateLogAnalyticsEntityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLogAnalyticsEntityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEntityTypeResponse>
            updateLogAnalyticsEntityType(
                    UpdateLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsEntityTypeRequest,
                                    UpdateLogAnalyticsEntityTypeResponse>
                            handler) {
        LOG.trace("Called async updateLogAnalyticsEntityType");
        final UpdateLogAnalyticsEntityTypeRequest interceptedRequest =
                UpdateLogAnalyticsEntityTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsEntityTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsEntityTypeResponse>
                transformer = UpdateLogAnalyticsEntityTypeConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLogAnalyticsEntityTypeRequest, UpdateLogAnalyticsEntityTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLogAnalyticsEntityTypeRequest,
                                UpdateLogAnalyticsEntityTypeResponse>,
                        java.util.concurrent.Future<UpdateLogAnalyticsEntityTypeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLogAnalyticsEntityTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLogAnalyticsEntityTypeRequest, UpdateLogAnalyticsEntityTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsLogGroupResponse>
            updateLogAnalyticsLogGroup(
                    UpdateLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsLogGroupRequest,
                                    UpdateLogAnalyticsLogGroupResponse>
                            handler) {
        LOG.trace("Called async updateLogAnalyticsLogGroup");
        final UpdateLogAnalyticsLogGroupRequest interceptedRequest =
                UpdateLogAnalyticsLogGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsLogGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsLogGroupResponse>
                transformer = UpdateLogAnalyticsLogGroupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLogAnalyticsLogGroupRequest, UpdateLogAnalyticsLogGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLogAnalyticsLogGroupRequest,
                                UpdateLogAnalyticsLogGroupResponse>,
                        java.util.concurrent.Future<UpdateLogAnalyticsLogGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLogAnalyticsLogGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLogAnalyticsLogGroupRequest, UpdateLogAnalyticsLogGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsObjectCollectionRuleResponse>
            updateLogAnalyticsObjectCollectionRule(
                    UpdateLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsObjectCollectionRuleRequest,
                                    UpdateLogAnalyticsObjectCollectionRuleResponse>
                            handler) {
        LOG.trace("Called async updateLogAnalyticsObjectCollectionRule");
        final UpdateLogAnalyticsObjectCollectionRuleRequest interceptedRequest =
                UpdateLogAnalyticsObjectCollectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLogAnalyticsObjectCollectionRuleConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLogAnalyticsObjectCollectionRuleResponse>
                transformer = UpdateLogAnalyticsObjectCollectionRuleConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLogAnalyticsObjectCollectionRuleRequest,
                        UpdateLogAnalyticsObjectCollectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLogAnalyticsObjectCollectionRuleRequest,
                                UpdateLogAnalyticsObjectCollectionRuleResponse>,
                        java.util.concurrent.Future<UpdateLogAnalyticsObjectCollectionRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateLogAnalyticsObjectCollectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLogAnalyticsObjectCollectionRuleRequest,
                    UpdateLogAnalyticsObjectCollectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLookupResponse> updateLookup(
            UpdateLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateLookupRequest, UpdateLookupResponse>
                    handler) {
        LOG.trace("Called async updateLookup");
        final UpdateLookupRequest interceptedRequest =
                UpdateLookupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLookupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateLookupResponse>
                transformer = UpdateLookupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpdateLookupRequest, UpdateLookupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLookupRequest, UpdateLookupResponse>,
                        java.util.concurrent.Future<UpdateLookupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLookupMetadataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLookupRequest, UpdateLookupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLookupDataResponse> updateLookupData(
            UpdateLookupDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLookupDataRequest, UpdateLookupDataResponse>
                    handler) {
        LOG.trace("Called async updateLookupData");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateLookupDataRequest.builder());
        }
        final UpdateLookupDataRequest interceptedRequest =
                UpdateLookupDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLookupDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateLookupDataResponse>
                transformer = UpdateLookupDataConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpdateLookupDataRequest, UpdateLookupDataResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLookupDataRequest, UpdateLookupDataResponse>,
                        java.util.concurrent.Future<UpdateLookupDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLookupFileBody(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLookupDataRequest, UpdateLookupDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUpdateLookupFileBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferencesResponse> updatePreferences(
            UpdatePreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferencesRequest, UpdatePreferencesResponse>
                    handler) {
        LOG.trace("Called async updatePreferences");
        final UpdatePreferencesRequest interceptedRequest =
                UpdatePreferencesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePreferencesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePreferencesResponse>
                transformer = UpdatePreferencesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpdatePreferencesRequest, UpdatePreferencesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePreferencesRequest, UpdatePreferencesResponse>,
                        java.util.concurrent.Future<UpdatePreferencesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePreferencesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePreferencesRequest, UpdatePreferencesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCategoriesResponse> updateResourceCategories(
            UpdateResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>
                    handler) {
        LOG.trace("Called async updateResourceCategories");
        final UpdateResourceCategoriesRequest interceptedRequest =
                UpdateResourceCategoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResourceCategoriesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateResourceCategoriesResponse>
                transformer = UpdateResourceCategoriesConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>,
                        java.util.concurrent.Future<UpdateResourceCategoriesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateResourceCategoriesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledTaskResponse> updateScheduledTask(
            UpdateScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
                    handler) {
        LOG.trace("Called async updateScheduledTask");
        final UpdateScheduledTaskRequest interceptedRequest =
                UpdateScheduledTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduledTaskConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateScheduledTaskResponse>
                transformer = UpdateScheduledTaskConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>,
                        java.util.concurrent.Future<UpdateScheduledTaskResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateScheduledTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageResponse> updateStorage(
            UpdateStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateStorageRequest, UpdateStorageResponse>
                    handler) {
        LOG.trace("Called async updateStorage");
        final UpdateStorageRequest interceptedRequest =
                UpdateStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStorageConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateStorageResponse>
                transformer = UpdateStorageConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateStorageRequest, UpdateStorageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateStorageRequest, UpdateStorageResponse>,
                        java.util.concurrent.Future<UpdateStorageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateStorageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateStorageRequest, UpdateStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadLogEventsFileResponse> uploadLogEventsFile(
            UploadLogEventsFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadLogEventsFileRequest, UploadLogEventsFileResponse>
                    handler) {
        LOG.trace("Called async uploadLogEventsFile");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadLogEventsFileRequest.builder());
        }
        final UploadLogEventsFileRequest interceptedRequest =
                UploadLogEventsFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadLogEventsFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UploadLogEventsFileResponse>
                transformer = UploadLogEventsFileConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        UploadLogEventsFileRequest, UploadLogEventsFileResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadLogEventsFileRequest, UploadLogEventsFileResponse>,
                        java.util.concurrent.Future<UploadLogEventsFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadLogEventsFileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadLogEventsFileRequest, UploadLogEventsFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadLogEventsFileDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadLogFileResponse> uploadLogFile(
            UploadLogFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadLogFileRequest, UploadLogFileResponse>
                    handler) {
        LOG.trace("Called async uploadLogFile");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadLogFileRequest.builder());
        }
        final UploadLogFileRequest interceptedRequest =
                UploadLogFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadLogFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UploadLogFileResponse>
                transformer = UploadLogFileConverter.fromResponse();

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UploadLogFileRequest, UploadLogFileResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadLogFileRequest, UploadLogFileResponse>,
                        java.util.concurrent.Future<UploadLogFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadLogFileBody(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadLogFileRequest, UploadLogFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadLogFileBody(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpsertAssociationsResponse> upsertAssociations(
            UpsertAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpsertAssociationsRequest, UpsertAssociationsResponse>
                    handler) {
        LOG.trace("Called async upsertAssociations");
        final UpsertAssociationsRequest interceptedRequest =
                UpsertAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpsertAssociationsResponse>
                transformer = UpsertAssociationsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpsertAssociationsRequest, UpsertAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpsertAssociationsRequest, UpsertAssociationsResponse>,
                        java.util.concurrent.Future<UpsertAssociationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpsertAssociationsRequest, UpsertAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpsertFieldResponse> upsertField(
            UpsertFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertFieldRequest, UpsertFieldResponse>
                    handler) {
        LOG.trace("Called async upsertField");
        final UpsertFieldRequest interceptedRequest =
                UpsertFieldConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertFieldConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpsertFieldResponse>
                transformer = UpsertFieldConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpsertFieldRequest, UpsertFieldResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpsertFieldRequest, UpsertFieldResponse>,
                        java.util.concurrent.Future<UpsertFieldResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsFieldDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpsertFieldRequest, UpsertFieldResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpsertLabelResponse> upsertLabel(
            UpsertLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertLabelRequest, UpsertLabelResponse>
                    handler) {
        LOG.trace("Called async upsertLabel");
        final UpsertLabelRequest interceptedRequest =
                UpsertLabelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertLabelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpsertLabelResponse>
                transformer = UpsertLabelConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpsertLabelRequest, UpsertLabelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpsertLabelRequest, UpsertLabelResponse>,
                        java.util.concurrent.Future<UpsertLabelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsLabelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpsertLabelRequest, UpsertLabelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpsertParserResponse> upsertParser(
            UpsertParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertParserRequest, UpsertParserResponse>
                    handler) {
        LOG.trace("Called async upsertParser");
        final UpsertParserRequest interceptedRequest =
                UpsertParserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertParserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpsertParserResponse>
                transformer = UpsertParserConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpsertParserRequest, UpsertParserResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpsertParserRequest, UpsertParserResponse>,
                        java.util.concurrent.Future<UpsertParserResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsParserDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpsertParserRequest, UpsertParserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpsertSourceResponse> upsertSource(
            UpsertSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertSourceRequest, UpsertSourceResponse>
                    handler) {
        LOG.trace("Called async upsertSource");
        final UpsertSourceRequest interceptedRequest =
                UpsertSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpsertSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpsertSourceResponse>
                transformer = UpsertSourceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<UpsertSourceRequest, UpsertSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpsertSourceRequest, UpsertSourceResponse>,
                        java.util.concurrent.Future<UpsertSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpsertSourceRequest, UpsertSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateAssociationParametersResponse>
            validateAssociationParameters(
                    ValidateAssociationParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAssociationParametersRequest,
                                    ValidateAssociationParametersResponse>
                            handler) {
        LOG.trace("Called async validateAssociationParameters");
        final ValidateAssociationParametersRequest interceptedRequest =
                ValidateAssociationParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAssociationParametersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ValidateAssociationParametersResponse>
                transformer = ValidateAssociationParametersConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ValidateAssociationParametersRequest, ValidateAssociationParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateAssociationParametersRequest,
                                ValidateAssociationParametersResponse>,
                        java.util.concurrent.Future<ValidateAssociationParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateAssociationParametersRequest, ValidateAssociationParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateFileResponse> validateFile(
            ValidateFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ValidateFileRequest, ValidateFileResponse>
                    handler) {
        LOG.trace("Called async validateFile");
        final ValidateFileRequest interceptedRequest =
                ValidateFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ValidateFileResponse>
                transformer = ValidateFileConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ValidateFileRequest, ValidateFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateFileRequest, ValidateFileResponse>,
                        java.util.concurrent.Future<ValidateFileResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateFileRequest, ValidateFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceResponse> validateSource(
            ValidateSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateSourceRequest, ValidateSourceResponse>
                    handler) {
        LOG.trace("Called async validateSource");
        final ValidateSourceRequest interceptedRequest =
                ValidateSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ValidateSourceResponse>
                transformer = ValidateSourceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<ValidateSourceRequest, ValidateSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateSourceRequest, ValidateSourceResponse>,
                        java.util.concurrent.Future<ValidateSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpsertLogAnalyticsSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateSourceRequest, ValidateSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceExtendedFieldDetailsResponse>
            validateSourceExtendedFieldDetails(
                    ValidateSourceExtendedFieldDetailsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateSourceExtendedFieldDetailsRequest,
                                    ValidateSourceExtendedFieldDetailsResponse>
                            handler) {
        LOG.trace("Called async validateSourceExtendedFieldDetails");
        final ValidateSourceExtendedFieldDetailsRequest interceptedRequest =
                ValidateSourceExtendedFieldDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceExtendedFieldDetailsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ValidateSourceExtendedFieldDetailsResponse>
                transformer = ValidateSourceExtendedFieldDetailsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<
                        ValidateSourceExtendedFieldDetailsRequest,
                        ValidateSourceExtendedFieldDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateSourceExtendedFieldDetailsRequest,
                                ValidateSourceExtendedFieldDetailsResponse>,
                        java.util.concurrent.Future<ValidateSourceExtendedFieldDetailsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLogAnalyticsSource(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateSourceExtendedFieldDetailsRequest,
                    ValidateSourceExtendedFieldDetailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceMappingResponse> validateSourceMapping(
            ValidateSourceMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateSourceMappingRequest, ValidateSourceMappingResponse>
                    handler) {
        LOG.trace("Called async validateSourceMapping");
        final ValidateSourceMappingRequest interceptedRequest =
                ValidateSourceMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateSourceMappingConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ValidateSourceMappingResponse>
                transformer = ValidateSourceMappingConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<
                        ValidateSourceMappingRequest, ValidateSourceMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateSourceMappingRequest, ValidateSourceMappingResponse>,
                        java.util.concurrent.Future<ValidateSourceMappingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateSourceMappingRequest, ValidateSourceMappingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<VerifyResponse> verify(
            VerifyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handler) {
        LOG.trace("Called async verify");
        final VerifyRequest interceptedRequest = VerifyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                VerifyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, VerifyResponse>
                transformer = VerifyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse>,
                        java.util.concurrent.Future<VerifyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    VerifyRequest, VerifyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
