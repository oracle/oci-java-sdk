/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms;

import com.oracle.bmc.jms.internal.http.*;
import com.oracle.bmc.jms.requests.*;
import com.oracle.bmc.jms.responses.*;

/**
 * Async client implementation for JavaManagementService service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class JavaManagementServiceAsyncClient implements JavaManagementServiceAsync {
    /**
     * Service instance for JavaManagementService.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("JAVAMANAGEMENTSERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://javamanagement.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JavaManagementServiceAsyncClient.class);

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
    public JavaManagementServiceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
    public JavaManagementServiceAsyncClient(
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
                            "JavaManagementServiceAsyncClient", "generateAgentDeployScript"));
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
                    Builder, JavaManagementServiceAsyncClient> {
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
        public JavaManagementServiceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new JavaManagementServiceAsyncClient(
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
    public java.util.concurrent.Future<AddFleetInstallationSitesResponse> addFleetInstallationSites(
            AddFleetInstallationSitesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddFleetInstallationSitesRequest, AddFleetInstallationSitesResponse>
                    handler) {
        LOG.trace("Called async addFleetInstallationSites");
        final AddFleetInstallationSitesRequest interceptedRequest =
                AddFleetInstallationSitesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddFleetInstallationSitesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "AddFleetInstallationSites",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/AddFleetInstallationSites");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddFleetInstallationSitesResponse>
                transformer =
                        AddFleetInstallationSitesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddFleetInstallationSitesRequest, AddFleetInstallationSitesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddFleetInstallationSitesRequest,
                                AddFleetInstallationSitesResponse>,
                        java.util.concurrent.Future<AddFleetInstallationSitesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddFleetInstallationSitesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddFleetInstallationSitesRequest, AddFleetInstallationSitesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/CancelWorkRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer =
                        CancelWorkRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ChangeFleetCompartmentResponse> changeFleetCompartment(
            ChangeFleetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeFleetCompartment");
        final ChangeFleetCompartmentRequest interceptedRequest =
                ChangeFleetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFleetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ChangeFleetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/ChangeFleetCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeFleetCompartmentResponse>
                transformer =
                        ChangeFleetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFleetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFleetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBlocklistResponse> createBlocklist(
            CreateBlocklistRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBlocklistRequest, CreateBlocklistResponse>
                    handler) {
        LOG.trace("Called async createBlocklist");
        final CreateBlocklistRequest interceptedRequest =
                CreateBlocklistConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBlocklistConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "CreateBlocklist",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/CreateBlocklist");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBlocklistResponse>
                transformer =
                        CreateBlocklistConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBlocklistRequest, CreateBlocklistResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBlocklistRequest, CreateBlocklistResponse>,
                        java.util.concurrent.Future<CreateBlocklistResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBlocklistDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBlocklistRequest, CreateBlocklistResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResponse> createFleet(
            CreateFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFleetRequest, CreateFleetResponse>
                    handler) {
        LOG.trace("Called async createFleet");
        final CreateFleetRequest interceptedRequest =
                CreateFleetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFleetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "CreateFleet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/CreateFleet");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFleetResponse>
                transformer =
                        CreateFleetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFleetRequest, CreateFleetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFleetRequest, CreateFleetResponse>,
                        java.util.concurrent.Future<CreateFleetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFleetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFleetRequest, CreateFleetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBlocklistResponse> deleteBlocklist(
            DeleteBlocklistRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBlocklistRequest, DeleteBlocklistResponse>
                    handler) {
        LOG.trace("Called async deleteBlocklist");
        final DeleteBlocklistRequest interceptedRequest =
                DeleteBlocklistConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBlocklistConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "DeleteBlocklist",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/DeleteBlocklist");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBlocklistResponse>
                transformer =
                        DeleteBlocklistConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBlocklistRequest, DeleteBlocklistResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBlocklistRequest, DeleteBlocklistResponse>,
                        java.util.concurrent.Future<DeleteBlocklistResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBlocklistRequest, DeleteBlocklistResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCryptoAnalysisResultResponse>
            deleteCryptoAnalysisResult(
                    DeleteCryptoAnalysisResultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCryptoAnalysisResultRequest,
                                    DeleteCryptoAnalysisResultResponse>
                            handler) {
        LOG.trace("Called async deleteCryptoAnalysisResult");
        final DeleteCryptoAnalysisResultRequest interceptedRequest =
                DeleteCryptoAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCryptoAnalysisResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "DeleteCryptoAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/DeleteCryptoAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCryptoAnalysisResultResponse>
                transformer =
                        DeleteCryptoAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCryptoAnalysisResultRequest, DeleteCryptoAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCryptoAnalysisResultRequest,
                                DeleteCryptoAnalysisResultResponse>,
                        java.util.concurrent.Future<DeleteCryptoAnalysisResultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCryptoAnalysisResultRequest, DeleteCryptoAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResponse> deleteFleet(
            DeleteFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFleetRequest, DeleteFleetResponse>
                    handler) {
        LOG.trace("Called async deleteFleet");
        final DeleteFleetRequest interceptedRequest =
                DeleteFleetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFleetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "DeleteFleet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/DeleteFleet");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFleetResponse>
                transformer =
                        DeleteFleetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFleetRequest, DeleteFleetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFleetRequest, DeleteFleetResponse>,
                        java.util.concurrent.Future<DeleteFleetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFleetRequest, DeleteFleetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJavaMigrationAnalysisResultResponse>
            deleteJavaMigrationAnalysisResult(
                    DeleteJavaMigrationAnalysisResultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteJavaMigrationAnalysisResultRequest,
                                    DeleteJavaMigrationAnalysisResultResponse>
                            handler) {
        LOG.trace("Called async deleteJavaMigrationAnalysisResult");
        final DeleteJavaMigrationAnalysisResultRequest interceptedRequest =
                DeleteJavaMigrationAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJavaMigrationAnalysisResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "DeleteJavaMigrationAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/DeleteJavaMigrationAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteJavaMigrationAnalysisResultResponse>
                transformer =
                        DeleteJavaMigrationAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteJavaMigrationAnalysisResultRequest,
                        DeleteJavaMigrationAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteJavaMigrationAnalysisResultRequest,
                                DeleteJavaMigrationAnalysisResultResponse>,
                        java.util.concurrent.Future<DeleteJavaMigrationAnalysisResultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJavaMigrationAnalysisResultRequest,
                    DeleteJavaMigrationAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePerformanceTuningAnalysisResultResponse>
            deletePerformanceTuningAnalysisResult(
                    DeletePerformanceTuningAnalysisResultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePerformanceTuningAnalysisResultRequest,
                                    DeletePerformanceTuningAnalysisResultResponse>
                            handler) {
        LOG.trace("Called async deletePerformanceTuningAnalysisResult");
        final DeletePerformanceTuningAnalysisResultRequest interceptedRequest =
                DeletePerformanceTuningAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePerformanceTuningAnalysisResultConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "DeletePerformanceTuningAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/DeletePerformanceTuningAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeletePerformanceTuningAnalysisResultResponse>
                transformer =
                        DeletePerformanceTuningAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePerformanceTuningAnalysisResultRequest,
                        DeletePerformanceTuningAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePerformanceTuningAnalysisResultRequest,
                                DeletePerformanceTuningAnalysisResultResponse>,
                        java.util.concurrent.Future<DeletePerformanceTuningAnalysisResultResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePerformanceTuningAnalysisResultRequest,
                    DeletePerformanceTuningAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAgentDeployScriptResponse> generateAgentDeployScript(
            GenerateAgentDeployScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateAgentDeployScriptRequest, GenerateAgentDeployScriptResponse>
                    handler) {
        LOG.trace("Called async generateAgentDeployScript");
        final GenerateAgentDeployScriptRequest interceptedRequest =
                GenerateAgentDeployScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAgentDeployScriptConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GenerateAgentDeployScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/GenerateAgentDeployScript");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateAgentDeployScriptResponse>
                transformer =
                        GenerateAgentDeployScriptConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateAgentDeployScriptRequest, GenerateAgentDeployScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateAgentDeployScriptRequest,
                                GenerateAgentDeployScriptResponse>,
                        java.util.concurrent.Future<GenerateAgentDeployScriptResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateAgentDeployScriptDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateAgentDeployScriptRequest, GenerateAgentDeployScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCryptoAnalysisResultResponse> getCryptoAnalysisResult(
            GetCryptoAnalysisResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCryptoAnalysisResultRequest, GetCryptoAnalysisResultResponse>
                    handler) {
        LOG.trace("Called async getCryptoAnalysisResult");
        final GetCryptoAnalysisResultRequest interceptedRequest =
                GetCryptoAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCryptoAnalysisResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetCryptoAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/GetCryptoAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCryptoAnalysisResultResponse>
                transformer =
                        GetCryptoAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCryptoAnalysisResultRequest, GetCryptoAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCryptoAnalysisResultRequest, GetCryptoAnalysisResultResponse>,
                        java.util.concurrent.Future<GetCryptoAnalysisResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCryptoAnalysisResultRequest, GetCryptoAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFleetResponse> getFleet(
            GetFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFleetRequest, GetFleetResponse>
                    handler) {
        LOG.trace("Called async getFleet");
        final GetFleetRequest interceptedRequest = GetFleetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFleetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetFleet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/GetFleet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFleetResponse> transformer =
                GetFleetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFleetRequest, GetFleetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetFleetRequest, GetFleetResponse>,
                        java.util.concurrent.Future<GetFleetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFleetRequest, GetFleetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFleetAdvancedFeatureConfigurationResponse>
            getFleetAdvancedFeatureConfiguration(
                    GetFleetAdvancedFeatureConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFleetAdvancedFeatureConfigurationRequest,
                                    GetFleetAdvancedFeatureConfigurationResponse>
                            handler) {
        LOG.trace("Called async getFleetAdvancedFeatureConfiguration");
        final GetFleetAdvancedFeatureConfigurationRequest interceptedRequest =
                GetFleetAdvancedFeatureConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFleetAdvancedFeatureConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetFleetAdvancedFeatureConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAdvancedFeatureConfiguration/GetFleetAdvancedFeatureConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFleetAdvancedFeatureConfigurationResponse>
                transformer =
                        GetFleetAdvancedFeatureConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFleetAdvancedFeatureConfigurationRequest,
                        GetFleetAdvancedFeatureConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFleetAdvancedFeatureConfigurationRequest,
                                GetFleetAdvancedFeatureConfigurationResponse>,
                        java.util.concurrent.Future<GetFleetAdvancedFeatureConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFleetAdvancedFeatureConfigurationRequest,
                    GetFleetAdvancedFeatureConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFleetAgentConfigurationResponse>
            getFleetAgentConfiguration(
                    GetFleetAgentConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFleetAgentConfigurationRequest,
                                    GetFleetAgentConfigurationResponse>
                            handler) {
        LOG.trace("Called async getFleetAgentConfiguration");
        final GetFleetAgentConfigurationRequest interceptedRequest =
                GetFleetAgentConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFleetAgentConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetFleetAgentConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAgentConfiguration/GetFleetAgentConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFleetAgentConfigurationResponse>
                transformer =
                        GetFleetAgentConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFleetAgentConfigurationRequest, GetFleetAgentConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFleetAgentConfigurationRequest,
                                GetFleetAgentConfigurationResponse>,
                        java.util.concurrent.Future<GetFleetAgentConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFleetAgentConfigurationRequest, GetFleetAgentConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJavaFamilyResponse> getJavaFamily(
            GetJavaFamilyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJavaFamilyRequest, GetJavaFamilyResponse>
                    handler) {
        LOG.trace("Called async getJavaFamily");
        final GetJavaFamilyRequest interceptedRequest =
                GetJavaFamilyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJavaFamilyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetJavaFamily",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaFamily/GetJavaFamily");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJavaFamilyResponse>
                transformer =
                        GetJavaFamilyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJavaFamilyRequest, GetJavaFamilyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJavaFamilyRequest, GetJavaFamilyResponse>,
                        java.util.concurrent.Future<GetJavaFamilyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJavaFamilyRequest, GetJavaFamilyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJavaMigrationAnalysisResultResponse>
            getJavaMigrationAnalysisResult(
                    GetJavaMigrationAnalysisResultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetJavaMigrationAnalysisResultRequest,
                                    GetJavaMigrationAnalysisResultResponse>
                            handler) {
        LOG.trace("Called async getJavaMigrationAnalysisResult");
        final GetJavaMigrationAnalysisResultRequest interceptedRequest =
                GetJavaMigrationAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJavaMigrationAnalysisResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetJavaMigrationAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/GetJavaMigrationAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetJavaMigrationAnalysisResultResponse>
                transformer =
                        GetJavaMigrationAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetJavaMigrationAnalysisResultRequest,
                        GetJavaMigrationAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJavaMigrationAnalysisResultRequest,
                                GetJavaMigrationAnalysisResultResponse>,
                        java.util.concurrent.Future<GetJavaMigrationAnalysisResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJavaMigrationAnalysisResultRequest, GetJavaMigrationAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJavaReleaseResponse> getJavaRelease(
            GetJavaReleaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJavaReleaseRequest, GetJavaReleaseResponse>
                    handler) {
        LOG.trace("Called async getJavaRelease");
        final GetJavaReleaseRequest interceptedRequest =
                GetJavaReleaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJavaReleaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetJavaRelease",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaRelease/GetJavaRelease");
        final java.util.function.Function<javax.ws.rs.core.Response, GetJavaReleaseResponse>
                transformer =
                        GetJavaReleaseConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetJavaReleaseRequest, GetJavaReleaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJavaReleaseRequest, GetJavaReleaseResponse>,
                        java.util.concurrent.Future<GetJavaReleaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJavaReleaseRequest, GetJavaReleaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPerformanceTuningAnalysisResultResponse>
            getPerformanceTuningAnalysisResult(
                    GetPerformanceTuningAnalysisResultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPerformanceTuningAnalysisResultRequest,
                                    GetPerformanceTuningAnalysisResultResponse>
                            handler) {
        LOG.trace("Called async getPerformanceTuningAnalysisResult");
        final GetPerformanceTuningAnalysisResultRequest interceptedRequest =
                GetPerformanceTuningAnalysisResultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPerformanceTuningAnalysisResultConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "GetPerformanceTuningAnalysisResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/GetPerformanceTuningAnalysisResult");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetPerformanceTuningAnalysisResultResponse>
                transformer =
                        GetPerformanceTuningAnalysisResultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPerformanceTuningAnalysisResultRequest,
                        GetPerformanceTuningAnalysisResultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPerformanceTuningAnalysisResultRequest,
                                GetPerformanceTuningAnalysisResultResponse>,
                        java.util.concurrent.Future<GetPerformanceTuningAnalysisResultResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPerformanceTuningAnalysisResultRequest,
                    GetPerformanceTuningAnalysisResultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "JavaManagementService",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListAnnouncementsResponse> listAnnouncements(
            ListAnnouncementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAnnouncementsRequest, ListAnnouncementsResponse>
                    handler) {
        LOG.trace("Called async listAnnouncements");
        final ListAnnouncementsRequest interceptedRequest =
                ListAnnouncementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAnnouncementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListAnnouncements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/AnnouncementCollection/ListAnnouncements");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAnnouncementsResponse>
                transformer =
                        ListAnnouncementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAnnouncementsRequest, ListAnnouncementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAnnouncementsRequest, ListAnnouncementsResponse>,
                        java.util.concurrent.Future<ListAnnouncementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAnnouncementsRequest, ListAnnouncementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBlocklistsResponse> listBlocklists(
            ListBlocklistsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBlocklistsRequest, ListBlocklistsResponse>
                    handler) {
        LOG.trace("Called async listBlocklists");
        final ListBlocklistsRequest interceptedRequest =
                ListBlocklistsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBlocklistsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListBlocklists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Blocklist/ListBlocklists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBlocklistsResponse>
                transformer =
                        ListBlocklistsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBlocklistsRequest, ListBlocklistsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBlocklistsRequest, ListBlocklistsResponse>,
                        java.util.concurrent.Future<ListBlocklistsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBlocklistsRequest, ListBlocklistsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCryptoAnalysisResultsResponse> listCryptoAnalysisResults(
            ListCryptoAnalysisResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>
                    handler) {
        LOG.trace("Called async listCryptoAnalysisResults");
        final ListCryptoAnalysisResultsRequest interceptedRequest =
                ListCryptoAnalysisResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCryptoAnalysisResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListCryptoAnalysisResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/CryptoAnalysisResult/ListCryptoAnalysisResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCryptoAnalysisResultsResponse>
                transformer =
                        ListCryptoAnalysisResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCryptoAnalysisResultsRequest,
                                ListCryptoAnalysisResultsResponse>,
                        java.util.concurrent.Future<ListCryptoAnalysisResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFleetDiagnosesResponse> listFleetDiagnoses(
            ListFleetDiagnosesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFleetDiagnosesRequest, ListFleetDiagnosesResponse>
                    handler) {
        LOG.trace("Called async listFleetDiagnoses");
        final ListFleetDiagnosesRequest interceptedRequest =
                ListFleetDiagnosesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFleetDiagnosesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListFleetDiagnoses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetDiagnosisSummary/ListFleetDiagnoses");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFleetDiagnosesResponse>
                transformer =
                        ListFleetDiagnosesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFleetDiagnosesRequest, ListFleetDiagnosesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFleetDiagnosesRequest, ListFleetDiagnosesResponse>,
                        java.util.concurrent.Future<ListFleetDiagnosesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFleetDiagnosesRequest, ListFleetDiagnosesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResponse> listFleets(
            ListFleetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFleetsRequest, ListFleetsResponse>
                    handler) {
        LOG.trace("Called async listFleets");
        final ListFleetsRequest interceptedRequest = ListFleetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFleetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListFleets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/ListFleets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFleetsResponse>
                transformer =
                        ListFleetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFleetsRequest, ListFleetsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFleetsRequest, ListFleetsResponse>,
                        java.util.concurrent.Future<ListFleetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFleetsRequest, ListFleetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstallationSitesResponse> listInstallationSites(
            ListInstallationSitesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstallationSitesRequest, ListInstallationSitesResponse>
                    handler) {
        LOG.trace("Called async listInstallationSites");
        final ListInstallationSitesRequest interceptedRequest =
                ListInstallationSitesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstallationSitesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListInstallationSites",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/ListInstallationSites");
        final java.util.function.Function<javax.ws.rs.core.Response, ListInstallationSitesResponse>
                transformer =
                        ListInstallationSitesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstallationSitesRequest, ListInstallationSitesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstallationSitesRequest, ListInstallationSitesResponse>,
                        java.util.concurrent.Future<ListInstallationSitesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstallationSitesRequest, ListInstallationSitesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJavaFamiliesResponse> listJavaFamilies(
            ListJavaFamiliesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJavaFamiliesRequest, ListJavaFamiliesResponse>
                    handler) {
        LOG.trace("Called async listJavaFamilies");
        final ListJavaFamiliesRequest interceptedRequest =
                ListJavaFamiliesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJavaFamiliesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListJavaFamilies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaFamily/ListJavaFamilies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJavaFamiliesResponse>
                transformer =
                        ListJavaFamiliesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJavaFamiliesRequest, ListJavaFamiliesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJavaFamiliesRequest, ListJavaFamiliesResponse>,
                        java.util.concurrent.Future<ListJavaFamiliesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJavaFamiliesRequest, ListJavaFamiliesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJavaMigrationAnalysisResultsResponse>
            listJavaMigrationAnalysisResults(
                    ListJavaMigrationAnalysisResultsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListJavaMigrationAnalysisResultsRequest,
                                    ListJavaMigrationAnalysisResultsResponse>
                            handler) {
        LOG.trace("Called async listJavaMigrationAnalysisResults");
        final ListJavaMigrationAnalysisResultsRequest interceptedRequest =
                ListJavaMigrationAnalysisResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJavaMigrationAnalysisResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListJavaMigrationAnalysisResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaMigrationAnalysisResult/ListJavaMigrationAnalysisResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListJavaMigrationAnalysisResultsResponse>
                transformer =
                        ListJavaMigrationAnalysisResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListJavaMigrationAnalysisResultsRequest,
                        ListJavaMigrationAnalysisResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJavaMigrationAnalysisResultsRequest,
                                ListJavaMigrationAnalysisResultsResponse>,
                        java.util.concurrent.Future<ListJavaMigrationAnalysisResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJavaMigrationAnalysisResultsRequest,
                    ListJavaMigrationAnalysisResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJavaReleasesResponse> listJavaReleases(
            ListJavaReleasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJavaReleasesRequest, ListJavaReleasesResponse>
                    handler) {
        LOG.trace("Called async listJavaReleases");
        final ListJavaReleasesRequest interceptedRequest =
                ListJavaReleasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJavaReleasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListJavaReleases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaRelease/ListJavaReleases");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJavaReleasesResponse>
                transformer =
                        ListJavaReleasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJavaReleasesRequest, ListJavaReleasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJavaReleasesRequest, ListJavaReleasesResponse>,
                        java.util.concurrent.Future<ListJavaReleasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJavaReleasesRequest, ListJavaReleasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJreUsageResponse> listJreUsage(
            ListJreUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJreUsageRequest, ListJreUsageResponse>
                    handler) {
        LOG.trace("Called async listJreUsage");
        final ListJreUsageRequest interceptedRequest =
                ListJreUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJreUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListJreUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JreUsage/ListJreUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, ListJreUsageResponse>
                transformer =
                        ListJreUsageConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListJreUsageRequest, ListJreUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJreUsageRequest, ListJreUsageResponse>,
                        java.util.concurrent.Future<ListJreUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJreUsageRequest, ListJreUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPerformanceTuningAnalysisResultsResponse>
            listPerformanceTuningAnalysisResults(
                    ListPerformanceTuningAnalysisResultsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPerformanceTuningAnalysisResultsRequest,
                                    ListPerformanceTuningAnalysisResultsResponse>
                            handler) {
        LOG.trace("Called async listPerformanceTuningAnalysisResults");
        final ListPerformanceTuningAnalysisResultsRequest interceptedRequest =
                ListPerformanceTuningAnalysisResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPerformanceTuningAnalysisResultsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListPerformanceTuningAnalysisResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/PerformanceTuningAnalysisResult/ListPerformanceTuningAnalysisResults");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListPerformanceTuningAnalysisResultsResponse>
                transformer =
                        ListPerformanceTuningAnalysisResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPerformanceTuningAnalysisResultsRequest,
                        ListPerformanceTuningAnalysisResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPerformanceTuningAnalysisResultsRequest,
                                ListPerformanceTuningAnalysisResultsResponse>,
                        java.util.concurrent.Future<ListPerformanceTuningAnalysisResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPerformanceTuningAnalysisResultsRequest,
                    ListPerformanceTuningAnalysisResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkItemsResponse> listWorkItems(
            ListWorkItemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWorkItemsRequest, ListWorkItemsResponse>
                    handler) {
        LOG.trace("Called async listWorkItems");
        final ListWorkItemsRequest interceptedRequest =
                ListWorkItemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkItemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ListWorkItems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkItemSummary/ListWorkItems");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkItemsResponse>
                transformer =
                        ListWorkItemsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWorkItemsRequest, ListWorkItemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkItemsRequest, ListWorkItemsResponse>,
                        java.util.concurrent.Future<ListWorkItemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkItemsRequest, ListWorkItemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "JavaManagementService",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequestError/ListWorkRequestErrors");
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
                        "JavaManagementService",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "JavaManagementService",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RemoveFleetInstallationSitesResponse>
            removeFleetInstallationSites(
                    RemoveFleetInstallationSitesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveFleetInstallationSitesRequest,
                                    RemoveFleetInstallationSitesResponse>
                            handler) {
        LOG.trace("Called async removeFleetInstallationSites");
        final RemoveFleetInstallationSitesRequest interceptedRequest =
                RemoveFleetInstallationSitesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveFleetInstallationSitesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "RemoveFleetInstallationSites",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationSiteSummary/RemoveFleetInstallationSites");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveFleetInstallationSitesResponse>
                transformer =
                        RemoveFleetInstallationSitesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveFleetInstallationSitesRequest, RemoveFleetInstallationSitesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveFleetInstallationSitesRequest,
                                RemoveFleetInstallationSitesResponse>,
                        java.util.concurrent.Future<RemoveFleetInstallationSitesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveFleetInstallationSitesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveFleetInstallationSitesRequest, RemoveFleetInstallationSitesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestCryptoAnalysesResponse> requestCryptoAnalyses(
            RequestCryptoAnalysesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestCryptoAnalysesRequest, RequestCryptoAnalysesResponse>
                    handler) {
        LOG.trace("Called async requestCryptoAnalyses");
        final RequestCryptoAnalysesRequest interceptedRequest =
                RequestCryptoAnalysesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestCryptoAnalysesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "RequestCryptoAnalyses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestCryptoAnalyses");
        final java.util.function.Function<javax.ws.rs.core.Response, RequestCryptoAnalysesResponse>
                transformer =
                        RequestCryptoAnalysesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestCryptoAnalysesRequest, RequestCryptoAnalysesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestCryptoAnalysesRequest, RequestCryptoAnalysesResponse>,
                        java.util.concurrent.Future<RequestCryptoAnalysesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestCryptoAnalysesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestCryptoAnalysesRequest, RequestCryptoAnalysesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestJavaMigrationAnalysesResponse>
            requestJavaMigrationAnalyses(
                    RequestJavaMigrationAnalysesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestJavaMigrationAnalysesRequest,
                                    RequestJavaMigrationAnalysesResponse>
                            handler) {
        LOG.trace("Called async requestJavaMigrationAnalyses");
        final RequestJavaMigrationAnalysesRequest interceptedRequest =
                RequestJavaMigrationAnalysesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestJavaMigrationAnalysesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "RequestJavaMigrationAnalyses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestJavaMigrationAnalyses");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestJavaMigrationAnalysesResponse>
                transformer =
                        RequestJavaMigrationAnalysesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestJavaMigrationAnalysesRequest, RequestJavaMigrationAnalysesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestJavaMigrationAnalysesRequest,
                                RequestJavaMigrationAnalysesResponse>,
                        java.util.concurrent.Future<RequestJavaMigrationAnalysesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestJavaMigrationAnalysesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestJavaMigrationAnalysesRequest, RequestJavaMigrationAnalysesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestJfrRecordingsResponse> requestJfrRecordings(
            RequestJfrRecordingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestJfrRecordingsRequest, RequestJfrRecordingsResponse>
                    handler) {
        LOG.trace("Called async requestJfrRecordings");
        final RequestJfrRecordingsRequest interceptedRequest =
                RequestJfrRecordingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestJfrRecordingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "RequestJfrRecordings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestJfrRecordings");
        final java.util.function.Function<javax.ws.rs.core.Response, RequestJfrRecordingsResponse>
                transformer =
                        RequestJfrRecordingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestJfrRecordingsRequest, RequestJfrRecordingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestJfrRecordingsRequest, RequestJfrRecordingsResponse>,
                        java.util.concurrent.Future<RequestJfrRecordingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestJfrRecordingsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestJfrRecordingsRequest, RequestJfrRecordingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestPerformanceTuningAnalysesResponse>
            requestPerformanceTuningAnalyses(
                    RequestPerformanceTuningAnalysesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestPerformanceTuningAnalysesRequest,
                                    RequestPerformanceTuningAnalysesResponse>
                            handler) {
        LOG.trace("Called async requestPerformanceTuningAnalyses");
        final RequestPerformanceTuningAnalysesRequest interceptedRequest =
                RequestPerformanceTuningAnalysesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestPerformanceTuningAnalysesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "RequestPerformanceTuningAnalyses",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/RequestPerformanceTuningAnalyses");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestPerformanceTuningAnalysesResponse>
                transformer =
                        RequestPerformanceTuningAnalysesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestPerformanceTuningAnalysesRequest,
                        RequestPerformanceTuningAnalysesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestPerformanceTuningAnalysesRequest,
                                RequestPerformanceTuningAnalysesResponse>,
                        java.util.concurrent.Future<RequestPerformanceTuningAnalysesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRequestPerformanceTuningAnalysesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestPerformanceTuningAnalysesRequest,
                    RequestPerformanceTuningAnalysesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScanJavaServerUsageResponse> scanJavaServerUsage(
            ScanJavaServerUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScanJavaServerUsageRequest, ScanJavaServerUsageResponse>
                    handler) {
        LOG.trace("Called async scanJavaServerUsage");
        final ScanJavaServerUsageRequest interceptedRequest =
                ScanJavaServerUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScanJavaServerUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ScanJavaServerUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerUsage/ScanJavaServerUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, ScanJavaServerUsageResponse>
                transformer =
                        ScanJavaServerUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ScanJavaServerUsageRequest, ScanJavaServerUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScanJavaServerUsageRequest, ScanJavaServerUsageResponse>,
                        java.util.concurrent.Future<ScanJavaServerUsageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScanJavaServerUsageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScanJavaServerUsageRequest, ScanJavaServerUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ScanLibraryUsageResponse> scanLibraryUsage(
            ScanLibraryUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScanLibraryUsageRequest, ScanLibraryUsageResponse>
                    handler) {
        LOG.trace("Called async scanLibraryUsage");
        final ScanLibraryUsageRequest interceptedRequest =
                ScanLibraryUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ScanLibraryUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "ScanLibraryUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/LibraryUsage/ScanLibraryUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, ScanLibraryUsageResponse>
                transformer =
                        ScanLibraryUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ScanLibraryUsageRequest, ScanLibraryUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ScanLibraryUsageRequest, ScanLibraryUsageResponse>,
                        java.util.concurrent.Future<ScanLibraryUsageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getScanLibraryUsageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ScanLibraryUsageRequest, ScanLibraryUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeApplicationInstallationUsageResponse>
            summarizeApplicationInstallationUsage(
                    SummarizeApplicationInstallationUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeApplicationInstallationUsageRequest,
                                    SummarizeApplicationInstallationUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeApplicationInstallationUsage");
        final SummarizeApplicationInstallationUsageRequest interceptedRequest =
                SummarizeApplicationInstallationUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeApplicationInstallationUsageConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeApplicationInstallationUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ApplicationInstallationUsageSummary/SummarizeApplicationInstallationUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeApplicationInstallationUsageResponse>
                transformer =
                        SummarizeApplicationInstallationUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeApplicationInstallationUsageRequest,
                        SummarizeApplicationInstallationUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeApplicationInstallationUsageRequest,
                                SummarizeApplicationInstallationUsageResponse>,
                        java.util.concurrent.Future<SummarizeApplicationInstallationUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeApplicationInstallationUsageRequest,
                    SummarizeApplicationInstallationUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeApplicationUsageResponse> summarizeApplicationUsage(
            SummarizeApplicationUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeApplicationUsageRequest, SummarizeApplicationUsageResponse>
                    handler) {
        LOG.trace("Called async summarizeApplicationUsage");
        final SummarizeApplicationUsageRequest interceptedRequest =
                SummarizeApplicationUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeApplicationUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeApplicationUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ApplicationUsage/SummarizeApplicationUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeApplicationUsageResponse>
                transformer =
                        SummarizeApplicationUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeApplicationUsageRequest, SummarizeApplicationUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeApplicationUsageRequest,
                                SummarizeApplicationUsageResponse>,
                        java.util.concurrent.Future<SummarizeApplicationUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeApplicationUsageRequest, SummarizeApplicationUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDeployedApplicationInstallationUsageResponse>
            summarizeDeployedApplicationInstallationUsage(
                    SummarizeDeployedApplicationInstallationUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDeployedApplicationInstallationUsageRequest,
                                    SummarizeDeployedApplicationInstallationUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeDeployedApplicationInstallationUsage");
        final SummarizeDeployedApplicationInstallationUsageRequest interceptedRequest =
                SummarizeDeployedApplicationInstallationUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDeployedApplicationInstallationUsageConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeDeployedApplicationInstallationUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DeployedApplicationInstallationUsageSummary/SummarizeDeployedApplicationInstallationUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        SummarizeDeployedApplicationInstallationUsageResponse>
                transformer =
                        SummarizeDeployedApplicationInstallationUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDeployedApplicationInstallationUsageRequest,
                        SummarizeDeployedApplicationInstallationUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDeployedApplicationInstallationUsageRequest,
                                SummarizeDeployedApplicationInstallationUsageResponse>,
                        java.util.concurrent.Future<
                                SummarizeDeployedApplicationInstallationUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDeployedApplicationInstallationUsageRequest,
                    SummarizeDeployedApplicationInstallationUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeDeployedApplicationUsageResponse>
            summarizeDeployedApplicationUsage(
                    SummarizeDeployedApplicationUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDeployedApplicationUsageRequest,
                                    SummarizeDeployedApplicationUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeDeployedApplicationUsage");
        final SummarizeDeployedApplicationUsageRequest interceptedRequest =
                SummarizeDeployedApplicationUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeDeployedApplicationUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeDeployedApplicationUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/DeployedApplicationUsage/SummarizeDeployedApplicationUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeDeployedApplicationUsageResponse>
                transformer =
                        SummarizeDeployedApplicationUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeDeployedApplicationUsageRequest,
                        SummarizeDeployedApplicationUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeDeployedApplicationUsageRequest,
                                SummarizeDeployedApplicationUsageResponse>,
                        java.util.concurrent.Future<SummarizeDeployedApplicationUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeDeployedApplicationUsageRequest,
                    SummarizeDeployedApplicationUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeInstallationUsageResponse>
            summarizeInstallationUsage(
                    SummarizeInstallationUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeInstallationUsageRequest,
                                    SummarizeInstallationUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeInstallationUsage");
        final SummarizeInstallationUsageRequest interceptedRequest =
                SummarizeInstallationUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeInstallationUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeInstallationUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/InstallationUsage/SummarizeInstallationUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeInstallationUsageResponse>
                transformer =
                        SummarizeInstallationUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeInstallationUsageRequest, SummarizeInstallationUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeInstallationUsageRequest,
                                SummarizeInstallationUsageResponse>,
                        java.util.concurrent.Future<SummarizeInstallationUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeInstallationUsageRequest, SummarizeInstallationUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeJavaServerInstanceUsageResponse>
            summarizeJavaServerInstanceUsage(
                    SummarizeJavaServerInstanceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJavaServerInstanceUsageRequest,
                                    SummarizeJavaServerInstanceUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeJavaServerInstanceUsage");
        final SummarizeJavaServerInstanceUsageRequest interceptedRequest =
                SummarizeJavaServerInstanceUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJavaServerInstanceUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeJavaServerInstanceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerInstanceUsage/SummarizeJavaServerInstanceUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeJavaServerInstanceUsageResponse>
                transformer =
                        SummarizeJavaServerInstanceUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeJavaServerInstanceUsageRequest,
                        SummarizeJavaServerInstanceUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeJavaServerInstanceUsageRequest,
                                SummarizeJavaServerInstanceUsageResponse>,
                        java.util.concurrent.Future<SummarizeJavaServerInstanceUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeJavaServerInstanceUsageRequest,
                    SummarizeJavaServerInstanceUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeJavaServerUsageResponse> summarizeJavaServerUsage(
            SummarizeJavaServerUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeJavaServerUsageRequest, SummarizeJavaServerUsageResponse>
                    handler) {
        LOG.trace("Called async summarizeJavaServerUsage");
        final SummarizeJavaServerUsageRequest interceptedRequest =
                SummarizeJavaServerUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJavaServerUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeJavaServerUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JavaServerUsage/SummarizeJavaServerUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeJavaServerUsageResponse>
                transformer =
                        SummarizeJavaServerUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeJavaServerUsageRequest, SummarizeJavaServerUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeJavaServerUsageRequest, SummarizeJavaServerUsageResponse>,
                        java.util.concurrent.Future<SummarizeJavaServerUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeJavaServerUsageRequest, SummarizeJavaServerUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeJreUsageResponse> summarizeJreUsage(
            SummarizeJreUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeJreUsageRequest, SummarizeJreUsageResponse>
                    handler) {
        LOG.trace("Called async summarizeJreUsage");
        final SummarizeJreUsageRequest interceptedRequest =
                SummarizeJreUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJreUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeJreUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/JreUsage/SummarizeJreUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, SummarizeJreUsageResponse>
                transformer =
                        SummarizeJreUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SummarizeJreUsageRequest, SummarizeJreUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeJreUsageRequest, SummarizeJreUsageResponse>,
                        java.util.concurrent.Future<SummarizeJreUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeJreUsageRequest, SummarizeJreUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeLibraryUsageResponse> summarizeLibraryUsage(
            SummarizeLibraryUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeLibraryUsageRequest, SummarizeLibraryUsageResponse>
                    handler) {
        LOG.trace("Called async summarizeLibraryUsage");
        final SummarizeLibraryUsageRequest interceptedRequest =
                SummarizeLibraryUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeLibraryUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeLibraryUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/LibraryUsage/SummarizeLibraryUsage");
        final java.util.function.Function<javax.ws.rs.core.Response, SummarizeLibraryUsageResponse>
                transformer =
                        SummarizeLibraryUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeLibraryUsageRequest, SummarizeLibraryUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeLibraryUsageRequest, SummarizeLibraryUsageResponse>,
                        java.util.concurrent.Future<SummarizeLibraryUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeLibraryUsageRequest, SummarizeLibraryUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedInstanceUsageResponse>
            summarizeManagedInstanceUsage(
                    SummarizeManagedInstanceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedInstanceUsageRequest,
                                    SummarizeManagedInstanceUsageResponse>
                            handler) {
        LOG.trace("Called async summarizeManagedInstanceUsage");
        final SummarizeManagedInstanceUsageRequest interceptedRequest =
                SummarizeManagedInstanceUsageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeManagedInstanceUsageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeManagedInstanceUsage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/ManagedInstanceUsage/SummarizeManagedInstanceUsage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeManagedInstanceUsageResponse>
                transformer =
                        SummarizeManagedInstanceUsageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeManagedInstanceUsageRequest, SummarizeManagedInstanceUsageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeManagedInstanceUsageRequest,
                                SummarizeManagedInstanceUsageResponse>,
                        java.util.concurrent.Future<SummarizeManagedInstanceUsageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeManagedInstanceUsageRequest, SummarizeManagedInstanceUsageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeResourceInventoryResponse>
            summarizeResourceInventory(
                    SummarizeResourceInventoryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeResourceInventoryRequest,
                                    SummarizeResourceInventoryResponse>
                            handler) {
        LOG.trace("Called async summarizeResourceInventory");
        final SummarizeResourceInventoryRequest interceptedRequest =
                SummarizeResourceInventoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeResourceInventoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "SummarizeResourceInventory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/SummarizeResourceInventory");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeResourceInventoryResponse>
                transformer =
                        SummarizeResourceInventoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeResourceInventoryRequest, SummarizeResourceInventoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeResourceInventoryRequest,
                                SummarizeResourceInventoryResponse>,
                        java.util.concurrent.Future<SummarizeResourceInventoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeResourceInventoryRequest, SummarizeResourceInventoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResponse> updateFleet(
            UpdateFleetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFleetRequest, UpdateFleetResponse>
                    handler) {
        LOG.trace("Called async updateFleet");
        final UpdateFleetRequest interceptedRequest =
                UpdateFleetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFleetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "UpdateFleet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/Fleet/UpdateFleet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFleetResponse>
                transformer =
                        UpdateFleetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFleetRequest, UpdateFleetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFleetRequest, UpdateFleetResponse>,
                        java.util.concurrent.Future<UpdateFleetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFleetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFleetRequest, UpdateFleetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetAdvancedFeatureConfigurationResponse>
            updateFleetAdvancedFeatureConfiguration(
                    UpdateFleetAdvancedFeatureConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFleetAdvancedFeatureConfigurationRequest,
                                    UpdateFleetAdvancedFeatureConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateFleetAdvancedFeatureConfiguration");
        final UpdateFleetAdvancedFeatureConfigurationRequest interceptedRequest =
                UpdateFleetAdvancedFeatureConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFleetAdvancedFeatureConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "UpdateFleetAdvancedFeatureConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAdvancedFeatureConfiguration/UpdateFleetAdvancedFeatureConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateFleetAdvancedFeatureConfigurationResponse>
                transformer =
                        UpdateFleetAdvancedFeatureConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFleetAdvancedFeatureConfigurationRequest,
                        UpdateFleetAdvancedFeatureConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFleetAdvancedFeatureConfigurationRequest,
                                UpdateFleetAdvancedFeatureConfigurationResponse>,
                        java.util.concurrent.Future<
                                UpdateFleetAdvancedFeatureConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateFleetAdvancedFeatureConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFleetAdvancedFeatureConfigurationRequest,
                    UpdateFleetAdvancedFeatureConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetAgentConfigurationResponse>
            updateFleetAgentConfiguration(
                    UpdateFleetAgentConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFleetAgentConfigurationRequest,
                                    UpdateFleetAgentConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateFleetAgentConfiguration");
        final UpdateFleetAgentConfigurationRequest interceptedRequest =
                UpdateFleetAgentConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFleetAgentConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "JavaManagementService",
                        "UpdateFleetAgentConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/jms/20210610/FleetAgentConfiguration/UpdateFleetAgentConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateFleetAgentConfigurationResponse>
                transformer =
                        UpdateFleetAgentConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFleetAgentConfigurationRequest, UpdateFleetAgentConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFleetAgentConfigurationRequest,
                                UpdateFleetAgentConfigurationResponse>,
                        java.util.concurrent.Future<UpdateFleetAgentConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFleetAgentConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFleetAgentConfigurationRequest, UpdateFleetAgentConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
