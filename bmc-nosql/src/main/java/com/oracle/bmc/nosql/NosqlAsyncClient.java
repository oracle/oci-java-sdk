/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql;

import com.oracle.bmc.nosql.internal.http.*;
import com.oracle.bmc.nosql.requests.*;
import com.oracle.bmc.nosql.responses.*;

/**
 * Async client implementation for Nosql service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class NosqlAsyncClient implements NosqlAsync {
    /**
     * Service instance for Nosql.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOSQL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://nosql.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NosqlAsyncClient.class);

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;
    private final com.oracle.bmc.http.internal.RestClientFactory restClientFactory;
    private final com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory;
    private final java.util.Map<
                    com.oracle.bmc.http.signing.SigningStrategy,
                    com.oracle.bmc.http.signing.RequestSignerFactory>
            signingStrategyRequestSignerFactories;
    private final boolean isNonBufferingApacheClient;
    private final com.oracle.bmc.ClientConfiguration clientConfigurationToUse;
    private String regionId;

    /**
     * Used to synchronize any updates on the `this.client` object.
     */
    private final Object clientUpdate = new Object();

    /**
     * Stores the actual client object used to make the API calls.
     * Note: This object can get refreshed periodically, hence it's important to keep any updates synchronized.
     *       For any writes to the object, please synchronize on `this.clientUpdate`.
     */
    private volatile com.oracle.bmc.http.internal.RestClient client;

    /**
     * Keeps track of the last endpoint that was assigned to the client, which in turn can be used when the client is refreshed.
     * Note: Always synchronize on `this.clientUpdate` when reading/writing this field.
     */
    private volatile String overrideEndpoint = null;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public NosqlAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
    public NosqlAsyncClient(
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
        this.restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        this.isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.clientConfigurationToUse = configuration;

        this.refreshClient();

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.regionId = provider.getRegion().getRegionId();
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NosqlAsyncClient> {
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
        public NosqlAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new NosqlAsyncClient(
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
    public void refreshClient() {
        LOG.info("Refreshing client '{}'.", this.client != null ? this.client.getClass() : null);
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                this.defaultRequestSignerFactory.createRequestSigner(
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
                        this.signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient =
                this.restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        this.clientConfigurationToUse,
                        this.isNonBufferingApacheClient);

        synchronized (clientUpdate) {
            if (this.overrideEndpoint != null) {
                refreshedClient.setEndpoint(this.overrideEndpoint);
            }

            this.client = refreshedClient;
        }

        LOG.info("Refreshed client '{}'.", this.client != null ? this.client.getClass() : null);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);

        synchronized (clientUpdate) {
            this.overrideEndpoint = endpoint;
            client.setEndpoint(endpoint);
        }
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
        this.regionId = region.getRegionId();
        java.util.Optional<String> endpoint =
                com.oracle.bmc.internal.GuavaUtils.adaptFromGuava(region.getEndpoint(SERVICE));
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
        this.regionId = regionId;
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     * enable or disable the use of realm-specific endpoint template respectively
     */
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        setEndpoint(
                com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils
                        .getRealmSpecificEndpointTemplate(
                                useOfRealmSpecificEndpointTemplateEnabled, this.regionId, SERVICE));
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<ChangeTableCompartmentResponse> changeTableCompartment(
            ChangeTableCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTableCompartmentRequest, ChangeTableCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeTableCompartment");
        final ChangeTableCompartmentRequest interceptedRequest =
                ChangeTableCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTableCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ChangeTableCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ChangeTableCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeTableCompartmentResponse>
                transformer =
                        ChangeTableCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTableCompartmentRequest, ChangeTableCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTableCompartmentRequest, ChangeTableCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTableCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeTableCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTableCompartmentRequest, ChangeTableCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResponse> createIndex(
            CreateIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateIndexRequest, CreateIndexResponse>
                    handler) {
        LOG.trace("Called async createIndex");
        final CreateIndexRequest interceptedRequest =
                CreateIndexConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIndexConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "CreateIndex",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/CreateIndex");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIndexResponse>
                transformer =
                        CreateIndexConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateIndexRequest, CreateIndexResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIndexRequest, CreateIndexResponse>,
                        java.util.concurrent.Future<CreateIndexResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIndexDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIndexRequest, CreateIndexResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateReplicaResponse> createReplica(
            CreateReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateReplicaRequest, CreateReplicaResponse>
                    handler) {
        LOG.trace("Called async createReplica");
        final CreateReplicaRequest interceptedRequest =
                CreateReplicaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReplicaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "CreateReplica",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/CreateReplica");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateReplicaResponse>
                transformer =
                        CreateReplicaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateReplicaRequest, CreateReplicaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateReplicaRequest, CreateReplicaResponse>,
                        java.util.concurrent.Future<CreateReplicaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateReplicaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateReplicaRequest, CreateReplicaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTableResponse> createTable(
            CreateTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTableRequest, CreateTableResponse>
                    handler) {
        LOG.trace("Called async createTable");
        final CreateTableRequest interceptedRequest =
                CreateTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "CreateTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/CreateTable");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTableResponse>
                transformer =
                        CreateTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTableRequest, CreateTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTableRequest, CreateTableResponse>,
                        java.util.concurrent.Future<CreateTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTableRequest, CreateTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIndexResponse> deleteIndex(
            DeleteIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteIndexRequest, DeleteIndexResponse>
                    handler) {
        LOG.trace("Called async deleteIndex");
        final DeleteIndexRequest interceptedRequest =
                DeleteIndexConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIndexConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "DeleteIndex",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/DeleteIndex");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIndexResponse>
                transformer =
                        DeleteIndexConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteIndexRequest, DeleteIndexResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIndexRequest, DeleteIndexResponse>,
                        java.util.concurrent.Future<DeleteIndexResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIndexRequest, DeleteIndexResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicaResponse> deleteReplica(
            DeleteReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteReplicaRequest, DeleteReplicaResponse>
                    handler) {
        LOG.trace("Called async deleteReplica");
        final DeleteReplicaRequest interceptedRequest =
                DeleteReplicaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReplicaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "DeleteReplica",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/DeleteReplica");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteReplicaResponse>
                transformer =
                        DeleteReplicaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteReplicaRequest, DeleteReplicaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteReplicaRequest, DeleteReplicaResponse>,
                        java.util.concurrent.Future<DeleteReplicaResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteReplicaRequest, DeleteReplicaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRowResponse> deleteRow(
            DeleteRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRowRequest, DeleteRowResponse>
                    handler) {
        LOG.trace("Called async deleteRow");
        final DeleteRowRequest interceptedRequest = DeleteRowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "DeleteRow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/DeleteRow");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRowResponse>
                transformer =
                        DeleteRowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRowRequest, DeleteRowResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteRowRequest, DeleteRowResponse>,
                        java.util.concurrent.Future<DeleteRowResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRowRequest, DeleteRowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResponse> deleteTable(
            DeleteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTableRequest, DeleteTableResponse>
                    handler) {
        LOG.trace("Called async deleteTable");
        final DeleteTableRequest interceptedRequest =
                DeleteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "DeleteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/DeleteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTableResponse>
                transformer =
                        DeleteTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTableRequest, DeleteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTableRequest, DeleteTableResponse>,
                        java.util.concurrent.Future<DeleteTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTableRequest, DeleteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler) {
        LOG.trace("Called async deleteWorkRequest");
        final DeleteWorkRequestRequest interceptedRequest =
                DeleteWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "DeleteWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/DeleteWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteWorkRequestResponse>
                transformer =
                        DeleteWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWorkRequestRequest, DeleteWorkRequestResponse>,
                        java.util.concurrent.Future<DeleteWorkRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWorkRequestRequest, DeleteWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIndexResponse> getIndex(
            GetIndexRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIndexRequest, GetIndexResponse>
                    handler) {
        LOG.trace("Called async getIndex");
        final GetIndexRequest interceptedRequest = GetIndexConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIndexConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "GetIndex",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/GetIndex");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIndexResponse> transformer =
                GetIndexConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIndexRequest, GetIndexResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetIndexRequest, GetIndexResponse>,
                        java.util.concurrent.Future<GetIndexResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIndexRequest, GetIndexResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRowResponse> getRow(
            GetRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRowRequest, GetRowResponse> handler) {
        LOG.trace("Called async getRow");
        final GetRowRequest interceptedRequest = GetRowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "GetRow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/GetRow");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRowResponse> transformer =
                GetRowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRowRequest, GetRowResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetRowRequest, GetRowResponse>,
                        java.util.concurrent.Future<GetRowResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRowRequest, GetRowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTableResponse> getTable(
            GetTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTableRequest, GetTableResponse>
                    handler) {
        LOG.trace("Called async getTable");
        final GetTableRequest interceptedRequest = GetTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "GetTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/GetTable");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTableResponse> transformer =
                GetTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTableRequest, GetTableResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTableRequest, GetTableResponse>,
                        java.util.concurrent.Future<GetTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTableRequest, GetTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/GetWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer =
                        GetWorkRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListIndexesResponse> listIndexes(
            ListIndexesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListIndexesRequest, ListIndexesResponse>
                    handler) {
        LOG.trace("Called async listIndexes");
        final ListIndexesRequest interceptedRequest =
                ListIndexesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIndexesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListIndexes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Index/ListIndexes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIndexesResponse>
                transformer =
                        ListIndexesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListIndexesRequest, ListIndexesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIndexesRequest, ListIndexesResponse>,
                        java.util.concurrent.Future<ListIndexesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIndexesRequest, ListIndexesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTableUsageResponse> listTableUsage(
            ListTableUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTableUsageRequest, ListTableUsageResponse>
                    handler) {
        LOG.trace("Called async listTableUsage");
        final ListTableUsageRequest interceptedRequest =
                ListTableUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTableUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListTableUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ListTableUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTableUsageResponse>
                transformer =
                        ListTableUsageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTableUsageRequest, ListTableUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTableUsageRequest, ListTableUsageResponse>,
                        java.util.concurrent.Future<ListTableUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTableUsageRequest, ListTableUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/ListTables");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTablesResponse>
                transformer =
                        ListTablesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequestErrors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequestLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/WorkRequest/ListWorkRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer =
                        ListWorkRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<PrepareStatementResponse> prepareStatement(
            PrepareStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PrepareStatementRequest, PrepareStatementResponse>
                    handler) {
        LOG.trace("Called async prepareStatement");
        final PrepareStatementRequest interceptedRequest =
                PrepareStatementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PrepareStatementConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "PrepareStatement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/PrepareStatement");
        final java.util.function.Function<javax.ws.rs.core.Response, PrepareStatementResponse>
                transformer =
                        PrepareStatementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PrepareStatementRequest, PrepareStatementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PrepareStatementRequest, PrepareStatementResponse>,
                        java.util.concurrent.Future<PrepareStatementResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PrepareStatementRequest, PrepareStatementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "Query",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/Query");
        final java.util.function.Function<javax.ws.rs.core.Response, QueryResponse> transformer =
                QueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<SummarizeStatementResponse> summarizeStatement(
            SummarizeStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeStatementRequest, SummarizeStatementResponse>
                    handler) {
        LOG.trace("Called async summarizeStatement");
        final SummarizeStatementRequest interceptedRequest =
                SummarizeStatementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeStatementConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "SummarizeStatement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/QueryResultCollection/SummarizeStatement");
        final java.util.function.Function<javax.ws.rs.core.Response, SummarizeStatementResponse>
                transformer =
                        SummarizeStatementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SummarizeStatementRequest, SummarizeStatementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeStatementRequest, SummarizeStatementResponse>,
                        java.util.concurrent.Future<SummarizeStatementResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeStatementRequest, SummarizeStatementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRowResponse> updateRow(
            UpdateRowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRowRequest, UpdateRowResponse>
                    handler) {
        LOG.trace("Called async updateRow");
        final UpdateRowRequest interceptedRequest = UpdateRowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "UpdateRow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Row/UpdateRow");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRowResponse>
                transformer =
                        UpdateRowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateRowRequest, UpdateRowResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateRowRequest, UpdateRowResponse>,
                        java.util.concurrent.Future<UpdateRowResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRowRequest, UpdateRowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResponse> updateTable(
            UpdateTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTableRequest, UpdateTableResponse>
                    handler) {
        LOG.trace("Called async updateTable");
        final UpdateTableRequest interceptedRequest =
                UpdateTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Nosql",
                        "UpdateTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/nosql-database/20190828/Table/UpdateTable");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTableResponse>
                transformer =
                        UpdateTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTableRequest, UpdateTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTableRequest, UpdateTableResponse>,
                        java.util.concurrent.Future<UpdateTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTableRequest, UpdateTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
