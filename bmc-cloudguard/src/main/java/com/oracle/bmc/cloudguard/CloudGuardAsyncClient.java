/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.internal.http.*;
import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Async client implementation for CloudGuard service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class CloudGuardAsyncClient implements CloudGuardAsync {
    /**
     * Service instance for CloudGuard.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CLOUDGUARD")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cloudguard-cp-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CloudGuardAsyncClient.class);

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
    public CloudGuardAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
    public CloudGuardAsyncClient(
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
                            "CloudGuardAsyncClient", "getAdhocQueryResultContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CloudGuardAsyncClient> {
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
        public CloudGuardAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new CloudGuardAsyncClient(
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
    public java.util.concurrent.Future<AddCompartmentResponse> addCompartment(
            AddCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddCompartmentRequest, AddCompartmentResponse>
                    handler) {
        LOG.trace("Called async addCompartment");
        final AddCompartmentRequest interceptedRequest =
                AddCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "AddCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/AddCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, AddCompartmentResponse>
                transformer =
                        AddCompartmentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddCompartmentRequest, AddCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddCompartmentRequest, AddCompartmentResponse>,
                        java.util.concurrent.Future<AddCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddCompartmentRequest, AddCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "CloudGuard",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/CancelWorkRequest");
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
    public java.util.concurrent.Future<ChangeDataSourceCompartmentResponse>
            changeDataSourceCompartment(
                    ChangeDataSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSourceCompartmentRequest,
                                    ChangeDataSourceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDataSourceCompartment");
        final ChangeDataSourceCompartmentRequest interceptedRequest =
                ChangeDataSourceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDataSourceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeDataSourceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ChangeDataSourceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDataSourceCompartmentResponse>
                transformer =
                        ChangeDataSourceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDataSourceCompartmentRequest, ChangeDataSourceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDataSourceCompartmentRequest,
                                ChangeDataSourceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDataSourceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDataSourceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDataSourceCompartmentRequest, ChangeDataSourceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>
            changeDetectorRecipeCompartment(
                    ChangeDetectorRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDetectorRecipeCompartmentRequest,
                                    ChangeDetectorRecipeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDetectorRecipeCompartment");
        final ChangeDetectorRecipeCompartmentRequest interceptedRequest =
                ChangeDetectorRecipeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDetectorRecipeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeDetectorRecipeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/ChangeDetectorRecipeCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDetectorRecipeCompartmentResponse>
                transformer =
                        ChangeDetectorRecipeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDetectorRecipeCompartmentRequest,
                        ChangeDetectorRecipeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDetectorRecipeCompartmentRequest,
                                ChangeDetectorRecipeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDetectorRecipeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDetectorRecipeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDetectorRecipeCompartmentRequest,
                    ChangeDetectorRecipeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedListCompartmentResponse>
            changeManagedListCompartment(
                    ChangeManagedListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedListCompartmentRequest,
                                    ChangeManagedListCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeManagedListCompartment");
        final ChangeManagedListCompartmentRequest interceptedRequest =
                ChangeManagedListCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedListCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeManagedListCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/ChangeManagedListCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeManagedListCompartmentResponse>
                transformer =
                        ChangeManagedListCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeManagedListCompartmentRequest, ChangeManagedListCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeManagedListCompartmentRequest,
                                ChangeManagedListCompartmentResponse>,
                        java.util.concurrent.Future<ChangeManagedListCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeManagedListCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeManagedListCompartmentRequest, ChangeManagedListCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>
            changeResponderRecipeCompartment(
                    ChangeResponderRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeResponderRecipeCompartmentRequest,
                                    ChangeResponderRecipeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeResponderRecipeCompartment");
        final ChangeResponderRecipeCompartmentRequest interceptedRequest =
                ChangeResponderRecipeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeResponderRecipeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeResponderRecipeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/ChangeResponderRecipeCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeResponderRecipeCompartmentResponse>
                transformer =
                        ChangeResponderRecipeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeResponderRecipeCompartmentRequest,
                        ChangeResponderRecipeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeResponderRecipeCompartmentRequest,
                                ChangeResponderRecipeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeResponderRecipeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeResponderRecipeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeResponderRecipeCompartmentRequest,
                    ChangeResponderRecipeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSavedQueryCompartmentResponse>
            changeSavedQueryCompartment(
                    ChangeSavedQueryCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSavedQueryCompartmentRequest,
                                    ChangeSavedQueryCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSavedQueryCompartment");
        final ChangeSavedQueryCompartmentRequest interceptedRequest =
                ChangeSavedQueryCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSavedQueryCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeSavedQueryCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/ChangeSavedQueryCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSavedQueryCompartmentResponse>
                transformer =
                        ChangeSavedQueryCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSavedQueryCompartmentRequest, ChangeSavedQueryCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSavedQueryCompartmentRequest,
                                ChangeSavedQueryCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSavedQueryCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSavedQueryCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSavedQueryCompartmentRequest, ChangeSavedQueryCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityRecipeCompartmentResponse>
            changeSecurityRecipeCompartment(
                    ChangeSecurityRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityRecipeCompartmentRequest,
                                    ChangeSecurityRecipeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityRecipeCompartment");
        final ChangeSecurityRecipeCompartmentRequest interceptedRequest =
                ChangeSecurityRecipeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityRecipeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeSecurityRecipeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/ChangeSecurityRecipeCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSecurityRecipeCompartmentResponse>
                transformer =
                        ChangeSecurityRecipeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityRecipeCompartmentRequest,
                        ChangeSecurityRecipeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityRecipeCompartmentRequest,
                                ChangeSecurityRecipeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityRecipeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityRecipeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityRecipeCompartmentRequest,
                    ChangeSecurityRecipeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityZoneCompartmentResponse>
            changeSecurityZoneCompartment(
                    ChangeSecurityZoneCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityZoneCompartmentRequest,
                                    ChangeSecurityZoneCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityZoneCompartment");
        final ChangeSecurityZoneCompartmentRequest interceptedRequest =
                ChangeSecurityZoneCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityZoneCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ChangeSecurityZoneCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/ChangeSecurityZoneCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSecurityZoneCompartmentResponse>
                transformer =
                        ChangeSecurityZoneCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityZoneCompartmentRequest, ChangeSecurityZoneCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityZoneCompartmentRequest,
                                ChangeSecurityZoneCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityZoneCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityZoneCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityZoneCompartmentRequest, ChangeSecurityZoneCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAdhocQueryResponse> createAdhocQuery(
            CreateAdhocQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAdhocQueryRequest, CreateAdhocQueryResponse>
                    handler) {
        LOG.trace("Called async createAdhocQuery");
        final CreateAdhocQueryRequest interceptedRequest =
                CreateAdhocQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAdhocQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateAdhocQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQuery/CreateAdhocQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAdhocQueryResponse>
                transformer =
                        CreateAdhocQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAdhocQueryRequest, CreateAdhocQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAdhocQueryRequest, CreateAdhocQueryResponse>,
                        java.util.concurrent.Future<CreateAdhocQueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAdhocQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAdhocQueryRequest, CreateAdhocQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataMaskRuleResponse> createDataMaskRule(
            CreateDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>
                    handler) {
        LOG.trace("Called async createDataMaskRule");
        final CreateDataMaskRuleRequest interceptedRequest =
                CreateDataMaskRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataMaskRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateDataMaskRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/CreateDataMaskRule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDataMaskRuleResponse>
                transformer =
                        CreateDataMaskRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>,
                        java.util.concurrent.Future<CreateDataMaskRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataMaskRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataMaskRuleRequest, CreateDataMaskRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResponse> createDataSource(
            CreateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataSourceRequest, CreateDataSourceResponse>
                    handler) {
        LOG.trace("Called async createDataSource");
        final CreateDataSourceRequest interceptedRequest =
                CreateDataSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateDataSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/CreateDataSource");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDataSourceResponse>
                transformer =
                        CreateDataSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataSourceRequest, CreateDataSourceResponse>,
                        java.util.concurrent.Future<CreateDataSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataSourceRequest, CreateDataSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorRecipeResponse> createDetectorRecipe(
            CreateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async createDetectorRecipe");
        final CreateDetectorRecipeRequest interceptedRequest =
                CreateDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/CreateDetectorRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDetectorRecipeResponse>
                transformer =
                        CreateDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>,
                        java.util.concurrent.Future<CreateDetectorRecipeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDetectorRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDetectorRecipeRequest, CreateDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDetectorRecipeDetectorRuleResponse>
            createDetectorRecipeDetectorRule(
                    CreateDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDetectorRecipeDetectorRuleRequest,
                                    CreateDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async createDetectorRecipeDetectorRule");
        final CreateDetectorRecipeDetectorRuleRequest interceptedRequest =
                CreateDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/CreateDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDetectorRecipeDetectorRuleResponse>
                transformer =
                        CreateDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDetectorRecipeDetectorRuleRequest,
                        CreateDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDetectorRecipeDetectorRuleRequest,
                                CreateDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<CreateDetectorRecipeDetectorRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDetectorRecipeDetectorRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDetectorRecipeDetectorRuleRequest,
                    CreateDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateManagedListResponse> createManagedList(
            CreateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedListRequest, CreateManagedListResponse>
                    handler) {
        LOG.trace("Called async createManagedList");
        final CreateManagedListRequest interceptedRequest =
                CreateManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateManagedList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/CreateManagedList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateManagedListResponse>
                transformer =
                        CreateManagedListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateManagedListRequest, CreateManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateManagedListRequest, CreateManagedListResponse>,
                        java.util.concurrent.Future<CreateManagedListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateManagedListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateManagedListRequest, CreateManagedListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateResponderRecipeResponse> createResponderRecipe(
            CreateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async createResponderRecipe");
        final CreateResponderRecipeRequest interceptedRequest =
                CreateResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/CreateResponderRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateResponderRecipeResponse>
                transformer =
                        CreateResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateResponderRecipeRequest, CreateResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateResponderRecipeRequest, CreateResponderRecipeResponse>,
                        java.util.concurrent.Future<CreateResponderRecipeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateResponderRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateResponderRecipeRequest, CreateResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSavedQueryResponse> createSavedQuery(
            CreateSavedQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSavedQueryRequest, CreateSavedQueryResponse>
                    handler) {
        LOG.trace("Called async createSavedQuery");
        final CreateSavedQueryRequest interceptedRequest =
                CreateSavedQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSavedQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateSavedQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/CreateSavedQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSavedQueryResponse>
                transformer =
                        CreateSavedQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSavedQueryRequest, CreateSavedQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSavedQueryRequest, CreateSavedQueryResponse>,
                        java.util.concurrent.Future<CreateSavedQueryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSavedQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSavedQueryRequest, CreateSavedQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityRecipeResponse> createSecurityRecipe(
            CreateSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>
                    handler) {
        LOG.trace("Called async createSecurityRecipe");
        final CreateSecurityRecipeRequest interceptedRequest =
                CreateSecurityRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateSecurityRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/CreateSecurityRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityRecipeResponse>
                transformer =
                        CreateSecurityRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>,
                        java.util.concurrent.Future<CreateSecurityRecipeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityRecipeRequest, CreateSecurityRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityZoneResponse> createSecurityZone(
            CreateSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityZoneRequest, CreateSecurityZoneResponse>
                    handler) {
        LOG.trace("Called async createSecurityZone");
        final CreateSecurityZoneRequest interceptedRequest =
                CreateSecurityZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityZoneConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateSecurityZone",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/CreateSecurityZone");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityZoneResponse>
                transformer =
                        CreateSecurityZoneConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSecurityZoneRequest, CreateSecurityZoneResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityZoneRequest, CreateSecurityZoneResponse>,
                        java.util.concurrent.Future<CreateSecurityZoneResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityZoneDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityZoneRequest, CreateSecurityZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetResponse> createTarget(
            CreateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                    handler) {
        LOG.trace("Called async createTarget");
        final CreateTargetRequest interceptedRequest =
                CreateTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/CreateTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTargetResponse>
                transformer =
                        CreateTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTargetRequest, CreateTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetRequest, CreateTargetResponse>,
                        java.util.concurrent.Future<CreateTargetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetRequest, CreateTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetDetectorRecipeResponse>
            createTargetDetectorRecipe(
                    CreateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetDetectorRecipeRequest,
                                    CreateTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async createTargetDetectorRecipe");
        final CreateTargetDetectorRecipeRequest interceptedRequest =
                CreateTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateTargetDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/CreateTargetDetectorRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTargetDetectorRecipeResponse>
                transformer =
                        CreateTargetDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetDetectorRecipeRequest, CreateTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetDetectorRecipeRequest,
                                CreateTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<CreateTargetDetectorRecipeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachTargetDetectorRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetDetectorRecipeRequest, CreateTargetDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTargetResponderRecipeResponse>
            createTargetResponderRecipe(
                    CreateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetResponderRecipeRequest,
                                    CreateTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async createTargetResponderRecipe");
        final CreateTargetResponderRecipeRequest interceptedRequest =
                CreateTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateTargetResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/CreateTargetResponderRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTargetResponderRecipeResponse>
                transformer =
                        CreateTargetResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTargetResponderRecipeRequest, CreateTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTargetResponderRecipeRequest,
                                CreateTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<CreateTargetResponderRecipeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachTargetResponderRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTargetResponderRecipeRequest, CreateTargetResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateWlpAgentResponse> createWlpAgent(
            CreateWlpAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWlpAgentRequest, CreateWlpAgentResponse>
                    handler) {
        LOG.trace("Called async createWlpAgent");
        final CreateWlpAgentRequest interceptedRequest =
                CreateWlpAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWlpAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "CreateWlpAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WlpAgent/CreateWlpAgent");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateWlpAgentResponse>
                transformer =
                        CreateWlpAgentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateWlpAgentRequest, CreateWlpAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateWlpAgentRequest, CreateWlpAgentResponse>,
                        java.util.concurrent.Future<CreateWlpAgentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateWlpAgentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateWlpAgentRequest, CreateWlpAgentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAdhocQueryResponse> deleteAdhocQuery(
            DeleteAdhocQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>
                    handler) {
        LOG.trace("Called async deleteAdhocQuery");
        final DeleteAdhocQueryRequest interceptedRequest =
                DeleteAdhocQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAdhocQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteAdhocQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQuery/DeleteAdhocQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAdhocQueryResponse>
                transformer =
                        DeleteAdhocQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>,
                        java.util.concurrent.Future<DeleteAdhocQueryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataMaskRuleResponse> deleteDataMaskRule(
            DeleteDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>
                    handler) {
        LOG.trace("Called async deleteDataMaskRule");
        final DeleteDataMaskRuleRequest interceptedRequest =
                DeleteDataMaskRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataMaskRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteDataMaskRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/DeleteDataMaskRule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDataMaskRuleResponse>
                transformer =
                        DeleteDataMaskRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>,
                        java.util.concurrent.Future<DeleteDataMaskRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataMaskRuleRequest, DeleteDataMaskRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResponse> deleteDataSource(
            DeleteDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataSourceRequest, DeleteDataSourceResponse>
                    handler) {
        LOG.trace("Called async deleteDataSource");
        final DeleteDataSourceRequest interceptedRequest =
                DeleteDataSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteDataSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/DeleteDataSource");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDataSourceResponse>
                transformer =
                        DeleteDataSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataSourceRequest, DeleteDataSourceResponse>,
                        java.util.concurrent.Future<DeleteDataSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataSourceRequest, DeleteDataSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeResponse> deleteDetectorRecipe(
            DeleteDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async deleteDetectorRecipe");
        final DeleteDetectorRecipeRequest interceptedRequest =
                DeleteDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/DeleteDetectorRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDetectorRecipeResponse>
                transformer =
                        DeleteDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>,
                        java.util.concurrent.Future<DeleteDetectorRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDetectorRecipeRequest, DeleteDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleResponse>
            deleteDetectorRecipeDetectorRule(
                    DeleteDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleRequest,
                                    DeleteDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async deleteDetectorRecipeDetectorRule");
        final DeleteDetectorRecipeDetectorRuleRequest interceptedRequest =
                DeleteDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/DeleteDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDetectorRecipeDetectorRuleResponse>
                transformer =
                        DeleteDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDetectorRecipeDetectorRuleRequest,
                        DeleteDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDetectorRecipeDetectorRuleRequest,
                                DeleteDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDetectorRecipeDetectorRuleRequest,
                    DeleteDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDetectorRecipeDetectorRuleDataSourceResponse>
            deleteDetectorRecipeDetectorRuleDataSource(
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                                    DeleteDetectorRecipeDetectorRuleDataSourceResponse>
                            handler) {
        LOG.trace("Called async deleteDetectorRecipeDetectorRuleDataSource");
        final DeleteDetectorRecipeDetectorRuleDataSourceRequest interceptedRequest =
                DeleteDetectorRecipeDetectorRuleDataSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDetectorRecipeDetectorRuleDataSourceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteDetectorRecipeDetectorRuleDataSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/DeleteDetectorRecipeDetectorRuleDataSource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDetectorRecipeDetectorRuleDataSourceResponse>
                transformer =
                        DeleteDetectorRecipeDetectorRuleDataSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                        DeleteDetectorRecipeDetectorRuleDataSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                                DeleteDetectorRecipeDetectorRuleDataSourceResponse>,
                        java.util.concurrent.Future<
                                DeleteDetectorRecipeDetectorRuleDataSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDetectorRecipeDetectorRuleDataSourceRequest,
                    DeleteDetectorRecipeDetectorRuleDataSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedListResponse> deleteManagedList(
            DeleteManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedListRequest, DeleteManagedListResponse>
                    handler) {
        LOG.trace("Called async deleteManagedList");
        final DeleteManagedListRequest interceptedRequest =
                DeleteManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteManagedList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/DeleteManagedList");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteManagedListResponse>
                transformer =
                        DeleteManagedListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteManagedListRequest, DeleteManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedListRequest, DeleteManagedListResponse>,
                        java.util.concurrent.Future<DeleteManagedListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedListRequest, DeleteManagedListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteResponderRecipeResponse> deleteResponderRecipe(
            DeleteResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async deleteResponderRecipe");
        final DeleteResponderRecipeRequest interceptedRequest =
                DeleteResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/DeleteResponderRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteResponderRecipeResponse>
                transformer =
                        DeleteResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>,
                        java.util.concurrent.Future<DeleteResponderRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteResponderRecipeRequest, DeleteResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSavedQueryResponse> deleteSavedQuery(
            DeleteSavedQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSavedQueryRequest, DeleteSavedQueryResponse>
                    handler) {
        LOG.trace("Called async deleteSavedQuery");
        final DeleteSavedQueryRequest interceptedRequest =
                DeleteSavedQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSavedQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteSavedQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/DeleteSavedQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSavedQueryResponse>
                transformer =
                        DeleteSavedQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSavedQueryRequest, DeleteSavedQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSavedQueryRequest, DeleteSavedQueryResponse>,
                        java.util.concurrent.Future<DeleteSavedQueryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSavedQueryRequest, DeleteSavedQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityRecipeResponse> deleteSecurityRecipe(
            DeleteSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityRecipe");
        final DeleteSecurityRecipeRequest interceptedRequest =
                DeleteSecurityRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteSecurityRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/DeleteSecurityRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityRecipeResponse>
                transformer =
                        DeleteSecurityRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>,
                        java.util.concurrent.Future<DeleteSecurityRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityRecipeRequest, DeleteSecurityRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityZoneResponse> deleteSecurityZone(
            DeleteSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityZone");
        final DeleteSecurityZoneRequest interceptedRequest =
                DeleteSecurityZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityZoneConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteSecurityZone",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/DeleteSecurityZone");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityZoneResponse>
                transformer =
                        DeleteSecurityZoneConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>,
                        java.util.concurrent.Future<DeleteSecurityZoneResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityZoneRequest, DeleteSecurityZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResponse> deleteTarget(
            DeleteTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                    handler) {
        LOG.trace("Called async deleteTarget");
        final DeleteTargetRequest interceptedRequest =
                DeleteTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/DeleteTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTargetResponse>
                transformer =
                        DeleteTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTargetRequest, DeleteTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetRequest, DeleteTargetResponse>,
                        java.util.concurrent.Future<DeleteTargetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetRequest, DeleteTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse>
            deleteTargetDetectorRecipe(
                    DeleteTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetDetectorRecipeRequest,
                                    DeleteTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async deleteTargetDetectorRecipe");
        final DeleteTargetDetectorRecipeRequest interceptedRequest =
                DeleteTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteTargetDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/DeleteTargetDetectorRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteTargetDetectorRecipeResponse>
                transformer =
                        DeleteTargetDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetDetectorRecipeRequest, DeleteTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetDetectorRecipeRequest,
                                DeleteTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<DeleteTargetDetectorRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetDetectorRecipeRequest, DeleteTargetDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResponderRecipeResponse>
            deleteTargetResponderRecipe(
                    DeleteTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetResponderRecipeRequest,
                                    DeleteTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async deleteTargetResponderRecipe");
        final DeleteTargetResponderRecipeRequest interceptedRequest =
                DeleteTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteTargetResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/DeleteTargetResponderRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteTargetResponderRecipeResponse>
                transformer =
                        DeleteTargetResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTargetResponderRecipeRequest, DeleteTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTargetResponderRecipeRequest,
                                DeleteTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<DeleteTargetResponderRecipeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTargetResponderRecipeRequest, DeleteTargetResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteWlpAgentResponse> deleteWlpAgent(
            DeleteWlpAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWlpAgentRequest, DeleteWlpAgentResponse>
                    handler) {
        LOG.trace("Called async deleteWlpAgent");
        final DeleteWlpAgentRequest interceptedRequest =
                DeleteWlpAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWlpAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "DeleteWlpAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WlpAgent/DeleteWlpAgent");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteWlpAgentResponse>
                transformer =
                        DeleteWlpAgentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteWlpAgentRequest, DeleteWlpAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWlpAgentRequest, DeleteWlpAgentResponse>,
                        java.util.concurrent.Future<DeleteWlpAgentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWlpAgentRequest, DeleteWlpAgentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExecuteResponderExecutionResponse> executeResponderExecution(
            ExecuteResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async executeResponderExecution");
        final ExecuteResponderExecutionRequest interceptedRequest =
                ExecuteResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExecuteResponderExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ExecuteResponderExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/ExecuteResponderExecution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ExecuteResponderExecutionResponse>
                transformer =
                        ExecuteResponderExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExecuteResponderExecutionRequest,
                                ExecuteResponderExecutionResponse>,
                        java.util.concurrent.Future<ExecuteResponderExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExecuteResponderExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExecuteResponderExecutionRequest, ExecuteResponderExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAdhocQueryResponse> getAdhocQuery(
            GetAdhocQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAdhocQueryRequest, GetAdhocQueryResponse>
                    handler) {
        LOG.trace("Called async getAdhocQuery");
        final GetAdhocQueryRequest interceptedRequest =
                GetAdhocQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAdhocQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetAdhocQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQuery/GetAdhocQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAdhocQueryResponse>
                transformer =
                        GetAdhocQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAdhocQueryRequest, GetAdhocQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAdhocQueryRequest, GetAdhocQueryResponse>,
                        java.util.concurrent.Future<GetAdhocQueryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAdhocQueryRequest, GetAdhocQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAdhocQueryResultContentResponse>
            getAdhocQueryResultContent(
                    GetAdhocQueryResultContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAdhocQueryResultContentRequest,
                                    GetAdhocQueryResultContentResponse>
                            handler) {
        LOG.trace("Called async getAdhocQueryResultContent");
        final GetAdhocQueryResultContentRequest interceptedRequest =
                GetAdhocQueryResultContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAdhocQueryResultContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetAdhocQueryResultContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQueryResultCollection/GetAdhocQueryResultContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAdhocQueryResultContentResponse>
                transformer =
                        GetAdhocQueryResultContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAdhocQueryResultContentRequest, GetAdhocQueryResultContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAdhocQueryResultContentRequest,
                                GetAdhocQueryResultContentResponse>,
                        java.util.concurrent.Future<GetAdhocQueryResultContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAdhocQueryResultContentRequest, GetAdhocQueryResultContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConditionMetadataTypeResponse> getConditionMetadataType(
            GetConditionMetadataTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                    handler) {
        LOG.trace("Called async getConditionMetadataType");
        final GetConditionMetadataTypeRequest interceptedRequest =
                GetConditionMetadataTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConditionMetadataTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetConditionMetadataType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ConditionMetadataType/GetConditionMetadataType");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetConditionMetadataTypeResponse>
                transformer =
                        GetConditionMetadataTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>,
                        java.util.concurrent.Future<GetConditionMetadataTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConditionMetadataTypeRequest, GetConditionMetadataTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {
        LOG.trace("Called async getConfiguration");
        final GetConfigurationRequest interceptedRequest =
                GetConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Configuration/GetConfiguration");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConfigurationResponse>
                transformer =
                        GetConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConfigurationRequest, GetConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConfigurationRequest, GetConfigurationResponse>,
                        java.util.concurrent.Future<GetConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConfigurationRequest, GetConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataMaskRuleResponse> getDataMaskRule(
            GetDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataMaskRuleRequest, GetDataMaskRuleResponse>
                    handler) {
        LOG.trace("Called async getDataMaskRule");
        final GetDataMaskRuleRequest interceptedRequest =
                GetDataMaskRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataMaskRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDataMaskRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/GetDataMaskRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataMaskRuleResponse>
                transformer =
                        GetDataMaskRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDataMaskRuleRequest, GetDataMaskRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataMaskRuleRequest, GetDataMaskRuleResponse>,
                        java.util.concurrent.Future<GetDataMaskRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataMaskRuleRequest, GetDataMaskRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResponse> getDataSource(
            GetDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataSourceRequest, GetDataSourceResponse>
                    handler) {
        LOG.trace("Called async getDataSource");
        final GetDataSourceRequest interceptedRequest =
                GetDataSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDataSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/GetDataSource");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataSourceResponse>
                transformer =
                        GetDataSourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDataSourceRequest, GetDataSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataSourceRequest, GetDataSourceResponse>,
                        java.util.concurrent.Future<GetDataSourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataSourceRequest, GetDataSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDetectorResponse> getDetector(
            GetDetectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse>
                    handler) {
        LOG.trace("Called async getDetector");
        final GetDetectorRequest interceptedRequest =
                GetDetectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDetector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Detector/GetDetector");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDetectorResponse>
                transformer =
                        GetDetectorConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDetectorRequest, GetDetectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRequest, GetDetectorResponse>,
                        java.util.concurrent.Future<GetDetectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRequest, GetDetectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRecipeResponse> getDetectorRecipe(
            GetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async getDetectorRecipe");
        final GetDetectorRecipeRequest interceptedRequest =
                GetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/GetDetectorRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDetectorRecipeResponse>
                transformer =
                        GetDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRecipeRequest, GetDetectorRecipeResponse>,
                        java.util.concurrent.Future<GetDetectorRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRecipeRequest, GetDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>
            getDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDetectorRecipeDetectorRuleRequest,
                                    GetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async getDetectorRecipeDetectorRule");
        final GetDetectorRecipeDetectorRuleRequest interceptedRequest =
                GetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/GetDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDetectorRecipeDetectorRuleResponse>
                transformer =
                        GetDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRecipeDetectorRuleRequest,
                                GetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<GetDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDetectorRuleResponse> getDetectorRule(
            GetDetectorRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDetectorRuleRequest, GetDetectorRuleResponse>
                    handler) {
        LOG.trace("Called async getDetectorRule");
        final GetDetectorRuleRequest interceptedRequest =
                GetDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDetectorRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRule/GetDetectorRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDetectorRuleResponse>
                transformer =
                        GetDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDetectorRuleRequest, GetDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDetectorRuleRequest, GetDetectorRuleResponse>,
                        java.util.concurrent.Future<GetDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDetectorRuleRequest, GetDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedListResponse> getManagedList(
            GetManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedListRequest, GetManagedListResponse>
                    handler) {
        LOG.trace("Called async getManagedList");
        final GetManagedListRequest interceptedRequest =
                GetManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetManagedList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/GetManagedList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetManagedListResponse>
                transformer =
                        GetManagedListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetManagedListRequest, GetManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedListRequest, GetManagedListResponse>,
                        java.util.concurrent.Future<GetManagedListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedListRequest, GetManagedListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProblemResponse> getProblem(
            GetProblemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse>
                    handler) {
        LOG.trace("Called async getProblem");
        final GetProblemRequest interceptedRequest = GetProblemConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProblemConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetProblem",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/GetProblem");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProblemResponse>
                transformer =
                        GetProblemConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProblemRequest, GetProblemResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProblemRequest, GetProblemResponse>,
                        java.util.concurrent.Future<GetProblemResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProblemRequest, GetProblemResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResourceResponse> getResource(
            GetResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetResourceRequest, GetResourceResponse>
                    handler) {
        LOG.trace("Called async getResource");
        final GetResourceRequest interceptedRequest =
                GetResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Resource/GetResource");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResourceResponse>
                transformer =
                        GetResourceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetResourceRequest, GetResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResourceRequest, GetResourceResponse>,
                        java.util.concurrent.Future<GetResourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResourceRequest, GetResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResourceProfileResponse> getResourceProfile(
            GetResourceProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResourceProfileRequest, GetResourceProfileResponse>
                    handler) {
        LOG.trace("Called async getResourceProfile");
        final GetResourceProfileRequest interceptedRequest =
                GetResourceProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResourceProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResourceProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfile/GetResourceProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResourceProfileResponse>
                transformer =
                        GetResourceProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetResourceProfileRequest, GetResourceProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResourceProfileRequest, GetResourceProfileResponse>,
                        java.util.concurrent.Future<GetResourceProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResourceProfileRequest, GetResourceProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResourceVulnerabilityResponse> getResourceVulnerability(
            GetResourceVulnerabilityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResourceVulnerabilityRequest, GetResourceVulnerabilityResponse>
                    handler) {
        LOG.trace("Called async getResourceVulnerability");
        final GetResourceVulnerabilityRequest interceptedRequest =
                GetResourceVulnerabilityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResourceVulnerabilityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResourceVulnerability",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceVulnerability/GetResourceVulnerability");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetResourceVulnerabilityResponse>
                transformer =
                        GetResourceVulnerabilityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetResourceVulnerabilityRequest, GetResourceVulnerabilityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResourceVulnerabilityRequest, GetResourceVulnerabilityResponse>,
                        java.util.concurrent.Future<GetResourceVulnerabilityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResourceVulnerabilityRequest, GetResourceVulnerabilityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResponderExecutionResponse> getResponderExecution(
            GetResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderExecutionRequest, GetResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async getResponderExecution");
        final GetResponderExecutionRequest interceptedRequest =
                GetResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResponderExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/GetResponderExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResponderExecutionResponse>
                transformer =
                        GetResponderExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetResponderExecutionRequest, GetResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderExecutionRequest, GetResponderExecutionResponse>,
                        java.util.concurrent.Future<GetResponderExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderExecutionRequest, GetResponderExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResponderRecipeResponse> getResponderRecipe(
            GetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRecipeRequest, GetResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async getResponderRecipe");
        final GetResponderRecipeRequest interceptedRequest =
                GetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/GetResponderRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResponderRecipeResponse>
                transformer =
                        GetResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetResponderRecipeRequest, GetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRecipeRequest, GetResponderRecipeResponse>,
                        java.util.concurrent.Future<GetResponderRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRecipeRequest, GetResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>
            getResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetResponderRecipeResponderRuleRequest,
                                    GetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async getResponderRecipeResponderRule");
        final GetResponderRecipeResponderRuleRequest interceptedRequest =
                GetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRecipeResponderRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResponderRecipeResponderRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/GetResponderRecipeResponderRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetResponderRecipeResponderRuleResponse>
                transformer =
                        GetResponderRecipeResponderRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetResponderRecipeResponderRuleRequest,
                        GetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRecipeResponderRuleRequest,
                                GetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<GetResponderRecipeResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRecipeResponderRuleRequest,
                    GetResponderRecipeResponderRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResponderRuleResponse> getResponderRule(
            GetResponderRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResponderRuleRequest, GetResponderRuleResponse>
                    handler) {
        LOG.trace("Called async getResponderRule");
        final GetResponderRuleRequest interceptedRequest =
                GetResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResponderRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetResponderRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRule/GetResponderRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResponderRuleResponse>
                transformer =
                        GetResponderRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetResponderRuleRequest, GetResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResponderRuleRequest, GetResponderRuleResponse>,
                        java.util.concurrent.Future<GetResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResponderRuleRequest, GetResponderRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSavedQueryResponse> getSavedQuery(
            GetSavedQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSavedQueryRequest, GetSavedQueryResponse>
                    handler) {
        LOG.trace("Called async getSavedQuery");
        final GetSavedQueryRequest interceptedRequest =
                GetSavedQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSavedQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetSavedQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/GetSavedQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSavedQueryResponse>
                transformer =
                        GetSavedQueryConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSavedQueryRequest, GetSavedQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSavedQueryRequest, GetSavedQueryResponse>,
                        java.util.concurrent.Future<GetSavedQueryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSavedQueryRequest, GetSavedQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyResponse> getSecurityPolicy(
            GetSecurityPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                    handler) {
        LOG.trace("Called async getSecurityPolicy");
        final GetSecurityPolicyRequest interceptedRequest =
                GetSecurityPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetSecurityPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityPolicy/GetSecurityPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityPolicyResponse>
                transformer =
                        GetSecurityPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityPolicyRequest, GetSecurityPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityPolicyRequest, GetSecurityPolicyResponse>,
                        java.util.concurrent.Future<GetSecurityPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityPolicyRequest, GetSecurityPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityRecipeResponse> getSecurityRecipe(
            GetSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityRecipeRequest, GetSecurityRecipeResponse>
                    handler) {
        LOG.trace("Called async getSecurityRecipe");
        final GetSecurityRecipeRequest interceptedRequest =
                GetSecurityRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetSecurityRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/GetSecurityRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityRecipeResponse>
                transformer =
                        GetSecurityRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityRecipeRequest, GetSecurityRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityRecipeRequest, GetSecurityRecipeResponse>,
                        java.util.concurrent.Future<GetSecurityRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityRecipeRequest, GetSecurityRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityZoneResponse> getSecurityZone(
            GetSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityZoneRequest, GetSecurityZoneResponse>
                    handler) {
        LOG.trace("Called async getSecurityZone");
        final GetSecurityZoneRequest interceptedRequest =
                GetSecurityZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityZoneConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetSecurityZone",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/GetSecurityZone");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityZoneResponse>
                transformer =
                        GetSecurityZoneConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityZoneRequest, GetSecurityZoneResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityZoneRequest, GetSecurityZoneResponse>,
                        java.util.concurrent.Future<GetSecurityZoneResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityZoneRequest, GetSecurityZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSightingResponse> getSighting(
            GetSightingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSightingRequest, GetSightingResponse>
                    handler) {
        LOG.trace("Called async getSighting");
        final GetSightingRequest interceptedRequest =
                GetSightingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSightingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetSighting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Sighting/GetSighting");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSightingResponse>
                transformer =
                        GetSightingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSightingRequest, GetSightingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSightingRequest, GetSightingResponse>,
                        java.util.concurrent.Future<GetSightingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSightingRequest, GetSightingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponse> getTarget(
            GetTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse>
                    handler) {
        LOG.trace("Called async getTarget");
        final GetTargetRequest interceptedRequest = GetTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/GetTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTargetResponse>
                transformer =
                        GetTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTargetRequest, GetTargetResponse>,
                        java.util.concurrent.Future<GetTargetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetRequest, GetTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetDetectorRecipeResponse> getTargetDetectorRecipe(
            GetTargetDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async getTargetDetectorRecipe");
        final GetTargetDetectorRecipeRequest interceptedRequest =
                GetTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetTargetDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/GetTargetDetectorRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTargetDetectorRecipeResponse>
                transformer =
                        GetTargetDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<GetTargetDetectorRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>
            getTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetDetectorRecipeDetectorRuleRequest,
                                    GetTargetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async getTargetDetectorRecipeDetectorRule");
        final GetTargetDetectorRecipeDetectorRuleRequest interceptedRequest =
                GetTargetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDetectorRecipeDetectorRuleConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetTargetDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/GetTargetDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTargetDetectorRecipeDetectorRuleResponse>
                transformer =
                        GetTargetDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetDetectorRecipeDetectorRuleRequest,
                        GetTargetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetDetectorRecipeDetectorRuleRequest,
                                GetTargetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<GetTargetDetectorRecipeDetectorRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponderRecipeResponse> getTargetResponderRecipe(
            GetTargetResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async getTargetResponderRecipe");
        final GetTargetResponderRecipeRequest interceptedRequest =
                GetTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetTargetResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/GetTargetResponderRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTargetResponderRecipeResponse>
                transformer =
                        GetTargetResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<GetTargetResponderRecipeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetResponderRecipeRequest, GetTargetResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>
            getTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetResponderRecipeResponderRuleRequest,
                                    GetTargetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async getTargetResponderRecipeResponderRule");
        final GetTargetResponderRecipeResponderRuleRequest interceptedRequest =
                GetTargetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetResponderRecipeResponderRuleConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetTargetResponderRecipeResponderRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/GetTargetResponderRecipeResponderRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTargetResponderRecipeResponderRuleResponse>
                transformer =
                        GetTargetResponderRecipeResponderRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTargetResponderRecipeResponderRuleRequest,
                        GetTargetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTargetResponderRecipeResponderRuleRequest,
                                GetTargetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<GetTargetResponderRecipeResponderRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWlpAgentResponse> getWlpAgent(
            GetWlpAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWlpAgentRequest, GetWlpAgentResponse>
                    handler) {
        LOG.trace("Called async getWlpAgent");
        final GetWlpAgentRequest interceptedRequest =
                GetWlpAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWlpAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "GetWlpAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WlpAgent/GetWlpAgent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWlpAgentResponse>
                transformer =
                        GetWlpAgentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWlpAgentRequest, GetWlpAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWlpAgentRequest, GetWlpAgentResponse>,
                        java.util.concurrent.Future<GetWlpAgentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWlpAgentRequest, GetWlpAgentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "CloudGuard",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListAdhocQueriesResponse> listAdhocQueries(
            ListAdhocQueriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdhocQueriesRequest, ListAdhocQueriesResponse>
                    handler) {
        LOG.trace("Called async listAdhocQueries");
        final ListAdhocQueriesRequest interceptedRequest =
                ListAdhocQueriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAdhocQueriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListAdhocQueries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQuery/ListAdhocQueries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAdhocQueriesResponse>
                transformer =
                        ListAdhocQueriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAdhocQueriesRequest, ListAdhocQueriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAdhocQueriesRequest, ListAdhocQueriesResponse>,
                        java.util.concurrent.Future<ListAdhocQueriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAdhocQueriesRequest, ListAdhocQueriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAdhocQueryResultsResponse> listAdhocQueryResults(
            ListAdhocQueryResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>
                    handler) {
        LOG.trace("Called async listAdhocQueryResults");
        final ListAdhocQueryResultsRequest interceptedRequest =
                ListAdhocQueryResultsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAdhocQueryResultsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListAdhocQueryResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/AdhocQueryResultCollection/ListAdhocQueryResults");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAdhocQueryResultsResponse>
                transformer =
                        ListAdhocQueryResultsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>,
                        java.util.concurrent.Future<ListAdhocQueryResultsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAdhocQueryResultsRequest, ListAdhocQueryResultsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConditionMetadataTypesResponse>
            listConditionMetadataTypes(
                    ListConditionMetadataTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConditionMetadataTypesRequest,
                                    ListConditionMetadataTypesResponse>
                            handler) {
        LOG.trace("Called async listConditionMetadataTypes");
        final ListConditionMetadataTypesRequest interceptedRequest =
                ListConditionMetadataTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConditionMetadataTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListConditionMetadataTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ConditionMetadataType/ListConditionMetadataTypes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListConditionMetadataTypesResponse>
                transformer =
                        ListConditionMetadataTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConditionMetadataTypesRequest,
                                ListConditionMetadataTypesResponse>,
                        java.util.concurrent.Future<ListConditionMetadataTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataMaskRulesResponse> listDataMaskRules(
            ListDataMaskRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataMaskRulesRequest, ListDataMaskRulesResponse>
                    handler) {
        LOG.trace("Called async listDataMaskRules");
        final ListDataMaskRulesRequest interceptedRequest =
                ListDataMaskRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataMaskRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDataMaskRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/ListDataMaskRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataMaskRulesResponse>
                transformer =
                        ListDataMaskRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDataMaskRulesRequest, ListDataMaskRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataMaskRulesRequest, ListDataMaskRulesResponse>,
                        java.util.concurrent.Future<ListDataMaskRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataMaskRulesRequest, ListDataMaskRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataSourceEventsResponse> listDataSourceEvents(
            ListDataSourceEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourceEventsRequest, ListDataSourceEventsResponse>
                    handler) {
        LOG.trace("Called async listDataSourceEvents");
        final ListDataSourceEventsRequest interceptedRequest =
                ListDataSourceEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSourceEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDataSourceEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ListDataSourceEvents");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataSourceEventsResponse>
                transformer =
                        ListDataSourceEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDataSourceEventsRequest, ListDataSourceEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataSourceEventsRequest, ListDataSourceEventsResponse>,
                        java.util.concurrent.Future<ListDataSourceEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataSourceEventsRequest, ListDataSourceEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResponse> listDataSources(
            ListDataSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourcesRequest, ListDataSourcesResponse>
                    handler) {
        LOG.trace("Called async listDataSources");
        final ListDataSourcesRequest interceptedRequest =
                ListDataSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDataSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/ListDataSources");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataSourcesResponse>
                transformer =
                        ListDataSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataSourcesRequest, ListDataSourcesResponse>,
                        java.util.concurrent.Future<ListDataSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataSourcesRequest, ListDataSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRules(
                    ListDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDetectorRecipeDetectorRulesRequest,
                                    ListDetectorRecipeDetectorRulesResponse>
                            handler) {
        LOG.trace("Called async listDetectorRecipeDetectorRules");
        final ListDetectorRecipeDetectorRulesRequest interceptedRequest =
                ListDetectorRecipeDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRecipeDetectorRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDetectorRecipeDetectorRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/ListDetectorRecipeDetectorRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDetectorRecipeDetectorRulesResponse>
                transformer =
                        ListDetectorRecipeDetectorRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRecipeDetectorRulesRequest,
                                ListDetectorRecipeDetectorRulesResponse>,
                        java.util.concurrent.Future<ListDetectorRecipeDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRecipeDetectorRulesRequest,
                    ListDetectorRecipeDetectorRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRecipesResponse> listDetectorRecipes(
            ListDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                    handler) {
        LOG.trace("Called async listDetectorRecipes");
        final ListDetectorRecipesRequest interceptedRequest =
                ListDetectorRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRecipesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDetectorRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/ListDetectorRecipes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDetectorRecipesResponse>
                transformer =
                        ListDetectorRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRecipesRequest, ListDetectorRecipesResponse>,
                        java.util.concurrent.Future<ListDetectorRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRecipesRequest, ListDetectorRecipesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDetectorRulesResponse> listDetectorRules(
            ListDetectorRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDetectorRulesRequest, ListDetectorRulesResponse>
                    handler) {
        LOG.trace("Called async listDetectorRules");
        final ListDetectorRulesRequest interceptedRequest =
                ListDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDetectorRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRule/ListDetectorRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDetectorRulesResponse>
                transformer =
                        ListDetectorRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDetectorRulesRequest, ListDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorRulesRequest, ListDetectorRulesResponse>,
                        java.util.concurrent.Future<ListDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorRulesRequest, ListDetectorRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResponse> listDetectors(
            ListDetectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                    handler) {
        LOG.trace("Called async listDetectors");
        final ListDetectorsRequest interceptedRequest =
                ListDetectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDetectorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListDetectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Detector/ListDetectors");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDetectorsResponse>
                transformer =
                        ListDetectorsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDetectorsRequest, ListDetectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDetectorsRequest, ListDetectorsResponse>,
                        java.util.concurrent.Future<ListDetectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDetectorsRequest, ListDetectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImpactedResourcesResponse> listImpactedResources(
            ListImpactedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                    handler) {
        LOG.trace("Called async listImpactedResources");
        final ListImpactedResourcesRequest interceptedRequest =
                ListImpactedResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImpactedResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListImpactedResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ImpactedResourceSummary/ListImpactedResources");
        final java.util.function.Function<javax.ws.rs.core.Response, ListImpactedResourcesResponse>
                transformer =
                        ListImpactedResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImpactedResourcesRequest, ListImpactedResourcesResponse>,
                        java.util.concurrent.Future<ListImpactedResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImpactedResourcesRequest, ListImpactedResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedListTypesResponse> listManagedListTypes(
            ListManagedListTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListTypesRequest, ListManagedListTypesResponse>
                    handler) {
        LOG.trace("Called async listManagedListTypes");
        final ListManagedListTypesRequest interceptedRequest =
                ListManagedListTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedListTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListManagedListTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedListTypeSummary/ListManagedListTypes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListManagedListTypesResponse>
                transformer =
                        ListManagedListTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedListTypesRequest, ListManagedListTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedListTypesRequest, ListManagedListTypesResponse>,
                        java.util.concurrent.Future<ListManagedListTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedListTypesRequest, ListManagedListTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedListsResponse> listManagedLists(
            ListManagedListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedListsRequest, ListManagedListsResponse>
                    handler) {
        LOG.trace("Called async listManagedLists");
        final ListManagedListsRequest interceptedRequest =
                ListManagedListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListManagedLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/ListManagedLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListManagedListsResponse>
                transformer =
                        ListManagedListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListManagedListsRequest, ListManagedListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedListsRequest, ListManagedListsResponse>,
                        java.util.concurrent.Future<ListManagedListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedListsRequest, ListManagedListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/PolicySummary/ListPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer =
                        ListPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPoliciesRequest, ListPoliciesResponse>,
                        java.util.concurrent.Future<ListPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPoliciesRequest, ListPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProblemEndpointsResponse> listProblemEndpoints(
            ListProblemEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEndpointsRequest, ListProblemEndpointsResponse>
                    handler) {
        LOG.trace("Called async listProblemEndpoints");
        final ListProblemEndpointsRequest interceptedRequest =
                ListProblemEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListProblemEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemEndpointSummary/ListProblemEndpoints");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProblemEndpointsResponse>
                transformer =
                        ListProblemEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProblemEndpointsRequest, ListProblemEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemEndpointsRequest, ListProblemEndpointsResponse>,
                        java.util.concurrent.Future<ListProblemEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemEndpointsRequest, ListProblemEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProblemEntitiesResponse> listProblemEntities(
            ListProblemEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemEntitiesRequest, ListProblemEntitiesResponse>
                    handler) {
        LOG.trace("Called async listProblemEntities");
        final ListProblemEntitiesRequest interceptedRequest =
                ListProblemEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemEntitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListProblemEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblemEntities");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProblemEntitiesResponse>
                transformer =
                        ListProblemEntitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProblemEntitiesRequest, ListProblemEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemEntitiesRequest, ListProblemEntitiesResponse>,
                        java.util.concurrent.Future<ListProblemEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemEntitiesRequest, ListProblemEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProblemHistoriesResponse> listProblemHistories(
            ListProblemHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                    handler) {
        LOG.trace("Called async listProblemHistories");
        final ListProblemHistoriesRequest interceptedRequest =
                ListProblemHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemHistoriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListProblemHistories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblemHistories");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProblemHistoriesResponse>
                transformer =
                        ListProblemHistoriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemHistoriesRequest, ListProblemHistoriesResponse>,
                        java.util.concurrent.Future<ListProblemHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemHistoriesRequest, ListProblemHistoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProblemsResponse> listProblems(
            ListProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                    handler) {
        LOG.trace("Called async listProblems");
        final ListProblemsRequest interceptedRequest =
                ListProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProblemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListProblems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/ListProblems");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProblemsResponse>
                transformer =
                        ListProblemsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProblemsRequest, ListProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProblemsRequest, ListProblemsResponse>,
                        java.util.concurrent.Future<ListProblemsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProblemsRequest, ListProblemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResponse> listRecommendations(
            ListRecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecommendationsRequest, ListRecommendationsResponse>
                    handler) {
        LOG.trace("Called async listRecommendations");
        final ListRecommendationsRequest interceptedRequest =
                ListRecommendationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecommendationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListRecommendations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RecommendationSummary/ListRecommendations");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRecommendationsResponse>
                transformer =
                        ListRecommendationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRecommendationsRequest, ListRecommendationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRecommendationsRequest, ListRecommendationsResponse>,
                        java.util.concurrent.Future<ListRecommendationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRecommendationsRequest, ListRecommendationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourcePortsResponse> listResourcePorts(
            ListResourcePortsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourcePortsRequest, ListResourcePortsResponse>
                    handler) {
        LOG.trace("Called async listResourcePorts");
        final ListResourcePortsRequest interceptedRequest =
                ListResourcePortsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourcePortsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourcePorts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourcePortCollection/ListResourcePorts");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResourcePortsResponse>
                transformer =
                        ListResourcePortsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListResourcePortsRequest, ListResourcePortsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourcePortsRequest, ListResourcePortsResponse>,
                        java.util.concurrent.Future<ListResourcePortsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourcePortsRequest, ListResourcePortsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileEndpointsResponse>
            listResourceProfileEndpoints(
                    ListResourceProfileEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceProfileEndpointsRequest,
                                    ListResourceProfileEndpointsResponse>
                            handler) {
        LOG.trace("Called async listResourceProfileEndpoints");
        final ListResourceProfileEndpointsRequest interceptedRequest =
                ListResourceProfileEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceProfileEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourceProfileEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileEndpointSummary/ListResourceProfileEndpoints");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourceProfileEndpointsResponse>
                transformer =
                        ListResourceProfileEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceProfileEndpointsRequest, ListResourceProfileEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceProfileEndpointsRequest,
                                ListResourceProfileEndpointsResponse>,
                        java.util.concurrent.Future<ListResourceProfileEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceProfileEndpointsRequest, ListResourceProfileEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileImpactedResourcesResponse>
            listResourceProfileImpactedResources(
                    ListResourceProfileImpactedResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceProfileImpactedResourcesRequest,
                                    ListResourceProfileImpactedResourcesResponse>
                            handler) {
        LOG.trace("Called async listResourceProfileImpactedResources");
        final ListResourceProfileImpactedResourcesRequest interceptedRequest =
                ListResourceProfileImpactedResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceProfileImpactedResourcesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourceProfileImpactedResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileImpactedResourceSummary/ListResourceProfileImpactedResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourceProfileImpactedResourcesResponse>
                transformer =
                        ListResourceProfileImpactedResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceProfileImpactedResourcesRequest,
                        ListResourceProfileImpactedResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceProfileImpactedResourcesRequest,
                                ListResourceProfileImpactedResourcesResponse>,
                        java.util.concurrent.Future<ListResourceProfileImpactedResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceProfileImpactedResourcesRequest,
                    ListResourceProfileImpactedResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfilesResponse> listResourceProfiles(
            ListResourceProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceProfilesRequest, ListResourceProfilesResponse>
                    handler) {
        LOG.trace("Called async listResourceProfiles");
        final ListResourceProfilesRequest interceptedRequest =
                ListResourceProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourceProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileSummary/ListResourceProfiles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResourceProfilesResponse>
                transformer =
                        ListResourceProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceProfilesRequest, ListResourceProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceProfilesRequest, ListResourceProfilesResponse>,
                        java.util.concurrent.Future<ListResourceProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceProfilesRequest, ListResourceProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceTypesResponse> listResourceTypes(
            ListResourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceTypesRequest, ListResourceTypesResponse>
                    handler) {
        LOG.trace("Called async listResourceTypes");
        final ListResourceTypesRequest interceptedRequest =
                ListResourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourceTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceTypeSummary/ListResourceTypes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResourceTypesResponse>
                transformer =
                        ListResourceTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListResourceTypesRequest, ListResourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceTypesRequest, ListResourceTypesResponse>,
                        java.util.concurrent.Future<ListResourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceTypesRequest, ListResourceTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResourceVulnerabilitiesResponse>
            listResourceVulnerabilities(
                    ListResourceVulnerabilitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceVulnerabilitiesRequest,
                                    ListResourceVulnerabilitiesResponse>
                            handler) {
        LOG.trace("Called async listResourceVulnerabilities");
        final ListResourceVulnerabilitiesRequest interceptedRequest =
                ListResourceVulnerabilitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceVulnerabilitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResourceVulnerabilities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceVulnerabilityCollection/ListResourceVulnerabilities");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourceVulnerabilitiesResponse>
                transformer =
                        ListResourceVulnerabilitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceVulnerabilitiesRequest, ListResourceVulnerabilitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceVulnerabilitiesRequest,
                                ListResourceVulnerabilitiesResponse>,
                        java.util.concurrent.Future<ListResourceVulnerabilitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceVulnerabilitiesRequest, ListResourceVulnerabilitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "CloudGuard",
                        "ListResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Resource/ListResources");
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
    public java.util.concurrent.Future<ListResponderActivitiesResponse> listResponderActivities(
            ListResponderActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                    handler) {
        LOG.trace("Called async listResponderActivities");
        final ListResponderActivitiesRequest interceptedRequest =
                ListResponderActivitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderActivitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResponderActivities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderActivitySummary/ListResponderActivities");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResponderActivitiesResponse>
                transformer =
                        ListResponderActivitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderActivitiesRequest, ListResponderActivitiesResponse>,
                        java.util.concurrent.Future<ListResponderActivitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderActivitiesRequest, ListResponderActivitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResponderExecutionsResponse> listResponderExecutions(
            ListResponderExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                    handler) {
        LOG.trace("Called async listResponderExecutions");
        final ListResponderExecutionsRequest interceptedRequest =
                ListResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderExecutionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResponderExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionSummary/ListResponderExecutions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResponderExecutionsResponse>
                transformer =
                        ListResponderExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderExecutionsRequest, ListResponderExecutionsResponse>,
                        java.util.concurrent.Future<ListResponderExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderExecutionsRequest, ListResponderExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRules(
                    ListResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResponderRecipeResponderRulesRequest,
                                    ListResponderRecipeResponderRulesResponse>
                            handler) {
        LOG.trace("Called async listResponderRecipeResponderRules");
        final ListResponderRecipeResponderRulesRequest interceptedRequest =
                ListResponderRecipeResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRecipeResponderRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResponderRecipeResponderRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/ListResponderRecipeResponderRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResponderRecipeResponderRulesResponse>
                transformer =
                        ListResponderRecipeResponderRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRecipeResponderRulesRequest,
                                ListResponderRecipeResponderRulesResponse>,
                        java.util.concurrent.Future<ListResponderRecipeResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRecipeResponderRulesRequest,
                    ListResponderRecipeResponderRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResponderRecipesResponse> listResponderRecipes(
            ListResponderRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRecipesRequest, ListResponderRecipesResponse>
                    handler) {
        LOG.trace("Called async listResponderRecipes");
        final ListResponderRecipesRequest interceptedRequest =
                ListResponderRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRecipesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResponderRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/ListResponderRecipes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResponderRecipesResponse>
                transformer =
                        ListResponderRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResponderRecipesRequest, ListResponderRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRecipesRequest, ListResponderRecipesResponse>,
                        java.util.concurrent.Future<ListResponderRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRecipesRequest, ListResponderRecipesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListResponderRulesResponse> listResponderRules(
            ListResponderRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResponderRulesRequest, ListResponderRulesResponse>
                    handler) {
        LOG.trace("Called async listResponderRules");
        final ListResponderRulesRequest interceptedRequest =
                ListResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResponderRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListResponderRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRule/ListResponderRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListResponderRulesResponse>
                transformer =
                        ListResponderRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListResponderRulesRequest, ListResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResponderRulesRequest, ListResponderRulesResponse>,
                        java.util.concurrent.Future<ListResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResponderRulesRequest, ListResponderRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSavedQueriesResponse> listSavedQueries(
            ListSavedQueriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSavedQueriesRequest, ListSavedQueriesResponse>
                    handler) {
        LOG.trace("Called async listSavedQueries");
        final ListSavedQueriesRequest interceptedRequest =
                ListSavedQueriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSavedQueriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSavedQueries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/ListSavedQueries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSavedQueriesResponse>
                transformer =
                        ListSavedQueriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSavedQueriesRequest, ListSavedQueriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSavedQueriesRequest, ListSavedQueriesResponse>,
                        java.util.concurrent.Future<ListSavedQueriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSavedQueriesRequest, ListSavedQueriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResponse> listSecurityPolicies(
            ListSecurityPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                    handler) {
        LOG.trace("Called async listSecurityPolicies");
        final ListSecurityPoliciesRequest interceptedRequest =
                ListSecurityPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSecurityPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityPolicyCollection/ListSecurityPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityPoliciesResponse>
                transformer =
                        ListSecurityPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>,
                        java.util.concurrent.Future<ListSecurityPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityRecipesResponse> listSecurityRecipes(
            ListSecurityRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityRecipesRequest, ListSecurityRecipesResponse>
                    handler) {
        LOG.trace("Called async listSecurityRecipes");
        final ListSecurityRecipesRequest interceptedRequest =
                ListSecurityRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityRecipesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSecurityRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipeCollection/ListSecurityRecipes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityRecipesResponse>
                transformer =
                        ListSecurityRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityRecipesRequest, ListSecurityRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityRecipesRequest, ListSecurityRecipesResponse>,
                        java.util.concurrent.Future<ListSecurityRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityRecipesRequest, ListSecurityRecipesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityZonesResponse> listSecurityZones(
            ListSecurityZonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityZonesRequest, ListSecurityZonesResponse>
                    handler) {
        LOG.trace("Called async listSecurityZones");
        final ListSecurityZonesRequest interceptedRequest =
                ListSecurityZonesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityZonesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSecurityZones",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZoneCollection/ListSecurityZones");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityZonesResponse>
                transformer =
                        ListSecurityZonesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSecurityZonesRequest, ListSecurityZonesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityZonesRequest, ListSecurityZonesResponse>,
                        java.util.concurrent.Future<ListSecurityZonesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityZonesRequest, ListSecurityZonesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSightingEndpointsResponse> listSightingEndpoints(
            ListSightingEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSightingEndpointsRequest, ListSightingEndpointsResponse>
                    handler) {
        LOG.trace("Called async listSightingEndpoints");
        final ListSightingEndpointsRequest interceptedRequest =
                ListSightingEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSightingEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSightingEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingEndpointSummary/ListSightingEndpoints");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSightingEndpointsResponse>
                transformer =
                        ListSightingEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSightingEndpointsRequest, ListSightingEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSightingEndpointsRequest, ListSightingEndpointsResponse>,
                        java.util.concurrent.Future<ListSightingEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSightingEndpointsRequest, ListSightingEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSightingImpactedResourcesResponse>
            listSightingImpactedResources(
                    ListSightingImpactedResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSightingImpactedResourcesRequest,
                                    ListSightingImpactedResourcesResponse>
                            handler) {
        LOG.trace("Called async listSightingImpactedResources");
        final ListSightingImpactedResourcesRequest interceptedRequest =
                ListSightingImpactedResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSightingImpactedResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSightingImpactedResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingImpactedResourceSummary/ListSightingImpactedResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSightingImpactedResourcesResponse>
                transformer =
                        ListSightingImpactedResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSightingImpactedResourcesRequest, ListSightingImpactedResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSightingImpactedResourcesRequest,
                                ListSightingImpactedResourcesResponse>,
                        java.util.concurrent.Future<ListSightingImpactedResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSightingImpactedResourcesRequest, ListSightingImpactedResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSightingsResponse> listSightings(
            ListSightingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSightingsRequest, ListSightingsResponse>
                    handler) {
        LOG.trace("Called async listSightings");
        final ListSightingsRequest interceptedRequest =
                ListSightingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSightingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListSightings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SightingSummary/ListSightings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSightingsResponse>
                transformer =
                        ListSightingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSightingsRequest, ListSightingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSightingsRequest, ListSightingsResponse>,
                        java.util.concurrent.Future<ListSightingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSightingsRequest, ListSightingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTacticsResponse> listTactics(
            ListTacticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTacticsRequest, ListTacticsResponse>
                    handler) {
        LOG.trace("Called async listTactics");
        final ListTacticsRequest interceptedRequest =
                ListTacticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTacticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTactics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TacticSummary/ListTactics");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTacticsResponse>
                transformer =
                        ListTacticsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTacticsRequest, ListTacticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTacticsRequest, ListTacticsResponse>,
                        java.util.concurrent.Future<ListTacticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTacticsRequest, ListTacticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRules(
                    ListTargetDetectorRecipeDetectorRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetDetectorRecipeDetectorRulesRequest,
                                    ListTargetDetectorRecipeDetectorRulesResponse>
                            handler) {
        LOG.trace("Called async listTargetDetectorRecipeDetectorRules");
        final ListTargetDetectorRecipeDetectorRulesRequest interceptedRequest =
                ListTargetDetectorRecipeDetectorRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDetectorRecipeDetectorRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTargetDetectorRecipeDetectorRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/ListTargetDetectorRecipeDetectorRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTargetDetectorRecipeDetectorRulesResponse>
                transformer =
                        ListTargetDetectorRecipeDetectorRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDetectorRecipeDetectorRulesRequest,
                                ListTargetDetectorRecipeDetectorRulesResponse>,
                        java.util.concurrent.Future<ListTargetDetectorRecipeDetectorRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDetectorRecipeDetectorRulesRequest,
                    ListTargetDetectorRecipeDetectorRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetDetectorRecipesResponse> listTargetDetectorRecipes(
            ListTargetDetectorRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                    handler) {
        LOG.trace("Called async listTargetDetectorRecipes");
        final ListTargetDetectorRecipesRequest interceptedRequest =
                ListTargetDetectorRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDetectorRecipesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTargetDetectorRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/ListTargetDetectorRecipes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTargetDetectorRecipesResponse>
                transformer =
                        ListTargetDetectorRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetDetectorRecipesRequest,
                                ListTargetDetectorRecipesResponse>,
                        java.util.concurrent.Future<ListTargetDetectorRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRules(
                    ListTargetResponderRecipeResponderRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipeResponderRulesRequest,
                                    ListTargetResponderRecipeResponderRulesResponse>
                            handler) {
        LOG.trace("Called async listTargetResponderRecipeResponderRules");
        final ListTargetResponderRecipeResponderRulesRequest interceptedRequest =
                ListTargetResponderRecipeResponderRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetResponderRecipeResponderRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTargetResponderRecipeResponderRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/ListTargetResponderRecipeResponderRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTargetResponderRecipeResponderRulesResponse>
                transformer =
                        ListTargetResponderRecipeResponderRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetResponderRecipeResponderRulesRequest,
                                ListTargetResponderRecipeResponderRulesResponse>,
                        java.util.concurrent.Future<
                                ListTargetResponderRecipeResponderRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetResponderRecipeResponderRulesRequest,
                    ListTargetResponderRecipeResponderRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetResponderRecipesResponse>
            listTargetResponderRecipes(
                    ListTargetResponderRecipesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetResponderRecipesRequest,
                                    ListTargetResponderRecipesResponse>
                            handler) {
        LOG.trace("Called async listTargetResponderRecipes");
        final ListTargetResponderRecipesRequest interceptedRequest =
                ListTargetResponderRecipesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetResponderRecipesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTargetResponderRecipes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/ListTargetResponderRecipes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTargetResponderRecipesResponse>
                transformer =
                        ListTargetResponderRecipesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetResponderRecipesRequest,
                                ListTargetResponderRecipesResponse>,
                        java.util.concurrent.Future<ListTargetResponderRecipesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResponse> listTargets(
            ListTargetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                    handler) {
        LOG.trace("Called async listTargets");
        final ListTargetsRequest interceptedRequest =
                ListTargetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTargets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/ListTargets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTargetsResponse>
                transformer =
                        ListTargetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTargetsRequest, ListTargetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTargetsRequest, ListTargetsResponse>,
                        java.util.concurrent.Future<ListTargetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTargetsRequest, ListTargetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTechniquesResponse> listTechniques(
            ListTechniquesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTechniquesRequest, ListTechniquesResponse>
                    handler) {
        LOG.trace("Called async listTechniques");
        final ListTechniquesRequest interceptedRequest =
                ListTechniquesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTechniquesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListTechniques",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TechniqueSummary/ListTechniques");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTechniquesResponse>
                transformer =
                        ListTechniquesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTechniquesRequest, ListTechniquesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTechniquesRequest, ListTechniquesResponse>,
                        java.util.concurrent.Future<ListTechniquesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTechniquesRequest, ListTechniquesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWlpAgentsResponse> listWlpAgents(
            ListWlpAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWlpAgentsRequest, ListWlpAgentsResponse>
                    handler) {
        LOG.trace("Called async listWlpAgents");
        final ListWlpAgentsRequest interceptedRequest =
                ListWlpAgentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWlpAgentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "ListWlpAgents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WlpAgent/ListWlpAgents");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWlpAgentsResponse>
                transformer =
                        ListWlpAgentsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWlpAgentsRequest, ListWlpAgentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWlpAgentsRequest, ListWlpAgentsResponse>,
                        java.util.concurrent.Future<ListWlpAgentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWlpAgentsRequest, ListWlpAgentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "CloudGuard",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequestError/ListWorkRequestErrors");
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
                        "CloudGuard",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "CloudGuard",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RemoveCompartmentResponse> removeCompartment(
            RemoveCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCompartmentRequest, RemoveCompartmentResponse>
                    handler) {
        LOG.trace("Called async removeCompartment");
        final RemoveCompartmentRequest interceptedRequest =
                RemoveCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RemoveCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/RemoveCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveCompartmentResponse>
                transformer =
                        RemoveCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveCompartmentRequest, RemoveCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveCompartmentRequest, RemoveCompartmentResponse>,
                        java.util.concurrent.Future<RemoveCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveCompartmentRequest, RemoveCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestRiskScoresResponse> requestRiskScores(
            RequestRiskScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestRiskScoresRequest, RequestRiskScoresResponse>
                    handler) {
        LOG.trace("Called async requestRiskScores");
        final RequestRiskScoresRequest interceptedRequest =
                RequestRiskScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestRiskScoresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestRiskScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RiskScoreAggregation/RequestRiskScores");
        final java.util.function.Function<javax.ws.rs.core.Response, RequestRiskScoresResponse>
                transformer =
                        RequestRiskScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RequestRiskScoresRequest, RequestRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestRiskScoresRequest, RequestRiskScoresResponse>,
                        java.util.concurrent.Future<RequestRiskScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestRiskScoresRequest, RequestRiskScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>
            requestSecurityScoreSummarizedTrend(
                    RequestSecurityScoreSummarizedTrendRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSecurityScoreSummarizedTrendRequest,
                                    RequestSecurityScoreSummarizedTrendResponse>
                            handler) {
        LOG.trace("Called async requestSecurityScoreSummarizedTrend");
        final RequestSecurityScoreSummarizedTrendRequest interceptedRequest =
                RequestSecurityScoreSummarizedTrendConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSecurityScoreSummarizedTrendConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSecurityScoreSummarizedTrend",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreTrendAggregation/RequestSecurityScoreSummarizedTrend");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSecurityScoreSummarizedTrendResponse>
                transformer =
                        RequestSecurityScoreSummarizedTrendConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSecurityScoreSummarizedTrendRequest,
                        RequestSecurityScoreSummarizedTrendResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSecurityScoreSummarizedTrendRequest,
                                RequestSecurityScoreSummarizedTrendResponse>,
                        java.util.concurrent.Future<RequestSecurityScoreSummarizedTrendResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSecurityScoreSummarizedTrendRequest,
                    RequestSecurityScoreSummarizedTrendResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSecurityScoresResponse> requestSecurityScores(
            RequestSecurityScoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                    handler) {
        LOG.trace("Called async requestSecurityScores");
        final RequestSecurityScoresRequest interceptedRequest =
                RequestSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSecurityScoresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSecurityScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreAggregation/RequestSecurityScores");
        final java.util.function.Function<javax.ws.rs.core.Response, RequestSecurityScoresResponse>
                transformer =
                        RequestSecurityScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSecurityScoresRequest, RequestSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSecurityScoresRequest, RequestSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSecurityScoresRequest, RequestSecurityScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>
            requestSummarizedActivityProblems(
                    RequestSummarizedActivityProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedActivityProblemsRequest,
                                    RequestSummarizedActivityProblemsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedActivityProblems");
        final RequestSummarizedActivityProblemsRequest interceptedRequest =
                RequestSummarizedActivityProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedActivityProblemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedActivityProblems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ActivityProblemAggregation/RequestSummarizedActivityProblems");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedActivityProblemsResponse>
                transformer =
                        RequestSummarizedActivityProblemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedActivityProblemsRequest,
                        RequestSummarizedActivityProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedActivityProblemsRequest,
                                RequestSummarizedActivityProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedActivityProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedActivityProblemsRequest,
                    RequestSummarizedActivityProblemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedProblemsResponse> requestSummarizedProblems(
            RequestSummarizedProblemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                    handler) {
        LOG.trace("Called async requestSummarizedProblems");
        final RequestSummarizedProblemsRequest interceptedRequest =
                RequestSummarizedProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedProblemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedProblems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemAggregation/RequestSummarizedProblems");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedProblemsResponse>
                transformer =
                        RequestSummarizedProblemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedProblemsRequest,
                                RequestSummarizedProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedProblemsRequest, RequestSummarizedProblemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>
            requestSummarizedResponderExecutions(
                    RequestSummarizedResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedResponderExecutionsRequest,
                                    RequestSummarizedResponderExecutionsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedResponderExecutions");
        final RequestSummarizedResponderExecutionsRequest interceptedRequest =
                RequestSummarizedResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedResponderExecutionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedResponderExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionAggregation/RequestSummarizedResponderExecutions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedResponderExecutionsResponse>
                transformer =
                        RequestSummarizedResponderExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedResponderExecutionsRequest,
                        RequestSummarizedResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedResponderExecutionsRequest,
                                RequestSummarizedResponderExecutionsResponse>,
                        java.util.concurrent.Future<RequestSummarizedResponderExecutionsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedResponderExecutionsRequest,
                    RequestSummarizedResponderExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedRiskScoresResponse>
            requestSummarizedRiskScores(
                    RequestSummarizedRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedRiskScoresRequest,
                                    RequestSummarizedRiskScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedRiskScores");
        final RequestSummarizedRiskScoresRequest interceptedRequest =
                RequestSummarizedRiskScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedRiskScoresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedRiskScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/RiskScoreAggregation/RequestSummarizedRiskScores");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedRiskScoresResponse>
                transformer =
                        RequestSummarizedRiskScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedRiskScoresRequest, RequestSummarizedRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedRiskScoresRequest,
                                RequestSummarizedRiskScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedRiskScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedRiskScoresRequest, RequestSummarizedRiskScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>
            requestSummarizedSecurityScores(
                    RequestSummarizedSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedSecurityScoresRequest,
                                    RequestSummarizedSecurityScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedSecurityScores");
        final RequestSummarizedSecurityScoresRequest interceptedRequest =
                RequestSummarizedSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedSecurityScoresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedSecurityScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreAggregation/RequestSummarizedSecurityScores");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedSecurityScoresResponse>
                transformer =
                        RequestSummarizedSecurityScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedSecurityScoresRequest,
                        RequestSummarizedSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedSecurityScoresRequest,
                                RequestSummarizedSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedSecurityScoresRequest,
                    RequestSummarizedSecurityScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
            requestSummarizedTopTrendResourceProfileRiskScores(
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                                    RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTopTrendResourceProfileRiskScores");
        final RequestSummarizedTopTrendResourceProfileRiskScoresRequest interceptedRequest =
                RequestSummarizedTopTrendResourceProfileRiskScoresConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTopTrendResourceProfileRiskScoresConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedTopTrendResourceProfileRiskScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceProfileRiskScoreAggregationSummary/RequestSummarizedTopTrendResourceProfileRiskScores");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
                transformer =
                        RequestSummarizedTopTrendResourceProfileRiskScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                        RequestSummarizedTopTrendResourceProfileRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                                RequestSummarizedTopTrendResourceProfileRiskScoresResponse>,
                        java.util.concurrent.Future<
                                RequestSummarizedTopTrendResourceProfileRiskScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTopTrendResourceProfileRiskScoresRequest,
                    RequestSummarizedTopTrendResourceProfileRiskScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>
            requestSummarizedTrendProblems(
                    RequestSummarizedTrendProblemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendProblemsRequest,
                                    RequestSummarizedTrendProblemsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendProblems");
        final RequestSummarizedTrendProblemsRequest interceptedRequest =
                RequestSummarizedTrendProblemsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendProblemsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendProblems",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ProblemTrendAggregation/RequestSummarizedTrendProblems");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedTrendProblemsResponse>
                transformer =
                        RequestSummarizedTrendProblemsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendProblemsRequest,
                        RequestSummarizedTrendProblemsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendProblemsRequest,
                                RequestSummarizedTrendProblemsResponse>,
                        java.util.concurrent.Future<RequestSummarizedTrendProblemsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendProblemsRequest, RequestSummarizedTrendProblemsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendResourceRiskScoresResponse>
            requestSummarizedTrendResourceRiskScores(
                    RequestSummarizedTrendResourceRiskScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResourceRiskScoresRequest,
                                    RequestSummarizedTrendResourceRiskScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendResourceRiskScores");
        final RequestSummarizedTrendResourceRiskScoresRequest interceptedRequest =
                RequestSummarizedTrendResourceRiskScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendResourceRiskScoresConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendResourceRiskScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResourceRiskScoreAggregation/RequestSummarizedTrendResourceRiskScores");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedTrendResourceRiskScoresResponse>
                transformer =
                        RequestSummarizedTrendResourceRiskScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendResourceRiskScoresRequest,
                        RequestSummarizedTrendResourceRiskScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendResourceRiskScoresRequest,
                                RequestSummarizedTrendResourceRiskScoresResponse>,
                        java.util.concurrent.Future<
                                RequestSummarizedTrendResourceRiskScoresResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRequestSummarizedTrendResourceRiskScoresDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendResourceRiskScoresRequest,
                    RequestSummarizedTrendResourceRiskScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendResponderExecutionsResponse>
            requestSummarizedTrendResponderExecutions(
                    RequestSummarizedTrendResponderExecutionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendResponderExecutionsRequest,
                                    RequestSummarizedTrendResponderExecutionsResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendResponderExecutions");
        final RequestSummarizedTrendResponderExecutionsRequest interceptedRequest =
                RequestSummarizedTrendResponderExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendResponderExecutionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendResponderExecutions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecutionTrendAggregation/RequestSummarizedTrendResponderExecutions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RequestSummarizedTrendResponderExecutionsResponse>
                transformer =
                        RequestSummarizedTrendResponderExecutionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendResponderExecutionsRequest,
                        RequestSummarizedTrendResponderExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendResponderExecutionsRequest,
                                RequestSummarizedTrendResponderExecutionsResponse>,
                        java.util.concurrent.Future<
                                RequestSummarizedTrendResponderExecutionsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendResponderExecutionsRequest,
                    RequestSummarizedTrendResponderExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>
            requestSummarizedTrendSecurityScores(
                    RequestSummarizedTrendSecurityScoresRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedTrendSecurityScoresRequest,
                                    RequestSummarizedTrendSecurityScoresResponse>
                            handler) {
        LOG.trace("Called async requestSummarizedTrendSecurityScores");
        final RequestSummarizedTrendSecurityScoresRequest interceptedRequest =
                RequestSummarizedTrendSecurityScoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestSummarizedTrendSecurityScoresConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "RequestSummarizedTrendSecurityScores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityScoreTrendAggregation/RequestSummarizedTrendSecurityScores");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestSummarizedTrendSecurityScoresResponse>
                transformer =
                        RequestSummarizedTrendSecurityScoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestSummarizedTrendSecurityScoresRequest,
                        RequestSummarizedTrendSecurityScoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestSummarizedTrendSecurityScoresRequest,
                                RequestSummarizedTrendSecurityScoresResponse>,
                        java.util.concurrent.Future<RequestSummarizedTrendSecurityScoresResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestSummarizedTrendSecurityScoresRequest,
                    RequestSummarizedTrendSecurityScoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SkipBulkResponderExecutionResponse>
            skipBulkResponderExecution(
                    SkipBulkResponderExecutionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SkipBulkResponderExecutionRequest,
                                    SkipBulkResponderExecutionResponse>
                            handler) {
        LOG.trace("Called async skipBulkResponderExecution");
        final SkipBulkResponderExecutionRequest interceptedRequest =
                SkipBulkResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipBulkResponderExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "SkipBulkResponderExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/SkipBulkResponderExecution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SkipBulkResponderExecutionResponse>
                transformer =
                        SkipBulkResponderExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SkipBulkResponderExecutionRequest, SkipBulkResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SkipBulkResponderExecutionRequest,
                                SkipBulkResponderExecutionResponse>,
                        java.util.concurrent.Future<SkipBulkResponderExecutionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSkipBulkResponderExecutionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SkipBulkResponderExecutionRequest, SkipBulkResponderExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SkipResponderExecutionResponse> skipResponderExecution(
            SkipResponderExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                    handler) {
        LOG.trace("Called async skipResponderExecution");
        final SkipResponderExecutionRequest interceptedRequest =
                SkipResponderExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipResponderExecutionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "SkipResponderExecution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderExecution/SkipResponderExecution");
        final java.util.function.Function<javax.ws.rs.core.Response, SkipResponderExecutionResponse>
                transformer =
                        SkipResponderExecutionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SkipResponderExecutionRequest, SkipResponderExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SkipResponderExecutionRequest, SkipResponderExecutionResponse>,
                        java.util.concurrent.Future<SkipResponderExecutionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SkipResponderExecutionRequest, SkipResponderExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TriggerResponderResponse> triggerResponder(
            TriggerResponderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TriggerResponderRequest, TriggerResponderResponse>
                    handler) {
        LOG.trace("Called async triggerResponder");
        final TriggerResponderRequest interceptedRequest =
                TriggerResponderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TriggerResponderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "TriggerResponder",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/TriggerResponder");
        final java.util.function.Function<javax.ws.rs.core.Response, TriggerResponderResponse>
                transformer =
                        TriggerResponderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<TriggerResponderRequest, TriggerResponderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TriggerResponderRequest, TriggerResponderResponse>,
                        java.util.concurrent.Future<TriggerResponderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTriggerResponderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TriggerResponderRequest, TriggerResponderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBulkProblemStatusResponse> updateBulkProblemStatus(
            UpdateBulkProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                    handler) {
        LOG.trace("Called async updateBulkProblemStatus");
        final UpdateBulkProblemStatusRequest interceptedRequest =
                UpdateBulkProblemStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBulkProblemStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateBulkProblemStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/UpdateBulkProblemStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateBulkProblemStatusResponse>
                transformer =
                        UpdateBulkProblemStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>,
                        java.util.concurrent.Future<UpdateBulkProblemStatusResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBulkProblemStatusDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBulkProblemStatusRequest, UpdateBulkProblemStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {
        LOG.trace("Called async updateConfiguration");
        final UpdateConfigurationRequest interceptedRequest =
                UpdateConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Configuration/UpdateConfiguration");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateConfigurationResponse>
                transformer =
                        UpdateConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateConfigurationRequest, UpdateConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConfigurationRequest, UpdateConfigurationResponse>,
                        java.util.concurrent.Future<UpdateConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConfigurationRequest, UpdateConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataMaskRuleResponse> updateDataMaskRule(
            UpdateDataMaskRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>
                    handler) {
        LOG.trace("Called async updateDataMaskRule");
        final UpdateDataMaskRuleRequest interceptedRequest =
                UpdateDataMaskRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataMaskRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateDataMaskRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataMaskRule/UpdateDataMaskRule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDataMaskRuleResponse>
                transformer =
                        UpdateDataMaskRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>,
                        java.util.concurrent.Future<UpdateDataMaskRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataMaskRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataMaskRuleRequest, UpdateDataMaskRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResponse> updateDataSource(
            UpdateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataSourceRequest, UpdateDataSourceResponse>
                    handler) {
        LOG.trace("Called async updateDataSource");
        final UpdateDataSourceRequest interceptedRequest =
                UpdateDataSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateDataSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DataSource/UpdateDataSource");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDataSourceResponse>
                transformer =
                        UpdateDataSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataSourceRequest, UpdateDataSourceResponse>,
                        java.util.concurrent.Future<UpdateDataSourceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataSourceRequest, UpdateDataSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorRecipeResponse> updateDetectorRecipe(
            UpdateDetectorRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                    handler) {
        LOG.trace("Called async updateDetectorRecipe");
        final UpdateDetectorRecipeRequest interceptedRequest =
                UpdateDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipe/UpdateDetectorRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDetectorRecipeResponse>
                transformer =
                        UpdateDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>,
                        java.util.concurrent.Future<UpdateDetectorRecipeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDetectorRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDetectorRecipeRequest, UpdateDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>
            updateDetectorRecipeDetectorRule(
                    UpdateDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDetectorRecipeDetectorRuleRequest,
                                    UpdateDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async updateDetectorRecipeDetectorRule");
        final UpdateDetectorRecipeDetectorRuleRequest interceptedRequest =
                UpdateDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDetectorRecipeDetectorRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/DetectorRecipeDetectorRule/UpdateDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDetectorRecipeDetectorRuleResponse>
                transformer =
                        UpdateDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDetectorRecipeDetectorRuleRequest,
                        UpdateDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDetectorRecipeDetectorRuleRequest,
                                UpdateDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<UpdateDetectorRecipeDetectorRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDetectorRecipeDetectorRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDetectorRecipeDetectorRuleRequest,
                    UpdateDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedListResponse> updateManagedList(
            UpdateManagedListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedListRequest, UpdateManagedListResponse>
                    handler) {
        LOG.trace("Called async updateManagedList");
        final UpdateManagedListRequest interceptedRequest =
                UpdateManagedListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateManagedList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ManagedList/UpdateManagedList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateManagedListResponse>
                transformer =
                        UpdateManagedListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateManagedListRequest, UpdateManagedListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedListRequest, UpdateManagedListResponse>,
                        java.util.concurrent.Future<UpdateManagedListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedListRequest, UpdateManagedListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateProblemStatusResponse> updateProblemStatus(
            UpdateProblemStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                    handler) {
        LOG.trace("Called async updateProblemStatus");
        final UpdateProblemStatusRequest interceptedRequest =
                UpdateProblemStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProblemStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateProblemStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Problem/UpdateProblemStatus");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateProblemStatusResponse>
                transformer =
                        UpdateProblemStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateProblemStatusRequest, UpdateProblemStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProblemStatusRequest, UpdateProblemStatusResponse>,
                        java.util.concurrent.Future<UpdateProblemStatusResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProblemStatusDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProblemStatusRequest, UpdateProblemStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResponderRecipeResponse> updateResponderRecipe(
            UpdateResponderRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                    handler) {
        LOG.trace("Called async updateResponderRecipe");
        final UpdateResponderRecipeRequest interceptedRequest =
                UpdateResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipe/UpdateResponderRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateResponderRecipeResponse>
                transformer =
                        UpdateResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>,
                        java.util.concurrent.Future<UpdateResponderRecipeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateResponderRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResponderRecipeRequest, UpdateResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>
            updateResponderRecipeResponderRule(
                    UpdateResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResponderRecipeResponderRuleRequest,
                                    UpdateResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async updateResponderRecipeResponderRule");
        final UpdateResponderRecipeResponderRuleRequest interceptedRequest =
                UpdateResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResponderRecipeResponderRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateResponderRecipeResponderRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/ResponderRecipeResponderRule/UpdateResponderRecipeResponderRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateResponderRecipeResponderRuleResponse>
                transformer =
                        UpdateResponderRecipeResponderRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResponderRecipeResponderRuleRequest,
                        UpdateResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResponderRecipeResponderRuleRequest,
                                UpdateResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<UpdateResponderRecipeResponderRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateResponderRecipeResponderRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResponderRecipeResponderRuleRequest,
                    UpdateResponderRecipeResponderRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSavedQueryResponse> updateSavedQuery(
            UpdateSavedQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSavedQueryRequest, UpdateSavedQueryResponse>
                    handler) {
        LOG.trace("Called async updateSavedQuery");
        final UpdateSavedQueryRequest interceptedRequest =
                UpdateSavedQueryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSavedQueryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateSavedQuery",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SavedQuery/UpdateSavedQuery");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSavedQueryResponse>
                transformer =
                        UpdateSavedQueryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSavedQueryRequest, UpdateSavedQueryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSavedQueryRequest, UpdateSavedQueryResponse>,
                        java.util.concurrent.Future<UpdateSavedQueryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSavedQueryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSavedQueryRequest, UpdateSavedQueryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityRecipeResponse> updateSecurityRecipe(
            UpdateSecurityRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>
                    handler) {
        LOG.trace("Called async updateSecurityRecipe");
        final UpdateSecurityRecipeRequest interceptedRequest =
                UpdateSecurityRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateSecurityRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityRecipe/UpdateSecurityRecipe");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityRecipeResponse>
                transformer =
                        UpdateSecurityRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>,
                        java.util.concurrent.Future<UpdateSecurityRecipeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityRecipeRequest, UpdateSecurityRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityZoneResponse> updateSecurityZone(
            UpdateSecurityZoneRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>
                    handler) {
        LOG.trace("Called async updateSecurityZone");
        final UpdateSecurityZoneRequest interceptedRequest =
                UpdateSecurityZoneConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityZoneConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateSecurityZone",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/SecurityZone/UpdateSecurityZone");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityZoneResponse>
                transformer =
                        UpdateSecurityZoneConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>,
                        java.util.concurrent.Future<UpdateSecurityZoneResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityZoneDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityZoneRequest, UpdateSecurityZoneResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponse> updateTarget(
            UpdateTargetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                    handler) {
        LOG.trace("Called async updateTarget");
        final UpdateTargetRequest interceptedRequest =
                UpdateTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateTarget",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/Target/UpdateTarget");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTargetResponse>
                transformer =
                        UpdateTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTargetRequest, UpdateTargetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetRequest, UpdateTargetResponse>,
                        java.util.concurrent.Future<UpdateTargetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetRequest, UpdateTargetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse>
            updateTargetDetectorRecipe(
                    UpdateTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeRequest,
                                    UpdateTargetDetectorRecipeResponse>
                            handler) {
        LOG.trace("Called async updateTargetDetectorRecipe");
        final UpdateTargetDetectorRecipeRequest interceptedRequest =
                UpdateTargetDetectorRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDetectorRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateTargetDetectorRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipe/UpdateTargetDetectorRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTargetDetectorRecipeResponse>
                transformer =
                        UpdateTargetDetectorRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDetectorRecipeRequest, UpdateTargetDetectorRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDetectorRecipeRequest,
                                UpdateTargetDetectorRecipeResponse>,
                        java.util.concurrent.Future<UpdateTargetDetectorRecipeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetDetectorRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDetectorRecipeRequest, UpdateTargetDetectorRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>
            updateTargetDetectorRecipeDetectorRule(
                    UpdateTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                                    UpdateTargetDetectorRecipeDetectorRuleResponse>
                            handler) {
        LOG.trace("Called async updateTargetDetectorRecipeDetectorRule");
        final UpdateTargetDetectorRecipeDetectorRuleRequest interceptedRequest =
                UpdateTargetDetectorRecipeDetectorRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDetectorRecipeDetectorRuleConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateTargetDetectorRecipeDetectorRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetDetectorRecipeDetectorRule/UpdateTargetDetectorRecipeDetectorRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTargetDetectorRecipeDetectorRuleResponse>
                transformer =
                        UpdateTargetDetectorRecipeDetectorRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetDetectorRecipeDetectorRuleRequest,
                        UpdateTargetDetectorRecipeDetectorRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetDetectorRecipeDetectorRuleRequest,
                                UpdateTargetDetectorRecipeDetectorRuleResponse>,
                        java.util.concurrent.Future<UpdateTargetDetectorRecipeDetectorRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateTargetDetectorRecipeDetectorRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetDetectorRecipeDetectorRuleRequest,
                    UpdateTargetDetectorRecipeDetectorRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponse>
            updateTargetResponderRecipe(
                    UpdateTargetResponderRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeRequest,
                                    UpdateTargetResponderRecipeResponse>
                            handler) {
        LOG.trace("Called async updateTargetResponderRecipe");
        final UpdateTargetResponderRecipeRequest interceptedRequest =
                UpdateTargetResponderRecipeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetResponderRecipeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateTargetResponderRecipe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipe/UpdateTargetResponderRecipe");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTargetResponderRecipeResponse>
                transformer =
                        UpdateTargetResponderRecipeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetResponderRecipeRequest, UpdateTargetResponderRecipeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetResponderRecipeRequest,
                                UpdateTargetResponderRecipeResponse>,
                        java.util.concurrent.Future<UpdateTargetResponderRecipeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTargetResponderRecipeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetResponderRecipeRequest, UpdateTargetResponderRecipeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTargetResponderRecipeResponderRuleResponse>
            updateTargetResponderRecipeResponderRule(
                    UpdateTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetResponderRecipeResponderRuleRequest,
                                    UpdateTargetResponderRecipeResponderRuleResponse>
                            handler) {
        LOG.trace("Called async updateTargetResponderRecipeResponderRule");
        final UpdateTargetResponderRecipeResponderRuleRequest interceptedRequest =
                UpdateTargetResponderRecipeResponderRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetResponderRecipeResponderRuleConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateTargetResponderRecipeResponderRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/TargetResponderRecipeResponderRule/UpdateTargetResponderRecipeResponderRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTargetResponderRecipeResponderRuleResponse>
                transformer =
                        UpdateTargetResponderRecipeResponderRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTargetResponderRecipeResponderRuleRequest,
                        UpdateTargetResponderRecipeResponderRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTargetResponderRecipeResponderRuleRequest,
                                UpdateTargetResponderRecipeResponderRuleResponse>,
                        java.util.concurrent.Future<
                                UpdateTargetResponderRecipeResponderRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateTargetResponderRecipeResponderRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTargetResponderRecipeResponderRuleRequest,
                    UpdateTargetResponderRecipeResponderRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateWlpAgentResponse> updateWlpAgent(
            UpdateWlpAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWlpAgentRequest, UpdateWlpAgentResponse>
                    handler) {
        LOG.trace("Called async updateWlpAgent");
        final UpdateWlpAgentRequest interceptedRequest =
                UpdateWlpAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWlpAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CloudGuard",
                        "UpdateWlpAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/cloud-guard/20200131/WlpAgent/UpdateWlpAgent");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateWlpAgentResponse>
                transformer =
                        UpdateWlpAgentConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateWlpAgentRequest, UpdateWlpAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWlpAgentRequest, UpdateWlpAgentResponse>,
                        java.util.concurrent.Future<UpdateWlpAgentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWlpAgentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWlpAgentRequest, UpdateWlpAgentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
