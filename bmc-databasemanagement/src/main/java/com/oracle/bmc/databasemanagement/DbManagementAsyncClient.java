/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.internal.http.*;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Async client implementation for DbManagement service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementAsyncClient implements DbManagementAsync {
    /**
     * Service instance for DbManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementAsyncClient.class);

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
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
    public DbManagementAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbManagementAsyncClient> {
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
        public DbManagementAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DbManagementAsyncClient(
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
    public java.util.concurrent.Future<AddDataFilesResponse> addDataFiles(
            AddDataFilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                    handler) {
        LOG.trace("Called async addDataFiles");
        final AddDataFilesRequest interceptedRequest =
                AddDataFilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDataFilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddDataFiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/AddDataFiles");
        final java.util.function.Function<javax.ws.rs.core.Response, AddDataFilesResponse>
                transformer =
                        AddDataFilesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDataFilesRequest, AddDataFilesResponse>,
                        java.util.concurrent.Future<AddDataFilesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddDataFilesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDataFilesRequest, AddDataFilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddManagedDatabaseToManagedDatabaseGroupResponse>
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                                    AddManagedDatabaseToManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async addManagedDatabaseToManagedDatabaseGroup");
        final AddManagedDatabaseToManagedDatabaseGroupRequest interceptedRequest =
                AddManagedDatabaseToManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddManagedDatabaseToManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddManagedDatabaseToManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/AddManagedDatabaseToManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddManagedDatabaseToManagedDatabaseGroupResponse>
                transformer =
                        AddManagedDatabaseToManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddManagedDatabaseToManagedDatabaseGroupRequest,
                        AddManagedDatabaseToManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddManagedDatabaseToManagedDatabaseGroupRequest,
                                AddManagedDatabaseToManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<
                                AddManagedDatabaseToManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAddManagedDatabaseToManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                    AddManagedDatabaseToManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddmTasksResponse> addmTasks(
            AddmTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse>
                    handler) {
        LOG.trace("Called async addmTasks");
        final AddmTasksRequest interceptedRequest = AddmTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddmTasksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "AddmTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AddmTasksCollection/AddmTasks");
        final java.util.function.Function<javax.ws.rs.core.Response, AddmTasksResponse>
                transformer =
                        AddmTasksConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse>,
                        java.util.concurrent.Future<AddmTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddmTasksRequest, AddmTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseParametersResponse> changeDatabaseParameters(
            ChangeDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async changeDatabaseParameters");
        final ChangeDatabaseParametersRequest interceptedRequest =
                ChangeDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeDatabaseParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseParametersResponse>
                transformer =
                        ChangeDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>,
                        java.util.concurrent.Future<ChangeDatabaseParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDatabaseParametersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDbManagementPrivateEndpointCompartmentResponse>
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                                    ChangeDbManagementPrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDbManagementPrivateEndpointCompartment");
        final ChangeDbManagementPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDbManagementPrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDbManagementPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeDbManagementPrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ChangeDbManagementPrivateEndpointCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDbManagementPrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDbManagementPrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDbManagementPrivateEndpointCompartmentRequest,
                        ChangeDbManagementPrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDbManagementPrivateEndpointCompartmentRequest,
                                ChangeDbManagementPrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDbManagementPrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDbManagementPrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                    ChangeDbManagementPrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalDbSystemCompartmentResponse>
            changeExternalDbSystemCompartment(
                    ChangeExternalDbSystemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalDbSystemCompartmentRequest,
                                    ChangeExternalDbSystemCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExternalDbSystemCompartment");
        final ChangeExternalDbSystemCompartmentRequest interceptedRequest =
                ChangeExternalDbSystemCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalDbSystemCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeExternalDbSystemCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ChangeExternalDbSystemCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeExternalDbSystemCompartmentResponse>
                transformer =
                        ChangeExternalDbSystemCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExternalDbSystemCompartmentRequest,
                        ChangeExternalDbSystemCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExternalDbSystemCompartmentRequest,
                                ChangeExternalDbSystemCompartmentResponse>,
                        java.util.concurrent.Future<ChangeExternalDbSystemCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeExternalDbSystemCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExternalDbSystemCompartmentRequest,
                    ChangeExternalDbSystemCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeExternalExadataInfrastructureCompartmentResponse>
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalExadataInfrastructureCompartmentRequest,
                                    ChangeExternalExadataInfrastructureCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeExternalExadataInfrastructureCompartment");
        final ChangeExternalExadataInfrastructureCompartmentRequest interceptedRequest =
                ChangeExternalExadataInfrastructureCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeExternalExadataInfrastructureCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeExternalExadataInfrastructureCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ChangeExternalExadataInfrastructureCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeExternalExadataInfrastructureCompartmentResponse>
                transformer =
                        ChangeExternalExadataInfrastructureCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeExternalExadataInfrastructureCompartmentRequest,
                        ChangeExternalExadataInfrastructureCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeExternalExadataInfrastructureCompartmentRequest,
                                ChangeExternalExadataInfrastructureCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeExternalExadataInfrastructureCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeExternalExadataInfrastructureCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeExternalExadataInfrastructureCompartmentRequest,
                    ChangeExternalExadataInfrastructureCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobCompartment");
        final ChangeJobCompartmentRequest interceptedRequest =
                ChangeJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ChangeJobCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeJobCompartmentResponse>
                transformer =
                        ChangeJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>
            changeManagedDatabaseGroupCompartment(
                    ChangeManagedDatabaseGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedDatabaseGroupCompartmentRequest,
                                    ChangeManagedDatabaseGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeManagedDatabaseGroupCompartment");
        final ChangeManagedDatabaseGroupCompartmentRequest interceptedRequest =
                ChangeManagedDatabaseGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedDatabaseGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeManagedDatabaseGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ChangeManagedDatabaseGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeManagedDatabaseGroupCompartmentResponse>
                transformer =
                        ChangeManagedDatabaseGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeManagedDatabaseGroupCompartmentRequest,
                        ChangeManagedDatabaseGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeManagedDatabaseGroupCompartmentRequest,
                                ChangeManagedDatabaseGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeManagedDatabaseGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeManagedDatabaseGroupCompartmentRequest,
                    ChangeManagedDatabaseGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNamedCredentialCompartmentResponse>
            changeNamedCredentialCompartment(
                    ChangeNamedCredentialCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNamedCredentialCompartmentRequest,
                                    ChangeNamedCredentialCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNamedCredentialCompartment");
        final ChangeNamedCredentialCompartmentRequest interceptedRequest =
                ChangeNamedCredentialCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNamedCredentialCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeNamedCredentialCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ChangeNamedCredentialCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNamedCredentialCompartmentResponse>
                transformer =
                        ChangeNamedCredentialCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNamedCredentialCompartmentRequest,
                        ChangeNamedCredentialCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNamedCredentialCompartmentRequest,
                                ChangeNamedCredentialCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNamedCredentialCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNamedCredentialCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNamedCredentialCompartmentRequest,
                    ChangeNamedCredentialCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangePlanRetentionResponse> changePlanRetention(
            ChangePlanRetentionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePlanRetentionRequest, ChangePlanRetentionResponse>
                    handler) {
        LOG.trace("Called async changePlanRetention");
        final ChangePlanRetentionRequest interceptedRequest =
                ChangePlanRetentionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePlanRetentionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangePlanRetention",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangePlanRetention");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangePlanRetentionResponse>
                transformer =
                        ChangePlanRetentionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangePlanRetentionRequest, ChangePlanRetentionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangePlanRetentionRequest, ChangePlanRetentionResponse>,
                        java.util.concurrent.Future<ChangePlanRetentionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangePlanRetentionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangePlanRetentionRequest, ChangePlanRetentionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSpaceBudgetResponse> changeSpaceBudget(
            ChangeSpaceBudgetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>
                    handler) {
        LOG.trace("Called async changeSpaceBudget");
        final ChangeSpaceBudgetRequest interceptedRequest =
                ChangeSpaceBudgetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSpaceBudgetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeSpaceBudget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSpaceBudget");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeSpaceBudgetResponse>
                transformer =
                        ChangeSpaceBudgetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>,
                        java.util.concurrent.Future<ChangeSpaceBudgetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSpaceBudgetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlPlanBaselinesAttributesResponse>
            changeSqlPlanBaselinesAttributes(
                    ChangeSqlPlanBaselinesAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlPlanBaselinesAttributesRequest,
                                    ChangeSqlPlanBaselinesAttributesResponse>
                            handler) {
        LOG.trace("Called async changeSqlPlanBaselinesAttributes");
        final ChangeSqlPlanBaselinesAttributesRequest interceptedRequest =
                ChangeSqlPlanBaselinesAttributesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSqlPlanBaselinesAttributesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ChangeSqlPlanBaselinesAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeSqlPlanBaselinesAttributes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSqlPlanBaselinesAttributesResponse>
                transformer =
                        ChangeSqlPlanBaselinesAttributesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSqlPlanBaselinesAttributesRequest,
                        ChangeSqlPlanBaselinesAttributesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSqlPlanBaselinesAttributesRequest,
                                ChangeSqlPlanBaselinesAttributesResponse>,
                        java.util.concurrent.Future<ChangeSqlPlanBaselinesAttributesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSqlPlanBaselinesAttributesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSqlPlanBaselinesAttributesRequest,
                    ChangeSqlPlanBaselinesAttributesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CheckExternalDbSystemConnectorConnectionStatusResponse>
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDbSystemConnectorConnectionStatusRequest,
                                    CheckExternalDbSystemConnectorConnectionStatusResponse>
                            handler) {
        LOG.trace("Called async checkExternalDbSystemConnectorConnectionStatus");
        final CheckExternalDbSystemConnectorConnectionStatusRequest interceptedRequest =
                CheckExternalDbSystemConnectorConnectionStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalDbSystemConnectorConnectionStatusConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CheckExternalDbSystemConnectorConnectionStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CheckExternalDbSystemConnectorConnectionStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CheckExternalDbSystemConnectorConnectionStatusResponse>
                transformer =
                        CheckExternalDbSystemConnectorConnectionStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CheckExternalDbSystemConnectorConnectionStatusRequest,
                        CheckExternalDbSystemConnectorConnectionStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CheckExternalDbSystemConnectorConnectionStatusRequest,
                                CheckExternalDbSystemConnectorConnectionStatusResponse>,
                        java.util.concurrent.Future<
                                CheckExternalDbSystemConnectorConnectionStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CheckExternalDbSystemConnectorConnectionStatusRequest,
                    CheckExternalDbSystemConnectorConnectionStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CheckExternalExadataStorageConnectorResponse>
            checkExternalExadataStorageConnector(
                    CheckExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalExadataStorageConnectorRequest,
                                    CheckExternalExadataStorageConnectorResponse>
                            handler) {
        LOG.trace("Called async checkExternalExadataStorageConnector");
        final CheckExternalExadataStorageConnectorRequest interceptedRequest =
                CheckExternalExadataStorageConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CheckExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CheckExternalExadataStorageConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CheckExternalExadataStorageConnectorResponse>
                transformer =
                        CheckExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CheckExternalExadataStorageConnectorRequest,
                        CheckExternalExadataStorageConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CheckExternalExadataStorageConnectorRequest,
                                CheckExternalExadataStorageConnectorResponse>,
                        java.util.concurrent.Future<CheckExternalExadataStorageConnectorResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CheckExternalExadataStorageConnectorRequest,
                    CheckExternalExadataStorageConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
            checkExternalMySqlDatabaseConnectorConnectionStatus(
                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest,
                                    CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
                            handler) {
        LOG.trace("Called async checkExternalMySqlDatabaseConnectorConnectionStatus");
        final CheckExternalMySqlDatabaseConnectorConnectionStatusRequest interceptedRequest =
                CheckExternalMySqlDatabaseConnectorConnectionStatusConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CheckExternalMySqlDatabaseConnectorConnectionStatusConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CheckExternalMySqlDatabaseConnectorConnectionStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabaseConnector/CheckExternalMySqlDatabaseConnectorConnectionStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
                transformer =
                        CheckExternalMySqlDatabaseConnectorConnectionStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CheckExternalMySqlDatabaseConnectorConnectionStatusRequest,
                        CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CheckExternalMySqlDatabaseConnectorConnectionStatusRequest,
                                CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>,
                        java.util.concurrent.Future<
                                CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest,
                    CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutomaticCaptureFiltersResponse>
            configureAutomaticCaptureFilters(
                    ConfigureAutomaticCaptureFiltersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticCaptureFiltersRequest,
                                    ConfigureAutomaticCaptureFiltersResponse>
                            handler) {
        LOG.trace("Called async configureAutomaticCaptureFilters");
        final ConfigureAutomaticCaptureFiltersRequest interceptedRequest =
                ConfigureAutomaticCaptureFiltersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureAutomaticCaptureFiltersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ConfigureAutomaticCaptureFilters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticCaptureFilters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureAutomaticCaptureFiltersResponse>
                transformer =
                        ConfigureAutomaticCaptureFiltersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureAutomaticCaptureFiltersRequest,
                        ConfigureAutomaticCaptureFiltersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureAutomaticCaptureFiltersRequest,
                                ConfigureAutomaticCaptureFiltersResponse>,
                        java.util.concurrent.Future<ConfigureAutomaticCaptureFiltersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureAutomaticCaptureFiltersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureAutomaticCaptureFiltersRequest,
                    ConfigureAutomaticCaptureFiltersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
            configureAutomaticSpmEvolveAdvisorTask(
                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                                    ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {
        LOG.trace("Called async configureAutomaticSpmEvolveAdvisorTask");
        final ConfigureAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                ConfigureAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ConfigureAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ConfigureAutomaticSpmEvolveAdvisorTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        ConfigureAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                        ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                                ConfigureAutomaticSpmEvolveAdvisorTaskResponse>,
                        java.util.concurrent.Future<ConfigureAutomaticSpmEvolveAdvisorTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getConfigureAutomaticSpmEvolveAdvisorTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                    ConfigureAutomaticSpmEvolveAdvisorTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>
            createDbManagementPrivateEndpoint(
                    CreateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDbManagementPrivateEndpointRequest,
                                    CreateDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDbManagementPrivateEndpoint");
        final CreateDbManagementPrivateEndpointRequest interceptedRequest =
                CreateDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/CreateDbManagementPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDbManagementPrivateEndpointResponse>
                transformer =
                        CreateDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDbManagementPrivateEndpointRequest,
                        CreateDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDbManagementPrivateEndpointRequest,
                                CreateDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDbManagementPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDbManagementPrivateEndpointRequest,
                    CreateDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemResponse> createExternalDbSystem(
            CreateExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>
                    handler) {
        LOG.trace("Called async createExternalDbSystem");
        final CreateExternalDbSystemRequest interceptedRequest =
                CreateExternalDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/CreateExternalDbSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateExternalDbSystemResponse>
                transformer =
                        CreateExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>,
                        java.util.concurrent.Future<CreateExternalDbSystemResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemConnectorResponse>
            createExternalDbSystemConnector(
                    CreateExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemConnectorRequest,
                                    CreateExternalDbSystemConnectorResponse>
                            handler) {
        LOG.trace("Called async createExternalDbSystemConnector");
        final CreateExternalDbSystemConnectorRequest interceptedRequest =
                CreateExternalDbSystemConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/CreateExternalDbSystemConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalDbSystemConnectorResponse>
                transformer =
                        CreateExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalDbSystemConnectorRequest,
                        CreateExternalDbSystemConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalDbSystemConnectorRequest,
                                CreateExternalDbSystemConnectorResponse>,
                        java.util.concurrent.Future<CreateExternalDbSystemConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalDbSystemConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalDbSystemConnectorRequest,
                    CreateExternalDbSystemConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalDbSystemDiscoveryResponse>
            createExternalDbSystemDiscovery(
                    CreateExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemDiscoveryRequest,
                                    CreateExternalDbSystemDiscoveryResponse>
                            handler) {
        LOG.trace("Called async createExternalDbSystemDiscovery");
        final CreateExternalDbSystemDiscoveryRequest interceptedRequest =
                CreateExternalDbSystemDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/CreateExternalDbSystemDiscovery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalDbSystemDiscoveryResponse>
                transformer =
                        CreateExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalDbSystemDiscoveryRequest,
                        CreateExternalDbSystemDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalDbSystemDiscoveryRequest,
                                CreateExternalDbSystemDiscoveryResponse>,
                        java.util.concurrent.Future<CreateExternalDbSystemDiscoveryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalDbSystemDiscoveryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalDbSystemDiscoveryRequest,
                    CreateExternalDbSystemDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalExadataInfrastructureResponse>
            createExternalExadataInfrastructure(
                    CreateExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataInfrastructureRequest,
                                    CreateExternalExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async createExternalExadataInfrastructure");
        final CreateExternalExadataInfrastructureRequest interceptedRequest =
                CreateExternalExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/CreateExternalExadataInfrastructure");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalExadataInfrastructureResponse>
                transformer =
                        CreateExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalExadataInfrastructureRequest,
                        CreateExternalExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalExadataInfrastructureRequest,
                                CreateExternalExadataInfrastructureResponse>,
                        java.util.concurrent.Future<CreateExternalExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalExadataInfrastructureRequest,
                    CreateExternalExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalExadataStorageConnectorResponse>
            createExternalExadataStorageConnector(
                    CreateExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataStorageConnectorRequest,
                                    CreateExternalExadataStorageConnectorResponse>
                            handler) {
        LOG.trace("Called async createExternalExadataStorageConnector");
        final CreateExternalExadataStorageConnectorRequest interceptedRequest =
                CreateExternalExadataStorageConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/CreateExternalExadataStorageConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalExadataStorageConnectorResponse>
                transformer =
                        CreateExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalExadataStorageConnectorRequest,
                        CreateExternalExadataStorageConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalExadataStorageConnectorRequest,
                                CreateExternalExadataStorageConnectorResponse>,
                        java.util.concurrent.Future<CreateExternalExadataStorageConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateExternalExadataStorageConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalExadataStorageConnectorRequest,
                    CreateExternalExadataStorageConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalMySqlDatabaseResponse>
            createExternalMySqlDatabase(
                    CreateExternalMySqlDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalMySqlDatabaseRequest,
                                    CreateExternalMySqlDatabaseResponse>
                            handler) {
        LOG.trace("Called async createExternalMySqlDatabase");
        final CreateExternalMySqlDatabaseRequest interceptedRequest =
                CreateExternalMySqlDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalMySqlDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalMySqlDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/CreateExternalMySqlDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalMySqlDatabaseResponse>
                transformer =
                        CreateExternalMySqlDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalMySqlDatabaseRequest, CreateExternalMySqlDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalMySqlDatabaseRequest,
                                CreateExternalMySqlDatabaseResponse>,
                        java.util.concurrent.Future<CreateExternalMySqlDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalMySqlDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalMySqlDatabaseRequest, CreateExternalMySqlDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalMySqlDatabaseConnectorResponse>
            createExternalMySqlDatabaseConnector(
                    CreateExternalMySqlDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalMySqlDatabaseConnectorRequest,
                                    CreateExternalMySqlDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async createExternalMySqlDatabaseConnector");
        final CreateExternalMySqlDatabaseConnectorRequest interceptedRequest =
                CreateExternalMySqlDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalMySqlDatabaseConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateExternalMySqlDatabaseConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabaseConnector/CreateExternalMySqlDatabaseConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalMySqlDatabaseConnectorResponse>
                transformer =
                        CreateExternalMySqlDatabaseConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalMySqlDatabaseConnectorRequest,
                        CreateExternalMySqlDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalMySqlDatabaseConnectorRequest,
                                CreateExternalMySqlDatabaseConnectorResponse>,
                        java.util.concurrent.Future<CreateExternalMySqlDatabaseConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalMySqlDatabaseConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalMySqlDatabaseConnectorRequest,
                    CreateExternalMySqlDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/CreateJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateJobResponse>
                transformer =
                        CreateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreateManagedDatabaseGroupResponse>
            createManagedDatabaseGroup(
                    CreateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagedDatabaseGroupRequest,
                                    CreateManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async createManagedDatabaseGroup");
        final CreateManagedDatabaseGroupRequest interceptedRequest =
                CreateManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/CreateManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateManagedDatabaseGroupResponse>
                transformer =
                        CreateManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateManagedDatabaseGroupRequest,
                                CreateManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<CreateManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNamedCredentialResponse> createNamedCredential(
            CreateNamedCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNamedCredentialRequest, CreateNamedCredentialResponse>
                    handler) {
        LOG.trace("Called async createNamedCredential");
        final CreateNamedCredentialRequest interceptedRequest =
                CreateNamedCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNamedCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/CreateNamedCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateNamedCredentialResponse>
                transformer =
                        CreateNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNamedCredentialRequest, CreateNamedCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNamedCredentialRequest, CreateNamedCredentialResponse>,
                        java.util.concurrent.Future<CreateNamedCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNamedCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNamedCredentialRequest, CreateNamedCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTablespaceResponse> createTablespace(
            CreateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTablespaceRequest, CreateTablespaceResponse>
                    handler) {
        LOG.trace("Called async createTablespace");
        final CreateTablespaceRequest interceptedRequest =
                CreateTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTablespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "CreateTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/CreateTablespace");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTablespaceResponse>
                transformer =
                        CreateTablespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTablespaceRequest, CreateTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTablespaceRequest, CreateTablespaceResponse>,
                        java.util.concurrent.Future<CreateTablespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTablespaceRequest, CreateTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>
            deleteDbManagementPrivateEndpoint(
                    DeleteDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDbManagementPrivateEndpointRequest,
                                    DeleteDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDbManagementPrivateEndpoint");
        final DeleteDbManagementPrivateEndpointRequest interceptedRequest =
                DeleteDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/DeleteDbManagementPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDbManagementPrivateEndpointResponse>
                transformer =
                        DeleteDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDbManagementPrivateEndpointRequest,
                        DeleteDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDbManagementPrivateEndpointRequest,
                                DeleteDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDbManagementPrivateEndpointRequest,
                    DeleteDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemResponse> deleteExternalDbSystem(
            DeleteExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>
                    handler) {
        LOG.trace("Called async deleteExternalDbSystem");
        final DeleteExternalDbSystemRequest interceptedRequest =
                DeleteExternalDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DeleteExternalDbSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExternalDbSystemResponse>
                transformer =
                        DeleteExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>,
                        java.util.concurrent.Future<DeleteExternalDbSystemResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemConnectorResponse>
            deleteExternalDbSystemConnector(
                    DeleteExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemConnectorRequest,
                                    DeleteExternalDbSystemConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteExternalDbSystemConnector");
        final DeleteExternalDbSystemConnectorRequest interceptedRequest =
                DeleteExternalDbSystemConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/DeleteExternalDbSystemConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalDbSystemConnectorResponse>
                transformer =
                        DeleteExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalDbSystemConnectorRequest,
                        DeleteExternalDbSystemConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalDbSystemConnectorRequest,
                                DeleteExternalDbSystemConnectorResponse>,
                        java.util.concurrent.Future<DeleteExternalDbSystemConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalDbSystemConnectorRequest,
                    DeleteExternalDbSystemConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalDbSystemDiscoveryResponse>
            deleteExternalDbSystemDiscovery(
                    DeleteExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemDiscoveryRequest,
                                    DeleteExternalDbSystemDiscoveryResponse>
                            handler) {
        LOG.trace("Called async deleteExternalDbSystemDiscovery");
        final DeleteExternalDbSystemDiscoveryRequest interceptedRequest =
                DeleteExternalDbSystemDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/DeleteExternalDbSystemDiscovery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalDbSystemDiscoveryResponse>
                transformer =
                        DeleteExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalDbSystemDiscoveryRequest,
                        DeleteExternalDbSystemDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalDbSystemDiscoveryRequest,
                                DeleteExternalDbSystemDiscoveryResponse>,
                        java.util.concurrent.Future<DeleteExternalDbSystemDiscoveryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalDbSystemDiscoveryRequest,
                    DeleteExternalDbSystemDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalExadataInfrastructureResponse>
            deleteExternalExadataInfrastructure(
                    DeleteExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataInfrastructureRequest,
                                    DeleteExternalExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async deleteExternalExadataInfrastructure");
        final DeleteExternalExadataInfrastructureRequest interceptedRequest =
                DeleteExternalExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DeleteExternalExadataInfrastructure");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalExadataInfrastructureResponse>
                transformer =
                        DeleteExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalExadataInfrastructureRequest,
                        DeleteExternalExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalExadataInfrastructureRequest,
                                DeleteExternalExadataInfrastructureResponse>,
                        java.util.concurrent.Future<DeleteExternalExadataInfrastructureResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalExadataInfrastructureRequest,
                    DeleteExternalExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalExadataStorageConnectorResponse>
            deleteExternalExadataStorageConnector(
                    DeleteExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataStorageConnectorRequest,
                                    DeleteExternalExadataStorageConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteExternalExadataStorageConnector");
        final DeleteExternalExadataStorageConnectorRequest interceptedRequest =
                DeleteExternalExadataStorageConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/DeleteExternalExadataStorageConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalExadataStorageConnectorResponse>
                transformer =
                        DeleteExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalExadataStorageConnectorRequest,
                        DeleteExternalExadataStorageConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalExadataStorageConnectorRequest,
                                DeleteExternalExadataStorageConnectorResponse>,
                        java.util.concurrent.Future<DeleteExternalExadataStorageConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalExadataStorageConnectorRequest,
                    DeleteExternalExadataStorageConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalMySqlDatabaseResponse>
            deleteExternalMySqlDatabase(
                    DeleteExternalMySqlDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalMySqlDatabaseRequest,
                                    DeleteExternalMySqlDatabaseResponse>
                            handler) {
        LOG.trace("Called async deleteExternalMySqlDatabase");
        final DeleteExternalMySqlDatabaseRequest interceptedRequest =
                DeleteExternalMySqlDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalMySqlDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalMySqlDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/DeleteExternalMySqlDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalMySqlDatabaseResponse>
                transformer =
                        DeleteExternalMySqlDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalMySqlDatabaseRequest, DeleteExternalMySqlDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalMySqlDatabaseRequest,
                                DeleteExternalMySqlDatabaseResponse>,
                        java.util.concurrent.Future<DeleteExternalMySqlDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalMySqlDatabaseRequest, DeleteExternalMySqlDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalMySqlDatabaseConnectorResponse>
            deleteExternalMySqlDatabaseConnector(
                    DeleteExternalMySqlDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalMySqlDatabaseConnectorRequest,
                                    DeleteExternalMySqlDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteExternalMySqlDatabaseConnector");
        final DeleteExternalMySqlDatabaseConnectorRequest interceptedRequest =
                DeleteExternalMySqlDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalMySqlDatabaseConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteExternalMySqlDatabaseConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabaseConnector/DeleteExternalMySqlDatabaseConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalMySqlDatabaseConnectorResponse>
                transformer =
                        DeleteExternalMySqlDatabaseConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalMySqlDatabaseConnectorRequest,
                        DeleteExternalMySqlDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalMySqlDatabaseConnectorRequest,
                                DeleteExternalMySqlDatabaseConnectorResponse>,
                        java.util.concurrent.Future<DeleteExternalMySqlDatabaseConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalMySqlDatabaseConnectorRequest,
                    DeleteExternalMySqlDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/DeleteJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteJobResponse>
                transformer =
                        DeleteJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse>
            deleteManagedDatabaseGroup(
                    DeleteManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagedDatabaseGroupRequest,
                                    DeleteManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async deleteManagedDatabaseGroup");
        final DeleteManagedDatabaseGroupRequest interceptedRequest =
                DeleteManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/DeleteManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteManagedDatabaseGroupResponse>
                transformer =
                        DeleteManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedDatabaseGroupRequest,
                                DeleteManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNamedCredentialResponse> deleteNamedCredential(
            DeleteNamedCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNamedCredentialRequest, DeleteNamedCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteNamedCredential");
        final DeleteNamedCredentialRequest interceptedRequest =
                DeleteNamedCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNamedCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeleteNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/DeleteNamedCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNamedCredentialResponse>
                transformer =
                        DeleteNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNamedCredentialRequest, DeleteNamedCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNamedCredentialRequest, DeleteNamedCredentialResponse>,
                        java.util.concurrent.Future<DeleteNamedCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNamedCredentialRequest, DeleteNamedCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePreferredCredentialResponse> deletePreferredCredential(
            DeletePreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePreferredCredentialRequest, DeletePreferredCredentialResponse>
                    handler) {
        LOG.trace("Called async deletePreferredCredential");
        final DeletePreferredCredentialRequest interceptedRequest =
                DeletePreferredCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePreferredCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DeletePreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/DeletePreferredCredential");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeletePreferredCredentialResponse>
                transformer =
                        DeletePreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePreferredCredentialRequest, DeletePreferredCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePreferredCredentialRequest,
                                DeletePreferredCredentialResponse>,
                        java.util.concurrent.Future<DeletePreferredCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePreferredCredentialRequest, DeletePreferredCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableAutomaticInitialPlanCaptureResponse>
            disableAutomaticInitialPlanCapture(
                    DisableAutomaticInitialPlanCaptureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticInitialPlanCaptureRequest,
                                    DisableAutomaticInitialPlanCaptureResponse>
                            handler) {
        LOG.trace("Called async disableAutomaticInitialPlanCapture");
        final DisableAutomaticInitialPlanCaptureRequest interceptedRequest =
                DisableAutomaticInitialPlanCaptureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutomaticInitialPlanCaptureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutomaticInitialPlanCapture",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticInitialPlanCapture");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableAutomaticInitialPlanCaptureResponse>
                transformer =
                        DisableAutomaticInitialPlanCaptureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableAutomaticInitialPlanCaptureRequest,
                        DisableAutomaticInitialPlanCaptureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableAutomaticInitialPlanCaptureRequest,
                                DisableAutomaticInitialPlanCaptureResponse>,
                        java.util.concurrent.Future<DisableAutomaticInitialPlanCaptureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableAutomaticInitialPlanCaptureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableAutomaticInitialPlanCaptureRequest,
                    DisableAutomaticInitialPlanCaptureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableAutomaticSpmEvolveAdvisorTaskResponse>
            disableAutomaticSpmEvolveAdvisorTask(
                    DisableAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {
        LOG.trace("Called async disableAutomaticSpmEvolveAdvisorTask");
        final DisableAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                DisableAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutomaticSpmEvolveAdvisorTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        DisableAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableAutomaticSpmEvolveAdvisorTaskRequest,
                        DisableAutomaticSpmEvolveAdvisorTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableAutomaticSpmEvolveAdvisorTaskRequest,
                                DisableAutomaticSpmEvolveAdvisorTaskResponse>,
                        java.util.concurrent.Future<DisableAutomaticSpmEvolveAdvisorTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableAutomaticSpmEvolveAdvisorTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableAutomaticSpmEvolveAdvisorTaskRequest,
                    DisableAutomaticSpmEvolveAdvisorTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableAutonomousDatabaseManagementFeatureResponse>
            disableAutonomousDatabaseManagementFeature(
                    DisableAutonomousDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseManagementFeatureRequest,
                                    DisableAutonomousDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disableAutonomousDatabaseManagementFeature");
        final DisableAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                DisableAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableAutonomousDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        DisableAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableAutonomousDatabaseManagementFeatureRequest,
                        DisableAutonomousDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableAutonomousDatabaseManagementFeatureRequest,
                                DisableAutonomousDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                DisableAutonomousDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableAutonomousDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableAutonomousDatabaseManagementFeatureRequest,
                    DisableAutonomousDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableDatabaseManagementFeatureResponse>
            disableDatabaseManagementFeature(
                    DisableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableDatabaseManagementFeatureRequest,
                                    DisableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disableDatabaseManagementFeature");
        final DisableDatabaseManagementFeatureRequest interceptedRequest =
                DisableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableDatabaseManagementFeatureResponse>
                transformer =
                        DisableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableDatabaseManagementFeatureRequest,
                        DisableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableDatabaseManagementFeatureRequest,
                                DisableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<DisableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableDatabaseManagementFeatureRequest,
                    DisableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalContainerDatabaseManagementFeatureResponse>
            disableExternalContainerDatabaseManagementFeature(
                    DisableExternalContainerDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseManagementFeatureRequest,
                                    DisableExternalContainerDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disableExternalContainerDatabaseManagementFeature");
        final DisableExternalContainerDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalContainerDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalContainerDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalContainerDatabaseManagementFeatureRequest,
                        DisableExternalContainerDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalContainerDatabaseManagementFeatureRequest,
                                DisableExternalContainerDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                DisableExternalContainerDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableExternalContainerDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalContainerDatabaseManagementFeatureRequest,
                    DisableExternalContainerDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDbSystemDatabaseManagementResponse>
            disableExternalDbSystemDatabaseManagement(
                    DisableExternalDbSystemDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemDatabaseManagementRequest,
                                    DisableExternalDbSystemDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalDbSystemDatabaseManagement");
        final DisableExternalDbSystemDatabaseManagementRequest interceptedRequest =
                DisableExternalDbSystemDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalDbSystemDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemDatabaseManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalDbSystemDatabaseManagementResponse>
                transformer =
                        DisableExternalDbSystemDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalDbSystemDatabaseManagementRequest,
                        DisableExternalDbSystemDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalDbSystemDatabaseManagementRequest,
                                DisableExternalDbSystemDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                DisableExternalDbSystemDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalDbSystemDatabaseManagementRequest,
                    DisableExternalDbSystemDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDbSystemStackMonitoringResponse>
            disableExternalDbSystemStackMonitoring(
                    DisableExternalDbSystemStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemStackMonitoringRequest,
                                    DisableExternalDbSystemStackMonitoringResponse>
                            handler) {
        LOG.trace("Called async disableExternalDbSystemStackMonitoring");
        final DisableExternalDbSystemStackMonitoringRequest interceptedRequest =
                DisableExternalDbSystemStackMonitoringConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalDbSystemStackMonitoringConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalDbSystemStackMonitoring",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/DisableExternalDbSystemStackMonitoring");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableExternalDbSystemStackMonitoringResponse>
                transformer =
                        DisableExternalDbSystemStackMonitoringConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalDbSystemStackMonitoringRequest,
                        DisableExternalDbSystemStackMonitoringResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalDbSystemStackMonitoringRequest,
                                DisableExternalDbSystemStackMonitoringResponse>,
                        java.util.concurrent.Future<DisableExternalDbSystemStackMonitoringResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalDbSystemStackMonitoringRequest,
                    DisableExternalDbSystemStackMonitoringResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalExadataInfrastructureManagementResponse>
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalExadataInfrastructureManagementRequest,
                                    DisableExternalExadataInfrastructureManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalExadataInfrastructureManagement");
        final DisableExternalExadataInfrastructureManagementRequest interceptedRequest =
                DisableExternalExadataInfrastructureManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalExadataInfrastructureManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalExadataInfrastructureManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DisableExternalExadataInfrastructureManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalExadataInfrastructureManagementResponse>
                transformer =
                        DisableExternalExadataInfrastructureManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalExadataInfrastructureManagementRequest,
                        DisableExternalExadataInfrastructureManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalExadataInfrastructureManagementRequest,
                                DisableExternalExadataInfrastructureManagementResponse>,
                        java.util.concurrent.Future<
                                DisableExternalExadataInfrastructureManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalExadataInfrastructureManagementRequest,
                    DisableExternalExadataInfrastructureManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalMySqlDatabaseManagementResponse>
            disableExternalMySqlDatabaseManagement(
                    DisableExternalMySqlDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalMySqlDatabaseManagementRequest,
                                    DisableExternalMySqlDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async disableExternalMySqlDatabaseManagement");
        final DisableExternalMySqlDatabaseManagementRequest interceptedRequest =
                DisableExternalMySqlDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalMySqlDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalMySqlDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/DisableExternalMySqlDatabaseManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableExternalMySqlDatabaseManagementResponse>
                transformer =
                        DisableExternalMySqlDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalMySqlDatabaseManagementRequest,
                        DisableExternalMySqlDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalMySqlDatabaseManagementRequest,
                                DisableExternalMySqlDatabaseManagementResponse>,
                        java.util.concurrent.Future<DisableExternalMySqlDatabaseManagementResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalMySqlDatabaseManagementRequest,
                    DisableExternalMySqlDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalNonContainerDatabaseManagementFeatureResponse>
            disableExternalNonContainerDatabaseManagementFeature(
                    DisableExternalNonContainerDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseManagementFeatureRequest,
                                    DisableExternalNonContainerDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disableExternalNonContainerDatabaseManagementFeature");
        final DisableExternalNonContainerDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalNonContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalNonContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalNonContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalNonContainerDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalNonContainerDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalNonContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalNonContainerDatabaseManagementFeatureRequest,
                        DisableExternalNonContainerDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalNonContainerDatabaseManagementFeatureRequest,
                                DisableExternalNonContainerDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                DisableExternalNonContainerDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableExternalNonContainerDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalNonContainerDatabaseManagementFeatureRequest,
                    DisableExternalNonContainerDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalPluggableDatabaseManagementFeatureResponse>
            disableExternalPluggableDatabaseManagementFeature(
                    DisableExternalPluggableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseManagementFeatureRequest,
                                    DisableExternalPluggableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disableExternalPluggableDatabaseManagementFeature");
        final DisableExternalPluggableDatabaseManagementFeatureRequest interceptedRequest =
                DisableExternalPluggableDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableExternalPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableExternalPluggableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableExternalPluggableDatabaseManagementFeatureResponse>
                transformer =
                        DisableExternalPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalPluggableDatabaseManagementFeatureRequest,
                        DisableExternalPluggableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalPluggableDatabaseManagementFeatureRequest,
                                DisableExternalPluggableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                DisableExternalPluggableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableExternalPluggableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalPluggableDatabaseManagementFeatureRequest,
                    DisableExternalPluggableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {
        LOG.trace("Called async disableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                        DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>,
                        java.util.concurrent.Future<
                                DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisablePluggableDatabaseManagementFeatureResponse>
            disablePluggableDatabaseManagementFeature(
                    DisablePluggableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisablePluggableDatabaseManagementFeatureRequest,
                                    DisablePluggableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async disablePluggableDatabaseManagementFeature");
        final DisablePluggableDatabaseManagementFeatureRequest interceptedRequest =
                DisablePluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisablePluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisablePluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisablePluggableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DisablePluggableDatabaseManagementFeatureResponse>
                transformer =
                        DisablePluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisablePluggableDatabaseManagementFeatureRequest,
                        DisablePluggableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisablePluggableDatabaseManagementFeatureRequest,
                                DisablePluggableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                DisablePluggableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDisablePluggableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisablePluggableDatabaseManagementFeatureRequest,
                    DisablePluggableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableSqlPlanBaselinesUsageResponse>
            disableSqlPlanBaselinesUsage(
                    DisableSqlPlanBaselinesUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisableSqlPlanBaselinesUsageRequest,
                                    DisableSqlPlanBaselinesUsageResponse>
                            handler) {
        LOG.trace("Called async disableSqlPlanBaselinesUsage");
        final DisableSqlPlanBaselinesUsageRequest interceptedRequest =
                DisableSqlPlanBaselinesUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableSqlPlanBaselinesUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DisableSqlPlanBaselinesUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DisableSqlPlanBaselinesUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableSqlPlanBaselinesUsageResponse>
                transformer =
                        DisableSqlPlanBaselinesUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableSqlPlanBaselinesUsageRequest, DisableSqlPlanBaselinesUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableSqlPlanBaselinesUsageRequest,
                                DisableSqlPlanBaselinesUsageResponse>,
                        java.util.concurrent.Future<DisableSqlPlanBaselinesUsageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableSqlPlanBaselinesUsageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableSqlPlanBaselinesUsageRequest, DisableSqlPlanBaselinesUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DiscoverExternalExadataInfrastructureResponse>
            discoverExternalExadataInfrastructure(
                    DiscoverExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DiscoverExternalExadataInfrastructureRequest,
                                    DiscoverExternalExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async discoverExternalExadataInfrastructure");
        final DiscoverExternalExadataInfrastructureRequest interceptedRequest =
                DiscoverExternalExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DiscoverExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DiscoverExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/DiscoverExternalExadataInfrastructure");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DiscoverExternalExadataInfrastructureResponse>
                transformer =
                        DiscoverExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DiscoverExternalExadataInfrastructureRequest,
                        DiscoverExternalExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DiscoverExternalExadataInfrastructureRequest,
                                DiscoverExternalExadataInfrastructureResponse>,
                        java.util.concurrent.Future<DiscoverExternalExadataInfrastructureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getDiscoverExternalExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DiscoverExternalExadataInfrastructureRequest,
                    DiscoverExternalExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DropSqlPlanBaselinesResponse> dropSqlPlanBaselines(
            DropSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>
                    handler) {
        LOG.trace("Called async dropSqlPlanBaselines");
        final DropSqlPlanBaselinesRequest interceptedRequest =
                DropSqlPlanBaselinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DropSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DropSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DropSqlPlanBaselines");
        final java.util.function.Function<javax.ws.rs.core.Response, DropSqlPlanBaselinesResponse>
                transformer =
                        DropSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>,
                        java.util.concurrent.Future<DropSqlPlanBaselinesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDropSqlPlanBaselinesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DropTablespaceResponse> dropTablespace(
            DropTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropTablespaceRequest, DropTablespaceResponse>
                    handler) {
        LOG.trace("Called async dropTablespace");
        final DropTablespaceRequest interceptedRequest =
                DropTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DropTablespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "DropTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/DropTablespace");
        final java.util.function.Function<javax.ws.rs.core.Response, DropTablespaceResponse>
                transformer =
                        DropTablespaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DropTablespaceRequest, DropTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DropTablespaceRequest, DropTablespaceResponse>,
                        java.util.concurrent.Future<DropTablespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDropTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DropTablespaceRequest, DropTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableAutomaticInitialPlanCaptureResponse>
            enableAutomaticInitialPlanCapture(
                    EnableAutomaticInitialPlanCaptureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticInitialPlanCaptureRequest,
                                    EnableAutomaticInitialPlanCaptureResponse>
                            handler) {
        LOG.trace("Called async enableAutomaticInitialPlanCapture");
        final EnableAutomaticInitialPlanCaptureRequest interceptedRequest =
                EnableAutomaticInitialPlanCaptureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutomaticInitialPlanCaptureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutomaticInitialPlanCapture",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticInitialPlanCapture");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableAutomaticInitialPlanCaptureResponse>
                transformer =
                        EnableAutomaticInitialPlanCaptureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableAutomaticInitialPlanCaptureRequest,
                        EnableAutomaticInitialPlanCaptureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableAutomaticInitialPlanCaptureRequest,
                                EnableAutomaticInitialPlanCaptureResponse>,
                        java.util.concurrent.Future<EnableAutomaticInitialPlanCaptureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableAutomaticInitialPlanCaptureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableAutomaticInitialPlanCaptureRequest,
                    EnableAutomaticInitialPlanCaptureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableAutomaticSpmEvolveAdvisorTaskResponse>
            enableAutomaticSpmEvolveAdvisorTask(
                    EnableAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {
        LOG.trace("Called async enableAutomaticSpmEvolveAdvisorTask");
        final EnableAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                EnableAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutomaticSpmEvolveAdvisorTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        EnableAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableAutomaticSpmEvolveAdvisorTaskRequest,
                        EnableAutomaticSpmEvolveAdvisorTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableAutomaticSpmEvolveAdvisorTaskRequest,
                                EnableAutomaticSpmEvolveAdvisorTaskResponse>,
                        java.util.concurrent.Future<EnableAutomaticSpmEvolveAdvisorTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableAutomaticSpmEvolveAdvisorTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableAutomaticSpmEvolveAdvisorTaskRequest,
                    EnableAutomaticSpmEvolveAdvisorTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableAutonomousDatabaseManagementFeatureResponse>
            enableAutonomousDatabaseManagementFeature(
                    EnableAutonomousDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseManagementFeatureRequest,
                                    EnableAutonomousDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enableAutonomousDatabaseManagementFeature");
        final EnableAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                EnableAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableAutonomousDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        EnableAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableAutonomousDatabaseManagementFeatureRequest,
                        EnableAutonomousDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableAutonomousDatabaseManagementFeatureRequest,
                                EnableAutonomousDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                EnableAutonomousDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableAutonomousDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableAutonomousDatabaseManagementFeatureRequest,
                    EnableAutonomousDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableDatabaseManagementFeatureResponse>
            enableDatabaseManagementFeature(
                    EnableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableDatabaseManagementFeatureRequest,
                                    EnableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enableDatabaseManagementFeature");
        final EnableDatabaseManagementFeatureRequest interceptedRequest =
                EnableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableDatabaseManagementFeatureResponse>
                transformer =
                        EnableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableDatabaseManagementFeatureRequest,
                        EnableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableDatabaseManagementFeatureRequest,
                                EnableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<EnableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableDatabaseManagementFeatureRequest,
                    EnableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalContainerDatabaseManagementFeatureResponse>
            enableExternalContainerDatabaseManagementFeature(
                    EnableExternalContainerDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseManagementFeatureRequest,
                                    EnableExternalContainerDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enableExternalContainerDatabaseManagementFeature");
        final EnableExternalContainerDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalContainerDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalContainerDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalContainerDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalContainerDatabaseManagementFeatureRequest,
                        EnableExternalContainerDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalContainerDatabaseManagementFeatureRequest,
                                EnableExternalContainerDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                EnableExternalContainerDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalContainerDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalContainerDatabaseManagementFeatureRequest,
                    EnableExternalContainerDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalDbSystemDatabaseManagementResponse>
            enableExternalDbSystemDatabaseManagement(
                    EnableExternalDbSystemDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemDatabaseManagementRequest,
                                    EnableExternalDbSystemDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalDbSystemDatabaseManagement");
        final EnableExternalDbSystemDatabaseManagementRequest interceptedRequest =
                EnableExternalDbSystemDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalDbSystemDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemDatabaseManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableExternalDbSystemDatabaseManagementResponse>
                transformer =
                        EnableExternalDbSystemDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalDbSystemDatabaseManagementRequest,
                        EnableExternalDbSystemDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalDbSystemDatabaseManagementRequest,
                                EnableExternalDbSystemDatabaseManagementResponse>,
                        java.util.concurrent.Future<
                                EnableExternalDbSystemDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalDbSystemDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalDbSystemDatabaseManagementRequest,
                    EnableExternalDbSystemDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalDbSystemStackMonitoringResponse>
            enableExternalDbSystemStackMonitoring(
                    EnableExternalDbSystemStackMonitoringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemStackMonitoringRequest,
                                    EnableExternalDbSystemStackMonitoringResponse>
                            handler) {
        LOG.trace("Called async enableExternalDbSystemStackMonitoring");
        final EnableExternalDbSystemStackMonitoringRequest interceptedRequest =
                EnableExternalDbSystemStackMonitoringConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalDbSystemStackMonitoringConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalDbSystemStackMonitoring",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/EnableExternalDbSystemStackMonitoring");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableExternalDbSystemStackMonitoringResponse>
                transformer =
                        EnableExternalDbSystemStackMonitoringConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalDbSystemStackMonitoringRequest,
                        EnableExternalDbSystemStackMonitoringResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalDbSystemStackMonitoringRequest,
                                EnableExternalDbSystemStackMonitoringResponse>,
                        java.util.concurrent.Future<EnableExternalDbSystemStackMonitoringResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalDbSystemStackMonitoringDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalDbSystemStackMonitoringRequest,
                    EnableExternalDbSystemStackMonitoringResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalExadataInfrastructureManagementResponse>
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalExadataInfrastructureManagementRequest,
                                    EnableExternalExadataInfrastructureManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalExadataInfrastructureManagement");
        final EnableExternalExadataInfrastructureManagementRequest interceptedRequest =
                EnableExternalExadataInfrastructureManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalExadataInfrastructureManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalExadataInfrastructureManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/EnableExternalExadataInfrastructureManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalExadataInfrastructureManagementResponse>
                transformer =
                        EnableExternalExadataInfrastructureManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalExadataInfrastructureManagementRequest,
                        EnableExternalExadataInfrastructureManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalExadataInfrastructureManagementRequest,
                                EnableExternalExadataInfrastructureManagementResponse>,
                        java.util.concurrent.Future<
                                EnableExternalExadataInfrastructureManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalExadataInfrastructureManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalExadataInfrastructureManagementRequest,
                    EnableExternalExadataInfrastructureManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalMySqlDatabaseManagementResponse>
            enableExternalMySqlDatabaseManagement(
                    EnableExternalMySqlDatabaseManagementRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalMySqlDatabaseManagementRequest,
                                    EnableExternalMySqlDatabaseManagementResponse>
                            handler) {
        LOG.trace("Called async enableExternalMySqlDatabaseManagement");
        final EnableExternalMySqlDatabaseManagementRequest interceptedRequest =
                EnableExternalMySqlDatabaseManagementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalMySqlDatabaseManagementConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalMySqlDatabaseManagement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/EnableExternalMySqlDatabaseManagement");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableExternalMySqlDatabaseManagementResponse>
                transformer =
                        EnableExternalMySqlDatabaseManagementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalMySqlDatabaseManagementRequest,
                        EnableExternalMySqlDatabaseManagementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalMySqlDatabaseManagementRequest,
                                EnableExternalMySqlDatabaseManagementResponse>,
                        java.util.concurrent.Future<EnableExternalMySqlDatabaseManagementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableExternalDatabaseManagementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalMySqlDatabaseManagementRequest,
                    EnableExternalMySqlDatabaseManagementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalNonContainerDatabaseManagementFeatureResponse>
            enableExternalNonContainerDatabaseManagementFeature(
                    EnableExternalNonContainerDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseManagementFeatureRequest,
                                    EnableExternalNonContainerDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enableExternalNonContainerDatabaseManagementFeature");
        final EnableExternalNonContainerDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalNonContainerDatabaseManagementFeatureConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalNonContainerDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalNonContainerDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalNonContainerDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalNonContainerDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalNonContainerDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalNonContainerDatabaseManagementFeatureRequest,
                        EnableExternalNonContainerDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalNonContainerDatabaseManagementFeatureRequest,
                                EnableExternalNonContainerDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                EnableExternalNonContainerDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalNonContainerDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalNonContainerDatabaseManagementFeatureRequest,
                    EnableExternalNonContainerDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableExternalPluggableDatabaseManagementFeatureResponse>
            enableExternalPluggableDatabaseManagementFeature(
                    EnableExternalPluggableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseManagementFeatureRequest,
                                    EnableExternalPluggableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enableExternalPluggableDatabaseManagementFeature");
        final EnableExternalPluggableDatabaseManagementFeatureRequest interceptedRequest =
                EnableExternalPluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableExternalPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableExternalPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableExternalPluggableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableExternalPluggableDatabaseManagementFeatureResponse>
                transformer =
                        EnableExternalPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableExternalPluggableDatabaseManagementFeatureRequest,
                        EnableExternalPluggableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableExternalPluggableDatabaseManagementFeatureRequest,
                                EnableExternalPluggableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                EnableExternalPluggableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableExternalPluggableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableExternalPluggableDatabaseManagementFeatureRequest,
                    EnableExternalPluggableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler) {
        LOG.trace("Called async enableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest interceptedRequest =
                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableHighFrequencyAutomaticSpmEvolveAdvisorTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableHighFrequencyAutomaticSpmEvolveAdvisorTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                transformer =
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                        EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>,
                        java.util.concurrent.Future<
                                EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnableHighFrequencyAutomaticSpmEvolveAdvisorTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnablePluggableDatabaseManagementFeatureResponse>
            enablePluggableDatabaseManagementFeature(
                    EnablePluggableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnablePluggableDatabaseManagementFeatureRequest,
                                    EnablePluggableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async enablePluggableDatabaseManagementFeature");
        final EnablePluggableDatabaseManagementFeatureRequest interceptedRequest =
                EnablePluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnablePluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnablePluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnablePluggableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnablePluggableDatabaseManagementFeatureResponse>
                transformer =
                        EnablePluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnablePluggableDatabaseManagementFeatureRequest,
                        EnablePluggableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnablePluggableDatabaseManagementFeatureRequest,
                                EnablePluggableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                EnablePluggableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getEnablePluggableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnablePluggableDatabaseManagementFeatureRequest,
                    EnablePluggableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableSqlPlanBaselinesUsageResponse>
            enableSqlPlanBaselinesUsage(
                    EnableSqlPlanBaselinesUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EnableSqlPlanBaselinesUsageRequest,
                                    EnableSqlPlanBaselinesUsageResponse>
                            handler) {
        LOG.trace("Called async enableSqlPlanBaselinesUsage");
        final EnableSqlPlanBaselinesUsageRequest interceptedRequest =
                EnableSqlPlanBaselinesUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableSqlPlanBaselinesUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "EnableSqlPlanBaselinesUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/EnableSqlPlanBaselinesUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableSqlPlanBaselinesUsageResponse>
                transformer =
                        EnableSqlPlanBaselinesUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableSqlPlanBaselinesUsageRequest, EnableSqlPlanBaselinesUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableSqlPlanBaselinesUsageRequest,
                                EnableSqlPlanBaselinesUsageResponse>,
                        java.util.concurrent.Future<EnableSqlPlanBaselinesUsageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableSqlPlanBaselinesUsageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableSqlPlanBaselinesUsageRequest, EnableSqlPlanBaselinesUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAwrSnapshotResponse> generateAwrSnapshot(
            GenerateAwrSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                    handler) {
        LOG.trace("Called async generateAwrSnapshot");
        final GenerateAwrSnapshotRequest interceptedRequest =
                GenerateAwrSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAwrSnapshotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GenerateAwrSnapshot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/SnapshotDetails/GenerateAwrSnapshot");
        final java.util.function.Function<javax.ws.rs.core.Response, GenerateAwrSnapshotResponse>
                transformer =
                        GenerateAwrSnapshotConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>,
                        java.util.concurrent.Future<GenerateAwrSnapshotResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbReportResponse> getAwrDbReport(
            GetAwrDbReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbReportRequest, GetAwrDbReportResponse>
                    handler) {
        LOG.trace("Called async getAwrDbReport");
        final GetAwrDbReportRequest interceptedRequest =
                GetAwrDbReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetAwrDbReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAwrDbReportResponse>
                transformer =
                        GetAwrDbReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAwrDbReportRequest, GetAwrDbReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAwrDbReportRequest, GetAwrDbReportResponse>,
                        java.util.concurrent.Future<GetAwrDbReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAwrDbReportRequest, GetAwrDbReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbSqlReportResponse> getAwrDbSqlReport(
            GetAwrDbSqlReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                    handler) {
        LOG.trace("Called async getAwrDbSqlReport");
        final GetAwrDbSqlReportRequest interceptedRequest =
                GetAwrDbSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbSqlReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetAwrDbSqlReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbSqlReport");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAwrDbSqlReportResponse>
                transformer =
                        GetAwrDbSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>,
                        java.util.concurrent.Future<GetAwrDbSqlReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetClusterCacheMetricResponse> getClusterCacheMetric(
            GetClusterCacheMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                    handler) {
        LOG.trace("Called async getClusterCacheMetric");
        final GetClusterCacheMetricRequest interceptedRequest =
                GetClusterCacheMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetClusterCacheMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetClusterCacheMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ClusterCacheMetric/GetClusterCacheMetric");
        final java.util.function.Function<javax.ws.rs.core.Response, GetClusterCacheMetricResponse>
                transformer =
                        GetClusterCacheMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>,
                        java.util.concurrent.Future<GetClusterCacheMetricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetBackupMetricsResponse>
            getDatabaseFleetBackupMetrics(
                    GetDatabaseFleetBackupMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetBackupMetricsRequest,
                                    GetDatabaseFleetBackupMetricsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseFleetBackupMetrics");
        final GetDatabaseFleetBackupMetricsRequest interceptedRequest =
                GetDatabaseFleetBackupMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetBackupMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseFleetBackupMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetBackupMetrics/GetDatabaseFleetBackupMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetBackupMetricsResponse>
                transformer =
                        GetDatabaseFleetBackupMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseFleetBackupMetricsRequest, GetDatabaseFleetBackupMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseFleetBackupMetricsRequest,
                                GetDatabaseFleetBackupMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseFleetBackupMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseFleetBackupMetricsRequest, GetDatabaseFleetBackupMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetDataguardMetricsResponse>
            getDatabaseFleetDataguardMetrics(
                    GetDatabaseFleetDataguardMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetDataguardMetricsRequest,
                                    GetDatabaseFleetDataguardMetricsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseFleetDataguardMetrics");
        final GetDatabaseFleetDataguardMetricsRequest interceptedRequest =
                GetDatabaseFleetDataguardMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetDataguardMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseFleetDataguardMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetDataguardMetrics/GetDatabaseFleetDataguardMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetDataguardMetricsResponse>
                transformer =
                        GetDatabaseFleetDataguardMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseFleetDataguardMetricsRequest,
                        GetDatabaseFleetDataguardMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseFleetDataguardMetricsRequest,
                                GetDatabaseFleetDataguardMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseFleetDataguardMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseFleetDataguardMetricsRequest,
                    GetDatabaseFleetDataguardMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetHaOverviewMetricsResponse>
            getDatabaseFleetHaOverviewMetrics(
                    GetDatabaseFleetHaOverviewMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHaOverviewMetricsRequest,
                                    GetDatabaseFleetHaOverviewMetricsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseFleetHaOverviewMetrics");
        final GetDatabaseFleetHaOverviewMetricsRequest interceptedRequest =
                GetDatabaseFleetHaOverviewMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetHaOverviewMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseFleetHaOverviewMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetHaOverviewMetrics/GetDatabaseFleetHaOverviewMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetHaOverviewMetricsResponse>
                transformer =
                        GetDatabaseFleetHaOverviewMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseFleetHaOverviewMetricsRequest,
                        GetDatabaseFleetHaOverviewMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseFleetHaOverviewMetricsRequest,
                                GetDatabaseFleetHaOverviewMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseFleetHaOverviewMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseFleetHaOverviewMetricsRequest,
                    GetDatabaseFleetHaOverviewMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>
            getDatabaseFleetHealthMetrics(
                    GetDatabaseFleetHealthMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHealthMetricsRequest,
                                    GetDatabaseFleetHealthMetricsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseFleetHealthMetrics");
        final GetDatabaseFleetHealthMetricsRequest interceptedRequest =
                GetDatabaseFleetHealthMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetHealthMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseFleetHealthMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetHealthMetrics/GetDatabaseFleetHealthMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetHealthMetricsResponse>
                transformer =
                        GetDatabaseFleetHealthMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseFleetHealthMetricsRequest, GetDatabaseFleetHealthMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseFleetHealthMetricsRequest,
                                GetDatabaseFleetHealthMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseFleetHealthMetricsRequest, GetDatabaseFleetHealthMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseHaBackupDetailsResponse>
            getDatabaseHaBackupDetails(
                    GetDatabaseHaBackupDetailsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseHaBackupDetailsRequest,
                                    GetDatabaseHaBackupDetailsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseHaBackupDetails");
        final GetDatabaseHaBackupDetailsRequest interceptedRequest =
                GetDatabaseHaBackupDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseHaBackupDetailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseHaBackupDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseHaBackupDetails/GetDatabaseHaBackupDetails");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseHaBackupDetailsResponse>
                transformer =
                        GetDatabaseHaBackupDetailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseHaBackupDetailsRequest, GetDatabaseHaBackupDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseHaBackupDetailsRequest,
                                GetDatabaseHaBackupDetailsResponse>,
                        java.util.concurrent.Future<GetDatabaseHaBackupDetailsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseHaBackupDetailsRequest, GetDatabaseHaBackupDetailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseHomeMetricsResponse> getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                    handler) {
        LOG.trace("Called async getDatabaseHomeMetrics");
        final GetDatabaseHomeMetricsRequest interceptedRequest =
                GetDatabaseHomeMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseHomeMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDatabaseHomeMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseHomeMetrics/GetDatabaseHomeMetrics");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDatabaseHomeMetricsResponse>
                transformer =
                        GetDatabaseHomeMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseHomeMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataguardPerformanceMetricsResponse>
            getDataguardPerformanceMetrics(
                    GetDataguardPerformanceMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataguardPerformanceMetricsRequest,
                                    GetDataguardPerformanceMetricsResponse>
                            handler) {
        LOG.trace("Called async getDataguardPerformanceMetrics");
        final GetDataguardPerformanceMetricsRequest interceptedRequest =
                GetDataguardPerformanceMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataguardPerformanceMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDataguardPerformanceMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DataguardPerformanceMetrics/GetDataguardPerformanceMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDataguardPerformanceMetricsResponse>
                transformer =
                        GetDataguardPerformanceMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDataguardPerformanceMetricsRequest,
                        GetDataguardPerformanceMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataguardPerformanceMetricsRequest,
                                GetDataguardPerformanceMetricsResponse>,
                        java.util.concurrent.Future<GetDataguardPerformanceMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataguardPerformanceMetricsRequest, GetDataguardPerformanceMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>
            getDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbManagementPrivateEndpointRequest,
                                    GetDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDbManagementPrivateEndpoint");
        final GetDbManagementPrivateEndpointRequest interceptedRequest =
                GetDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/GetDbManagementPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDbManagementPrivateEndpointResponse>
                transformer =
                        GetDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDbManagementPrivateEndpointRequest,
                        GetDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbManagementPrivateEndpointRequest,
                                GetDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmResponse> getExternalAsm(
            GetExternalAsmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmRequest, GetExternalAsmResponse>
                    handler) {
        LOG.trace("Called async getExternalAsm");
        final GetExternalAsmRequest interceptedRequest =
                GetExternalAsmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsm");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalAsmResponse>
                transformer =
                        GetExternalAsmConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExternalAsmRequest, GetExternalAsmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalAsmRequest, GetExternalAsmResponse>,
                        java.util.concurrent.Future<GetExternalAsmResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalAsmRequest, GetExternalAsmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmConfigurationResponse>
            getExternalAsmConfiguration(
                    GetExternalAsmConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalAsmConfigurationRequest,
                                    GetExternalAsmConfigurationResponse>
                            handler) {
        LOG.trace("Called async getExternalAsmConfiguration");
        final GetExternalAsmConfigurationRequest interceptedRequest =
                GetExternalAsmConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsmConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/GetExternalAsmConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalAsmConfigurationResponse>
                transformer =
                        GetExternalAsmConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalAsmConfigurationRequest, GetExternalAsmConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalAsmConfigurationRequest,
                                GetExternalAsmConfigurationResponse>,
                        java.util.concurrent.Future<GetExternalAsmConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalAsmConfigurationRequest, GetExternalAsmConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalAsmInstanceResponse> getExternalAsmInstance(
            GetExternalAsmInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
                    handler) {
        LOG.trace("Called async getExternalAsmInstance");
        final GetExternalAsmInstanceRequest interceptedRequest =
                GetExternalAsmInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalAsmInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalAsmInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/GetExternalAsmInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalAsmInstanceResponse>
                transformer =
                        GetExternalAsmInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>,
                        java.util.concurrent.Future<GetExternalAsmInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalClusterResponse> getExternalCluster(
            GetExternalClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalClusterRequest, GetExternalClusterResponse>
                    handler) {
        LOG.trace("Called async getExternalCluster");
        final GetExternalClusterRequest interceptedRequest =
                GetExternalClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/GetExternalCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalClusterResponse>
                transformer =
                        GetExternalClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExternalClusterRequest, GetExternalClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalClusterRequest, GetExternalClusterResponse>,
                        java.util.concurrent.Future<GetExternalClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalClusterRequest, GetExternalClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalClusterInstanceResponse>
            getExternalClusterInstance(
                    GetExternalClusterInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalClusterInstanceRequest,
                                    GetExternalClusterInstanceResponse>
                            handler) {
        LOG.trace("Called async getExternalClusterInstance");
        final GetExternalClusterInstanceRequest interceptedRequest =
                GetExternalClusterInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalClusterInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalClusterInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/GetExternalClusterInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalClusterInstanceResponse>
                transformer =
                        GetExternalClusterInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalClusterInstanceRequest,
                                GetExternalClusterInstanceResponse>,
                        java.util.concurrent.Future<GetExternalClusterInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbHomeResponse> getExternalDbHome(
            GetExternalDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbHomeRequest, GetExternalDbHomeResponse>
                    handler) {
        LOG.trace("Called async getExternalDbHome");
        final GetExternalDbHomeRequest interceptedRequest =
                GetExternalDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbHomeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbHome",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/GetExternalDbHome");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbHomeResponse>
                transformer =
                        GetExternalDbHomeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExternalDbHomeRequest, GetExternalDbHomeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDbHomeRequest, GetExternalDbHomeResponse>,
                        java.util.concurrent.Future<GetExternalDbHomeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDbHomeRequest, GetExternalDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbNodeResponse> getExternalDbNode(
            GetExternalDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbNodeRequest, GetExternalDbNodeResponse>
                    handler) {
        LOG.trace("Called async getExternalDbNode");
        final GetExternalDbNodeRequest interceptedRequest =
                GetExternalDbNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/GetExternalDbNode");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbNodeResponse>
                transformer =
                        GetExternalDbNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExternalDbNodeRequest, GetExternalDbNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDbNodeRequest, GetExternalDbNodeResponse>,
                        java.util.concurrent.Future<GetExternalDbNodeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDbNodeRequest, GetExternalDbNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemResponse> getExternalDbSystem(
            GetExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbSystemRequest, GetExternalDbSystemResponse>
                    handler) {
        LOG.trace("Called async getExternalDbSystem");
        final GetExternalDbSystemRequest interceptedRequest =
                GetExternalDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/GetExternalDbSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalDbSystemResponse>
                transformer =
                        GetExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalDbSystemRequest, GetExternalDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDbSystemRequest, GetExternalDbSystemResponse>,
                        java.util.concurrent.Future<GetExternalDbSystemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDbSystemRequest, GetExternalDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemConnectorResponse>
            getExternalDbSystemConnector(
                    GetExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDbSystemConnectorRequest,
                                    GetExternalDbSystemConnectorResponse>
                            handler) {
        LOG.trace("Called async getExternalDbSystemConnector");
        final GetExternalDbSystemConnectorRequest interceptedRequest =
                GetExternalDbSystemConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/GetExternalDbSystemConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalDbSystemConnectorResponse>
                transformer =
                        GetExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDbSystemConnectorRequest,
                                GetExternalDbSystemConnectorResponse>,
                        java.util.concurrent.Future<GetExternalDbSystemConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalDbSystemDiscoveryResponse>
            getExternalDbSystemDiscovery(
                    GetExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalDbSystemDiscoveryRequest,
                                    GetExternalDbSystemDiscoveryResponse>
                            handler) {
        LOG.trace("Called async getExternalDbSystemDiscovery");
        final GetExternalDbSystemDiscoveryRequest interceptedRequest =
                GetExternalDbSystemDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/GetExternalDbSystemDiscovery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalDbSystemDiscoveryResponse>
                transformer =
                        GetExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalDbSystemDiscoveryRequest,
                                GetExternalDbSystemDiscoveryResponse>,
                        java.util.concurrent.Future<GetExternalDbSystemDiscoveryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataInfrastructureResponse>
            getExternalExadataInfrastructure(
                    GetExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataInfrastructureRequest,
                                    GetExternalExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async getExternalExadataInfrastructure");
        final GetExternalExadataInfrastructureRequest interceptedRequest =
                GetExternalExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataInfrastructureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/GetExternalExadataInfrastructure");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataInfrastructureResponse>
                transformer =
                        GetExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalExadataInfrastructureRequest,
                        GetExternalExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalExadataInfrastructureRequest,
                                GetExternalExadataInfrastructureResponse>,
                        java.util.concurrent.Future<GetExternalExadataInfrastructureResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalExadataInfrastructureRequest,
                    GetExternalExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageConnectorResponse>
            getExternalExadataStorageConnector(
                    GetExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageConnectorRequest,
                                    GetExternalExadataStorageConnectorResponse>
                            handler) {
        LOG.trace("Called async getExternalExadataStorageConnector");
        final GetExternalExadataStorageConnectorRequest interceptedRequest =
                GetExternalExadataStorageConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/GetExternalExadataStorageConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageConnectorResponse>
                transformer =
                        GetExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalExadataStorageConnectorRequest,
                        GetExternalExadataStorageConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalExadataStorageConnectorRequest,
                                GetExternalExadataStorageConnectorResponse>,
                        java.util.concurrent.Future<GetExternalExadataStorageConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalExadataStorageConnectorRequest,
                    GetExternalExadataStorageConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageGridResponse>
            getExternalExadataStorageGrid(
                    GetExternalExadataStorageGridRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageGridRequest,
                                    GetExternalExadataStorageGridResponse>
                            handler) {
        LOG.trace("Called async getExternalExadataStorageGrid");
        final GetExternalExadataStorageGridRequest interceptedRequest =
                GetExternalExadataStorageGridConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageGridConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageGrid",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/GetExternalExadataStorageGrid");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageGridResponse>
                transformer =
                        GetExternalExadataStorageGridConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalExadataStorageGridRequest, GetExternalExadataStorageGridResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalExadataStorageGridRequest,
                                GetExternalExadataStorageGridResponse>,
                        java.util.concurrent.Future<GetExternalExadataStorageGridResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalExadataStorageGridRequest, GetExternalExadataStorageGridResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalExadataStorageServerResponse>
            getExternalExadataStorageServer(
                    GetExternalExadataStorageServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageServerRequest,
                                    GetExternalExadataStorageServerResponse>
                            handler) {
        LOG.trace("Called async getExternalExadataStorageServer");
        final GetExternalExadataStorageServerRequest interceptedRequest =
                GetExternalExadataStorageServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalExadataStorageServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalExadataStorageServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetExternalExadataStorageServer");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalExadataStorageServerResponse>
                transformer =
                        GetExternalExadataStorageServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalExadataStorageServerRequest,
                        GetExternalExadataStorageServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalExadataStorageServerRequest,
                                GetExternalExadataStorageServerResponse>,
                        java.util.concurrent.Future<GetExternalExadataStorageServerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalExadataStorageServerRequest,
                    GetExternalExadataStorageServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalListenerResponse> getExternalListener(
            GetExternalListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalListenerRequest, GetExternalListenerResponse>
                    handler) {
        LOG.trace("Called async getExternalListener");
        final GetExternalListenerRequest interceptedRequest =
                GetExternalListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/GetExternalListener");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalListenerResponse>
                transformer =
                        GetExternalListenerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalListenerRequest, GetExternalListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalListenerRequest, GetExternalListenerResponse>,
                        java.util.concurrent.Future<GetExternalListenerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalListenerRequest, GetExternalListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalMySqlDatabaseResponse> getExternalMySqlDatabase(
            GetExternalMySqlDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalMySqlDatabaseRequest, GetExternalMySqlDatabaseResponse>
                    handler) {
        LOG.trace("Called async getExternalMySqlDatabase");
        final GetExternalMySqlDatabaseRequest interceptedRequest =
                GetExternalMySqlDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalMySqlDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalMySqlDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/GetExternalMySqlDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalMySqlDatabaseResponse>
                transformer =
                        GetExternalMySqlDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalMySqlDatabaseRequest, GetExternalMySqlDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalMySqlDatabaseRequest, GetExternalMySqlDatabaseResponse>,
                        java.util.concurrent.Future<GetExternalMySqlDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalMySqlDatabaseRequest, GetExternalMySqlDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalMySqlDatabaseConnectorResponse>
            getExternalMySqlDatabaseConnector(
                    GetExternalMySqlDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalMySqlDatabaseConnectorRequest,
                                    GetExternalMySqlDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async getExternalMySqlDatabaseConnector");
        final GetExternalMySqlDatabaseConnectorRequest interceptedRequest =
                GetExternalMySqlDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalMySqlDatabaseConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetExternalMySqlDatabaseConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/GetExternalMySqlDatabaseConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalMySqlDatabaseConnectorResponse>
                transformer =
                        GetExternalMySqlDatabaseConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalMySqlDatabaseConnectorRequest,
                        GetExternalMySqlDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalMySqlDatabaseConnectorRequest,
                                GetExternalMySqlDatabaseConnectorResponse>,
                        java.util.concurrent.Future<GetExternalMySqlDatabaseConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalMySqlDatabaseConnectorRequest,
                    GetExternalMySqlDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIormPlanResponse> getIormPlan(
            GetIormPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIormPlanRequest, GetIormPlanResponse>
                    handler) {
        LOG.trace("Called async getIormPlan");
        final GetIormPlanRequest interceptedRequest =
                GetIormPlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIormPlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetIormPlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetIormPlan");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIormPlanResponse>
                transformer =
                        GetIormPlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIormPlanRequest, GetIormPlanResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIormPlanRequest, GetIormPlanResponse>,
                        java.util.concurrent.Future<GetIormPlanResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIormPlanRequest, GetIormPlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/GetJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobResponse> transformer =
                GetJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJobExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/GetJobExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobExecutionResponse>
                transformer =
                        GetJobExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {
        LOG.trace("Called async getJobRun");
        final GetJobRunRequest interceptedRequest = GetJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetJobRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/GetJobRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobRunResponse>
                transformer =
                        GetJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>,
                        java.util.concurrent.Future<GetJobRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRunRequest, GetJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseResponse> getManagedDatabase(
            GetManagedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                    handler) {
        LOG.trace("Called async getManagedDatabase");
        final GetManagedDatabaseRequest interceptedRequest =
                GetManagedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetManagedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetManagedDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, GetManagedDatabaseResponse>
                transformer =
                        GetManagedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedDatabaseRequest, GetManagedDatabaseResponse>,
                        java.util.concurrent.Future<GetManagedDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedDatabaseRequest, GetManagedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseGroupResponse> getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                    handler) {
        LOG.trace("Called async getManagedDatabaseGroup");
        final GetManagedDatabaseGroupRequest interceptedRequest =
                GetManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/GetManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetManagedDatabaseGroupResponse>
                transformer =
                        GetManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<GetManagedDatabaseGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNamedCredentialResponse> getNamedCredential(
            GetNamedCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNamedCredentialRequest, GetNamedCredentialResponse>
                    handler) {
        LOG.trace("Called async getNamedCredential");
        final GetNamedCredentialRequest interceptedRequest =
                GetNamedCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamedCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/GetNamedCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNamedCredentialResponse>
                transformer =
                        GetNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNamedCredentialRequest, GetNamedCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNamedCredentialRequest, GetNamedCredentialResponse>,
                        java.util.concurrent.Future<GetNamedCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNamedCredentialRequest, GetNamedCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOpenAlertHistoryResponse> getOpenAlertHistory(
            GetOpenAlertHistoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>
                    handler) {
        LOG.trace("Called async getOpenAlertHistory");
        final GetOpenAlertHistoryRequest interceptedRequest =
                GetOpenAlertHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOpenAlertHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOpenAlertHistory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetOpenAlertHistory");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOpenAlertHistoryResponse>
                transformer =
                        GetOpenAlertHistoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>,
                        java.util.concurrent.Future<GetOpenAlertHistoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionResponse>
            getOptimizerStatisticsAdvisorExecution(
                    GetOptimizerStatisticsAdvisorExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionRequest,
                                    GetOptimizerStatisticsAdvisorExecutionResponse>
                            handler) {
        LOG.trace("Called async getOptimizerStatisticsAdvisorExecution");
        final GetOptimizerStatisticsAdvisorExecutionRequest interceptedRequest =
                GetOptimizerStatisticsAdvisorExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsAdvisorExecutionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOptimizerStatisticsAdvisorExecutionResponse>
                transformer =
                        GetOptimizerStatisticsAdvisorExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOptimizerStatisticsAdvisorExecutionRequest,
                        GetOptimizerStatisticsAdvisorExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOptimizerStatisticsAdvisorExecutionRequest,
                                GetOptimizerStatisticsAdvisorExecutionResponse>,
                        java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOptimizerStatisticsAdvisorExecutionRequest,
                    GetOptimizerStatisticsAdvisorExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionScriptResponse>
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                                    GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                            handler) {
        LOG.trace("Called async getOptimizerStatisticsAdvisorExecutionScript");
        final GetOptimizerStatisticsAdvisorExecutionScriptRequest interceptedRequest =
                GetOptimizerStatisticsAdvisorExecutionScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsAdvisorExecutionScriptConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsAdvisorExecutionScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsAdvisorExecutionScript");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                transformer =
                        GetOptimizerStatisticsAdvisorExecutionScriptConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                        GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                                GetOptimizerStatisticsAdvisorExecutionScriptResponse>,
                        java.util.concurrent.Future<
                                GetOptimizerStatisticsAdvisorExecutionScriptResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                    GetOptimizerStatisticsAdvisorExecutionScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOptimizerStatisticsCollectionOperationResponse>
            getOptimizerStatisticsCollectionOperation(
                    GetOptimizerStatisticsCollectionOperationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsCollectionOperationRequest,
                                    GetOptimizerStatisticsCollectionOperationResponse>
                            handler) {
        LOG.trace("Called async getOptimizerStatisticsCollectionOperation");
        final GetOptimizerStatisticsCollectionOperationRequest interceptedRequest =
                GetOptimizerStatisticsCollectionOperationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOptimizerStatisticsCollectionOperationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetOptimizerStatisticsCollectionOperation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetOptimizerStatisticsCollectionOperation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetOptimizerStatisticsCollectionOperationResponse>
                transformer =
                        GetOptimizerStatisticsCollectionOperationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOptimizerStatisticsCollectionOperationRequest,
                        GetOptimizerStatisticsCollectionOperationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOptimizerStatisticsCollectionOperationRequest,
                                GetOptimizerStatisticsCollectionOperationResponse>,
                        java.util.concurrent.Future<
                                GetOptimizerStatisticsCollectionOperationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOptimizerStatisticsCollectionOperationRequest,
                    GetOptimizerStatisticsCollectionOperationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPdbMetricsResponse> getPdbMetrics(
            GetPdbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                    handler) {
        LOG.trace("Called async getPdbMetrics");
        final GetPdbMetricsRequest interceptedRequest =
                GetPdbMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPdbMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPdbMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PdbMetrics/GetPdbMetrics");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPdbMetricsResponse>
                transformer =
                        GetPdbMetricsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPdbMetricsRequest, GetPdbMetricsResponse>,
                        java.util.concurrent.Future<GetPdbMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPdbMetricsRequest, GetPdbMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPeerDatabaseMetricsResponse> getPeerDatabaseMetrics(
            GetPeerDatabaseMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPeerDatabaseMetricsRequest, GetPeerDatabaseMetricsResponse>
                    handler) {
        LOG.trace("Called async getPeerDatabaseMetrics");
        final GetPeerDatabaseMetricsRequest interceptedRequest =
                GetPeerDatabaseMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPeerDatabaseMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPeerDatabaseMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PeerDatabaseMetrics/GetPeerDatabaseMetrics");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPeerDatabaseMetricsResponse>
                transformer =
                        GetPeerDatabaseMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPeerDatabaseMetricsRequest, GetPeerDatabaseMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPeerDatabaseMetricsRequest, GetPeerDatabaseMetricsResponse>,
                        java.util.concurrent.Future<GetPeerDatabaseMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPeerDatabaseMetricsRequest, GetPeerDatabaseMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPreferredCredentialResponse> getPreferredCredential(
            GetPreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPreferredCredentialRequest, GetPreferredCredentialResponse>
                    handler) {
        LOG.trace("Called async getPreferredCredential");
        final GetPreferredCredentialRequest interceptedRequest =
                GetPreferredCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreferredCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetPreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/GetPreferredCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPreferredCredentialResponse>
                transformer =
                        GetPreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPreferredCredentialRequest, GetPreferredCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPreferredCredentialRequest, GetPreferredCredentialResponse>,
                        java.util.concurrent.Future<GetPreferredCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPreferredCredentialRequest, GetPreferredCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSqlPlanBaselineResponse> getSqlPlanBaseline(
            GetSqlPlanBaselineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>
                    handler) {
        LOG.trace("Called async getSqlPlanBaseline");
        final GetSqlPlanBaselineRequest interceptedRequest =
                GetSqlPlanBaselineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlPlanBaselineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetSqlPlanBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaseline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSqlPlanBaselineResponse>
                transformer =
                        GetSqlPlanBaselineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>,
                        java.util.concurrent.Future<GetSqlPlanBaselineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSqlPlanBaselineConfigurationResponse>
            getSqlPlanBaselineConfiguration(
                    GetSqlPlanBaselineConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlPlanBaselineConfigurationRequest,
                                    GetSqlPlanBaselineConfigurationResponse>
                            handler) {
        LOG.trace("Called async getSqlPlanBaselineConfiguration");
        final GetSqlPlanBaselineConfigurationRequest interceptedRequest =
                GetSqlPlanBaselineConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSqlPlanBaselineConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetSqlPlanBaselineConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlPlanBaselineConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSqlPlanBaselineConfigurationResponse>
                transformer =
                        GetSqlPlanBaselineConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSqlPlanBaselineConfigurationRequest,
                        GetSqlPlanBaselineConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSqlPlanBaselineConfigurationRequest,
                                GetSqlPlanBaselineConfigurationResponse>,
                        java.util.concurrent.Future<GetSqlPlanBaselineConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSqlPlanBaselineConfigurationRequest,
                    GetSqlPlanBaselineConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTablespaceResponse> getTablespace(
            GetTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                    handler) {
        LOG.trace("Called async getTablespace");
        final GetTablespaceRequest interceptedRequest =
                GetTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTablespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/GetTablespace");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTablespaceResponse>
                transformer =
                        GetTablespaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTablespaceRequest, GetTablespaceResponse>,
                        java.util.concurrent.Future<GetTablespaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTablespaceRequest, GetTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTopSqlCpuActivityResponse> getTopSqlCpuActivity(
            GetTopSqlCpuActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>
                    handler) {
        LOG.trace("Called async getTopSqlCpuActivity");
        final GetTopSqlCpuActivityRequest interceptedRequest =
                GetTopSqlCpuActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTopSqlCpuActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetTopSqlCpuActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/GetTopSqlCpuActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTopSqlCpuActivityResponse>
                transformer =
                        GetTopSqlCpuActivityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>,
                        java.util.concurrent.Future<GetTopSqlCpuActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "GetUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetUser");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse>,
                        java.util.concurrent.Future<GetUserResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserRequest, GetUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DbManagement",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                                    ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                            handler) {
        LOG.trace("Called async implementOptimizerStatisticsAdvisorRecommendations");
        final ImplementOptimizerStatisticsAdvisorRecommendationsRequest interceptedRequest =
                ImplementOptimizerStatisticsAdvisorRecommendationsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImplementOptimizerStatisticsAdvisorRecommendationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ImplementOptimizerStatisticsAdvisorRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ImplementOptimizerStatisticsAdvisorRecommendations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                transformer =
                        ImplementOptimizerStatisticsAdvisorRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                        ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                                ImplementOptimizerStatisticsAdvisorRecommendationsResponse>,
                        java.util.concurrent.Future<
                                ImplementOptimizerStatisticsAdvisorRecommendationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getImplementOptimizerStatisticsAdvisorRecommendationsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                    ImplementOptimizerStatisticsAdvisorRecommendationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAsmPropertiesResponse> listAsmProperties(
            ListAsmPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                    handler) {
        LOG.trace("Called async listAsmProperties");
        final ListAsmPropertiesRequest interceptedRequest =
                ListAsmPropertiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAsmPropertiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAsmProperties",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAsmProperties");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAsmPropertiesResponse>
                transformer =
                        ListAsmPropertiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAsmPropertiesRequest, ListAsmPropertiesResponse>,
                        java.util.concurrent.Future<ListAsmPropertiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAsmPropertiesRequest, ListAsmPropertiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedDatabasesResponse> listAssociatedDatabases(
            ListAssociatedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                    handler) {
        LOG.trace("Called async listAssociatedDatabases");
        final ListAssociatedDatabasesRequest interceptedRequest =
                ListAssociatedDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociatedDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAssociatedDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AssociatedDatabaseSummary/ListAssociatedDatabases");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAssociatedDatabasesResponse>
                transformer =
                        ListAssociatedDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>,
                        java.util.concurrent.Future<ListAssociatedDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbSnapshotsResponse> listAwrDbSnapshots(
            ListAwrDbSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                    handler) {
        LOG.trace("Called async listAwrDbSnapshots");
        final ListAwrDbSnapshotsRequest interceptedRequest =
                ListAwrDbSnapshotsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbSnapshotsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAwrDbSnapshots",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbSnapshots");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAwrDbSnapshotsResponse>
                transformer =
                        ListAwrDbSnapshotsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>,
                        java.util.concurrent.Future<ListAwrDbSnapshotsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbsResponse> listAwrDbs(
            ListAwrDbsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse>
                    handler) {
        LOG.trace("Called async listAwrDbs");
        final ListAwrDbsRequest interceptedRequest = ListAwrDbsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListAwrDbs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAwrDbsResponse>
                transformer =
                        ListAwrDbsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAwrDbsRequest, ListAwrDbsResponse>,
                        java.util.concurrent.Future<ListAwrDbsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAwrDbsRequest, ListAwrDbsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse>
            listConsumerGroupPrivileges(
                    ListConsumerGroupPrivilegesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConsumerGroupPrivilegesRequest,
                                    ListConsumerGroupPrivilegesResponse>
                            handler) {
        LOG.trace("Called async listConsumerGroupPrivileges");
        final ListConsumerGroupPrivilegesRequest interceptedRequest =
                ListConsumerGroupPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsumerGroupPrivilegesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListConsumerGroupPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListConsumerGroupPrivileges");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListConsumerGroupPrivilegesResponse>
                transformer =
                        ListConsumerGroupPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConsumerGroupPrivilegesRequest,
                                ListConsumerGroupPrivilegesResponse>,
                        java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCursorCacheStatementsResponse> listCursorCacheStatements(
            ListCursorCacheStatementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>
                    handler) {
        LOG.trace("Called async listCursorCacheStatements");
        final ListCursorCacheStatementsRequest interceptedRequest =
                ListCursorCacheStatementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCursorCacheStatementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListCursorCacheStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListCursorCacheStatements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCursorCacheStatementsResponse>
                transformer =
                        ListCursorCacheStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCursorCacheStatementsRequest,
                                ListCursorCacheStatementsResponse>,
                        java.util.concurrent.Future<ListCursorCacheStatementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataAccessContainersResponse> listDataAccessContainers(
            ListDataAccessContainersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                    handler) {
        LOG.trace("Called async listDataAccessContainers");
        final ListDataAccessContainersRequest interceptedRequest =
                ListDataAccessContainersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAccessContainersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDataAccessContainers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDataAccessContainers");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDataAccessContainersResponse>
                transformer =
                        ListDataAccessContainersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataAccessContainersRequest, ListDataAccessContainersResponse>,
                        java.util.concurrent.Future<ListDataAccessContainersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataAccessContainersRequest, ListDataAccessContainersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseParametersResponse> listDatabaseParameters(
            ListDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async listDatabaseParameters");
        final ListDatabaseParametersRequest interceptedRequest =
                ListDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDatabaseParameters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDatabaseParametersResponse>
                transformer =
                        ListDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseParametersRequest, ListDatabaseParametersResponse>,
                        java.util.concurrent.Future<ListDatabaseParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseParametersRequest, ListDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpoints(
                    ListDbManagementPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbManagementPrivateEndpointsRequest,
                                    ListDbManagementPrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDbManagementPrivateEndpoints");
        final ListDbManagementPrivateEndpointsRequest interceptedRequest =
                ListDbManagementPrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbManagementPrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListDbManagementPrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ListDbManagementPrivateEndpoints");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDbManagementPrivateEndpointsResponse>
                transformer =
                        ListDbManagementPrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDbManagementPrivateEndpointsRequest,
                        ListDbManagementPrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbManagementPrivateEndpointsRequest,
                                ListDbManagementPrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbManagementPrivateEndpointsRequest,
                    ListDbManagementPrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmDiskGroupsResponse> listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>
                    handler) {
        LOG.trace("Called async listExternalAsmDiskGroups");
        final ListExternalAsmDiskGroupsRequest interceptedRequest =
                ListExternalAsmDiskGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmDiskGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmDiskGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmDiskGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalAsmDiskGroupsResponse>
                transformer =
                        ListExternalAsmDiskGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalAsmDiskGroupsRequest,
                                ListExternalAsmDiskGroupsResponse>,
                        java.util.concurrent.Future<ListExternalAsmDiskGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmInstancesResponse> listExternalAsmInstances(
            ListExternalAsmInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>
                    handler) {
        LOG.trace("Called async listExternalAsmInstances");
        final ListExternalAsmInstancesRequest interceptedRequest =
                ListExternalAsmInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/ListExternalAsmInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalAsmInstancesResponse>
                transformer =
                        ListExternalAsmInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>,
                        java.util.concurrent.Future<ListExternalAsmInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmUsersResponse> listExternalAsmUsers(
            ListExternalAsmUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>
                    handler) {
        LOG.trace("Called async listExternalAsmUsers");
        final ListExternalAsmUsersRequest interceptedRequest =
                ListExternalAsmUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsmUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsmUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmUsersResponse>
                transformer =
                        ListExternalAsmUsersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>,
                        java.util.concurrent.Future<ListExternalAsmUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalAsmsResponse> listExternalAsms(
            ListExternalAsmsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmsRequest, ListExternalAsmsResponse>
                    handler) {
        LOG.trace("Called async listExternalAsms");
        final ListExternalAsmsRequest interceptedRequest =
                ListExternalAsmsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalAsmsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalAsms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/ListExternalAsms");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalAsmsResponse>
                transformer =
                        ListExternalAsmsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListExternalAsmsRequest, ListExternalAsmsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalAsmsRequest, ListExternalAsmsResponse>,
                        java.util.concurrent.Future<ListExternalAsmsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalAsmsRequest, ListExternalAsmsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalClusterInstancesResponse>
            listExternalClusterInstances(
                    ListExternalClusterInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalClusterInstancesRequest,
                                    ListExternalClusterInstancesResponse>
                            handler) {
        LOG.trace("Called async listExternalClusterInstances");
        final ListExternalClusterInstancesRequest interceptedRequest =
                ListExternalClusterInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalClusterInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalClusterInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/ListExternalClusterInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalClusterInstancesResponse>
                transformer =
                        ListExternalClusterInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalClusterInstancesRequest, ListExternalClusterInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalClusterInstancesRequest,
                                ListExternalClusterInstancesResponse>,
                        java.util.concurrent.Future<ListExternalClusterInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalClusterInstancesRequest, ListExternalClusterInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalClustersResponse> listExternalClusters(
            ListExternalClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalClustersRequest, ListExternalClustersResponse>
                    handler) {
        LOG.trace("Called async listExternalClusters");
        final ListExternalClustersRequest interceptedRequest =
                ListExternalClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalClustersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalClusters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/ListExternalClusters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalClustersResponse>
                transformer =
                        ListExternalClustersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalClustersRequest, ListExternalClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalClustersRequest, ListExternalClustersResponse>,
                        java.util.concurrent.Future<ListExternalClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalClustersRequest, ListExternalClustersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDatabasesResponse> listExternalDatabases(
            ListExternalDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDatabasesRequest, ListExternalDatabasesResponse>
                    handler) {
        LOG.trace("Called async listExternalDatabases");
        final ListExternalDatabasesRequest interceptedRequest =
                ListExternalDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDatabaseCollection/ListExternalDatabases");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalDatabasesResponse>
                transformer =
                        ListExternalDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDatabasesRequest, ListExternalDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDatabasesRequest, ListExternalDatabasesResponse>,
                        java.util.concurrent.Future<ListExternalDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDatabasesRequest, ListExternalDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbHomesResponse> listExternalDbHomes(
            ListExternalDbHomesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbHomesRequest, ListExternalDbHomesResponse>
                    handler) {
        LOG.trace("Called async listExternalDbHomes");
        final ListExternalDbHomesRequest interceptedRequest =
                ListExternalDbHomesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbHomesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbHomes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/ListExternalDbHomes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbHomesResponse>
                transformer =
                        ListExternalDbHomesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDbHomesRequest, ListExternalDbHomesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDbHomesRequest, ListExternalDbHomesResponse>,
                        java.util.concurrent.Future<ListExternalDbHomesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDbHomesRequest, ListExternalDbHomesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbNodesResponse> listExternalDbNodes(
            ListExternalDbNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbNodesRequest, ListExternalDbNodesResponse>
                    handler) {
        LOG.trace("Called async listExternalDbNodes");
        final ListExternalDbNodesRequest interceptedRequest =
                ListExternalDbNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbNodesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbNodes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/ListExternalDbNodes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbNodesResponse>
                transformer =
                        ListExternalDbNodesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDbNodesRequest, ListExternalDbNodesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDbNodesRequest, ListExternalDbNodesResponse>,
                        java.util.concurrent.Future<ListExternalDbNodesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDbNodesRequest, ListExternalDbNodesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemConnectorsResponse>
            listExternalDbSystemConnectors(
                    ListExternalDbSystemConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemConnectorsRequest,
                                    ListExternalDbSystemConnectorsResponse>
                            handler) {
        LOG.trace("Called async listExternalDbSystemConnectors");
        final ListExternalDbSystemConnectorsRequest interceptedRequest =
                ListExternalDbSystemConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemConnectorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystemConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/ListExternalDbSystemConnectors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalDbSystemConnectorsResponse>
                transformer =
                        ListExternalDbSystemConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDbSystemConnectorsRequest,
                        ListExternalDbSystemConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDbSystemConnectorsRequest,
                                ListExternalDbSystemConnectorsResponse>,
                        java.util.concurrent.Future<ListExternalDbSystemConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDbSystemConnectorsRequest, ListExternalDbSystemConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemDiscoveriesResponse>
            listExternalDbSystemDiscoveries(
                    ListExternalDbSystemDiscoveriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemDiscoveriesRequest,
                                    ListExternalDbSystemDiscoveriesResponse>
                            handler) {
        LOG.trace("Called async listExternalDbSystemDiscoveries");
        final ListExternalDbSystemDiscoveriesRequest interceptedRequest =
                ListExternalDbSystemDiscoveriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemDiscoveriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystemDiscoveries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/ListExternalDbSystemDiscoveries");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalDbSystemDiscoveriesResponse>
                transformer =
                        ListExternalDbSystemDiscoveriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDbSystemDiscoveriesRequest,
                        ListExternalDbSystemDiscoveriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDbSystemDiscoveriesRequest,
                                ListExternalDbSystemDiscoveriesResponse>,
                        java.util.concurrent.Future<ListExternalDbSystemDiscoveriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDbSystemDiscoveriesRequest,
                    ListExternalDbSystemDiscoveriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalDbSystemsResponse> listExternalDbSystems(
            ListExternalDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>
                    handler) {
        LOG.trace("Called async listExternalDbSystems");
        final ListExternalDbSystemsRequest interceptedRequest =
                ListExternalDbSystemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalDbSystemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalDbSystems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/ListExternalDbSystems");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalDbSystemsResponse>
                transformer =
                        ListExternalDbSystemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>,
                        java.util.concurrent.Future<ListExternalDbSystemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataInfrastructuresResponse>
            listExternalExadataInfrastructures(
                    ListExternalExadataInfrastructuresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataInfrastructuresRequest,
                                    ListExternalExadataInfrastructuresResponse>
                            handler) {
        LOG.trace("Called async listExternalExadataInfrastructures");
        final ListExternalExadataInfrastructuresRequest interceptedRequest =
                ListExternalExadataInfrastructuresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataInfrastructuresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataInfrastructures",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/ListExternalExadataInfrastructures");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataInfrastructuresResponse>
                transformer =
                        ListExternalExadataInfrastructuresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalExadataInfrastructuresRequest,
                        ListExternalExadataInfrastructuresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalExadataInfrastructuresRequest,
                                ListExternalExadataInfrastructuresResponse>,
                        java.util.concurrent.Future<ListExternalExadataInfrastructuresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalExadataInfrastructuresRequest,
                    ListExternalExadataInfrastructuresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataStorageConnectorsResponse>
            listExternalExadataStorageConnectors(
                    ListExternalExadataStorageConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageConnectorsRequest,
                                    ListExternalExadataStorageConnectorsResponse>
                            handler) {
        LOG.trace("Called async listExternalExadataStorageConnectors");
        final ListExternalExadataStorageConnectorsRequest interceptedRequest =
                ListExternalExadataStorageConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataStorageConnectorsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/ListExternalExadataStorageConnectors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataStorageConnectorsResponse>
                transformer =
                        ListExternalExadataStorageConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalExadataStorageConnectorsRequest,
                        ListExternalExadataStorageConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalExadataStorageConnectorsRequest,
                                ListExternalExadataStorageConnectorsResponse>,
                        java.util.concurrent.Future<ListExternalExadataStorageConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalExadataStorageConnectorsRequest,
                    ListExternalExadataStorageConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalExadataStorageServersResponse>
            listExternalExadataStorageServers(
                    ListExternalExadataStorageServersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageServersRequest,
                                    ListExternalExadataStorageServersResponse>
                            handler) {
        LOG.trace("Called async listExternalExadataStorageServers");
        final ListExternalExadataStorageServersRequest interceptedRequest =
                ListExternalExadataStorageServersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalExadataStorageServersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalExadataStorageServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/ListExternalExadataStorageServers");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalExadataStorageServersResponse>
                transformer =
                        ListExternalExadataStorageServersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalExadataStorageServersRequest,
                        ListExternalExadataStorageServersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalExadataStorageServersRequest,
                                ListExternalExadataStorageServersResponse>,
                        java.util.concurrent.Future<ListExternalExadataStorageServersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalExadataStorageServersRequest,
                    ListExternalExadataStorageServersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalListenerServicesResponse>
            listExternalListenerServices(
                    ListExternalListenerServicesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalListenerServicesRequest,
                                    ListExternalListenerServicesResponse>
                            handler) {
        LOG.trace("Called async listExternalListenerServices");
        final ListExternalListenerServicesRequest interceptedRequest =
                ListExternalListenerServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalListenerServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalListenerServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListenerServices");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalListenerServicesResponse>
                transformer =
                        ListExternalListenerServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalListenerServicesRequest, ListExternalListenerServicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalListenerServicesRequest,
                                ListExternalListenerServicesResponse>,
                        java.util.concurrent.Future<ListExternalListenerServicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalListenerServicesRequest, ListExternalListenerServicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalListenersResponse> listExternalListeners(
            ListExternalListenersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalListenersRequest, ListExternalListenersResponse>
                    handler) {
        LOG.trace("Called async listExternalListeners");
        final ListExternalListenersRequest interceptedRequest =
                ListExternalListenersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalListenersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalListeners",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/ListExternalListeners");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExternalListenersResponse>
                transformer =
                        ListExternalListenersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalListenersRequest, ListExternalListenersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalListenersRequest, ListExternalListenersResponse>,
                        java.util.concurrent.Future<ListExternalListenersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalListenersRequest, ListExternalListenersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalMySqlDatabasesResponse>
            listExternalMySqlDatabases(
                    ListExternalMySqlDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalMySqlDatabasesRequest,
                                    ListExternalMySqlDatabasesResponse>
                            handler) {
        LOG.trace("Called async listExternalMySqlDatabases");
        final ListExternalMySqlDatabasesRequest interceptedRequest =
                ListExternalMySqlDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalMySqlDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListExternalMySqlDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabaseCollection/ListExternalMySqlDatabases");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalMySqlDatabasesResponse>
                transformer =
                        ListExternalMySqlDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalMySqlDatabasesRequest, ListExternalMySqlDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalMySqlDatabasesRequest,
                                ListExternalMySqlDatabasesResponse>,
                        java.util.concurrent.Future<ListExternalMySqlDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalMySqlDatabasesRequest, ListExternalMySqlDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/ListJobExecutions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobExecutionsResponse>
                transformer =
                        ListJobExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
        LOG.trace("Called async listJobRuns");
        final ListJobRunsRequest interceptedRequest =
                ListJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/ListJobRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobRunsResponse>
                transformer =
                        ListJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobRunsRequest, ListJobRunsResponse>,
                        java.util.concurrent.Future<ListJobRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobRunsRequest, ListJobRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ListJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJobsResponse> transformer =
                ListJobsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                    handler) {
        LOG.trace("Called async listManagedDatabaseGroups");
        final ListManagedDatabaseGroupsRequest interceptedRequest =
                ListManagedDatabaseGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabaseGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListManagedDatabaseGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ListManagedDatabaseGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListManagedDatabaseGroupsResponse>
                transformer =
                        ListManagedDatabaseGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedDatabaseGroupsRequest,
                                ListManagedDatabaseGroupsResponse>,
                        java.util.concurrent.Future<ListManagedDatabaseGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedDatabasesResponse> listManagedDatabases(
            ListManagedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                    handler) {
        LOG.trace("Called async listManagedDatabases");
        final ListManagedDatabasesRequest interceptedRequest =
                ListManagedDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListManagedDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListManagedDatabases");
        final java.util.function.Function<javax.ws.rs.core.Response, ListManagedDatabasesResponse>
                transformer =
                        ListManagedDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedDatabasesRequest, ListManagedDatabasesResponse>,
                        java.util.concurrent.Future<ListManagedDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedDatabasesRequest, ListManagedDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMySqlDatabaseConnectorsResponse>
            listMySqlDatabaseConnectors(
                    ListMySqlDatabaseConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMySqlDatabaseConnectorsRequest,
                                    ListMySqlDatabaseConnectorsResponse>
                            handler) {
        LOG.trace("Called async listMySqlDatabaseConnectors");
        final ListMySqlDatabaseConnectorsRequest interceptedRequest =
                ListMySqlDatabaseConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMySqlDatabaseConnectorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListMySqlDatabaseConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/MySqlConnectorCollection/ListMySqlDatabaseConnectors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMySqlDatabaseConnectorsResponse>
                transformer =
                        ListMySqlDatabaseConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMySqlDatabaseConnectorsRequest, ListMySqlDatabaseConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMySqlDatabaseConnectorsRequest,
                                ListMySqlDatabaseConnectorsResponse>,
                        java.util.concurrent.Future<ListMySqlDatabaseConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMySqlDatabaseConnectorsRequest, ListMySqlDatabaseConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNamedCredentialsResponse> listNamedCredentials(
            ListNamedCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNamedCredentialsRequest, ListNamedCredentialsResponse>
                    handler) {
        LOG.trace("Called async listNamedCredentials");
        final ListNamedCredentialsRequest interceptedRequest =
                ListNamedCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNamedCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListNamedCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/ListNamedCredentials");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNamedCredentialsResponse>
                transformer =
                        ListNamedCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNamedCredentialsRequest, ListNamedCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNamedCredentialsRequest, ListNamedCredentialsResponse>,
                        java.util.concurrent.Future<ListNamedCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNamedCredentialsRequest, ListNamedCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListObjectPrivilegesResponse> listObjectPrivileges(
            ListObjectPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                    handler) {
        LOG.trace("Called async listObjectPrivileges");
        final ListObjectPrivilegesRequest interceptedRequest =
                ListObjectPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectPrivilegesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListObjectPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListObjectPrivileges");
        final java.util.function.Function<javax.ws.rs.core.Response, ListObjectPrivilegesResponse>
                transformer =
                        ListObjectPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>,
                        java.util.concurrent.Future<ListObjectPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsAdvisorExecutionsResponse>
            listOptimizerStatisticsAdvisorExecutions(
                    ListOptimizerStatisticsAdvisorExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsAdvisorExecutionsRequest,
                                    ListOptimizerStatisticsAdvisorExecutionsResponse>
                            handler) {
        LOG.trace("Called async listOptimizerStatisticsAdvisorExecutions");
        final ListOptimizerStatisticsAdvisorExecutionsRequest interceptedRequest =
                ListOptimizerStatisticsAdvisorExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsAdvisorExecutionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsAdvisorExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsAdvisorExecutions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOptimizerStatisticsAdvisorExecutionsResponse>
                transformer =
                        ListOptimizerStatisticsAdvisorExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOptimizerStatisticsAdvisorExecutionsRequest,
                        ListOptimizerStatisticsAdvisorExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOptimizerStatisticsAdvisorExecutionsRequest,
                                ListOptimizerStatisticsAdvisorExecutionsResponse>,
                        java.util.concurrent.Future<
                                ListOptimizerStatisticsAdvisorExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOptimizerStatisticsAdvisorExecutionsRequest,
                    ListOptimizerStatisticsAdvisorExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsCollectionAggregationsResponse>
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionAggregationsRequest,
                                    ListOptimizerStatisticsCollectionAggregationsResponse>
                            handler) {
        LOG.trace("Called async listOptimizerStatisticsCollectionAggregations");
        final ListOptimizerStatisticsCollectionAggregationsRequest interceptedRequest =
                ListOptimizerStatisticsCollectionAggregationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsCollectionAggregationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionAggregations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionAggregations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListOptimizerStatisticsCollectionAggregationsResponse>
                transformer =
                        ListOptimizerStatisticsCollectionAggregationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOptimizerStatisticsCollectionAggregationsRequest,
                        ListOptimizerStatisticsCollectionAggregationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOptimizerStatisticsCollectionAggregationsRequest,
                                ListOptimizerStatisticsCollectionAggregationsResponse>,
                        java.util.concurrent.Future<
                                ListOptimizerStatisticsCollectionAggregationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOptimizerStatisticsCollectionAggregationsRequest,
                    ListOptimizerStatisticsCollectionAggregationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOptimizerStatisticsCollectionOperationsResponse>
            listOptimizerStatisticsCollectionOperations(
                    ListOptimizerStatisticsCollectionOperationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionOperationsRequest,
                                    ListOptimizerStatisticsCollectionOperationsResponse>
                            handler) {
        LOG.trace("Called async listOptimizerStatisticsCollectionOperations");
        final ListOptimizerStatisticsCollectionOperationsRequest interceptedRequest =
                ListOptimizerStatisticsCollectionOperationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOptimizerStatisticsCollectionOperationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListOptimizerStatisticsCollectionOperations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListOptimizerStatisticsCollectionOperations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListOptimizerStatisticsCollectionOperationsResponse>
                transformer =
                        ListOptimizerStatisticsCollectionOperationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOptimizerStatisticsCollectionOperationsRequest,
                        ListOptimizerStatisticsCollectionOperationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOptimizerStatisticsCollectionOperationsRequest,
                                ListOptimizerStatisticsCollectionOperationsResponse>,
                        java.util.concurrent.Future<
                                ListOptimizerStatisticsCollectionOperationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOptimizerStatisticsCollectionOperationsRequest,
                    ListOptimizerStatisticsCollectionOperationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPreferredCredentialsResponse> listPreferredCredentials(
            ListPreferredCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>
                    handler) {
        LOG.trace("Called async listPreferredCredentials");
        final ListPreferredCredentialsRequest interceptedRequest =
                ListPreferredCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPreferredCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListPreferredCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/ListPreferredCredentials");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListPreferredCredentialsResponse>
                transformer =
                        ListPreferredCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>,
                        java.util.concurrent.Future<ListPreferredCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProxiedForUsersResponse> listProxiedForUsers(
            ListProxiedForUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                    handler) {
        LOG.trace("Called async listProxiedForUsers");
        final ListProxiedForUsersRequest interceptedRequest =
                ListProxiedForUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxiedForUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListProxiedForUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxiedForUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProxiedForUsersResponse>
                transformer =
                        ListProxiedForUsersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProxiedForUsersRequest, ListProxiedForUsersResponse>,
                        java.util.concurrent.Future<ListProxiedForUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProxiedForUsersRequest, ListProxiedForUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProxyUsersResponse> listProxyUsers(
            ListProxyUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxyUsersRequest, ListProxyUsersResponse>
                    handler) {
        LOG.trace("Called async listProxyUsers");
        final ListProxyUsersRequest interceptedRequest =
                ListProxyUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxyUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListProxyUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxyUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProxyUsersResponse>
                transformer =
                        ListProxyUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProxyUsersRequest, ListProxyUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProxyUsersRequest, ListProxyUsersResponse>,
                        java.util.concurrent.Future<ListProxyUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProxyUsersRequest, ListProxyUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListRoles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRolesResponse>
                transformer =
                        ListRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListSqlPlanBaselineJobsResponse> listSqlPlanBaselineJobs(
            ListSqlPlanBaselineJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>
                    handler) {
        LOG.trace("Called async listSqlPlanBaselineJobs");
        final ListSqlPlanBaselineJobsRequest interceptedRequest =
                ListSqlPlanBaselineJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlanBaselineJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselineJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselineJobs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSqlPlanBaselineJobsResponse>
                transformer =
                        ListSqlPlanBaselineJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>,
                        java.util.concurrent.Future<ListSqlPlanBaselineJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSqlPlanBaselinesResponse> listSqlPlanBaselines(
            ListSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>
                    handler) {
        LOG.trace("Called async listSqlPlanBaselines");
        final ListSqlPlanBaselinesRequest interceptedRequest =
                ListSqlPlanBaselinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlPlanBaselines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSqlPlanBaselinesResponse>
                transformer =
                        ListSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>,
                        java.util.concurrent.Future<ListSqlPlanBaselinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSystemPrivilegesResponse> listSystemPrivileges(
            ListSystemPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                    handler) {
        LOG.trace("Called async listSystemPrivileges");
        final ListSystemPrivilegesRequest interceptedRequest =
                ListSystemPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSystemPrivilegesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListSystemPrivileges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSystemPrivileges");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSystemPrivilegesResponse>
                transformer =
                        ListSystemPrivilegesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>,
                        java.util.concurrent.Future<ListSystemPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTableStatisticsResponse> listTableStatistics(
            ListTableStatisticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTableStatisticsRequest, ListTableStatisticsResponse>
                    handler) {
        LOG.trace("Called async listTableStatistics");
        final ListTableStatisticsRequest interceptedRequest =
                ListTableStatisticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTableStatisticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListTableStatistics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListTableStatistics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTableStatisticsResponse>
                transformer =
                        ListTableStatisticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTableStatisticsRequest, ListTableStatisticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTableStatisticsRequest, ListTableStatisticsResponse>,
                        java.util.concurrent.Future<ListTableStatisticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTableStatisticsRequest, ListTableStatisticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTablespacesResponse> listTablespaces(
            ListTablespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTablespacesRequest, ListTablespacesResponse>
                    handler) {
        LOG.trace("Called async listTablespaces");
        final ListTablespacesRequest interceptedRequest =
                ListTablespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablespacesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListTablespaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ListTablespaces");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTablespacesResponse>
                transformer =
                        ListTablespacesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTablespacesRequest, ListTablespacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTablespacesRequest, ListTablespacesResponse>,
                        java.util.concurrent.Future<ListTablespacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTablespacesRequest, ListTablespacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListUsers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer =
                        ListUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestError/ListWorkRequestErrors");
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
                        "DbManagement",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "DbManagement",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<LoadSqlPlanBaselinesFromAwrResponse>
            loadSqlPlanBaselinesFromAwr(
                    LoadSqlPlanBaselinesFromAwrRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LoadSqlPlanBaselinesFromAwrRequest,
                                    LoadSqlPlanBaselinesFromAwrResponse>
                            handler) {
        LOG.trace("Called async loadSqlPlanBaselinesFromAwr");
        final LoadSqlPlanBaselinesFromAwrRequest interceptedRequest =
                LoadSqlPlanBaselinesFromAwrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LoadSqlPlanBaselinesFromAwrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromAwr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromAwr");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, LoadSqlPlanBaselinesFromAwrResponse>
                transformer =
                        LoadSqlPlanBaselinesFromAwrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        LoadSqlPlanBaselinesFromAwrRequest, LoadSqlPlanBaselinesFromAwrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LoadSqlPlanBaselinesFromAwrRequest,
                                LoadSqlPlanBaselinesFromAwrResponse>,
                        java.util.concurrent.Future<LoadSqlPlanBaselinesFromAwrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLoadSqlPlanBaselinesFromAwrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LoadSqlPlanBaselinesFromAwrRequest, LoadSqlPlanBaselinesFromAwrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LoadSqlPlanBaselinesFromCursorCacheResponse>
            loadSqlPlanBaselinesFromCursorCache(
                    LoadSqlPlanBaselinesFromCursorCacheRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LoadSqlPlanBaselinesFromCursorCacheRequest,
                                    LoadSqlPlanBaselinesFromCursorCacheResponse>
                            handler) {
        LOG.trace("Called async loadSqlPlanBaselinesFromCursorCache");
        final LoadSqlPlanBaselinesFromCursorCacheRequest interceptedRequest =
                LoadSqlPlanBaselinesFromCursorCacheConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LoadSqlPlanBaselinesFromCursorCacheConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "LoadSqlPlanBaselinesFromCursorCache",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/LoadSqlPlanBaselinesFromCursorCache");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, LoadSqlPlanBaselinesFromCursorCacheResponse>
                transformer =
                        LoadSqlPlanBaselinesFromCursorCacheConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        LoadSqlPlanBaselinesFromCursorCacheRequest,
                        LoadSqlPlanBaselinesFromCursorCacheResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LoadSqlPlanBaselinesFromCursorCacheRequest,
                                LoadSqlPlanBaselinesFromCursorCacheResponse>,
                        java.util.concurrent.Future<LoadSqlPlanBaselinesFromCursorCacheResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getLoadSqlPlanBaselinesFromCursorCacheDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LoadSqlPlanBaselinesFromCursorCacheRequest,
                    LoadSqlPlanBaselinesFromCursorCacheResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyAutonomousDatabaseManagementFeatureResponse>
            modifyAutonomousDatabaseManagementFeature(
                    ModifyAutonomousDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ModifyAutonomousDatabaseManagementFeatureRequest,
                                    ModifyAutonomousDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async modifyAutonomousDatabaseManagementFeature");
        final ModifyAutonomousDatabaseManagementFeatureRequest interceptedRequest =
                ModifyAutonomousDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyAutonomousDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyAutonomousDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyAutonomousDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ModifyAutonomousDatabaseManagementFeatureResponse>
                transformer =
                        ModifyAutonomousDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ModifyAutonomousDatabaseManagementFeatureRequest,
                        ModifyAutonomousDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyAutonomousDatabaseManagementFeatureRequest,
                                ModifyAutonomousDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                ModifyAutonomousDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getModifyAutonomousDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyAutonomousDatabaseManagementFeatureRequest,
                    ModifyAutonomousDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyDatabaseManagementFeatureResponse>
            modifyDatabaseManagementFeature(
                    ModifyDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ModifyDatabaseManagementFeatureRequest,
                                    ModifyDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async modifyDatabaseManagementFeature");
        final ModifyDatabaseManagementFeatureRequest interceptedRequest =
                ModifyDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyDatabaseManagementFeatureConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ModifyDatabaseManagementFeatureResponse>
                transformer =
                        ModifyDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ModifyDatabaseManagementFeatureRequest,
                        ModifyDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyDatabaseManagementFeatureRequest,
                                ModifyDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<ModifyDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModifyDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyDatabaseManagementFeatureRequest,
                    ModifyDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyPluggableDatabaseManagementFeatureResponse>
            modifyPluggableDatabaseManagementFeature(
                    ModifyPluggableDatabaseManagementFeatureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ModifyPluggableDatabaseManagementFeatureRequest,
                                    ModifyPluggableDatabaseManagementFeatureResponse>
                            handler) {
        LOG.trace("Called async modifyPluggableDatabaseManagementFeature");
        final ModifyPluggableDatabaseManagementFeatureRequest interceptedRequest =
                ModifyPluggableDatabaseManagementFeatureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyPluggableDatabaseManagementFeatureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ModifyPluggableDatabaseManagementFeature",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ModifyPluggableDatabaseManagementFeature");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ModifyPluggableDatabaseManagementFeatureResponse>
                transformer =
                        ModifyPluggableDatabaseManagementFeatureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ModifyPluggableDatabaseManagementFeatureRequest,
                        ModifyPluggableDatabaseManagementFeatureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyPluggableDatabaseManagementFeatureRequest,
                                ModifyPluggableDatabaseManagementFeatureResponse>,
                        java.util.concurrent.Future<
                                ModifyPluggableDatabaseManagementFeatureResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getModifyPluggableDatabaseManagementFeatureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyPluggableDatabaseManagementFeatureRequest,
                    ModifyPluggableDatabaseManagementFeatureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchExternalDbSystemDiscoveryResponse>
            patchExternalDbSystemDiscovery(
                    PatchExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchExternalDbSystemDiscoveryRequest,
                                    PatchExternalDbSystemDiscoveryResponse>
                            handler) {
        LOG.trace("Called async patchExternalDbSystemDiscovery");
        final PatchExternalDbSystemDiscoveryRequest interceptedRequest =
                PatchExternalDbSystemDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "PatchExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/PatchExternalDbSystemDiscovery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchExternalDbSystemDiscoveryResponse>
                transformer =
                        PatchExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchExternalDbSystemDiscoveryRequest,
                        PatchExternalDbSystemDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchExternalDbSystemDiscoveryRequest,
                                PatchExternalDbSystemDiscoveryResponse>,
                        java.util.concurrent.Future<PatchExternalDbSystemDiscoveryResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchExternalDbSystemDiscoveryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchExternalDbSystemDiscoveryRequest, PatchExternalDbSystemDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDataFileResponse> removeDataFile(
            RemoveDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDataFileRequest, RemoveDataFileResponse>
                    handler) {
        LOG.trace("Called async removeDataFile");
        final RemoveDataFileRequest interceptedRequest =
                RemoveDataFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDataFileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RemoveDataFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/RemoveDataFile");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveDataFileResponse>
                transformer =
                        RemoveDataFileConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveDataFileRequest, RemoveDataFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDataFileRequest, RemoveDataFileResponse>,
                        java.util.concurrent.Future<RemoveDataFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveDataFileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDataFileRequest, RemoveDataFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async removeManagedDatabaseFromManagedDatabaseGroup");
        final RemoveManagedDatabaseFromManagedDatabaseGroupRequest interceptedRequest =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RemoveManagedDatabaseFromManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/RemoveManagedDatabaseFromManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                transformer =
                        RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                RemoveManagedDatabaseFromManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<
                                RemoveManagedDatabaseFromManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRemoveManagedDatabaseFromManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResetDatabaseParametersResponse> resetDatabaseParameters(
            ResetDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async resetDatabaseParameters");
        final ResetDatabaseParametersRequest interceptedRequest =
                ResetDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ResetDatabaseParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ResetDatabaseParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ResetDatabaseParametersResponse>
                transformer =
                        ResetDatabaseParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>,
                        java.util.concurrent.Future<ResetDatabaseParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResetDatabaseParametersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResizeDataFileResponse> resizeDataFile(
            ResizeDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResizeDataFileRequest, ResizeDataFileResponse>
                    handler) {
        LOG.trace("Called async resizeDataFile");
        final ResizeDataFileRequest interceptedRequest =
                ResizeDataFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResizeDataFileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "ResizeDataFile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ResizeDataFile");
        final java.util.function.Function<javax.ws.rs.core.Response, ResizeDataFileResponse>
                transformer =
                        ResizeDataFileConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResizeDataFileRequest, ResizeDataFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResizeDataFileRequest, ResizeDataFileResponse>,
                        java.util.concurrent.Future<ResizeDataFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResizeDataFileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResizeDataFileRequest, ResizeDataFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RunHistoricAddmResponse> runHistoricAddm(
            RunHistoricAddmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunHistoricAddmRequest, RunHistoricAddmResponse>
                    handler) {
        LOG.trace("Called async runHistoricAddm");
        final RunHistoricAddmRequest interceptedRequest =
                RunHistoricAddmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunHistoricAddmConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "RunHistoricAddm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/HistoricAddmResult/RunHistoricAddm");
        final java.util.function.Function<javax.ws.rs.core.Response, RunHistoricAddmResponse>
                transformer =
                        RunHistoricAddmConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RunHistoricAddmRequest, RunHistoricAddmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RunHistoricAddmRequest, RunHistoricAddmResponse>,
                        java.util.concurrent.Future<RunHistoricAddmResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunHistoricAddmDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RunHistoricAddmRequest, RunHistoricAddmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse> summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbCpuUsages");
        final SummarizeAwrDbCpuUsagesRequest interceptedRequest =
                SummarizeAwrDbCpuUsagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbCpuUsagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbCpuUsages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbCpuUsages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbCpuUsagesResponse>
                transformer =
                        SummarizeAwrDbCpuUsagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbMetricsResponse> summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbMetrics");
        final SummarizeAwrDbMetricsRequest interceptedRequest =
                SummarizeAwrDbMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbMetrics");
        final java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbMetricsResponse>
                transformer =
                        SummarizeAwrDbMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>
            summarizeAwrDbParameterChanges(
                    SummarizeAwrDbParameterChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbParameterChangesRequest,
                                    SummarizeAwrDbParameterChangesResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbParameterChanges");
        final SummarizeAwrDbParameterChangesRequest interceptedRequest =
                SummarizeAwrDbParameterChangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParameterChangesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameterChanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameterChanges");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbParameterChangesResponse>
                transformer =
                        SummarizeAwrDbParameterChangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbParameterChangesRequest,
                        SummarizeAwrDbParameterChangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbParameterChangesRequest,
                                SummarizeAwrDbParameterChangesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbParameterChangesRequest, SummarizeAwrDbParameterChangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParametersResponse> summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbParameters");
        final SummarizeAwrDbParametersRequest interceptedRequest =
                SummarizeAwrDbParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbParametersResponse>
                transformer =
                        SummarizeAwrDbParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse>
            summarizeAwrDbSnapshotRanges(
                    SummarizeAwrDbSnapshotRangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbSnapshotRangesRequest,
                                    SummarizeAwrDbSnapshotRangesResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbSnapshotRanges");
        final SummarizeAwrDbSnapshotRangesRequest interceptedRequest =
                SummarizeAwrDbSnapshotRangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSnapshotRangesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSnapshotRanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSnapshotRanges");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbSnapshotRangesResponse>
                transformer =
                        SummarizeAwrDbSnapshotRangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbSnapshotRangesRequest, SummarizeAwrDbSnapshotRangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbSnapshotRangesRequest,
                                SummarizeAwrDbSnapshotRangesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbSnapshotRangesRequest, SummarizeAwrDbSnapshotRangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse> summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbSysstats");
        final SummarizeAwrDbSysstatsRequest interceptedRequest =
                SummarizeAwrDbSysstatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSysstatsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbSysstats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSysstats");
        final java.util.function.Function<javax.ws.rs.core.Response, SummarizeAwrDbSysstatsResponse>
                transformer =
                        SummarizeAwrDbSysstatsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse>
            summarizeAwrDbTopWaitEvents(
                    SummarizeAwrDbTopWaitEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbTopWaitEventsRequest,
                                    SummarizeAwrDbTopWaitEventsResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbTopWaitEvents");
        final SummarizeAwrDbTopWaitEventsRequest interceptedRequest =
                SummarizeAwrDbTopWaitEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbTopWaitEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbTopWaitEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbTopWaitEvents");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbTopWaitEventsResponse>
                transformer =
                        SummarizeAwrDbTopWaitEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbTopWaitEventsRequest, SummarizeAwrDbTopWaitEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbTopWaitEventsRequest,
                                SummarizeAwrDbTopWaitEventsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbTopWaitEventsRequest, SummarizeAwrDbTopWaitEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>
            summarizeAwrDbWaitEventBuckets(
                    SummarizeAwrDbWaitEventBucketsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbWaitEventBucketsRequest,
                                    SummarizeAwrDbWaitEventBucketsResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbWaitEventBuckets");
        final SummarizeAwrDbWaitEventBucketsRequest interceptedRequest =
                SummarizeAwrDbWaitEventBucketsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventBucketsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEventBuckets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEventBuckets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbWaitEventBucketsResponse>
                transformer =
                        SummarizeAwrDbWaitEventBucketsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbWaitEventBucketsRequest,
                        SummarizeAwrDbWaitEventBucketsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbWaitEventBucketsRequest,
                                SummarizeAwrDbWaitEventBucketsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbWaitEventBucketsRequest, SummarizeAwrDbWaitEventBucketsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse> summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbWaitEvents");
        final SummarizeAwrDbWaitEventsRequest interceptedRequest =
                SummarizeAwrDbWaitEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeAwrDbWaitEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEvents");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbWaitEventsResponse>
                transformer =
                        SummarizeAwrDbWaitEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalAsmMetricsResponse>
            summarizeExternalAsmMetrics(
                    SummarizeExternalAsmMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalAsmMetricsRequest,
                                    SummarizeExternalAsmMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeExternalAsmMetrics");
        final SummarizeExternalAsmMetricsRequest interceptedRequest =
                SummarizeExternalAsmMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalAsmMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalAsmMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/SummarizeExternalAsmMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalAsmMetricsResponse>
                transformer =
                        SummarizeExternalAsmMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeExternalAsmMetricsRequest, SummarizeExternalAsmMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeExternalAsmMetricsRequest,
                                SummarizeExternalAsmMetricsResponse>,
                        java.util.concurrent.Future<SummarizeExternalAsmMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeExternalAsmMetricsRequest, SummarizeExternalAsmMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalClusterMetricsResponse>
            summarizeExternalClusterMetrics(
                    SummarizeExternalClusterMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalClusterMetricsRequest,
                                    SummarizeExternalClusterMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeExternalClusterMetrics");
        final SummarizeExternalClusterMetricsRequest interceptedRequest =
                SummarizeExternalClusterMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalClusterMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalClusterMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/SummarizeExternalClusterMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalClusterMetricsResponse>
                transformer =
                        SummarizeExternalClusterMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeExternalClusterMetricsRequest,
                        SummarizeExternalClusterMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeExternalClusterMetricsRequest,
                                SummarizeExternalClusterMetricsResponse>,
                        java.util.concurrent.Future<SummarizeExternalClusterMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeExternalClusterMetricsRequest,
                    SummarizeExternalClusterMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalDbNodeMetricsResponse>
            summarizeExternalDbNodeMetrics(
                    SummarizeExternalDbNodeMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbNodeMetricsRequest,
                                    SummarizeExternalDbNodeMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeExternalDbNodeMetrics");
        final SummarizeExternalDbNodeMetricsRequest interceptedRequest =
                SummarizeExternalDbNodeMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalDbNodeMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalDbNodeMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/SummarizeExternalDbNodeMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalDbNodeMetricsResponse>
                transformer =
                        SummarizeExternalDbNodeMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeExternalDbNodeMetricsRequest,
                        SummarizeExternalDbNodeMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeExternalDbNodeMetricsRequest,
                                SummarizeExternalDbNodeMetricsResponse>,
                        java.util.concurrent.Future<SummarizeExternalDbNodeMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeExternalDbNodeMetricsRequest, SummarizeExternalDbNodeMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalDbSystemAvailabilityMetricsResponse>
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbSystemAvailabilityMetricsRequest,
                                    SummarizeExternalDbSystemAvailabilityMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeExternalDbSystemAvailabilityMetrics");
        final SummarizeExternalDbSystemAvailabilityMetricsRequest interceptedRequest =
                SummarizeExternalDbSystemAvailabilityMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalDbSystemAvailabilityMetricsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalDbSystemAvailabilityMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/SummarizeExternalDbSystemAvailabilityMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        SummarizeExternalDbSystemAvailabilityMetricsResponse>
                transformer =
                        SummarizeExternalDbSystemAvailabilityMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeExternalDbSystemAvailabilityMetricsRequest,
                        SummarizeExternalDbSystemAvailabilityMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeExternalDbSystemAvailabilityMetricsRequest,
                                SummarizeExternalDbSystemAvailabilityMetricsResponse>,
                        java.util.concurrent.Future<
                                SummarizeExternalDbSystemAvailabilityMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeExternalDbSystemAvailabilityMetricsRequest,
                    SummarizeExternalDbSystemAvailabilityMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeExternalListenerMetricsResponse>
            summarizeExternalListenerMetrics(
                    SummarizeExternalListenerMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalListenerMetricsRequest,
                                    SummarizeExternalListenerMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeExternalListenerMetrics");
        final SummarizeExternalListenerMetricsRequest interceptedRequest =
                SummarizeExternalListenerMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeExternalListenerMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeExternalListenerMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/SummarizeExternalListenerMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeExternalListenerMetricsResponse>
                transformer =
                        SummarizeExternalListenerMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeExternalListenerMetricsRequest,
                        SummarizeExternalListenerMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeExternalListenerMetricsRequest,
                                SummarizeExternalListenerMetricsResponse>,
                        java.util.concurrent.Future<SummarizeExternalListenerMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeExternalListenerMetricsRequest,
                    SummarizeExternalListenerMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>
            summarizeJobExecutionsStatuses(
                    SummarizeJobExecutionsStatusesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJobExecutionsStatusesRequest,
                                    SummarizeJobExecutionsStatusesResponse>
                            handler) {
        LOG.trace("Called async summarizeJobExecutionsStatuses");
        final SummarizeJobExecutionsStatusesRequest interceptedRequest =
                SummarizeJobExecutionsStatusesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJobExecutionsStatusesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeJobExecutionsStatuses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecutionsStatusSummaryCollection/SummarizeJobExecutionsStatuses");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeJobExecutionsStatusesResponse>
                transformer =
                        SummarizeJobExecutionsStatusesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeJobExecutionsStatusesRequest,
                        SummarizeJobExecutionsStatusesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeJobExecutionsStatusesRequest,
                                SummarizeJobExecutionsStatusesResponse>,
                        java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeJobExecutionsStatusesRequest, SummarizeJobExecutionsStatusesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedDatabaseAvailabilityMetricsResponse>
            summarizeManagedDatabaseAvailabilityMetrics(
                    SummarizeManagedDatabaseAvailabilityMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedDatabaseAvailabilityMetricsRequest,
                                    SummarizeManagedDatabaseAvailabilityMetricsResponse>
                            handler) {
        LOG.trace("Called async summarizeManagedDatabaseAvailabilityMetrics");
        final SummarizeManagedDatabaseAvailabilityMetricsRequest interceptedRequest =
                SummarizeManagedDatabaseAvailabilityMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeManagedDatabaseAvailabilityMetricsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeManagedDatabaseAvailabilityMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeManagedDatabaseAvailabilityMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        SummarizeManagedDatabaseAvailabilityMetricsResponse>
                transformer =
                        SummarizeManagedDatabaseAvailabilityMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeManagedDatabaseAvailabilityMetricsRequest,
                        SummarizeManagedDatabaseAvailabilityMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeManagedDatabaseAvailabilityMetricsRequest,
                                SummarizeManagedDatabaseAvailabilityMetricsResponse>,
                        java.util.concurrent.Future<
                                SummarizeManagedDatabaseAvailabilityMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeManagedDatabaseAvailabilityMetricsRequest,
                    SummarizeManagedDatabaseAvailabilityMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanBaselinesResponse> summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanBaselinesRequest, SummarizeSqlPlanBaselinesResponse>
                    handler) {
        LOG.trace("Called async summarizeSqlPlanBaselines");
        final SummarizeSqlPlanBaselinesRequest interceptedRequest =
                SummarizeSqlPlanBaselinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanBaselinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselines");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeSqlPlanBaselinesResponse>
                transformer =
                        SummarizeSqlPlanBaselinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlPlanBaselinesRequest, SummarizeSqlPlanBaselinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlPlanBaselinesRequest,
                                SummarizeSqlPlanBaselinesResponse>,
                        java.util.concurrent.Future<SummarizeSqlPlanBaselinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlPlanBaselinesRequest, SummarizeSqlPlanBaselinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSqlPlanBaselinesByLastExecutionResponse>
            summarizeSqlPlanBaselinesByLastExecution(
                    SummarizeSqlPlanBaselinesByLastExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlPlanBaselinesByLastExecutionRequest,
                                    SummarizeSqlPlanBaselinesByLastExecutionResponse>
                            handler) {
        LOG.trace("Called async summarizeSqlPlanBaselinesByLastExecution");
        final SummarizeSqlPlanBaselinesByLastExecutionRequest interceptedRequest =
                SummarizeSqlPlanBaselinesByLastExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSqlPlanBaselinesByLastExecutionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "SummarizeSqlPlanBaselinesByLastExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeSqlPlanBaselinesByLastExecution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeSqlPlanBaselinesByLastExecutionResponse>
                transformer =
                        SummarizeSqlPlanBaselinesByLastExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSqlPlanBaselinesByLastExecutionRequest,
                        SummarizeSqlPlanBaselinesByLastExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSqlPlanBaselinesByLastExecutionRequest,
                                SummarizeSqlPlanBaselinesByLastExecutionResponse>,
                        java.util.concurrent.Future<
                                SummarizeSqlPlanBaselinesByLastExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSqlPlanBaselinesByLastExecutionRequest,
                    SummarizeSqlPlanBaselinesByLastExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestNamedCredentialResponse> testNamedCredential(
            TestNamedCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestNamedCredentialRequest, TestNamedCredentialResponse>
                    handler) {
        LOG.trace("Called async testNamedCredential");
        final TestNamedCredentialRequest interceptedRequest =
                TestNamedCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestNamedCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "TestNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/TestNamedCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, TestNamedCredentialResponse>
                transformer =
                        TestNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TestNamedCredentialRequest, TestNamedCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestNamedCredentialRequest, TestNamedCredentialResponse>,
                        java.util.concurrent.Future<TestNamedCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestNamedCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestNamedCredentialRequest, TestNamedCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestPreferredCredentialResponse> testPreferredCredential(
            TestPreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestPreferredCredentialRequest, TestPreferredCredentialResponse>
                    handler) {
        LOG.trace("Called async testPreferredCredential");
        final TestPreferredCredentialRequest interceptedRequest =
                TestPreferredCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestPreferredCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "TestPreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/TestPreferredCredential");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TestPreferredCredentialResponse>
                transformer =
                        TestPreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TestPreferredCredentialRequest, TestPreferredCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestPreferredCredentialRequest, TestPreferredCredentialResponse>,
                        java.util.concurrent.Future<TestPreferredCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestPreferredCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestPreferredCredentialRequest, TestPreferredCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>
            updateDbManagementPrivateEndpoint(
                    UpdateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDbManagementPrivateEndpointRequest,
                                    UpdateDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDbManagementPrivateEndpoint");
        final UpdateDbManagementPrivateEndpointRequest interceptedRequest =
                UpdateDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateDbManagementPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/UpdateDbManagementPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDbManagementPrivateEndpointResponse>
                transformer =
                        UpdateDbManagementPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDbManagementPrivateEndpointRequest,
                        UpdateDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDbManagementPrivateEndpointRequest,
                                UpdateDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDbManagementPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDbManagementPrivateEndpointRequest,
                    UpdateDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalAsmResponse> updateExternalAsm(
            UpdateExternalAsmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalAsmRequest, UpdateExternalAsmResponse>
                    handler) {
        LOG.trace("Called async updateExternalAsm");
        final UpdateExternalAsmRequest interceptedRequest =
                UpdateExternalAsmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalAsmConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalAsm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsm/UpdateExternalAsm");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalAsmResponse>
                transformer =
                        UpdateExternalAsmConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateExternalAsmRequest, UpdateExternalAsmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalAsmRequest, UpdateExternalAsmResponse>,
                        java.util.concurrent.Future<UpdateExternalAsmResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalAsmDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalAsmRequest, UpdateExternalAsmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalAsmInstanceResponse> updateExternalAsmInstance(
            UpdateExternalAsmInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalAsmInstanceRequest, UpdateExternalAsmInstanceResponse>
                    handler) {
        LOG.trace("Called async updateExternalAsmInstance");
        final UpdateExternalAsmInstanceRequest interceptedRequest =
                UpdateExternalAsmInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalAsmInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalAsmInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalAsmInstance/UpdateExternalAsmInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalAsmInstanceResponse>
                transformer =
                        UpdateExternalAsmInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalAsmInstanceRequest, UpdateExternalAsmInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalAsmInstanceRequest,
                                UpdateExternalAsmInstanceResponse>,
                        java.util.concurrent.Future<UpdateExternalAsmInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalAsmInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalAsmInstanceRequest, UpdateExternalAsmInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalClusterResponse> updateExternalCluster(
            UpdateExternalClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalClusterRequest, UpdateExternalClusterResponse>
                    handler) {
        LOG.trace("Called async updateExternalCluster");
        final UpdateExternalClusterRequest interceptedRequest =
                UpdateExternalClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalCluster/UpdateExternalCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalClusterResponse>
                transformer =
                        UpdateExternalClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalClusterRequest, UpdateExternalClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalClusterRequest, UpdateExternalClusterResponse>,
                        java.util.concurrent.Future<UpdateExternalClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalClusterRequest, UpdateExternalClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalClusterInstanceResponse>
            updateExternalClusterInstance(
                    UpdateExternalClusterInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalClusterInstanceRequest,
                                    UpdateExternalClusterInstanceResponse>
                            handler) {
        LOG.trace("Called async updateExternalClusterInstance");
        final UpdateExternalClusterInstanceRequest interceptedRequest =
                UpdateExternalClusterInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalClusterInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalClusterInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalClusterInstance/UpdateExternalClusterInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalClusterInstanceResponse>
                transformer =
                        UpdateExternalClusterInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalClusterInstanceRequest, UpdateExternalClusterInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalClusterInstanceRequest,
                                UpdateExternalClusterInstanceResponse>,
                        java.util.concurrent.Future<UpdateExternalClusterInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalClusterInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalClusterInstanceRequest, UpdateExternalClusterInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbHomeResponse> updateExternalDbHome(
            UpdateExternalDbHomeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbHomeRequest, UpdateExternalDbHomeResponse>
                    handler) {
        LOG.trace("Called async updateExternalDbHome");
        final UpdateExternalDbHomeRequest interceptedRequest =
                UpdateExternalDbHomeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbHomeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbHome",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbHome/UpdateExternalDbHome");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbHomeResponse>
                transformer =
                        UpdateExternalDbHomeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDbHomeRequest, UpdateExternalDbHomeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDbHomeRequest, UpdateExternalDbHomeResponse>,
                        java.util.concurrent.Future<UpdateExternalDbHomeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDbHomeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDbHomeRequest, UpdateExternalDbHomeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbNodeResponse> updateExternalDbNode(
            UpdateExternalDbNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>
                    handler) {
        LOG.trace("Called async updateExternalDbNode");
        final UpdateExternalDbNodeRequest interceptedRequest =
                UpdateExternalDbNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbNode/UpdateExternalDbNode");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbNodeResponse>
                transformer =
                        UpdateExternalDbNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>,
                        java.util.concurrent.Future<UpdateExternalDbNodeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDbNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemResponse> updateExternalDbSystem(
            UpdateExternalDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>
                    handler) {
        LOG.trace("Called async updateExternalDbSystem");
        final UpdateExternalDbSystemRequest interceptedRequest =
                UpdateExternalDbSystemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystem/UpdateExternalDbSystem");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalDbSystemResponse>
                transformer =
                        UpdateExternalDbSystemConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>,
                        java.util.concurrent.Future<UpdateExternalDbSystemResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDbSystemDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemConnectorResponse>
            updateExternalDbSystemConnector(
                    UpdateExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemConnectorRequest,
                                    UpdateExternalDbSystemConnectorResponse>
                            handler) {
        LOG.trace("Called async updateExternalDbSystemConnector");
        final UpdateExternalDbSystemConnectorRequest interceptedRequest =
                UpdateExternalDbSystemConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemConnector/UpdateExternalDbSystemConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalDbSystemConnectorResponse>
                transformer =
                        UpdateExternalDbSystemConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDbSystemConnectorRequest,
                        UpdateExternalDbSystemConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDbSystemConnectorRequest,
                                UpdateExternalDbSystemConnectorResponse>,
                        java.util.concurrent.Future<UpdateExternalDbSystemConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDbSystemConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDbSystemConnectorRequest,
                    UpdateExternalDbSystemConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalDbSystemDiscoveryResponse>
            updateExternalDbSystemDiscovery(
                    UpdateExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemDiscoveryRequest,
                                    UpdateExternalDbSystemDiscoveryResponse>
                            handler) {
        LOG.trace("Called async updateExternalDbSystemDiscovery");
        final UpdateExternalDbSystemDiscoveryRequest interceptedRequest =
                UpdateExternalDbSystemDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalDbSystemDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalDbSystemDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalDbSystemDiscovery/UpdateExternalDbSystemDiscovery");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalDbSystemDiscoveryResponse>
                transformer =
                        UpdateExternalDbSystemDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalDbSystemDiscoveryRequest,
                        UpdateExternalDbSystemDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalDbSystemDiscoveryRequest,
                                UpdateExternalDbSystemDiscoveryResponse>,
                        java.util.concurrent.Future<UpdateExternalDbSystemDiscoveryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalDbSystemDiscoveryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalDbSystemDiscoveryRequest,
                    UpdateExternalDbSystemDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataInfrastructureResponse>
            updateExternalExadataInfrastructure(
                    UpdateExternalExadataInfrastructureRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataInfrastructureRequest,
                                    UpdateExternalExadataInfrastructureResponse>
                            handler) {
        LOG.trace("Called async updateExternalExadataInfrastructure");
        final UpdateExternalExadataInfrastructureRequest interceptedRequest =
                UpdateExternalExadataInfrastructureConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataInfrastructureConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataInfrastructure",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataInfrastructure/UpdateExternalExadataInfrastructure");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataInfrastructureResponse>
                transformer =
                        UpdateExternalExadataInfrastructureConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalExadataInfrastructureRequest,
                        UpdateExternalExadataInfrastructureResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalExadataInfrastructureRequest,
                                UpdateExternalExadataInfrastructureResponse>,
                        java.util.concurrent.Future<UpdateExternalExadataInfrastructureResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalExadataInfrastructureDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalExadataInfrastructureRequest,
                    UpdateExternalExadataInfrastructureResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataStorageConnectorResponse>
            updateExternalExadataStorageConnector(
                    UpdateExternalExadataStorageConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageConnectorRequest,
                                    UpdateExternalExadataStorageConnectorResponse>
                            handler) {
        LOG.trace("Called async updateExternalExadataStorageConnector");
        final UpdateExternalExadataStorageConnectorRequest interceptedRequest =
                UpdateExternalExadataStorageConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageConnector/UpdateExternalExadataStorageConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageConnectorResponse>
                transformer =
                        UpdateExternalExadataStorageConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalExadataStorageConnectorRequest,
                        UpdateExternalExadataStorageConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalExadataStorageConnectorRequest,
                                UpdateExternalExadataStorageConnectorResponse>,
                        java.util.concurrent.Future<UpdateExternalExadataStorageConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateExternalExadataStorageConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalExadataStorageConnectorRequest,
                    UpdateExternalExadataStorageConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataStorageGridResponse>
            updateExternalExadataStorageGrid(
                    UpdateExternalExadataStorageGridRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageGridRequest,
                                    UpdateExternalExadataStorageGridResponse>
                            handler) {
        LOG.trace("Called async updateExternalExadataStorageGrid");
        final UpdateExternalExadataStorageGridRequest interceptedRequest =
                UpdateExternalExadataStorageGridConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageGridConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageGrid",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageGrid/UpdateExternalExadataStorageGrid");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageGridResponse>
                transformer =
                        UpdateExternalExadataStorageGridConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalExadataStorageGridRequest,
                        UpdateExternalExadataStorageGridResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalExadataStorageGridRequest,
                                UpdateExternalExadataStorageGridResponse>,
                        java.util.concurrent.Future<UpdateExternalExadataStorageGridResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalExadataStorageGridDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalExadataStorageGridRequest,
                    UpdateExternalExadataStorageGridResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalExadataStorageServerResponse>
            updateExternalExadataStorageServer(
                    UpdateExternalExadataStorageServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageServerRequest,
                                    UpdateExternalExadataStorageServerResponse>
                            handler) {
        LOG.trace("Called async updateExternalExadataStorageServer");
        final UpdateExternalExadataStorageServerRequest interceptedRequest =
                UpdateExternalExadataStorageServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalExadataStorageServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalExadataStorageServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalExadataStorageServer/UpdateExternalExadataStorageServer");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalExadataStorageServerResponse>
                transformer =
                        UpdateExternalExadataStorageServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalExadataStorageServerRequest,
                        UpdateExternalExadataStorageServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalExadataStorageServerRequest,
                                UpdateExternalExadataStorageServerResponse>,
                        java.util.concurrent.Future<UpdateExternalExadataStorageServerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalExadataStorageServerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalExadataStorageServerRequest,
                    UpdateExternalExadataStorageServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalListenerResponse> updateExternalListener(
            UpdateExternalListenerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalListenerRequest, UpdateExternalListenerResponse>
                    handler) {
        LOG.trace("Called async updateExternalListener");
        final UpdateExternalListenerRequest interceptedRequest =
                UpdateExternalListenerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalListenerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalListener",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalListener/UpdateExternalListener");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExternalListenerResponse>
                transformer =
                        UpdateExternalListenerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalListenerRequest, UpdateExternalListenerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalListenerRequest, UpdateExternalListenerResponse>,
                        java.util.concurrent.Future<UpdateExternalListenerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalListenerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalListenerRequest, UpdateExternalListenerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalMysqlDatabaseResponse>
            updateExternalMysqlDatabase(
                    UpdateExternalMysqlDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalMysqlDatabaseRequest,
                                    UpdateExternalMysqlDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateExternalMysqlDatabase");
        final UpdateExternalMysqlDatabaseRequest interceptedRequest =
                UpdateExternalMysqlDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalMysqlDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalMysqlDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabase/UpdateExternalMysqlDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalMysqlDatabaseResponse>
                transformer =
                        UpdateExternalMysqlDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalMysqlDatabaseRequest, UpdateExternalMysqlDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalMysqlDatabaseRequest,
                                UpdateExternalMysqlDatabaseResponse>,
                        java.util.concurrent.Future<UpdateExternalMysqlDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalMySqlDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalMysqlDatabaseRequest, UpdateExternalMysqlDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalMysqlDatabaseConnectorResponse>
            updateExternalMysqlDatabaseConnector(
                    UpdateExternalMysqlDatabaseConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalMysqlDatabaseConnectorRequest,
                                    UpdateExternalMysqlDatabaseConnectorResponse>
                            handler) {
        LOG.trace("Called async updateExternalMysqlDatabaseConnector");
        final UpdateExternalMysqlDatabaseConnectorRequest interceptedRequest =
                UpdateExternalMysqlDatabaseConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalMysqlDatabaseConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateExternalMysqlDatabaseConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ExternalMySqlDatabaseConnector/UpdateExternalMysqlDatabaseConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalMysqlDatabaseConnectorResponse>
                transformer =
                        UpdateExternalMysqlDatabaseConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalMysqlDatabaseConnectorRequest,
                        UpdateExternalMysqlDatabaseConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalMysqlDatabaseConnectorRequest,
                                UpdateExternalMysqlDatabaseConnectorResponse>,
                        java.util.concurrent.Future<UpdateExternalMysqlDatabaseConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalMySqlDatabaseConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalMysqlDatabaseConnectorRequest,
                    UpdateExternalMysqlDatabaseConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/UpdateJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateJobResponse>
                transformer =
                        UpdateJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdateManagedDatabaseResponse> updateManagedDatabase(
            UpdateManagedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedDatabaseRequest, UpdateManagedDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateManagedDatabase");
        final UpdateManagedDatabaseRequest interceptedRequest =
                UpdateManagedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateManagedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/UpdateManagedDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateManagedDatabaseResponse>
                transformer =
                        UpdateManagedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedDatabaseRequest, UpdateManagedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedDatabaseRequest, UpdateManagedDatabaseResponse>,
                        java.util.concurrent.Future<UpdateManagedDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedDatabaseRequest, UpdateManagedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse>
            updateManagedDatabaseGroup(
                    UpdateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagedDatabaseGroupRequest,
                                    UpdateManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async updateManagedDatabaseGroup");
        final UpdateManagedDatabaseGroupRequest interceptedRequest =
                UpdateManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateManagedDatabaseGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/UpdateManagedDatabaseGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateManagedDatabaseGroupResponse>
                transformer =
                        UpdateManagedDatabaseGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedDatabaseGroupRequest,
                                UpdateManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNamedCredentialResponse> updateNamedCredential(
            UpdateNamedCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamedCredentialRequest, UpdateNamedCredentialResponse>
                    handler) {
        LOG.trace("Called async updateNamedCredential");
        final UpdateNamedCredentialRequest interceptedRequest =
                UpdateNamedCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamedCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateNamedCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/NamedCredential/UpdateNamedCredential");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateNamedCredentialResponse>
                transformer =
                        UpdateNamedCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNamedCredentialRequest, UpdateNamedCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNamedCredentialRequest, UpdateNamedCredentialResponse>,
                        java.util.concurrent.Future<UpdateNamedCredentialResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNamedCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNamedCredentialRequest, UpdateNamedCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferredCredentialResponse> updatePreferredCredential(
            UpdatePreferredCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferredCredentialRequest, UpdatePreferredCredentialResponse>
                    handler) {
        LOG.trace("Called async updatePreferredCredential");
        final UpdatePreferredCredentialRequest interceptedRequest =
                UpdatePreferredCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePreferredCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdatePreferredCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PreferredCredential/UpdatePreferredCredential");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdatePreferredCredentialResponse>
                transformer =
                        UpdatePreferredCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdatePreferredCredentialRequest, UpdatePreferredCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePreferredCredentialRequest,
                                UpdatePreferredCredentialResponse>,
                        java.util.concurrent.Future<UpdatePreferredCredentialResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePreferredCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePreferredCredentialRequest, UpdatePreferredCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTablespaceResponse> updateTablespace(
            UpdateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTablespaceRequest, UpdateTablespaceResponse>
                    handler) {
        LOG.trace("Called async updateTablespace");
        final UpdateTablespaceRequest interceptedRequest =
                UpdateTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTablespaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbManagement",
                        "UpdateTablespace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/UpdateTablespace");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTablespaceResponse>
                transformer =
                        UpdateTablespaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTablespaceRequest, UpdateTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTablespaceRequest, UpdateTablespaceResponse>,
                        java.util.concurrent.Future<UpdateTablespaceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTablespaceRequest, UpdateTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
