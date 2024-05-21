/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.dataintegration.internal.http.*;
import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;

/**
 * Async client implementation for DataIntegration service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class DataIntegrationAsyncClient implements DataIntegrationAsync {
    /**
     * Service instance for DataIntegration.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATAINTEGRATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dataintegration.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataIntegrationAsyncClient.class);

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
    public DataIntegrationAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
                    Builder, DataIntegrationAsyncClient> {
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
        public DataIntegrationAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DataIntegrationAsyncClient(
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
    public java.util.concurrent.Future<ChangeCompartmentResponse> changeCompartment(
            ChangeCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCompartmentRequest, ChangeCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeCompartment");
        final ChangeCompartmentRequest interceptedRequest =
                ChangeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ChangeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ChangeCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeCompartmentResponse>
                transformer =
                        ChangeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ChangeCompartmentRequest, ChangeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCompartmentRequest, ChangeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCompartmentRequest, ChangeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDisApplicationCompartmentResponse>
            changeDisApplicationCompartment(
                    ChangeDisApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDisApplicationCompartmentRequest,
                                    ChangeDisApplicationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDisApplicationCompartment");
        final ChangeDisApplicationCompartmentRequest interceptedRequest =
                ChangeDisApplicationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDisApplicationCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ChangeDisApplicationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ChangeDisApplicationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDisApplicationCompartmentResponse>
                transformer =
                        ChangeDisApplicationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDisApplicationCompartmentRequest,
                        ChangeDisApplicationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDisApplicationCompartmentRequest,
                                ChangeDisApplicationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDisApplicationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDisApplicationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDisApplicationCompartmentRequest,
                    ChangeDisApplicationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler) {
        LOG.trace("Called async createApplication");
        final CreateApplicationRequest interceptedRequest =
                CreateApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreateApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateApplicationResponse>
                transformer =
                        CreateApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateApplicationRequest, CreateApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApplicationRequest, CreateApplicationResponse>,
                        java.util.concurrent.Future<CreateApplicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApplicationRequest, CreateApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationDetailedDescriptionResponse>
            createApplicationDetailedDescription(
                    CreateApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateApplicationDetailedDescriptionRequest,
                                    CreateApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async createApplicationDetailedDescription");
        final CreateApplicationDetailedDescriptionRequest interceptedRequest =
                CreateApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/CreateApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateApplicationDetailedDescriptionResponse>
                transformer =
                        CreateApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateApplicationDetailedDescriptionRequest,
                        CreateApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApplicationDetailedDescriptionRequest,
                                CreateApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<CreateApplicationDetailedDescriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateApplicationDetailedDescriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApplicationDetailedDescriptionRequest,
                    CreateApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {
        LOG.trace("Called async createConnection");
        final CreateConnectionRequest interceptedRequest =
                CreateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/CreateConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateConnectionResponse>
                transformer =
                        CreateConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConnectionRequest, CreateConnectionResponse>,
                        java.util.concurrent.Future<CreateConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConnectionRequest, CreateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionValidationResponse>
            createConnectionValidation(
                    CreateConnectionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateConnectionValidationRequest,
                                    CreateConnectionValidationResponse>
                            handler) {
        LOG.trace("Called async createConnectionValidation");
        final CreateConnectionValidationRequest interceptedRequest =
                CreateConnectionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateConnectionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/CreateConnectionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateConnectionValidationResponse>
                transformer =
                        CreateConnectionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateConnectionValidationRequest, CreateConnectionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConnectionValidationRequest,
                                CreateConnectionValidationResponse>,
                        java.util.concurrent.Future<CreateConnectionValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConnectionValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConnectionValidationRequest, CreateConnectionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCopyObjectRequestResponse> createCopyObjectRequest(
            CreateCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>
                    handler) {
        LOG.trace("Called async createCopyObjectRequest");
        final CreateCopyObjectRequestRequest interceptedRequest =
                CreateCopyObjectRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCopyObjectRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateCopyObjectRequest",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCopyObjectRequestResponse>
                transformer =
                        CreateCopyObjectRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>,
                        java.util.concurrent.Future<CreateCopyObjectRequestResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCopyObjectRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetRequest, CreateDataAssetResponse>
                    handler) {
        LOG.trace("Called async createDataAsset");
        final CreateDataAssetRequest interceptedRequest =
                CreateDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateDataAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/CreateDataAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDataAssetResponse>
                transformer =
                        CreateDataAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDataAssetRequest, CreateDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataAssetRequest, CreateDataAssetResponse>,
                        java.util.concurrent.Future<CreateDataAssetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataAssetRequest, CreateDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataFlowResponse> createDataFlow(
            CreateDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataFlowRequest, CreateDataFlowResponse>
                    handler) {
        LOG.trace("Called async createDataFlow");
        final CreateDataFlowRequest interceptedRequest =
                CreateDataFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataFlowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateDataFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/CreateDataFlow");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDataFlowResponse>
                transformer =
                        CreateDataFlowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDataFlowRequest, CreateDataFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataFlowRequest, CreateDataFlowResponse>,
                        java.util.concurrent.Future<CreateDataFlowResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataFlowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataFlowRequest, CreateDataFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDataFlowValidationResponse> createDataFlowValidation(
            CreateDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>
                    handler) {
        LOG.trace("Called async createDataFlowValidation");
        final CreateDataFlowValidationRequest interceptedRequest =
                CreateDataFlowValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateDataFlowValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/CreateDataFlowValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDataFlowValidationResponse>
                transformer =
                        CreateDataFlowValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>,
                        java.util.concurrent.Future<CreateDataFlowValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDataFlowValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDisApplicationResponse> createDisApplication(
            CreateDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDisApplicationRequest, CreateDisApplicationResponse>
                    handler) {
        LOG.trace("Called async createDisApplication");
        final CreateDisApplicationRequest interceptedRequest =
                CreateDisApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateDisApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/CreateDisApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDisApplicationResponse>
                transformer =
                        CreateDisApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDisApplicationRequest, CreateDisApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDisApplicationRequest, CreateDisApplicationResponse>,
                        java.util.concurrent.Future<CreateDisApplicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDisApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDisApplicationRequest, CreateDisApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDisApplicationDetailedDescriptionResponse>
            createDisApplicationDetailedDescription(
                    CreateDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDisApplicationDetailedDescriptionRequest,
                                    CreateDisApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async createDisApplicationDetailedDescription");
        final CreateDisApplicationDetailedDescriptionRequest interceptedRequest =
                CreateDisApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDisApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateDisApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/CreateDisApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDisApplicationDetailedDescriptionResponse>
                transformer =
                        CreateDisApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDisApplicationDetailedDescriptionRequest,
                        CreateDisApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDisApplicationDetailedDescriptionRequest,
                                CreateDisApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<
                                CreateDisApplicationDetailedDescriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateDisApplicationDetailedDescriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDisApplicationDetailedDescriptionRequest,
                    CreateDisApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEntityShapeResponse> createEntityShape(
            CreateEntityShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityShapeRequest, CreateEntityShapeResponse>
                    handler) {
        LOG.trace("Called async createEntityShape");
        final CreateEntityShapeRequest interceptedRequest =
                CreateEntityShapeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEntityShapeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateEntityShape",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/CreateEntityShape");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateEntityShapeResponse>
                transformer =
                        CreateEntityShapeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateEntityShapeRequest, CreateEntityShapeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEntityShapeRequest, CreateEntityShapeResponse>,
                        java.util.concurrent.Future<CreateEntityShapeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEntityShapeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEntityShapeRequest, CreateEntityShapeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExportRequestResponse> createExportRequest(
            CreateExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExportRequestRequest, CreateExportRequestResponse>
                    handler) {
        LOG.trace("Called async createExportRequest");
        final CreateExportRequestRequest interceptedRequest =
                CreateExportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateExportRequest",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateExportRequestResponse>
                transformer =
                        CreateExportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExportRequestRequest, CreateExportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExportRequestRequest, CreateExportRequestResponse>,
                        java.util.concurrent.Future<CreateExportRequestResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExportRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExportRequestRequest, CreateExportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPublicationResponse> createExternalPublication(
            CreateExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalPublicationRequest, CreateExternalPublicationResponse>
                    handler) {
        LOG.trace("Called async createExternalPublication");
        final CreateExternalPublicationRequest interceptedRequest =
                CreateExternalPublicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateExternalPublication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/CreateExternalPublication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalPublicationResponse>
                transformer =
                        CreateExternalPublicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalPublicationRequest, CreateExternalPublicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalPublicationRequest,
                                CreateExternalPublicationResponse>,
                        java.util.concurrent.Future<CreateExternalPublicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalPublicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalPublicationRequest, CreateExternalPublicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPublicationValidationResponse>
            createExternalPublicationValidation(
                    CreateExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPublicationValidationRequest,
                                    CreateExternalPublicationValidationResponse>
                            handler) {
        LOG.trace("Called async createExternalPublicationValidation");
        final CreateExternalPublicationValidationRequest interceptedRequest =
                CreateExternalPublicationValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalPublicationValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateExternalPublicationValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/CreateExternalPublicationValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateExternalPublicationValidationResponse>
                transformer =
                        CreateExternalPublicationValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateExternalPublicationValidationRequest,
                        CreateExternalPublicationValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateExternalPublicationValidationRequest,
                                CreateExternalPublicationValidationResponse>,
                        java.util.concurrent.Future<CreateExternalPublicationValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateExternalPublicationValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateExternalPublicationValidationRequest,
                    CreateExternalPublicationValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler) {
        LOG.trace("Called async createFolder");
        final CreateFolderRequest interceptedRequest =
                CreateFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFolderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateFolder",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/CreateFolder");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFolderResponse>
                transformer =
                        CreateFolderConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFolderRequest, CreateFolderResponse>,
                        java.util.concurrent.Future<CreateFolderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFolderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFolderRequest, CreateFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionLibraryResponse> createFunctionLibrary(
            CreateFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>
                    handler) {
        LOG.trace("Called async createFunctionLibrary");
        final CreateFunctionLibraryRequest interceptedRequest =
                CreateFunctionLibraryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateFunctionLibrary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/CreateFunctionLibrary");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateFunctionLibraryResponse>
                transformer =
                        CreateFunctionLibraryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>,
                        java.util.concurrent.Future<CreateFunctionLibraryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateFunctionLibraryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateImportRequestResponse> createImportRequest(
            CreateImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateImportRequestRequest, CreateImportRequestResponse>
                    handler) {
        LOG.trace("Called async createImportRequest");
        final CreateImportRequestRequest interceptedRequest =
                CreateImportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateImportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateImportRequest",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateImportRequestResponse>
                transformer =
                        CreateImportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateImportRequestRequest, CreateImportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateImportRequestRequest, CreateImportRequestResponse>,
                        java.util.concurrent.Future<CreateImportRequestResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateImportRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateImportRequestRequest, CreateImportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
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
                        "DataIntegration",
                        "CreatePatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreatePatch");
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
    public java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRequest, CreatePipelineResponse>
                    handler) {
        LOG.trace("Called async createPipeline");
        final CreatePipelineRequest interceptedRequest =
                CreatePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreatePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/CreatePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePipelineResponse>
                transformer =
                        CreatePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePipelineRequest, CreatePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePipelineRequest, CreatePipelineResponse>,
                        java.util.concurrent.Future<CreatePipelineResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePipelineRequest, CreatePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineValidationResponse> createPipelineValidation(
            CreatePipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineValidationRequest, CreatePipelineValidationResponse>
                    handler) {
        LOG.trace("Called async createPipelineValidation");
        final CreatePipelineValidationRequest interceptedRequest =
                CreatePipelineValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreatePipelineValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/CreatePipelineValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreatePipelineValidationResponse>
                transformer =
                        CreatePipelineValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreatePipelineValidationRequest, CreatePipelineValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePipelineValidationRequest, CreatePipelineValidationResponse>,
                        java.util.concurrent.Future<CreatePipelineValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePipelineValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePipelineValidationRequest, CreatePipelineValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {
        LOG.trace("Called async createProject");
        final CreateProjectRequest interceptedRequest =
                CreateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/CreateProject");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateProjectResponse>
                transformer =
                        CreateProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateProjectRequest, CreateProjectResponse>,
                        java.util.concurrent.Future<CreateProjectResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateProjectRequest, CreateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduleRequest, CreateScheduleResponse>
                    handler) {
        LOG.trace("Called async createSchedule");
        final CreateScheduleRequest interceptedRequest =
                CreateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/CreateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateScheduleResponse>
                transformer =
                        CreateScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateScheduleRequest, CreateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateScheduleRequest, CreateScheduleResponse>,
                        java.util.concurrent.Future<CreateScheduleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateScheduleRequest, CreateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResponse> createTask(
            CreateTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTaskRequest, CreateTaskResponse>
                    handler) {
        LOG.trace("Called async createTask");
        final CreateTaskRequest interceptedRequest = CreateTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/CreateTask");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTaskResponse>
                transformer =
                        CreateTaskConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTaskRequest, CreateTaskResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTaskRequest, CreateTaskResponse>,
                        java.util.concurrent.Future<CreateTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTaskRequest, CreateTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTaskRunResponse> createTaskRun(
            CreateTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTaskRunRequest, CreateTaskRunResponse>
                    handler) {
        LOG.trace("Called async createTaskRun");
        final CreateTaskRunRequest interceptedRequest =
                CreateTaskRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateTaskRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/CreateTaskRun");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTaskRunResponse>
                transformer =
                        CreateTaskRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTaskRunRequest, CreateTaskRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTaskRunRequest, CreateTaskRunResponse>,
                        java.util.concurrent.Future<CreateTaskRunResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTaskRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTaskRunRequest, CreateTaskRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTaskScheduleResponse> createTaskSchedule(
            CreateTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskScheduleRequest, CreateTaskScheduleResponse>
                    handler) {
        LOG.trace("Called async createTaskSchedule");
        final CreateTaskScheduleRequest interceptedRequest =
                CreateTaskScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateTaskSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/CreateTaskSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTaskScheduleResponse>
                transformer =
                        CreateTaskScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTaskScheduleRequest, CreateTaskScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTaskScheduleRequest, CreateTaskScheduleResponse>,
                        java.util.concurrent.Future<CreateTaskScheduleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTaskScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTaskScheduleRequest, CreateTaskScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTaskValidationResponse> createTaskValidation(
            CreateTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskValidationRequest, CreateTaskValidationResponse>
                    handler) {
        LOG.trace("Called async createTaskValidation");
        final CreateTaskValidationRequest interceptedRequest =
                CreateTaskValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateTaskValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/CreateTaskValidation");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTaskValidationResponse>
                transformer =
                        CreateTaskValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTaskValidationRequest, CreateTaskValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTaskValidationRequest, CreateTaskValidationResponse>,
                        java.util.concurrent.Future<CreateTaskValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTaskValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTaskValidationRequest, CreateTaskValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserDefinedFunctionResponse> createUserDefinedFunction(
            CreateUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResponse>
                    handler) {
        LOG.trace("Called async createUserDefinedFunction");
        final CreateUserDefinedFunctionRequest interceptedRequest =
                CreateUserDefinedFunctionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateUserDefinedFunction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/CreateUserDefinedFunction");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateUserDefinedFunctionResponse>
                transformer =
                        CreateUserDefinedFunctionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserDefinedFunctionRequest,
                                CreateUserDefinedFunctionResponse>,
                        java.util.concurrent.Future<CreateUserDefinedFunctionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUserDefinedFunctionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUserDefinedFunctionValidationResponse>
            createUserDefinedFunctionValidation(
                    CreateUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateUserDefinedFunctionValidationRequest,
                                    CreateUserDefinedFunctionValidationResponse>
                            handler) {
        LOG.trace("Called async createUserDefinedFunctionValidation");
        final CreateUserDefinedFunctionValidationRequest interceptedRequest =
                CreateUserDefinedFunctionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDefinedFunctionValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateUserDefinedFunctionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/CreateUserDefinedFunctionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateUserDefinedFunctionValidationResponse>
                transformer =
                        CreateUserDefinedFunctionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateUserDefinedFunctionValidationRequest,
                        CreateUserDefinedFunctionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserDefinedFunctionValidationRequest,
                                CreateUserDefinedFunctionValidationResponse>,
                        java.util.concurrent.Future<CreateUserDefinedFunctionValidationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUserDefinedFunctionValidationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserDefinedFunctionValidationRequest,
                    CreateUserDefinedFunctionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResponse> createWorkspace(
            CreateWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWorkspaceRequest, CreateWorkspaceResponse>
                    handler) {
        LOG.trace("Called async createWorkspace");
        final CreateWorkspaceRequest interceptedRequest =
                CreateWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "CreateWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/CreateWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateWorkspaceResponse>
                transformer =
                        CreateWorkspaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateWorkspaceRequest, CreateWorkspaceResponse>,
                        java.util.concurrent.Future<CreateWorkspaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateWorkspaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateWorkspaceRequest, CreateWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler) {
        LOG.trace("Called async deleteApplication");
        final DeleteApplicationRequest interceptedRequest =
                DeleteApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeleteApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteApplicationResponse>
                transformer =
                        DeleteApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApplicationRequest, DeleteApplicationResponse>,
                        java.util.concurrent.Future<DeleteApplicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApplicationRequest, DeleteApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationDetailedDescriptionResponse>
            deleteApplicationDetailedDescription(
                    DeleteApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteApplicationDetailedDescriptionRequest,
                                    DeleteApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async deleteApplicationDetailedDescription");
        final DeleteApplicationDetailedDescriptionRequest interceptedRequest =
                DeleteApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/DeleteApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteApplicationDetailedDescriptionResponse>
                transformer =
                        DeleteApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteApplicationDetailedDescriptionRequest,
                        DeleteApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApplicationDetailedDescriptionRequest,
                                DeleteApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<DeleteApplicationDetailedDescriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApplicationDetailedDescriptionRequest,
                    DeleteApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {
        LOG.trace("Called async deleteConnection");
        final DeleteConnectionRequest interceptedRequest =
                DeleteConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/DeleteConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteConnectionResponse>
                transformer =
                        DeleteConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConnectionRequest, DeleteConnectionResponse>,
                        java.util.concurrent.Future<DeleteConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConnectionRequest, DeleteConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionValidationResponse>
            deleteConnectionValidation(
                    DeleteConnectionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteConnectionValidationRequest,
                                    DeleteConnectionValidationResponse>
                            handler) {
        LOG.trace("Called async deleteConnectionValidation");
        final DeleteConnectionValidationRequest interceptedRequest =
                DeleteConnectionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteConnectionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/DeleteConnectionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteConnectionValidationResponse>
                transformer =
                        DeleteConnectionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteConnectionValidationRequest, DeleteConnectionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConnectionValidationRequest,
                                DeleteConnectionValidationResponse>,
                        java.util.concurrent.Future<DeleteConnectionValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConnectionValidationRequest, DeleteConnectionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCopyObjectRequestResponse> deleteCopyObjectRequest(
            DeleteCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>
                    handler) {
        LOG.trace("Called async deleteCopyObjectRequest");
        final DeleteCopyObjectRequestRequest interceptedRequest =
                DeleteCopyObjectRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCopyObjectRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteCopyObjectRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteCopyObjectRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCopyObjectRequestResponse>
                transformer =
                        DeleteCopyObjectRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>,
                        java.util.concurrent.Future<DeleteCopyObjectRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler) {
        LOG.trace("Called async deleteDataAsset");
        final DeleteDataAssetRequest interceptedRequest =
                DeleteDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteDataAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/DeleteDataAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDataAssetResponse>
                transformer =
                        DeleteDataAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDataAssetRequest, DeleteDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataAssetRequest, DeleteDataAssetResponse>,
                        java.util.concurrent.Future<DeleteDataAssetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataAssetRequest, DeleteDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataFlowResponse> deleteDataFlow(
            DeleteDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataFlowRequest, DeleteDataFlowResponse>
                    handler) {
        LOG.trace("Called async deleteDataFlow");
        final DeleteDataFlowRequest interceptedRequest =
                DeleteDataFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataFlowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteDataFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/DeleteDataFlow");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDataFlowResponse>
                transformer =
                        DeleteDataFlowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDataFlowRequest, DeleteDataFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataFlowRequest, DeleteDataFlowResponse>,
                        java.util.concurrent.Future<DeleteDataFlowResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataFlowRequest, DeleteDataFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDataFlowValidationResponse> deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>
                    handler) {
        LOG.trace("Called async deleteDataFlowValidation");
        final DeleteDataFlowValidationRequest interceptedRequest =
                DeleteDataFlowValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteDataFlowValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/DeleteDataFlowValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDataFlowValidationResponse>
                transformer =
                        DeleteDataFlowValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>,
                        java.util.concurrent.Future<DeleteDataFlowValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDisApplicationResponse> deleteDisApplication(
            DeleteDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDisApplicationRequest, DeleteDisApplicationResponse>
                    handler) {
        LOG.trace("Called async deleteDisApplication");
        final DeleteDisApplicationRequest interceptedRequest =
                DeleteDisApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteDisApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/DeleteDisApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDisApplicationResponse>
                transformer =
                        DeleteDisApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDisApplicationRequest, DeleteDisApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDisApplicationRequest, DeleteDisApplicationResponse>,
                        java.util.concurrent.Future<DeleteDisApplicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDisApplicationRequest, DeleteDisApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDisApplicationDetailedDescriptionResponse>
            deleteDisApplicationDetailedDescription(
                    DeleteDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDisApplicationDetailedDescriptionRequest,
                                    DeleteDisApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async deleteDisApplicationDetailedDescription");
        final DeleteDisApplicationDetailedDescriptionRequest interceptedRequest =
                DeleteDisApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDisApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteDisApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/DeleteDisApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDisApplicationDetailedDescriptionResponse>
                transformer =
                        DeleteDisApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDisApplicationDetailedDescriptionRequest,
                        DeleteDisApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDisApplicationDetailedDescriptionRequest,
                                DeleteDisApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<
                                DeleteDisApplicationDetailedDescriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDisApplicationDetailedDescriptionRequest,
                    DeleteDisApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExportRequestResponse> deleteExportRequest(
            DeleteExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExportRequestRequest, DeleteExportRequestResponse>
                    handler) {
        LOG.trace("Called async deleteExportRequest");
        final DeleteExportRequestRequest interceptedRequest =
                DeleteExportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteExportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteExportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExportRequestResponse>
                transformer =
                        DeleteExportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExportRequestRequest, DeleteExportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExportRequestRequest, DeleteExportRequestResponse>,
                        java.util.concurrent.Future<DeleteExportRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExportRequestRequest, DeleteExportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPublicationResponse> deleteExternalPublication(
            DeleteExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalPublicationRequest, DeleteExternalPublicationResponse>
                    handler) {
        LOG.trace("Called async deleteExternalPublication");
        final DeleteExternalPublicationRequest interceptedRequest =
                DeleteExternalPublicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteExternalPublication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/DeleteExternalPublication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalPublicationResponse>
                transformer =
                        DeleteExternalPublicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalPublicationRequest, DeleteExternalPublicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalPublicationRequest,
                                DeleteExternalPublicationResponse>,
                        java.util.concurrent.Future<DeleteExternalPublicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalPublicationRequest, DeleteExternalPublicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPublicationValidationResponse>
            deleteExternalPublicationValidation(
                    DeleteExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPublicationValidationRequest,
                                    DeleteExternalPublicationValidationResponse>
                            handler) {
        LOG.trace("Called async deleteExternalPublicationValidation");
        final DeleteExternalPublicationValidationRequest interceptedRequest =
                DeleteExternalPublicationValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalPublicationValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteExternalPublicationValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/DeleteExternalPublicationValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteExternalPublicationValidationResponse>
                transformer =
                        DeleteExternalPublicationValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteExternalPublicationValidationRequest,
                        DeleteExternalPublicationValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteExternalPublicationValidationRequest,
                                DeleteExternalPublicationValidationResponse>,
                        java.util.concurrent.Future<DeleteExternalPublicationValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteExternalPublicationValidationRequest,
                    DeleteExternalPublicationValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler) {
        LOG.trace("Called async deleteFolder");
        final DeleteFolderRequest interceptedRequest =
                DeleteFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFolderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteFolder",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/DeleteFolder");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFolderResponse>
                transformer =
                        DeleteFolderConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFolderRequest, DeleteFolderResponse>,
                        java.util.concurrent.Future<DeleteFolderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFolderRequest, DeleteFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionLibraryResponse> deleteFunctionLibrary(
            DeleteFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>
                    handler) {
        LOG.trace("Called async deleteFunctionLibrary");
        final DeleteFunctionLibraryRequest interceptedRequest =
                DeleteFunctionLibraryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteFunctionLibrary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/DeleteFunctionLibrary");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteFunctionLibraryResponse>
                transformer =
                        DeleteFunctionLibraryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>,
                        java.util.concurrent.Future<DeleteFunctionLibraryResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteImportRequestResponse> deleteImportRequest(
            DeleteImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteImportRequestRequest, DeleteImportRequestResponse>
                    handler) {
        LOG.trace("Called async deleteImportRequest");
        final DeleteImportRequestRequest interceptedRequest =
                DeleteImportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteImportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteImportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteImportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteImportRequestResponse>
                transformer =
                        DeleteImportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteImportRequestRequest, DeleteImportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteImportRequestRequest, DeleteImportRequestResponse>,
                        java.util.concurrent.Future<DeleteImportRequestResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteImportRequestRequest, DeleteImportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataIntegration",
                        "DeletePatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeletePatch");
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
    public java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRequest, DeletePipelineResponse>
                    handler) {
        LOG.trace("Called async deletePipeline");
        final DeletePipelineRequest interceptedRequest =
                DeletePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeletePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/DeletePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePipelineResponse>
                transformer =
                        DeletePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePipelineRequest, DeletePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePipelineRequest, DeletePipelineResponse>,
                        java.util.concurrent.Future<DeletePipelineResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePipelineRequest, DeletePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineValidationResponse> deletePipelineValidation(
            DeletePipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineValidationRequest, DeletePipelineValidationResponse>
                    handler) {
        LOG.trace("Called async deletePipelineValidation");
        final DeletePipelineValidationRequest interceptedRequest =
                DeletePipelineValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeletePipelineValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/DeletePipelineValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeletePipelineValidationResponse>
                transformer =
                        DeletePipelineValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePipelineValidationRequest, DeletePipelineValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePipelineValidationRequest, DeletePipelineValidationResponse>,
                        java.util.concurrent.Future<DeletePipelineValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePipelineValidationRequest, DeletePipelineValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {
        LOG.trace("Called async deleteProject");
        final DeleteProjectRequest interceptedRequest =
                DeleteProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/DeleteProject");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteProjectResponse>
                transformer =
                        DeleteProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteProjectRequest, DeleteProjectResponse>,
                        java.util.concurrent.Future<DeleteProjectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteProjectRequest, DeleteProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduleRequest, DeleteScheduleResponse>
                    handler) {
        LOG.trace("Called async deleteSchedule");
        final DeleteScheduleRequest interceptedRequest =
                DeleteScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/DeleteSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteScheduleResponse>
                transformer =
                        DeleteScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteScheduleRequest, DeleteScheduleResponse>,
                        java.util.concurrent.Future<DeleteScheduleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteScheduleRequest, DeleteScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskResponse> deleteTask(
            DeleteTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTaskRequest, DeleteTaskResponse>
                    handler) {
        LOG.trace("Called async deleteTask");
        final DeleteTaskRequest interceptedRequest = DeleteTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/DeleteTask");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTaskResponse>
                transformer =
                        DeleteTaskConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTaskRequest, DeleteTaskResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTaskRequest, DeleteTaskResponse>,
                        java.util.concurrent.Future<DeleteTaskResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTaskRequest, DeleteTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskRunResponse> deleteTaskRun(
            DeleteTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTaskRunRequest, DeleteTaskRunResponse>
                    handler) {
        LOG.trace("Called async deleteTaskRun");
        final DeleteTaskRunRequest interceptedRequest =
                DeleteTaskRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteTaskRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/DeleteTaskRun");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTaskRunResponse>
                transformer =
                        DeleteTaskRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTaskRunRequest, DeleteTaskRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTaskRunRequest, DeleteTaskRunResponse>,
                        java.util.concurrent.Future<DeleteTaskRunResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTaskRunRequest, DeleteTaskRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskScheduleResponse> deleteTaskSchedule(
            DeleteTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>
                    handler) {
        LOG.trace("Called async deleteTaskSchedule");
        final DeleteTaskScheduleRequest interceptedRequest =
                DeleteTaskScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteTaskSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/DeleteTaskSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTaskScheduleResponse>
                transformer =
                        DeleteTaskScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>,
                        java.util.concurrent.Future<DeleteTaskScheduleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskValidationResponse> deleteTaskValidation(
            DeleteTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskValidationRequest, DeleteTaskValidationResponse>
                    handler) {
        LOG.trace("Called async deleteTaskValidation");
        final DeleteTaskValidationRequest interceptedRequest =
                DeleteTaskValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteTaskValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/DeleteTaskValidation");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTaskValidationResponse>
                transformer =
                        DeleteTaskValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTaskValidationRequest, DeleteTaskValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTaskValidationRequest, DeleteTaskValidationResponse>,
                        java.util.concurrent.Future<DeleteTaskValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTaskValidationRequest, DeleteTaskValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDefinedFunctionResponse> deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResponse>
                    handler) {
        LOG.trace("Called async deleteUserDefinedFunction");
        final DeleteUserDefinedFunctionRequest interceptedRequest =
                DeleteUserDefinedFunctionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteUserDefinedFunction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/DeleteUserDefinedFunction");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteUserDefinedFunctionResponse>
                transformer =
                        DeleteUserDefinedFunctionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserDefinedFunctionRequest,
                                DeleteUserDefinedFunctionResponse>,
                        java.util.concurrent.Future<DeleteUserDefinedFunctionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDefinedFunctionValidationResponse>
            deleteUserDefinedFunctionValidation(
                    DeleteUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUserDefinedFunctionValidationRequest,
                                    DeleteUserDefinedFunctionValidationResponse>
                            handler) {
        LOG.trace("Called async deleteUserDefinedFunctionValidation");
        final DeleteUserDefinedFunctionValidationRequest interceptedRequest =
                DeleteUserDefinedFunctionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDefinedFunctionValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteUserDefinedFunctionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/DeleteUserDefinedFunctionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteUserDefinedFunctionValidationResponse>
                transformer =
                        DeleteUserDefinedFunctionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUserDefinedFunctionValidationRequest,
                        DeleteUserDefinedFunctionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserDefinedFunctionValidationRequest,
                                DeleteUserDefinedFunctionValidationResponse>,
                        java.util.concurrent.Future<DeleteUserDefinedFunctionValidationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserDefinedFunctionValidationRequest,
                    DeleteUserDefinedFunctionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResponse> deleteWorkspace(
            DeleteWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkspaceRequest, DeleteWorkspaceResponse>
                    handler) {
        LOG.trace("Called async deleteWorkspace");
        final DeleteWorkspaceRequest interceptedRequest =
                DeleteWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "DeleteWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteWorkspaceResponse>
                transformer =
                        DeleteWorkspaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteWorkspaceRequest, DeleteWorkspaceResponse>,
                        java.util.concurrent.Future<DeleteWorkspaceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteWorkspaceRequest, DeleteWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationRequest, GetApplicationResponse>
                    handler) {
        LOG.trace("Called async getApplication");
        final GetApplicationRequest interceptedRequest =
                GetApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetApplicationResponse>
                transformer =
                        GetApplicationConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetApplicationRequest, GetApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApplicationRequest, GetApplicationResponse>,
                        java.util.concurrent.Future<GetApplicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApplicationRequest, GetApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetApplicationDetailedDescriptionResponse>
            getApplicationDetailedDescription(
                    GetApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetApplicationDetailedDescriptionRequest,
                                    GetApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async getApplicationDetailedDescription");
        final GetApplicationDetailedDescriptionRequest interceptedRequest =
                GetApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationDetailedDescriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/GetApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetApplicationDetailedDescriptionResponse>
                transformer =
                        GetApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetApplicationDetailedDescriptionRequest,
                        GetApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApplicationDetailedDescriptionRequest,
                                GetApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<GetApplicationDetailedDescriptionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApplicationDetailedDescriptionRequest,
                    GetApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCompositeStateResponse> getCompositeState(
            GetCompositeStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompositeStateRequest, GetCompositeStateResponse>
                    handler) {
        LOG.trace("Called async getCompositeState");
        final GetCompositeStateRequest interceptedRequest =
                GetCompositeStateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompositeStateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetCompositeState",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CompositeState/GetCompositeState");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCompositeStateResponse>
                transformer =
                        GetCompositeStateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCompositeStateRequest, GetCompositeStateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCompositeStateRequest, GetCompositeStateResponse>,
                        java.util.concurrent.Future<GetCompositeStateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCompositeStateRequest, GetCompositeStateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {
        LOG.trace("Called async getConnection");
        final GetConnectionRequest interceptedRequest =
                GetConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/GetConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConnectionResponse>
                transformer =
                        GetConnectionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConnectionRequest, GetConnectionResponse>,
                        java.util.concurrent.Future<GetConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConnectionRequest, GetConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConnectionValidationResponse> getConnectionValidation(
            GetConnectionValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConnectionValidationRequest, GetConnectionValidationResponse>
                    handler) {
        LOG.trace("Called async getConnectionValidation");
        final GetConnectionValidationRequest interceptedRequest =
                GetConnectionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetConnectionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/GetConnectionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetConnectionValidationResponse>
                transformer =
                        GetConnectionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetConnectionValidationRequest, GetConnectionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConnectionValidationRequest, GetConnectionValidationResponse>,
                        java.util.concurrent.Future<GetConnectionValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConnectionValidationRequest, GetConnectionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCopyObjectRequestResponse> getCopyObjectRequest(
            GetCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>
                    handler) {
        LOG.trace("Called async getCopyObjectRequest");
        final GetCopyObjectRequestRequest interceptedRequest =
                GetCopyObjectRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCopyObjectRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetCopyObjectRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CopyObjectRequest/GetCopyObjectRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCopyObjectRequestResponse>
                transformer =
                        GetCopyObjectRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>,
                        java.util.concurrent.Future<GetCopyObjectRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCountStatisticResponse> getCountStatistic(
            GetCountStatisticRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCountStatisticRequest, GetCountStatisticResponse>
                    handler) {
        LOG.trace("Called async getCountStatistic");
        final GetCountStatisticRequest interceptedRequest =
                GetCountStatisticConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCountStatisticConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetCountStatistic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetCountStatistic");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCountStatisticResponse>
                transformer =
                        GetCountStatisticConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCountStatisticRequest, GetCountStatisticResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCountStatisticRequest, GetCountStatisticResponse>,
                        java.util.concurrent.Future<GetCountStatisticResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCountStatisticRequest, GetCountStatisticResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetResponse> getDataAsset(
            GetDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                    handler) {
        LOG.trace("Called async getDataAsset");
        final GetDataAssetRequest interceptedRequest =
                GetDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDataAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/GetDataAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataAssetResponse>
                transformer =
                        GetDataAssetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataAssetRequest, GetDataAssetResponse>,
                        java.util.concurrent.Future<GetDataAssetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataAssetRequest, GetDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataEntityResponse> getDataEntity(
            GetDataEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataEntityRequest, GetDataEntityResponse>
                    handler) {
        LOG.trace("Called async getDataEntity");
        final GetDataEntityRequest interceptedRequest =
                GetDataEntityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataEntityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDataEntity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/GetDataEntity");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataEntityResponse>
                transformer =
                        GetDataEntityConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDataEntityRequest, GetDataEntityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataEntityRequest, GetDataEntityResponse>,
                        java.util.concurrent.Future<GetDataEntityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataEntityRequest, GetDataEntityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataFlowResponse> getDataFlow(
            GetDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataFlowRequest, GetDataFlowResponse>
                    handler) {
        LOG.trace("Called async getDataFlow");
        final GetDataFlowRequest interceptedRequest =
                GetDataFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataFlowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDataFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/GetDataFlow");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataFlowResponse>
                transformer =
                        GetDataFlowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDataFlowRequest, GetDataFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataFlowRequest, GetDataFlowResponse>,
                        java.util.concurrent.Future<GetDataFlowResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataFlowRequest, GetDataFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDataFlowValidationResponse> getDataFlowValidation(
            GetDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataFlowValidationRequest, GetDataFlowValidationResponse>
                    handler) {
        LOG.trace("Called async getDataFlowValidation");
        final GetDataFlowValidationRequest interceptedRequest =
                GetDataFlowValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDataFlowValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/GetDataFlowValidation");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDataFlowValidationResponse>
                transformer =
                        GetDataFlowValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDataFlowValidationRequest, GetDataFlowValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDataFlowValidationRequest, GetDataFlowValidationResponse>,
                        java.util.concurrent.Future<GetDataFlowValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDataFlowValidationRequest, GetDataFlowValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDependentObjectResponse> getDependentObject(
            GetDependentObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDependentObjectRequest, GetDependentObjectResponse>
                    handler) {
        LOG.trace("Called async getDependentObject");
        final GetDependentObjectRequest interceptedRequest =
                GetDependentObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDependentObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDependentObject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetDependentObject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDependentObjectResponse>
                transformer =
                        GetDependentObjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDependentObjectRequest, GetDependentObjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDependentObjectRequest, GetDependentObjectResponse>,
                        java.util.concurrent.Future<GetDependentObjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDependentObjectRequest, GetDependentObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDisApplicationResponse> getDisApplication(
            GetDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDisApplicationRequest, GetDisApplicationResponse>
                    handler) {
        LOG.trace("Called async getDisApplication");
        final GetDisApplicationRequest interceptedRequest =
                GetDisApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDisApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/GetDisApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDisApplicationResponse>
                transformer =
                        GetDisApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDisApplicationRequest, GetDisApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDisApplicationRequest, GetDisApplicationResponse>,
                        java.util.concurrent.Future<GetDisApplicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDisApplicationRequest, GetDisApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDisApplicationDetailedDescriptionResponse>
            getDisApplicationDetailedDescription(
                    GetDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDisApplicationDetailedDescriptionRequest,
                                    GetDisApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async getDisApplicationDetailedDescription");
        final GetDisApplicationDetailedDescriptionRequest interceptedRequest =
                GetDisApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDisApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetDisApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/GetDisApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDisApplicationDetailedDescriptionResponse>
                transformer =
                        GetDisApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDisApplicationDetailedDescriptionRequest,
                        GetDisApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDisApplicationDetailedDescriptionRequest,
                                GetDisApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<GetDisApplicationDetailedDescriptionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDisApplicationDetailedDescriptionRequest,
                    GetDisApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExportRequestResponse> getExportRequest(
            GetExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExportRequestRequest, GetExportRequestResponse>
                    handler) {
        LOG.trace("Called async getExportRequest");
        final GetExportRequestRequest interceptedRequest =
                GetExportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetExportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExportRequest/GetExportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExportRequestResponse>
                transformer =
                        GetExportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetExportRequestRequest, GetExportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExportRequestRequest, GetExportRequestResponse>,
                        java.util.concurrent.Future<GetExportRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExportRequestRequest, GetExportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalPublicationResponse> getExternalPublication(
            GetExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalPublicationRequest, GetExternalPublicationResponse>
                    handler) {
        LOG.trace("Called async getExternalPublication");
        final GetExternalPublicationRequest interceptedRequest =
                GetExternalPublicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetExternalPublication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/GetExternalPublication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExternalPublicationResponse>
                transformer =
                        GetExternalPublicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalPublicationRequest, GetExternalPublicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalPublicationRequest, GetExternalPublicationResponse>,
                        java.util.concurrent.Future<GetExternalPublicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalPublicationRequest, GetExternalPublicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetExternalPublicationValidationResponse>
            getExternalPublicationValidation(
                    GetExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalPublicationValidationRequest,
                                    GetExternalPublicationValidationResponse>
                            handler) {
        LOG.trace("Called async getExternalPublicationValidation");
        final GetExternalPublicationValidationRequest interceptedRequest =
                GetExternalPublicationValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalPublicationValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetExternalPublicationValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/GetExternalPublicationValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetExternalPublicationValidationResponse>
                transformer =
                        GetExternalPublicationValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetExternalPublicationValidationRequest,
                        GetExternalPublicationValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetExternalPublicationValidationRequest,
                                GetExternalPublicationValidationResponse>,
                        java.util.concurrent.Future<GetExternalPublicationValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetExternalPublicationValidationRequest,
                    GetExternalPublicationValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>
                    handler) {
        LOG.trace("Called async getFolder");
        final GetFolderRequest interceptedRequest = GetFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFolderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetFolder",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/GetFolder");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFolderResponse>
                transformer =
                        GetFolderConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>,
                        java.util.concurrent.Future<GetFolderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFolderRequest, GetFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFunctionLibraryResponse> getFunctionLibrary(
            GetFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFunctionLibraryRequest, GetFunctionLibraryResponse>
                    handler) {
        LOG.trace("Called async getFunctionLibrary");
        final GetFunctionLibraryRequest interceptedRequest =
                GetFunctionLibraryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetFunctionLibrary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/GetFunctionLibrary");
        final java.util.function.Function<javax.ws.rs.core.Response, GetFunctionLibraryResponse>
                transformer =
                        GetFunctionLibraryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetFunctionLibraryRequest, GetFunctionLibraryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFunctionLibraryRequest, GetFunctionLibraryResponse>,
                        java.util.concurrent.Future<GetFunctionLibraryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFunctionLibraryRequest, GetFunctionLibraryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetImportRequestResponse> getImportRequest(
            GetImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetImportRequestRequest, GetImportRequestResponse>
                    handler) {
        LOG.trace("Called async getImportRequest");
        final GetImportRequestRequest interceptedRequest =
                GetImportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetImportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ImportRequest/GetImportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetImportRequestResponse>
                transformer =
                        GetImportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetImportRequestRequest, GetImportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetImportRequestRequest, GetImportRequestResponse>,
                        java.util.concurrent.Future<GetImportRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImportRequestRequest, GetImportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataIntegration",
                        "GetPatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPatch");
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
    public java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                    handler) {
        LOG.trace("Called async getPipeline");
        final GetPipelineRequest interceptedRequest =
                GetPipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetPipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/GetPipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPipelineResponse>
                transformer =
                        GetPipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPipelineRequest, GetPipelineResponse>,
                        java.util.concurrent.Future<GetPipelineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPipelineRequest, GetPipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPipelineValidationResponse> getPipelineValidation(
            GetPipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPipelineValidationRequest, GetPipelineValidationResponse>
                    handler) {
        LOG.trace("Called async getPipelineValidation");
        final GetPipelineValidationRequest interceptedRequest =
                GetPipelineValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetPipelineValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/GetPipelineValidation");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPipelineValidationResponse>
                transformer =
                        GetPipelineValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPipelineValidationRequest, GetPipelineValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPipelineValidationRequest, GetPipelineValidationResponse>,
                        java.util.concurrent.Future<GetPipelineValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPipelineValidationRequest, GetPipelineValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {
        LOG.trace("Called async getProject");
        final GetProjectRequest interceptedRequest = GetProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetProject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProjectResponse>
                transformer =
                        GetProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProjectRequest, GetProjectResponse>,
                        java.util.concurrent.Future<GetProjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProjectRequest, GetProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublishedObjectResponse> getPublishedObject(
            GetPublishedObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublishedObjectRequest, GetPublishedObjectResponse>
                    handler) {
        LOG.trace("Called async getPublishedObject");
        final GetPublishedObjectRequest interceptedRequest =
                GetPublishedObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublishedObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetPublishedObject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPublishedObject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPublishedObjectResponse>
                transformer =
                        GetPublishedObjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPublishedObjectRequest, GetPublishedObjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublishedObjectRequest, GetPublishedObjectResponse>,
                        java.util.concurrent.Future<GetPublishedObjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublishedObjectRequest, GetPublishedObjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetReferenceResponse> getReference(
            GetReferenceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetReferenceRequest, GetReferenceResponse>
                    handler) {
        LOG.trace("Called async getReference");
        final GetReferenceRequest interceptedRequest =
                GetReferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetReference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/GetReference");
        final java.util.function.Function<javax.ws.rs.core.Response, GetReferenceResponse>
                transformer =
                        GetReferenceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetReferenceRequest, GetReferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetReferenceRequest, GetReferenceResponse>,
                        java.util.concurrent.Future<GetReferenceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetReferenceRequest, GetReferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRuntimeOperatorResponse> getRuntimeOperator(
            GetRuntimeOperatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>
                    handler) {
        LOG.trace("Called async getRuntimeOperator");
        final GetRuntimeOperatorRequest interceptedRequest =
                GetRuntimeOperatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRuntimeOperatorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetRuntimeOperator",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimeOperator/GetRuntimeOperator");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRuntimeOperatorResponse>
                transformer =
                        GetRuntimeOperatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>,
                        java.util.concurrent.Future<GetRuntimeOperatorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRuntimePipelineResponse> getRuntimePipeline(
            GetRuntimePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimePipelineRequest, GetRuntimePipelineResponse>
                    handler) {
        LOG.trace("Called async getRuntimePipeline");
        final GetRuntimePipelineRequest interceptedRequest =
                GetRuntimePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRuntimePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetRuntimePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimePipeline/GetRuntimePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRuntimePipelineResponse>
                transformer =
                        GetRuntimePipelineConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRuntimePipelineRequest, GetRuntimePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRuntimePipelineRequest, GetRuntimePipelineResponse>,
                        java.util.concurrent.Future<GetRuntimePipelineResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRuntimePipelineRequest, GetRuntimePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                    handler) {
        LOG.trace("Called async getSchedule");
        final GetScheduleRequest interceptedRequest =
                GetScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/GetSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetScheduleResponse>
                transformer =
                        GetScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetScheduleRequest, GetScheduleResponse>,
                        java.util.concurrent.Future<GetScheduleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetScheduleRequest, GetScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResponse> getSchema(
            GetSchemaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse>
                    handler) {
        LOG.trace("Called async getSchema");
        final GetSchemaRequest interceptedRequest = GetSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/GetSchema");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSchemaResponse>
                transformer =
                        GetSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse>,
                        java.util.concurrent.Future<GetSchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSchemaRequest, GetSchemaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTaskResponse> getTask(
            GetTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTaskRequest, GetTaskResponse> handler) {
        LOG.trace("Called async getTask");
        final GetTaskRequest interceptedRequest = GetTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/GetTask");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTaskResponse> transformer =
                GetTaskConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTaskRequest, GetTaskResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetTaskRequest, GetTaskResponse>,
                        java.util.concurrent.Future<GetTaskResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTaskRequest, GetTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTaskRunResponse> getTaskRun(
            GetTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTaskRunRequest, GetTaskRunResponse>
                    handler) {
        LOG.trace("Called async getTaskRun");
        final GetTaskRunRequest interceptedRequest = GetTaskRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetTaskRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/GetTaskRun");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTaskRunResponse>
                transformer =
                        GetTaskRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTaskRunRequest, GetTaskRunResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTaskRunRequest, GetTaskRunResponse>,
                        java.util.concurrent.Future<GetTaskRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTaskRunRequest, GetTaskRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTaskScheduleResponse> getTaskSchedule(
            GetTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaskScheduleRequest, GetTaskScheduleResponse>
                    handler) {
        LOG.trace("Called async getTaskSchedule");
        final GetTaskScheduleRequest interceptedRequest =
                GetTaskScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetTaskSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/GetTaskSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTaskScheduleResponse>
                transformer =
                        GetTaskScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTaskScheduleRequest, GetTaskScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTaskScheduleRequest, GetTaskScheduleResponse>,
                        java.util.concurrent.Future<GetTaskScheduleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTaskScheduleRequest, GetTaskScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTaskValidationResponse> getTaskValidation(
            GetTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaskValidationRequest, GetTaskValidationResponse>
                    handler) {
        LOG.trace("Called async getTaskValidation");
        final GetTaskValidationRequest interceptedRequest =
                GetTaskValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetTaskValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/GetTaskValidation");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTaskValidationResponse>
                transformer =
                        GetTaskValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTaskValidationRequest, GetTaskValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTaskValidationRequest, GetTaskValidationResponse>,
                        java.util.concurrent.Future<GetTaskValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTaskValidationRequest, GetTaskValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResponse> getTemplate(
            GetTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse>
                    handler) {
        LOG.trace("Called async getTemplate");
        final GetTemplateRequest interceptedRequest =
                GetTemplateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTemplateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetTemplate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Template/GetTemplate");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTemplateResponse>
                transformer =
                        GetTemplateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTemplateRequest, GetTemplateResponse>,
                        java.util.concurrent.Future<GetTemplateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTemplateRequest, GetTemplateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionResponse> getUserDefinedFunction(
            GetUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>
                    handler) {
        LOG.trace("Called async getUserDefinedFunction");
        final GetUserDefinedFunctionRequest interceptedRequest =
                GetUserDefinedFunctionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetUserDefinedFunction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/GetUserDefinedFunction");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserDefinedFunctionResponse>
                transformer =
                        GetUserDefinedFunctionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>,
                        java.util.concurrent.Future<GetUserDefinedFunctionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionValidationResponse>
            getUserDefinedFunctionValidation(
                    GetUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserDefinedFunctionValidationRequest,
                                    GetUserDefinedFunctionValidationResponse>
                            handler) {
        LOG.trace("Called async getUserDefinedFunctionValidation");
        final GetUserDefinedFunctionValidationRequest interceptedRequest =
                GetUserDefinedFunctionValidationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDefinedFunctionValidationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetUserDefinedFunctionValidation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/GetUserDefinedFunctionValidation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetUserDefinedFunctionValidationResponse>
                transformer =
                        GetUserDefinedFunctionValidationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserDefinedFunctionValidationRequest,
                        GetUserDefinedFunctionValidationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserDefinedFunctionValidationRequest,
                                GetUserDefinedFunctionValidationResponse>,
                        java.util.concurrent.Future<GetUserDefinedFunctionValidationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserDefinedFunctionValidationRequest,
                    GetUserDefinedFunctionValidationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataIntegration",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<GetWorkspaceResponse> getWorkspace(
            GetWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResponse>
                    handler) {
        LOG.trace("Called async getWorkspace");
        final GetWorkspaceRequest interceptedRequest =
                GetWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "GetWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/GetWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, GetWorkspaceResponse>
                transformer =
                        GetWorkspaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWorkspaceRequest, GetWorkspaceResponse>,
                        java.util.concurrent.Future<GetWorkspaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWorkspaceRequest, GetWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationsRequest, ListApplicationsResponse>
                    handler) {
        LOG.trace("Called async listApplications");
        final ListApplicationsRequest interceptedRequest =
                ListApplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListApplications");
        final java.util.function.Function<javax.ws.rs.core.Response, ListApplicationsResponse>
                transformer =
                        ListApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListApplicationsRequest, ListApplicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApplicationsRequest, ListApplicationsResponse>,
                        java.util.concurrent.Future<ListApplicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApplicationsRequest, ListApplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConnectionValidationsResponse> listConnectionValidations(
            ListConnectionValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionValidationsRequest, ListConnectionValidationsResponse>
                    handler) {
        LOG.trace("Called async listConnectionValidations");
        final ListConnectionValidationsRequest interceptedRequest =
                ListConnectionValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListConnectionValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/ListConnectionValidations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListConnectionValidationsResponse>
                transformer =
                        ListConnectionValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListConnectionValidationsRequest, ListConnectionValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConnectionValidationsRequest,
                                ListConnectionValidationsResponse>,
                        java.util.concurrent.Future<ListConnectionValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConnectionValidationsRequest, ListConnectionValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {
        LOG.trace("Called async listConnections");
        final ListConnectionsRequest interceptedRequest =
                ListConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/ListConnections");
        final java.util.function.Function<javax.ws.rs.core.Response, ListConnectionsResponse>
                transformer =
                        ListConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConnectionsRequest, ListConnectionsResponse>,
                        java.util.concurrent.Future<ListConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConnectionsRequest, ListConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCopyObjectRequestsResponse> listCopyObjectRequests(
            ListCopyObjectRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>
                    handler) {
        LOG.trace("Called async listCopyObjectRequests");
        final ListCopyObjectRequestsRequest interceptedRequest =
                ListCopyObjectRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCopyObjectRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListCopyObjectRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CopyObjectRequestSummaryCollection/ListCopyObjectRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCopyObjectRequestsResponse>
                transformer =
                        ListCopyObjectRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>,
                        java.util.concurrent.Future<ListCopyObjectRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetsRequest, ListDataAssetsResponse>
                    handler) {
        LOG.trace("Called async listDataAssets");
        final ListDataAssetsRequest interceptedRequest =
                ListDataAssetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAssetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDataAssets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/ListDataAssets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataAssetsResponse>
                transformer =
                        ListDataAssetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDataAssetsRequest, ListDataAssetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataAssetsRequest, ListDataAssetsResponse>,
                        java.util.concurrent.Future<ListDataAssetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataAssetsRequest, ListDataAssetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataEntitiesResponse> listDataEntities(
            ListDataEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataEntitiesRequest, ListDataEntitiesResponse>
                    handler) {
        LOG.trace("Called async listDataEntities");
        final ListDataEntitiesRequest interceptedRequest =
                ListDataEntitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataEntitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDataEntities",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/ListDataEntities");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataEntitiesResponse>
                transformer =
                        ListDataEntitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDataEntitiesRequest, ListDataEntitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataEntitiesRequest, ListDataEntitiesResponse>,
                        java.util.concurrent.Future<ListDataEntitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataEntitiesRequest, ListDataEntitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataFlowValidationsResponse> listDataFlowValidations(
            ListDataFlowValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>
                    handler) {
        LOG.trace("Called async listDataFlowValidations");
        final ListDataFlowValidationsRequest interceptedRequest =
                ListDataFlowValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataFlowValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDataFlowValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/ListDataFlowValidations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDataFlowValidationsResponse>
                transformer =
                        ListDataFlowValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>,
                        java.util.concurrent.Future<ListDataFlowValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataFlowsResponse> listDataFlows(
            ListDataFlowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDataFlowsRequest, ListDataFlowsResponse>
                    handler) {
        LOG.trace("Called async listDataFlows");
        final ListDataFlowsRequest interceptedRequest =
                ListDataFlowsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataFlowsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDataFlows",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/ListDataFlows");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDataFlowsResponse>
                transformer =
                        ListDataFlowsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDataFlowsRequest, ListDataFlowsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataFlowsRequest, ListDataFlowsResponse>,
                        java.util.concurrent.Future<ListDataFlowsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataFlowsRequest, ListDataFlowsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDependentObjectsResponse> listDependentObjects(
            ListDependentObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDependentObjectsRequest, ListDependentObjectsResponse>
                    handler) {
        LOG.trace("Called async listDependentObjects");
        final ListDependentObjectsRequest interceptedRequest =
                ListDependentObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDependentObjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDependentObjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListDependentObjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDependentObjectsResponse>
                transformer =
                        ListDependentObjectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDependentObjectsRequest, ListDependentObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDependentObjectsRequest, ListDependentObjectsResponse>,
                        java.util.concurrent.Future<ListDependentObjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDependentObjectsRequest, ListDependentObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDisApplicationTaskRunLineagesResponse>
            listDisApplicationTaskRunLineages(
                    ListDisApplicationTaskRunLineagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDisApplicationTaskRunLineagesRequest,
                                    ListDisApplicationTaskRunLineagesResponse>
                            handler) {
        LOG.trace("Called async listDisApplicationTaskRunLineages");
        final ListDisApplicationTaskRunLineagesRequest interceptedRequest =
                ListDisApplicationTaskRunLineagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDisApplicationTaskRunLineagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDisApplicationTaskRunLineages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLineageSummaryCollection/ListDisApplicationTaskRunLineages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDisApplicationTaskRunLineagesResponse>
                transformer =
                        ListDisApplicationTaskRunLineagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDisApplicationTaskRunLineagesRequest,
                        ListDisApplicationTaskRunLineagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDisApplicationTaskRunLineagesRequest,
                                ListDisApplicationTaskRunLineagesResponse>,
                        java.util.concurrent.Future<ListDisApplicationTaskRunLineagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDisApplicationTaskRunLineagesRequest,
                    ListDisApplicationTaskRunLineagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDisApplicationsResponse> listDisApplications(
            ListDisApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDisApplicationsRequest, ListDisApplicationsResponse>
                    handler) {
        LOG.trace("Called async listDisApplications");
        final ListDisApplicationsRequest interceptedRequest =
                ListDisApplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDisApplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListDisApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ListDisApplications");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDisApplicationsResponse>
                transformer =
                        ListDisApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDisApplicationsRequest, ListDisApplicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDisApplicationsRequest, ListDisApplicationsResponse>,
                        java.util.concurrent.Future<ListDisApplicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDisApplicationsRequest, ListDisApplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExportRequestsResponse> listExportRequests(
            ListExportRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExportRequestsRequest, ListExportRequestsResponse>
                    handler) {
        LOG.trace("Called async listExportRequests");
        final ListExportRequestsRequest interceptedRequest =
                ListExportRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExportRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListExportRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExportRequestSummaryCollection/ListExportRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExportRequestsResponse>
                transformer =
                        ListExportRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListExportRequestsRequest, ListExportRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExportRequestsRequest, ListExportRequestsResponse>,
                        java.util.concurrent.Future<ListExportRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExportRequestsRequest, ListExportRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalPublicationValidationsResponse>
            listExternalPublicationValidations(
                    ListExternalPublicationValidationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPublicationValidationsRequest,
                                    ListExternalPublicationValidationsResponse>
                            handler) {
        LOG.trace("Called async listExternalPublicationValidations");
        final ListExternalPublicationValidationsRequest interceptedRequest =
                ListExternalPublicationValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalPublicationValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListExternalPublicationValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/ListExternalPublicationValidations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalPublicationValidationsResponse>
                transformer =
                        ListExternalPublicationValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalPublicationValidationsRequest,
                        ListExternalPublicationValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalPublicationValidationsRequest,
                                ListExternalPublicationValidationsResponse>,
                        java.util.concurrent.Future<ListExternalPublicationValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalPublicationValidationsRequest,
                    ListExternalPublicationValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListExternalPublicationsResponse> listExternalPublications(
            ListExternalPublicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalPublicationsRequest, ListExternalPublicationsResponse>
                    handler) {
        LOG.trace("Called async listExternalPublications");
        final ListExternalPublicationsRequest interceptedRequest =
                ListExternalPublicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalPublicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListExternalPublications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/ListExternalPublications");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListExternalPublicationsResponse>
                transformer =
                        ListExternalPublicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListExternalPublicationsRequest, ListExternalPublicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListExternalPublicationsRequest, ListExternalPublicationsResponse>,
                        java.util.concurrent.Future<ListExternalPublicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListExternalPublicationsRequest, ListExternalPublicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                    handler) {
        LOG.trace("Called async listFolders");
        final ListFoldersRequest interceptedRequest =
                ListFoldersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFoldersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListFolders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/ListFolders");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFoldersResponse>
                transformer =
                        ListFoldersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFoldersRequest, ListFoldersResponse>,
                        java.util.concurrent.Future<ListFoldersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFoldersRequest, ListFoldersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFunctionLibrariesResponse> listFunctionLibraries(
            ListFunctionLibrariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>
                    handler) {
        LOG.trace("Called async listFunctionLibraries");
        final ListFunctionLibrariesRequest interceptedRequest =
                ListFunctionLibrariesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFunctionLibrariesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListFunctionLibraries",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/ListFunctionLibraries");
        final java.util.function.Function<javax.ws.rs.core.Response, ListFunctionLibrariesResponse>
                transformer =
                        ListFunctionLibrariesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>,
                        java.util.concurrent.Future<ListFunctionLibrariesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImportRequestsResponse> listImportRequests(
            ListImportRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImportRequestsRequest, ListImportRequestsResponse>
                    handler) {
        LOG.trace("Called async listImportRequests");
        final ListImportRequestsRequest interceptedRequest =
                ListImportRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImportRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListImportRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ImportRequestSummaryCollection/ListImportRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListImportRequestsResponse>
                transformer =
                        ListImportRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListImportRequestsRequest, ListImportRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImportRequestsRequest, ListImportRequestsResponse>,
                        java.util.concurrent.Future<ListImportRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImportRequestsRequest, ListImportRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPatchChangesResponse> listPatchChanges(
            ListPatchChangesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPatchChangesRequest, ListPatchChangesResponse>
                    handler) {
        LOG.trace("Called async listPatchChanges");
        final ListPatchChangesRequest interceptedRequest =
                ListPatchChangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatchChangesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListPatchChanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatchChanges");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPatchChangesResponse>
                transformer =
                        ListPatchChangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPatchChangesRequest, ListPatchChangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPatchChangesRequest, ListPatchChangesResponse>,
                        java.util.concurrent.Future<ListPatchChangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPatchChangesRequest, ListPatchChangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataIntegration",
                        "ListPatches",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatches");
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
    public java.util.concurrent.Future<ListPipelineValidationsResponse> listPipelineValidations(
            ListPipelineValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPipelineValidationsRequest, ListPipelineValidationsResponse>
                    handler) {
        LOG.trace("Called async listPipelineValidations");
        final ListPipelineValidationsRequest interceptedRequest =
                ListPipelineValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelineValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListPipelineValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/ListPipelineValidations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListPipelineValidationsResponse>
                transformer =
                        ListPipelineValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPipelineValidationsRequest, ListPipelineValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPipelineValidationsRequest, ListPipelineValidationsResponse>,
                        java.util.concurrent.Future<ListPipelineValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPipelineValidationsRequest, ListPipelineValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler) {
        LOG.trace("Called async listPipelines");
        final ListPipelinesRequest interceptedRequest =
                ListPipelinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListPipelines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/ListPipelines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPipelinesResponse>
                transformer =
                        ListPipelinesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPipelinesRequest, ListPipelinesResponse>,
                        java.util.concurrent.Future<ListPipelinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPipelinesRequest, ListPipelinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {
        LOG.trace("Called async listProjects");
        final ListProjectsRequest interceptedRequest =
                ListProjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListProjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/ListProjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProjectsResponse>
                transformer =
                        ListProjectsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProjectsRequest, ListProjectsResponse>,
                        java.util.concurrent.Future<ListProjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProjectsRequest, ListProjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPublishedObjectsResponse> listPublishedObjects(
            ListPublishedObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublishedObjectsRequest, ListPublishedObjectsResponse>
                    handler) {
        LOG.trace("Called async listPublishedObjects");
        final ListPublishedObjectsRequest interceptedRequest =
                ListPublishedObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublishedObjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListPublishedObjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPublishedObjects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPublishedObjectsResponse>
                transformer =
                        ListPublishedObjectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPublishedObjectsRequest, ListPublishedObjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPublishedObjectsRequest, ListPublishedObjectsResponse>,
                        java.util.concurrent.Future<ListPublishedObjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPublishedObjectsRequest, ListPublishedObjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListReferencesResponse> listReferences(
            ListReferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReferencesRequest, ListReferencesResponse>
                    handler) {
        LOG.trace("Called async listReferences");
        final ListReferencesRequest interceptedRequest =
                ListReferencesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReferencesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListReferences",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/ListReferences");
        final java.util.function.Function<javax.ws.rs.core.Response, ListReferencesResponse>
                transformer =
                        ListReferencesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListReferencesRequest, ListReferencesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListReferencesRequest, ListReferencesResponse>,
                        java.util.concurrent.Future<ListReferencesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListReferencesRequest, ListReferencesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRuntimeOperatorsResponse> listRuntimeOperators(
            ListRuntimeOperatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>
                    handler) {
        LOG.trace("Called async listRuntimeOperators");
        final ListRuntimeOperatorsRequest interceptedRequest =
                ListRuntimeOperatorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRuntimeOperatorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListRuntimeOperators",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimeOperatorSummaryCollection/ListRuntimeOperators");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRuntimeOperatorsResponse>
                transformer =
                        ListRuntimeOperatorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>,
                        java.util.concurrent.Future<ListRuntimeOperatorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRuntimePipelinesResponse> listRuntimePipelines(
            ListRuntimePipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>
                    handler) {
        LOG.trace("Called async listRuntimePipelines");
        final ListRuntimePipelinesRequest interceptedRequest =
                ListRuntimePipelinesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRuntimePipelinesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListRuntimePipelines",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimePipelineSummaryCollection/ListRuntimePipelines");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRuntimePipelinesResponse>
                transformer =
                        ListRuntimePipelinesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>,
                        java.util.concurrent.Future<ListRuntimePipelinesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler) {
        LOG.trace("Called async listSchedules");
        final ListSchedulesRequest interceptedRequest =
                ListSchedulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchedulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListSchedules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/ListSchedules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchedulesResponse>
                transformer =
                        ListSchedulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchedulesRequest, ListSchedulesResponse>,
                        java.util.concurrent.Future<ListSchedulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchedulesRequest, ListSchedulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {
        LOG.trace("Called async listSchemas");
        final ListSchemasRequest interceptedRequest =
                ListSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/ListSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer =
                        ListSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchemasRequest, ListSchemasResponse>,
                        java.util.concurrent.Future<ListSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchemasRequest, ListSchemasResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunLineagesResponse> listTaskRunLineages(
            ListTaskRunLineagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>
                    handler) {
        LOG.trace("Called async listTaskRunLineages");
        final ListTaskRunLineagesRequest interceptedRequest =
                ListTaskRunLineagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskRunLineagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTaskRunLineages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLineageSummaryCollection/ListTaskRunLineages");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTaskRunLineagesResponse>
                transformer =
                        ListTaskRunLineagesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>,
                        java.util.concurrent.Future<ListTaskRunLineagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunLogsResponse> listTaskRunLogs(
            ListTaskRunLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRunLogsRequest, ListTaskRunLogsResponse>
                    handler) {
        LOG.trace("Called async listTaskRunLogs");
        final ListTaskRunLogsRequest interceptedRequest =
                ListTaskRunLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskRunLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTaskRunLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLogSummary/ListTaskRunLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTaskRunLogsResponse>
                transformer =
                        ListTaskRunLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTaskRunLogsRequest, ListTaskRunLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaskRunLogsRequest, ListTaskRunLogsResponse>,
                        java.util.concurrent.Future<ListTaskRunLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaskRunLogsRequest, ListTaskRunLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunsResponse> listTaskRuns(
            ListTaskRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTaskRunsRequest, ListTaskRunsResponse>
                    handler) {
        LOG.trace("Called async listTaskRuns");
        final ListTaskRunsRequest interceptedRequest =
                ListTaskRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTaskRuns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/ListTaskRuns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTaskRunsResponse>
                transformer =
                        ListTaskRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTaskRunsRequest, ListTaskRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaskRunsRequest, ListTaskRunsResponse>,
                        java.util.concurrent.Future<ListTaskRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaskRunsRequest, ListTaskRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaskSchedulesResponse> listTaskSchedules(
            ListTaskSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskSchedulesRequest, ListTaskSchedulesResponse>
                    handler) {
        LOG.trace("Called async listTaskSchedules");
        final ListTaskSchedulesRequest interceptedRequest =
                ListTaskSchedulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskSchedulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTaskSchedules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/ListTaskSchedules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTaskSchedulesResponse>
                transformer =
                        ListTaskSchedulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTaskSchedulesRequest, ListTaskSchedulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaskSchedulesRequest, ListTaskSchedulesResponse>,
                        java.util.concurrent.Future<ListTaskSchedulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaskSchedulesRequest, ListTaskSchedulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTaskValidationsResponse> listTaskValidations(
            ListTaskValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskValidationsRequest, ListTaskValidationsResponse>
                    handler) {
        LOG.trace("Called async listTaskValidations");
        final ListTaskValidationsRequest interceptedRequest =
                ListTaskValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTaskValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/ListTaskValidations");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTaskValidationsResponse>
                transformer =
                        ListTaskValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTaskValidationsRequest, ListTaskValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTaskValidationsRequest, ListTaskValidationsResponse>,
                        java.util.concurrent.Future<ListTaskValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTaskValidationsRequest, ListTaskValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTasksResponse> listTasks(
            ListTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTasksRequest, ListTasksResponse>
                    handler) {
        LOG.trace("Called async listTasks");
        final ListTasksRequest interceptedRequest = ListTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTasksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/ListTasks");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTasksResponse>
                transformer =
                        ListTasksConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTasksRequest, ListTasksResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListTasksRequest, ListTasksResponse>,
                        java.util.concurrent.Future<ListTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTasksRequest, ListTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResponse> listTemplates(
            ListTemplatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                    handler) {
        LOG.trace("Called async listTemplates");
        final ListTemplatesRequest interceptedRequest =
                ListTemplatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTemplatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListTemplates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Template/ListTemplates");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTemplatesResponse>
                transformer =
                        ListTemplatesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTemplatesRequest, ListTemplatesResponse>,
                        java.util.concurrent.Future<ListTemplatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTemplatesRequest, ListTemplatesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserDefinedFunctionValidationsResponse>
            listUserDefinedFunctionValidations(
                    ListUserDefinedFunctionValidationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUserDefinedFunctionValidationsRequest,
                                    ListUserDefinedFunctionValidationsResponse>
                            handler) {
        LOG.trace("Called async listUserDefinedFunctionValidations");
        final ListUserDefinedFunctionValidationsRequest interceptedRequest =
                ListUserDefinedFunctionValidationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDefinedFunctionValidationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListUserDefinedFunctionValidations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/ListUserDefinedFunctionValidations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListUserDefinedFunctionValidationsResponse>
                transformer =
                        ListUserDefinedFunctionValidationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserDefinedFunctionValidationsRequest,
                        ListUserDefinedFunctionValidationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserDefinedFunctionValidationsRequest,
                                ListUserDefinedFunctionValidationsResponse>,
                        java.util.concurrent.Future<ListUserDefinedFunctionValidationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserDefinedFunctionValidationsRequest,
                    ListUserDefinedFunctionValidationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserDefinedFunctionsResponse> listUserDefinedFunctions(
            ListUserDefinedFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>
                    handler) {
        LOG.trace("Called async listUserDefinedFunctions");
        final ListUserDefinedFunctionsRequest interceptedRequest =
                ListUserDefinedFunctionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDefinedFunctionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListUserDefinedFunctions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/ListUserDefinedFunctions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListUserDefinedFunctionsResponse>
                transformer =
                        ListUserDefinedFunctionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>,
                        java.util.concurrent.Future<ListUserDefinedFunctionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DataIntegration",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestErrors");
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
                        "DataIntegration",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestLogs");
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
                        "DataIntegration",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<ListWorkspacesResponse> listWorkspaces(
            ListWorkspacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkspacesRequest, ListWorkspacesResponse>
                    handler) {
        LOG.trace("Called async listWorkspaces");
        final ListWorkspacesRequest interceptedRequest =
                ListWorkspacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkspacesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "ListWorkspaces",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ListWorkspaces");
        final java.util.function.Function<javax.ws.rs.core.Response, ListWorkspacesResponse>
                transformer =
                        ListWorkspacesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkspacesRequest, ListWorkspacesResponse>,
                        java.util.concurrent.Future<ListWorkspacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkspacesRequest, ListWorkspacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartWorkspaceResponse> startWorkspace(
            StartWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartWorkspaceRequest, StartWorkspaceResponse>
                    handler) {
        LOG.trace("Called async startWorkspace");
        final StartWorkspaceRequest interceptedRequest =
                StartWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "StartWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StartWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, StartWorkspaceResponse>
                transformer =
                        StartWorkspaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartWorkspaceRequest, StartWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartWorkspaceRequest, StartWorkspaceResponse>,
                        java.util.concurrent.Future<StartWorkspaceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartWorkspaceRequest, StartWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopWorkspaceResponse> stopWorkspace(
            StopWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopWorkspaceRequest, StopWorkspaceResponse>
                    handler) {
        LOG.trace("Called async stopWorkspace");
        final StopWorkspaceRequest interceptedRequest =
                StopWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "StopWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StopWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, StopWorkspaceResponse>
                transformer =
                        StopWorkspaceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopWorkspaceRequest, StopWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopWorkspaceRequest, StopWorkspaceResponse>,
                        java.util.concurrent.Future<StopWorkspaceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopWorkspaceRequest, StopWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler) {
        LOG.trace("Called async updateApplication");
        final UpdateApplicationRequest interceptedRequest =
                UpdateApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/UpdateApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateApplicationResponse>
                transformer =
                        UpdateApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateApplicationRequest, UpdateApplicationResponse>,
                        java.util.concurrent.Future<UpdateApplicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateApplicationRequest, UpdateApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationDetailedDescriptionResponse>
            updateApplicationDetailedDescription(
                    UpdateApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateApplicationDetailedDescriptionRequest,
                                    UpdateApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async updateApplicationDetailedDescription");
        final UpdateApplicationDetailedDescriptionRequest interceptedRequest =
                UpdateApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/UpdateApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateApplicationDetailedDescriptionResponse>
                transformer =
                        UpdateApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateApplicationDetailedDescriptionRequest,
                        UpdateApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateApplicationDetailedDescriptionRequest,
                                UpdateApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<UpdateApplicationDetailedDescriptionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateApplicationDetailedDescriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateApplicationDetailedDescriptionRequest,
                    UpdateApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {
        LOG.trace("Called async updateConnection");
        final UpdateConnectionRequest interceptedRequest =
                UpdateConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/UpdateConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateConnectionResponse>
                transformer =
                        UpdateConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConnectionRequest, UpdateConnectionResponse>,
                        java.util.concurrent.Future<UpdateConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConnectionRequest, UpdateConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCopyObjectRequestResponse> updateCopyObjectRequest(
            UpdateCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>
                    handler) {
        LOG.trace("Called async updateCopyObjectRequest");
        final UpdateCopyObjectRequestRequest interceptedRequest =
                UpdateCopyObjectRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCopyObjectRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateCopyObjectRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateCopyObjectRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCopyObjectRequestResponse>
                transformer =
                        UpdateCopyObjectRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>,
                        java.util.concurrent.Future<UpdateCopyObjectRequestResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCopyObjectRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler) {
        LOG.trace("Called async updateDataAsset");
        final UpdateDataAssetRequest interceptedRequest =
                UpdateDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateDataAsset",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/UpdateDataAsset");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDataAssetResponse>
                transformer =
                        UpdateDataAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDataAssetRequest, UpdateDataAssetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataAssetRequest, UpdateDataAssetResponse>,
                        java.util.concurrent.Future<UpdateDataAssetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataAssetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataAssetRequest, UpdateDataAssetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDataFlowResponse> updateDataFlow(
            UpdateDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataFlowRequest, UpdateDataFlowResponse>
                    handler) {
        LOG.trace("Called async updateDataFlow");
        final UpdateDataFlowRequest interceptedRequest =
                UpdateDataFlowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataFlowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateDataFlow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/UpdateDataFlow");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDataFlowResponse>
                transformer =
                        UpdateDataFlowConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDataFlowRequest, UpdateDataFlowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDataFlowRequest, UpdateDataFlowResponse>,
                        java.util.concurrent.Future<UpdateDataFlowResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDataFlowDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDataFlowRequest, UpdateDataFlowResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDisApplicationResponse> updateDisApplication(
            UpdateDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDisApplicationRequest, UpdateDisApplicationResponse>
                    handler) {
        LOG.trace("Called async updateDisApplication");
        final UpdateDisApplicationRequest interceptedRequest =
                UpdateDisApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateDisApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/UpdateDisApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDisApplicationResponse>
                transformer =
                        UpdateDisApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDisApplicationRequest, UpdateDisApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDisApplicationRequest, UpdateDisApplicationResponse>,
                        java.util.concurrent.Future<UpdateDisApplicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDisApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDisApplicationRequest, UpdateDisApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDisApplicationDetailedDescriptionResponse>
            updateDisApplicationDetailedDescription(
                    UpdateDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDisApplicationDetailedDescriptionRequest,
                                    UpdateDisApplicationDetailedDescriptionResponse>
                            handler) {
        LOG.trace("Called async updateDisApplicationDetailedDescription");
        final UpdateDisApplicationDetailedDescriptionRequest interceptedRequest =
                UpdateDisApplicationDetailedDescriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDisApplicationDetailedDescriptionConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateDisApplicationDetailedDescription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/UpdateDisApplicationDetailedDescription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDisApplicationDetailedDescriptionResponse>
                transformer =
                        UpdateDisApplicationDetailedDescriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDisApplicationDetailedDescriptionRequest,
                        UpdateDisApplicationDetailedDescriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDisApplicationDetailedDescriptionRequest,
                                UpdateDisApplicationDetailedDescriptionResponse>,
                        java.util.concurrent.Future<
                                UpdateDisApplicationDetailedDescriptionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDisApplicationDetailedDescriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDisApplicationDetailedDescriptionRequest,
                    UpdateDisApplicationDetailedDescriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExportRequestResponse> updateExportRequest(
            UpdateExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportRequestRequest, UpdateExportRequestResponse>
                    handler) {
        LOG.trace("Called async updateExportRequest");
        final UpdateExportRequestRequest interceptedRequest =
                UpdateExportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateExportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateExportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExportRequestResponse>
                transformer =
                        UpdateExportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExportRequestRequest, UpdateExportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExportRequestRequest, UpdateExportRequestResponse>,
                        java.util.concurrent.Future<UpdateExportRequestResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExportRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExportRequestRequest, UpdateExportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalPublicationResponse> updateExternalPublication(
            UpdateExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalPublicationRequest, UpdateExternalPublicationResponse>
                    handler) {
        LOG.trace("Called async updateExternalPublication");
        final UpdateExternalPublicationRequest interceptedRequest =
                UpdateExternalPublicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateExternalPublication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/UpdateExternalPublication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateExternalPublicationResponse>
                transformer =
                        UpdateExternalPublicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateExternalPublicationRequest, UpdateExternalPublicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateExternalPublicationRequest,
                                UpdateExternalPublicationResponse>,
                        java.util.concurrent.Future<UpdateExternalPublicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateExternalPublicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateExternalPublicationRequest, UpdateExternalPublicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler) {
        LOG.trace("Called async updateFolder");
        final UpdateFolderRequest interceptedRequest =
                UpdateFolderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFolderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateFolder",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/UpdateFolder");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFolderResponse>
                transformer =
                        UpdateFolderConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFolderRequest, UpdateFolderResponse>,
                        java.util.concurrent.Future<UpdateFolderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFolderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFolderRequest, UpdateFolderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionLibraryResponse> updateFunctionLibrary(
            UpdateFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>
                    handler) {
        LOG.trace("Called async updateFunctionLibrary");
        final UpdateFunctionLibraryRequest interceptedRequest =
                UpdateFunctionLibraryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateFunctionLibrary",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/UpdateFunctionLibrary");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateFunctionLibraryResponse>
                transformer =
                        UpdateFunctionLibraryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>,
                        java.util.concurrent.Future<UpdateFunctionLibraryResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateFunctionLibraryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateImportRequestResponse> updateImportRequest(
            UpdateImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateImportRequestRequest, UpdateImportRequestResponse>
                    handler) {
        LOG.trace("Called async updateImportRequest");
        final UpdateImportRequestRequest interceptedRequest =
                UpdateImportRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateImportRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateImportRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateImportRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateImportRequestResponse>
                transformer =
                        UpdateImportRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateImportRequestRequest, UpdateImportRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateImportRequestRequest, UpdateImportRequestResponse>,
                        java.util.concurrent.Future<UpdateImportRequestResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateImportRequestDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateImportRequestRequest, UpdateImportRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRequest, UpdatePipelineResponse>
                    handler) {
        LOG.trace("Called async updatePipeline");
        final UpdatePipelineRequest interceptedRequest =
                UpdatePipelineConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePipelineConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdatePipeline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/UpdatePipeline");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePipelineResponse>
                transformer =
                        UpdatePipelineConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePipelineRequest, UpdatePipelineResponse>,
                        java.util.concurrent.Future<UpdatePipelineResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePipelineDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePipelineRequest, UpdatePipelineResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {
        LOG.trace("Called async updateProject");
        final UpdateProjectRequest interceptedRequest =
                UpdateProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/UpdateProject");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateProjectResponse>
                transformer =
                        UpdateProjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProjectRequest, UpdateProjectResponse>,
                        java.util.concurrent.Future<UpdateProjectResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProjectRequest, UpdateProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateReferenceResponse> updateReference(
            UpdateReferenceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReferenceRequest, UpdateReferenceResponse>
                    handler) {
        LOG.trace("Called async updateReference");
        final UpdateReferenceRequest interceptedRequest =
                UpdateReferenceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReferenceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateReference",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/UpdateReference");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateReferenceResponse>
                transformer =
                        UpdateReferenceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateReferenceRequest, UpdateReferenceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateReferenceRequest, UpdateReferenceResponse>,
                        java.util.concurrent.Future<UpdateReferenceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateReferenceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateReferenceRequest, UpdateReferenceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduleRequest, UpdateScheduleResponse>
                    handler) {
        LOG.trace("Called async updateSchedule");
        final UpdateScheduleRequest interceptedRequest =
                UpdateScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/UpdateSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateScheduleResponse>
                transformer =
                        UpdateScheduleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateScheduleRequest, UpdateScheduleResponse>,
                        java.util.concurrent.Future<UpdateScheduleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateScheduleRequest, UpdateScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResponse> updateTask(
            UpdateTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTaskRequest, UpdateTaskResponse>
                    handler) {
        LOG.trace("Called async updateTask");
        final UpdateTaskRequest interceptedRequest = UpdateTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/UpdateTask");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTaskResponse>
                transformer =
                        UpdateTaskConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTaskRequest, UpdateTaskResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTaskRequest, UpdateTaskResponse>,
                        java.util.concurrent.Future<UpdateTaskResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTaskRequest, UpdateTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskRunResponse> updateTaskRun(
            UpdateTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTaskRunRequest, UpdateTaskRunResponse>
                    handler) {
        LOG.trace("Called async updateTaskRun");
        final UpdateTaskRunRequest interceptedRequest =
                UpdateTaskRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateTaskRun",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/UpdateTaskRun");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTaskRunResponse>
                transformer =
                        UpdateTaskRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTaskRunRequest, UpdateTaskRunResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTaskRunRequest, UpdateTaskRunResponse>,
                        java.util.concurrent.Future<UpdateTaskRunResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTaskRunDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTaskRunRequest, UpdateTaskRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskScheduleResponse> updateTaskSchedule(
            UpdateTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>
                    handler) {
        LOG.trace("Called async updateTaskSchedule");
        final UpdateTaskScheduleRequest interceptedRequest =
                UpdateTaskScheduleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateTaskSchedule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/UpdateTaskSchedule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTaskScheduleResponse>
                transformer =
                        UpdateTaskScheduleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>,
                        java.util.concurrent.Future<UpdateTaskScheduleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTaskScheduleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUserDefinedFunctionResponse> updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResponse>
                    handler) {
        LOG.trace("Called async updateUserDefinedFunction");
        final UpdateUserDefinedFunctionRequest interceptedRequest =
                UpdateUserDefinedFunctionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateUserDefinedFunction",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/UpdateUserDefinedFunction");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateUserDefinedFunctionResponse>
                transformer =
                        UpdateUserDefinedFunctionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUserDefinedFunctionRequest,
                                UpdateUserDefinedFunctionResponse>,
                        java.util.concurrent.Future<UpdateUserDefinedFunctionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUserDefinedFunctionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResponse> updateWorkspace(
            UpdateWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWorkspaceRequest, UpdateWorkspaceResponse>
                    handler) {
        LOG.trace("Called async updateWorkspace");
        final UpdateWorkspaceRequest interceptedRequest =
                UpdateWorkspaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataIntegration",
                        "UpdateWorkspace",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateWorkspace");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateWorkspaceResponse>
                transformer =
                        UpdateWorkspaceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateWorkspaceRequest, UpdateWorkspaceResponse>,
                        java.util.concurrent.Future<UpdateWorkspaceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateWorkspaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateWorkspaceRequest, UpdateWorkspaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
