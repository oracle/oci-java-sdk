/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.internal.http.*;
import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for DataCatalog service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class DataCatalogAsyncClient implements DataCatalogAsync {
    /**
     * Service instance for DataCatalog.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATACATALOG")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datacatalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataCatalogAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DataCatalogAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataCatalogAsyncClient> {
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
        public DataCatalogAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DataCatalogAsyncClient(
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
    public java.util.concurrent.Future<AddDataSelectorPatternsResponse> addDataSelectorPatterns(
            AddDataSelectorPatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>
                    handler) {
        LOG.trace("Called async addDataSelectorPatterns");
        final AddDataSelectorPatternsRequest interceptedRequest =
                AddDataSelectorPatternsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDataSelectorPatternsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddDataSelectorPatternsResponse>
                transformer = AddDataSelectorPatternsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "AddDataSelectorPatterns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/AddDataSelectorPatterns");

        com.oracle.bmc.responses.AsyncHandler<
                        AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>,
                        java.util.concurrent.Future<AddDataSelectorPatternsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDataSelectorPatternDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AssociateCustomPropertyResponse> associateCustomProperty(
            AssociateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>
                    handler) {
        LOG.trace("Called async associateCustomProperty");
        final AssociateCustomPropertyRequest interceptedRequest =
                AssociateCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AssociateCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AssociateCustomPropertyResponse>
                transformer = AssociateCustomPropertyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "AssociateCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/AssociateCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<
                        AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>,
                        java.util.concurrent.Future<AssociateCustomPropertyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAssociateCustomPropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachCatalogPrivateEndpointResponse>
            attachCatalogPrivateEndpoint(
                    AttachCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachCatalogPrivateEndpointRequest,
                                    AttachCatalogPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async attachCatalogPrivateEndpoint");
        final AttachCatalogPrivateEndpointRequest interceptedRequest =
                AttachCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AttachCatalogPrivateEndpointResponse>
                transformer = AttachCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "AttachCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/AttachCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        AttachCatalogPrivateEndpointRequest, AttachCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachCatalogPrivateEndpointRequest,
                                AttachCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<AttachCatalogPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachCatalogPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachCatalogPrivateEndpointRequest, AttachCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCatalogCompartmentResponse> changeCatalogCompartment(
            ChangeCatalogCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeCatalogCompartment");
        final ChangeCatalogCompartmentRequest interceptedRequest =
                ChangeCatalogCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCatalogCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCatalogCompartmentResponse>
                transformer = ChangeCatalogCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ChangeCatalogCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ChangeCatalogCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCatalogCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCatalogCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCatalogPrivateEndpointCompartmentResponse>
            changeCatalogPrivateEndpointCompartment(
                    ChangeCatalogPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCatalogPrivateEndpointCompartmentRequest,
                                    ChangeCatalogPrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCatalogPrivateEndpointCompartment");
        final ChangeCatalogPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeCatalogPrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCatalogPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCatalogPrivateEndpointCompartmentResponse>
                transformer = ChangeCatalogPrivateEndpointCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ChangeCatalogPrivateEndpointCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/ChangeCatalogPrivateEndpointCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCatalogPrivateEndpointCompartmentRequest,
                        ChangeCatalogPrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCatalogPrivateEndpointCompartmentRequest,
                                ChangeCatalogPrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeCatalogPrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeCatalogPrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCatalogPrivateEndpointCompartmentRequest,
                    ChangeCatalogPrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMetastoreCompartmentResponse>
            changeMetastoreCompartment(
                    ChangeMetastoreCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMetastoreCompartmentRequest,
                                    ChangeMetastoreCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMetastoreCompartment");
        final ChangeMetastoreCompartmentRequest interceptedRequest =
                ChangeMetastoreCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMetastoreCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeMetastoreCompartmentResponse>
                transformer = ChangeMetastoreCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ChangeMetastoreCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/ChangeMetastoreCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMetastoreCompartmentRequest, ChangeMetastoreCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMetastoreCompartmentRequest,
                                ChangeMetastoreCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMetastoreCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMetastoreCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMetastoreCompartmentRequest, ChangeMetastoreCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeResponse> createAttribute(
            CreateAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeRequest, CreateAttributeResponse>
                    handler) {
        LOG.trace("Called async createAttribute");
        final CreateAttributeRequest interceptedRequest =
                CreateAttributeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAttributeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAttributeResponse>
                transformer = CreateAttributeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateAttribute",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/CreateAttribute");

        com.oracle.bmc.responses.AsyncHandler<CreateAttributeRequest, CreateAttributeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAttributeRequest, CreateAttributeResponse>,
                        java.util.concurrent.Future<CreateAttributeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAttributeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAttributeRequest, CreateAttributeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeTagResponse> createAttributeTag(
            CreateAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeTagRequest, CreateAttributeTagResponse>
                    handler) {
        LOG.trace("Called async createAttributeTag");
        final CreateAttributeTagRequest interceptedRequest =
                CreateAttributeTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAttributeTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateAttributeTagResponse>
                transformer = CreateAttributeTagConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateAttributeTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/CreateAttributeTag");

        com.oracle.bmc.responses.AsyncHandler<CreateAttributeTagRequest, CreateAttributeTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAttributeTagRequest, CreateAttributeTagResponse>,
                        java.util.concurrent.Future<CreateAttributeTagResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAttributeTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAttributeTagRequest, CreateAttributeTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCatalogResponse> createCatalog(
            CreateCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse>
                    handler) {
        LOG.trace("Called async createCatalog");
        final CreateCatalogRequest interceptedRequest =
                CreateCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCatalogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateCatalogResponse>
                transformer = CreateCatalogConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateCatalog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/CreateCatalog");

        com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCatalogRequest, CreateCatalogResponse>,
                        java.util.concurrent.Future<CreateCatalogResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCatalogDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCatalogRequest, CreateCatalogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCatalogPrivateEndpointResponse>
            createCatalogPrivateEndpoint(
                    CreateCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCatalogPrivateEndpointRequest,
                                    CreateCatalogPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createCatalogPrivateEndpoint");
        final CreateCatalogPrivateEndpointRequest interceptedRequest =
                CreateCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCatalogPrivateEndpointResponse>
                transformer = CreateCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/CreateCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCatalogPrivateEndpointRequest, CreateCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCatalogPrivateEndpointRequest,
                                CreateCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateCatalogPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCatalogPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCatalogPrivateEndpointRequest, CreateCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {
        LOG.trace("Called async createConnection");
        final CreateConnectionRequest interceptedRequest =
                CreateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateConnectionResponse>
                transformer = CreateConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/CreateConnection");

        com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConnectionRequest, CreateConnectionResponse>,
                        java.util.concurrent.Future<CreateConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConnectionRequest, CreateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPropertyResponse> createCustomProperty(
            CreateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomPropertyRequest, CreateCustomPropertyResponse>
                    handler) {
        LOG.trace("Called async createCustomProperty");
        final CreateCustomPropertyRequest interceptedRequest =
                CreateCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCustomPropertyResponse>
                transformer = CreateCustomPropertyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/CreateCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateCustomPropertyRequest, CreateCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCustomPropertyRequest, CreateCustomPropertyResponse>,
                        java.util.concurrent.Future<CreateCustomPropertyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCustomPropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCustomPropertyRequest, CreateCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetRequest, CreateDataAssetResponse>
                    handler) {
        LOG.trace("Called async createDataAsset");
        final CreateDataAssetRequest interceptedRequest =
                CreateDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDataAssetResponse>
                transformer = CreateDataAssetConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/CreateDataAsset");

        com.oracle.bmc.responses.AsyncHandler<CreateDataAssetRequest, CreateDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataAssetRequest, CreateDataAssetResponse>,
                        java.util.concurrent.Future<CreateDataAssetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataAssetRequest, CreateDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetTagResponse> createDataAssetTag(
            CreateDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetTagRequest, CreateDataAssetTagResponse>
                    handler) {
        LOG.trace("Called async createDataAssetTag");
        final CreateDataAssetTagRequest interceptedRequest =
                CreateDataAssetTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataAssetTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDataAssetTagResponse>
                transformer = CreateDataAssetTagConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateDataAssetTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/CreateDataAssetTag");

        com.oracle.bmc.responses.AsyncHandler<CreateDataAssetTagRequest, CreateDataAssetTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataAssetTagRequest, CreateDataAssetTagResponse>,
                        java.util.concurrent.Future<CreateDataAssetTagResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataAssetTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataAssetTagRequest, CreateDataAssetTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEntityResponse> createEntity(
            CreateEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateEntityRequest, CreateEntityResponse>
                    handler) {
        LOG.trace("Called async createEntity");
        final CreateEntityRequest interceptedRequest =
                CreateEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateEntityResponse>
                transformer = CreateEntityConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateEntity",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/CreateEntity");

        com.oracle.bmc.responses.AsyncHandler<CreateEntityRequest, CreateEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEntityRequest, CreateEntityResponse>,
                        java.util.concurrent.Future<CreateEntityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEntityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEntityRequest, CreateEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEntityTagResponse> createEntityTag(
            CreateEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityTagRequest, CreateEntityTagResponse>
                    handler) {
        LOG.trace("Called async createEntityTag");
        final CreateEntityTagRequest interceptedRequest =
                CreateEntityTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEntityTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateEntityTagResponse>
                transformer = CreateEntityTagConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateEntityTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/CreateEntityTag");

        com.oracle.bmc.responses.AsyncHandler<CreateEntityTagRequest, CreateEntityTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEntityTagRequest, CreateEntityTagResponse>,
                        java.util.concurrent.Future<CreateEntityTagResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEntityTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEntityTagRequest, CreateEntityTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler) {
        LOG.trace("Called async createFolder");
        final CreateFolderRequest interceptedRequest =
                CreateFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFolderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateFolderResponse>
                transformer = CreateFolderConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/CreateFolder");

        com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFolderRequest, CreateFolderResponse>,
                        java.util.concurrent.Future<CreateFolderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFolderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFolderRequest, CreateFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFolderTagResponse> createFolderTag(
            CreateFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFolderTagRequest, CreateFolderTagResponse>
                    handler) {
        LOG.trace("Called async createFolderTag");
        final CreateFolderTagRequest interceptedRequest =
                CreateFolderTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFolderTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateFolderTagResponse>
                transformer = CreateFolderTagConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateFolderTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/CreateFolderTag");

        com.oracle.bmc.responses.AsyncHandler<CreateFolderTagRequest, CreateFolderTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFolderTagRequest, CreateFolderTagResponse>,
                        java.util.concurrent.Future<CreateFolderTagResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFolderTagDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFolderTagRequest, CreateFolderTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGlossaryResponse> createGlossary(
            CreateGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGlossaryRequest, CreateGlossaryResponse>
                    handler) {
        LOG.trace("Called async createGlossary");
        final CreateGlossaryRequest interceptedRequest =
                CreateGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateGlossaryResponse>
                transformer = CreateGlossaryConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/CreateGlossary");

        com.oracle.bmc.responses.AsyncHandler<CreateGlossaryRequest, CreateGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGlossaryRequest, CreateGlossaryResponse>,
                        java.util.concurrent.Future<CreateGlossaryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateGlossaryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGlossaryRequest, CreateGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
        LOG.trace("Called async createJob");
        final CreateJobRequest interceptedRequest = CreateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobResponse>
                transformer = CreateJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/CreateJob");

        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>,
                        java.util.concurrent.Future<CreateJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRequest, CreateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobDefinitionResponse> createJobDefinition(
            CreateJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobDefinitionRequest, CreateJobDefinitionResponse>
                    handler) {
        LOG.trace("Called async createJobDefinition");
        final CreateJobDefinitionRequest interceptedRequest =
                CreateJobDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateJobDefinitionResponse>
                transformer = CreateJobDefinitionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateJobDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/CreateJobDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateJobDefinitionRequest, CreateJobDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobDefinitionRequest, CreateJobDefinitionResponse>,
                        java.util.concurrent.Future<CreateJobDefinitionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobDefinitionRequest, CreateJobDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobExecutionResponse> createJobExecution(
            CreateJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobExecutionRequest, CreateJobExecutionResponse>
                    handler) {
        LOG.trace("Called async createJobExecution");
        final CreateJobExecutionRequest interceptedRequest =
                CreateJobExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobExecutionResponse>
                transformer = CreateJobExecutionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateJobExecution",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecution/CreateJobExecution");

        com.oracle.bmc.responses.AsyncHandler<CreateJobExecutionRequest, CreateJobExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateJobExecutionRequest, CreateJobExecutionResponse>,
                        java.util.concurrent.Future<CreateJobExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobExecutionRequest, CreateJobExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMetastoreResponse> createMetastore(
            CreateMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMetastoreRequest, CreateMetastoreResponse>
                    handler) {
        LOG.trace("Called async createMetastore");
        final CreateMetastoreRequest interceptedRequest =
                CreateMetastoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMetastoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateMetastoreResponse>
                transformer = CreateMetastoreConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateMetastore",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/CreateMetastore");

        com.oracle.bmc.responses.AsyncHandler<CreateMetastoreRequest, CreateMetastoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMetastoreRequest, CreateMetastoreResponse>,
                        java.util.concurrent.Future<CreateMetastoreResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMetastoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMetastoreRequest, CreateMetastoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNamespaceResponse> createNamespace(
            CreateNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNamespaceRequest, CreateNamespaceResponse>
                    handler) {
        LOG.trace("Called async createNamespace");
        final CreateNamespaceRequest interceptedRequest =
                CreateNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateNamespaceResponse>
                transformer = CreateNamespaceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateNamespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/CreateNamespace");

        com.oracle.bmc.responses.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNamespaceRequest, CreateNamespaceResponse>,
                        java.util.concurrent.Future<CreateNamespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNamespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNamespaceRequest, CreateNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePatternResponse> createPattern(
            CreatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePatternRequest, CreatePatternResponse>
                    handler) {
        LOG.trace("Called async createPattern");
        final CreatePatternRequest interceptedRequest =
                CreatePatternConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePatternConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreatePatternResponse>
                transformer = CreatePatternConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreatePattern",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/CreatePattern");

        com.oracle.bmc.responses.AsyncHandler<CreatePatternRequest, CreatePatternResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePatternRequest, CreatePatternResponse>,
                        java.util.concurrent.Future<CreatePatternResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePatternDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePatternRequest, CreatePatternResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTermResponse> createTerm(
            CreateTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTermRequest, CreateTermResponse>
                    handler) {
        LOG.trace("Called async createTerm");
        final CreateTermRequest interceptedRequest = CreateTermConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTermConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTermResponse>
                transformer = CreateTermConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateTerm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/CreateTerm");

        com.oracle.bmc.responses.AsyncHandler<CreateTermRequest, CreateTermResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTermRequest, CreateTermResponse>,
                        java.util.concurrent.Future<CreateTermResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTermDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTermRequest, CreateTermResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTermRelationshipResponse> createTermRelationship(
            CreateTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTermRelationshipRequest, CreateTermRelationshipResponse>
                    handler) {
        LOG.trace("Called async createTermRelationship");
        final CreateTermRelationshipRequest interceptedRequest =
                CreateTermRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTermRelationshipConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTermRelationshipResponse>
                transformer = CreateTermRelationshipConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "CreateTermRelationship",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/CreateTermRelationship");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTermRelationshipRequest, CreateTermRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTermRelationshipRequest, CreateTermRelationshipResponse>,
                        java.util.concurrent.Future<CreateTermRelationshipResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTermRelationshipDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTermRelationshipRequest, CreateTermRelationshipResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeResponse> deleteAttribute(
            DeleteAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeRequest, DeleteAttributeResponse>
                    handler) {
        LOG.trace("Called async deleteAttribute");
        final DeleteAttributeRequest interceptedRequest =
                DeleteAttributeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAttributeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAttributeResponse>
                transformer = DeleteAttributeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteAttribute",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/DeleteAttribute");

        com.oracle.bmc.responses.AsyncHandler<DeleteAttributeRequest, DeleteAttributeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAttributeRequest, DeleteAttributeResponse>,
                        java.util.concurrent.Future<DeleteAttributeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAttributeRequest, DeleteAttributeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeTagResponse> deleteAttributeTag(
            DeleteAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeTagRequest, DeleteAttributeTagResponse>
                    handler) {
        LOG.trace("Called async deleteAttributeTag");
        final DeleteAttributeTagRequest interceptedRequest =
                DeleteAttributeTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAttributeTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAttributeTagResponse>
                transformer = DeleteAttributeTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteAttributeTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/DeleteAttributeTag");

        com.oracle.bmc.responses.AsyncHandler<DeleteAttributeTagRequest, DeleteAttributeTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAttributeTagRequest, DeleteAttributeTagResponse>,
                        java.util.concurrent.Future<DeleteAttributeTagResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAttributeTagRequest, DeleteAttributeTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCatalogResponse> deleteCatalog(
            DeleteCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse>
                    handler) {
        LOG.trace("Called async deleteCatalog");
        final DeleteCatalogRequest interceptedRequest =
                DeleteCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCatalogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCatalogResponse>
                transformer = DeleteCatalogConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteCatalog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/DeleteCatalog");

        com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCatalogRequest, DeleteCatalogResponse>,
                        java.util.concurrent.Future<DeleteCatalogResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCatalogRequest, DeleteCatalogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCatalogPrivateEndpointResponse>
            deleteCatalogPrivateEndpoint(
                    DeleteCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCatalogPrivateEndpointRequest,
                                    DeleteCatalogPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteCatalogPrivateEndpoint");
        final DeleteCatalogPrivateEndpointRequest interceptedRequest =
                DeleteCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCatalogPrivateEndpointResponse>
                transformer = DeleteCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/DeleteCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCatalogPrivateEndpointRequest, DeleteCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCatalogPrivateEndpointRequest,
                                DeleteCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteCatalogPrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCatalogPrivateEndpointRequest, DeleteCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {
        LOG.trace("Called async deleteConnection");
        final DeleteConnectionRequest interceptedRequest =
                DeleteConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteConnectionResponse>
                transformer = DeleteConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/DeleteConnection");

        com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConnectionRequest, DeleteConnectionResponse>,
                        java.util.concurrent.Future<DeleteConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConnectionRequest, DeleteConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomPropertyResponse> deleteCustomProperty(
            DeleteCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>
                    handler) {
        LOG.trace("Called async deleteCustomProperty");
        final DeleteCustomPropertyRequest interceptedRequest =
                DeleteCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCustomPropertyResponse>
                transformer = DeleteCustomPropertyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/DeleteCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>,
                        java.util.concurrent.Future<DeleteCustomPropertyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler) {
        LOG.trace("Called async deleteDataAsset");
        final DeleteDataAssetRequest interceptedRequest =
                DeleteDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDataAssetResponse>
                transformer = DeleteDataAssetConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/DeleteDataAsset");

        com.oracle.bmc.responses.AsyncHandler<DeleteDataAssetRequest, DeleteDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataAssetRequest, DeleteDataAssetResponse>,
                        java.util.concurrent.Future<DeleteDataAssetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataAssetRequest, DeleteDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataAssetTagResponse> deleteDataAssetTag(
            DeleteDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>
                    handler) {
        LOG.trace("Called async deleteDataAssetTag");
        final DeleteDataAssetTagRequest interceptedRequest =
                DeleteDataAssetTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataAssetTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDataAssetTagResponse>
                transformer = DeleteDataAssetTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteDataAssetTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/DeleteDataAssetTag");

        com.oracle.bmc.responses.AsyncHandler<DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>,
                        java.util.concurrent.Future<DeleteDataAssetTagResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityResponse> deleteEntity(
            DeleteEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteEntityRequest, DeleteEntityResponse>
                    handler) {
        LOG.trace("Called async deleteEntity");
        final DeleteEntityRequest interceptedRequest =
                DeleteEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteEntityResponse>
                transformer = DeleteEntityConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteEntity",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/DeleteEntity");

        com.oracle.bmc.responses.AsyncHandler<DeleteEntityRequest, DeleteEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEntityRequest, DeleteEntityResponse>,
                        java.util.concurrent.Future<DeleteEntityResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEntityRequest, DeleteEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityTagResponse> deleteEntityTag(
            DeleteEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEntityTagRequest, DeleteEntityTagResponse>
                    handler) {
        LOG.trace("Called async deleteEntityTag");
        final DeleteEntityTagRequest interceptedRequest =
                DeleteEntityTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEntityTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteEntityTagResponse>
                transformer = DeleteEntityTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteEntityTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/DeleteEntityTag");

        com.oracle.bmc.responses.AsyncHandler<DeleteEntityTagRequest, DeleteEntityTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEntityTagRequest, DeleteEntityTagResponse>,
                        java.util.concurrent.Future<DeleteEntityTagResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEntityTagRequest, DeleteEntityTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler) {
        LOG.trace("Called async deleteFolder");
        final DeleteFolderRequest interceptedRequest =
                DeleteFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFolderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFolderResponse>
                transformer = DeleteFolderConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/DeleteFolder");

        com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFolderRequest, DeleteFolderResponse>,
                        java.util.concurrent.Future<DeleteFolderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFolderRequest, DeleteFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderTagResponse> deleteFolderTag(
            DeleteFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFolderTagRequest, DeleteFolderTagResponse>
                    handler) {
        LOG.trace("Called async deleteFolderTag");
        final DeleteFolderTagRequest interceptedRequest =
                DeleteFolderTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFolderTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFolderTagResponse>
                transformer = DeleteFolderTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteFolderTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/DeleteFolderTag");

        com.oracle.bmc.responses.AsyncHandler<DeleteFolderTagRequest, DeleteFolderTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFolderTagRequest, DeleteFolderTagResponse>,
                        java.util.concurrent.Future<DeleteFolderTagResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFolderTagRequest, DeleteFolderTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteGlossaryResponse> deleteGlossary(
            DeleteGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGlossaryRequest, DeleteGlossaryResponse>
                    handler) {
        LOG.trace("Called async deleteGlossary");
        final DeleteGlossaryRequest interceptedRequest =
                DeleteGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteGlossaryResponse>
                transformer = DeleteGlossaryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/DeleteGlossary");

        com.oracle.bmc.responses.AsyncHandler<DeleteGlossaryRequest, DeleteGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGlossaryRequest, DeleteGlossaryResponse>,
                        java.util.concurrent.Future<DeleteGlossaryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGlossaryRequest, DeleteGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {
        LOG.trace("Called async deleteJob");
        final DeleteJobRequest interceptedRequest = DeleteJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteJobResponse>
                transformer = DeleteJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/DeleteJob");

        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>,
                        java.util.concurrent.Future<DeleteJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRequest, DeleteJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobDefinitionResponse> deleteJobDefinition(
            DeleteJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>
                    handler) {
        LOG.trace("Called async deleteJobDefinition");
        final DeleteJobDefinitionRequest interceptedRequest =
                DeleteJobDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteJobDefinitionResponse>
                transformer = DeleteJobDefinitionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteJobDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/DeleteJobDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>,
                        java.util.concurrent.Future<DeleteJobDefinitionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMetastoreResponse> deleteMetastore(
            DeleteMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMetastoreRequest, DeleteMetastoreResponse>
                    handler) {
        LOG.trace("Called async deleteMetastore");
        final DeleteMetastoreRequest interceptedRequest =
                DeleteMetastoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMetastoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteMetastoreResponse>
                transformer = DeleteMetastoreConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteMetastore",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/DeleteMetastore");

        com.oracle.bmc.responses.AsyncHandler<DeleteMetastoreRequest, DeleteMetastoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMetastoreRequest, DeleteMetastoreResponse>,
                        java.util.concurrent.Future<DeleteMetastoreResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMetastoreRequest, DeleteMetastoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResponse> deleteNamespace(
            DeleteNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNamespaceRequest, DeleteNamespaceResponse>
                    handler) {
        LOG.trace("Called async deleteNamespace");
        final DeleteNamespaceRequest interceptedRequest =
                DeleteNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteNamespaceResponse>
                transformer = DeleteNamespaceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteNamespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/DeleteNamespace");

        com.oracle.bmc.responses.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNamespaceRequest, DeleteNamespaceResponse>,
                        java.util.concurrent.Future<DeleteNamespaceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNamespaceRequest, DeleteNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePatternResponse> deletePattern(
            DeletePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePatternRequest, DeletePatternResponse>
                    handler) {
        LOG.trace("Called async deletePattern");
        final DeletePatternRequest interceptedRequest =
                DeletePatternConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePatternConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeletePatternResponse>
                transformer = DeletePatternConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeletePattern",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/DeletePattern");

        com.oracle.bmc.responses.AsyncHandler<DeletePatternRequest, DeletePatternResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePatternRequest, DeletePatternResponse>,
                        java.util.concurrent.Future<DeletePatternResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePatternRequest, DeletePatternResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTermResponse> deleteTerm(
            DeleteTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTermRequest, DeleteTermResponse>
                    handler) {
        LOG.trace("Called async deleteTerm");
        final DeleteTermRequest interceptedRequest = DeleteTermConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTermConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTermResponse>
                transformer = DeleteTermConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteTerm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/DeleteTerm");

        com.oracle.bmc.responses.AsyncHandler<DeleteTermRequest, DeleteTermResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTermRequest, DeleteTermResponse>,
                        java.util.concurrent.Future<DeleteTermResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTermRequest, DeleteTermResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTermRelationshipResponse> deleteTermRelationship(
            DeleteTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>
                    handler) {
        LOG.trace("Called async deleteTermRelationship");
        final DeleteTermRelationshipRequest interceptedRequest =
                DeleteTermRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTermRelationshipConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTermRelationshipResponse>
                transformer = DeleteTermRelationshipConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DeleteTermRelationship",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/DeleteTermRelationship");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>,
                        java.util.concurrent.Future<DeleteTermRelationshipResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachCatalogPrivateEndpointResponse>
            detachCatalogPrivateEndpoint(
                    DetachCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachCatalogPrivateEndpointRequest,
                                    DetachCatalogPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async detachCatalogPrivateEndpoint");
        final DetachCatalogPrivateEndpointRequest interceptedRequest =
                DetachCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DetachCatalogPrivateEndpointResponse>
                transformer = DetachCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DetachCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/DetachCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        DetachCatalogPrivateEndpointRequest, DetachCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachCatalogPrivateEndpointRequest,
                                DetachCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<DetachCatalogPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetachCatalogPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachCatalogPrivateEndpointRequest, DetachCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisassociateCustomPropertyResponse>
            disassociateCustomProperty(
                    DisassociateCustomPropertyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateCustomPropertyRequest,
                                    DisassociateCustomPropertyResponse>
                            handler) {
        LOG.trace("Called async disassociateCustomProperty");
        final DisassociateCustomPropertyRequest interceptedRequest =
                DisassociateCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisassociateCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DisassociateCustomPropertyResponse>
                transformer = DisassociateCustomPropertyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "DisassociateCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/DisassociateCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<
                        DisassociateCustomPropertyRequest, DisassociateCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisassociateCustomPropertyRequest,
                                DisassociateCustomPropertyResponse>,
                        java.util.concurrent.Future<DisassociateCustomPropertyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisassociateCustomPropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisassociateCustomPropertyRequest, DisassociateCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExpandTreeForGlossaryResponse> expandTreeForGlossary(
            ExpandTreeForGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>
                    handler) {
        LOG.trace("Called async expandTreeForGlossary");
        final ExpandTreeForGlossaryRequest interceptedRequest =
                ExpandTreeForGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExpandTreeForGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ExpandTreeForGlossaryResponse>
                transformer = ExpandTreeForGlossaryConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ExpandTreeForGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ExpandTreeForGlossary");

        com.oracle.bmc.responses.AsyncHandler<
                        ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>,
                        java.util.concurrent.Future<ExpandTreeForGlossaryResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportGlossaryResponse> exportGlossary(
            ExportGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportGlossaryRequest, ExportGlossaryResponse>
                    handler) {
        LOG.trace("Called async exportGlossary");
        final ExportGlossaryRequest interceptedRequest =
                ExportGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ExportGlossaryResponse>
                transformer = ExportGlossaryConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ExportGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ExportGlossary");

        com.oracle.bmc.responses.AsyncHandler<ExportGlossaryRequest, ExportGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportGlossaryRequest, ExportGlossaryResponse>,
                        java.util.concurrent.Future<ExportGlossaryResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportGlossaryRequest, ExportGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAttributeResponse> getAttribute(
            GetAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAttributeRequest, GetAttributeResponse>
                    handler) {
        LOG.trace("Called async getAttribute");
        final GetAttributeRequest interceptedRequest =
                GetAttributeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAttributeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAttributeResponse>
                transformer = GetAttributeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetAttribute",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/GetAttribute");

        com.oracle.bmc.responses.AsyncHandler<GetAttributeRequest, GetAttributeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAttributeRequest, GetAttributeResponse>,
                        java.util.concurrent.Future<GetAttributeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAttributeRequest, GetAttributeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAttributeTagResponse> getAttributeTag(
            GetAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAttributeTagRequest, GetAttributeTagResponse>
                    handler) {
        LOG.trace("Called async getAttributeTag");
        final GetAttributeTagRequest interceptedRequest =
                GetAttributeTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAttributeTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAttributeTagResponse>
                transformer = GetAttributeTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetAttributeTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/GetAttributeTag");

        com.oracle.bmc.responses.AsyncHandler<GetAttributeTagRequest, GetAttributeTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAttributeTagRequest, GetAttributeTagResponse>,
                        java.util.concurrent.Future<GetAttributeTagResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAttributeTagRequest, GetAttributeTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCatalogResponse> getCatalog(
            GetCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse>
                    handler) {
        LOG.trace("Called async getCatalog");
        final GetCatalogRequest interceptedRequest = GetCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCatalogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCatalogResponse>
                transformer = GetCatalogConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetCatalog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/GetCatalog");

        com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCatalogRequest, GetCatalogResponse>,
                        java.util.concurrent.Future<GetCatalogResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCatalogRequest, GetCatalogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCatalogPrivateEndpointResponse> getCatalogPrivateEndpoint(
            GetCatalogPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCatalogPrivateEndpointRequest, GetCatalogPrivateEndpointResponse>
                    handler) {
        LOG.trace("Called async getCatalogPrivateEndpoint");
        final GetCatalogPrivateEndpointRequest interceptedRequest =
                GetCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCatalogPrivateEndpointResponse>
                transformer = GetCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/GetCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCatalogPrivateEndpointRequest, GetCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCatalogPrivateEndpointRequest,
                                GetCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<GetCatalogPrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCatalogPrivateEndpointRequest, GetCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {
        LOG.trace("Called async getConnection");
        final GetConnectionRequest interceptedRequest =
                GetConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetConnectionResponse>
                transformer = GetConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/GetConnection");

        com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConnectionRequest, GetConnectionResponse>,
                        java.util.concurrent.Future<GetConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConnectionRequest, GetConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCustomPropertyResponse> getCustomProperty(
            GetCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomPropertyRequest, GetCustomPropertyResponse>
                    handler) {
        LOG.trace("Called async getCustomProperty");
        final GetCustomPropertyRequest interceptedRequest =
                GetCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetCustomPropertyResponse>
                transformer = GetCustomPropertyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/GetCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<GetCustomPropertyRequest, GetCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCustomPropertyRequest, GetCustomPropertyResponse>,
                        java.util.concurrent.Future<GetCustomPropertyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCustomPropertyRequest, GetCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetResponse> getDataAsset(
            GetDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                    handler) {
        LOG.trace("Called async getDataAsset");
        final GetDataAssetRequest interceptedRequest =
                GetDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDataAssetResponse>
                transformer = GetDataAssetConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/GetDataAsset");

        com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataAssetRequest, GetDataAssetResponse>,
                        java.util.concurrent.Future<GetDataAssetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataAssetRequest, GetDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetTagResponse> getDataAssetTag(
            GetDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataAssetTagRequest, GetDataAssetTagResponse>
                    handler) {
        LOG.trace("Called async getDataAssetTag");
        final GetDataAssetTagRequest interceptedRequest =
                GetDataAssetTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataAssetTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDataAssetTagResponse>
                transformer = GetDataAssetTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetDataAssetTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/GetDataAssetTag");

        com.oracle.bmc.responses.AsyncHandler<GetDataAssetTagRequest, GetDataAssetTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataAssetTagRequest, GetDataAssetTagResponse>,
                        java.util.concurrent.Future<GetDataAssetTagResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataAssetTagRequest, GetDataAssetTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetEntityResponse> getEntity(
            GetEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEntityRequest, GetEntityResponse>
                    handler) {
        LOG.trace("Called async getEntity");
        final GetEntityRequest interceptedRequest = GetEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetEntityResponse>
                transformer = GetEntityConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetEntity",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/GetEntity");

        com.oracle.bmc.responses.AsyncHandler<GetEntityRequest, GetEntityResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetEntityRequest, GetEntityResponse>,
                        java.util.concurrent.Future<GetEntityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEntityRequest, GetEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetEntityTagResponse> getEntityTag(
            GetEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEntityTagRequest, GetEntityTagResponse>
                    handler) {
        LOG.trace("Called async getEntityTag");
        final GetEntityTagRequest interceptedRequest =
                GetEntityTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEntityTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetEntityTagResponse>
                transformer = GetEntityTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetEntityTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/GetEntityTag");

        com.oracle.bmc.responses.AsyncHandler<GetEntityTagRequest, GetEntityTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEntityTagRequest, GetEntityTagResponse>,
                        java.util.concurrent.Future<GetEntityTagResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEntityTagRequest, GetEntityTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>
                    handler) {
        LOG.trace("Called async getFolder");
        final GetFolderRequest interceptedRequest = GetFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFolderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetFolderResponse>
                transformer = GetFolderConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/GetFolder");

        com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>,
                        java.util.concurrent.Future<GetFolderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFolderRequest, GetFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFolderTagResponse> getFolderTag(
            GetFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderTagRequest, GetFolderTagResponse>
                    handler) {
        LOG.trace("Called async getFolderTag");
        final GetFolderTagRequest interceptedRequest =
                GetFolderTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFolderTagConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetFolderTagResponse>
                transformer = GetFolderTagConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetFolderTag",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/GetFolderTag");

        com.oracle.bmc.responses.AsyncHandler<GetFolderTagRequest, GetFolderTagResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFolderTagRequest, GetFolderTagResponse>,
                        java.util.concurrent.Future<GetFolderTagResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFolderTagRequest, GetFolderTagResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetGlossaryResponse> getGlossary(
            GetGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGlossaryRequest, GetGlossaryResponse>
                    handler) {
        LOG.trace("Called async getGlossary");
        final GetGlossaryRequest interceptedRequest =
                GetGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetGlossaryResponse>
                transformer = GetGlossaryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/GetGlossary");

        com.oracle.bmc.responses.AsyncHandler<GetGlossaryRequest, GetGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetGlossaryRequest, GetGlossaryResponse>,
                        java.util.concurrent.Future<GetGlossaryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGlossaryRequest, GetGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {
        LOG.trace("Called async getJob");
        final GetJobRequest interceptedRequest = GetJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobResponse>
                transformer = GetJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/GetJob");

        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse>,
                        java.util.concurrent.Future<GetJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRequest, GetJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobDefinitionResponse> getJobDefinition(
            GetJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobDefinitionRequest, GetJobDefinitionResponse>
                    handler) {
        LOG.trace("Called async getJobDefinition");
        final GetJobDefinitionRequest interceptedRequest =
                GetJobDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobDefinitionResponse>
                transformer = GetJobDefinitionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetJobDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/GetJobDefinition");

        com.oracle.bmc.responses.AsyncHandler<GetJobDefinitionRequest, GetJobDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobDefinitionRequest, GetJobDefinitionResponse>,
                        java.util.concurrent.Future<GetJobDefinitionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobDefinitionRequest, GetJobDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobExecutionRequest, GetJobExecutionResponse>
                    handler) {
        LOG.trace("Called async getJobExecution");
        final GetJobExecutionRequest interceptedRequest =
                GetJobExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobExecutionResponse>
                transformer = GetJobExecutionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetJobExecution",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecution/GetJobExecution");

        com.oracle.bmc.responses.AsyncHandler<GetJobExecutionRequest, GetJobExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobExecutionRequest, GetJobExecutionResponse>,
                        java.util.concurrent.Future<GetJobExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobExecutionRequest, GetJobExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobLogResponse> getJobLog(
            GetJobLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobLogRequest, GetJobLogResponse>
                    handler) {
        LOG.trace("Called async getJobLog");
        final GetJobLogRequest interceptedRequest = GetJobLogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobLogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobLogResponse>
                transformer = GetJobLogConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetJobLog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobLog/GetJobLog");

        com.oracle.bmc.responses.AsyncHandler<GetJobLogRequest, GetJobLogResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobLogRequest, GetJobLogResponse>,
                        java.util.concurrent.Future<GetJobLogResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobLogRequest, GetJobLogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobMetricsResponse> getJobMetrics(
            GetJobMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobMetricsRequest, GetJobMetricsResponse>
                    handler) {
        LOG.trace("Called async getJobMetrics");
        final GetJobMetricsRequest interceptedRequest =
                GetJobMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobMetricsResponse>
                transformer = GetJobMetricsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetJobMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobMetric/GetJobMetrics");

        com.oracle.bmc.responses.AsyncHandler<GetJobMetricsRequest, GetJobMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobMetricsRequest, GetJobMetricsResponse>,
                        java.util.concurrent.Future<GetJobMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobMetricsRequest, GetJobMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMetastoreResponse> getMetastore(
            GetMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMetastoreRequest, GetMetastoreResponse>
                    handler) {
        LOG.trace("Called async getMetastore");
        final GetMetastoreRequest interceptedRequest =
                GetMetastoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMetastoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMetastoreResponse>
                transformer = GetMetastoreConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetMetastore",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/GetMetastore");

        com.oracle.bmc.responses.AsyncHandler<GetMetastoreRequest, GetMetastoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMetastoreRequest, GetMetastoreResponse>,
                        java.util.concurrent.Future<GetMetastoreResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMetastoreRequest, GetMetastoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetNamespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/GetNamespace");

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
    public java.util.concurrent.Future<GetPatternResponse> getPattern(
            GetPatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPatternRequest, GetPatternResponse>
                    handler) {
        LOG.trace("Called async getPattern");
        final GetPatternRequest interceptedRequest = GetPatternConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPatternConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetPatternResponse>
                transformer = GetPatternConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetPattern",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/GetPattern");

        com.oracle.bmc.responses.AsyncHandler<GetPatternRequest, GetPatternResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPatternRequest, GetPatternResponse>,
                        java.util.concurrent.Future<GetPatternResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPatternRequest, GetPatternResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTermResponse> getTerm(
            GetTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse> handler) {
        LOG.trace("Called async getTerm");
        final GetTermRequest interceptedRequest = GetTermConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTermConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTermResponse>
                transformer = GetTermConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetTerm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/GetTerm");

        com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse>,
                        java.util.concurrent.Future<GetTermResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTermRequest, GetTermResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTermRelationshipResponse> getTermRelationship(
            GetTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTermRelationshipRequest, GetTermRelationshipResponse>
                    handler) {
        LOG.trace("Called async getTermRelationship");
        final GetTermRelationshipRequest interceptedRequest =
                GetTermRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTermRelationshipConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTermRelationshipResponse>
                transformer = GetTermRelationshipConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetTermRelationship",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/GetTermRelationship");

        com.oracle.bmc.responses.AsyncHandler<
                        GetTermRelationshipRequest, GetTermRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTermRelationshipRequest, GetTermRelationshipResponse>,
                        java.util.concurrent.Future<GetTermRelationshipResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTermRelationshipRequest, GetTermRelationshipResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTypeResponse> getType(
            GetTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse> handler) {
        LOG.trace("Called async getType");
        final GetTypeRequest interceptedRequest = GetTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTypeResponse>
                transformer = GetTypeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetType",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/GetType");

        com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse>,
                        java.util.concurrent.Future<GetTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTypeRequest, GetTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequest/GetWorkRequest");

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
    public java.util.concurrent.Future<ImportConnectionResponse> importConnection(
            ImportConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportConnectionRequest, ImportConnectionResponse>
                    handler) {
        LOG.trace("Called async importConnection");
        final ImportConnectionRequest interceptedRequest =
                ImportConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ImportConnectionResponse>
                transformer = ImportConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ImportConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ImportConnection");

        com.oracle.bmc.responses.AsyncHandler<ImportConnectionRequest, ImportConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportConnectionRequest, ImportConnectionResponse>,
                        java.util.concurrent.Future<ImportConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportConnectionRequest, ImportConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ImportDataAssetResponse> importDataAsset(
            ImportDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportDataAssetRequest, ImportDataAssetResponse>
                    handler) {
        LOG.trace("Called async importDataAsset");
        final ImportDataAssetRequest interceptedRequest =
                ImportDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ImportDataAssetResponse>
                transformer = ImportDataAssetConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ImportDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ImportDataAsset");

        com.oracle.bmc.responses.AsyncHandler<ImportDataAssetRequest, ImportDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportDataAssetRequest, ImportDataAssetResponse>,
                        java.util.concurrent.Future<ImportDataAssetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportDataAssetRequest, ImportDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ImportGlossaryResponse> importGlossary(
            ImportGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportGlossaryRequest, ImportGlossaryResponse>
                    handler) {
        LOG.trace("Called async importGlossary");
        final ImportGlossaryRequest interceptedRequest =
                ImportGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ImportGlossaryResponse>
                transformer = ImportGlossaryConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ImportGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ImportGlossary");

        com.oracle.bmc.responses.AsyncHandler<ImportGlossaryRequest, ImportGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImportGlossaryRequest, ImportGlossaryResponse>,
                        java.util.concurrent.Future<ImportGlossaryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportGlossaryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportGlossaryRequest, ImportGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAggregatedPhysicalEntitiesResponse>
            listAggregatedPhysicalEntities(
                    ListAggregatedPhysicalEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAggregatedPhysicalEntitiesRequest,
                                    ListAggregatedPhysicalEntitiesResponse>
                            handler) {
        LOG.trace("Called async listAggregatedPhysicalEntities");
        final ListAggregatedPhysicalEntitiesRequest interceptedRequest =
                ListAggregatedPhysicalEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAggregatedPhysicalEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAggregatedPhysicalEntitiesResponse>
                transformer = ListAggregatedPhysicalEntitiesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListAggregatedPhysicalEntities",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/ListAggregatedPhysicalEntities");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAggregatedPhysicalEntitiesRequest,
                        ListAggregatedPhysicalEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAggregatedPhysicalEntitiesRequest,
                                ListAggregatedPhysicalEntitiesResponse>,
                        java.util.concurrent.Future<ListAggregatedPhysicalEntitiesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAggregatedPhysicalEntitiesRequest, ListAggregatedPhysicalEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAttributeTagsResponse> listAttributeTags(
            ListAttributeTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttributeTagsRequest, ListAttributeTagsResponse>
                    handler) {
        LOG.trace("Called async listAttributeTags");
        final ListAttributeTagsRequest interceptedRequest =
                ListAttributeTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAttributeTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAttributeTagsResponse>
                transformer = ListAttributeTagsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListAttributeTags",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTagCollection/ListAttributeTags");

        com.oracle.bmc.responses.AsyncHandler<ListAttributeTagsRequest, ListAttributeTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAttributeTagsRequest, ListAttributeTagsResponse>,
                        java.util.concurrent.Future<ListAttributeTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAttributeTagsRequest, ListAttributeTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAttributesResponse> listAttributes(
            ListAttributesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttributesRequest, ListAttributesResponse>
                    handler) {
        LOG.trace("Called async listAttributes");
        final ListAttributesRequest interceptedRequest =
                ListAttributesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAttributesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAttributesResponse>
                transformer = ListAttributesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListAttributes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeCollection/ListAttributes");

        com.oracle.bmc.responses.AsyncHandler<ListAttributesRequest, ListAttributesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAttributesRequest, ListAttributesResponse>,
                        java.util.concurrent.Future<ListAttributesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAttributesRequest, ListAttributesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCatalogPrivateEndpointsResponse>
            listCatalogPrivateEndpoints(
                    ListCatalogPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCatalogPrivateEndpointsRequest,
                                    ListCatalogPrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listCatalogPrivateEndpoints");
        final ListCatalogPrivateEndpointsRequest interceptedRequest =
                ListCatalogPrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCatalogPrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCatalogPrivateEndpointsResponse>
                transformer = ListCatalogPrivateEndpointsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListCatalogPrivateEndpoints",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpointSummary/ListCatalogPrivateEndpoints");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCatalogPrivateEndpointsRequest, ListCatalogPrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCatalogPrivateEndpointsRequest,
                                ListCatalogPrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListCatalogPrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCatalogPrivateEndpointsRequest, ListCatalogPrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCatalogsResponse> listCatalogs(
            ListCatalogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse>
                    handler) {
        LOG.trace("Called async listCatalogs");
        final ListCatalogsRequest interceptedRequest =
                ListCatalogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCatalogsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListCatalogsResponse>
                transformer = ListCatalogsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListCatalogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogSummary/ListCatalogs");

        com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCatalogsRequest, ListCatalogsResponse>,
                        java.util.concurrent.Future<ListCatalogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCatalogsRequest, ListCatalogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {
        LOG.trace("Called async listConnections");
        final ListConnectionsRequest interceptedRequest =
                ListConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListConnectionsResponse>
                transformer = ListConnectionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListConnections",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/ConnectionCollection/ListConnections");

        com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConnectionsRequest, ListConnectionsResponse>,
                        java.util.concurrent.Future<ListConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConnectionsRequest, ListConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCustomPropertiesResponse> listCustomProperties(
            ListCustomPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomPropertiesRequest, ListCustomPropertiesResponse>
                    handler) {
        LOG.trace("Called async listCustomProperties");
        final ListCustomPropertiesRequest interceptedRequest =
                ListCustomPropertiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomPropertiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCustomPropertiesResponse>
                transformer = ListCustomPropertiesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListCustomProperties",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/ListCustomProperties");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCustomPropertiesRequest, ListCustomPropertiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCustomPropertiesRequest, ListCustomPropertiesResponse>,
                        java.util.concurrent.Future<ListCustomPropertiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCustomPropertiesRequest, ListCustomPropertiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetTagsResponse> listDataAssetTags(
            ListDataAssetTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetTagsRequest, ListDataAssetTagsResponse>
                    handler) {
        LOG.trace("Called async listDataAssetTags");
        final ListDataAssetTagsRequest interceptedRequest =
                ListDataAssetTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAssetTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDataAssetTagsResponse>
                transformer = ListDataAssetTagsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListDataAssetTags",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTagCollection/ListDataAssetTags");

        com.oracle.bmc.responses.AsyncHandler<ListDataAssetTagsRequest, ListDataAssetTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataAssetTagsRequest, ListDataAssetTagsResponse>,
                        java.util.concurrent.Future<ListDataAssetTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataAssetTagsRequest, ListDataAssetTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetsRequest, ListDataAssetsResponse>
                    handler) {
        LOG.trace("Called async listDataAssets");
        final ListDataAssetsRequest interceptedRequest =
                ListDataAssetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAssetsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDataAssetsResponse>
                transformer = ListDataAssetsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListDataAssets",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetCollection/ListDataAssets");

        com.oracle.bmc.responses.AsyncHandler<ListDataAssetsRequest, ListDataAssetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataAssetsRequest, ListDataAssetsResponse>,
                        java.util.concurrent.Future<ListDataAssetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataAssetsRequest, ListDataAssetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDerivedLogicalEntitiesResponse>
            listDerivedLogicalEntities(
                    ListDerivedLogicalEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDerivedLogicalEntitiesRequest,
                                    ListDerivedLogicalEntitiesResponse>
                            handler) {
        LOG.trace("Called async listDerivedLogicalEntities");
        final ListDerivedLogicalEntitiesRequest interceptedRequest =
                ListDerivedLogicalEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDerivedLogicalEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDerivedLogicalEntitiesResponse>
                transformer = ListDerivedLogicalEntitiesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListDerivedLogicalEntities",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ListDerivedLogicalEntities");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDerivedLogicalEntitiesRequest, ListDerivedLogicalEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDerivedLogicalEntitiesRequest,
                                ListDerivedLogicalEntitiesResponse>,
                        java.util.concurrent.Future<ListDerivedLogicalEntitiesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDerivedLogicalEntitiesRequest, ListDerivedLogicalEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResponse> listEntities(
            ListEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEntitiesRequest, ListEntitiesResponse>
                    handler) {
        LOG.trace("Called async listEntities");
        final ListEntitiesRequest interceptedRequest =
                ListEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntitiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListEntitiesResponse>
                transformer = ListEntitiesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListEntities",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/ListEntities");

        com.oracle.bmc.responses.AsyncHandler<ListEntitiesRequest, ListEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEntitiesRequest, ListEntitiesResponse>,
                        java.util.concurrent.Future<ListEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEntitiesRequest, ListEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEntityTagsResponse> listEntityTags(
            ListEntityTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntityTagsRequest, ListEntityTagsResponse>
                    handler) {
        LOG.trace("Called async listEntityTags");
        final ListEntityTagsRequest interceptedRequest =
                ListEntityTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntityTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListEntityTagsResponse>
                transformer = ListEntityTagsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListEntityTags",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTagCollection/ListEntityTags");

        com.oracle.bmc.responses.AsyncHandler<ListEntityTagsRequest, ListEntityTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEntityTagsRequest, ListEntityTagsResponse>,
                        java.util.concurrent.Future<ListEntityTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEntityTagsRequest, ListEntityTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFolderTagsResponse> listFolderTags(
            ListFolderTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFolderTagsRequest, ListFolderTagsResponse>
                    handler) {
        LOG.trace("Called async listFolderTags");
        final ListFolderTagsRequest interceptedRequest =
                ListFolderTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFolderTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFolderTagsResponse>
                transformer = ListFolderTagsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListFolderTags",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTagCollection/ListFolderTags");

        com.oracle.bmc.responses.AsyncHandler<ListFolderTagsRequest, ListFolderTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFolderTagsRequest, ListFolderTagsResponse>,
                        java.util.concurrent.Future<ListFolderTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFolderTagsRequest, ListFolderTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                    handler) {
        LOG.trace("Called async listFolders");
        final ListFoldersRequest interceptedRequest =
                ListFoldersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFoldersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFoldersResponse>
                transformer = ListFoldersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListFolders",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderCollection/ListFolders");

        com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFoldersRequest, ListFoldersResponse>,
                        java.util.concurrent.Future<ListFoldersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFoldersRequest, ListFoldersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGlossariesResponse> listGlossaries(
            ListGlossariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGlossariesRequest, ListGlossariesResponse>
                    handler) {
        LOG.trace("Called async listGlossaries");
        final ListGlossariesRequest interceptedRequest =
                ListGlossariesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGlossariesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGlossariesResponse>
                transformer = ListGlossariesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListGlossaries",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ListGlossaries");

        com.oracle.bmc.responses.AsyncHandler<ListGlossariesRequest, ListGlossariesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGlossariesRequest, ListGlossariesResponse>,
                        java.util.concurrent.Future<ListGlossariesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGlossariesRequest, ListGlossariesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobDefinitionsResponse> listJobDefinitions(
            ListJobDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobDefinitionsRequest, ListJobDefinitionsResponse>
                    handler) {
        LOG.trace("Called async listJobDefinitions");
        final ListJobDefinitionsRequest interceptedRequest =
                ListJobDefinitionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobDefinitionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobDefinitionsResponse>
                transformer = ListJobDefinitionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListJobDefinitions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinitionCollection/ListJobDefinitions");

        com.oracle.bmc.responses.AsyncHandler<ListJobDefinitionsRequest, ListJobDefinitionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobDefinitionsRequest, ListJobDefinitionsResponse>,
                        java.util.concurrent.Future<ListJobDefinitionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobDefinitionsRequest, ListJobDefinitionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler) {
        LOG.trace("Called async listJobExecutions");
        final ListJobExecutionsRequest interceptedRequest =
                ListJobExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobExecutionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobExecutionsResponse>
                transformer = ListJobExecutionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListJobExecutions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecutionCollection/ListJobExecutions");

        com.oracle.bmc.responses.AsyncHandler<ListJobExecutionsRequest, ListJobExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobExecutionsRequest, ListJobExecutionsResponse>,
                        java.util.concurrent.Future<ListJobExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobExecutionsRequest, ListJobExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobLogsResponse> listJobLogs(
            ListJobLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobLogsRequest, ListJobLogsResponse>
                    handler) {
        LOG.trace("Called async listJobLogs");
        final ListJobLogsRequest interceptedRequest =
                ListJobLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobLogsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobLogsResponse>
                transformer = ListJobLogsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListJobLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobLogCollection/ListJobLogs");

        com.oracle.bmc.responses.AsyncHandler<ListJobLogsRequest, ListJobLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobLogsRequest, ListJobLogsResponse>,
                        java.util.concurrent.Future<ListJobLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobLogsRequest, ListJobLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobMetricsResponse> listJobMetrics(
            ListJobMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobMetricsRequest, ListJobMetricsResponse>
                    handler) {
        LOG.trace("Called async listJobMetrics");
        final ListJobMetricsRequest interceptedRequest =
                ListJobMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobMetricsResponse>
                transformer = ListJobMetricsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListJobMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobMetricCollection/ListJobMetrics");

        com.oracle.bmc.responses.AsyncHandler<ListJobMetricsRequest, ListJobMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobMetricsRequest, ListJobMetricsResponse>,
                        java.util.concurrent.Future<ListJobMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobMetricsRequest, ListJobMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        LOG.trace("Called async listJobs");
        final ListJobsRequest interceptedRequest = ListJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobsResponse>
                transformer = ListJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobCollection/ListJobs");

        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>,
                        java.util.concurrent.Future<ListJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobsRequest, ListJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMetastoresResponse> listMetastores(
            ListMetastoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetastoresRequest, ListMetastoresResponse>
                    handler) {
        LOG.trace("Called async listMetastores");
        final ListMetastoresRequest interceptedRequest =
                ListMetastoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMetastoresConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMetastoresResponse>
                transformer = ListMetastoresConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListMetastores",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/MetastoreSummary/ListMetastores");

        com.oracle.bmc.responses.AsyncHandler<ListMetastoresRequest, ListMetastoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMetastoresRequest, ListMetastoresResponse>,
                        java.util.concurrent.Future<ListMetastoresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMetastoresRequest, ListMetastoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListNamespaces",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/ListNamespaces");

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
    public java.util.concurrent.Future<ListPatternsResponse> listPatterns(
            ListPatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatternsRequest, ListPatternsResponse>
                    handler) {
        LOG.trace("Called async listPatterns");
        final ListPatternsRequest interceptedRequest =
                ListPatternsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatternsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListPatternsResponse>
                transformer = ListPatternsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListPatterns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ListPatterns");

        com.oracle.bmc.responses.AsyncHandler<ListPatternsRequest, ListPatternsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPatternsRequest, ListPatternsResponse>,
                        java.util.concurrent.Future<ListPatternsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPatternsRequest, ListPatternsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRulesResponse> listRules(
            ListRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>
                    handler) {
        LOG.trace("Called async listRules");
        final ListRulesRequest interceptedRequest = ListRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRulesResponse>
                transformer = ListRulesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/RuleSummary/ListRules");

        com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>,
                        java.util.concurrent.Future<ListRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRulesRequest, ListRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>
                    handler) {
        LOG.trace("Called async listTags");
        final ListTagsRequest interceptedRequest = ListTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTagsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTagsResponse>
                transformer = ListTagsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListTags",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/ListTags");

        com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>,
                        java.util.concurrent.Future<ListTagsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTagsRequest, ListTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTermRelationshipsResponse> listTermRelationships(
            ListTermRelationshipsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTermRelationshipsRequest, ListTermRelationshipsResponse>
                    handler) {
        LOG.trace("Called async listTermRelationships");
        final ListTermRelationshipsRequest interceptedRequest =
                ListTermRelationshipsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTermRelationshipsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTermRelationshipsResponse>
                transformer = ListTermRelationshipsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListTermRelationships",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/ListTermRelationships");

        com.oracle.bmc.responses.AsyncHandler<
                        ListTermRelationshipsRequest, ListTermRelationshipsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTermRelationshipsRequest, ListTermRelationshipsResponse>,
                        java.util.concurrent.Future<ListTermRelationshipsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTermRelationshipsRequest, ListTermRelationshipsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTermsResponse> listTerms(
            ListTermsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse>
                    handler) {
        LOG.trace("Called async listTerms");
        final ListTermsRequest interceptedRequest = ListTermsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTermsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTermsResponse>
                transformer = ListTermsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListTerms",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/ListTerms");

        com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse>,
                        java.util.concurrent.Future<ListTermsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTermsRequest, ListTermsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTypesResponse> listTypes(
            ListTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse>
                    handler) {
        LOG.trace("Called async listTypes");
        final ListTypesRequest interceptedRequest = ListTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTypesResponse>
                transformer = ListTypesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListTypes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TypeCollection/ListTypes");

        com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse>,
                        java.util.concurrent.Future<ListTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTypesRequest, ListTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequestError/ListWorkRequestErrors");

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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequestLog/ListWorkRequestLogs");

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
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequest/ListWorkRequests");

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
    public java.util.concurrent.Future<ObjectStatsResponse> objectStats(
            ObjectStatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ObjectStatsRequest, ObjectStatsResponse>
                    handler) {
        LOG.trace("Called async objectStats");
        final ObjectStatsRequest interceptedRequest =
                ObjectStatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ObjectStatsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ObjectStatsResponse>
                transformer = ObjectStatsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ObjectStats",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ObjectStats");

        com.oracle.bmc.responses.AsyncHandler<ObjectStatsRequest, ObjectStatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ObjectStatsRequest, ObjectStatsResponse>,
                        java.util.concurrent.Future<ObjectStatsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ObjectStatsRequest, ObjectStatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ParseConnectionResponse> parseConnection(
            ParseConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ParseConnectionRequest, ParseConnectionResponse>
                    handler) {
        LOG.trace("Called async parseConnection");
        final ParseConnectionRequest interceptedRequest =
                ParseConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ParseConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ParseConnectionResponse>
                transformer = ParseConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ParseConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ParseConnection");

        com.oracle.bmc.responses.AsyncHandler<ParseConnectionRequest, ParseConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ParseConnectionRequest, ParseConnectionResponse>,
                        java.util.concurrent.Future<ParseConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getParseConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ParseConnectionRequest, ParseConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ProcessRecommendationResponse> processRecommendation(
            ProcessRecommendationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ProcessRecommendationRequest, ProcessRecommendationResponse>
                    handler) {
        LOG.trace("Called async processRecommendation");
        final ProcessRecommendationRequest interceptedRequest =
                ProcessRecommendationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ProcessRecommendationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ProcessRecommendationResponse>
                transformer = ProcessRecommendationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ProcessRecommendation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ProcessRecommendation");

        com.oracle.bmc.responses.AsyncHandler<
                        ProcessRecommendationRequest, ProcessRecommendationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ProcessRecommendationRequest, ProcessRecommendationResponse>,
                        java.util.concurrent.Future<ProcessRecommendationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getProcessRecommendationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ProcessRecommendationRequest, ProcessRecommendationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecommendationsResponse> recommendations(
            RecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecommendationsRequest, RecommendationsResponse>
                    handler) {
        LOG.trace("Called async recommendations");
        final RecommendationsRequest interceptedRequest =
                RecommendationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecommendationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RecommendationsResponse>
                transformer = RecommendationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "Recommendations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/Recommendations");

        com.oracle.bmc.responses.AsyncHandler<RecommendationsRequest, RecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecommendationsRequest, RecommendationsResponse>,
                        java.util.concurrent.Future<RecommendationsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecommendationsRequest, RecommendationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDataSelectorPatternsResponse>
            removeDataSelectorPatterns(
                    RemoveDataSelectorPatternsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDataSelectorPatternsRequest,
                                    RemoveDataSelectorPatternsResponse>
                            handler) {
        LOG.trace("Called async removeDataSelectorPatterns");
        final RemoveDataSelectorPatternsRequest interceptedRequest =
                RemoveDataSelectorPatternsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDataSelectorPatternsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemoveDataSelectorPatternsResponse>
                transformer = RemoveDataSelectorPatternsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "RemoveDataSelectorPatterns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/RemoveDataSelectorPatterns");

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDataSelectorPatternsRequest, RemoveDataSelectorPatternsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDataSelectorPatternsRequest,
                                RemoveDataSelectorPatternsResponse>,
                        java.util.concurrent.Future<RemoveDataSelectorPatternsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDataSelectorPatternDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDataSelectorPatternsRequest, RemoveDataSelectorPatternsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchCriteriaResponse> searchCriteria(
            SearchCriteriaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCriteriaRequest, SearchCriteriaResponse>
                    handler) {
        LOG.trace("Called async searchCriteria");
        final SearchCriteriaRequest interceptedRequest =
                SearchCriteriaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCriteriaConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, SearchCriteriaResponse>
                transformer = SearchCriteriaConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "SearchCriteria",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/SearchResult/SearchCriteria");

        com.oracle.bmc.responses.AsyncHandler<SearchCriteriaRequest, SearchCriteriaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchCriteriaRequest, SearchCriteriaResponse>,
                        java.util.concurrent.Future<SearchCriteriaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchCriteriaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchCriteriaRequest, SearchCriteriaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SuggestMatchesResponse> suggestMatches(
            SuggestMatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuggestMatchesRequest, SuggestMatchesResponse>
                    handler) {
        LOG.trace("Called async suggestMatches");
        final SuggestMatchesRequest interceptedRequest =
                SuggestMatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuggestMatchesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, SuggestMatchesResponse>
                transformer = SuggestMatchesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "SuggestMatches",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/SuggestResults/SuggestMatches");

        com.oracle.bmc.responses.AsyncHandler<SuggestMatchesRequest, SuggestMatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SuggestMatchesRequest, SuggestMatchesResponse>,
                        java.util.concurrent.Future<SuggestMatchesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SuggestMatchesRequest, SuggestMatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SynchronousExportDataAssetResponse>
            synchronousExportDataAsset(
                    SynchronousExportDataAssetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SynchronousExportDataAssetRequest,
                                    SynchronousExportDataAssetResponse>
                            handler) {
        LOG.trace("Called async synchronousExportDataAsset");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "synchronousExportDataAsset returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final SynchronousExportDataAssetRequest interceptedRequest =
                SynchronousExportDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SynchronousExportDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SynchronousExportDataAssetResponse>
                transformer = SynchronousExportDataAssetConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "SynchronousExportDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/SynchronousExportDataAsset");

        com.oracle.bmc.responses.AsyncHandler<
                        SynchronousExportDataAssetRequest, SynchronousExportDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SynchronousExportDataAssetRequest,
                                SynchronousExportDataAssetResponse>,
                        java.util.concurrent.Future<SynchronousExportDataAssetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSynchronousExportDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SynchronousExportDataAssetRequest, SynchronousExportDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResponse> testConnection(
            TestConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestConnectionRequest, TestConnectionResponse>
                    handler) {
        LOG.trace("Called async testConnection");
        final TestConnectionRequest interceptedRequest =
                TestConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, TestConnectionResponse>
                transformer = TestConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "TestConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/TestConnection");

        com.oracle.bmc.responses.AsyncHandler<TestConnectionRequest, TestConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestConnectionRequest, TestConnectionResponse>,
                        java.util.concurrent.Future<TestConnectionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestConnectionRequest, TestConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAttributeResponse> updateAttribute(
            UpdateAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAttributeRequest, UpdateAttributeResponse>
                    handler) {
        LOG.trace("Called async updateAttribute");
        final UpdateAttributeRequest interceptedRequest =
                UpdateAttributeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAttributeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAttributeResponse>
                transformer = UpdateAttributeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateAttribute",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/UpdateAttribute");

        com.oracle.bmc.responses.AsyncHandler<UpdateAttributeRequest, UpdateAttributeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAttributeRequest, UpdateAttributeResponse>,
                        java.util.concurrent.Future<UpdateAttributeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAttributeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAttributeRequest, UpdateAttributeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCatalogResponse> updateCatalog(
            UpdateCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse>
                    handler) {
        LOG.trace("Called async updateCatalog");
        final UpdateCatalogRequest interceptedRequest =
                UpdateCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCatalogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCatalogResponse>
                transformer = UpdateCatalogConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateCatalog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/UpdateCatalog");

        com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCatalogRequest, UpdateCatalogResponse>,
                        java.util.concurrent.Future<UpdateCatalogResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCatalogDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCatalogRequest, UpdateCatalogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCatalogPrivateEndpointResponse>
            updateCatalogPrivateEndpoint(
                    UpdateCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCatalogPrivateEndpointRequest,
                                    UpdateCatalogPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateCatalogPrivateEndpoint");
        final UpdateCatalogPrivateEndpointRequest interceptedRequest =
                UpdateCatalogPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCatalogPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCatalogPrivateEndpointResponse>
                transformer = UpdateCatalogPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateCatalogPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/UpdateCatalogPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCatalogPrivateEndpointRequest, UpdateCatalogPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCatalogPrivateEndpointRequest,
                                UpdateCatalogPrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateCatalogPrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCatalogPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCatalogPrivateEndpointRequest, UpdateCatalogPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {
        LOG.trace("Called async updateConnection");
        final UpdateConnectionRequest interceptedRequest =
                UpdateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateConnectionResponse>
                transformer = UpdateConnectionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/UpdateConnection");

        com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConnectionRequest, UpdateConnectionResponse>,
                        java.util.concurrent.Future<UpdateConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConnectionRequest, UpdateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomPropertyResponse> updateCustomProperty(
            UpdateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>
                    handler) {
        LOG.trace("Called async updateCustomProperty");
        final UpdateCustomPropertyRequest interceptedRequest =
                UpdateCustomPropertyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomPropertyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCustomPropertyResponse>
                transformer = UpdateCustomPropertyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateCustomProperty",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/UpdateCustomProperty");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>,
                        java.util.concurrent.Future<UpdateCustomPropertyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCustomPropertyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler) {
        LOG.trace("Called async updateDataAsset");
        final UpdateDataAssetRequest interceptedRequest =
                UpdateDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataAssetConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDataAssetResponse>
                transformer = UpdateDataAssetConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/UpdateDataAsset");

        com.oracle.bmc.responses.AsyncHandler<UpdateDataAssetRequest, UpdateDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataAssetRequest, UpdateDataAssetResponse>,
                        java.util.concurrent.Future<UpdateDataAssetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataAssetRequest, UpdateDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateEntityResponse> updateEntity(
            UpdateEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateEntityRequest, UpdateEntityResponse>
                    handler) {
        LOG.trace("Called async updateEntity");
        final UpdateEntityRequest interceptedRequest =
                UpdateEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEntityConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateEntityResponse>
                transformer = UpdateEntityConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateEntity",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/UpdateEntity");

        com.oracle.bmc.responses.AsyncHandler<UpdateEntityRequest, UpdateEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateEntityRequest, UpdateEntityResponse>,
                        java.util.concurrent.Future<UpdateEntityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateEntityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateEntityRequest, UpdateEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler) {
        LOG.trace("Called async updateFolder");
        final UpdateFolderRequest interceptedRequest =
                UpdateFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFolderConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateFolderResponse>
                transformer = UpdateFolderConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/UpdateFolder");

        com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFolderRequest, UpdateFolderResponse>,
                        java.util.concurrent.Future<UpdateFolderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFolderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFolderRequest, UpdateFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGlossaryResponse> updateGlossary(
            UpdateGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGlossaryRequest, UpdateGlossaryResponse>
                    handler) {
        LOG.trace("Called async updateGlossary");
        final UpdateGlossaryRequest interceptedRequest =
                UpdateGlossaryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGlossaryConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGlossaryResponse>
                transformer = UpdateGlossaryConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateGlossary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/UpdateGlossary");

        com.oracle.bmc.responses.AsyncHandler<UpdateGlossaryRequest, UpdateGlossaryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGlossaryRequest, UpdateGlossaryResponse>,
                        java.util.concurrent.Future<UpdateGlossaryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateGlossaryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGlossaryRequest, UpdateGlossaryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {
        LOG.trace("Called async updateJob");
        final UpdateJobRequest interceptedRequest = UpdateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJobResponse>
                transformer = UpdateJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/UpdateJob");

        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>,
                        java.util.concurrent.Future<UpdateJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRequest, UpdateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobDefinitionResponse> updateJobDefinition(
            UpdateJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>
                    handler) {
        LOG.trace("Called async updateJobDefinition");
        final UpdateJobDefinitionRequest interceptedRequest =
                UpdateJobDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateJobDefinitionResponse>
                transformer = UpdateJobDefinitionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateJobDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/UpdateJobDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>,
                        java.util.concurrent.Future<UpdateJobDefinitionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMetastoreResponse> updateMetastore(
            UpdateMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMetastoreRequest, UpdateMetastoreResponse>
                    handler) {
        LOG.trace("Called async updateMetastore");
        final UpdateMetastoreRequest interceptedRequest =
                UpdateMetastoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMetastoreConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateMetastoreResponse>
                transformer = UpdateMetastoreConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateMetastore",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/UpdateMetastore");

        com.oracle.bmc.responses.AsyncHandler<UpdateMetastoreRequest, UpdateMetastoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMetastoreRequest, UpdateMetastoreResponse>,
                        java.util.concurrent.Future<UpdateMetastoreResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMetastoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMetastoreRequest, UpdateMetastoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceResponse> updateNamespace(
            UpdateNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceRequest, UpdateNamespaceResponse>
                    handler) {
        LOG.trace("Called async updateNamespace");
        final UpdateNamespaceRequest interceptedRequest =
                UpdateNamespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateNamespaceResponse>
                transformer = UpdateNamespaceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateNamespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/UpdateNamespace");

        com.oracle.bmc.responses.AsyncHandler<UpdateNamespaceRequest, UpdateNamespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNamespaceRequest, UpdateNamespaceResponse>,
                        java.util.concurrent.Future<UpdateNamespaceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNamespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNamespaceRequest, UpdateNamespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePatternResponse> updatePattern(
            UpdatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePatternRequest, UpdatePatternResponse>
                    handler) {
        LOG.trace("Called async updatePattern");
        final UpdatePatternRequest interceptedRequest =
                UpdatePatternConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePatternConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePatternResponse>
                transformer = UpdatePatternConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdatePattern",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/UpdatePattern");

        com.oracle.bmc.responses.AsyncHandler<UpdatePatternRequest, UpdatePatternResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePatternRequest, UpdatePatternResponse>,
                        java.util.concurrent.Future<UpdatePatternResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePatternDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePatternRequest, UpdatePatternResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTermResponse> updateTerm(
            UpdateTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTermRequest, UpdateTermResponse>
                    handler) {
        LOG.trace("Called async updateTerm");
        final UpdateTermRequest interceptedRequest = UpdateTermConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTermResponse>
                transformer = UpdateTermConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateTerm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/UpdateTerm");

        com.oracle.bmc.responses.AsyncHandler<UpdateTermRequest, UpdateTermResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTermRequest, UpdateTermResponse>,
                        java.util.concurrent.Future<UpdateTermResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTermDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTermRequest, UpdateTermResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTermRelationshipResponse> updateTermRelationship(
            UpdateTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>
                    handler) {
        LOG.trace("Called async updateTermRelationship");
        final UpdateTermRelationshipRequest interceptedRequest =
                UpdateTermRelationshipConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermRelationshipConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTermRelationshipResponse>
                transformer = UpdateTermRelationshipConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UpdateTermRelationship",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/UpdateTermRelationship");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>,
                        java.util.concurrent.Future<UpdateTermRelationshipResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTermRelationshipDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadCredentialsResponse> uploadCredentials(
            UploadCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadCredentialsRequest, UploadCredentialsResponse>
                    handler) {
        LOG.trace("Called async uploadCredentials");
        final UploadCredentialsRequest interceptedRequest =
                UploadCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadCredentialsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UploadCredentialsResponse>
                transformer = UploadCredentialsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "UploadCredentials",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/UploadCredentials");

        com.oracle.bmc.responses.AsyncHandler<UploadCredentialsRequest, UploadCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadCredentialsRequest, UploadCredentialsResponse>,
                        java.util.concurrent.Future<UploadCredentialsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadCredentialsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadCredentialsRequest, UploadCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UsersResponse> users(
            UsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UsersRequest, UsersResponse> handler) {
        LOG.trace("Called async users");
        final UsersRequest interceptedRequest = UsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UsersResponse>
                transformer = UsersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "Users",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/Users");

        com.oracle.bmc.responses.AsyncHandler<UsersRequest, UsersResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UsersRequest, UsersResponse>,
                        java.util.concurrent.Future<UsersResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UsersRequest, UsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateConnectionResponse> validateConnection(
            ValidateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateConnectionRequest, ValidateConnectionResponse>
                    handler) {
        LOG.trace("Called async validateConnection");
        final ValidateConnectionRequest interceptedRequest =
                ValidateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateConnectionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ValidateConnectionResponse>
                transformer = ValidateConnectionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ValidateConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ValidateConnection");

        com.oracle.bmc.responses.AsyncHandler<ValidateConnectionRequest, ValidateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateConnectionRequest, ValidateConnectionResponse>,
                        java.util.concurrent.Future<ValidateConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getValidateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateConnectionRequest, ValidateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidatePatternResponse> validatePattern(
            ValidatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidatePatternRequest, ValidatePatternResponse>
                    handler) {
        LOG.trace("Called async validatePattern");
        final ValidatePatternRequest interceptedRequest =
                ValidatePatternConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidatePatternConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ValidatePatternResponse>
                transformer = ValidatePatternConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataCatalog",
                "ValidatePattern",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ValidatePattern");

        com.oracle.bmc.responses.AsyncHandler<ValidatePatternRequest, ValidatePatternResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidatePatternRequest, ValidatePatternResponse>,
                        java.util.concurrent.Future<ValidatePatternResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getValidatePatternDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidatePatternRequest, ValidatePatternResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
