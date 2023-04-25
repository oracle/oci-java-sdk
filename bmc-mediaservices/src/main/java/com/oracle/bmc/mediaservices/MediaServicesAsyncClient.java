/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.internal.http.*;
import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

/**
 * Async client implementation for MediaServices service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesAsyncClient implements MediaServicesAsync {
    /**
     * Service instance for MediaServices.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MEDIASERVICES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://mediaservices.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MediaServicesAsyncClient.class);

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
    public MediaServicesAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
    public MediaServicesAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MediaServicesAsyncClient> {
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
        public MediaServicesAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new MediaServicesAsyncClient(
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
    public java.util.concurrent.Future<ChangeMediaAssetCompartmentResponse>
            changeMediaAssetCompartment(
                    ChangeMediaAssetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaAssetCompartmentRequest,
                                    ChangeMediaAssetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMediaAssetCompartment");
        final ChangeMediaAssetCompartmentRequest interceptedRequest =
                ChangeMediaAssetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaAssetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaAssetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/ChangeMediaAssetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMediaAssetCompartmentResponse>
                transformer =
                        ChangeMediaAssetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMediaAssetCompartmentRequest, ChangeMediaAssetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMediaAssetCompartmentRequest,
                                ChangeMediaAssetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMediaAssetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMediaAssetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMediaAssetCompartmentRequest, ChangeMediaAssetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowCompartmentResponse>
            changeMediaWorkflowCompartment(
                    ChangeMediaWorkflowCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowCompartmentRequest,
                                    ChangeMediaWorkflowCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMediaWorkflowCompartment");
        final ChangeMediaWorkflowCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ChangeMediaWorkflowCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMediaWorkflowCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMediaWorkflowCompartmentRequest,
                        ChangeMediaWorkflowCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMediaWorkflowCompartmentRequest,
                                ChangeMediaWorkflowCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMediaWorkflowCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMediaWorkflowCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMediaWorkflowCompartmentRequest, ChangeMediaWorkflowCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowConfigurationCompartmentResponse>
            changeMediaWorkflowConfigurationCompartment(
                    ChangeMediaWorkflowConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowConfigurationCompartmentRequest,
                                    ChangeMediaWorkflowConfigurationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMediaWorkflowConfigurationCompartment");
        final ChangeMediaWorkflowConfigurationCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowConfigurationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowConfigurationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowConfigurationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/ChangeMediaWorkflowConfigurationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeMediaWorkflowConfigurationCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowConfigurationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMediaWorkflowConfigurationCompartmentRequest,
                        ChangeMediaWorkflowConfigurationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMediaWorkflowConfigurationCompartmentRequest,
                                ChangeMediaWorkflowConfigurationCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeMediaWorkflowConfigurationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMediaWorkflowConfigurationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMediaWorkflowConfigurationCompartmentRequest,
                    ChangeMediaWorkflowConfigurationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMediaWorkflowJobCompartmentResponse>
            changeMediaWorkflowJobCompartment(
                    ChangeMediaWorkflowJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMediaWorkflowJobCompartmentRequest,
                                    ChangeMediaWorkflowJobCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMediaWorkflowJobCompartment");
        final ChangeMediaWorkflowJobCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/ChangeMediaWorkflowJobCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMediaWorkflowJobCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMediaWorkflowJobCompartmentRequest,
                        ChangeMediaWorkflowJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMediaWorkflowJobCompartmentRequest,
                                ChangeMediaWorkflowJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMediaWorkflowJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMediaWorkflowJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMediaWorkflowJobCompartmentRequest,
                    ChangeMediaWorkflowJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamDistributionChannelCompartmentResponse>
            changeStreamDistributionChannelCompartment(
                    ChangeStreamDistributionChannelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamDistributionChannelCompartmentRequest,
                                    ChangeStreamDistributionChannelCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeStreamDistributionChannelCompartment");
        final ChangeStreamDistributionChannelCompartmentRequest interceptedRequest =
                ChangeStreamDistributionChannelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeStreamDistributionChannelCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeStreamDistributionChannelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/ChangeStreamDistributionChannelCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeStreamDistributionChannelCompartmentResponse>
                transformer =
                        ChangeStreamDistributionChannelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeStreamDistributionChannelCompartmentRequest,
                        ChangeStreamDistributionChannelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeStreamDistributionChannelCompartmentRequest,
                                ChangeStreamDistributionChannelCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeStreamDistributionChannelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeStreamDistributionChannelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeStreamDistributionChannelCompartmentRequest,
                    ChangeStreamDistributionChannelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMediaAssetResponse> createMediaAsset(
            CreateMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaAssetRequest, CreateMediaAssetResponse>
                    handler) {
        LOG.trace("Called async createMediaAsset");
        final CreateMediaAssetRequest interceptedRequest =
                CreateMediaAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/CreateMediaAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMediaAssetResponse>
                transformer =
                        CreateMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMediaAssetRequest, CreateMediaAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMediaAssetRequest, CreateMediaAssetResponse>,
                        java.util.concurrent.Future<CreateMediaAssetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMediaAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMediaAssetRequest, CreateMediaAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowResponse> createMediaWorkflow(
            CreateMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>
                    handler) {
        LOG.trace("Called async createMediaWorkflow");
        final CreateMediaWorkflowRequest interceptedRequest =
                CreateMediaWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/CreateMediaWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMediaWorkflowResponse>
                transformer =
                        CreateMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>,
                        java.util.concurrent.Future<CreateMediaWorkflowResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMediaWorkflowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMediaWorkflowRequest, CreateMediaWorkflowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowConfigurationResponse>
            createMediaWorkflowConfiguration(
                    CreateMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMediaWorkflowConfigurationRequest,
                                    CreateMediaWorkflowConfigurationResponse>
                            handler) {
        LOG.trace("Called async createMediaWorkflowConfiguration");
        final CreateMediaWorkflowConfigurationRequest interceptedRequest =
                CreateMediaWorkflowConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/CreateMediaWorkflowConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMediaWorkflowConfigurationResponse>
                transformer =
                        CreateMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMediaWorkflowConfigurationRequest,
                        CreateMediaWorkflowConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMediaWorkflowConfigurationRequest,
                                CreateMediaWorkflowConfigurationResponse>,
                        java.util.concurrent.Future<CreateMediaWorkflowConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMediaWorkflowConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMediaWorkflowConfigurationRequest,
                    CreateMediaWorkflowConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMediaWorkflowJobResponse> createMediaWorkflowJob(
            CreateMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>
                    handler) {
        LOG.trace("Called async createMediaWorkflowJob");
        final CreateMediaWorkflowJobRequest interceptedRequest =
                CreateMediaWorkflowJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/CreateMediaWorkflowJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMediaWorkflowJobResponse>
                transformer =
                        CreateMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>,
                        java.util.concurrent.Future<CreateMediaWorkflowJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMediaWorkflowJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMediaWorkflowJobRequest, CreateMediaWorkflowJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateStreamCdnConfigResponse> createStreamCdnConfig(
            CreateStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>
                    handler) {
        LOG.trace("Called async createStreamCdnConfig");
        final CreateStreamCdnConfigRequest interceptedRequest =
                CreateStreamCdnConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamCdnConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/CreateStreamCdnConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateStreamCdnConfigResponse>
                transformer =
                        CreateStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>,
                        java.util.concurrent.Future<CreateStreamCdnConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateStreamCdnConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateStreamCdnConfigRequest, CreateStreamCdnConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateStreamDistributionChannelResponse>
            createStreamDistributionChannel(
                    CreateStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateStreamDistributionChannelRequest,
                                    CreateStreamDistributionChannelResponse>
                            handler) {
        LOG.trace("Called async createStreamDistributionChannel");
        final CreateStreamDistributionChannelRequest interceptedRequest =
                CreateStreamDistributionChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/CreateStreamDistributionChannel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateStreamDistributionChannelResponse>
                transformer =
                        CreateStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateStreamDistributionChannelRequest,
                        CreateStreamDistributionChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateStreamDistributionChannelRequest,
                                CreateStreamDistributionChannelResponse>,
                        java.util.concurrent.Future<CreateStreamDistributionChannelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateStreamDistributionChannelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateStreamDistributionChannelRequest,
                    CreateStreamDistributionChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateStreamPackagingConfigResponse>
            createStreamPackagingConfig(
                    CreateStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateStreamPackagingConfigRequest,
                                    CreateStreamPackagingConfigResponse>
                            handler) {
        LOG.trace("Called async createStreamPackagingConfig");
        final CreateStreamPackagingConfigRequest interceptedRequest =
                CreateStreamPackagingConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/CreateStreamPackagingConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateStreamPackagingConfigResponse>
                transformer =
                        CreateStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateStreamPackagingConfigRequest, CreateStreamPackagingConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateStreamPackagingConfigRequest,
                                CreateStreamPackagingConfigResponse>,
                        java.util.concurrent.Future<CreateStreamPackagingConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateStreamPackagingConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateStreamPackagingConfigRequest, CreateStreamPackagingConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaAssetResponse> deleteMediaAsset(
            DeleteMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaAssetRequest, DeleteMediaAssetResponse>
                    handler) {
        LOG.trace("Called async deleteMediaAsset");
        final DeleteMediaAssetRequest interceptedRequest =
                DeleteMediaAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/DeleteMediaAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaAssetResponse>
                transformer =
                        DeleteMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMediaAssetRequest, DeleteMediaAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMediaAssetRequest, DeleteMediaAssetResponse>,
                        java.util.concurrent.Future<DeleteMediaAssetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMediaAssetRequest, DeleteMediaAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaAssetDistributionChannelAttachmentResponse>
            deleteMediaAssetDistributionChannelAttachment(
                    DeleteMediaAssetDistributionChannelAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaAssetDistributionChannelAttachmentRequest,
                                    DeleteMediaAssetDistributionChannelAttachmentResponse>
                            handler) {
        LOG.trace("Called async deleteMediaAssetDistributionChannelAttachment");
        final DeleteMediaAssetDistributionChannelAttachmentRequest interceptedRequest =
                DeleteMediaAssetDistributionChannelAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaAssetDistributionChannelAttachmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaAssetDistributionChannelAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachment/DeleteMediaAssetDistributionChannelAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteMediaAssetDistributionChannelAttachmentResponse>
                transformer =
                        DeleteMediaAssetDistributionChannelAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMediaAssetDistributionChannelAttachmentRequest,
                        DeleteMediaAssetDistributionChannelAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMediaAssetDistributionChannelAttachmentRequest,
                                DeleteMediaAssetDistributionChannelAttachmentResponse>,
                        java.util.concurrent.Future<
                                DeleteMediaAssetDistributionChannelAttachmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMediaAssetDistributionChannelAttachmentRequest,
                    DeleteMediaAssetDistributionChannelAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowResponse> deleteMediaWorkflow(
            DeleteMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>
                    handler) {
        LOG.trace("Called async deleteMediaWorkflow");
        final DeleteMediaWorkflowRequest interceptedRequest =
                DeleteMediaWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/DeleteMediaWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaWorkflowResponse>
                transformer =
                        DeleteMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>,
                        java.util.concurrent.Future<DeleteMediaWorkflowResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMediaWorkflowRequest, DeleteMediaWorkflowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowConfigurationResponse>
            deleteMediaWorkflowConfiguration(
                    DeleteMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMediaWorkflowConfigurationRequest,
                                    DeleteMediaWorkflowConfigurationResponse>
                            handler) {
        LOG.trace("Called async deleteMediaWorkflowConfiguration");
        final DeleteMediaWorkflowConfigurationRequest interceptedRequest =
                DeleteMediaWorkflowConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/DeleteMediaWorkflowConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMediaWorkflowConfigurationResponse>
                transformer =
                        DeleteMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMediaWorkflowConfigurationRequest,
                        DeleteMediaWorkflowConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMediaWorkflowConfigurationRequest,
                                DeleteMediaWorkflowConfigurationResponse>,
                        java.util.concurrent.Future<DeleteMediaWorkflowConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMediaWorkflowConfigurationRequest,
                    DeleteMediaWorkflowConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaWorkflowJobResponse> deleteMediaWorkflowJob(
            DeleteMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>
                    handler) {
        LOG.trace("Called async deleteMediaWorkflowJob");
        final DeleteMediaWorkflowJobRequest interceptedRequest =
                DeleteMediaWorkflowJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/DeleteMediaWorkflowJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaWorkflowJobResponse>
                transformer =
                        DeleteMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>,
                        java.util.concurrent.Future<DeleteMediaWorkflowJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMediaWorkflowJobRequest, DeleteMediaWorkflowJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamCdnConfigResponse> deleteStreamCdnConfig(
            DeleteStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>
                    handler) {
        LOG.trace("Called async deleteStreamCdnConfig");
        final DeleteStreamCdnConfigRequest interceptedRequest =
                DeleteStreamCdnConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamCdnConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/DeleteStreamCdnConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteStreamCdnConfigResponse>
                transformer =
                        DeleteStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>,
                        java.util.concurrent.Future<DeleteStreamCdnConfigResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteStreamCdnConfigRequest, DeleteStreamCdnConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamDistributionChannelResponse>
            deleteStreamDistributionChannel(
                    DeleteStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteStreamDistributionChannelRequest,
                                    DeleteStreamDistributionChannelResponse>
                            handler) {
        LOG.trace("Called async deleteStreamDistributionChannel");
        final DeleteStreamDistributionChannelRequest interceptedRequest =
                DeleteStreamDistributionChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/DeleteStreamDistributionChannel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteStreamDistributionChannelResponse>
                transformer =
                        DeleteStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteStreamDistributionChannelRequest,
                        DeleteStreamDistributionChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteStreamDistributionChannelRequest,
                                DeleteStreamDistributionChannelResponse>,
                        java.util.concurrent.Future<DeleteStreamDistributionChannelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteStreamDistributionChannelRequest,
                    DeleteStreamDistributionChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamPackagingConfigResponse>
            deleteStreamPackagingConfig(
                    DeleteStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteStreamPackagingConfigRequest,
                                    DeleteStreamPackagingConfigResponse>
                            handler) {
        LOG.trace("Called async deleteStreamPackagingConfig");
        final DeleteStreamPackagingConfigRequest interceptedRequest =
                DeleteStreamPackagingConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/DeleteStreamPackagingConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteStreamPackagingConfigResponse>
                transformer =
                        DeleteStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteStreamPackagingConfigRequest, DeleteStreamPackagingConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteStreamPackagingConfigRequest,
                                DeleteStreamPackagingConfigResponse>,
                        java.util.concurrent.Future<DeleteStreamPackagingConfigResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteStreamPackagingConfigRequest, DeleteStreamPackagingConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaAssetResponse> getMediaAsset(
            GetMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMediaAssetRequest, GetMediaAssetResponse>
                    handler) {
        LOG.trace("Called async getMediaAsset");
        final GetMediaAssetRequest interceptedRequest =
                GetMediaAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/GetMediaAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMediaAssetResponse>
                transformer =
                        GetMediaAssetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMediaAssetRequest, GetMediaAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaAssetRequest, GetMediaAssetResponse>,
                        java.util.concurrent.Future<GetMediaAssetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaAssetRequest, GetMediaAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaAssetDistributionChannelAttachmentResponse>
            getMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaAssetDistributionChannelAttachmentRequest,
                                    GetMediaAssetDistributionChannelAttachmentResponse>
                            handler) {
        LOG.trace("Called async getMediaAssetDistributionChannelAttachment");
        final GetMediaAssetDistributionChannelAttachmentRequest interceptedRequest =
                GetMediaAssetDistributionChannelAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaAssetDistributionChannelAttachmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaAssetDistributionChannelAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachment/GetMediaAssetDistributionChannelAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetMediaAssetDistributionChannelAttachmentResponse>
                transformer =
                        GetMediaAssetDistributionChannelAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMediaAssetDistributionChannelAttachmentRequest,
                        GetMediaAssetDistributionChannelAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaAssetDistributionChannelAttachmentRequest,
                                GetMediaAssetDistributionChannelAttachmentResponse>,
                        java.util.concurrent.Future<
                                GetMediaAssetDistributionChannelAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaAssetDistributionChannelAttachmentRequest,
                    GetMediaAssetDistributionChannelAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowResponse> getMediaWorkflow(
            GetMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowRequest, GetMediaWorkflowResponse>
                    handler) {
        LOG.trace("Called async getMediaWorkflow");
        final GetMediaWorkflowRequest interceptedRequest =
                GetMediaWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/GetMediaWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMediaWorkflowResponse>
                transformer =
                        GetMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaWorkflowRequest, GetMediaWorkflowResponse>,
                        java.util.concurrent.Future<GetMediaWorkflowResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaWorkflowRequest, GetMediaWorkflowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowConfigurationResponse>
            getMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMediaWorkflowConfigurationRequest,
                                    GetMediaWorkflowConfigurationResponse>
                            handler) {
        LOG.trace("Called async getMediaWorkflowConfiguration");
        final GetMediaWorkflowConfigurationRequest interceptedRequest =
                GetMediaWorkflowConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/GetMediaWorkflowConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMediaWorkflowConfigurationResponse>
                transformer =
                        GetMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaWorkflowConfigurationRequest,
                                GetMediaWorkflowConfigurationResponse>,
                        java.util.concurrent.Future<GetMediaWorkflowConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowJobResponse> getMediaWorkflowJob(
            GetMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
                    handler) {
        LOG.trace("Called async getMediaWorkflowJob");
        final GetMediaWorkflowJobRequest interceptedRequest =
                GetMediaWorkflowJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/GetMediaWorkflowJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMediaWorkflowJobResponse>
                transformer =
                        GetMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>,
                        java.util.concurrent.Future<GetMediaWorkflowJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMediaWorkflowJobFactResponse> getMediaWorkflowJobFact(
            GetMediaWorkflowJobFactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMediaWorkflowJobFactRequest, GetMediaWorkflowJobFactResponse>
                    handler) {
        LOG.trace("Called async getMediaWorkflowJobFact");
        final GetMediaWorkflowJobFactRequest interceptedRequest =
                GetMediaWorkflowJobFactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowJobFactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflowJobFact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJobFact/GetMediaWorkflowJobFact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMediaWorkflowJobFactResponse>
                transformer =
                        GetMediaWorkflowJobFactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMediaWorkflowJobFactRequest, GetMediaWorkflowJobFactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMediaWorkflowJobFactRequest, GetMediaWorkflowJobFactResponse>,
                        java.util.concurrent.Future<GetMediaWorkflowJobFactResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMediaWorkflowJobFactRequest, GetMediaWorkflowJobFactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStreamCdnConfigResponse> getStreamCdnConfig(
            GetStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
                    handler) {
        LOG.trace("Called async getStreamCdnConfig");
        final GetStreamCdnConfigRequest interceptedRequest =
                GetStreamCdnConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamCdnConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/GetStreamCdnConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, GetStreamCdnConfigResponse>
                transformer =
                        GetStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>,
                        java.util.concurrent.Future<GetStreamCdnConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStreamDistributionChannelResponse>
            getStreamDistributionChannel(
                    GetStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetStreamDistributionChannelRequest,
                                    GetStreamDistributionChannelResponse>
                            handler) {
        LOG.trace("Called async getStreamDistributionChannel");
        final GetStreamDistributionChannelRequest interceptedRequest =
                GetStreamDistributionChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/GetStreamDistributionChannel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetStreamDistributionChannelResponse>
                transformer =
                        GetStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStreamDistributionChannelRequest,
                                GetStreamDistributionChannelResponse>,
                        java.util.concurrent.Future<GetStreamDistributionChannelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetStreamPackagingConfigResponse> getStreamPackagingConfig(
            GetStreamPackagingConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
                    handler) {
        LOG.trace("Called async getStreamPackagingConfig");
        final GetStreamPackagingConfigRequest interceptedRequest =
                GetStreamPackagingConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/GetStreamPackagingConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetStreamPackagingConfigResponse>
                transformer =
                        GetStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>,
                        java.util.concurrent.Future<GetStreamPackagingConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<IngestStreamDistributionChannelResponse>
            ingestStreamDistributionChannel(
                    IngestStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    IngestStreamDistributionChannelRequest,
                                    IngestStreamDistributionChannelResponse>
                            handler) {
        LOG.trace("Called async ingestStreamDistributionChannel");
        final IngestStreamDistributionChannelRequest interceptedRequest =
                IngestStreamDistributionChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "IngestStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/IngestStreamDistributionChannel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, IngestStreamDistributionChannelResponse>
                transformer =
                        IngestStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        IngestStreamDistributionChannelRequest,
                        IngestStreamDistributionChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                IngestStreamDistributionChannelRequest,
                                IngestStreamDistributionChannelResponse>,
                        java.util.concurrent.Future<IngestStreamDistributionChannelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIngestStreamDistributionChannelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    IngestStreamDistributionChannelRequest,
                    IngestStreamDistributionChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaAssetDistributionChannelAttachmentsResponse>
            listMediaAssetDistributionChannelAttachments(
                    ListMediaAssetDistributionChannelAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaAssetDistributionChannelAttachmentsRequest,
                                    ListMediaAssetDistributionChannelAttachmentsResponse>
                            handler) {
        LOG.trace("Called async listMediaAssetDistributionChannelAttachments");
        final ListMediaAssetDistributionChannelAttachmentsRequest interceptedRequest =
                ListMediaAssetDistributionChannelAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaAssetDistributionChannelAttachmentsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaAssetDistributionChannelAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAssetDistributionChannelAttachmentCollection/ListMediaAssetDistributionChannelAttachments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListMediaAssetDistributionChannelAttachmentsResponse>
                transformer =
                        ListMediaAssetDistributionChannelAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMediaAssetDistributionChannelAttachmentsRequest,
                        ListMediaAssetDistributionChannelAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaAssetDistributionChannelAttachmentsRequest,
                                ListMediaAssetDistributionChannelAttachmentsResponse>,
                        java.util.concurrent.Future<
                                ListMediaAssetDistributionChannelAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaAssetDistributionChannelAttachmentsRequest,
                    ListMediaAssetDistributionChannelAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaAssetsResponse> listMediaAssets(
            ListMediaAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaAssetsRequest, ListMediaAssetsResponse>
                    handler) {
        LOG.trace("Called async listMediaAssets");
        final ListMediaAssetsRequest interceptedRequest =
                ListMediaAssetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaAssetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaAssets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/ListMediaAssets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMediaAssetsResponse>
                transformer =
                        ListMediaAssetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMediaAssetsRequest, ListMediaAssetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaAssetsRequest, ListMediaAssetsResponse>,
                        java.util.concurrent.Future<ListMediaAssetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaAssetsRequest, ListMediaAssetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowConfigurationsResponse>
            listMediaWorkflowConfigurations(
                    ListMediaWorkflowConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowConfigurationsRequest,
                                    ListMediaWorkflowConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listMediaWorkflowConfigurations");
        final ListMediaWorkflowConfigurationsRequest interceptedRequest =
                ListMediaWorkflowConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfigurationCollection/ListMediaWorkflowConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMediaWorkflowConfigurationsResponse>
                transformer =
                        ListMediaWorkflowConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMediaWorkflowConfigurationsRequest,
                        ListMediaWorkflowConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaWorkflowConfigurationsRequest,
                                ListMediaWorkflowConfigurationsResponse>,
                        java.util.concurrent.Future<ListMediaWorkflowConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaWorkflowConfigurationsRequest,
                    ListMediaWorkflowConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowJobFactsResponse> listMediaWorkflowJobFacts(
            ListMediaWorkflowJobFactsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowJobFactsRequest, ListMediaWorkflowJobFactsResponse>
                    handler) {
        LOG.trace("Called async listMediaWorkflowJobFacts");
        final ListMediaWorkflowJobFactsRequest interceptedRequest =
                ListMediaWorkflowJobFactsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowJobFactsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobFacts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJobFact/ListMediaWorkflowJobFacts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMediaWorkflowJobFactsResponse>
                transformer =
                        ListMediaWorkflowJobFactsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMediaWorkflowJobFactsRequest, ListMediaWorkflowJobFactsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaWorkflowJobFactsRequest,
                                ListMediaWorkflowJobFactsResponse>,
                        java.util.concurrent.Future<ListMediaWorkflowJobFactsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaWorkflowJobFactsRequest, ListMediaWorkflowJobFactsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowJobsResponse> listMediaWorkflowJobs(
            ListMediaWorkflowJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>
                    handler) {
        LOG.trace("Called async listMediaWorkflowJobs");
        final ListMediaWorkflowJobsRequest interceptedRequest =
                ListMediaWorkflowJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/ListMediaWorkflowJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMediaWorkflowJobsResponse>
                transformer =
                        ListMediaWorkflowJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>,
                        java.util.concurrent.Future<ListMediaWorkflowJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowTaskDeclarationsResponse>
            listMediaWorkflowTaskDeclarations(
                    ListMediaWorkflowTaskDeclarationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMediaWorkflowTaskDeclarationsRequest,
                                    ListMediaWorkflowTaskDeclarationsResponse>
                            handler) {
        LOG.trace("Called async listMediaWorkflowTaskDeclarations");
        final ListMediaWorkflowTaskDeclarationsRequest interceptedRequest =
                ListMediaWorkflowTaskDeclarationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowTaskDeclarationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowTaskDeclarations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowTaskDeclarationCollection/ListMediaWorkflowTaskDeclarations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMediaWorkflowTaskDeclarationsResponse>
                transformer =
                        ListMediaWorkflowTaskDeclarationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMediaWorkflowTaskDeclarationsRequest,
                        ListMediaWorkflowTaskDeclarationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaWorkflowTaskDeclarationsRequest,
                                ListMediaWorkflowTaskDeclarationsResponse>,
                        java.util.concurrent.Future<ListMediaWorkflowTaskDeclarationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaWorkflowTaskDeclarationsRequest,
                    ListMediaWorkflowTaskDeclarationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMediaWorkflowsResponse> listMediaWorkflows(
            ListMediaWorkflowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>
                    handler) {
        LOG.trace("Called async listMediaWorkflows");
        final ListMediaWorkflowsRequest interceptedRequest =
                ListMediaWorkflowsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflows",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ListMediaWorkflows");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMediaWorkflowsResponse>
                transformer =
                        ListMediaWorkflowsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>,
                        java.util.concurrent.Future<ListMediaWorkflowsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStreamCdnConfigsResponse> listStreamCdnConfigs(
            ListStreamCdnConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>
                    handler) {
        LOG.trace("Called async listStreamCdnConfigs");
        final ListStreamCdnConfigsRequest interceptedRequest =
                ListStreamCdnConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamCdnConfigsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListStreamCdnConfigs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/ListStreamCdnConfigs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListStreamCdnConfigsResponse>
                transformer =
                        ListStreamCdnConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>,
                        java.util.concurrent.Future<ListStreamCdnConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStreamDistributionChannelsResponse>
            listStreamDistributionChannels(
                    ListStreamDistributionChannelsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStreamDistributionChannelsRequest,
                                    ListStreamDistributionChannelsResponse>
                            handler) {
        LOG.trace("Called async listStreamDistributionChannels");
        final ListStreamDistributionChannelsRequest interceptedRequest =
                ListStreamDistributionChannelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamDistributionChannelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListStreamDistributionChannels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/ListStreamDistributionChannels");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListStreamDistributionChannelsResponse>
                transformer =
                        ListStreamDistributionChannelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListStreamDistributionChannelsRequest,
                        ListStreamDistributionChannelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStreamDistributionChannelsRequest,
                                ListStreamDistributionChannelsResponse>,
                        java.util.concurrent.Future<ListStreamDistributionChannelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStreamDistributionChannelsRequest, ListStreamDistributionChannelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListStreamPackagingConfigsResponse>
            listStreamPackagingConfigs(
                    ListStreamPackagingConfigsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStreamPackagingConfigsRequest,
                                    ListStreamPackagingConfigsResponse>
                            handler) {
        LOG.trace("Called async listStreamPackagingConfigs");
        final ListStreamPackagingConfigsRequest interceptedRequest =
                ListStreamPackagingConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamPackagingConfigsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListStreamPackagingConfigs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/ListStreamPackagingConfigs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListStreamPackagingConfigsResponse>
                transformer =
                        ListStreamPackagingConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListStreamPackagingConfigsRequest, ListStreamPackagingConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListStreamPackagingConfigsRequest,
                                ListStreamPackagingConfigsResponse>,
                        java.util.concurrent.Future<ListStreamPackagingConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListStreamPackagingConfigsRequest, ListStreamPackagingConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSystemMediaWorkflowsResponse> listSystemMediaWorkflows(
            ListSystemMediaWorkflowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>
                    handler) {
        LOG.trace("Called async listSystemMediaWorkflows");
        final ListSystemMediaWorkflowsRequest interceptedRequest =
                ListSystemMediaWorkflowsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSystemMediaWorkflowsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListSystemMediaWorkflows",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/ListSystemMediaWorkflows");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSystemMediaWorkflowsResponse>
                transformer =
                        ListSystemMediaWorkflowsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>,
                        java.util.concurrent.Future<ListSystemMediaWorkflowsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaAssetResponse> updateMediaAsset(
            UpdateMediaAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaAssetRequest, UpdateMediaAssetResponse>
                    handler) {
        LOG.trace("Called async updateMediaAsset");
        final UpdateMediaAssetRequest interceptedRequest =
                UpdateMediaAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaAsset/UpdateMediaAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaAssetResponse>
                transformer =
                        UpdateMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateMediaAssetRequest, UpdateMediaAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMediaAssetRequest, UpdateMediaAssetResponse>,
                        java.util.concurrent.Future<UpdateMediaAssetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMediaAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMediaAssetRequest, UpdateMediaAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowResponse> updateMediaWorkflow(
            UpdateMediaWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>
                    handler) {
        LOG.trace("Called async updateMediaWorkflow");
        final UpdateMediaWorkflowRequest interceptedRequest =
                UpdateMediaWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflow/UpdateMediaWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaWorkflowResponse>
                transformer =
                        UpdateMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>,
                        java.util.concurrent.Future<UpdateMediaWorkflowResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMediaWorkflowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMediaWorkflowRequest, UpdateMediaWorkflowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowConfigurationResponse>
            updateMediaWorkflowConfiguration(
                    UpdateMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMediaWorkflowConfigurationRequest,
                                    UpdateMediaWorkflowConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateMediaWorkflowConfiguration");
        final UpdateMediaWorkflowConfigurationRequest interceptedRequest =
                UpdateMediaWorkflowConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowConfiguration/UpdateMediaWorkflowConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMediaWorkflowConfigurationResponse>
                transformer =
                        UpdateMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMediaWorkflowConfigurationRequest,
                        UpdateMediaWorkflowConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMediaWorkflowConfigurationRequest,
                                UpdateMediaWorkflowConfigurationResponse>,
                        java.util.concurrent.Future<UpdateMediaWorkflowConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMediaWorkflowConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMediaWorkflowConfigurationRequest,
                    UpdateMediaWorkflowConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaWorkflowJobResponse> updateMediaWorkflowJob(
            UpdateMediaWorkflowJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>
                    handler) {
        LOG.trace("Called async updateMediaWorkflowJob");
        final UpdateMediaWorkflowJobRequest interceptedRequest =
                UpdateMediaWorkflowJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/MediaWorkflowJob/UpdateMediaWorkflowJob");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaWorkflowJobResponse>
                transformer =
                        UpdateMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>,
                        java.util.concurrent.Future<UpdateMediaWorkflowJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMediaWorkflowJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMediaWorkflowJobRequest, UpdateMediaWorkflowJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamCdnConfigResponse> updateStreamCdnConfig(
            UpdateStreamCdnConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>
                    handler) {
        LOG.trace("Called async updateStreamCdnConfig");
        final UpdateStreamCdnConfigRequest interceptedRequest =
                UpdateStreamCdnConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamCdnConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamCdnConfig/UpdateStreamCdnConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateStreamCdnConfigResponse>
                transformer =
                        UpdateStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>,
                        java.util.concurrent.Future<UpdateStreamCdnConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateStreamCdnConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateStreamCdnConfigRequest, UpdateStreamCdnConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamDistributionChannelResponse>
            updateStreamDistributionChannel(
                    UpdateStreamDistributionChannelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateStreamDistributionChannelRequest,
                                    UpdateStreamDistributionChannelResponse>
                            handler) {
        LOG.trace("Called async updateStreamDistributionChannel");
        final UpdateStreamDistributionChannelRequest interceptedRequest =
                UpdateStreamDistributionChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamDistributionChannel/UpdateStreamDistributionChannel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateStreamDistributionChannelResponse>
                transformer =
                        UpdateStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateStreamDistributionChannelRequest,
                        UpdateStreamDistributionChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateStreamDistributionChannelRequest,
                                UpdateStreamDistributionChannelResponse>,
                        java.util.concurrent.Future<UpdateStreamDistributionChannelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateStreamDistributionChannelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateStreamDistributionChannelRequest,
                    UpdateStreamDistributionChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamPackagingConfigResponse>
            updateStreamPackagingConfig(
                    UpdateStreamPackagingConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateStreamPackagingConfigRequest,
                                    UpdateStreamPackagingConfigResponse>
                            handler) {
        LOG.trace("Called async updateStreamPackagingConfig");
        final UpdateStreamPackagingConfigRequest interceptedRequest =
                UpdateStreamPackagingConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/dms/20211101/StreamPackagingConfig/UpdateStreamPackagingConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateStreamPackagingConfigResponse>
                transformer =
                        UpdateStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateStreamPackagingConfigRequest, UpdateStreamPackagingConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateStreamPackagingConfigRequest,
                                UpdateStreamPackagingConfigResponse>,
                        java.util.concurrent.Future<UpdateStreamPackagingConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateStreamPackagingConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateStreamPackagingConfigRequest, UpdateStreamPackagingConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
