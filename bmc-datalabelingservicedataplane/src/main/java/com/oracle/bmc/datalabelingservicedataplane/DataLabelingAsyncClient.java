/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane;

import com.oracle.bmc.datalabelingservicedataplane.internal.http.*;
import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;

/**
 * Async client implementation for DataLabeling service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.extern.slf4j.Slf4j
public class DataLabelingAsyncClient implements DataLabelingAsync {
    /**
     * Service instance for DataLabeling.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATALABELING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datalabeling-dp.{region}.oci.{secondLevelDomain}")
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
    public DataLabelingAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataLabelingAsyncClient> {
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
        public DataLabelingAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DataLabelingAsyncClient(
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
    public java.util.concurrent.Future<CreateAnnotationResponse> createAnnotation(
            CreateAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAnnotationRequest, CreateAnnotationResponse>
                    handler) {
        LOG.trace("Called async createAnnotation");
        final CreateAnnotationRequest interceptedRequest =
                CreateAnnotationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAnnotationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAnnotationResponse>
                transformer = CreateAnnotationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "CreateAnnotation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/CreateAnnotation");

        com.oracle.bmc.responses.AsyncHandler<CreateAnnotationRequest, CreateAnnotationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAnnotationRequest, CreateAnnotationResponse>,
                        java.util.concurrent.Future<CreateAnnotationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAnnotationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAnnotationRequest, CreateAnnotationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRecordResponse> createRecord(
            CreateRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRecordRequest, CreateRecordResponse>
                    handler) {
        LOG.trace("Called async createRecord");
        final CreateRecordRequest interceptedRequest =
                CreateRecordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRecordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateRecordResponse>
                transformer = CreateRecordConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "CreateRecord",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/CreateRecord");

        com.oracle.bmc.responses.AsyncHandler<CreateRecordRequest, CreateRecordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRecordRequest, CreateRecordResponse>,
                        java.util.concurrent.Future<CreateRecordResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRecordDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRecordRequest, CreateRecordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnotationResponse> deleteAnnotation(
            DeleteAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAnnotationRequest, DeleteAnnotationResponse>
                    handler) {
        LOG.trace("Called async deleteAnnotation");
        final DeleteAnnotationRequest interceptedRequest =
                DeleteAnnotationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAnnotationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAnnotationResponse>
                transformer = DeleteAnnotationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "DeleteAnnotation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/DeleteAnnotation");

        com.oracle.bmc.responses.AsyncHandler<DeleteAnnotationRequest, DeleteAnnotationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAnnotationRequest, DeleteAnnotationResponse>,
                        java.util.concurrent.Future<DeleteAnnotationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAnnotationRequest, DeleteAnnotationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResponse> deleteRecord(
            DeleteRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRecordRequest, DeleteRecordResponse>
                    handler) {
        LOG.trace("Called async deleteRecord");
        final DeleteRecordRequest interceptedRequest =
                DeleteRecordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRecordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteRecordResponse>
                transformer = DeleteRecordConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "DeleteRecord",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/DeleteRecord");

        com.oracle.bmc.responses.AsyncHandler<DeleteRecordRequest, DeleteRecordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRecordRequest, DeleteRecordResponse>,
                        java.util.concurrent.Future<DeleteRecordResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRecordRequest, DeleteRecordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationResponse> getAnnotation(
            GetAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAnnotationRequest, GetAnnotationResponse>
                    handler) {
        LOG.trace("Called async getAnnotation");
        final GetAnnotationRequest interceptedRequest =
                GetAnnotationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAnnotationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAnnotationResponse>
                transformer = GetAnnotationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "GetAnnotation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/GetAnnotation");

        com.oracle.bmc.responses.AsyncHandler<GetAnnotationRequest, GetAnnotationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAnnotationRequest, GetAnnotationResponse>,
                        java.util.concurrent.Future<GetAnnotationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAnnotationRequest, GetAnnotationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResponse> getDataset(
            GetDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatasetRequest, GetDatasetResponse>
                    handler) {
        LOG.trace("Called async getDataset");
        final GetDatasetRequest interceptedRequest = GetDatasetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatasetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDatasetResponse>
                transformer = GetDatasetConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "GetDataset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Dataset/GetDataset");

        com.oracle.bmc.responses.AsyncHandler<GetDatasetRequest, GetDatasetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatasetRequest, GetDatasetResponse>,
                        java.util.concurrent.Future<GetDatasetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatasetRequest, GetDatasetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRecordResponse> getRecord(
            GetRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRecordRequest, GetRecordResponse>
                    handler) {
        LOG.trace("Called async getRecord");
        final GetRecordRequest interceptedRequest = GetRecordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRecordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetRecordResponse>
                transformer = GetRecordConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "GetRecord",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecord");

        com.oracle.bmc.responses.AsyncHandler<GetRecordRequest, GetRecordResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetRecordRequest, GetRecordResponse>,
                        java.util.concurrent.Future<GetRecordResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRecordRequest, GetRecordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRecordContentResponse> getRecordContent(
            GetRecordContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecordContentRequest, GetRecordContentResponse>
                    handler) {
        LOG.trace("Called async getRecordContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getRecordContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetRecordContentRequest interceptedRequest =
                GetRecordContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRecordContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetRecordContentResponse>
                transformer = GetRecordContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "GetRecordContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecordContent");

        com.oracle.bmc.responses.AsyncHandler<GetRecordContentRequest, GetRecordContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRecordContentRequest, GetRecordContentResponse>,
                        java.util.concurrent.Future<GetRecordContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRecordContentRequest, GetRecordContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRecordPreviewContentResponse> getRecordPreviewContent(
            GetRecordPreviewContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecordPreviewContentRequest, GetRecordPreviewContentResponse>
                    handler) {
        LOG.trace("Called async getRecordPreviewContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getRecordPreviewContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetRecordPreviewContentRequest interceptedRequest =
                GetRecordPreviewContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRecordPreviewContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetRecordPreviewContentResponse>
                transformer = GetRecordPreviewContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "GetRecordPreviewContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecordPreviewContent");

        com.oracle.bmc.responses.AsyncHandler<
                        GetRecordPreviewContentRequest, GetRecordPreviewContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRecordPreviewContentRequest, GetRecordPreviewContentResponse>,
                        java.util.concurrent.Future<GetRecordPreviewContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRecordPreviewContentRequest, GetRecordPreviewContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationsResponse> listAnnotations(
            ListAnnotationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAnnotationsRequest, ListAnnotationsResponse>
                    handler) {
        LOG.trace("Called async listAnnotations");
        final ListAnnotationsRequest interceptedRequest =
                ListAnnotationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAnnotationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAnnotationsResponse>
                transformer = ListAnnotationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "ListAnnotations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/AnnotationCollection/ListAnnotations");

        com.oracle.bmc.responses.AsyncHandler<ListAnnotationsRequest, ListAnnotationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAnnotationsRequest, ListAnnotationsResponse>,
                        java.util.concurrent.Future<ListAnnotationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAnnotationsRequest, ListAnnotationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRecordsResponse> listRecords(
            ListRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRecordsRequest, ListRecordsResponse>
                    handler) {
        LOG.trace("Called async listRecords");
        final ListRecordsRequest interceptedRequest =
                ListRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecordsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRecordsResponse>
                transformer = ListRecordsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "ListRecords",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/RecordCollection/ListRecords");

        com.oracle.bmc.responses.AsyncHandler<ListRecordsRequest, ListRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRecordsRequest, ListRecordsResponse>,
                        java.util.concurrent.Future<ListRecordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRecordsRequest, ListRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAnnotationAnalyticsResponse>
            summarizeAnnotationAnalytics(
                    SummarizeAnnotationAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAnnotationAnalyticsRequest,
                                    SummarizeAnnotationAnalyticsResponse>
                            handler) {
        LOG.trace("Called async summarizeAnnotationAnalytics");
        final SummarizeAnnotationAnalyticsRequest interceptedRequest =
                SummarizeAnnotationAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAnnotationAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAnnotationAnalyticsResponse>
                transformer = SummarizeAnnotationAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "SummarizeAnnotationAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/AnnotationAnalyticsAggregationCollection/SummarizeAnnotationAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAnnotationAnalyticsRequest, SummarizeAnnotationAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAnnotationAnalyticsRequest,
                                SummarizeAnnotationAnalyticsResponse>,
                        java.util.concurrent.Future<SummarizeAnnotationAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAnnotationAnalyticsRequest, SummarizeAnnotationAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeRecordAnalyticsResponse> summarizeRecordAnalytics(
            SummarizeRecordAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeRecordAnalyticsRequest, SummarizeRecordAnalyticsResponse>
                    handler) {
        LOG.trace("Called async summarizeRecordAnalytics");
        final SummarizeRecordAnalyticsRequest interceptedRequest =
                SummarizeRecordAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeRecordAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeRecordAnalyticsResponse>
                transformer = SummarizeRecordAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "SummarizeRecordAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/RecordAnalyticsAggregationCollection/SummarizeRecordAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeRecordAnalyticsRequest, SummarizeRecordAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeRecordAnalyticsRequest, SummarizeRecordAnalyticsResponse>,
                        java.util.concurrent.Future<SummarizeRecordAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeRecordAnalyticsRequest, SummarizeRecordAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnotationResponse> updateAnnotation(
            UpdateAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnnotationRequest, UpdateAnnotationResponse>
                    handler) {
        LOG.trace("Called async updateAnnotation");
        final UpdateAnnotationRequest interceptedRequest =
                UpdateAnnotationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAnnotationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAnnotationResponse>
                transformer = UpdateAnnotationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "UpdateAnnotation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/UpdateAnnotation");

        com.oracle.bmc.responses.AsyncHandler<UpdateAnnotationRequest, UpdateAnnotationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAnnotationRequest, UpdateAnnotationResponse>,
                        java.util.concurrent.Future<UpdateAnnotationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAnnotationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAnnotationRequest, UpdateAnnotationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRecordResponse> updateRecord(
            UpdateRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRecordRequest, UpdateRecordResponse>
                    handler) {
        LOG.trace("Called async updateRecord");
        final UpdateRecordRequest interceptedRequest =
                UpdateRecordConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRecordConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateRecordResponse>
                transformer = UpdateRecordConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataLabeling",
                "UpdateRecord",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/UpdateRecord");

        com.oracle.bmc.responses.AsyncHandler<UpdateRecordRequest, UpdateRecordResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRecordRequest, UpdateRecordResponse>,
                        java.util.concurrent.Future<UpdateRecordResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRecordDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRecordRequest, UpdateRecordResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
