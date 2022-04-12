/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.internal.http.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Async client implementation for DataSafe service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public class DataSafeAsyncClient implements DataSafeAsync {
    /**
     * Service instance for DataSafe.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASAFE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
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
    public DataSafeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
    public DataSafeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeAsyncClient> {
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
        public DataSafeAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DataSafeAsyncClient(
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
    public java.util.concurrent.Future<ActivateTargetDatabaseResponse> activateTargetDatabase(
            ActivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async activateTargetDatabase");
        final ActivateTargetDatabaseRequest interceptedRequest =
                ActivateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ActivateTargetDatabaseResponse>
                transformer = ActivateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ActivateTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ActivateTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<
                        ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>,
                        java.util.concurrent.Future<ActivateTargetDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getActivateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse> addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                    handler) {
        LOG.trace("Called async addMaskingColumnsFromSdm");
        final AddMaskingColumnsFromSdmRequest interceptedRequest =
                AddMaskingColumnsFromSdmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddMaskingColumnsFromSdmConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddMaskingColumnsFromSdmResponse>
                transformer = AddMaskingColumnsFromSdmConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "AddMaskingColumnsFromSdm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/AddMaskingColumnsFromSdm");

        com.oracle.bmc.responses.AsyncHandler<
                        AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>,
                        java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse> applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async applyDiscoveryJobResults");
        final ApplyDiscoveryJobResultsRequest interceptedRequest =
                ApplyDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplyDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ApplyDiscoveryJobResultsResponse>
                transformer = ApplyDiscoveryJobResultsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ApplyDiscoveryJobResults",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ApplyDiscoveryJobResults");

        com.oracle.bmc.responses.AsyncHandler<
                        ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApplyDiscoveryJobResultsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>
            calculateAuditVolumeAvailable(
                    CalculateAuditVolumeAvailableRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeAvailableRequest,
                                    CalculateAuditVolumeAvailableResponse>
                            handler) {
        LOG.trace("Called async calculateAuditVolumeAvailable");
        final CalculateAuditVolumeAvailableRequest interceptedRequest =
                CalculateAuditVolumeAvailableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeAvailableConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeAvailableResponse>
                transformer = CalculateAuditVolumeAvailableConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CalculateAuditVolumeAvailable",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeAvailable");

        com.oracle.bmc.responses.AsyncHandler<
                        CalculateAuditVolumeAvailableRequest, CalculateAuditVolumeAvailableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CalculateAuditVolumeAvailableRequest,
                                CalculateAuditVolumeAvailableResponse>,
                        java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCalculateAuditVolumeAvailableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CalculateAuditVolumeAvailableRequest, CalculateAuditVolumeAvailableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>
            calculateAuditVolumeCollected(
                    CalculateAuditVolumeCollectedRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeCollectedRequest,
                                    CalculateAuditVolumeCollectedResponse>
                            handler) {
        LOG.trace("Called async calculateAuditVolumeCollected");
        final CalculateAuditVolumeCollectedRequest interceptedRequest =
                CalculateAuditVolumeCollectedConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeCollectedConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeCollectedResponse>
                transformer = CalculateAuditVolumeCollectedConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CalculateAuditVolumeCollected",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeCollected");

        com.oracle.bmc.responses.AsyncHandler<
                        CalculateAuditVolumeCollectedRequest, CalculateAuditVolumeCollectedResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CalculateAuditVolumeCollectedRequest,
                                CalculateAuditVolumeCollectedResponse>,
                        java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCalculateAuditVolumeCollectedDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CalculateAuditVolumeCollectedRequest, CalculateAuditVolumeCollectedResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {
        LOG.trace("Called async cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer = CancelWorkRequestConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CancelWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/CancelWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<CancelWorkRequestRequest, CancelWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelWorkRequestRequest, CancelWorkRequestResponse>,
                        java.util.concurrent.Future<CancelWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelWorkRequestRequest, CancelWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAlertCompartmentResponse> changeAlertCompartment(
            ChangeAlertCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeAlertCompartment");
        final ChangeAlertCompartmentRequest interceptedRequest =
                ChangeAlertCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAlertCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAlertCompartmentResponse>
                transformer = ChangeAlertCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeAlertCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/ChangeAlertCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAlertCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAlertCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>
            changeAuditArchiveRetrievalCompartment(
                    ChangeAuditArchiveRetrievalCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditArchiveRetrievalCompartmentRequest,
                                    ChangeAuditArchiveRetrievalCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditArchiveRetrievalCompartment");
        final ChangeAuditArchiveRetrievalCompartmentRequest interceptedRequest =
                ChangeAuditArchiveRetrievalCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditArchiveRetrievalCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditArchiveRetrievalCompartmentResponse>
                transformer = ChangeAuditArchiveRetrievalCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeAuditArchiveRetrievalCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ChangeAuditArchiveRetrievalCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditArchiveRetrievalCompartmentRequest,
                        ChangeAuditArchiveRetrievalCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditArchiveRetrievalCompartmentRequest,
                                ChangeAuditArchiveRetrievalCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeAuditArchiveRetrievalCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditArchiveRetrievalCompartmentRequest,
                    ChangeAuditArchiveRetrievalCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse>
            changeAuditPolicyCompartment(
                    ChangeAuditPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditPolicyCompartmentRequest,
                                    ChangeAuditPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditPolicyCompartment");
        final ChangeAuditPolicyCompartmentRequest interceptedRequest =
                ChangeAuditPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditPolicyCompartmentResponse>
                transformer = ChangeAuditPolicyCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeAuditPolicyCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ChangeAuditPolicyCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditPolicyCompartmentRequest, ChangeAuditPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditPolicyCompartmentRequest,
                                ChangeAuditPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAuditPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditPolicyCompartmentRequest, ChangeAuditPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>
            changeAuditProfileCompartment(
                    ChangeAuditProfileCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditProfileCompartmentRequest,
                                    ChangeAuditProfileCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeAuditProfileCompartment");
        final ChangeAuditProfileCompartmentRequest interceptedRequest =
                ChangeAuditProfileCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditProfileCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditProfileCompartmentResponse>
                transformer = ChangeAuditProfileCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeAuditProfileCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeAuditProfileCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAuditProfileCompartmentRequest, ChangeAuditProfileCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAuditProfileCompartmentRequest,
                                ChangeAuditProfileCompartmentResponse>,
                        java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAuditProfileCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAuditProfileCompartmentRequest, ChangeAuditProfileCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSafePrivateEndpointCompartmentResponse>
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSafePrivateEndpointCompartmentRequest,
                                    ChangeDataSafePrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDataSafePrivateEndpointCompartment");
        final ChangeDataSafePrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDataSafePrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDataSafePrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDataSafePrivateEndpointCompartmentResponse>
                transformer = ChangeDataSafePrivateEndpointCompartmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeDataSafePrivateEndpointCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/ChangeDataSafePrivateEndpointCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDataSafePrivateEndpointCompartmentRequest,
                        ChangeDataSafePrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDataSafePrivateEndpointCompartmentRequest,
                                ChangeDataSafePrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDataSafePrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDataSafePrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDataSafePrivateEndpointCompartmentRequest,
                    ChangeDataSafePrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>
            changeDiscoveryJobCompartment(
                    ChangeDiscoveryJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryJobCompartmentRequest,
                                    ChangeDiscoveryJobCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDiscoveryJobCompartment");
        final ChangeDiscoveryJobCompartmentRequest interceptedRequest =
                ChangeDiscoveryJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDiscoveryJobCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDiscoveryJobCompartmentResponse>
                transformer = ChangeDiscoveryJobCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeDiscoveryJobCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ChangeDiscoveryJobCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDiscoveryJobCompartmentRequest, ChangeDiscoveryJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDiscoveryJobCompartmentRequest,
                                ChangeDiscoveryJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDiscoveryJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDiscoveryJobCompartmentRequest, ChangeDiscoveryJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>
            changeLibraryMaskingFormatCompartment(
                    ChangeLibraryMaskingFormatCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLibraryMaskingFormatCompartmentRequest,
                                    ChangeLibraryMaskingFormatCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLibraryMaskingFormatCompartment");
        final ChangeLibraryMaskingFormatCompartmentRequest interceptedRequest =
                ChangeLibraryMaskingFormatCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLibraryMaskingFormatCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeLibraryMaskingFormatCompartmentResponse>
                transformer = ChangeLibraryMaskingFormatCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeLibraryMaskingFormatCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/ChangeLibraryMaskingFormatCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLibraryMaskingFormatCompartmentRequest,
                        ChangeLibraryMaskingFormatCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLibraryMaskingFormatCompartmentRequest,
                                ChangeLibraryMaskingFormatCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeLibraryMaskingFormatCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLibraryMaskingFormatCompartmentRequest,
                    ChangeLibraryMaskingFormatCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>
            changeMaskingPolicyCompartment(
                    ChangeMaskingPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyCompartmentRequest,
                                    ChangeMaskingPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMaskingPolicyCompartment");
        final ChangeMaskingPolicyCompartmentRequest interceptedRequest =
                ChangeMaskingPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMaskingPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeMaskingPolicyCompartmentResponse>
                transformer = ChangeMaskingPolicyCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeMaskingPolicyCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ChangeMaskingPolicyCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMaskingPolicyCompartmentRequest,
                        ChangeMaskingPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMaskingPolicyCompartmentRequest,
                                ChangeMaskingPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMaskingPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMaskingPolicyCompartmentRequest, ChangeMaskingPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>
            changeOnPremConnectorCompartment(
                    ChangeOnPremConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOnPremConnectorCompartmentRequest,
                                    ChangeOnPremConnectorCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeOnPremConnectorCompartment");
        final ChangeOnPremConnectorCompartmentRequest interceptedRequest =
                ChangeOnPremConnectorCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOnPremConnectorCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeOnPremConnectorCompartmentResponse>
                transformer = ChangeOnPremConnectorCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeOnPremConnectorCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/ChangeOnPremConnectorCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeOnPremConnectorCompartmentRequest,
                        ChangeOnPremConnectorCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeOnPremConnectorCompartmentRequest,
                                ChangeOnPremConnectorCompartmentResponse>,
                        java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeOnPremConnectorCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeOnPremConnectorCompartmentRequest,
                    ChangeOnPremConnectorCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeReportCompartmentResponse> changeReportCompartment(
            ChangeReportCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeReportCompartment");
        final ChangeReportCompartmentRequest interceptedRequest =
                ChangeReportCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeReportCompartmentResponse>
                transformer = ChangeReportCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeReportCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/ChangeReportCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>,
                        java.util.concurrent.Future<ChangeReportCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeReportCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>
            changeReportDefinitionCompartment(
                    ChangeReportDefinitionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReportDefinitionCompartmentRequest,
                                    ChangeReportDefinitionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeReportDefinitionCompartment");
        final ChangeReportDefinitionCompartmentRequest interceptedRequest =
                ChangeReportDefinitionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportDefinitionCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeReportDefinitionCompartmentResponse>
                transformer = ChangeReportDefinitionCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeReportDefinitionCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ChangeReportDefinitionCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeReportDefinitionCompartmentRequest,
                        ChangeReportDefinitionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeReportDefinitionCompartmentRequest,
                                ChangeReportDefinitionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeReportDefinitionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeReportDefinitionCompartmentRequest,
                    ChangeReportDefinitionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeRetentionResponse> changeRetention(
            ChangeRetentionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeRetentionRequest, ChangeRetentionResponse>
                    handler) {
        LOG.trace("Called async changeRetention");
        final ChangeRetentionRequest interceptedRequest =
                ChangeRetentionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRetentionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ChangeRetentionResponse>
                transformer = ChangeRetentionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeRetention",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeRetention");

        com.oracle.bmc.responses.AsyncHandler<ChangeRetentionRequest, ChangeRetentionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeRetentionRequest, ChangeRetentionResponse>,
                        java.util.concurrent.Future<ChangeRetentionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeRetentionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeRetentionRequest, ChangeRetentionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>
            changeSecurityAssessmentCompartment(
                    ChangeSecurityAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAssessmentCompartmentRequest,
                                    ChangeSecurityAssessmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityAssessmentCompartment");
        final ChangeSecurityAssessmentCompartmentRequest interceptedRequest =
                ChangeSecurityAssessmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityAssessmentCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSecurityAssessmentCompartmentResponse>
                transformer = ChangeSecurityAssessmentCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeSecurityAssessmentCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ChangeSecurityAssessmentCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityAssessmentCompartmentRequest,
                        ChangeSecurityAssessmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityAssessmentCompartmentRequest,
                                ChangeSecurityAssessmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityAssessmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityAssessmentCompartmentRequest,
                    ChangeSecurityAssessmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>
            changeSensitiveDataModelCompartment(
                    ChangeSensitiveDataModelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveDataModelCompartmentRequest,
                                    ChangeSensitiveDataModelCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSensitiveDataModelCompartment");
        final ChangeSensitiveDataModelCompartmentRequest interceptedRequest =
                ChangeSensitiveDataModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveDataModelCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveDataModelCompartmentResponse>
                transformer = ChangeSensitiveDataModelCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeSensitiveDataModelCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ChangeSensitiveDataModelCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSensitiveDataModelCompartmentRequest,
                        ChangeSensitiveDataModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSensitiveDataModelCompartmentRequest,
                                ChangeSensitiveDataModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSensitiveDataModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSensitiveDataModelCompartmentRequest,
                    ChangeSensitiveDataModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>
            changeSensitiveTypeCompartment(
                    ChangeSensitiveTypeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypeCompartmentRequest,
                                    ChangeSensitiveTypeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSensitiveTypeCompartment");
        final ChangeSensitiveTypeCompartmentRequest interceptedRequest =
                ChangeSensitiveTypeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveTypeCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveTypeCompartmentResponse>
                transformer = ChangeSensitiveTypeCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeSensitiveTypeCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ChangeSensitiveTypeCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSensitiveTypeCompartmentRequest,
                        ChangeSensitiveTypeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSensitiveTypeCompartmentRequest,
                                ChangeSensitiveTypeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSensitiveTypeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSensitiveTypeCompartmentRequest, ChangeSensitiveTypeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetAlertPolicyAssociationCompartmentResponse>
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                    ChangeTargetAlertPolicyAssociationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeTargetAlertPolicyAssociationCompartment");
        final ChangeTargetAlertPolicyAssociationCompartmentRequest interceptedRequest =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeTargetAlertPolicyAssociationCompartmentResponse>
                transformer = ChangeTargetAlertPolicyAssociationCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeTargetAlertPolicyAssociationCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/ChangeTargetAlertPolicyAssociationCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTargetAlertPolicyAssociationCompartmentRequest,
                        ChangeTargetAlertPolicyAssociationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                ChangeTargetAlertPolicyAssociationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeTargetAlertPolicyAssociationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeTargetAlertPolicyAssociationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                    ChangeTargetAlertPolicyAssociationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>
            changeTargetDatabaseCompartment(
                    ChangeTargetDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetDatabaseCompartmentRequest,
                                    ChangeTargetDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeTargetDatabaseCompartment");
        final ChangeTargetDatabaseCompartmentRequest interceptedRequest =
                ChangeTargetDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetDatabaseCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeTargetDatabaseCompartmentResponse>
                transformer = ChangeTargetDatabaseCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeTargetDatabaseCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ChangeTargetDatabaseCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTargetDatabaseCompartmentRequest,
                        ChangeTargetDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTargetDatabaseCompartmentRequest,
                                ChangeTargetDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeTargetDatabaseCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTargetDatabaseCompartmentRequest,
                    ChangeTargetDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>
            changeUserAssessmentCompartment(
                    ChangeUserAssessmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUserAssessmentCompartmentRequest,
                                    ChangeUserAssessmentCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeUserAssessmentCompartment");
        final ChangeUserAssessmentCompartmentRequest interceptedRequest =
                ChangeUserAssessmentCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeUserAssessmentCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeUserAssessmentCompartmentResponse>
                transformer = ChangeUserAssessmentCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ChangeUserAssessmentCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ChangeUserAssessmentCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeUserAssessmentCompartmentRequest,
                        ChangeUserAssessmentCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeUserAssessmentCompartmentRequest,
                                ChangeUserAssessmentCompartmentResponse>,
                        java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeUserAssessmentCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeUserAssessmentCompartmentRequest,
                    ChangeUserAssessmentCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompareSecurityAssessmentResponse> compareSecurityAssessment(
            CompareSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async compareSecurityAssessment");
        final CompareSecurityAssessmentRequest interceptedRequest =
                CompareSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompareSecurityAssessmentResponse>
                transformer = CompareSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CompareSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CompareSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompareSecurityAssessmentRequest,
                                CompareSecurityAssessmentResponse>,
                        java.util.concurrent.Future<CompareSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompareSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CompareUserAssessmentResponse> compareUserAssessment(
            CompareUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async compareUserAssessment");
        final CompareUserAssessmentRequest interceptedRequest =
                CompareUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompareUserAssessmentResponse>
                transformer = CompareUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CompareUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CompareUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CompareUserAssessmentRequest, CompareUserAssessmentResponse>,
                        java.util.concurrent.Future<CompareUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCompareUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CompareUserAssessmentRequest, CompareUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse>
            createAuditArchiveRetrieval(
                    CreateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuditArchiveRetrievalRequest,
                                    CreateAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async createAuditArchiveRetrieval");
        final CreateAuditArchiveRetrievalRequest interceptedRequest =
                CreateAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAuditArchiveRetrievalResponse>
                transformer = CreateAuditArchiveRetrievalConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe", "CreateAuditArchiveRetrieval", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateAuditArchiveRetrievalRequest, CreateAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuditArchiveRetrievalRequest,
                                CreateAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAuditArchiveRetrievalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuditArchiveRetrievalRequest, CreateAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>
            createDataSafePrivateEndpoint(
                    CreateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSafePrivateEndpointRequest,
                                    CreateDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDataSafePrivateEndpoint");
        final CreateDataSafePrivateEndpointRequest interceptedRequest =
                CreateDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataSafePrivateEndpointResponse>
                transformer = CreateDataSafePrivateEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateDataSafePrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/CreateDataSafePrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataSafePrivateEndpointRequest, CreateDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataSafePrivateEndpointRequest,
                                CreateDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataSafePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataSafePrivateEndpointRequest, CreateDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async createDiscoveryJob");
        final CreateDiscoveryJobRequest interceptedRequest =
                CreateDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDiscoveryJobResponse>
                transformer = CreateDiscoveryJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe", "CreateDiscoveryJob", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>,
                        java.util.concurrent.Future<CreateDiscoveryJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDiscoveryJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLibraryMaskingFormatResponse>
            createLibraryMaskingFormat(
                    CreateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLibraryMaskingFormatRequest,
                                    CreateLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async createLibraryMaskingFormat");
        final CreateLibraryMaskingFormatRequest interceptedRequest =
                CreateLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLibraryMaskingFormatResponse>
                transformer = CreateLibraryMaskingFormatConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateLibraryMaskingFormat",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/CreateLibraryMaskingFormat");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateLibraryMaskingFormatRequest, CreateLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLibraryMaskingFormatRequest,
                                CreateLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<CreateLibraryMaskingFormatResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLibraryMaskingFormatDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLibraryMaskingFormatRequest, CreateLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingColumnResponse> createMaskingColumn(
            CreateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async createMaskingColumn");
        final CreateMaskingColumnRequest interceptedRequest =
                CreateMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateMaskingColumnResponse>
                transformer = CreateMaskingColumnConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateMaskingColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/CreateMaskingColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMaskingColumnRequest, CreateMaskingColumnResponse>,
                        java.util.concurrent.Future<CreateMaskingColumnResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMaskingColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMaskingColumnRequest, CreateMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMaskingPolicyResponse> createMaskingPolicy(
            CreateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async createMaskingPolicy");
        final CreateMaskingPolicyRequest interceptedRequest =
                CreateMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateMaskingPolicyResponse>
                transformer = CreateMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/CreateMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>,
                        java.util.concurrent.Future<CreateMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOnPremConnectorResponse> createOnPremConnector(
            CreateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async createOnPremConnector");
        final CreateOnPremConnectorRequest interceptedRequest =
                CreateOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateOnPremConnectorResponse>
                transformer = CreateOnPremConnectorConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateOnPremConnector",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/CreateOnPremConnector");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>,
                        java.util.concurrent.Future<CreateOnPremConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOnPremConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateReportDefinitionResponse> createReportDefinition(
            CreateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async createReportDefinition");
        final CreateReportDefinitionRequest interceptedRequest =
                CreateReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReportDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateReportDefinitionResponse>
                transformer = CreateReportDefinitionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateReportDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/CreateReportDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateReportDefinitionRequest, CreateReportDefinitionResponse>,
                        java.util.concurrent.Future<CreateReportDefinitionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateReportDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateReportDefinitionRequest, CreateReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityAssessmentResponse> createSecurityAssessment(
            CreateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async createSecurityAssessment");
        final CreateSecurityAssessmentRequest interceptedRequest =
                CreateSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSecurityAssessmentResponse>
                transformer = CreateSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CreateSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>,
                        java.util.concurrent.Future<CreateSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveColumnResponse> createSensitiveColumn(
            CreateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async createSensitiveColumn");
        final CreateSensitiveColumnRequest interceptedRequest =
                CreateSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSensitiveColumnResponse>
                transformer = CreateSensitiveColumnConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateSensitiveColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/CreateSensitiveColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>,
                        java.util.concurrent.Future<CreateSensitiveColumnResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveDataModelResponse> createSensitiveDataModel(
            CreateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async createSensitiveDataModel");
        final CreateSensitiveDataModelRequest interceptedRequest =
                CreateSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSensitiveDataModelResponse>
                transformer = CreateSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/CreateSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>,
                        java.util.concurrent.Future<CreateSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSensitiveTypeResponse> createSensitiveType(
            CreateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async createSensitiveType");
        final CreateSensitiveTypeRequest interceptedRequest =
                CreateSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSensitiveTypeResponse>
                transformer = CreateSensitiveTypeConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe", "CreateSensitiveType", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>,
                        java.util.concurrent.Future<CreateSensitiveTypeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSensitiveTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>
            createTargetAlertPolicyAssociation(
                    CreateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetAlertPolicyAssociationRequest,
                                    CreateTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async createTargetAlertPolicyAssociation");
        final CreateTargetAlertPolicyAssociationRequest interceptedRequest =
                CreateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetAlertPolicyAssociationResponse>
                transformer = CreateTargetAlertPolicyAssociationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateTargetAlertPolicyAssociation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/CreateTargetAlertPolicyAssociation");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetAlertPolicyAssociationRequest,
                        CreateTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetAlertPolicyAssociationRequest,
                                CreateTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTargetAlertPolicyAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetAlertPolicyAssociationRequest,
                    CreateTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDatabaseResponse> createTargetDatabase(
            CreateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async createTargetDatabase");
        final CreateTargetDatabaseRequest interceptedRequest =
                CreateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetDatabaseResponse>
                transformer = CreateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/CreateTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>,
                        java.util.concurrent.Future<CreateTargetDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserAssessmentResponse> createUserAssessment(
            CreateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async createUserAssessment");
        final CreateUserAssessmentRequest interceptedRequest =
                CreateUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateUserAssessmentResponse>
                transformer = CreateUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "CreateUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CreateUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserAssessmentRequest, CreateUserAssessmentResponse>,
                        java.util.concurrent.Future<CreateUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserAssessmentRequest, CreateUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeactivateTargetDatabaseResponse> deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async deactivateTargetDatabase");
        final DeactivateTargetDatabaseRequest interceptedRequest =
                DeactivateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeactivateTargetDatabaseResponse>
                transformer = DeactivateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeactivateTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeactivateTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<
                        DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>,
                        java.util.concurrent.Future<DeactivateTargetDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse>
            deleteAuditArchiveRetrieval(
                    DeleteAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAuditArchiveRetrievalRequest,
                                    DeleteAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async deleteAuditArchiveRetrieval");
        final DeleteAuditArchiveRetrievalRequest interceptedRequest =
                DeleteAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAuditArchiveRetrievalResponse>
                transformer = DeleteAuditArchiveRetrievalConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteAuditArchiveRetrieval",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/DeleteAuditArchiveRetrieval");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAuditArchiveRetrievalRequest, DeleteAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuditArchiveRetrievalRequest,
                                DeleteAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuditArchiveRetrievalRequest, DeleteAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuditTrailResponse> deleteAuditTrail(
            DeleteAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                    handler) {
        LOG.trace("Called async deleteAuditTrail");
        final DeleteAuditTrailRequest interceptedRequest =
                DeleteAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAuditTrailResponse>
                transformer = DeleteAuditTrailConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/DeleteAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuditTrailRequest, DeleteAuditTrailResponse>,
                        java.util.concurrent.Future<DeleteAuditTrailResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuditTrailRequest, DeleteAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>
            deleteDataSafePrivateEndpoint(
                    DeleteDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSafePrivateEndpointRequest,
                                    DeleteDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDataSafePrivateEndpoint");
        final DeleteDataSafePrivateEndpointRequest interceptedRequest =
                DeleteDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDataSafePrivateEndpointResponse>
                transformer = DeleteDataSafePrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteDataSafePrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/DeleteDataSafePrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDataSafePrivateEndpointRequest, DeleteDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataSafePrivateEndpointRequest,
                                DeleteDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataSafePrivateEndpointRequest, DeleteDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async deleteDiscoveryJob");
        final DeleteDiscoveryJobRequest interceptedRequest =
                DeleteDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDiscoveryJobResponse>
                transformer = DeleteDiscoveryJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteDiscoveryJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/DeleteDiscoveryJob");

        com.oracle.bmc.responses.AsyncHandler<DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>,
                        java.util.concurrent.Future<DeleteDiscoveryJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResultResponse> deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                    handler) {
        LOG.trace("Called async deleteDiscoveryJobResult");
        final DeleteDiscoveryJobResultRequest interceptedRequest =
                DeleteDiscoveryJobResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDiscoveryJobResultResponse>
                transformer = DeleteDiscoveryJobResultConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteDiscoveryJobResult",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/DeleteDiscoveryJobResult");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>,
                        java.util.concurrent.Future<DeleteDiscoveryJobResultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse>
            deleteLibraryMaskingFormat(
                    DeleteLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLibraryMaskingFormatRequest,
                                    DeleteLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async deleteLibraryMaskingFormat");
        final DeleteLibraryMaskingFormatRequest interceptedRequest =
                DeleteLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLibraryMaskingFormatResponse>
                transformer = DeleteLibraryMaskingFormatConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteLibraryMaskingFormat",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/DeleteLibraryMaskingFormat");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLibraryMaskingFormatRequest, DeleteLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLibraryMaskingFormatRequest,
                                DeleteLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLibraryMaskingFormatRequest, DeleteLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingColumnResponse> deleteMaskingColumn(
            DeleteMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async deleteMaskingColumn");
        final DeleteMaskingColumnRequest interceptedRequest =
                DeleteMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteMaskingColumnResponse>
                transformer = DeleteMaskingColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteMaskingColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/DeleteMaskingColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>,
                        java.util.concurrent.Future<DeleteMaskingColumnResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMaskingPolicyResponse> deleteMaskingPolicy(
            DeleteMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async deleteMaskingPolicy");
        final DeleteMaskingPolicyRequest interceptedRequest =
                DeleteMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteMaskingPolicyResponse>
                transformer = DeleteMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DeleteMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>,
                        java.util.concurrent.Future<DeleteMaskingPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOnPremConnectorResponse> deleteOnPremConnector(
            DeleteOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async deleteOnPremConnector");
        final DeleteOnPremConnectorRequest interceptedRequest =
                DeleteOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteOnPremConnectorResponse>
                transformer = DeleteOnPremConnectorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteOnPremConnector",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/DeleteOnPremConnector");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>,
                        java.util.concurrent.Future<DeleteOnPremConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReportDefinitionResponse> deleteReportDefinition(
            DeleteReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async deleteReportDefinition");
        final DeleteReportDefinitionRequest interceptedRequest =
                DeleteReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReportDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteReportDefinitionResponse>
                transformer = DeleteReportDefinitionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteReportDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/DeleteReportDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>,
                        java.util.concurrent.Future<DeleteReportDefinitionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityAssessmentResponse> deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityAssessment");
        final DeleteSecurityAssessmentRequest interceptedRequest =
                DeleteSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSecurityAssessmentResponse>
                transformer = DeleteSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DeleteSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>,
                        java.util.concurrent.Future<DeleteSecurityAssessmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveColumnResponse> deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveColumn");
        final DeleteSensitiveColumnRequest interceptedRequest =
                DeleteSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSensitiveColumnResponse>
                transformer = DeleteSensitiveColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteSensitiveColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/DeleteSensitiveColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>,
                        java.util.concurrent.Future<DeleteSensitiveColumnResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveDataModelResponse> deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveDataModel");
        final DeleteSensitiveDataModelRequest interceptedRequest =
                DeleteSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSensitiveDataModelResponse>
                transformer = DeleteSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DeleteSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>,
                        java.util.concurrent.Future<DeleteSensitiveDataModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSensitiveTypeResponse> deleteSensitiveType(
            DeleteSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async deleteSensitiveType");
        final DeleteSensitiveTypeRequest interceptedRequest =
                DeleteSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteSensitiveTypeResponse>
                transformer = DeleteSensitiveTypeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteSensitiveType",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/DeleteSensitiveType");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>,
                        java.util.concurrent.Future<DeleteSensitiveTypeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>
            deleteTargetAlertPolicyAssociation(
                    DeleteTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetAlertPolicyAssociationRequest,
                                    DeleteTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async deleteTargetAlertPolicyAssociation");
        final DeleteTargetAlertPolicyAssociationRequest interceptedRequest =
                DeleteTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetAlertPolicyAssociationResponse>
                transformer = DeleteTargetAlertPolicyAssociationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteTargetAlertPolicyAssociation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/DeleteTargetAlertPolicyAssociation");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetAlertPolicyAssociationRequest,
                        DeleteTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetAlertPolicyAssociationRequest,
                                DeleteTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetAlertPolicyAssociationRequest,
                    DeleteTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDatabaseResponse> deleteTargetDatabase(
            DeleteTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async deleteTargetDatabase");
        final DeleteTargetDatabaseRequest interceptedRequest =
                DeleteTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetDatabaseResponse>
                transformer = DeleteTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeleteTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>,
                        java.util.concurrent.Future<DeleteTargetDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAssessmentResponse> deleteUserAssessment(
            DeleteUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async deleteUserAssessment");
        final DeleteUserAssessmentRequest interceptedRequest =
                DeleteUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteUserAssessmentResponse>
                transformer = DeleteUserAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DeleteUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DeleteUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>,
                        java.util.concurrent.Future<DeleteUserAssessmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DiscoverAuditTrailsResponse> discoverAuditTrails(
            DiscoverAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                    handler) {
        LOG.trace("Called async discoverAuditTrails");
        final DiscoverAuditTrailsRequest interceptedRequest =
                DiscoverAuditTrailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DiscoverAuditTrailsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DiscoverAuditTrailsResponse>
                transformer = DiscoverAuditTrailsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DiscoverAuditTrails",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/DiscoverAuditTrails");

        com.oracle.bmc.responses.AsyncHandler<
                        DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>,
                        java.util.concurrent.Future<DiscoverAuditTrailsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadDiscoveryReportResponse> downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                    handler) {
        LOG.trace("Called async downloadDiscoveryReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadDiscoveryReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadDiscoveryReportRequest interceptedRequest =
                DownloadDiscoveryReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadDiscoveryReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadDiscoveryReportResponse>
                transformer = DownloadDiscoveryReportConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadDiscoveryReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadDiscoveryReport");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>,
                        java.util.concurrent.Future<DownloadDiscoveryReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadDiscoveryReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingLogResponse> downloadMaskingLog(
            DownloadMaskingLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingLog");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingLog returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingLogRequest interceptedRequest =
                DownloadMaskingLogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingLogConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DownloadMaskingLogResponse>
                transformer = DownloadMaskingLogConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadMaskingLog",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingLog");

        com.oracle.bmc.responses.AsyncHandler<DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingLogRequest, DownloadMaskingLogResponse>,
                        java.util.concurrent.Future<DownloadMaskingLogResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingLogDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingLogRequest, DownloadMaskingLogResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingPolicyResponse> downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingPolicy");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingPolicy returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingPolicyRequest interceptedRequest =
                DownloadMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadMaskingPolicyResponse>
                transformer = DownloadMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>,
                        java.util.concurrent.Future<DownloadMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadMaskingReportResponse> downloadMaskingReport(
            DownloadMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                    handler) {
        LOG.trace("Called async downloadMaskingReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingReportRequest interceptedRequest =
                DownloadMaskingReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadMaskingReportResponse>
                transformer = DownloadMaskingReportConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadMaskingReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingReport");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadMaskingReportRequest, DownloadMaskingReportResponse>,
                        java.util.concurrent.Future<DownloadMaskingReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadMaskingReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadMaskingReportRequest, DownloadMaskingReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadPrivilegeScriptResponse> downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                    handler) {
        LOG.trace("Called async downloadPrivilegeScript");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadPrivilegeScript returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadPrivilegeScriptRequest interceptedRequest =
                DownloadPrivilegeScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadPrivilegeScriptConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadPrivilegeScriptResponse>
                transformer = DownloadPrivilegeScriptConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadPrivilegeScript",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DownloadPrivilegeScript");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>,
                        java.util.concurrent.Future<DownloadPrivilegeScriptResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>
            downloadSecurityAssessmentReport(
                    DownloadSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSecurityAssessmentReportRequest,
                                    DownloadSecurityAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async downloadSecurityAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadSecurityAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadSecurityAssessmentReportRequest interceptedRequest =
                DownloadSecurityAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadSecurityAssessmentReportResponse>
                transformer = DownloadSecurityAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadSecurityAssessmentReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DownloadSecurityAssessmentReport");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadSecurityAssessmentReportRequest,
                        DownloadSecurityAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadSecurityAssessmentReportRequest,
                                DownloadSecurityAssessmentReportResponse>,
                        java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadSecurityAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadSecurityAssessmentReportRequest,
                    DownloadSecurityAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadSensitiveDataModelResponse>
            downloadSensitiveDataModel(
                    DownloadSensitiveDataModelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSensitiveDataModelRequest,
                                    DownloadSensitiveDataModelResponse>
                            handler) {
        LOG.trace("Called async downloadSensitiveDataModel");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadSensitiveDataModel returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadSensitiveDataModelRequest interceptedRequest =
                DownloadSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadSensitiveDataModelResponse>
                transformer = DownloadSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadSensitiveDataModelRequest, DownloadSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadSensitiveDataModelRequest,
                                DownloadSensitiveDataModelResponse>,
                        java.util.concurrent.Future<DownloadSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadSensitiveDataModelRequest, DownloadSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DownloadUserAssessmentReportResponse>
            downloadUserAssessmentReport(
                    DownloadUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadUserAssessmentReportRequest,
                                    DownloadUserAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async downloadUserAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadUserAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadUserAssessmentReportRequest interceptedRequest =
                DownloadUserAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadUserAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadUserAssessmentReportResponse>
                transformer = DownloadUserAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "DownloadUserAssessmentReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DownloadUserAssessmentReport");

        com.oracle.bmc.responses.AsyncHandler<
                        DownloadUserAssessmentReportRequest, DownloadUserAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadUserAssessmentReportRequest,
                                DownloadUserAssessmentReportResponse>,
                        java.util.concurrent.Future<DownloadUserAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDownloadUserAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadUserAssessmentReportRequest, DownloadUserAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableDataSafeConfigurationResponse>
            enableDataSafeConfiguration(
                    EnableDataSafeConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableDataSafeConfigurationRequest,
                                    EnableDataSafeConfigurationResponse>
                            handler) {
        LOG.trace("Called async enableDataSafeConfiguration");
        final EnableDataSafeConfigurationRequest interceptedRequest =
                EnableDataSafeConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableDataSafeConfigurationResponse>
                transformer = EnableDataSafeConfigurationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "EnableDataSafeConfiguration",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/EnableDataSafeConfiguration");

        com.oracle.bmc.responses.AsyncHandler<
                        EnableDataSafeConfigurationRequest, EnableDataSafeConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableDataSafeConfigurationRequest,
                                EnableDataSafeConfigurationResponse>,
                        java.util.concurrent.Future<EnableDataSafeConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableDataSafeConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableDataSafeConfigurationRequest, EnableDataSafeConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>
            generateDiscoveryReportForDownload(
                    GenerateDiscoveryReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDiscoveryReportForDownloadRequest,
                                    GenerateDiscoveryReportForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateDiscoveryReportForDownload");
        final GenerateDiscoveryReportForDownloadRequest interceptedRequest =
                GenerateDiscoveryReportForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDiscoveryReportForDownloadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateDiscoveryReportForDownloadResponse>
                transformer = GenerateDiscoveryReportForDownloadConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateDiscoveryReportForDownload",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateDiscoveryReportForDownload");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDiscoveryReportForDownloadRequest,
                        GenerateDiscoveryReportForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDiscoveryReportForDownloadRequest,
                                GenerateDiscoveryReportForDownloadResponse>,
                        java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateDiscoveryReportForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDiscoveryReportForDownloadRequest,
                    GenerateDiscoveryReportForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>
            generateMaskingPolicyForDownload(
                    GenerateMaskingPolicyForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingPolicyForDownloadRequest,
                                    GenerateMaskingPolicyForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateMaskingPolicyForDownload");
        final GenerateMaskingPolicyForDownloadRequest interceptedRequest =
                GenerateMaskingPolicyForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingPolicyForDownloadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateMaskingPolicyForDownloadResponse>
                transformer = GenerateMaskingPolicyForDownloadConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateMaskingPolicyForDownload",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingPolicyForDownload");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateMaskingPolicyForDownloadRequest,
                        GenerateMaskingPolicyForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateMaskingPolicyForDownloadRequest,
                                GenerateMaskingPolicyForDownloadResponse>,
                        java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateMaskingPolicyForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateMaskingPolicyForDownloadRequest,
                    GenerateMaskingPolicyForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>
            generateMaskingReportForDownload(
                    GenerateMaskingReportForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingReportForDownloadRequest,
                                    GenerateMaskingReportForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateMaskingReportForDownload");
        final GenerateMaskingReportForDownloadRequest interceptedRequest =
                GenerateMaskingReportForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingReportForDownloadConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateMaskingReportForDownloadResponse>
                transformer = GenerateMaskingReportForDownloadConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateMaskingReportForDownload",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingReportForDownload");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateMaskingReportForDownloadRequest,
                        GenerateMaskingReportForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateMaskingReportForDownloadRequest,
                                GenerateMaskingReportForDownloadResponse>,
                        java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateMaskingReportForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateMaskingReportForDownloadRequest,
                    GenerateMaskingReportForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>
            generateOnPremConnectorConfiguration(
                    GenerateOnPremConnectorConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateOnPremConnectorConfigurationRequest,
                                    GenerateOnPremConnectorConfigurationResponse>
                            handler) {
        LOG.trace("Called async generateOnPremConnectorConfiguration");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "generateOnPremConnectorConfiguration returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GenerateOnPremConnectorConfigurationRequest interceptedRequest =
                GenerateOnPremConnectorConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateOnPremConnectorConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateOnPremConnectorConfigurationResponse>
                transformer = GenerateOnPremConnectorConfigurationConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateOnPremConnectorConfiguration",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GenerateOnPremConnectorConfiguration");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateOnPremConnectorConfigurationRequest,
                        GenerateOnPremConnectorConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateOnPremConnectorConfigurationRequest,
                                GenerateOnPremConnectorConfigurationResponse>,
                        java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateOnPremConnectorConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateOnPremConnectorConfigurationRequest,
                    GenerateOnPremConnectorConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateReportResponse> generateReport(
            GenerateReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateReportRequest, GenerateReportResponse>
                    handler) {
        LOG.trace("Called async generateReport");
        final GenerateReportRequest interceptedRequest =
                GenerateReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GenerateReportResponse>
                transformer = GenerateReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GenerateReport");

        com.oracle.bmc.responses.AsyncHandler<GenerateReportRequest, GenerateReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateReportRequest, GenerateReportResponse>,
                        java.util.concurrent.Future<GenerateReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateReportRequest, GenerateReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>
            generateSecurityAssessmentReport(
                    GenerateSecurityAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSecurityAssessmentReportRequest,
                                    GenerateSecurityAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async generateSecurityAssessmentReport");
        final GenerateSecurityAssessmentReportRequest interceptedRequest =
                GenerateSecurityAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateSecurityAssessmentReportResponse>
                transformer = GenerateSecurityAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateSecurityAssessmentReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GenerateSecurityAssessmentReport");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateSecurityAssessmentReportRequest,
                        GenerateSecurityAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateSecurityAssessmentReportRequest,
                                GenerateSecurityAssessmentReportResponse>,
                        java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateSecurityAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateSecurityAssessmentReportRequest,
                    GenerateSecurityAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>
            generateSensitiveDataModelForDownload(
                    GenerateSensitiveDataModelForDownloadRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSensitiveDataModelForDownloadRequest,
                                    GenerateSensitiveDataModelForDownloadResponse>
                            handler) {
        LOG.trace("Called async generateSensitiveDataModelForDownload");
        final GenerateSensitiveDataModelForDownloadRequest interceptedRequest =
                GenerateSensitiveDataModelForDownloadConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSensitiveDataModelForDownloadConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateSensitiveDataModelForDownloadResponse>
                transformer = GenerateSensitiveDataModelForDownloadConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateSensitiveDataModelForDownload",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateSensitiveDataModelForDownload");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateSensitiveDataModelForDownloadRequest,
                        GenerateSensitiveDataModelForDownloadResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateSensitiveDataModelForDownloadRequest,
                                GenerateSensitiveDataModelForDownloadResponse>,
                        java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getGenerateSensitiveDataModelForDownloadDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateSensitiveDataModelForDownloadRequest,
                    GenerateSensitiveDataModelForDownloadResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateUserAssessmentReportResponse>
            generateUserAssessmentReport(
                    GenerateUserAssessmentReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateUserAssessmentReportRequest,
                                    GenerateUserAssessmentReportResponse>
                            handler) {
        LOG.trace("Called async generateUserAssessmentReport");
        final GenerateUserAssessmentReportRequest interceptedRequest =
                GenerateUserAssessmentReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateUserAssessmentReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateUserAssessmentReportResponse>
                transformer = GenerateUserAssessmentReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GenerateUserAssessmentReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GenerateUserAssessmentReport");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateUserAssessmentReportRequest, GenerateUserAssessmentReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateUserAssessmentReportRequest,
                                GenerateUserAssessmentReportResponse>,
                        java.util.concurrent.Future<GenerateUserAssessmentReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateUserAssessmentReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateUserAssessmentReportRequest, GenerateUserAssessmentReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAlertResponse> getAlert(
            GetAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse>
                    handler) {
        LOG.trace("Called async getAlert");
        final GetAlertRequest interceptedRequest = GetAlertConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAlertResponse>
                transformer = GetAlertConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAlert",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/GetAlert");

        com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse>,
                        java.util.concurrent.Future<GetAlertResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAlertRequest, GetAlertResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAlertPolicyResponse> getAlertPolicy(
            GetAlertPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAlertPolicyRequest, GetAlertPolicyResponse>
                    handler) {
        LOG.trace("Called async getAlertPolicy");
        final GetAlertPolicyRequest interceptedRequest =
                GetAlertPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAlertPolicyResponse>
                transformer = GetAlertPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAlertPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/GetAlertPolicy");

        com.oracle.bmc.responses.AsyncHandler<GetAlertPolicyRequest, GetAlertPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAlertPolicyRequest, GetAlertPolicyResponse>,
                        java.util.concurrent.Future<GetAlertPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAlertPolicyRequest, GetAlertPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditArchiveRetrievalResponse> getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                    handler) {
        LOG.trace("Called async getAuditArchiveRetrieval");
        final GetAuditArchiveRetrievalRequest interceptedRequest =
                GetAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAuditArchiveRetrievalResponse>
                transformer = GetAuditArchiveRetrievalConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAuditArchiveRetrieval",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/GetAuditArchiveRetrieval");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<GetAuditArchiveRetrievalResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditPolicyResponse> getAuditPolicy(
            GetAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditPolicyRequest, GetAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async getAuditPolicy");
        final GetAuditPolicyRequest interceptedRequest =
                GetAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditPolicyResponse>
                transformer = GetAuditPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAuditPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/GetAuditPolicy");

        com.oracle.bmc.responses.AsyncHandler<GetAuditPolicyRequest, GetAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditPolicyRequest, GetAuditPolicyResponse>,
                        java.util.concurrent.Future<GetAuditPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditPolicyRequest, GetAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditProfileResponse> getAuditProfile(
            GetAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuditProfileRequest, GetAuditProfileResponse>
                    handler) {
        LOG.trace("Called async getAuditProfile");
        final GetAuditProfileRequest interceptedRequest =
                GetAuditProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditProfileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditProfileResponse>
                transformer = GetAuditProfileConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAuditProfile",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/GetAuditProfile");

        com.oracle.bmc.responses.AsyncHandler<GetAuditProfileRequest, GetAuditProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditProfileRequest, GetAuditProfileResponse>,
                        java.util.concurrent.Future<GetAuditProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditProfileRequest, GetAuditProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuditTrailResponse> getAuditTrail(
            GetAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                    handler) {
        LOG.trace("Called async getAuditTrail");
        final GetAuditTrailRequest interceptedRequest =
                GetAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditTrailResponse>
                transformer = GetAuditTrailConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/GetAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuditTrailRequest, GetAuditTrailResponse>,
                        java.util.concurrent.Future<GetAuditTrailResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuditTrailRequest, GetAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>
            getCompatibleFormatsForDataTypes(
                    GetCompatibleFormatsForDataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForDataTypesRequest,
                                    GetCompatibleFormatsForDataTypesResponse>
                            handler) {
        LOG.trace("Called async getCompatibleFormatsForDataTypes");
        final GetCompatibleFormatsForDataTypesRequest interceptedRequest =
                GetCompatibleFormatsForDataTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForDataTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForDataTypesResponse>
                transformer = GetCompatibleFormatsForDataTypesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetCompatibleFormatsForDataTypes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForDataTypes");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCompatibleFormatsForDataTypesRequest,
                        GetCompatibleFormatsForDataTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompatibleFormatsForDataTypesRequest,
                                GetCompatibleFormatsForDataTypesResponse>,
                        java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompatibleFormatsForDataTypesRequest,
                    GetCompatibleFormatsForDataTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>
            getCompatibleFormatsForSensitiveTypes(
                    GetCompatibleFormatsForSensitiveTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForSensitiveTypesRequest,
                                    GetCompatibleFormatsForSensitiveTypesResponse>
                            handler) {
        LOG.trace("Called async getCompatibleFormatsForSensitiveTypes");
        final GetCompatibleFormatsForSensitiveTypesRequest interceptedRequest =
                GetCompatibleFormatsForSensitiveTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForSensitiveTypesConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForSensitiveTypesResponse>
                transformer = GetCompatibleFormatsForSensitiveTypesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetCompatibleFormatsForSensitiveTypes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForSensitiveTypes");

        com.oracle.bmc.responses.AsyncHandler<
                        GetCompatibleFormatsForSensitiveTypesRequest,
                        GetCompatibleFormatsForSensitiveTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompatibleFormatsForSensitiveTypesRequest,
                                GetCompatibleFormatsForSensitiveTypesResponse>,
                        java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompatibleFormatsForSensitiveTypesRequest,
                    GetCompatibleFormatsForSensitiveTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSafeConfigurationResponse> getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                    handler) {
        LOG.trace("Called async getDataSafeConfiguration");
        final GetDataSafeConfigurationRequest interceptedRequest =
                GetDataSafeConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataSafeConfigurationResponse>
                transformer = GetDataSafeConfigurationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetDataSafeConfiguration",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/GetDataSafeConfiguration");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>,
                        java.util.concurrent.Future<GetDataSafeConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSafePrivateEndpointResponse>
            getDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSafePrivateEndpointRequest,
                                    GetDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDataSafePrivateEndpoint");
        final GetDataSafePrivateEndpointRequest interceptedRequest =
                GetDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataSafePrivateEndpointResponse>
                transformer = GetDataSafePrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetDataSafePrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/GetDataSafePrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSafePrivateEndpointRequest,
                                GetDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDataSafePrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async getDiscoveryJob");
        final GetDiscoveryJobRequest interceptedRequest =
                GetDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDiscoveryJobResponse>
                transformer = GetDiscoveryJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetDiscoveryJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/GetDiscoveryJob");

        com.oracle.bmc.responses.AsyncHandler<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDiscoveryJobRequest, GetDiscoveryJobResponse>,
                        java.util.concurrent.Future<GetDiscoveryJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDiscoveryJobRequest, GetDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResultResponse> getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                    handler) {
        LOG.trace("Called async getDiscoveryJobResult");
        final GetDiscoveryJobResultRequest interceptedRequest =
                GetDiscoveryJobResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDiscoveryJobResultResponse>
                transformer = GetDiscoveryJobResultConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetDiscoveryJobResult",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/GetDiscoveryJobResult");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>,
                        java.util.concurrent.Future<GetDiscoveryJobResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLibraryMaskingFormatResponse> getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                    handler) {
        LOG.trace("Called async getLibraryMaskingFormat");
        final GetLibraryMaskingFormatRequest interceptedRequest =
                GetLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetLibraryMaskingFormatResponse>
                transformer = GetLibraryMaskingFormatConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetLibraryMaskingFormat",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/GetLibraryMaskingFormat");

        com.oracle.bmc.responses.AsyncHandler<
                        GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<GetLibraryMaskingFormatResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingColumnResponse> getMaskingColumn(
            GetMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingColumnRequest, GetMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async getMaskingColumn");
        final GetMaskingColumnRequest interceptedRequest =
                GetMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingColumnResponse>
                transformer = GetMaskingColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetMaskingColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetMaskingColumn");

        com.oracle.bmc.responses.AsyncHandler<GetMaskingColumnRequest, GetMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingColumnRequest, GetMaskingColumnResponse>,
                        java.util.concurrent.Future<GetMaskingColumnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingColumnRequest, GetMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingPolicyResponse> getMaskingPolicy(
            GetMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async getMaskingPolicy");
        final GetMaskingPolicyRequest interceptedRequest =
                GetMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingPolicyResponse>
                transformer = GetMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GetMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingPolicyRequest, GetMaskingPolicyResponse>,
                        java.util.concurrent.Future<GetMaskingPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingPolicyRequest, GetMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMaskingReportResponse> getMaskingReport(
            GetMaskingReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaskingReportRequest, GetMaskingReportResponse>
                    handler) {
        LOG.trace("Called async getMaskingReport");
        final GetMaskingReportRequest interceptedRequest =
                GetMaskingReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingReportResponse>
                transformer = GetMaskingReportConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetMaskingReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingReport/GetMaskingReport");

        com.oracle.bmc.responses.AsyncHandler<GetMaskingReportRequest, GetMaskingReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMaskingReportRequest, GetMaskingReportResponse>,
                        java.util.concurrent.Future<GetMaskingReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMaskingReportRequest, GetMaskingReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOnPremConnectorResponse> getOnPremConnector(
            GetOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async getOnPremConnector");
        final GetOnPremConnectorRequest interceptedRequest =
                GetOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetOnPremConnectorResponse>
                transformer = GetOnPremConnectorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetOnPremConnector",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GetOnPremConnector");

        com.oracle.bmc.responses.AsyncHandler<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOnPremConnectorRequest, GetOnPremConnectorResponse>,
                        java.util.concurrent.Future<GetOnPremConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOnPremConnectorRequest, GetOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportResponse> getReport(
            GetReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse>
                    handler) {
        LOG.trace("Called async getReport");
        final GetReportRequest interceptedRequest = GetReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetReportResponse>
                transformer = GetReportConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReport");

        com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse>,
                        java.util.concurrent.Future<GetReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportRequest, GetReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportContentResponse> getReportContent(
            GetReportContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportContentRequest, GetReportContentResponse>
                    handler) {
        LOG.trace("Called async getReportContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getReportContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetReportContentRequest interceptedRequest =
                GetReportContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportContentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetReportContentResponse>
                transformer = GetReportContentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetReportContent",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReportContent");

        com.oracle.bmc.responses.AsyncHandler<GetReportContentRequest, GetReportContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReportContentRequest, GetReportContentResponse>,
                        java.util.concurrent.Future<GetReportContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportContentRequest, GetReportContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReportDefinitionResponse> getReportDefinition(
            GetReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReportDefinitionRequest, GetReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async getReportDefinition");
        final GetReportDefinitionRequest interceptedRequest =
                GetReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetReportDefinitionResponse>
                transformer = GetReportDefinitionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetReportDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GetReportDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        GetReportDefinitionRequest, GetReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReportDefinitionRequest, GetReportDefinitionResponse>,
                        java.util.concurrent.Future<GetReportDefinitionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReportDefinitionRequest, GetReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentResponse> getSecurityAssessment(
            GetSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async getSecurityAssessment");
        final GetSecurityAssessmentRequest interceptedRequest =
                GetSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentResponse>
                transformer = GetSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>,
                        java.util.concurrent.Future<GetSecurityAssessmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>
            getSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAssessmentComparisonRequest,
                                    GetSecurityAssessmentComparisonResponse>
                            handler) {
        LOG.trace("Called async getSecurityAssessmentComparison");
        final GetSecurityAssessmentComparisonRequest interceptedRequest =
                GetSecurityAssessmentComparisonConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentComparisonConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentComparisonResponse>
                transformer = GetSecurityAssessmentComparisonConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetSecurityAssessmentComparison",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessmentComparison");

        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityAssessmentComparisonRequest,
                        GetSecurityAssessmentComparisonResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityAssessmentComparisonRequest,
                                GetSecurityAssessmentComparisonResponse>,
                        java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityAssessmentComparisonRequest,
                    GetSecurityAssessmentComparisonResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveColumnResponse> getSensitiveColumn(
            GetSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async getSensitiveColumn");
        final GetSensitiveColumnRequest interceptedRequest =
                GetSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSensitiveColumnResponse>
                transformer = GetSensitiveColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetSensitiveColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/GetSensitiveColumn");

        com.oracle.bmc.responses.AsyncHandler<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveColumnRequest, GetSensitiveColumnResponse>,
                        java.util.concurrent.Future<GetSensitiveColumnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveColumnRequest, GetSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveDataModelResponse> getSensitiveDataModel(
            GetSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async getSensitiveDataModel");
        final GetSensitiveDataModelRequest interceptedRequest =
                GetSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSensitiveDataModelResponse>
                transformer = GetSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GetSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>,
                        java.util.concurrent.Future<GetSensitiveDataModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveTypeResponse> getSensitiveType(
            GetSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async getSensitiveType");
        final GetSensitiveTypeRequest interceptedRequest =
                GetSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSensitiveTypeResponse>
                transformer = GetSensitiveTypeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetSensitiveType",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/GetSensitiveType");

        com.oracle.bmc.responses.AsyncHandler<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSensitiveTypeRequest, GetSensitiveTypeResponse>,
                        java.util.concurrent.Future<GetSensitiveTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSensitiveTypeRequest, GetSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>
            getTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetAlertPolicyAssociationRequest,
                                    GetTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async getTargetAlertPolicyAssociation");
        final GetTargetAlertPolicyAssociationRequest interceptedRequest =
                GetTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetAlertPolicyAssociationResponse>
                transformer = GetTargetAlertPolicyAssociationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetTargetAlertPolicyAssociation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/GetTargetAlertPolicyAssociation");

        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetAlertPolicyAssociationRequest,
                        GetTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetAlertPolicyAssociationRequest,
                                GetTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetAlertPolicyAssociationRequest,
                    GetTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetDatabaseResponse> getTargetDatabase(
            GetTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async getTargetDatabase");
        final GetTargetDatabaseRequest interceptedRequest =
                GetTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTargetDatabaseResponse>
                transformer = GetTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/GetTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDatabaseRequest, GetTargetDatabaseResponse>,
                        java.util.concurrent.Future<GetTargetDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDatabaseRequest, GetTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentResponse> getUserAssessment(
            GetUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserAssessmentRequest, GetUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async getUserAssessment");
        final GetUserAssessmentRequest interceptedRequest =
                GetUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUserAssessmentResponse>
                transformer = GetUserAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<GetUserAssessmentRequest, GetUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserAssessmentRequest, GetUserAssessmentResponse>,
                        java.util.concurrent.Future<GetUserAssessmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserAssessmentRequest, GetUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserAssessmentComparisonResponse>
            getUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserAssessmentComparisonRequest,
                                    GetUserAssessmentComparisonResponse>
                            handler) {
        LOG.trace("Called async getUserAssessmentComparison");
        final GetUserAssessmentComparisonRequest interceptedRequest =
                GetUserAssessmentComparisonConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentComparisonConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserAssessmentComparisonResponse>
                transformer = GetUserAssessmentComparisonConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "GetUserAssessmentComparison",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessmentComparison");

        com.oracle.bmc.responses.AsyncHandler<
                        GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserAssessmentComparisonRequest,
                                GetUserAssessmentComparisonResponse>,
                        java.util.concurrent.Future<GetUserAssessmentComparisonResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                "DataSafe",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/GetWorkRequest");

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
    public java.util.concurrent.Future<ListAlertAnalyticsResponse> listAlertAnalytics(
            ListAlertAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAlertAnalytics");
        final ListAlertAnalyticsRequest interceptedRequest =
                ListAlertAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertAnalyticsResponse>
                transformer = ListAlertAnalyticsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAlertAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlertAnalytics");

        com.oracle.bmc.responses.AsyncHandler<ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>,
                        java.util.concurrent.Future<ListAlertAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertPoliciesResponse> listAlertPolicies(
            ListAlertPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                    handler) {
        LOG.trace("Called async listAlertPolicies");
        final ListAlertPoliciesRequest interceptedRequest =
                ListAlertPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertPoliciesResponse>
                transformer = ListAlertPoliciesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAlertPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicies");

        com.oracle.bmc.responses.AsyncHandler<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertPoliciesRequest, ListAlertPoliciesResponse>,
                        java.util.concurrent.Future<ListAlertPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertPoliciesRequest, ListAlertPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertPolicyRulesResponse> listAlertPolicyRules(
            ListAlertPolicyRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                    handler) {
        LOG.trace("Called async listAlertPolicyRules");
        final ListAlertPolicyRulesRequest interceptedRequest =
                ListAlertPolicyRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPolicyRulesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAlertPolicyRulesResponse>
                transformer = ListAlertPolicyRulesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAlertPolicyRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicyRules");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>,
                        java.util.concurrent.Future<ListAlertPolicyRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAlertsResponse> listAlerts(
            ListAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse>
                    handler) {
        LOG.trace("Called async listAlerts");
        final ListAlertsRequest interceptedRequest = ListAlertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertsResponse>
                transformer = ListAlertsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAlerts",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlerts");

        com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAlertsRequest, ListAlertsResponse>,
                        java.util.concurrent.Future<ListAlertsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAlertsRequest, ListAlertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse>
            listAuditArchiveRetrievals(
                    ListAuditArchiveRetrievalsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuditArchiveRetrievalsRequest,
                                    ListAuditArchiveRetrievalsResponse>
                            handler) {
        LOG.trace("Called async listAuditArchiveRetrievals");
        final ListAuditArchiveRetrievalsRequest interceptedRequest =
                ListAuditArchiveRetrievalsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditArchiveRetrievalsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditArchiveRetrievalsResponse>
                transformer = ListAuditArchiveRetrievalsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditArchiveRetrievals",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ListAuditArchiveRetrievals");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditArchiveRetrievalsRequest,
                                ListAuditArchiveRetrievalsResponse>,
                        java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventAnalyticsResponse> listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditEventAnalytics");
        final ListAuditEventAnalyticsRequest interceptedRequest =
                ListAuditEventAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditEventAnalyticsResponse>
                transformer = ListAuditEventAnalyticsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditEventAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEventAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditEventAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditEventsResponse> listAuditEvents(
            ListAuditEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventsRequest, ListAuditEventsResponse>
                    handler) {
        LOG.trace("Called async listAuditEvents");
        final ListAuditEventsRequest interceptedRequest =
                ListAuditEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditEventsResponse>
                transformer = ListAuditEventsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditEvents",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEvents");

        com.oracle.bmc.responses.AsyncHandler<ListAuditEventsRequest, ListAuditEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditEventsRequest, ListAuditEventsResponse>,
                        java.util.concurrent.Future<ListAuditEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditEventsRequest, ListAuditEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditPoliciesResponse> listAuditPolicies(
            ListAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                    handler) {
        LOG.trace("Called async listAuditPolicies");
        final ListAuditPoliciesRequest interceptedRequest =
                ListAuditPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditPoliciesResponse>
                transformer = ListAuditPoliciesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyCollection/ListAuditPolicies");

        com.oracle.bmc.responses.AsyncHandler<ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditPoliciesRequest, ListAuditPoliciesResponse>,
                        java.util.concurrent.Future<ListAuditPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditPoliciesRequest, ListAuditPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfileAnalyticsResponse> listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditProfileAnalytics");
        final ListAuditProfileAnalyticsRequest interceptedRequest =
                ListAuditProfileAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfileAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditProfileAnalyticsResponse>
                transformer = ListAuditProfileAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditProfileAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfileAnalyticCollection/ListAuditProfileAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditProfileAnalyticsRequest,
                                ListAuditProfileAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditProfileAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditProfilesResponse> listAuditProfiles(
            ListAuditProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfilesRequest, ListAuditProfilesResponse>
                    handler) {
        LOG.trace("Called async listAuditProfiles");
        final ListAuditProfilesRequest interceptedRequest =
                ListAuditProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfilesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditProfilesResponse>
                transformer = ListAuditProfilesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditProfiles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAuditProfiles");

        com.oracle.bmc.responses.AsyncHandler<ListAuditProfilesRequest, ListAuditProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditProfilesRequest, ListAuditProfilesResponse>,
                        java.util.concurrent.Future<ListAuditProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditProfilesRequest, ListAuditProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailAnalyticsResponse> listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listAuditTrailAnalytics");
        final ListAuditTrailAnalyticsRequest interceptedRequest =
                ListAuditTrailAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditTrailAnalyticsResponse>
                transformer = ListAuditTrailAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditTrailAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrailAnalyticCollection/ListAuditTrailAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>,
                        java.util.concurrent.Future<ListAuditTrailAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuditTrailsResponse> listAuditTrails(
            ListAuditTrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailsRequest, ListAuditTrailsResponse>
                    handler) {
        LOG.trace("Called async listAuditTrails");
        final ListAuditTrailsRequest interceptedRequest =
                ListAuditTrailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditTrailsResponse>
                transformer = ListAuditTrailsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAuditTrails",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ListAuditTrails");

        com.oracle.bmc.responses.AsyncHandler<ListAuditTrailsRequest, ListAuditTrailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuditTrailsRequest, ListAuditTrailsResponse>,
                        java.util.concurrent.Future<ListAuditTrailsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuditTrailsRequest, ListAuditTrailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAvailableAuditVolumesResponse> listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                    handler) {
        LOG.trace("Called async listAvailableAuditVolumes");
        final ListAvailableAuditVolumesRequest interceptedRequest =
                ListAvailableAuditVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableAuditVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailableAuditVolumesResponse>
                transformer = ListAvailableAuditVolumesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListAvailableAuditVolumes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAvailableAuditVolumes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAvailableAuditVolumesRequest,
                                ListAvailableAuditVolumesResponse>,
                        java.util.concurrent.Future<ListAvailableAuditVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCollectedAuditVolumesResponse> listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                    handler) {
        LOG.trace("Called async listCollectedAuditVolumes");
        final ListCollectedAuditVolumesRequest interceptedRequest =
                ListCollectedAuditVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCollectedAuditVolumesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCollectedAuditVolumesResponse>
                transformer = ListCollectedAuditVolumesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListCollectedAuditVolumes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListCollectedAuditVolumes");

        com.oracle.bmc.responses.AsyncHandler<
                        ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCollectedAuditVolumesRequest,
                                ListCollectedAuditVolumesResponse>,
                        java.util.concurrent.Future<ListCollectedAuditVolumesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListColumnsResponse> listColumns(
            ListColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse>
                    handler) {
        LOG.trace("Called async listColumns");
        final ListColumnsRequest interceptedRequest =
                ListColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListColumnsResponse>
                transformer = ListColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListColumns");

        com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListColumnsRequest, ListColumnsResponse>,
                        java.util.concurrent.Future<ListColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListColumnsRequest, ListColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpoints(
                    ListDataSafePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSafePrivateEndpointsRequest,
                                    ListDataSafePrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDataSafePrivateEndpoints");
        final ListDataSafePrivateEndpointsRequest interceptedRequest =
                ListDataSafePrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSafePrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataSafePrivateEndpointsResponse>
                transformer = ListDataSafePrivateEndpointsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListDataSafePrivateEndpoints",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpointSummary/ListDataSafePrivateEndpoints");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDataSafePrivateEndpointsRequest, ListDataSafePrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataSafePrivateEndpointsRequest,
                                ListDataSafePrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataSafePrivateEndpointsRequest, ListDataSafePrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryAnalyticsResponse> listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryAnalytics");
        final ListDiscoveryAnalyticsRequest interceptedRequest =
                ListDiscoveryAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDiscoveryAnalyticsResponse>
                transformer = ListDiscoveryAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListDiscoveryAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListDiscoveryAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>,
                        java.util.concurrent.Future<ListDiscoveryAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobResultsResponse> listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobResults");
        final ListDiscoveryJobResultsRequest interceptedRequest =
                ListDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDiscoveryJobResultsResponse>
                transformer = ListDiscoveryJobResultsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListDiscoveryJobResults",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobResults");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobs");
        final ListDiscoveryJobsRequest interceptedRequest =
                ListDiscoveryJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDiscoveryJobsResponse>
                transformer = ListDiscoveryJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListDiscoveryJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobs");

        com.oracle.bmc.responses.AsyncHandler<ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResponse> listFindings(
            ListFindingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                    handler) {
        LOG.trace("Called async listFindings");
        final ListFindingsRequest interceptedRequest =
                ListFindingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFindingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListFindingsResponse>
                transformer = ListFindingsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListFindings",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindings");

        com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFindingsRequest, ListFindingsResponse>,
                        java.util.concurrent.Future<ListFindingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFindingsRequest, ListFindingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResponse> listGrants(
            ListGrantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse>
                    handler) {
        LOG.trace("Called async listGrants");
        final ListGrantsRequest interceptedRequest = ListGrantsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGrantsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListGrantsResponse>
                transformer = ListGrantsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListGrants",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListGrants");

        com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGrantsRequest, ListGrantsResponse>,
                        java.util.concurrent.Future<ListGrantsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGrantsRequest, ListGrantsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                    handler) {
        LOG.trace("Called async listLibraryMaskingFormats");
        final ListLibraryMaskingFormatsRequest interceptedRequest =
                ListLibraryMaskingFormatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLibraryMaskingFormatsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLibraryMaskingFormatsResponse>
                transformer = ListLibraryMaskingFormatsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListLibraryMaskingFormats",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormatSummary/ListLibraryMaskingFormats");

        com.oracle.bmc.responses.AsyncHandler<
                        ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLibraryMaskingFormatsRequest,
                                ListLibraryMaskingFormatsResponse>,
                        java.util.concurrent.Future<ListLibraryMaskingFormatsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskedColumnsResponse> listMaskedColumns(
            ListMaskedColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                    handler) {
        LOG.trace("Called async listMaskedColumns");
        final ListMaskedColumnsRequest interceptedRequest =
                ListMaskedColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskedColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskedColumnsResponse>
                transformer = ListMaskedColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListMaskedColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskedColumnSummary/ListMaskedColumns");

        com.oracle.bmc.responses.AsyncHandler<ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskedColumnsRequest, ListMaskedColumnsResponse>,
                        java.util.concurrent.Future<ListMaskedColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskedColumnsRequest, ListMaskedColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingAnalyticsResponse> listMaskingAnalytics(
            ListMaskingAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listMaskingAnalytics");
        final ListMaskingAnalyticsRequest interceptedRequest =
                ListMaskingAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMaskingAnalyticsResponse>
                transformer = ListMaskingAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListMaskingAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingAnalytics");

        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>,
                        java.util.concurrent.Future<ListMaskingAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingColumnsResponse> listMaskingColumns(
            ListMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                    handler) {
        LOG.trace("Called async listMaskingColumns");
        final ListMaskingColumnsRequest interceptedRequest =
                ListMaskingColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingColumnsResponse>
                transformer = ListMaskingColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListMaskingColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/ListMaskingColumns");

        com.oracle.bmc.responses.AsyncHandler<ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingColumnsRequest, ListMaskingColumnsResponse>,
                        java.util.concurrent.Future<ListMaskingColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingColumnsRequest, ListMaskingColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingPoliciesResponse> listMaskingPolicies(
            ListMaskingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                    handler) {
        LOG.trace("Called async listMaskingPolicies");
        final ListMaskingPoliciesRequest interceptedRequest =
                ListMaskingPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListMaskingPoliciesResponse>
                transformer = ListMaskingPoliciesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListMaskingPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingPolicies");

        com.oracle.bmc.responses.AsyncHandler<
                        ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>,
                        java.util.concurrent.Future<ListMaskingPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMaskingReportsResponse> listMaskingReports(
            ListMaskingReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingReportsRequest, ListMaskingReportsResponse>
                    handler) {
        LOG.trace("Called async listMaskingReports");
        final ListMaskingReportsRequest interceptedRequest =
                ListMaskingReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingReportsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingReportsResponse>
                transformer = ListMaskingReportsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListMaskingReports",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingReports");

        com.oracle.bmc.responses.AsyncHandler<ListMaskingReportsRequest, ListMaskingReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMaskingReportsRequest, ListMaskingReportsResponse>,
                        java.util.concurrent.Future<ListMaskingReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMaskingReportsRequest, ListMaskingReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOnPremConnectorsResponse> listOnPremConnectors(
            ListOnPremConnectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                    handler) {
        LOG.trace("Called async listOnPremConnectors");
        final ListOnPremConnectorsRequest interceptedRequest =
                ListOnPremConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOnPremConnectorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListOnPremConnectorsResponse>
                transformer = ListOnPremConnectorsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListOnPremConnectors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnectorSummary/ListOnPremConnectors");

        com.oracle.bmc.responses.AsyncHandler<
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>,
                        java.util.concurrent.Future<ListOnPremConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReportDefinitionsResponse> listReportDefinitions(
            ListReportDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                    handler) {
        LOG.trace("Called async listReportDefinitions");
        final ListReportDefinitionsRequest interceptedRequest =
                ListReportDefinitionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportDefinitionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListReportDefinitionsResponse>
                transformer = ListReportDefinitionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListReportDefinitions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ListReportDefinitions");

        com.oracle.bmc.responses.AsyncHandler<
                        ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReportDefinitionsRequest, ListReportDefinitionsResponse>,
                        java.util.concurrent.Future<ListReportDefinitionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReportDefinitionsRequest, ListReportDefinitionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                    handler) {
        LOG.trace("Called async listReports");
        final ListReportsRequest interceptedRequest =
                ListReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListReportsResponse>
                transformer = ListReportsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListReports",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportSummary/ListReports");

        com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReportsRequest, ListReportsResponse>,
                        java.util.concurrent.Future<ListReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReportsRequest, ListReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>
                    handler) {
        LOG.trace("Called async listRoles");
        final ListRolesRequest interceptedRequest = ListRolesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRolesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRolesResponse>
                transformer = ListRolesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListRoles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListRoles");

        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>,
                        java.util.concurrent.Future<ListRolesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRolesRequest, ListRolesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {
        LOG.trace("Called async listSchemas");
        final ListSchemasRequest interceptedRequest =
                ListSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchemasConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer = ListSchemasConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListSchemas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListSchemas");

        com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchemasRequest, ListSchemasResponse>,
                        java.util.concurrent.Future<ListSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchemasRequest, ListSchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityAssessmentsResponse> listSecurityAssessments(
            ListSecurityAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                    handler) {
        LOG.trace("Called async listSecurityAssessments");
        final ListSecurityAssessmentsRequest interceptedRequest =
                ListSecurityAssessmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityAssessmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSecurityAssessmentsResponse>
                transformer = ListSecurityAssessmentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListSecurityAssessments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessmentSummary/ListSecurityAssessments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>,
                        java.util.concurrent.Future<ListSecurityAssessmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveColumnsResponse> listSensitiveColumns(
            ListSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                    handler) {
        LOG.trace("Called async listSensitiveColumns");
        final ListSensitiveColumnsRequest interceptedRequest =
                ListSensitiveColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSensitiveColumnsResponse>
                transformer = ListSensitiveColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListSensitiveColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/ListSensitiveColumns");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>,
                        java.util.concurrent.Future<ListSensitiveColumnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveDataModelsResponse> listSensitiveDataModels(
            ListSensitiveDataModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                    handler) {
        LOG.trace("Called async listSensitiveDataModels");
        final ListSensitiveDataModelsRequest interceptedRequest =
                ListSensitiveDataModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveDataModelsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSensitiveDataModelsResponse>
                transformer = ListSensitiveDataModelsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListSensitiveDataModels",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListSensitiveDataModels");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>,
                        java.util.concurrent.Future<ListSensitiveDataModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSensitiveTypesResponse> listSensitiveTypes(
            ListSensitiveTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                    handler) {
        LOG.trace("Called async listSensitiveTypes");
        final ListSensitiveTypesRequest interceptedRequest =
                ListSensitiveTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveTypesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListSensitiveTypesResponse>
                transformer = ListSensitiveTypesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListSensitiveTypes",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ListSensitiveTypes");

        com.oracle.bmc.responses.AsyncHandler<ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSensitiveTypesRequest, ListSensitiveTypesResponse>,
                        java.util.concurrent.Future<ListSensitiveTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSensitiveTypesRequest, ListSensitiveTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTablesResponse> listTables(
            ListTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse>
                    handler) {
        LOG.trace("Called async listTables");
        final ListTablesRequest interceptedRequest = ListTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTablesResponse>
                transformer = ListTablesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListTables",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListTables");

        com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTablesRequest, ListTablesResponse>,
                        java.util.concurrent.Future<ListTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTablesRequest, ListTablesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociations(
                    ListTargetAlertPolicyAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetAlertPolicyAssociationsRequest,
                                    ListTargetAlertPolicyAssociationsResponse>
                            handler) {
        LOG.trace("Called async listTargetAlertPolicyAssociations");
        final ListTargetAlertPolicyAssociationsRequest interceptedRequest =
                ListTargetAlertPolicyAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetAlertPolicyAssociationsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetAlertPolicyAssociationsResponse>
                transformer = ListTargetAlertPolicyAssociationsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListTargetAlertPolicyAssociations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociationSummary/ListTargetAlertPolicyAssociations");

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetAlertPolicyAssociationsRequest,
                        ListTargetAlertPolicyAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetAlertPolicyAssociationsRequest,
                                ListTargetAlertPolicyAssociationsResponse>,
                        java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetAlertPolicyAssociationsRequest,
                    ListTargetAlertPolicyAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetDatabasesResponse> listTargetDatabases(
            ListTargetDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                    handler) {
        LOG.trace("Called async listTargetDatabases");
        final ListTargetDatabasesRequest interceptedRequest =
                ListTargetDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetDatabasesResponse>
                transformer = ListTargetDatabasesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListTargetDatabases",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseSummary/ListTargetDatabases");

        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDatabasesRequest, ListTargetDatabasesResponse>,
                        java.util.concurrent.Future<ListTargetDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDatabasesRequest, ListTargetDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserAnalyticsResponse> listUserAnalytics(
            ListUserAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                    handler) {
        LOG.trace("Called async listUserAnalytics");
        final ListUserAnalyticsRequest interceptedRequest =
                ListUserAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAnalyticsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUserAnalyticsResponse>
                transformer = ListUserAnalyticsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListUserAnalytics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAnalytics");

        com.oracle.bmc.responses.AsyncHandler<ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAnalyticsRequest, ListUserAnalyticsResponse>,
                        java.util.concurrent.Future<ListUserAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAnalyticsRequest, ListUserAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserAssessmentsResponse> listUserAssessments(
            ListUserAssessmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                    handler) {
        LOG.trace("Called async listUserAssessments");
        final ListUserAssessmentsRequest interceptedRequest =
                ListUserAssessmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAssessmentsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserAssessmentsResponse>
                transformer = ListUserAssessmentsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListUserAssessments",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessmentSummary/ListUserAssessments");

        com.oracle.bmc.responses.AsyncHandler<
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAssessmentsRequest, ListUserAssessmentsResponse>,
                        java.util.concurrent.Future<ListUserAssessmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAssessmentsRequest, ListUserAssessmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        LOG.trace("Called async listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer = ListUsersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ListUsers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUsers");

        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>,
                        java.util.concurrent.Future<ListUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUsersRequest, ListUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                "DataSafe",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestError/ListWorkRequestErrors");

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
                "DataSafe",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestLogEntry/ListWorkRequestLogs");

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
                "DataSafe",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestSummary/ListWorkRequests");

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
    public java.util.concurrent.Future<MaskDataResponse> maskData(
            MaskDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse>
                    handler) {
        LOG.trace("Called async maskData");
        final MaskDataRequest interceptedRequest = MaskDataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MaskDataConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, MaskDataResponse>
                transformer = MaskDataConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "MaskData",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/MaskData");

        com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse>,
                        java.util.concurrent.Future<MaskDataResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMaskDataDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MaskDataRequest, MaskDataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyGlobalSettingsResponse> modifyGlobalSettings(
            ModifyGlobalSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                    handler) {
        LOG.trace("Called async modifyGlobalSettings");
        final ModifyGlobalSettingsRequest interceptedRequest =
                ModifyGlobalSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyGlobalSettingsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ModifyGlobalSettingsResponse>
                transformer = ModifyGlobalSettingsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ModifyGlobalSettings",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/ModifyGlobalSettings");

        com.oracle.bmc.responses.AsyncHandler<
                        ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>,
                        java.util.concurrent.Future<ModifyGlobalSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModifyGlobalSettingsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchAlertsResponse> patchAlerts(
            PatchAlertsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse>
                    handler) {
        LOG.trace("Called async patchAlerts");
        final PatchAlertsRequest interceptedRequest =
                PatchAlertsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAlertsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, PatchAlertsResponse>
                transformer = PatchAlertsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "PatchAlerts",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/PatchAlerts");

        com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchAlertsRequest, PatchAlertsResponse>,
                        java.util.concurrent.Future<PatchAlertsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchAlertsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAlertsRequest, PatchAlertsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchDiscoveryJobResultsResponse> patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                    handler) {
        LOG.trace("Called async patchDiscoveryJobResults");
        final PatchDiscoveryJobResultsRequest interceptedRequest =
                PatchDiscoveryJobResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PatchDiscoveryJobResultsResponse>
                transformer = PatchDiscoveryJobResultsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "PatchDiscoveryJobResults",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/PatchDiscoveryJobResults");

        com.oracle.bmc.responses.AsyncHandler<
                        PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>,
                        java.util.concurrent.Future<PatchDiscoveryJobResultsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchDiscoveryJobResultDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchMaskingColumnsResponse> patchMaskingColumns(
            PatchMaskingColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                    handler) {
        LOG.trace("Called async patchMaskingColumns");
        final PatchMaskingColumnsRequest interceptedRequest =
                PatchMaskingColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMaskingColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PatchMaskingColumnsResponse>
                transformer = PatchMaskingColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "PatchMaskingColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/PatchMaskingColumns");

        com.oracle.bmc.responses.AsyncHandler<
                        PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>,
                        java.util.concurrent.Future<PatchMaskingColumnsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchMaskingColumnsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchSensitiveColumnsResponse> patchSensitiveColumns(
            PatchSensitiveColumnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                    handler) {
        LOG.trace("Called async patchSensitiveColumns");
        final PatchSensitiveColumnsRequest interceptedRequest =
                PatchSensitiveColumnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSensitiveColumnsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, PatchSensitiveColumnsResponse>
                transformer = PatchSensitiveColumnsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "PatchSensitiveColumns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/PatchSensitiveColumns");

        com.oracle.bmc.responses.AsyncHandler<
                        PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>,
                        java.util.concurrent.Future<PatchSensitiveColumnsResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ProvisionAuditPolicyResponse> provisionAuditPolicy(
            ProvisionAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async provisionAuditPolicy");
        final ProvisionAuditPolicyRequest interceptedRequest =
                ProvisionAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ProvisionAuditPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ProvisionAuditPolicyResponse>
                transformer = ProvisionAuditPolicyConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ProvisionAuditPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ProvisionAuditPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>,
                        java.util.concurrent.Future<ProvisionAuditPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getProvisionAuditPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshSecurityAssessmentResponse> refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async refreshSecurityAssessment");
        final RefreshSecurityAssessmentRequest interceptedRequest =
                RefreshSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RefreshSecurityAssessmentResponse>
                transformer = RefreshSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "RefreshSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/RefreshSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshSecurityAssessmentRequest,
                                RefreshSecurityAssessmentResponse>,
                        java.util.concurrent.Future<RefreshSecurityAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshUserAssessmentResponse> refreshUserAssessment(
            RefreshUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async refreshUserAssessment");
        final RefreshUserAssessmentRequest interceptedRequest =
                RefreshUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RefreshUserAssessmentResponse>
                transformer = RefreshUserAssessmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "RefreshUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/RefreshUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>,
                        java.util.concurrent.Future<RefreshUserAssessmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeAuditTrailResponse> resumeAuditTrail(
            ResumeAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                    handler) {
        LOG.trace("Called async resumeAuditTrail");
        final ResumeAuditTrailRequest interceptedRequest =
                ResumeAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ResumeAuditTrailResponse>
                transformer = ResumeAuditTrailConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ResumeAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ResumeAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeAuditTrailRequest, ResumeAuditTrailResponse>,
                        java.util.concurrent.Future<ResumeAuditTrailResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeAuditTrailRequest, ResumeAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeWorkRequestResponse> resumeWorkRequest(
            ResumeWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                    handler) {
        LOG.trace("Called async resumeWorkRequest");
        final ResumeWorkRequestRequest interceptedRequest =
                ResumeWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ResumeWorkRequestResponse>
                transformer = ResumeWorkRequestConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "ResumeWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/ResumeWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeWorkRequestRequest, ResumeWorkRequestResponse>,
                        java.util.concurrent.Future<ResumeWorkRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeWorkRequestRequest, ResumeWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RetrieveAuditPoliciesResponse> retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                    handler) {
        LOG.trace("Called async retrieveAuditPolicies");
        final RetrieveAuditPoliciesRequest interceptedRequest =
                RetrieveAuditPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RetrieveAuditPoliciesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RetrieveAuditPoliciesResponse>
                transformer = RetrieveAuditPoliciesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "RetrieveAuditPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/RetrieveAuditPolicies");

        com.oracle.bmc.responses.AsyncHandler<
                        RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>,
                        java.util.concurrent.Future<RetrieveAuditPoliciesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>
            setSecurityAssessmentBaseline(
                    SetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SetSecurityAssessmentBaselineRequest,
                                    SetSecurityAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async setSecurityAssessmentBaseline");
        final SetSecurityAssessmentBaselineRequest interceptedRequest =
                SetSecurityAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetSecurityAssessmentBaselineResponse>
                transformer = SetSecurityAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "SetSecurityAssessmentBaseline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/SetSecurityAssessmentBaseline");

        com.oracle.bmc.responses.AsyncHandler<
                        SetSecurityAssessmentBaselineRequest, SetSecurityAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetSecurityAssessmentBaselineRequest,
                                SetSecurityAssessmentBaselineResponse>,
                        java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBaseLineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetSecurityAssessmentBaselineRequest, SetSecurityAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetUserAssessmentBaselineResponse> setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                    handler) {
        LOG.trace("Called async setUserAssessmentBaseline");
        final SetUserAssessmentBaselineRequest interceptedRequest =
                SetUserAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetUserAssessmentBaselineResponse>
                transformer = SetUserAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "SetUserAssessmentBaseline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/SetUserAssessmentBaseline");

        com.oracle.bmc.responses.AsyncHandler<
                        SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetUserAssessmentBaselineRequest,
                                SetUserAssessmentBaselineResponse>,
                        java.util.concurrent.Future<SetUserAssessmentBaselineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBaseLineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartAuditTrailResponse> startAuditTrail(
            StartAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAuditTrailRequest, StartAuditTrailResponse>
                    handler) {
        LOG.trace("Called async startAuditTrail");
        final StartAuditTrailRequest interceptedRequest =
                StartAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StartAuditTrailResponse>
                transformer = StartAuditTrailConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "StartAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StartAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<StartAuditTrailRequest, StartAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartAuditTrailRequest, StartAuditTrailResponse>,
                        java.util.concurrent.Future<StartAuditTrailResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStartAuditTrailDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartAuditTrailRequest, StartAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopAuditTrailResponse> stopAuditTrail(
            StopAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAuditTrailRequest, StopAuditTrailResponse>
                    handler) {
        LOG.trace("Called async stopAuditTrail");
        final StopAuditTrailRequest interceptedRequest =
                StopAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StopAuditTrailResponse>
                transformer = StopAuditTrailConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "StopAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StopAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<StopAuditTrailRequest, StopAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopAuditTrailRequest, StopAuditTrailResponse>,
                        java.util.concurrent.Future<StopAuditTrailResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopAuditTrailRequest, StopAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SuspendWorkRequestResponse> suspendWorkRequest(
            SuspendWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                    handler) {
        LOG.trace("Called async suspendWorkRequest");
        final SuspendWorkRequestRequest interceptedRequest =
                SuspendWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuspendWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, SuspendWorkRequestResponse>
                transformer = SuspendWorkRequestConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "SuspendWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/SuspendWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SuspendWorkRequestRequest, SuspendWorkRequestResponse>,
                        java.util.concurrent.Future<SuspendWorkRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SuspendWorkRequestRequest, SuspendWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>
            unsetSecurityAssessmentBaseline(
                    UnsetSecurityAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetSecurityAssessmentBaselineRequest,
                                    UnsetSecurityAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async unsetSecurityAssessmentBaseline");
        final UnsetSecurityAssessmentBaselineRequest interceptedRequest =
                UnsetSecurityAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetSecurityAssessmentBaselineResponse>
                transformer = UnsetSecurityAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UnsetSecurityAssessmentBaseline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UnsetSecurityAssessmentBaseline");

        com.oracle.bmc.responses.AsyncHandler<
                        UnsetSecurityAssessmentBaselineRequest,
                        UnsetSecurityAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnsetSecurityAssessmentBaselineRequest,
                                UnsetSecurityAssessmentBaselineResponse>,
                        java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnsetSecurityAssessmentBaselineRequest,
                    UnsetSecurityAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse>
            unsetUserAssessmentBaseline(
                    UnsetUserAssessmentBaselineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnsetUserAssessmentBaselineRequest,
                                    UnsetUserAssessmentBaselineResponse>
                            handler) {
        LOG.trace("Called async unsetUserAssessmentBaseline");
        final UnsetUserAssessmentBaselineRequest interceptedRequest =
                UnsetUserAssessmentBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetUserAssessmentBaselineResponse>
                transformer = UnsetUserAssessmentBaselineConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UnsetUserAssessmentBaseline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UnsetUserAssessmentBaseline");

        com.oracle.bmc.responses.AsyncHandler<
                        UnsetUserAssessmentBaselineRequest, UnsetUserAssessmentBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnsetUserAssessmentBaselineRequest,
                                UnsetUserAssessmentBaselineResponse>,
                        java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnsetUserAssessmentBaselineRequest, UnsetUserAssessmentBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAlertResponse> updateAlert(
            UpdateAlertRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse>
                    handler) {
        LOG.trace("Called async updateAlert");
        final UpdateAlertRequest interceptedRequest =
                UpdateAlertConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAlertConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAlertResponse>
                transformer = UpdateAlertConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateAlert",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/UpdateAlert");

        com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAlertRequest, UpdateAlertResponse>,
                        java.util.concurrent.Future<UpdateAlertResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAlertDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAlertRequest, UpdateAlertResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse>
            updateAuditArchiveRetrieval(
                    UpdateAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuditArchiveRetrievalRequest,
                                    UpdateAuditArchiveRetrievalResponse>
                            handler) {
        LOG.trace("Called async updateAuditArchiveRetrieval");
        final UpdateAuditArchiveRetrievalRequest interceptedRequest =
                UpdateAuditArchiveRetrievalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAuditArchiveRetrievalResponse>
                transformer = UpdateAuditArchiveRetrievalConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateAuditArchiveRetrieval",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/UpdateAuditArchiveRetrieval");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAuditArchiveRetrievalRequest, UpdateAuditArchiveRetrievalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditArchiveRetrievalRequest,
                                UpdateAuditArchiveRetrievalResponse>,
                        java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditArchiveRetrievalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditArchiveRetrievalRequest, UpdateAuditArchiveRetrievalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditPolicyResponse> updateAuditPolicy(
            UpdateAuditPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                    handler) {
        LOG.trace("Called async updateAuditPolicy");
        final UpdateAuditPolicyRequest interceptedRequest =
                UpdateAuditPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditPolicyResponse>
                transformer = UpdateAuditPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateAuditPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/UpdateAuditPolicy");

        com.oracle.bmc.responses.AsyncHandler<UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>,
                        java.util.concurrent.Future<UpdateAuditPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditProfileResponse> updateAuditProfile(
            UpdateAuditProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                    handler) {
        LOG.trace("Called async updateAuditProfile");
        final UpdateAuditProfileRequest interceptedRequest =
                UpdateAuditProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditProfileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditProfileResponse>
                transformer = UpdateAuditProfileConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateAuditProfile",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/UpdateAuditProfile");

        com.oracle.bmc.responses.AsyncHandler<UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditProfileRequest, UpdateAuditProfileResponse>,
                        java.util.concurrent.Future<UpdateAuditProfileResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditProfileRequest, UpdateAuditProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuditTrailResponse> updateAuditTrail(
            UpdateAuditTrailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                    handler) {
        LOG.trace("Called async updateAuditTrail");
        final UpdateAuditTrailRequest interceptedRequest =
                UpdateAuditTrailConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditTrailConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditTrailResponse>
                transformer = UpdateAuditTrailConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateAuditTrail",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/UpdateAuditTrail");

        com.oracle.bmc.responses.AsyncHandler<UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuditTrailRequest, UpdateAuditTrailResponse>,
                        java.util.concurrent.Future<UpdateAuditTrailResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuditTrailDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuditTrailRequest, UpdateAuditTrailResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>
            updateDataSafePrivateEndpoint(
                    UpdateDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSafePrivateEndpointRequest,
                                    UpdateDataSafePrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDataSafePrivateEndpoint");
        final UpdateDataSafePrivateEndpointRequest interceptedRequest =
                UpdateDataSafePrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDataSafePrivateEndpointResponse>
                transformer = UpdateDataSafePrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateDataSafePrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/UpdateDataSafePrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDataSafePrivateEndpointRequest, UpdateDataSafePrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataSafePrivateEndpointRequest,
                                UpdateDataSafePrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataSafePrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataSafePrivateEndpointRequest, UpdateDataSafePrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse>
            updateLibraryMaskingFormat(
                    UpdateLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLibraryMaskingFormatRequest,
                                    UpdateLibraryMaskingFormatResponse>
                            handler) {
        LOG.trace("Called async updateLibraryMaskingFormat");
        final UpdateLibraryMaskingFormatRequest interceptedRequest =
                UpdateLibraryMaskingFormatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLibraryMaskingFormatResponse>
                transformer = UpdateLibraryMaskingFormatConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateLibraryMaskingFormat",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/UpdateLibraryMaskingFormat");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLibraryMaskingFormatRequest, UpdateLibraryMaskingFormatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLibraryMaskingFormatRequest,
                                UpdateLibraryMaskingFormatResponse>,
                        java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLibraryMaskingFormatDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLibraryMaskingFormatRequest, UpdateLibraryMaskingFormatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingColumnResponse> updateMaskingColumn(
            UpdateMaskingColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                    handler) {
        LOG.trace("Called async updateMaskingColumn");
        final UpdateMaskingColumnRequest interceptedRequest =
                UpdateMaskingColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateMaskingColumnResponse>
                transformer = UpdateMaskingColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateMaskingColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/UpdateMaskingColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>,
                        java.util.concurrent.Future<UpdateMaskingColumnResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMaskingColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMaskingPolicyResponse> updateMaskingPolicy(
            UpdateMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async updateMaskingPolicy");
        final UpdateMaskingPolicyRequest interceptedRequest =
                UpdateMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateMaskingPolicyResponse>
                transformer = UpdateMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UpdateMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>,
                        java.util.concurrent.Future<UpdateMaskingPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorResponse> updateOnPremConnector(
            UpdateOnPremConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                    handler) {
        LOG.trace("Called async updateOnPremConnector");
        final UpdateOnPremConnectorRequest interceptedRequest =
                UpdateOnPremConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorResponse>
                transformer = UpdateOnPremConnectorConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateOnPremConnector",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnector");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>,
                        java.util.concurrent.Future<UpdateOnPremConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOnPremConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse>
            updateOnPremConnectorWallet(
                    UpdateOnPremConnectorWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOnPremConnectorWalletRequest,
                                    UpdateOnPremConnectorWalletResponse>
                            handler) {
        LOG.trace("Called async updateOnPremConnectorWallet");
        final UpdateOnPremConnectorWalletRequest interceptedRequest =
                UpdateOnPremConnectorWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorWalletConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorWalletResponse>
                transformer = UpdateOnPremConnectorWalletConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateOnPremConnectorWallet",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnectorWallet");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOnPremConnectorWalletRequest, UpdateOnPremConnectorWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOnPremConnectorWalletRequest,
                                UpdateOnPremConnectorWalletResponse>,
                        java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOnPremConnectorWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOnPremConnectorWalletRequest, UpdateOnPremConnectorWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateReportDefinitionResponse> updateReportDefinition(
            UpdateReportDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                    handler) {
        LOG.trace("Called async updateReportDefinition");
        final UpdateReportDefinitionRequest interceptedRequest =
                UpdateReportDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReportDefinitionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateReportDefinitionResponse>
                transformer = UpdateReportDefinitionConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateReportDefinition",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/UpdateReportDefinition");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>,
                        java.util.concurrent.Future<UpdateReportDefinitionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateReportDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityAssessmentResponse> updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                    handler) {
        LOG.trace("Called async updateSecurityAssessment");
        final UpdateSecurityAssessmentRequest interceptedRequest =
                UpdateSecurityAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSecurityAssessmentResponse>
                transformer = UpdateSecurityAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateSecurityAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UpdateSecurityAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>,
                        java.util.concurrent.Future<UpdateSecurityAssessmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveColumnResponse> updateSensitiveColumn(
            UpdateSensitiveColumnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveColumn");
        final UpdateSensitiveColumnRequest interceptedRequest =
                UpdateSensitiveColumnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveColumnConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSensitiveColumnResponse>
                transformer = UpdateSensitiveColumnConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateSensitiveColumn",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/UpdateSensitiveColumn");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>,
                        java.util.concurrent.Future<UpdateSensitiveColumnResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveColumnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveDataModelResponse> updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveDataModel");
        final UpdateSensitiveDataModelRequest interceptedRequest =
                UpdateSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSensitiveDataModelResponse>
                transformer = UpdateSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UpdateSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>,
                        java.util.concurrent.Future<UpdateSensitiveDataModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitiveTypeResponse> updateSensitiveType(
            UpdateSensitiveTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                    handler) {
        LOG.trace("Called async updateSensitiveType");
        final UpdateSensitiveTypeRequest interceptedRequest =
                UpdateSensitiveTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveTypeConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateSensitiveTypeResponse>
                transformer = UpdateSensitiveTypeConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateSensitiveType",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/UpdateSensitiveType");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>,
                        java.util.concurrent.Future<UpdateSensitiveTypeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSensitiveTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>
            updateTargetAlertPolicyAssociation(
                    UpdateTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetAlertPolicyAssociationRequest,
                                    UpdateTargetAlertPolicyAssociationResponse>
                            handler) {
        LOG.trace("Called async updateTargetAlertPolicyAssociation");
        final UpdateTargetAlertPolicyAssociationRequest interceptedRequest =
                UpdateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetAlertPolicyAssociationResponse>
                transformer = UpdateTargetAlertPolicyAssociationConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateTargetAlertPolicyAssociation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/UpdateTargetAlertPolicyAssociation");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetAlertPolicyAssociationRequest,
                        UpdateTargetAlertPolicyAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetAlertPolicyAssociationRequest,
                                UpdateTargetAlertPolicyAssociationResponse>,
                        java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetAlertPolicyAssociationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetAlertPolicyAssociationRequest,
                    UpdateTargetAlertPolicyAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDatabaseResponse> updateTargetDatabase(
            UpdateTargetDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateTargetDatabase");
        final UpdateTargetDatabaseRequest interceptedRequest =
                UpdateTargetDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetDatabaseResponse>
                transformer = UpdateTargetDatabaseConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateTargetDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/UpdateTargetDatabase");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>,
                        java.util.concurrent.Future<UpdateTargetDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAssessmentResponse> updateUserAssessment(
            UpdateUserAssessmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                    handler) {
        LOG.trace("Called async updateUserAssessment");
        final UpdateUserAssessmentRequest interceptedRequest =
                UpdateUserAssessmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserAssessmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateUserAssessmentResponse>
                transformer = UpdateUserAssessmentConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UpdateUserAssessment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UpdateUserAssessment");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>,
                        java.util.concurrent.Future<UpdateUserAssessmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUserAssessmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadMaskingPolicyResponse> uploadMaskingPolicy(
            UploadMaskingPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                    handler) {
        LOG.trace("Called async uploadMaskingPolicy");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadMaskingPolicyRequest.builder());
        }
        final UploadMaskingPolicyRequest interceptedRequest =
                UploadMaskingPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadMaskingPolicyConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UploadMaskingPolicyResponse>
                transformer = UploadMaskingPolicyConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UploadMaskingPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UploadMaskingPolicy");

        com.oracle.bmc.responses.AsyncHandler<
                        UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>,
                        java.util.concurrent.Future<UploadMaskingPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadMaskingPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadMaskingPolicyDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadSensitiveDataModelResponse> uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                    handler) {
        LOG.trace("Called async uploadSensitiveDataModel");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UploadSensitiveDataModelRequest.builder());
        }
        final UploadSensitiveDataModelRequest interceptedRequest =
                UploadSensitiveDataModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UploadSensitiveDataModelResponse>
                transformer = UploadSensitiveDataModelConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataSafe",
                "UploadSensitiveDataModel",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UploadSensitiveDataModel");

        com.oracle.bmc.responses.AsyncHandler<
                        UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>,
                        java.util.concurrent.Future<UploadSensitiveDataModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUploadSensitiveDataModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUploadSensitiveDataModelDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
