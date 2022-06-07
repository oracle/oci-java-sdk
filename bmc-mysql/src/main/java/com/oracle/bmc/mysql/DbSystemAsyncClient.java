/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.internal.http.*;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for DbSystem service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class DbSystemAsyncClient implements DbSystemAsync {
    /**
     * Service instance for DbSystem.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBSYSTEM")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbSystemAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DbSystemAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbSystemAsyncClient> {
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
        public DbSystemAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DbSystemAsyncClient(
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
    public java.util.concurrent.Future<AddAnalyticsClusterResponse> addAnalyticsCluster(
            AddAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddAnalyticsClusterRequest, AddAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async addAnalyticsCluster");
        final AddAnalyticsClusterRequest interceptedRequest =
                AddAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddAnalyticsClusterResponse>
                transformer = AddAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "AddAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/AddAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        AddAnalyticsClusterRequest, AddAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddAnalyticsClusterRequest, AddAnalyticsClusterResponse>,
                        java.util.concurrent.Future<AddAnalyticsClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddAnalyticsClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddAnalyticsClusterRequest, AddAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddHeatWaveClusterResponse> addHeatWaveCluster(
            AddHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async addHeatWaveCluster");
        final AddHeatWaveClusterRequest interceptedRequest =
                AddHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddHeatWaveClusterResponse>
                transformer = AddHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "AddHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/AddHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>,
                        java.util.concurrent.Future<AddHeatWaveClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddHeatWaveClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDbSystemResponse> createDbSystem(
            CreateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDbSystemRequest, CreateDbSystemResponse>
                    handler) {
        LOG.trace("Called async createDbSystem");
        final CreateDbSystemRequest interceptedRequest =
                CreateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateDbSystemResponse>
                transformer = CreateDbSystemConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem", "CreateDbSystem", ib.getRequestUri().toString(), "");

        com.oracle.bmc.responses.AsyncHandler<CreateDbSystemRequest, CreateDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDbSystemRequest, CreateDbSystemResponse>,
                        java.util.concurrent.Future<CreateDbSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDbSystemRequest, CreateDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalyticsClusterResponse> deleteAnalyticsCluster(
            DeleteAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAnalyticsClusterRequest, DeleteAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async deleteAnalyticsCluster");
        final DeleteAnalyticsClusterRequest interceptedRequest =
                DeleteAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAnalyticsClusterResponse>
                transformer = DeleteAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "DeleteAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/DeleteAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAnalyticsClusterRequest, DeleteAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAnalyticsClusterRequest, DeleteAnalyticsClusterResponse>,
                        java.util.concurrent.Future<DeleteAnalyticsClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAnalyticsClusterRequest, DeleteAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDbSystemResponse> deleteDbSystem(
            DeleteDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDbSystemRequest, DeleteDbSystemResponse>
                    handler) {
        LOG.trace("Called async deleteDbSystem");
        final DeleteDbSystemRequest interceptedRequest =
                DeleteDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDbSystemResponse>
                transformer = DeleteDbSystemConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "DeleteDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/DeleteDbSystem");

        com.oracle.bmc.responses.AsyncHandler<DeleteDbSystemRequest, DeleteDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDbSystemRequest, DeleteDbSystemResponse>,
                        java.util.concurrent.Future<DeleteDbSystemResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDbSystemRequest, DeleteDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHeatWaveClusterResponse> deleteHeatWaveCluster(
            DeleteHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async deleteHeatWaveCluster");
        final DeleteHeatWaveClusterRequest interceptedRequest =
                DeleteHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteHeatWaveClusterResponse>
                transformer = DeleteHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "DeleteHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/DeleteHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>,
                        java.util.concurrent.Future<DeleteHeatWaveClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAnalyticsClusterMemoryEstimateResponse>
            generateAnalyticsClusterMemoryEstimate(
                    GenerateAnalyticsClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAnalyticsClusterMemoryEstimateRequest,
                                    GenerateAnalyticsClusterMemoryEstimateResponse>
                            handler) {
        LOG.trace("Called async generateAnalyticsClusterMemoryEstimate");
        final GenerateAnalyticsClusterMemoryEstimateRequest interceptedRequest =
                GenerateAnalyticsClusterMemoryEstimateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAnalyticsClusterMemoryEstimateConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateAnalyticsClusterMemoryEstimateResponse>
                transformer = GenerateAnalyticsClusterMemoryEstimateConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GenerateAnalyticsClusterMemoryEstimate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsClusterMemoryEstimate/GenerateAnalyticsClusterMemoryEstimate");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateAnalyticsClusterMemoryEstimateRequest,
                        GenerateAnalyticsClusterMemoryEstimateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateAnalyticsClusterMemoryEstimateRequest,
                                GenerateAnalyticsClusterMemoryEstimateResponse>,
                        java.util.concurrent.Future<GenerateAnalyticsClusterMemoryEstimateResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateAnalyticsClusterMemoryEstimateRequest,
                    GenerateAnalyticsClusterMemoryEstimateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateHeatWaveClusterMemoryEstimateResponse>
            generateHeatWaveClusterMemoryEstimate(
                    GenerateHeatWaveClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateHeatWaveClusterMemoryEstimateRequest,
                                    GenerateHeatWaveClusterMemoryEstimateResponse>
                            handler) {
        LOG.trace("Called async generateHeatWaveClusterMemoryEstimate");
        final GenerateHeatWaveClusterMemoryEstimateRequest interceptedRequest =
                GenerateHeatWaveClusterMemoryEstimateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateHeatWaveClusterMemoryEstimateConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateHeatWaveClusterMemoryEstimateResponse>
                transformer = GenerateHeatWaveClusterMemoryEstimateConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GenerateHeatWaveClusterMemoryEstimate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveClusterMemoryEstimate/GenerateHeatWaveClusterMemoryEstimate");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateHeatWaveClusterMemoryEstimateRequest,
                        GenerateHeatWaveClusterMemoryEstimateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateHeatWaveClusterMemoryEstimateRequest,
                                GenerateHeatWaveClusterMemoryEstimateResponse>,
                        java.util.concurrent.Future<GenerateHeatWaveClusterMemoryEstimateResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateHeatWaveClusterMemoryEstimateRequest,
                    GenerateHeatWaveClusterMemoryEstimateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAnalyticsClusterResponse> getAnalyticsCluster(
            GetAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAnalyticsClusterRequest, GetAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async getAnalyticsCluster");
        final GetAnalyticsClusterRequest interceptedRequest =
                GetAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAnalyticsClusterResponse>
                transformer = GetAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GetAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/GetAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAnalyticsClusterRequest, GetAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAnalyticsClusterRequest, GetAnalyticsClusterResponse>,
                        java.util.concurrent.Future<GetAnalyticsClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAnalyticsClusterRequest, GetAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAnalyticsClusterMemoryEstimateResponse>
            getAnalyticsClusterMemoryEstimate(
                    GetAnalyticsClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAnalyticsClusterMemoryEstimateRequest,
                                    GetAnalyticsClusterMemoryEstimateResponse>
                            handler) {
        LOG.trace("Called async getAnalyticsClusterMemoryEstimate");
        final GetAnalyticsClusterMemoryEstimateRequest interceptedRequest =
                GetAnalyticsClusterMemoryEstimateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAnalyticsClusterMemoryEstimateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAnalyticsClusterMemoryEstimateResponse>
                transformer = GetAnalyticsClusterMemoryEstimateConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GetAnalyticsClusterMemoryEstimate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsClusterMemoryEstimate/GetAnalyticsClusterMemoryEstimate");

        com.oracle.bmc.responses.AsyncHandler<
                        GetAnalyticsClusterMemoryEstimateRequest,
                        GetAnalyticsClusterMemoryEstimateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAnalyticsClusterMemoryEstimateRequest,
                                GetAnalyticsClusterMemoryEstimateResponse>,
                        java.util.concurrent.Future<GetAnalyticsClusterMemoryEstimateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAnalyticsClusterMemoryEstimateRequest,
                    GetAnalyticsClusterMemoryEstimateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {
        LOG.trace("Called async getDbSystem");
        final GetDbSystemRequest interceptedRequest =
                GetDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetDbSystemResponse>
                transformer = GetDbSystemConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GetDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/GetDbSystem");

        com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbSystemRequest, GetDbSystemResponse>,
                        java.util.concurrent.Future<GetDbSystemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbSystemRequest, GetDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHeatWaveClusterResponse> getHeatWaveCluster(
            GetHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async getHeatWaveCluster");
        final GetHeatWaveClusterRequest interceptedRequest =
                GetHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetHeatWaveClusterResponse>
                transformer = GetHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GetHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/GetHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>,
                        java.util.concurrent.Future<GetHeatWaveClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHeatWaveClusterMemoryEstimateResponse>
            getHeatWaveClusterMemoryEstimate(
                    GetHeatWaveClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetHeatWaveClusterMemoryEstimateRequest,
                                    GetHeatWaveClusterMemoryEstimateResponse>
                            handler) {
        LOG.trace("Called async getHeatWaveClusterMemoryEstimate");
        final GetHeatWaveClusterMemoryEstimateRequest interceptedRequest =
                GetHeatWaveClusterMemoryEstimateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHeatWaveClusterMemoryEstimateConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetHeatWaveClusterMemoryEstimateResponse>
                transformer = GetHeatWaveClusterMemoryEstimateConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "GetHeatWaveClusterMemoryEstimate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveClusterMemoryEstimate/GetHeatWaveClusterMemoryEstimate");

        com.oracle.bmc.responses.AsyncHandler<
                        GetHeatWaveClusterMemoryEstimateRequest,
                        GetHeatWaveClusterMemoryEstimateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHeatWaveClusterMemoryEstimateRequest,
                                GetHeatWaveClusterMemoryEstimateResponse>,
                        java.util.concurrent.Future<GetHeatWaveClusterMemoryEstimateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHeatWaveClusterMemoryEstimateRequest,
                    GetHeatWaveClusterMemoryEstimateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
        LOG.trace("Called async listDbSystems");
        final ListDbSystemsRequest interceptedRequest =
                ListDbSystemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbSystemsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListDbSystemsResponse>
                transformer = ListDbSystemsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "ListDbSystems",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystemSummary/ListDbSystems");

        com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbSystemsRequest, ListDbSystemsResponse>,
                        java.util.concurrent.Future<ListDbSystemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbSystemsRequest, ListDbSystemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartAnalyticsClusterResponse> restartAnalyticsCluster(
            RestartAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartAnalyticsClusterRequest, RestartAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async restartAnalyticsCluster");
        final RestartAnalyticsClusterRequest interceptedRequest =
                RestartAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RestartAnalyticsClusterResponse>
                transformer = RestartAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "RestartAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/RestartAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        RestartAnalyticsClusterRequest, RestartAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartAnalyticsClusterRequest, RestartAnalyticsClusterResponse>,
                        java.util.concurrent.Future<RestartAnalyticsClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartAnalyticsClusterRequest, RestartAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartDbSystemResponse> restartDbSystem(
            RestartDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartDbSystemRequest, RestartDbSystemResponse>
                    handler) {
        LOG.trace("Called async restartDbSystem");
        final RestartDbSystemRequest interceptedRequest =
                RestartDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RestartDbSystemResponse>
                transformer = RestartDbSystemConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "RestartDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/RestartDbSystem");

        com.oracle.bmc.responses.AsyncHandler<RestartDbSystemRequest, RestartDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartDbSystemRequest, RestartDbSystemResponse>,
                        java.util.concurrent.Future<RestartDbSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRestartDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartDbSystemRequest, RestartDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartHeatWaveClusterResponse> restartHeatWaveCluster(
            RestartHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async restartHeatWaveCluster");
        final RestartHeatWaveClusterRequest interceptedRequest =
                RestartHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, RestartHeatWaveClusterResponse>
                transformer = RestartHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "RestartHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/RestartHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>,
                        java.util.concurrent.Future<RestartHeatWaveClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartAnalyticsClusterResponse> startAnalyticsCluster(
            StartAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartAnalyticsClusterRequest, StartAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async startAnalyticsCluster");
        final StartAnalyticsClusterRequest interceptedRequest =
                StartAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StartAnalyticsClusterResponse>
                transformer = StartAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StartAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/StartAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        StartAnalyticsClusterRequest, StartAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartAnalyticsClusterRequest, StartAnalyticsClusterResponse>,
                        java.util.concurrent.Future<StartAnalyticsClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartAnalyticsClusterRequest, StartAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartDbSystemResponse> startDbSystem(
            StartDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StartDbSystemRequest, StartDbSystemResponse>
                    handler) {
        LOG.trace("Called async startDbSystem");
        final StartDbSystemRequest interceptedRequest =
                StartDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StartDbSystemResponse>
                transformer = StartDbSystemConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StartDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/StartDbSystem");

        com.oracle.bmc.responses.AsyncHandler<StartDbSystemRequest, StartDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartDbSystemRequest, StartDbSystemResponse>,
                        java.util.concurrent.Future<StartDbSystemResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartDbSystemRequest, StartDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartHeatWaveClusterResponse> startHeatWaveCluster(
            StartHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async startHeatWaveCluster");
        final StartHeatWaveClusterRequest interceptedRequest =
                StartHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StartHeatWaveClusterResponse>
                transformer = StartHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StartHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/StartHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>,
                        java.util.concurrent.Future<StartHeatWaveClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopAnalyticsClusterResponse> stopAnalyticsCluster(
            StopAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopAnalyticsClusterRequest, StopAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async stopAnalyticsCluster");
        final StopAnalyticsClusterRequest interceptedRequest =
                StopAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StopAnalyticsClusterResponse>
                transformer = StopAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StopAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/StopAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        StopAnalyticsClusterRequest, StopAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopAnalyticsClusterRequest, StopAnalyticsClusterResponse>,
                        java.util.concurrent.Future<StopAnalyticsClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopAnalyticsClusterRequest, StopAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopDbSystemResponse> stopDbSystem(
            StopDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopDbSystemRequest, StopDbSystemResponse>
                    handler) {
        LOG.trace("Called async stopDbSystem");
        final StopDbSystemRequest interceptedRequest =
                StopDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, StopDbSystemResponse>
                transformer = StopDbSystemConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StopDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/StopDbSystem");

        com.oracle.bmc.responses.AsyncHandler<StopDbSystemRequest, StopDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopDbSystemRequest, StopDbSystemResponse>,
                        java.util.concurrent.Future<StopDbSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStopDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopDbSystemRequest, StopDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopHeatWaveClusterResponse> stopHeatWaveCluster(
            StopHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async stopHeatWaveCluster");
        final StopHeatWaveClusterRequest interceptedRequest =
                StopHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, StopHeatWaveClusterResponse>
                transformer = StopHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "StopHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/StopHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>,
                        java.util.concurrent.Future<StopHeatWaveClusterResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalyticsClusterResponse> updateAnalyticsCluster(
            UpdateAnalyticsClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnalyticsClusterRequest, UpdateAnalyticsClusterResponse>
                    handler) {
        LOG.trace("Called async updateAnalyticsCluster");
        final UpdateAnalyticsClusterRequest interceptedRequest =
                UpdateAnalyticsClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAnalyticsClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAnalyticsClusterResponse>
                transformer = UpdateAnalyticsClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "UpdateAnalyticsCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/UpdateAnalyticsCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAnalyticsClusterRequest, UpdateAnalyticsClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAnalyticsClusterRequest, UpdateAnalyticsClusterResponse>,
                        java.util.concurrent.Future<UpdateAnalyticsClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAnalyticsClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAnalyticsClusterRequest, UpdateAnalyticsClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {
        LOG.trace("Called async updateDbSystem");
        final UpdateDbSystemRequest interceptedRequest =
                UpdateDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbSystemConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDbSystemResponse>
                transformer = UpdateDbSystemConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "UpdateDbSystem",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/UpdateDbSystem");

        com.oracle.bmc.responses.AsyncHandler<UpdateDbSystemRequest, UpdateDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDbSystemRequest, UpdateDbSystemResponse>,
                        java.util.concurrent.Future<UpdateDbSystemResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDbSystemRequest, UpdateDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateHeatWaveClusterResponse> updateHeatWaveCluster(
            UpdateHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>
                    handler) {
        LOG.trace("Called async updateHeatWaveCluster");
        final UpdateHeatWaveClusterRequest interceptedRequest =
                UpdateHeatWaveClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHeatWaveClusterConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateHeatWaveClusterResponse>
                transformer = UpdateHeatWaveClusterConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbSystem",
                "UpdateHeatWaveCluster",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/UpdateHeatWaveCluster");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>,
                        java.util.concurrent.Future<UpdateHeatWaveClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHeatWaveClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
