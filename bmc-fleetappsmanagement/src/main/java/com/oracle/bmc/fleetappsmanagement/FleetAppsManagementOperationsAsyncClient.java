/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.internal.http.*;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Async client implementation for FleetAppsManagementOperations service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementOperationsAsyncClient
        implements FleetAppsManagementOperationsAsync {
    /**
     * Service instance for FleetAppsManagementOperations.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTOPERATIONS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementOperationsAsyncClient.class);

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
    public FleetAppsManagementOperationsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
    public FleetAppsManagementOperationsAsyncClient(
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
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                            "FleetAppsManagementOperationsAsyncClient", "exportComplianceReport"));
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
                    Builder, FleetAppsManagementOperationsAsyncClient> {
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
        public FleetAppsManagementOperationsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new FleetAppsManagementOperationsAsyncClient(
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
    public java.util.concurrent.Future<CreatePatchResponse> createPatch(
            CreatePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse>
                    handler) {
        LOG.trace("Called async createPatch");
        final CreatePatchRequest interceptedRequest =
                CreatePatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "CreatePatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/CreatePatch");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePatchResponse>
                transformer =
                        CreatePatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePatchRequest, CreatePatchResponse>,
                        java.util.concurrent.Future<CreatePatchResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePatchDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePatchRequest, CreatePatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSchedulerDefinitionResponse> createSchedulerDefinition(
            CreateSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulerDefinitionRequest, CreateSchedulerDefinitionResponse>
                    handler) {
        LOG.trace("Called async createSchedulerDefinition");
        final CreateSchedulerDefinitionRequest interceptedRequest =
                CreateSchedulerDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSchedulerDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "CreateSchedulerDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/CreateSchedulerDefinition");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSchedulerDefinitionResponse>
                transformer =
                        CreateSchedulerDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSchedulerDefinitionRequest, CreateSchedulerDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSchedulerDefinitionRequest,
                                CreateSchedulerDefinitionResponse>,
                        java.util.concurrent.Future<CreateSchedulerDefinitionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSchedulerDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSchedulerDefinitionRequest, CreateSchedulerDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePatchResponse> deletePatch(
            DeletePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse>
                    handler) {
        LOG.trace("Called async deletePatch");
        final DeletePatchRequest interceptedRequest =
                DeletePatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "DeletePatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/DeletePatch");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePatchResponse>
                transformer =
                        DeletePatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePatchRequest, DeletePatchResponse>,
                        java.util.concurrent.Future<DeletePatchResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePatchRequest, DeletePatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSchedulerDefinitionResponse> deleteSchedulerDefinition(
            DeleteSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerDefinitionRequest, DeleteSchedulerDefinitionResponse>
                    handler) {
        LOG.trace("Called async deleteSchedulerDefinition");
        final DeleteSchedulerDefinitionRequest interceptedRequest =
                DeleteSchedulerDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSchedulerDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "DeleteSchedulerDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/DeleteSchedulerDefinition");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSchedulerDefinitionResponse>
                transformer =
                        DeleteSchedulerDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSchedulerDefinitionRequest, DeleteSchedulerDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSchedulerDefinitionRequest,
                                DeleteSchedulerDefinitionResponse>,
                        java.util.concurrent.Future<DeleteSchedulerDefinitionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSchedulerDefinitionRequest, DeleteSchedulerDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSchedulerJobResponse> deleteSchedulerJob(
            DeleteSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>
                    handler) {
        LOG.trace("Called async deleteSchedulerJob");
        final DeleteSchedulerJobRequest interceptedRequest =
                DeleteSchedulerJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSchedulerJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "DeleteSchedulerJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/DeleteSchedulerJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSchedulerJobResponse>
                transformer =
                        DeleteSchedulerJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>,
                        java.util.concurrent.Future<DeleteSchedulerJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportComplianceReportResponse> exportComplianceReport(
            ExportComplianceReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportComplianceReportRequest, ExportComplianceReportResponse>
                    handler) {
        LOG.trace("Called async exportComplianceReport");
        final ExportComplianceReportRequest interceptedRequest =
                ExportComplianceReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportComplianceReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ExportComplianceReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecord/ExportComplianceReport");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportComplianceReportResponse>
                transformer =
                        ExportComplianceReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExportComplianceReportRequest, ExportComplianceReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportComplianceReportRequest, ExportComplianceReportResponse>,
                        java.util.concurrent.Future<ExportComplianceReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportComplianceReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportComplianceReportRequest, ExportComplianceReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExecutionResponse> getExecution(
            GetExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetExecutionRequest, GetExecutionResponse>
                    handler) {
        LOG.trace("Called async getExecution");
        final GetExecutionRequest interceptedRequest =
                GetExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "GetExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Execution/GetExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExecutionResponse>
                transformer =
                        GetExecutionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExecutionRequest, GetExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExecutionRequest, GetExecutionResponse>,
                        java.util.concurrent.Future<GetExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExecutionRequest, GetExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobActivityResponse> getJobActivity(
            GetJobActivityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobActivityRequest, GetJobActivityResponse>
                    handler) {
        LOG.trace("Called async getJobActivity");
        final GetJobActivityRequest interceptedRequest =
                GetJobActivityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobActivityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "GetJobActivity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/JobActivity/GetJobActivity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJobActivityResponse>
                transformer =
                        GetJobActivityConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJobActivityRequest, GetJobActivityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobActivityRequest, GetJobActivityResponse>,
                        java.util.concurrent.Future<GetJobActivityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobActivityRequest, GetJobActivityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPatchResponse> getPatch(
            GetPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse>
                    handler) {
        LOG.trace("Called async getPatch");
        final GetPatchRequest interceptedRequest = GetPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "GetPatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/GetPatch");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPatchResponse> transformer =
                GetPatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse>,
                        java.util.concurrent.Future<GetPatchResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPatchRequest, GetPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSchedulerDefinitionResponse> getSchedulerDefinition(
            GetSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
                    handler) {
        LOG.trace("Called async getSchedulerDefinition");
        final GetSchedulerDefinitionRequest interceptedRequest =
                GetSchedulerDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSchedulerDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "GetSchedulerDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/GetSchedulerDefinition");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSchedulerDefinitionResponse>
                transformer =
                        GetSchedulerDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>,
                        java.util.concurrent.Future<GetSchedulerDefinitionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSchedulerJobResponse> getSchedulerJob(
            GetSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulerJobRequest, GetSchedulerJobResponse>
                    handler) {
        LOG.trace("Called async getSchedulerJob");
        final GetSchedulerJobRequest interceptedRequest =
                GetSchedulerJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSchedulerJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "GetSchedulerJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/GetSchedulerJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSchedulerJobResponse>
                transformer =
                        GetSchedulerJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSchedulerJobRequest, GetSchedulerJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSchedulerJobRequest, GetSchedulerJobResponse>,
                        java.util.concurrent.Future<GetSchedulerJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSchedulerJobRequest, GetSchedulerJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListComplianceRecordsResponse> listComplianceRecords(
            ListComplianceRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListComplianceRecordsRequest, ListComplianceRecordsResponse>
                    handler) {
        LOG.trace("Called async listComplianceRecords");
        final ListComplianceRecordsRequest interceptedRequest =
                ListComplianceRecordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListComplianceRecordsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListComplianceRecords",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecordCollection/ListComplianceRecords");
        final java.util.function.Function<javax.ws.rs.core.Response, ListComplianceRecordsResponse>
                transformer =
                        ListComplianceRecordsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListComplianceRecordsRequest, ListComplianceRecordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListComplianceRecordsRequest, ListComplianceRecordsResponse>,
                        java.util.concurrent.Future<ListComplianceRecordsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListComplianceRecordsRequest, ListComplianceRecordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResponse> listExecutions(
            ListExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExecutionsRequest, ListExecutionsResponse>
                    handler) {
        LOG.trace("Called async listExecutions");
        final ListExecutionsRequest interceptedRequest =
                ListExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExecutionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ExecutionCollection/ListExecutions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExecutionsResponse>
                transformer =
                        ListExecutionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListExecutionsRequest, ListExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExecutionsRequest, ListExecutionsResponse>,
                        java.util.concurrent.Future<ListExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExecutionsRequest, ListExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse>
                    handler) {
        LOG.trace("Called async listPatches");
        final ListPatchesRequest interceptedRequest =
                ListPatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatchesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListPatches",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PatchCollection/ListPatches");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPatchesResponse>
                transformer =
                        ListPatchesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPatchesRequest, ListPatchesResponse>,
                        java.util.concurrent.Future<ListPatchesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPatchesRequest, ListPatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResponse> listResources(
            ListResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListResourcesRequest, ListResourcesResponse>
                    handler) {
        LOG.trace("Called async listResources");
        final ListResourcesRequest interceptedRequest =
                ListResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ResourceCollection/ListResources");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResourcesResponse>
                transformer =
                        ListResourcesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListResourcesRequest, ListResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourcesRequest, ListResourcesResponse>,
                        java.util.concurrent.Future<ListResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourcesRequest, ListResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListScheduledFleetsResponse> listScheduledFleets(
            ListScheduledFleetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledFleetsRequest, ListScheduledFleetsResponse>
                    handler) {
        LOG.trace("Called async listScheduledFleets");
        final ListScheduledFleetsRequest interceptedRequest =
                ListScheduledFleetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledFleetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListScheduledFleets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ScheduledFleetCollection/ListScheduledFleets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListScheduledFleetsResponse>
                transformer =
                        ListScheduledFleetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListScheduledFleetsRequest, ListScheduledFleetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListScheduledFleetsRequest, ListScheduledFleetsResponse>,
                        java.util.concurrent.Future<ListScheduledFleetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListScheduledFleetsRequest, ListScheduledFleetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchedulerDefinitionsResponse> listSchedulerDefinitions(
            ListSchedulerDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>
                    handler) {
        LOG.trace("Called async listSchedulerDefinitions");
        final ListSchedulerDefinitionsRequest interceptedRequest =
                ListSchedulerDefinitionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchedulerDefinitionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListSchedulerDefinitions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinitionCollection/ListSchedulerDefinitions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSchedulerDefinitionsResponse>
                transformer =
                        ListSchedulerDefinitionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>,
                        java.util.concurrent.Future<ListSchedulerDefinitionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchedulerJobsResponse> listSchedulerJobs(
            ListSchedulerJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerJobsRequest, ListSchedulerJobsResponse>
                    handler) {
        LOG.trace("Called async listSchedulerJobs");
        final ListSchedulerJobsRequest interceptedRequest =
                ListSchedulerJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchedulerJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListSchedulerJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJobCollection/ListSchedulerJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchedulerJobsResponse>
                transformer =
                        ListSchedulerJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchedulerJobsRequest, ListSchedulerJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchedulerJobsRequest, ListSchedulerJobsResponse>,
                        java.util.concurrent.Future<ListSchedulerJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchedulerJobsRequest, ListSchedulerJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStepsResponse> listSteps(
            ListStepsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListStepsRequest, ListStepsResponse>
                    handler) {
        LOG.trace("Called async listSteps");
        final ListStepsRequest interceptedRequest = ListStepsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStepsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ListSteps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/StepCollection/ListSteps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListStepsResponse>
                transformer =
                        ListStepsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListStepsRequest, ListStepsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListStepsRequest, ListStepsResponse>,
                        java.util.concurrent.Future<ListStepsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStepsRequest, ListStepsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ManageJobExecutionResponse> manageJobExecution(
            ManageJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ManageJobExecutionRequest, ManageJobExecutionResponse>
                    handler) {
        LOG.trace("Called async manageJobExecution");
        final ManageJobExecutionRequest interceptedRequest =
                ManageJobExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ManageJobExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "ManageJobExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/ManageJobExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageJobExecutionResponse>
                transformer =
                        ManageJobExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ManageJobExecutionRequest, ManageJobExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ManageJobExecutionRequest, ManageJobExecutionResponse>,
                        java.util.concurrent.Future<ManageJobExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getManageJobExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ManageJobExecutionRequest, ManageJobExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeComplianceRecordCountsResponse>
            summarizeComplianceRecordCounts(
                    SummarizeComplianceRecordCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeComplianceRecordCountsRequest,
                                    SummarizeComplianceRecordCountsResponse>
                            handler) {
        LOG.trace("Called async summarizeComplianceRecordCounts");
        final SummarizeComplianceRecordCountsRequest interceptedRequest =
                SummarizeComplianceRecordCountsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeComplianceRecordCountsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeComplianceRecordCounts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ComplianceRecordAggregationCollection/SummarizeComplianceRecordCounts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeComplianceRecordCountsResponse>
                transformer =
                        SummarizeComplianceRecordCountsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeComplianceRecordCountsRequest,
                        SummarizeComplianceRecordCountsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeComplianceRecordCountsRequest,
                                SummarizeComplianceRecordCountsResponse>,
                        java.util.concurrent.Future<SummarizeComplianceRecordCountsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeComplianceRecordCountsRequest,
                    SummarizeComplianceRecordCountsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedEntityCountsResponse>
            summarizeManagedEntityCounts(
                    SummarizeManagedEntityCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedEntityCountsRequest,
                                    SummarizeManagedEntityCountsResponse>
                            handler) {
        LOG.trace("Called async summarizeManagedEntityCounts");
        final SummarizeManagedEntityCountsRequest interceptedRequest =
                SummarizeManagedEntityCountsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeManagedEntityCountsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeManagedEntityCounts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/ManagedEntityAggregationCollection/SummarizeManagedEntityCounts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeManagedEntityCountsResponse>
                transformer =
                        SummarizeManagedEntityCountsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeManagedEntityCountsRequest, SummarizeManagedEntityCountsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeManagedEntityCountsRequest,
                                SummarizeManagedEntityCountsResponse>,
                        java.util.concurrent.Future<SummarizeManagedEntityCountsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeManagedEntityCountsRequest, SummarizeManagedEntityCountsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeSchedulerJobCountsResponse>
            summarizeSchedulerJobCounts(
                    SummarizeSchedulerJobCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSchedulerJobCountsRequest,
                                    SummarizeSchedulerJobCountsResponse>
                            handler) {
        LOG.trace("Called async summarizeSchedulerJobCounts");
        final SummarizeSchedulerJobCountsRequest interceptedRequest =
                SummarizeSchedulerJobCountsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeSchedulerJobCountsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "SummarizeSchedulerJobCounts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJobAggregationCollection/SummarizeSchedulerJobCounts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeSchedulerJobCountsResponse>
                transformer =
                        SummarizeSchedulerJobCountsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeSchedulerJobCountsRequest, SummarizeSchedulerJobCountsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeSchedulerJobCountsRequest,
                                SummarizeSchedulerJobCountsResponse>,
                        java.util.concurrent.Future<SummarizeSchedulerJobCountsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeSchedulerJobCountsRequest, SummarizeSchedulerJobCountsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePatchResponse> updatePatch(
            UpdatePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePatchRequest, UpdatePatchResponse>
                    handler) {
        LOG.trace("Called async updatePatch");
        final UpdatePatchRequest interceptedRequest =
                UpdatePatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "UpdatePatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Patch/UpdatePatch");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePatchResponse>
                transformer =
                        UpdatePatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePatchRequest, UpdatePatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePatchRequest, UpdatePatchResponse>,
                        java.util.concurrent.Future<UpdatePatchResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePatchDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePatchRequest, UpdatePatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSchedulerDefinitionResponse> updateSchedulerDefinition(
            UpdateSchedulerDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerDefinitionRequest, UpdateSchedulerDefinitionResponse>
                    handler) {
        LOG.trace("Called async updateSchedulerDefinition");
        final UpdateSchedulerDefinitionRequest interceptedRequest =
                UpdateSchedulerDefinitionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSchedulerDefinitionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "UpdateSchedulerDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerDefinition/UpdateSchedulerDefinition");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateSchedulerDefinitionResponse>
                transformer =
                        UpdateSchedulerDefinitionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSchedulerDefinitionRequest, UpdateSchedulerDefinitionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSchedulerDefinitionRequest,
                                UpdateSchedulerDefinitionResponse>,
                        java.util.concurrent.Future<UpdateSchedulerDefinitionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSchedulerDefinitionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSchedulerDefinitionRequest, UpdateSchedulerDefinitionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSchedulerJobResponse> updateSchedulerJob(
            UpdateSchedulerJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>
                    handler) {
        LOG.trace("Called async updateSchedulerJob");
        final UpdateSchedulerJobRequest interceptedRequest =
                UpdateSchedulerJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSchedulerJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetAppsManagementOperations",
                        "UpdateSchedulerJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/SchedulerJob/UpdateSchedulerJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSchedulerJobResponse>
                transformer =
                        UpdateSchedulerJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>,
                        java.util.concurrent.Future<UpdateSchedulerJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSchedulerJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
