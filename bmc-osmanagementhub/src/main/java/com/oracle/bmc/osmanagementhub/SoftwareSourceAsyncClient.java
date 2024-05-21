/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.internal.http.*;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Async client implementation for SoftwareSource service. <br/>
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
public class SoftwareSourceAsyncClient implements SoftwareSourceAsync {
    /**
     * Service instance for SoftwareSource.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SOFTWARESOURCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SoftwareSourceAsyncClient.class);

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
    public SoftwareSourceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
    public SoftwareSourceAsyncClient(
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
                    Builder, SoftwareSourceAsyncClient> {
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
        public SoftwareSourceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new SoftwareSourceAsyncClient(
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
    public java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse>
            addPackagesToSoftwareSource(
                    AddPackagesToSoftwareSourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddPackagesToSoftwareSourceRequest,
                                    AddPackagesToSoftwareSourceResponse>
                            handler) {
        LOG.trace("Called async addPackagesToSoftwareSource");
        final AddPackagesToSoftwareSourceRequest interceptedRequest =
                AddPackagesToSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddPackagesToSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "AddPackagesToSoftwareSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/AddPackagesToSoftwareSource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddPackagesToSoftwareSourceResponse>
                transformer =
                        AddPackagesToSoftwareSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddPackagesToSoftwareSourceRequest,
                                AddPackagesToSoftwareSourceResponse>,
                        java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddPackagesToSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeAvailabilityOfSoftwareSourcesResponse>
            changeAvailabilityOfSoftwareSources(
                    ChangeAvailabilityOfSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAvailabilityOfSoftwareSourcesRequest,
                                    ChangeAvailabilityOfSoftwareSourcesResponse>
                            handler) {
        LOG.trace("Called async changeAvailabilityOfSoftwareSources");
        final ChangeAvailabilityOfSoftwareSourcesRequest interceptedRequest =
                ChangeAvailabilityOfSoftwareSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAvailabilityOfSoftwareSourcesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ChangeAvailabilityOfSoftwareSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ChangeAvailabilityOfSoftwareSources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeAvailabilityOfSoftwareSourcesResponse>
                transformer =
                        ChangeAvailabilityOfSoftwareSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeAvailabilityOfSoftwareSourcesRequest,
                        ChangeAvailabilityOfSoftwareSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeAvailabilityOfSoftwareSourcesRequest,
                                ChangeAvailabilityOfSoftwareSourcesResponse>,
                        java.util.concurrent.Future<ChangeAvailabilityOfSoftwareSourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeAvailabilityOfSoftwareSourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeAvailabilityOfSoftwareSourcesRequest,
                    ChangeAvailabilityOfSoftwareSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>
            changeSoftwareSourceCompartment(
                    ChangeSoftwareSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSoftwareSourceCompartmentRequest,
                                    ChangeSoftwareSourceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSoftwareSourceCompartment");
        final ChangeSoftwareSourceCompartmentRequest interceptedRequest =
                ChangeSoftwareSourceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSoftwareSourceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ChangeSoftwareSourceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ChangeSoftwareSourceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSoftwareSourceCompartmentResponse>
                transformer =
                        ChangeSoftwareSourceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSoftwareSourceCompartmentRequest,
                        ChangeSoftwareSourceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSoftwareSourceCompartmentRequest,
                                ChangeSoftwareSourceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSoftwareSourceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSoftwareSourceCompartmentRequest,
                    ChangeSoftwareSourceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEntitlementResponse> createEntitlement(
            CreateEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntitlementRequest, CreateEntitlementResponse>
                    handler) {
        LOG.trace("Called async createEntitlement");
        final CreateEntitlementRequest interceptedRequest =
                CreateEntitlementConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEntitlementConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "CreateEntitlement",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/CreateEntitlement");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateEntitlementResponse>
                transformer =
                        CreateEntitlementConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateEntitlementRequest, CreateEntitlementResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEntitlementRequest, CreateEntitlementResponse>,
                        java.util.concurrent.Future<CreateEntitlementResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEntitlementDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEntitlementRequest, CreateEntitlementResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSoftwareSourceResponse> createSoftwareSource(
            CreateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async createSoftwareSource");
        final CreateSoftwareSourceRequest interceptedRequest =
                CreateSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "CreateSoftwareSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/CreateSoftwareSource");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSoftwareSourceResponse>
                transformer =
                        CreateSoftwareSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>,
                        java.util.concurrent.Future<CreateSoftwareSourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSoftwareSourceResponse> deleteSoftwareSource(
            DeleteSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async deleteSoftwareSource");
        final DeleteSoftwareSourceRequest interceptedRequest =
                DeleteSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "DeleteSoftwareSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/DeleteSoftwareSource");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSoftwareSourceResponse>
                transformer =
                        DeleteSoftwareSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>,
                        java.util.concurrent.Future<DeleteSoftwareSourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse>
                    handler) {
        LOG.trace("Called async getErratum");
        final GetErratumRequest interceptedRequest = GetErratumConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetErratumConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetErratum",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Erratum/GetErratum");
        final java.util.function.Function<javax.ws.rs.core.Response, GetErratumResponse>
                transformer =
                        GetErratumConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetErratumRequest, GetErratumResponse>,
                        java.util.concurrent.Future<GetErratumResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetErratumRequest, GetErratumResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModuleStreamResponse> getModuleStream(
            GetModuleStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamRequest, GetModuleStreamResponse>
                    handler) {
        LOG.trace("Called async getModuleStream");
        final GetModuleStreamRequest interceptedRequest =
                GetModuleStreamConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModuleStreamConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetModuleStream",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ModuleStream/GetModuleStream");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModuleStreamResponse>
                transformer =
                        GetModuleStreamConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModuleStreamRequest, GetModuleStreamResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModuleStreamRequest, GetModuleStreamResponse>,
                        java.util.concurrent.Future<GetModuleStreamResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModuleStreamRequest, GetModuleStreamResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModuleStreamProfileResponse> getModuleStreamProfile(
            GetModuleStreamProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                    handler) {
        LOG.trace("Called async getModuleStreamProfile");
        final GetModuleStreamProfileRequest interceptedRequest =
                GetModuleStreamProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModuleStreamProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetModuleStreamProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ModuleStreamProfile/GetModuleStreamProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModuleStreamProfileResponse>
                transformer =
                        GetModuleStreamProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>,
                        java.util.concurrent.Future<GetModuleStreamProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPackageGroupResponse> getPackageGroup(
            GetPackageGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPackageGroupRequest, GetPackageGroupResponse>
                    handler) {
        LOG.trace("Called async getPackageGroup");
        final GetPackageGroupRequest interceptedRequest =
                GetPackageGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPackageGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetPackageGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/PackageGroup/GetPackageGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPackageGroupResponse>
                transformer =
                        GetPackageGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPackageGroupRequest, GetPackageGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPackageGroupRequest, GetPackageGroupResponse>,
                        java.util.concurrent.Future<GetPackageGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPackageGroupRequest, GetPackageGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSoftwarePackageResponse> getSoftwarePackage(
            GetSoftwarePackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                    handler) {
        LOG.trace("Called async getSoftwarePackage");
        final GetSoftwarePackageRequest interceptedRequest =
                GetSoftwarePackageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwarePackageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetSoftwarePackage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwarePackage");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSoftwarePackageResponse>
                transformer =
                        GetSoftwarePackageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSoftwarePackageRequest, GetSoftwarePackageResponse>,
                        java.util.concurrent.Future<GetSoftwarePackageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSoftwarePackageRequest, GetSoftwarePackageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSoftwarePackageByNameResponse> getSoftwarePackageByName(
            GetSoftwarePackageByNameRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>
                    handler) {
        LOG.trace("Called async getSoftwarePackageByName");
        final GetSoftwarePackageByNameRequest interceptedRequest =
                GetSoftwarePackageByNameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwarePackageByNameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetSoftwarePackageByName",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwarePackageByName");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSoftwarePackageByNameResponse>
                transformer =
                        GetSoftwarePackageByNameConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>,
                        java.util.concurrent.Future<GetSoftwarePackageByNameResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSoftwarePackageByNameRequest, GetSoftwarePackageByNameResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSoftwareSourceResponse> getSoftwareSource(
            GetSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async getSoftwareSource");
        final GetSoftwareSourceRequest interceptedRequest =
                GetSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "GetSoftwareSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/GetSoftwareSource");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSoftwareSourceResponse>
                transformer =
                        GetSoftwareSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSoftwareSourceRequest, GetSoftwareSourceResponse>,
                        java.util.concurrent.Future<GetSoftwareSourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSoftwareSourceRequest, GetSoftwareSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAllSoftwarePackagesResponse> listAllSoftwarePackages(
            ListAllSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>
                    handler) {
        LOG.trace("Called async listAllSoftwarePackages");
        final ListAllSoftwarePackagesRequest interceptedRequest =
                ListAllSoftwarePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAllSoftwarePackagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListAllSoftwarePackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListAllSoftwarePackages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAllSoftwarePackagesResponse>
                transformer =
                        ListAllSoftwarePackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>,
                        java.util.concurrent.Future<ListAllSoftwarePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResponse> listEntitlements(
            ListEntitlementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntitlementsRequest, ListEntitlementsResponse>
                    handler) {
        LOG.trace("Called async listEntitlements");
        final ListEntitlementsRequest interceptedRequest =
                ListEntitlementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEntitlementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListEntitlements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListEntitlements");
        final java.util.function.Function<javax.ws.rs.core.Response, ListEntitlementsResponse>
                transformer =
                        ListEntitlementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEntitlementsRequest, ListEntitlementsResponse>,
                        java.util.concurrent.Future<ListEntitlementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEntitlementsRequest, ListEntitlementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse>
                    handler) {
        LOG.trace("Called async listErrata");
        final ListErrataRequest interceptedRequest = ListErrataConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListErrataConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListErrata",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/Erratum/ListErrata");
        final java.util.function.Function<javax.ws.rs.core.Response, ListErrataResponse>
                transformer =
                        ListErrataConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListErrataRequest, ListErrataResponse>,
                        java.util.concurrent.Future<ListErrataResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListErrataRequest, ListErrataResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamProfilesResponse> listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                    handler) {
        LOG.trace("Called async listModuleStreamProfiles");
        final ListModuleStreamProfilesRequest interceptedRequest =
                ListModuleStreamProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListModuleStreamProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListModuleStreamProfiles");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListModuleStreamProfilesResponse>
                transformer =
                        ListModuleStreamProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>,
                        java.util.concurrent.Future<ListModuleStreamProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModuleStreamsResponse> listModuleStreams(
            ListModuleStreamsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamsRequest, ListModuleStreamsResponse>
                    handler) {
        LOG.trace("Called async listModuleStreams");
        final ListModuleStreamsRequest interceptedRequest =
                ListModuleStreamsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModuleStreamsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListModuleStreams",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListModuleStreams");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModuleStreamsResponse>
                transformer =
                        ListModuleStreamsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListModuleStreamsRequest, ListModuleStreamsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModuleStreamsRequest, ListModuleStreamsResponse>,
                        java.util.concurrent.Future<ListModuleStreamsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModuleStreamsRequest, ListModuleStreamsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPackageGroupsResponse> listPackageGroups(
            ListPackageGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPackageGroupsRequest, ListPackageGroupsResponse>
                    handler) {
        LOG.trace("Called async listPackageGroups");
        final ListPackageGroupsRequest interceptedRequest =
                ListPackageGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPackageGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListPackageGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListPackageGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPackageGroupsResponse>
                transformer =
                        ListPackageGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPackageGroupsRequest, ListPackageGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPackageGroupsRequest, ListPackageGroupsResponse>,
                        java.util.concurrent.Future<ListPackageGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPackageGroupsRequest, ListPackageGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSoftwarePackageSoftwareSourcesResponse>
            listSoftwarePackageSoftwareSources(
                    ListSoftwarePackageSoftwareSourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSoftwarePackageSoftwareSourcesRequest,
                                    ListSoftwarePackageSoftwareSourcesResponse>
                            handler) {
        LOG.trace("Called async listSoftwarePackageSoftwareSources");
        final ListSoftwarePackageSoftwareSourcesRequest interceptedRequest =
                ListSoftwarePackageSoftwareSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwarePackageSoftwareSourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListSoftwarePackageSoftwareSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwarePackageSoftwareSources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSoftwarePackageSoftwareSourcesResponse>
                transformer =
                        ListSoftwarePackageSoftwareSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwarePackageSoftwareSourcesRequest,
                        ListSoftwarePackageSoftwareSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwarePackageSoftwareSourcesRequest,
                                ListSoftwarePackageSoftwareSourcesResponse>,
                        java.util.concurrent.Future<ListSoftwarePackageSoftwareSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwarePackageSoftwareSourcesRequest,
                    ListSoftwarePackageSoftwareSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSoftwarePackagesResponse> listSoftwarePackages(
            ListSoftwarePackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>
                    handler) {
        LOG.trace("Called async listSoftwarePackages");
        final ListSoftwarePackagesRequest interceptedRequest =
                ListSoftwarePackagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwarePackagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListSoftwarePackages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwarePackages");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSoftwarePackagesResponse>
                transformer =
                        ListSoftwarePackagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>,
                        java.util.concurrent.Future<ListSoftwarePackagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourceVendorsResponse> listSoftwareSourceVendors(
            ListSoftwareSourceVendorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourceVendorsRequest, ListSoftwareSourceVendorsResponse>
                    handler) {
        LOG.trace("Called async listSoftwareSourceVendors");
        final ListSoftwareSourceVendorsRequest interceptedRequest =
                ListSoftwareSourceVendorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourceVendorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListSoftwareSourceVendors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwareSourceVendors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSoftwareSourceVendorsResponse>
                transformer =
                        ListSoftwareSourceVendorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwareSourceVendorsRequest, ListSoftwareSourceVendorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwareSourceVendorsRequest,
                                ListSoftwareSourceVendorsResponse>,
                        java.util.concurrent.Future<ListSoftwareSourceVendorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwareSourceVendorsRequest, ListSoftwareSourceVendorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler) {
        LOG.trace("Called async listSoftwareSources");
        final ListSoftwareSourcesRequest interceptedRequest =
                ListSoftwareSourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "ListSoftwareSources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/ListSoftwareSources");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSoftwareSourcesResponse>
                transformer =
                        ListSoftwareSourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>,
                        java.util.concurrent.Future<ListSoftwareSourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourceModuleStreamsResponse>
            searchSoftwareSourceModuleStreams(
                    SearchSoftwareSourceModuleStreamsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourceModuleStreamsRequest,
                                    SearchSoftwareSourceModuleStreamsResponse>
                            handler) {
        LOG.trace("Called async searchSoftwareSourceModuleStreams");
        final SearchSoftwareSourceModuleStreamsRequest interceptedRequest =
                SearchSoftwareSourceModuleStreamsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSoftwareSourceModuleStreamsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourceModuleStreams",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourceModuleStreams");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSoftwareSourceModuleStreamsResponse>
                transformer =
                        SearchSoftwareSourceModuleStreamsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSoftwareSourceModuleStreamsRequest,
                        SearchSoftwareSourceModuleStreamsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSoftwareSourceModuleStreamsRequest,
                                SearchSoftwareSourceModuleStreamsResponse>,
                        java.util.concurrent.Future<SearchSoftwareSourceModuleStreamsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchSoftwareSourceModuleStreamsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSoftwareSourceModuleStreamsRequest,
                    SearchSoftwareSourceModuleStreamsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourceModulesResponse>
            searchSoftwareSourceModules(
                    SearchSoftwareSourceModulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourceModulesRequest,
                                    SearchSoftwareSourceModulesResponse>
                            handler) {
        LOG.trace("Called async searchSoftwareSourceModules");
        final SearchSoftwareSourceModulesRequest interceptedRequest =
                SearchSoftwareSourceModulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSoftwareSourceModulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourceModules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourceModules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSoftwareSourceModulesResponse>
                transformer =
                        SearchSoftwareSourceModulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSoftwareSourceModulesRequest, SearchSoftwareSourceModulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSoftwareSourceModulesRequest,
                                SearchSoftwareSourceModulesResponse>,
                        java.util.concurrent.Future<SearchSoftwareSourceModulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchSoftwareSourceModulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSoftwareSourceModulesRequest, SearchSoftwareSourceModulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchSoftwareSourcePackageGroupsResponse>
            searchSoftwareSourcePackageGroups(
                    SearchSoftwareSourcePackageGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSoftwareSourcePackageGroupsRequest,
                                    SearchSoftwareSourcePackageGroupsResponse>
                            handler) {
        LOG.trace("Called async searchSoftwareSourcePackageGroups");
        final SearchSoftwareSourcePackageGroupsRequest interceptedRequest =
                SearchSoftwareSourcePackageGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSoftwareSourcePackageGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "SearchSoftwareSourcePackageGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/SearchSoftwareSourcePackageGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSoftwareSourcePackageGroupsResponse>
                transformer =
                        SearchSoftwareSourcePackageGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSoftwareSourcePackageGroupsRequest,
                        SearchSoftwareSourcePackageGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSoftwareSourcePackageGroupsRequest,
                                SearchSoftwareSourcePackageGroupsResponse>,
                        java.util.concurrent.Future<SearchSoftwareSourcePackageGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchSoftwareSourcePackageGroupsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSoftwareSourcePackageGroupsRequest,
                    SearchSoftwareSourcePackageGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSoftwareSourceResponse> updateSoftwareSource(
            UpdateSoftwareSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                    handler) {
        LOG.trace("Called async updateSoftwareSource");
        final UpdateSoftwareSourceRequest interceptedRequest =
                UpdateSoftwareSourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "SoftwareSource",
                        "UpdateSoftwareSource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/SoftwareSource/UpdateSoftwareSource");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSoftwareSourceResponse>
                transformer =
                        UpdateSoftwareSourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>,
                        java.util.concurrent.Future<UpdateSoftwareSourceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSoftwareSourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
