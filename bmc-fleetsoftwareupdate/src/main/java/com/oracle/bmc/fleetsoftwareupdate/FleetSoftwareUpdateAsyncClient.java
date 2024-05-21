/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.fleetsoftwareupdate.internal.http.*;
import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;

/**
 * Async client implementation for FleetSoftwareUpdate service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class FleetSoftwareUpdateAsyncClient implements FleetSoftwareUpdateAsync {
    /**
     * Service instance for FleetSoftwareUpdate.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETSOFTWAREUPDATE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://fleet-software-update.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetSoftwareUpdateAsyncClient.class);

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
    public FleetSoftwareUpdateAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
    public FleetSoftwareUpdateAsyncClient(
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
                            "FleetSoftwareUpdateAsyncClient",
                            "getFsuActionOutputContent,getFsuJobOutputContent"));
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
                    Builder, FleetSoftwareUpdateAsyncClient> {
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
        public FleetSoftwareUpdateAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new FleetSoftwareUpdateAsyncClient(
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
    public java.util.concurrent.Future<AbortFsuDiscoveryResponse> abortFsuDiscovery(
            AbortFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>
                    handler) {
        LOG.trace("Called async abortFsuDiscovery");
        final AbortFsuDiscoveryRequest interceptedRequest =
                AbortFsuDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AbortFsuDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "AbortFsuDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/AbortFsuDiscovery");
        final java.util.function.Function<javax.ws.rs.core.Response, AbortFsuDiscoveryResponse>
                transformer =
                        AbortFsuDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>,
                        java.util.concurrent.Future<AbortFsuDiscoveryResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AbortFsuDiscoveryRequest, AbortFsuDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddFsuCollectionTargetsResponse> addFsuCollectionTargets(
            AddFsuCollectionTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>
                    handler) {
        LOG.trace("Called async addFsuCollectionTargets");
        final AddFsuCollectionTargetsRequest interceptedRequest =
                AddFsuCollectionTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddFsuCollectionTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "AddFsuCollectionTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/AddFsuCollectionTargets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddFsuCollectionTargetsResponse>
                transformer =
                        AddFsuCollectionTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>,
                        java.util.concurrent.Future<AddFsuCollectionTargetsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddFsuCollectionTargetsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddFsuCollectionTargetsRequest, AddFsuCollectionTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelFsuActionResponse> cancelFsuAction(
            CancelFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelFsuActionRequest, CancelFsuActionResponse>
                    handler) {
        LOG.trace("Called async cancelFsuAction");
        final CancelFsuActionRequest interceptedRequest =
                CancelFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "CancelFsuAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/CancelFsuAction");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelFsuActionResponse>
                transformer =
                        CancelFsuActionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CancelFsuActionRequest, CancelFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelFsuActionRequest, CancelFsuActionResponse>,
                        java.util.concurrent.Future<CancelFsuActionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelFsuActionRequest, CancelFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuActionCompartmentResponse>
            changeFsuActionCompartment(
                    ChangeFsuActionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuActionCompartmentRequest,
                                    ChangeFsuActionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFsuActionCompartment");
        final ChangeFsuActionCompartmentRequest interceptedRequest =
                ChangeFsuActionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFsuActionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuActionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/ChangeFsuActionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFsuActionCompartmentResponse>
                transformer =
                        ChangeFsuActionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFsuActionCompartmentRequest, ChangeFsuActionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFsuActionCompartmentRequest,
                                ChangeFsuActionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFsuActionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFsuActionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFsuActionCompartmentRequest, ChangeFsuActionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuCollectionCompartmentResponse>
            changeFsuCollectionCompartment(
                    ChangeFsuCollectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuCollectionCompartmentRequest,
                                    ChangeFsuCollectionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFsuCollectionCompartment");
        final ChangeFsuCollectionCompartmentRequest interceptedRequest =
                ChangeFsuCollectionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFsuCollectionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuCollectionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/ChangeFsuCollectionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFsuCollectionCompartmentResponse>
                transformer =
                        ChangeFsuCollectionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFsuCollectionCompartmentRequest,
                        ChangeFsuCollectionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFsuCollectionCompartmentRequest,
                                ChangeFsuCollectionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFsuCollectionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFsuCollectionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFsuCollectionCompartmentRequest, ChangeFsuCollectionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuCycleCompartmentResponse> changeFsuCycleCompartment(
            ChangeFsuCycleCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeFsuCycleCompartmentRequest, ChangeFsuCycleCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeFsuCycleCompartment");
        final ChangeFsuCycleCompartmentRequest interceptedRequest =
                ChangeFsuCycleCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFsuCycleCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuCycleCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/ChangeFsuCycleCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFsuCycleCompartmentResponse>
                transformer =
                        ChangeFsuCycleCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFsuCycleCompartmentRequest, ChangeFsuCycleCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFsuCycleCompartmentRequest,
                                ChangeFsuCycleCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFsuCycleCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFsuCycleCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFsuCycleCompartmentRequest, ChangeFsuCycleCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeFsuDiscoveryCompartmentResponse>
            changeFsuDiscoveryCompartment(
                    ChangeFsuDiscoveryCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFsuDiscoveryCompartmentRequest,
                                    ChangeFsuDiscoveryCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeFsuDiscoveryCompartment");
        final ChangeFsuDiscoveryCompartmentRequest interceptedRequest =
                ChangeFsuDiscoveryCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeFsuDiscoveryCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ChangeFsuDiscoveryCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/ChangeFsuDiscoveryCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeFsuDiscoveryCompartmentResponse>
                transformer =
                        ChangeFsuDiscoveryCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeFsuDiscoveryCompartmentRequest, ChangeFsuDiscoveryCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeFsuDiscoveryCompartmentRequest,
                                ChangeFsuDiscoveryCompartmentResponse>,
                        java.util.concurrent.Future<ChangeFsuDiscoveryCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeFsuDiscoveryCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeFsuDiscoveryCompartmentRequest, ChangeFsuDiscoveryCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CloneFsuCycleResponse> cloneFsuCycle(
            CloneFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CloneFsuCycleRequest, CloneFsuCycleResponse>
                    handler) {
        LOG.trace("Called async cloneFsuCycle");
        final CloneFsuCycleRequest interceptedRequest =
                CloneFsuCycleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CloneFsuCycleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "CloneFsuCycle",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/CloneFsuCycle");
        final java.util.function.Function<javax.ws.rs.core.Response, CloneFsuCycleResponse>
                transformer =
                        CloneFsuCycleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CloneFsuCycleRequest, CloneFsuCycleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CloneFsuCycleRequest, CloneFsuCycleResponse>,
                        java.util.concurrent.Future<CloneFsuCycleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloneFsuCycleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CloneFsuCycleRequest, CloneFsuCycleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFsuActionResponse> createFsuAction(
            CreateFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuActionRequest, CreateFsuActionResponse>
                    handler) {
        LOG.trace("Called async createFsuAction");
        final CreateFsuActionRequest interceptedRequest =
                CreateFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "CreateFsuAction",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFsuActionResponse>
                transformer =
                        CreateFsuActionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFsuActionRequest, CreateFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFsuActionRequest, CreateFsuActionResponse>,
                        java.util.concurrent.Future<CreateFsuActionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFsuActionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFsuActionRequest, CreateFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFsuCollectionResponse> createFsuCollection(
            CreateFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuCollectionRequest, CreateFsuCollectionResponse>
                    handler) {
        LOG.trace("Called async createFsuCollection");
        final CreateFsuCollectionRequest interceptedRequest =
                CreateFsuCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFsuCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "CreateFsuCollection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFsuCollectionResponse>
                transformer =
                        CreateFsuCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFsuCollectionRequest, CreateFsuCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFsuCollectionRequest, CreateFsuCollectionResponse>,
                        java.util.concurrent.Future<CreateFsuCollectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFsuCollectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFsuCollectionRequest, CreateFsuCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFsuCycleResponse> createFsuCycle(
            CreateFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuCycleRequest, CreateFsuCycleResponse>
                    handler) {
        LOG.trace("Called async createFsuCycle");
        final CreateFsuCycleRequest interceptedRequest =
                CreateFsuCycleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFsuCycleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate", "CreateFsuCycle", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFsuCycleResponse>
                transformer =
                        CreateFsuCycleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFsuCycleRequest, CreateFsuCycleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFsuCycleRequest, CreateFsuCycleResponse>,
                        java.util.concurrent.Future<CreateFsuCycleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFsuCycleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFsuCycleRequest, CreateFsuCycleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFsuDiscoveryResponse> createFsuDiscovery(
            CreateFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>
                    handler) {
        LOG.trace("Called async createFsuDiscovery");
        final CreateFsuDiscoveryRequest interceptedRequest =
                CreateFsuDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFsuDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "CreateFsuDiscovery",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFsuDiscoveryResponse>
                transformer =
                        CreateFsuDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>,
                        java.util.concurrent.Future<CreateFsuDiscoveryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFsuDiscoveryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFsuDiscoveryRequest, CreateFsuDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuActionResponse> deleteFsuAction(
            DeleteFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuActionRequest, DeleteFsuActionResponse>
                    handler) {
        LOG.trace("Called async deleteFsuAction");
        final DeleteFsuActionRequest interceptedRequest =
                DeleteFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/DeleteFsuAction");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFsuActionResponse>
                transformer =
                        DeleteFsuActionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFsuActionRequest, DeleteFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFsuActionRequest, DeleteFsuActionResponse>,
                        java.util.concurrent.Future<DeleteFsuActionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFsuActionRequest, DeleteFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuCollectionResponse> deleteFsuCollection(
            DeleteFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>
                    handler) {
        LOG.trace("Called async deleteFsuCollection");
        final DeleteFsuCollectionRequest interceptedRequest =
                DeleteFsuCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFsuCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/DeleteFsuCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFsuCollectionResponse>
                transformer =
                        DeleteFsuCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>,
                        java.util.concurrent.Future<DeleteFsuCollectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFsuCollectionRequest, DeleteFsuCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuCycleResponse> deleteFsuCycle(
            DeleteFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuCycleRequest, DeleteFsuCycleResponse>
                    handler) {
        LOG.trace("Called async deleteFsuCycle");
        final DeleteFsuCycleRequest interceptedRequest =
                DeleteFsuCycleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFsuCycleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuCycle",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/DeleteFsuCycle");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFsuCycleResponse>
                transformer =
                        DeleteFsuCycleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFsuCycleRequest, DeleteFsuCycleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFsuCycleRequest, DeleteFsuCycleResponse>,
                        java.util.concurrent.Future<DeleteFsuCycleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFsuCycleRequest, DeleteFsuCycleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuDiscoveryResponse> deleteFsuDiscovery(
            DeleteFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>
                    handler) {
        LOG.trace("Called async deleteFsuDiscovery");
        final DeleteFsuDiscoveryRequest interceptedRequest =
                DeleteFsuDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFsuDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/DeleteFsuDiscovery");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFsuDiscoveryResponse>
                transformer =
                        DeleteFsuDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>,
                        java.util.concurrent.Future<DeleteFsuDiscoveryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFsuDiscoveryRequest, DeleteFsuDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFsuJobResponse> deleteFsuJob(
            DeleteFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFsuJobRequest, DeleteFsuJobResponse>
                    handler) {
        LOG.trace("Called async deleteFsuJob");
        final DeleteFsuJobRequest interceptedRequest =
                DeleteFsuJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFsuJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "DeleteFsuJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/DeleteFsuJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFsuJobResponse>
                transformer =
                        DeleteFsuJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFsuJobRequest, DeleteFsuJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFsuJobRequest, DeleteFsuJobResponse>,
                        java.util.concurrent.Future<DeleteFsuJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFsuJobRequest, DeleteFsuJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuActionResponse> getFsuAction(
            GetFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuActionRequest, GetFsuActionResponse>
                    handler) {
        LOG.trace("Called async getFsuAction");
        final GetFsuActionRequest interceptedRequest =
                GetFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/GetFsuAction");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuActionResponse>
                transformer =
                        GetFsuActionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFsuActionRequest, GetFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuActionRequest, GetFsuActionResponse>,
                        java.util.concurrent.Future<GetFsuActionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuActionRequest, GetFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuActionOutputContentResponse> getFsuActionOutputContent(
            GetFsuActionOutputContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuActionOutputContentRequest, GetFsuActionOutputContentResponse>
                    handler) {
        LOG.trace("Called async getFsuActionOutputContent");
        final GetFsuActionOutputContentRequest interceptedRequest =
                GetFsuActionOutputContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuActionOutputContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuActionOutputContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/GetFsuActionOutputContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFsuActionOutputContentResponse>
                transformer =
                        GetFsuActionOutputContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFsuActionOutputContentRequest, GetFsuActionOutputContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuActionOutputContentRequest,
                                GetFsuActionOutputContentResponse>,
                        java.util.concurrent.Future<GetFsuActionOutputContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuActionOutputContentRequest, GetFsuActionOutputContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuCollectionResponse> getFsuCollection(
            GetFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuCollectionRequest, GetFsuCollectionResponse>
                    handler) {
        LOG.trace("Called async getFsuCollection");
        final GetFsuCollectionRequest interceptedRequest =
                GetFsuCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/GetFsuCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuCollectionResponse>
                transformer =
                        GetFsuCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFsuCollectionRequest, GetFsuCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuCollectionRequest, GetFsuCollectionResponse>,
                        java.util.concurrent.Future<GetFsuCollectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuCollectionRequest, GetFsuCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuCycleResponse> getFsuCycle(
            GetFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuCycleRequest, GetFsuCycleResponse>
                    handler) {
        LOG.trace("Called async getFsuCycle");
        final GetFsuCycleRequest interceptedRequest =
                GetFsuCycleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuCycleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuCycle",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/GetFsuCycle");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuCycleResponse>
                transformer =
                        GetFsuCycleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFsuCycleRequest, GetFsuCycleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuCycleRequest, GetFsuCycleResponse>,
                        java.util.concurrent.Future<GetFsuCycleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuCycleRequest, GetFsuCycleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuDiscoveryResponse> getFsuDiscovery(
            GetFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>
                    handler) {
        LOG.trace("Called async getFsuDiscovery");
        final GetFsuDiscoveryRequest interceptedRequest =
                GetFsuDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/GetFsuDiscovery");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuDiscoveryResponse>
                transformer =
                        GetFsuDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>,
                        java.util.concurrent.Future<GetFsuDiscoveryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuDiscoveryRequest, GetFsuDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuJobResponse> getFsuJob(
            GetFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFsuJobRequest, GetFsuJobResponse>
                    handler) {
        LOG.trace("Called async getFsuJob");
        final GetFsuJobRequest interceptedRequest = GetFsuJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/GetFsuJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuJobResponse>
                transformer =
                        GetFsuJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFsuJobRequest, GetFsuJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetFsuJobRequest, GetFsuJobResponse>,
                        java.util.concurrent.Future<GetFsuJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuJobRequest, GetFsuJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFsuJobOutputContentResponse> getFsuJobOutputContent(
            GetFsuJobOutputContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>
                    handler) {
        LOG.trace("Called async getFsuJobOutputContent");
        final GetFsuJobOutputContentRequest interceptedRequest =
                GetFsuJobOutputContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFsuJobOutputContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "GetFsuJobOutputContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/GetFsuJobOutputContent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFsuJobOutputContentResponse>
                transformer =
                        GetFsuJobOutputContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>,
                        java.util.concurrent.Future<GetFsuJobOutputContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFsuJobOutputContentRequest, GetFsuJobOutputContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "FleetSoftwareUpdate",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListFsuActionsResponse> listFsuActions(
            ListFsuActionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuActionsRequest, ListFsuActionsResponse>
                    handler) {
        LOG.trace("Called async listFsuActions");
        final ListFsuActionsRequest interceptedRequest =
                ListFsuActionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuActionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuActions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuActionSummaryCollection/ListFsuActions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuActionsResponse>
                transformer =
                        ListFsuActionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuActionsRequest, ListFsuActionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuActionsRequest, ListFsuActionsResponse>,
                        java.util.concurrent.Future<ListFsuActionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuActionsRequest, ListFsuActionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuCollectionTargetsResponse> listFsuCollectionTargets(
            ListFsuCollectionTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>
                    handler) {
        LOG.trace("Called async listFsuCollectionTargets");
        final ListFsuCollectionTargetsRequest interceptedRequest =
                ListFsuCollectionTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuCollectionTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCollectionTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/TargetSummaryCollection/ListFsuCollectionTargets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFsuCollectionTargetsResponse>
                transformer =
                        ListFsuCollectionTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>,
                        java.util.concurrent.Future<ListFsuCollectionTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuCollectionsResponse> listFsuCollections(
            ListFsuCollectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuCollectionsRequest, ListFsuCollectionsResponse>
                    handler) {
        LOG.trace("Called async listFsuCollections");
        final ListFsuCollectionsRequest interceptedRequest =
                ListFsuCollectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuCollectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCollections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollectionSummaryCollection/ListFsuCollections");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuCollectionsResponse>
                transformer =
                        ListFsuCollectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuCollectionsRequest, ListFsuCollectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuCollectionsRequest, ListFsuCollectionsResponse>,
                        java.util.concurrent.Future<ListFsuCollectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuCollectionsRequest, ListFsuCollectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuCyclesResponse> listFsuCycles(
            ListFsuCyclesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFsuCyclesRequest, ListFsuCyclesResponse>
                    handler) {
        LOG.trace("Called async listFsuCycles");
        final ListFsuCyclesRequest interceptedRequest =
                ListFsuCyclesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuCyclesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuCycles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycleSummary/ListFsuCycles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuCyclesResponse>
                transformer =
                        ListFsuCyclesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuCyclesRequest, ListFsuCyclesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuCyclesRequest, ListFsuCyclesResponse>,
                        java.util.concurrent.Future<ListFsuCyclesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuCyclesRequest, ListFsuCyclesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuDiscoveriesResponse> listFsuDiscoveries(
            ListFsuDiscoveriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>
                    handler) {
        LOG.trace("Called async listFsuDiscoveries");
        final ListFsuDiscoveriesRequest interceptedRequest =
                ListFsuDiscoveriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuDiscoveriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuDiscoveries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscoverySummary/ListFsuDiscoveries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuDiscoveriesResponse>
                transformer =
                        ListFsuDiscoveriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>,
                        java.util.concurrent.Future<ListFsuDiscoveriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuDiscoveryTargetsResponse> listFsuDiscoveryTargets(
            ListFsuDiscoveryTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>
                    handler) {
        LOG.trace("Called async listFsuDiscoveryTargets");
        final ListFsuDiscoveryTargetsRequest interceptedRequest =
                ListFsuDiscoveryTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuDiscoveryTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuDiscoveryTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/TargetSummaryCollection/ListFsuDiscoveryTargets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFsuDiscoveryTargetsResponse>
                transformer =
                        ListFsuDiscoveryTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>,
                        java.util.concurrent.Future<ListFsuDiscoveryTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuJobOutputsResponse> listFsuJobOutputs(
            ListFsuJobOutputsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>
                    handler) {
        LOG.trace("Called async listFsuJobOutputs");
        final ListFsuJobOutputsRequest interceptedRequest =
                ListFsuJobOutputsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuJobOutputsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuJobOutputs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJobOutputSummary/ListFsuJobOutputs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuJobOutputsResponse>
                transformer =
                        ListFsuJobOutputsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>,
                        java.util.concurrent.Future<ListFsuJobOutputsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFsuJobsResponse> listFsuJobs(
            ListFsuJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFsuJobsRequest, ListFsuJobsResponse>
                    handler) {
        LOG.trace("Called async listFsuJobs");
        final ListFsuJobsRequest interceptedRequest =
                ListFsuJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFsuJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ListFsuJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJobSummary/ListFsuJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFsuJobsResponse>
                transformer =
                        ListFsuJobsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFsuJobsRequest, ListFsuJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFsuJobsRequest, ListFsuJobsResponse>,
                        java.util.concurrent.Future<ListFsuJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFsuJobsRequest, ListFsuJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "FleetSoftwareUpdate",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequestError/ListWorkRequestErrors");
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
                        "FleetSoftwareUpdate",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "FleetSoftwareUpdate",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RemoveFsuCollectionTargetsResponse>
            removeFsuCollectionTargets(
                    RemoveFsuCollectionTargetsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveFsuCollectionTargetsRequest,
                                    RemoveFsuCollectionTargetsResponse>
                            handler) {
        LOG.trace("Called async removeFsuCollectionTargets");
        final RemoveFsuCollectionTargetsRequest interceptedRequest =
                RemoveFsuCollectionTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveFsuCollectionTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "RemoveFsuCollectionTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/RemoveFsuCollectionTargets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveFsuCollectionTargetsResponse>
                transformer =
                        RemoveFsuCollectionTargetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveFsuCollectionTargetsRequest, RemoveFsuCollectionTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveFsuCollectionTargetsRequest,
                                RemoveFsuCollectionTargetsResponse>,
                        java.util.concurrent.Future<RemoveFsuCollectionTargetsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveFsuCollectionTargetsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveFsuCollectionTargetsRequest, RemoveFsuCollectionTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResumeFsuActionResponse> resumeFsuAction(
            ResumeFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeFsuActionRequest, ResumeFsuActionResponse>
                    handler) {
        LOG.trace("Called async resumeFsuAction");
        final ResumeFsuActionRequest interceptedRequest =
                ResumeFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "ResumeFsuAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/ResumeFsuAction");
        final java.util.function.Function<javax.ws.rs.core.Response, ResumeFsuActionResponse>
                transformer =
                        ResumeFsuActionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResumeFsuActionRequest, ResumeFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResumeFsuActionRequest, ResumeFsuActionResponse>,
                        java.util.concurrent.Future<ResumeFsuActionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResumeFsuActionRequest, ResumeFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RetryFsuJobResponse> retryFsuJob(
            RetryFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RetryFsuJobRequest, RetryFsuJobResponse>
                    handler) {
        LOG.trace("Called async retryFsuJob");
        final RetryFsuJobRequest interceptedRequest =
                RetryFsuJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RetryFsuJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "RetryFsuJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/RetryFsuJob");
        final java.util.function.Function<javax.ws.rs.core.Response, RetryFsuJobResponse>
                transformer =
                        RetryFsuJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RetryFsuJobRequest, RetryFsuJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RetryFsuJobRequest, RetryFsuJobResponse>,
                        java.util.concurrent.Future<RetryFsuJobResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RetryFsuJobRequest, RetryFsuJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuActionResponse> updateFsuAction(
            UpdateFsuActionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuActionRequest, UpdateFsuActionResponse>
                    handler) {
        LOG.trace("Called async updateFsuAction");
        final UpdateFsuActionRequest interceptedRequest =
                UpdateFsuActionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFsuActionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuAction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuAction/UpdateFsuAction");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFsuActionResponse>
                transformer =
                        UpdateFsuActionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFsuActionRequest, UpdateFsuActionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFsuActionRequest, UpdateFsuActionResponse>,
                        java.util.concurrent.Future<UpdateFsuActionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFsuActionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFsuActionRequest, UpdateFsuActionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuCollectionResponse> updateFsuCollection(
            UpdateFsuCollectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>
                    handler) {
        LOG.trace("Called async updateFsuCollection");
        final UpdateFsuCollectionRequest interceptedRequest =
                UpdateFsuCollectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFsuCollectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuCollection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCollection/UpdateFsuCollection");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFsuCollectionResponse>
                transformer =
                        UpdateFsuCollectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>,
                        java.util.concurrent.Future<UpdateFsuCollectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFsuCollectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFsuCollectionRequest, UpdateFsuCollectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuCycleResponse> updateFsuCycle(
            UpdateFsuCycleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuCycleRequest, UpdateFsuCycleResponse>
                    handler) {
        LOG.trace("Called async updateFsuCycle");
        final UpdateFsuCycleRequest interceptedRequest =
                UpdateFsuCycleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFsuCycleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuCycle",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuCycle/UpdateFsuCycle");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFsuCycleResponse>
                transformer =
                        UpdateFsuCycleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFsuCycleRequest, UpdateFsuCycleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFsuCycleRequest, UpdateFsuCycleResponse>,
                        java.util.concurrent.Future<UpdateFsuCycleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFsuCycleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFsuCycleRequest, UpdateFsuCycleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuDiscoveryResponse> updateFsuDiscovery(
            UpdateFsuDiscoveryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>
                    handler) {
        LOG.trace("Called async updateFsuDiscovery");
        final UpdateFsuDiscoveryRequest interceptedRequest =
                UpdateFsuDiscoveryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFsuDiscoveryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuDiscovery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuDiscovery/UpdateFsuDiscovery");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFsuDiscoveryResponse>
                transformer =
                        UpdateFsuDiscoveryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>,
                        java.util.concurrent.Future<UpdateFsuDiscoveryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFsuDiscoveryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFsuDiscoveryRequest, UpdateFsuDiscoveryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFsuJobResponse> updateFsuJob(
            UpdateFsuJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFsuJobRequest, UpdateFsuJobResponse>
                    handler) {
        LOG.trace("Called async updateFsuJob");
        final UpdateFsuJobRequest interceptedRequest =
                UpdateFsuJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFsuJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "FleetSoftwareUpdate",
                        "UpdateFsuJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/edsfu/20220528/FsuJob/UpdateFsuJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFsuJobResponse>
                transformer =
                        UpdateFsuJobConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFsuJobRequest, UpdateFsuJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFsuJobRequest, UpdateFsuJobResponse>,
                        java.util.concurrent.Future<UpdateFsuJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFsuJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFsuJobRequest, UpdateFsuJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
