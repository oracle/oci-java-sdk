/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.internal.http.*;
import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

/**
 * Async client implementation for MarketplacePublisher service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class MarketplacePublisherAsyncClient implements MarketplacePublisherAsync {
    /**
     * Service instance for MarketplacePublisher.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MARKETPLACEPUBLISHER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://marketplace-publisher.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplacePublisherAsyncClient.class);

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
    public MarketplacePublisherAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
    public MarketplacePublisherAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, MarketplacePublisherAsyncClient> {
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
        public MarketplacePublisherAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new MarketplacePublisherAsyncClient(
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
    public java.util.concurrent.Future<ActivateTermVersionResponse> activateTermVersion(
            ActivateTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateTermVersionRequest, ActivateTermVersionResponse>
                    handler) {
        LOG.trace("Called async activateTermVersion");
        final ActivateTermVersionRequest interceptedRequest =
                ActivateTermVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateTermVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ActivateTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/ActivateTermVersion");
        final java.util.function.Function<javax.ws.rs.core.Response, ActivateTermVersionResponse>
                transformer =
                        ActivateTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ActivateTermVersionRequest, ActivateTermVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateTermVersionRequest, ActivateTermVersionResponse>,
                        java.util.concurrent.Future<ActivateTermVersionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateTermVersionRequest, ActivateTermVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "MarketplacePublisher",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/CancelWorkRequest");
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
    public java.util.concurrent.Future<CascadingDeleteListingResponse> cascadingDeleteListing(
            CascadingDeleteListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CascadingDeleteListingRequest, CascadingDeleteListingResponse>
                    handler) {
        LOG.trace("Called async cascadingDeleteListing");
        final CascadingDeleteListingRequest interceptedRequest =
                CascadingDeleteListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadingDeleteListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/CascadingDeleteListing");
        final java.util.function.Function<javax.ws.rs.core.Response, CascadingDeleteListingResponse>
                transformer =
                        CascadingDeleteListingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CascadingDeleteListingRequest, CascadingDeleteListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CascadingDeleteListingRequest, CascadingDeleteListingResponse>,
                        java.util.concurrent.Future<CascadingDeleteListingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CascadingDeleteListingRequest, CascadingDeleteListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CascadingDeleteListingRevisionResponse>
            cascadingDeleteListingRevision(
                    CascadingDeleteListingRevisionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteListingRevisionRequest,
                                    CascadingDeleteListingRevisionResponse>
                            handler) {
        LOG.trace("Called async cascadingDeleteListingRevision");
        final CascadingDeleteListingRevisionRequest interceptedRequest =
                CascadingDeleteListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadingDeleteListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CascadingDeleteListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CascadingDeleteListingRevision");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CascadingDeleteListingRevisionResponse>
                transformer =
                        CascadingDeleteListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CascadingDeleteListingRevisionRequest,
                        CascadingDeleteListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CascadingDeleteListingRevisionRequest,
                                CascadingDeleteListingRevisionResponse>,
                        java.util.concurrent.Future<CascadingDeleteListingRevisionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CascadingDeleteListingRevisionRequest, CascadingDeleteListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeArtifactCompartmentResponse> changeArtifactCompartment(
            ChangeArtifactCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeArtifactCompartmentRequest, ChangeArtifactCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeArtifactCompartment");
        final ChangeArtifactCompartmentRequest interceptedRequest =
                ChangeArtifactCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeArtifactCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeArtifactCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/ChangeArtifactCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeArtifactCompartmentResponse>
                transformer =
                        ChangeArtifactCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeArtifactCompartmentRequest, ChangeArtifactCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeArtifactCompartmentRequest,
                                ChangeArtifactCompartmentResponse>,
                        java.util.concurrent.Future<ChangeArtifactCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeArtifactCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeArtifactCompartmentRequest, ChangeArtifactCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeListingCompartmentResponse> changeListingCompartment(
            ChangeListingCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeListingCompartmentRequest, ChangeListingCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeListingCompartment");
        final ChangeListingCompartmentRequest interceptedRequest =
                ChangeListingCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeListingCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeListingCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/ChangeListingCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeListingCompartmentResponse>
                transformer =
                        ChangeListingCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeListingCompartmentRequest, ChangeListingCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeListingCompartmentRequest, ChangeListingCompartmentResponse>,
                        java.util.concurrent.Future<ChangeListingCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeListingCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeListingCompartmentRequest, ChangeListingCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeListingRevisionToNewStatusResponse>
            changeListingRevisionToNewStatus(
                    ChangeListingRevisionToNewStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeListingRevisionToNewStatusRequest,
                                    ChangeListingRevisionToNewStatusResponse>
                            handler) {
        LOG.trace("Called async changeListingRevisionToNewStatus");
        final ChangeListingRevisionToNewStatusRequest interceptedRequest =
                ChangeListingRevisionToNewStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeListingRevisionToNewStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeListingRevisionToNewStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/ChangeListingRevisionToNewStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeListingRevisionToNewStatusResponse>
                transformer =
                        ChangeListingRevisionToNewStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeListingRevisionToNewStatusRequest,
                        ChangeListingRevisionToNewStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeListingRevisionToNewStatusRequest,
                                ChangeListingRevisionToNewStatusResponse>,
                        java.util.concurrent.Future<ChangeListingRevisionToNewStatusResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeListingRevisionToNewStatusRequest,
                    ChangeListingRevisionToNewStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeTermCompartmentResponse> changeTermCompartment(
            ChangeTermCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTermCompartmentRequest, ChangeTermCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeTermCompartment");
        final ChangeTermCompartmentRequest interceptedRequest =
                ChangeTermCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTermCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ChangeTermCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/ChangeTermCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeTermCompartmentResponse>
                transformer =
                        ChangeTermCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeTermCompartmentRequest, ChangeTermCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeTermCompartmentRequest, ChangeTermCompartmentResponse>,
                        java.util.concurrent.Future<ChangeTermCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeTermCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeTermCompartmentRequest, ChangeTermCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CloneListingRevisionResponse> cloneListingRevision(
            CloneListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CloneListingRevisionRequest, CloneListingRevisionResponse>
                    handler) {
        LOG.trace("Called async cloneListingRevision");
        final CloneListingRevisionRequest interceptedRequest =
                CloneListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CloneListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CloneListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CloneListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, CloneListingRevisionResponse>
                transformer =
                        CloneListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CloneListingRevisionRequest, CloneListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CloneListingRevisionRequest, CloneListingRevisionResponse>,
                        java.util.concurrent.Future<CloneListingRevisionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CloneListingRevisionRequest, CloneListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateArtifactResponse> createArtifact(
            CreateArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateArtifactRequest, CreateArtifactResponse>
                    handler) {
        LOG.trace("Called async createArtifact");
        final CreateArtifactRequest interceptedRequest =
                CreateArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/CreateArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateArtifactResponse>
                transformer =
                        CreateArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateArtifactRequest, CreateArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateArtifactRequest, CreateArtifactResponse>,
                        java.util.concurrent.Future<CreateArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateArtifactRequest, CreateArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListingResponse> createListing(
            CreateListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateListingRequest, CreateListingResponse>
                    handler) {
        LOG.trace("Called async createListing");
        final CreateListingRequest interceptedRequest =
                CreateListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/CreateListing");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateListingResponse>
                transformer =
                        CreateListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateListingRequest, CreateListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListingRequest, CreateListingResponse>,
                        java.util.concurrent.Future<CreateListingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListingRequest, CreateListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListingRevisionResponse> createListingRevision(
            CreateListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateListingRevisionRequest, CreateListingRevisionResponse>
                    handler) {
        LOG.trace("Called async createListingRevision");
        final CreateListingRevisionRequest interceptedRequest =
                CreateListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/CreateListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateListingRevisionResponse>
                transformer =
                        CreateListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateListingRevisionRequest, CreateListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListingRevisionRequest, CreateListingRevisionResponse>,
                        java.util.concurrent.Future<CreateListingRevisionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListingRevisionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListingRevisionRequest, CreateListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListingRevisionAttachmentResponse>
            createListingRevisionAttachment(
                    CreateListingRevisionAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateListingRevisionAttachmentRequest,
                                    CreateListingRevisionAttachmentResponse>
                            handler) {
        LOG.trace("Called async createListingRevisionAttachment");
        final CreateListingRevisionAttachmentRequest interceptedRequest =
                CreateListingRevisionAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/CreateListingRevisionAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateListingRevisionAttachmentResponse>
                transformer =
                        CreateListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateListingRevisionAttachmentRequest,
                        CreateListingRevisionAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListingRevisionAttachmentRequest,
                                CreateListingRevisionAttachmentResponse>,
                        java.util.concurrent.Future<CreateListingRevisionAttachmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListingRevisionAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListingRevisionAttachmentRequest,
                    CreateListingRevisionAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListingRevisionNoteResponse> createListingRevisionNote(
            CreateListingRevisionNoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateListingRevisionNoteRequest, CreateListingRevisionNoteResponse>
                    handler) {
        LOG.trace("Called async createListingRevisionNote");
        final CreateListingRevisionNoteRequest interceptedRequest =
                CreateListingRevisionNoteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionNoteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/CreateListingRevisionNote");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateListingRevisionNoteResponse>
                transformer =
                        CreateListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateListingRevisionNoteRequest, CreateListingRevisionNoteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListingRevisionNoteRequest,
                                CreateListingRevisionNoteResponse>,
                        java.util.concurrent.Future<CreateListingRevisionNoteResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListingRevisionNoteDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListingRevisionNoteRequest, CreateListingRevisionNoteResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateListingRevisionPackageResponse>
            createListingRevisionPackage(
                    CreateListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateListingRevisionPackageRequest,
                                    CreateListingRevisionPackageResponse>
                            handler) {
        LOG.trace("Called async createListingRevisionPackage");
        final CreateListingRevisionPackageRequest interceptedRequest =
                CreateListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/CreateListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateListingRevisionPackageResponse>
                transformer =
                        CreateListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateListingRevisionPackageRequest, CreateListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateListingRevisionPackageRequest,
                                CreateListingRevisionPackageResponse>,
                        java.util.concurrent.Future<CreateListingRevisionPackageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateListingRevisionPackageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateListingRevisionPackageRequest, CreateListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/CreateTerm");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTermResponse>
                transformer =
                        CreateTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<CreateTermVersionResponse> createTermVersion(
            CreateTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTermVersionRequest, CreateTermVersionResponse>
                    handler) {
        LOG.trace("Called async createTermVersion");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, CreateTermVersionRequest.builder());
        }
        final CreateTermVersionRequest interceptedRequest =
                CreateTermVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTermVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "CreateTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/CreateTermVersion");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTermVersionResponse>
                transformer =
                        CreateTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTermVersionRequest, CreateTermVersionResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTermVersionRequest, CreateTermVersionResponse>,
                        java.util.concurrent.Future<CreateTermVersionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTermVersionContent(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTermVersionRequest, CreateTermVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getCreateTermVersionContent(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteArtifactResponse> deleteArtifact(
            DeleteArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteArtifactRequest, DeleteArtifactResponse>
                    handler) {
        LOG.trace("Called async deleteArtifact");
        final DeleteArtifactRequest interceptedRequest =
                DeleteArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/DeleteArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteArtifactResponse>
                transformer =
                        DeleteArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteArtifactRequest, DeleteArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteArtifactRequest, DeleteArtifactResponse>,
                        java.util.concurrent.Future<DeleteArtifactResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteArtifactRequest, DeleteArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListingResponse> deleteListing(
            DeleteListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteListingRequest, DeleteListingResponse>
                    handler) {
        LOG.trace("Called async deleteListing");
        final DeleteListingRequest interceptedRequest =
                DeleteListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/DeleteListing");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteListingResponse>
                transformer =
                        DeleteListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteListingRequest, DeleteListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListingRequest, DeleteListingResponse>,
                        java.util.concurrent.Future<DeleteListingResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListingRequest, DeleteListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListingRevisionResponse> deleteListingRevision(
            DeleteListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteListingRevisionRequest, DeleteListingRevisionResponse>
                    handler) {
        LOG.trace("Called async deleteListingRevision");
        final DeleteListingRevisionRequest interceptedRequest =
                DeleteListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/DeleteListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteListingRevisionResponse>
                transformer =
                        DeleteListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteListingRevisionRequest, DeleteListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListingRevisionRequest, DeleteListingRevisionResponse>,
                        java.util.concurrent.Future<DeleteListingRevisionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListingRevisionRequest, DeleteListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListingRevisionAttachmentResponse>
            deleteListingRevisionAttachment(
                    DeleteListingRevisionAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteListingRevisionAttachmentRequest,
                                    DeleteListingRevisionAttachmentResponse>
                            handler) {
        LOG.trace("Called async deleteListingRevisionAttachment");
        final DeleteListingRevisionAttachmentRequest interceptedRequest =
                DeleteListingRevisionAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/DeleteListingRevisionAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteListingRevisionAttachmentResponse>
                transformer =
                        DeleteListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteListingRevisionAttachmentRequest,
                        DeleteListingRevisionAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListingRevisionAttachmentRequest,
                                DeleteListingRevisionAttachmentResponse>,
                        java.util.concurrent.Future<DeleteListingRevisionAttachmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListingRevisionAttachmentRequest,
                    DeleteListingRevisionAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListingRevisionNoteResponse> deleteListingRevisionNote(
            DeleteListingRevisionNoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteListingRevisionNoteRequest, DeleteListingRevisionNoteResponse>
                    handler) {
        LOG.trace("Called async deleteListingRevisionNote");
        final DeleteListingRevisionNoteRequest interceptedRequest =
                DeleteListingRevisionNoteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionNoteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/DeleteListingRevisionNote");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteListingRevisionNoteResponse>
                transformer =
                        DeleteListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteListingRevisionNoteRequest, DeleteListingRevisionNoteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListingRevisionNoteRequest,
                                DeleteListingRevisionNoteResponse>,
                        java.util.concurrent.Future<DeleteListingRevisionNoteResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListingRevisionNoteRequest, DeleteListingRevisionNoteResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteListingRevisionPackageResponse>
            deleteListingRevisionPackage(
                    DeleteListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteListingRevisionPackageRequest,
                                    DeleteListingRevisionPackageResponse>
                            handler) {
        LOG.trace("Called async deleteListingRevisionPackage");
        final DeleteListingRevisionPackageRequest interceptedRequest =
                DeleteListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/DeleteListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteListingRevisionPackageResponse>
                transformer =
                        DeleteListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteListingRevisionPackageRequest, DeleteListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteListingRevisionPackageRequest,
                                DeleteListingRevisionPackageResponse>,
                        java.util.concurrent.Future<DeleteListingRevisionPackageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteListingRevisionPackageRequest, DeleteListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/DeleteTerm");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTermResponse>
                transformer =
                        DeleteTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<DeleteTermVersionResponse> deleteTermVersion(
            DeleteTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTermVersionRequest, DeleteTermVersionResponse>
                    handler) {
        LOG.trace("Called async deleteTermVersion");
        final DeleteTermVersionRequest interceptedRequest =
                DeleteTermVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTermVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "DeleteTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/DeleteTermVersion");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTermVersionResponse>
                transformer =
                        DeleteTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTermVersionRequest, DeleteTermVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTermVersionRequest, DeleteTermVersionResponse>,
                        java.util.concurrent.Future<DeleteTermVersionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTermVersionRequest, DeleteTermVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetArtifactResponse> getArtifact(
            GetArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetArtifactRequest, GetArtifactResponse>
                    handler) {
        LOG.trace("Called async getArtifact");
        final GetArtifactRequest interceptedRequest =
                GetArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/GetArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, GetArtifactResponse>
                transformer =
                        GetArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetArtifactRequest, GetArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetArtifactRequest, GetArtifactResponse>,
                        java.util.concurrent.Future<GetArtifactResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetArtifactRequest, GetArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetCategory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Category/GetCategory");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCategoryResponse>
                transformer =
                        GetCategoryConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetListingResponse> getListing(
            GetListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetListingRequest, GetListingResponse>
                    handler) {
        LOG.trace("Called async getListing");
        final GetListingRequest interceptedRequest = GetListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/GetListing");
        final java.util.function.Function<javax.ws.rs.core.Response, GetListingResponse>
                transformer =
                        GetListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetListingRequest, GetListingResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListingRequest, GetListingResponse>,
                        java.util.concurrent.Future<GetListingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListingRequest, GetListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetListingRevisionResponse> getListingRevision(
            GetListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionRequest, GetListingRevisionResponse>
                    handler) {
        LOG.trace("Called async getListingRevision");
        final GetListingRevisionRequest interceptedRequest =
                GetListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/GetListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionResponse>
                transformer =
                        GetListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetListingRevisionRequest, GetListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListingRevisionRequest, GetListingRevisionResponse>,
                        java.util.concurrent.Future<GetListingRevisionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListingRevisionRequest, GetListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetListingRevisionAttachmentResponse>
            getListingRevisionAttachment(
                    GetListingRevisionAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetListingRevisionAttachmentRequest,
                                    GetListingRevisionAttachmentResponse>
                            handler) {
        LOG.trace("Called async getListingRevisionAttachment");
        final GetListingRevisionAttachmentRequest interceptedRequest =
                GetListingRevisionAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/GetListingRevisionAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetListingRevisionAttachmentResponse>
                transformer =
                        GetListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetListingRevisionAttachmentRequest, GetListingRevisionAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListingRevisionAttachmentRequest,
                                GetListingRevisionAttachmentResponse>,
                        java.util.concurrent.Future<GetListingRevisionAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListingRevisionAttachmentRequest, GetListingRevisionAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetListingRevisionNoteResponse> getListingRevisionNote(
            GetListingRevisionNoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionNoteRequest, GetListingRevisionNoteResponse>
                    handler) {
        LOG.trace("Called async getListingRevisionNote");
        final GetListingRevisionNoteRequest interceptedRequest =
                GetListingRevisionNoteConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionNoteConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionNote",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNote/GetListingRevisionNote");
        final java.util.function.Function<javax.ws.rs.core.Response, GetListingRevisionNoteResponse>
                transformer =
                        GetListingRevisionNoteConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetListingRevisionNoteRequest, GetListingRevisionNoteResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListingRevisionNoteRequest, GetListingRevisionNoteResponse>,
                        java.util.concurrent.Future<GetListingRevisionNoteResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListingRevisionNoteRequest, GetListingRevisionNoteResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetListingRevisionPackageResponse> getListingRevisionPackage(
            GetListingRevisionPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionPackageRequest, GetListingRevisionPackageResponse>
                    handler) {
        LOG.trace("Called async getListingRevisionPackage");
        final GetListingRevisionPackageRequest interceptedRequest =
                GetListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/GetListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetListingRevisionPackageResponse>
                transformer =
                        GetListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetListingRevisionPackageRequest, GetListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetListingRevisionPackageRequest,
                                GetListingRevisionPackageResponse>,
                        java.util.concurrent.Future<GetListingRevisionPackageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetListingRevisionPackageRequest, GetListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMarketResponse> getMarket(
            GetMarketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMarketRequest, GetMarketResponse>
                    handler) {
        LOG.trace("Called async getMarket");
        final GetMarketRequest interceptedRequest = GetMarketConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMarketConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetMarket",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Market/GetMarket");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMarketResponse>
                transformer =
                        GetMarketConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMarketRequest, GetMarketResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetMarketRequest, GetMarketResponse>,
                        java.util.concurrent.Future<GetMarketResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMarketRequest, GetMarketResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProductResponse> getProduct(
            GetProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProductRequest, GetProductResponse>
                    handler) {
        LOG.trace("Called async getProduct");
        final GetProductRequest interceptedRequest = GetProductConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProductConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetProduct",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Product/GetProduct");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProductResponse>
                transformer =
                        GetProductConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProductRequest, GetProductResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProductRequest, GetProductResponse>,
                        java.util.concurrent.Future<GetProductResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProductRequest, GetProductResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublisherResponse> getPublisher(
            GetPublisherRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPublisherRequest, GetPublisherResponse>
                    handler) {
        LOG.trace("Called async getPublisher");
        final GetPublisherRequest interceptedRequest =
                GetPublisherConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublisherConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetPublisher",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Publisher/GetPublisher");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPublisherResponse>
                transformer =
                        GetPublisherConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPublisherRequest, GetPublisherResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublisherRequest, GetPublisherResponse>,
                        java.util.concurrent.Future<GetPublisherResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublisherRequest, GetPublisherResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/GetTerm");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTermResponse> transformer =
                GetTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<GetTermVersionResponse> getTermVersion(
            GetTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTermVersionRequest, GetTermVersionResponse>
                    handler) {
        LOG.trace("Called async getTermVersion");
        final GetTermVersionRequest interceptedRequest =
                GetTermVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTermVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "GetTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/GetTermVersion");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTermVersionResponse>
                transformer =
                        GetTermVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTermVersionRequest, GetTermVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTermVersionRequest, GetTermVersionResponse>,
                        java.util.concurrent.Future<GetTermVersionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTermVersionRequest, GetTermVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "MarketplacePublisher",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListArtifactsResponse> listArtifacts(
            ListArtifactsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse>
                    handler) {
        LOG.trace("Called async listArtifacts");
        final ListArtifactsRequest interceptedRequest =
                ListArtifactsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListArtifactsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListArtifacts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ArtifactCollection/ListArtifacts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListArtifactsResponse>
                transformer =
                        ListArtifactsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListArtifactsRequest, ListArtifactsResponse>,
                        java.util.concurrent.Future<ListArtifactsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListArtifactsRequest, ListArtifactsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListCategories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/CategoryCollection/ListCategories");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCategoriesResponse>
                transformer =
                        ListCategoriesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<ListListingRevisionAttachmentsResponse>
            listListingRevisionAttachments(
                    ListListingRevisionAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListListingRevisionAttachmentsRequest,
                                    ListListingRevisionAttachmentsResponse>
                            handler) {
        LOG.trace("Called async listListingRevisionAttachments");
        final ListListingRevisionAttachmentsRequest interceptedRequest =
                ListListingRevisionAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachmentCollection/ListListingRevisionAttachments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListListingRevisionAttachmentsResponse>
                transformer =
                        ListListingRevisionAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListListingRevisionAttachmentsRequest,
                        ListListingRevisionAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListingRevisionAttachmentsRequest,
                                ListListingRevisionAttachmentsResponse>,
                        java.util.concurrent.Future<ListListingRevisionAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListingRevisionAttachmentsRequest, ListListingRevisionAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListListingRevisionNotesResponse> listListingRevisionNotes(
            ListListingRevisionNotesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>
                    handler) {
        LOG.trace("Called async listListingRevisionNotes");
        final ListListingRevisionNotesRequest interceptedRequest =
                ListListingRevisionNotesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionNotesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionNotes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionNoteCollection/ListListingRevisionNotes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListListingRevisionNotesResponse>
                transformer =
                        ListListingRevisionNotesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>,
                        java.util.concurrent.Future<ListListingRevisionNotesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListListingRevisionPackagesResponse>
            listListingRevisionPackages(
                    ListListingRevisionPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListListingRevisionPackagesRequest,
                                    ListListingRevisionPackagesResponse>
                            handler) {
        LOG.trace("Called async listListingRevisionPackages");
        final ListListingRevisionPackagesRequest interceptedRequest =
                ListListingRevisionPackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionPackagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisionPackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackageCollection/ListListingRevisionPackages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListListingRevisionPackagesResponse>
                transformer =
                        ListListingRevisionPackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListListingRevisionPackagesRequest, ListListingRevisionPackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListingRevisionPackagesRequest,
                                ListListingRevisionPackagesResponse>,
                        java.util.concurrent.Future<ListListingRevisionPackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListingRevisionPackagesRequest, ListListingRevisionPackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListListingRevisionsResponse> listListingRevisions(
            ListListingRevisionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListListingRevisionsRequest, ListListingRevisionsResponse>
                    handler) {
        LOG.trace("Called async listListingRevisions");
        final ListListingRevisionsRequest interceptedRequest =
                ListListingRevisionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingRevisionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListingRevisions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionCollection/ListListingRevisions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListListingRevisionsResponse>
                transformer =
                        ListListingRevisionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListListingRevisionsRequest, ListListingRevisionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListingRevisionsRequest, ListListingRevisionsResponse>,
                        java.util.concurrent.Future<ListListingRevisionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListingRevisionsRequest, ListListingRevisionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListListingsResponse> listListings(
            ListListingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListListingsRequest, ListListingsResponse>
                    handler) {
        LOG.trace("Called async listListings");
        final ListListingsRequest interceptedRequest =
                ListListingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListListingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListListings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingCollection/ListListings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListListingsResponse>
                transformer =
                        ListListingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListListingsRequest, ListListingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListListingsRequest, ListListingsResponse>,
                        java.util.concurrent.Future<ListListingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListListingsRequest, ListListingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMarketsResponse> listMarkets(
            ListMarketsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMarketsRequest, ListMarketsResponse>
                    handler) {
        LOG.trace("Called async listMarkets");
        final ListMarketsRequest interceptedRequest =
                ListMarketsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMarketsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListMarkets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/MarketCollection/ListMarkets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMarketsResponse>
                transformer =
                        ListMarketsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMarketsRequest, ListMarketsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMarketsRequest, ListMarketsResponse>,
                        java.util.concurrent.Future<ListMarketsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMarketsRequest, ListMarketsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProductsResponse> listProducts(
            ListProductsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProductsRequest, ListProductsResponse>
                    handler) {
        LOG.trace("Called async listProducts");
        final ListProductsRequest interceptedRequest =
                ListProductsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProductsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListProducts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ProductCollection/ListProducts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProductsResponse>
                transformer =
                        ListProductsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProductsRequest, ListProductsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProductsRequest, ListProductsResponse>,
                        java.util.concurrent.Future<ListProductsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProductsRequest, ListProductsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPublishersResponse> listPublishers(
            ListPublishersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublishersRequest, ListPublishersResponse>
                    handler) {
        LOG.trace("Called async listPublishers");
        final ListPublishersRequest interceptedRequest =
                ListPublishersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublishersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListPublishers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/PublisherCollection/ListPublishers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPublishersResponse>
                transformer =
                        ListPublishersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPublishersRequest, ListPublishersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPublishersRequest, ListPublishersResponse>,
                        java.util.concurrent.Future<ListPublishersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPublishersRequest, ListPublishersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTermVersionsResponse> listTermVersions(
            ListTermVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTermVersionsRequest, ListTermVersionsResponse>
                    handler) {
        LOG.trace("Called async listTermVersions");
        final ListTermVersionsRequest interceptedRequest =
                ListTermVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTermVersionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListTermVersions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersionCollection/ListTermVersions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTermVersionsResponse>
                transformer =
                        ListTermVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTermVersionsRequest, ListTermVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTermVersionsRequest, ListTermVersionsResponse>,
                        java.util.concurrent.Future<ListTermVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTermVersionsRequest, ListTermVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ListTerms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermCollection/ListTerms");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTermsResponse>
                transformer =
                        ListTermsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        "MarketplacePublisher",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequestError/ListWorkRequestErrors");
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
                        "MarketplacePublisher",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "MarketplacePublisher",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<MarkListingRevisionPackageAsDefaultResponse>
            markListingRevisionPackageAsDefault(
                    MarkListingRevisionPackageAsDefaultRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MarkListingRevisionPackageAsDefaultRequest,
                                    MarkListingRevisionPackageAsDefaultResponse>
                            handler) {
        LOG.trace("Called async markListingRevisionPackageAsDefault");
        final MarkListingRevisionPackageAsDefaultRequest interceptedRequest =
                MarkListingRevisionPackageAsDefaultConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MarkListingRevisionPackageAsDefaultConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "MarkListingRevisionPackageAsDefault",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/MarkListingRevisionPackageAsDefault");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, MarkListingRevisionPackageAsDefaultResponse>
                transformer =
                        MarkListingRevisionPackageAsDefaultConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        MarkListingRevisionPackageAsDefaultRequest,
                        MarkListingRevisionPackageAsDefaultResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MarkListingRevisionPackageAsDefaultRequest,
                                MarkListingRevisionPackageAsDefaultResponse>,
                        java.util.concurrent.Future<MarkListingRevisionPackageAsDefaultResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MarkListingRevisionPackageAsDefaultRequest,
                    MarkListingRevisionPackageAsDefaultResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishListingRevisionResponse> publishListingRevision(
            PublishListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishListingRevisionRequest, PublishListingRevisionResponse>
                    handler) {
        LOG.trace("Called async publishListingRevision");
        final PublishListingRevisionRequest interceptedRequest =
                PublishListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/PublishListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, PublishListingRevisionResponse>
                transformer =
                        PublishListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PublishListingRevisionRequest, PublishListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishListingRevisionRequest, PublishListingRevisionResponse>,
                        java.util.concurrent.Future<PublishListingRevisionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishListingRevisionRequest, PublishListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishListingRevisionAsPrivateResponse>
            publishListingRevisionAsPrivate(
                    PublishListingRevisionAsPrivateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PublishListingRevisionAsPrivateRequest,
                                    PublishListingRevisionAsPrivateResponse>
                            handler) {
        LOG.trace("Called async publishListingRevisionAsPrivate");
        final PublishListingRevisionAsPrivateRequest interceptedRequest =
                PublishListingRevisionAsPrivateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionAsPrivateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionAsPrivate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/PublishListingRevisionAsPrivate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PublishListingRevisionAsPrivateResponse>
                transformer =
                        PublishListingRevisionAsPrivateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PublishListingRevisionAsPrivateRequest,
                        PublishListingRevisionAsPrivateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishListingRevisionAsPrivateRequest,
                                PublishListingRevisionAsPrivateResponse>,
                        java.util.concurrent.Future<PublishListingRevisionAsPrivateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPublishListingRevisionAsPrivateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishListingRevisionAsPrivateRequest,
                    PublishListingRevisionAsPrivateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishListingRevisionPackageResponse>
            publishListingRevisionPackage(
                    PublishListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PublishListingRevisionPackageRequest,
                                    PublishListingRevisionPackageResponse>
                            handler) {
        LOG.trace("Called async publishListingRevisionPackage");
        final PublishListingRevisionPackageRequest interceptedRequest =
                PublishListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "PublishListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/PublishListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PublishListingRevisionPackageResponse>
                transformer =
                        PublishListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PublishListingRevisionPackageRequest, PublishListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishListingRevisionPackageRequest,
                                PublishListingRevisionPackageResponse>,
                        java.util.concurrent.Future<PublishListingRevisionPackageResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishListingRevisionPackageRequest, PublishListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SubmitListingRevisionForReviewResponse>
            submitListingRevisionForReview(
                    SubmitListingRevisionForReviewRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SubmitListingRevisionForReviewRequest,
                                    SubmitListingRevisionForReviewResponse>
                            handler) {
        LOG.trace("Called async submitListingRevisionForReview");
        final SubmitListingRevisionForReviewRequest interceptedRequest =
                SubmitListingRevisionForReviewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SubmitListingRevisionForReviewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "SubmitListingRevisionForReview",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/SubmitListingRevisionForReview");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SubmitListingRevisionForReviewResponse>
                transformer =
                        SubmitListingRevisionForReviewConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SubmitListingRevisionForReviewRequest,
                        SubmitListingRevisionForReviewResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SubmitListingRevisionForReviewRequest,
                                SubmitListingRevisionForReviewResponse>,
                        java.util.concurrent.Future<SubmitListingRevisionForReviewResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSubmitListingRevisionForReviewDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SubmitListingRevisionForReviewRequest, SubmitListingRevisionForReviewResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UnPublishListingRevisionPackageResponse>
            unPublishListingRevisionPackage(
                    UnPublishListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnPublishListingRevisionPackageRequest,
                                    UnPublishListingRevisionPackageResponse>
                            handler) {
        LOG.trace("Called async unPublishListingRevisionPackage");
        final UnPublishListingRevisionPackageRequest interceptedRequest =
                UnPublishListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnPublishListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UnPublishListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/UnPublishListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UnPublishListingRevisionPackageResponse>
                transformer =
                        UnPublishListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UnPublishListingRevisionPackageRequest,
                        UnPublishListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UnPublishListingRevisionPackageRequest,
                                UnPublishListingRevisionPackageResponse>,
                        java.util.concurrent.Future<UnPublishListingRevisionPackageResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UnPublishListingRevisionPackageRequest,
                    UnPublishListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateArtifactResponse> updateArtifact(
            UpdateArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateArtifactRequest, UpdateArtifactResponse>
                    handler) {
        LOG.trace("Called async updateArtifact");
        final UpdateArtifactRequest interceptedRequest =
                UpdateArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/UpdateArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateArtifactResponse>
                transformer =
                        UpdateArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateArtifactRequest, UpdateArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateArtifactRequest, UpdateArtifactResponse>,
                        java.util.concurrent.Future<UpdateArtifactResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateArtifactRequest, UpdateArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingResponse> updateListing(
            UpdateListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateListingRequest, UpdateListingResponse>
                    handler) {
        LOG.trace("Called async updateListing");
        final UpdateListingRequest interceptedRequest =
                UpdateListingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Listing/UpdateListing");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateListingResponse>
                transformer =
                        UpdateListingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateListingRequest, UpdateListingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRequest, UpdateListingResponse>,
                        java.util.concurrent.Future<UpdateListingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRequest, UpdateListingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingRevisionResponse> updateListingRevision(
            UpdateListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateListingRevisionRequest, UpdateListingRevisionResponse>
                    handler) {
        LOG.trace("Called async updateListingRevision");
        final UpdateListingRevisionRequest interceptedRequest =
                UpdateListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/UpdateListingRevision");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateListingRevisionResponse>
                transformer =
                        UpdateListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateListingRevisionRequest, UpdateListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRevisionRequest, UpdateListingRevisionResponse>,
                        java.util.concurrent.Future<UpdateListingRevisionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingRevisionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRevisionRequest, UpdateListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingRevisionAttachmentResponse>
            updateListingRevisionAttachment(
                    UpdateListingRevisionAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionAttachmentRequest,
                                    UpdateListingRevisionAttachmentResponse>
                            handler) {
        LOG.trace("Called async updateListingRevisionAttachment");
        final UpdateListingRevisionAttachmentRequest interceptedRequest =
                UpdateListingRevisionAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/UpdateListingRevisionAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateListingRevisionAttachmentResponse>
                transformer =
                        UpdateListingRevisionAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateListingRevisionAttachmentRequest,
                        UpdateListingRevisionAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRevisionAttachmentRequest,
                                UpdateListingRevisionAttachmentResponse>,
                        java.util.concurrent.Future<UpdateListingRevisionAttachmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingRevisionAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRevisionAttachmentRequest,
                    UpdateListingRevisionAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingRevisionAttachmentContentResponse>
            updateListingRevisionAttachmentContent(
                    UpdateListingRevisionAttachmentContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionAttachmentContentRequest,
                                    UpdateListingRevisionAttachmentContentResponse>
                            handler) {
        LOG.trace("Called async updateListingRevisionAttachmentContent");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateListingRevisionAttachmentContentRequest.builder());
        }
        final UpdateListingRevisionAttachmentContentRequest interceptedRequest =
                UpdateListingRevisionAttachmentContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionAttachmentContentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionAttachmentContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionAttachment/UpdateListingRevisionAttachmentContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateListingRevisionAttachmentContentResponse>
                transformer =
                        UpdateListingRevisionAttachmentContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateListingRevisionAttachmentContentRequest,
                        UpdateListingRevisionAttachmentContentResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRevisionAttachmentContentRequest,
                                UpdateListingRevisionAttachmentContentResponse>,
                        java.util.concurrent.Future<UpdateListingRevisionAttachmentContentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingRevisionAttachmentContent(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRevisionAttachmentContentRequest,
                    UpdateListingRevisionAttachmentContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUpdateListingRevisionAttachmentContent(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingRevisionIconContentResponse>
            updateListingRevisionIconContent(
                    UpdateListingRevisionIconContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionIconContentRequest,
                                    UpdateListingRevisionIconContentResponse>
                            handler) {
        LOG.trace("Called async updateListingRevisionIconContent");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateListingRevisionIconContentRequest.builder());
        }
        final UpdateListingRevisionIconContentRequest interceptedRequest =
                UpdateListingRevisionIconContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionIconContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionIconContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/UpdateListingRevisionIconContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateListingRevisionIconContentResponse>
                transformer =
                        UpdateListingRevisionIconContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateListingRevisionIconContentRequest,
                        UpdateListingRevisionIconContentResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRevisionIconContentRequest,
                                UpdateListingRevisionIconContentResponse>,
                        java.util.concurrent.Future<UpdateListingRevisionIconContentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingRevisionIconContent(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRevisionIconContentRequest,
                    UpdateListingRevisionIconContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUpdateListingRevisionIconContent(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateListingRevisionPackageResponse>
            updateListingRevisionPackage(
                    UpdateListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionPackageRequest,
                                    UpdateListingRevisionPackageResponse>
                            handler) {
        LOG.trace("Called async updateListingRevisionPackage");
        final UpdateListingRevisionPackageRequest interceptedRequest =
                UpdateListingRevisionPackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateListingRevisionPackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateListingRevisionPackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevisionPackage/UpdateListingRevisionPackage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateListingRevisionPackageResponse>
                transformer =
                        UpdateListingRevisionPackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateListingRevisionPackageRequest, UpdateListingRevisionPackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateListingRevisionPackageRequest,
                                UpdateListingRevisionPackageResponse>,
                        java.util.concurrent.Future<UpdateListingRevisionPackageResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateListingRevisionPackageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateListingRevisionPackageRequest, UpdateListingRevisionPackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateTerm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Term/UpdateTerm");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTermResponse>
                transformer =
                        UpdateTermConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public java.util.concurrent.Future<UpdateTermVersionResponse> updateTermVersion(
            UpdateTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermVersionRequest, UpdateTermVersionResponse>
                    handler) {
        LOG.trace("Called async updateTermVersion");
        final UpdateTermVersionRequest interceptedRequest =
                UpdateTermVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateTermVersion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/UpdateTermVersion");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTermVersionResponse>
                transformer =
                        UpdateTermVersionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTermVersionRequest, UpdateTermVersionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTermVersionRequest, UpdateTermVersionResponse>,
                        java.util.concurrent.Future<UpdateTermVersionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTermVersionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTermVersionRequest, UpdateTermVersionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTermVersionContentResponse> updateTermVersionContent(
            UpdateTermVersionContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermVersionContentRequest, UpdateTermVersionContentResponse>
                    handler) {
        LOG.trace("Called async updateTermVersionContent");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, UpdateTermVersionContentRequest.builder());
        }
        final UpdateTermVersionContentRequest interceptedRequest =
                UpdateTermVersionContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTermVersionContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "UpdateTermVersionContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/TermVersion/UpdateTermVersionContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTermVersionContentResponse>
                transformer =
                        UpdateTermVersionContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTermVersionContentRequest, UpdateTermVersionContentResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTermVersionContentRequest, UpdateTermVersionContentResponse>,
                        java.util.concurrent.Future<UpdateTermVersionContentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTermVersionContent(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTermVersionContentRequest, UpdateTermVersionContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getUpdateTermVersionContent(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateAndPublishArtifactResponse>
            validateAndPublishArtifact(
                    ValidateAndPublishArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAndPublishArtifactRequest,
                                    ValidateAndPublishArtifactResponse>
                            handler) {
        LOG.trace("Called async validateAndPublishArtifact");
        final ValidateAndPublishArtifactRequest interceptedRequest =
                ValidateAndPublishArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateAndPublishArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "ValidateAndPublishArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/Artifact/ValidateAndPublishArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateAndPublishArtifactResponse>
                transformer =
                        ValidateAndPublishArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateAndPublishArtifactRequest, ValidateAndPublishArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateAndPublishArtifactRequest,
                                ValidateAndPublishArtifactResponse>,
                        java.util.concurrent.Future<ValidateAndPublishArtifactResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateAndPublishArtifactRequest, ValidateAndPublishArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<WithdrawListingRevisionResponse> withdrawListingRevision(
            WithdrawListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            WithdrawListingRevisionRequest, WithdrawListingRevisionResponse>
                    handler) {
        LOG.trace("Called async withdrawListingRevision");
        final WithdrawListingRevisionRequest interceptedRequest =
                WithdrawListingRevisionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                WithdrawListingRevisionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MarketplacePublisher",
                        "WithdrawListingRevision",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20220901/ListingRevision/WithdrawListingRevision");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, WithdrawListingRevisionResponse>
                transformer =
                        WithdrawListingRevisionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        WithdrawListingRevisionRequest, WithdrawListingRevisionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                WithdrawListingRevisionRequest, WithdrawListingRevisionResponse>,
                        java.util.concurrent.Future<WithdrawListingRevisionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    WithdrawListingRevisionRequest, WithdrawListingRevisionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
