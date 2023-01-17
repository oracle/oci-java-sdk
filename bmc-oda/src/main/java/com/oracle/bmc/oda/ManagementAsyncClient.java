/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.internal.http.*;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * Async client implementation for Management service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ManagementAsyncClient implements ManagementAsync {
    /**
     * Service instance for Management.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementAsyncClient.class);

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
    public ManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagementAsyncClient> {
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
        public ManagementAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ManagementAsyncClient(
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
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<ConfigureDigitalAssistantParametersResponse>
            configureDigitalAssistantParameters(
                    ConfigureDigitalAssistantParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDigitalAssistantParametersRequest,
                                    ConfigureDigitalAssistantParametersResponse>
                            handler) {
        LOG.trace("Called async configureDigitalAssistantParameters");
        final ConfigureDigitalAssistantParametersRequest interceptedRequest =
                ConfigureDigitalAssistantParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDigitalAssistantParametersConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ConfigureDigitalAssistantParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ConfigureDigitalAssistantParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureDigitalAssistantParametersResponse>
                transformer =
                        ConfigureDigitalAssistantParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDigitalAssistantParametersRequest,
                        ConfigureDigitalAssistantParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDigitalAssistantParametersRequest,
                                ConfigureDigitalAssistantParametersResponse>,
                        java.util.concurrent.Future<ConfigureDigitalAssistantParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureDigitalAssistantParametersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDigitalAssistantParametersRequest,
                    ConfigureDigitalAssistantParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAuthenticationProviderResponse>
            createAuthenticationProvider(
                    CreateAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuthenticationProviderRequest,
                                    CreateAuthenticationProviderResponse>
                            handler) {
        LOG.trace("Called async createAuthenticationProvider");
        final CreateAuthenticationProviderRequest interceptedRequest =
                CreateAuthenticationProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthenticationProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateAuthenticationProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/CreateAuthenticationProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateAuthenticationProviderResponse>
                transformer =
                        CreateAuthenticationProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateAuthenticationProviderRequest, CreateAuthenticationProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuthenticationProviderRequest,
                                CreateAuthenticationProviderResponse>,
                        java.util.concurrent.Future<CreateAuthenticationProviderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAuthenticationProviderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuthenticationProviderRequest, CreateAuthenticationProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResponse> createChannel(
            CreateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateChannelRequest, CreateChannelResponse>
                    handler) {
        LOG.trace("Called async createChannel");
        final CreateChannelRequest interceptedRequest =
                CreateChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/CreateChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateChannelResponse>
                transformer =
                        CreateChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateChannelRequest, CreateChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateChannelRequest, CreateChannelResponse>,
                        java.util.concurrent.Future<CreateChannelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateChannelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateChannelRequest, CreateChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalAssistantResponse> createDigitalAssistant(
            CreateDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async createDigitalAssistant");
        final CreateDigitalAssistantRequest interceptedRequest =
                CreateDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/CreateDigitalAssistant");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDigitalAssistantResponse>
                transformer =
                        CreateDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>,
                        java.util.concurrent.Future<CreateDigitalAssistantResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDigitalAssistantDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSkillResponse> createSkill(
            CreateSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSkillRequest, CreateSkillResponse>
                    handler) {
        LOG.trace("Called async createSkill");
        final CreateSkillRequest interceptedRequest =
                CreateSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/CreateSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSkillResponse>
                transformer =
                        CreateSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSkillRequest, CreateSkillResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSkillRequest, CreateSkillResponse>,
                        java.util.concurrent.Future<CreateSkillResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSkillDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSkillRequest, CreateSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSkillParameterResponse> createSkillParameter(
            CreateSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSkillParameterRequest, CreateSkillParameterResponse>
                    handler) {
        LOG.trace("Called async createSkillParameter");
        final CreateSkillParameterRequest interceptedRequest =
                CreateSkillParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSkillParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateSkillParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/CreateSkillParameter");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSkillParameterResponse>
                transformer =
                        CreateSkillParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSkillParameterRequest, CreateSkillParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSkillParameterRequest, CreateSkillParameterResponse>,
                        java.util.concurrent.Future<CreateSkillParameterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSkillParameterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSkillParameterRequest, CreateSkillParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTranslatorResponse> createTranslator(
            CreateTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTranslatorRequest, CreateTranslatorResponse>
                    handler) {
        LOG.trace("Called async createTranslator");
        final CreateTranslatorRequest interceptedRequest =
                CreateTranslatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTranslatorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "CreateTranslator",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/CreateTranslator");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateTranslatorResponse>
                transformer =
                        CreateTranslatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateTranslatorRequest, CreateTranslatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTranslatorRequest, CreateTranslatorResponse>,
                        java.util.concurrent.Future<CreateTranslatorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTranslatorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTranslatorRequest, CreateTranslatorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthenticationProviderResponse>
            deleteAuthenticationProvider(
                    DeleteAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAuthenticationProviderRequest,
                                    DeleteAuthenticationProviderResponse>
                            handler) {
        LOG.trace("Called async deleteAuthenticationProvider");
        final DeleteAuthenticationProviderRequest interceptedRequest =
                DeleteAuthenticationProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthenticationProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteAuthenticationProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/DeleteAuthenticationProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteAuthenticationProviderResponse>
                transformer =
                        DeleteAuthenticationProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteAuthenticationProviderRequest, DeleteAuthenticationProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuthenticationProviderRequest,
                                DeleteAuthenticationProviderResponse>,
                        java.util.concurrent.Future<DeleteAuthenticationProviderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuthenticationProviderRequest, DeleteAuthenticationProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResponse> deleteChannel(
            DeleteChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteChannelRequest, DeleteChannelResponse>
                    handler) {
        LOG.trace("Called async deleteChannel");
        final DeleteChannelRequest interceptedRequest =
                DeleteChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/DeleteChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteChannelResponse>
                transformer =
                        DeleteChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteChannelRequest, DeleteChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteChannelRequest, DeleteChannelResponse>,
                        java.util.concurrent.Future<DeleteChannelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteChannelRequest, DeleteChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalAssistantResponse> deleteDigitalAssistant(
            DeleteDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async deleteDigitalAssistant");
        final DeleteDigitalAssistantRequest interceptedRequest =
                DeleteDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/DeleteDigitalAssistant");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDigitalAssistantResponse>
                transformer =
                        DeleteDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>,
                        java.util.concurrent.Future<DeleteDigitalAssistantResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillResponse> deleteSkill(
            DeleteSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSkillRequest, DeleteSkillResponse>
                    handler) {
        LOG.trace("Called async deleteSkill");
        final DeleteSkillRequest interceptedRequest =
                DeleteSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/DeleteSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSkillResponse>
                transformer =
                        DeleteSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSkillRequest, DeleteSkillResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSkillRequest, DeleteSkillResponse>,
                        java.util.concurrent.Future<DeleteSkillResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSkillRequest, DeleteSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillParameterResponse> deleteSkillParameter(
            DeleteSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSkillParameterRequest, DeleteSkillParameterResponse>
                    handler) {
        LOG.trace("Called async deleteSkillParameter");
        final DeleteSkillParameterRequest interceptedRequest =
                DeleteSkillParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSkillParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteSkillParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/DeleteSkillParameter");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSkillParameterResponse>
                transformer =
                        DeleteSkillParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSkillParameterRequest, DeleteSkillParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSkillParameterRequest, DeleteSkillParameterResponse>,
                        java.util.concurrent.Future<DeleteSkillParameterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSkillParameterRequest, DeleteSkillParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTranslatorResponse> deleteTranslator(
            DeleteTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTranslatorRequest, DeleteTranslatorResponse>
                    handler) {
        LOG.trace("Called async deleteTranslator");
        final DeleteTranslatorRequest interceptedRequest =
                DeleteTranslatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTranslatorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "DeleteTranslator",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/DeleteTranslator");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteTranslatorResponse>
                transformer =
                        DeleteTranslatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteTranslatorRequest, DeleteTranslatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTranslatorRequest, DeleteTranslatorResponse>,
                        java.util.concurrent.Future<DeleteTranslatorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTranslatorRequest, DeleteTranslatorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportDigitalAssistantResponse> exportDigitalAssistant(
            ExportDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async exportDigitalAssistant");
        final ExportDigitalAssistantRequest interceptedRequest =
                ExportDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ExportDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportDigitalAssistant");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportDigitalAssistantResponse>
                transformer =
                        ExportDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>,
                        java.util.concurrent.Future<ExportDigitalAssistantResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportDigitalAssistantDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportSkillResponse> exportSkill(
            ExportSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExportSkillRequest, ExportSkillResponse>
                    handler) {
        LOG.trace("Called async exportSkill");
        final ExportSkillRequest interceptedRequest =
                ExportSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ExportSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportSkillResponse>
                transformer =
                        ExportSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ExportSkillRequest, ExportSkillResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportSkillRequest, ExportSkillResponse>,
                        java.util.concurrent.Future<ExportSkillResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExportSkillDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportSkillRequest, ExportSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAuthenticationProviderResponse> getAuthenticationProvider(
            GetAuthenticationProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationProviderRequest, GetAuthenticationProviderResponse>
                    handler) {
        LOG.trace("Called async getAuthenticationProvider");
        final GetAuthenticationProviderRequest interceptedRequest =
                GetAuthenticationProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthenticationProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetAuthenticationProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/GetAuthenticationProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAuthenticationProviderResponse>
                transformer =
                        GetAuthenticationProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAuthenticationProviderRequest, GetAuthenticationProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuthenticationProviderRequest,
                                GetAuthenticationProviderResponse>,
                        java.util.concurrent.Future<GetAuthenticationProviderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuthenticationProviderRequest, GetAuthenticationProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetChannelResponse> getChannel(
            GetChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetChannelRequest, GetChannelResponse>
                    handler) {
        LOG.trace("Called async getChannel");
        final GetChannelRequest interceptedRequest = GetChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/GetChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetChannelResponse>
                transformer =
                        GetChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetChannelRequest, GetChannelResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetChannelRequest, GetChannelResponse>,
                        java.util.concurrent.Future<GetChannelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetChannelRequest, GetChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDigitalAssistantResponse> getDigitalAssistant(
            GetDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalAssistantRequest, GetDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async getDigitalAssistant");
        final GetDigitalAssistantRequest interceptedRequest =
                GetDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/GetDigitalAssistant");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDigitalAssistantResponse>
                transformer =
                        GetDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalAssistantRequest, GetDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalAssistantRequest, GetDigitalAssistantResponse>,
                        java.util.concurrent.Future<GetDigitalAssistantResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalAssistantRequest, GetDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDigitalAssistantParameterResponse>
            getDigitalAssistantParameter(
                    GetDigitalAssistantParameterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalAssistantParameterRequest,
                                    GetDigitalAssistantParameterResponse>
                            handler) {
        LOG.trace("Called async getDigitalAssistantParameter");
        final GetDigitalAssistantParameterRequest interceptedRequest =
                GetDigitalAssistantParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDigitalAssistantParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetDigitalAssistantParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/GetDigitalAssistantParameter");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDigitalAssistantParameterResponse>
                transformer =
                        GetDigitalAssistantParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDigitalAssistantParameterRequest, GetDigitalAssistantParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDigitalAssistantParameterRequest,
                                GetDigitalAssistantParameterResponse>,
                        java.util.concurrent.Future<GetDigitalAssistantParameterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDigitalAssistantParameterRequest, GetDigitalAssistantParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSkillResponse> getSkill(
            GetSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSkillRequest, GetSkillResponse>
                    handler) {
        LOG.trace("Called async getSkill");
        final GetSkillRequest interceptedRequest = GetSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/GetSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSkillResponse> transformer =
                GetSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSkillRequest, GetSkillResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetSkillRequest, GetSkillResponse>,
                        java.util.concurrent.Future<GetSkillResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSkillRequest, GetSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSkillParameterResponse> getSkillParameter(
            GetSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSkillParameterRequest, GetSkillParameterResponse>
                    handler) {
        LOG.trace("Called async getSkillParameter");
        final GetSkillParameterRequest interceptedRequest =
                GetSkillParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSkillParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetSkillParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/GetSkillParameter");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSkillParameterResponse>
                transformer =
                        GetSkillParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSkillParameterRequest, GetSkillParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSkillParameterRequest, GetSkillParameterResponse>,
                        java.util.concurrent.Future<GetSkillParameterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSkillParameterRequest, GetSkillParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTranslatorResponse> getTranslator(
            GetTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTranslatorRequest, GetTranslatorResponse>
                    handler) {
        LOG.trace("Called async getTranslator");
        final GetTranslatorRequest interceptedRequest =
                GetTranslatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTranslatorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "GetTranslator",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/GetTranslator");
        final java.util.function.Function<javax.ws.rs.core.Response, GetTranslatorResponse>
                transformer =
                        GetTranslatorConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetTranslatorRequest, GetTranslatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTranslatorRequest, GetTranslatorResponse>,
                        java.util.concurrent.Future<GetTranslatorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTranslatorRequest, GetTranslatorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ImportBotResponse> importBot(
            ImportBotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ImportBotRequest, ImportBotResponse>
                    handler) {
        LOG.trace("Called async importBot");
        final ImportBotRequest interceptedRequest = ImportBotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ImportBotConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ImportBot",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Bot/ImportBot");
        final java.util.function.Function<javax.ws.rs.core.Response, ImportBotResponse>
                transformer =
                        ImportBotConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ImportBotRequest, ImportBotResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ImportBotRequest, ImportBotResponse>,
                        java.util.concurrent.Future<ImportBotResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getImportBotDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ImportBotRequest, ImportBotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAuthenticationProvidersResponse>
            listAuthenticationProviders(
                    ListAuthenticationProvidersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuthenticationProvidersRequest,
                                    ListAuthenticationProvidersResponse>
                            handler) {
        LOG.trace("Called async listAuthenticationProviders");
        final ListAuthenticationProvidersRequest interceptedRequest =
                ListAuthenticationProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthenticationProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListAuthenticationProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/ListAuthenticationProviders");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuthenticationProvidersResponse>
                transformer =
                        ListAuthenticationProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuthenticationProvidersRequest,
                                ListAuthenticationProvidersResponse>,
                        java.util.concurrent.Future<ListAuthenticationProvidersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResponse> listChannels(
            ListChannelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                    handler) {
        LOG.trace("Called async listChannels");
        final ListChannelsRequest interceptedRequest =
                ListChannelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListChannelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListChannels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/ListChannels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListChannelsResponse>
                transformer =
                        ListChannelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListChannelsRequest, ListChannelsResponse>,
                        java.util.concurrent.Future<ListChannelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListChannelsRequest, ListChannelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDigitalAssistantParametersResponse>
            listDigitalAssistantParameters(
                    ListDigitalAssistantParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDigitalAssistantParametersRequest,
                                    ListDigitalAssistantParametersResponse>
                            handler) {
        LOG.trace("Called async listDigitalAssistantParameters");
        final ListDigitalAssistantParametersRequest interceptedRequest =
                ListDigitalAssistantParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalAssistantParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListDigitalAssistantParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ListDigitalAssistantParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDigitalAssistantParametersResponse>
                transformer =
                        ListDigitalAssistantParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalAssistantParametersRequest,
                        ListDigitalAssistantParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalAssistantParametersRequest,
                                ListDigitalAssistantParametersResponse>,
                        java.util.concurrent.Future<ListDigitalAssistantParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalAssistantParametersRequest, ListDigitalAssistantParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDigitalAssistantsResponse> listDigitalAssistants(
            ListDigitalAssistantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>
                    handler) {
        LOG.trace("Called async listDigitalAssistants");
        final ListDigitalAssistantsRequest interceptedRequest =
                ListDigitalAssistantsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDigitalAssistantsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListDigitalAssistants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/ListDigitalAssistants");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDigitalAssistantsResponse>
                transformer =
                        ListDigitalAssistantsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>,
                        java.util.concurrent.Future<ListDigitalAssistantsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSkillParametersResponse> listSkillParameters(
            ListSkillParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSkillParametersRequest, ListSkillParametersResponse>
                    handler) {
        LOG.trace("Called async listSkillParameters");
        final ListSkillParametersRequest interceptedRequest =
                ListSkillParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSkillParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListSkillParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/ListSkillParameters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSkillParametersResponse>
                transformer =
                        ListSkillParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSkillParametersRequest, ListSkillParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSkillParametersRequest, ListSkillParametersResponse>,
                        java.util.concurrent.Future<ListSkillParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSkillParametersRequest, ListSkillParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSkillsResponse> listSkills(
            ListSkillsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSkillsRequest, ListSkillsResponse>
                    handler) {
        LOG.trace("Called async listSkills");
        final ListSkillsRequest interceptedRequest = ListSkillsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSkillsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListSkills",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ListSkills");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSkillsResponse>
                transformer =
                        ListSkillsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSkillsRequest, ListSkillsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSkillsRequest, ListSkillsResponse>,
                        java.util.concurrent.Future<ListSkillsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSkillsRequest, ListSkillsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTranslatorsResponse> listTranslators(
            ListTranslatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTranslatorsRequest, ListTranslatorsResponse>
                    handler) {
        LOG.trace("Called async listTranslators");
        final ListTranslatorsRequest interceptedRequest =
                ListTranslatorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTranslatorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "ListTranslators",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/ListTranslators");
        final java.util.function.Function<javax.ws.rs.core.Response, ListTranslatorsResponse>
                transformer =
                        ListTranslatorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListTranslatorsRequest, ListTranslatorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTranslatorsRequest, ListTranslatorsResponse>,
                        java.util.concurrent.Future<ListTranslatorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTranslatorsRequest, ListTranslatorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishDigitalAssistantResponse> publishDigitalAssistant(
            PublishDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async publishDigitalAssistant");
        final PublishDigitalAssistantRequest interceptedRequest =
                PublishDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "PublishDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/PublishDigitalAssistant");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PublishDigitalAssistantResponse>
                transformer =
                        PublishDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>,
                        java.util.concurrent.Future<PublishDigitalAssistantResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishSkillResponse> publishSkill(
            PublishSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PublishSkillRequest, PublishSkillResponse>
                    handler) {
        LOG.trace("Called async publishSkill");
        final PublishSkillRequest interceptedRequest =
                PublishSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "PublishSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/PublishSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, PublishSkillResponse>
                transformer =
                        PublishSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PublishSkillRequest, PublishSkillResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishSkillRequest, PublishSkillResponse>,
                        java.util.concurrent.Future<PublishSkillResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishSkillRequest, PublishSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateChannelKeysResponse> rotateChannelKeys(
            RotateChannelKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateChannelKeysRequest, RotateChannelKeysResponse>
                    handler) {
        LOG.trace("Called async rotateChannelKeys");
        final RotateChannelKeysRequest interceptedRequest =
                RotateChannelKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateChannelKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "RotateChannelKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/RotateChannelKeys");
        final java.util.function.Function<javax.ws.rs.core.Response, RotateChannelKeysResponse>
                transformer =
                        RotateChannelKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RotateChannelKeysRequest, RotateChannelKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateChannelKeysRequest, RotateChannelKeysResponse>,
                        java.util.concurrent.Future<RotateChannelKeysResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateChannelKeysRequest, RotateChannelKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartChannelResponse> startChannel(
            StartChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StartChannelRequest, StartChannelResponse>
                    handler) {
        LOG.trace("Called async startChannel");
        final StartChannelRequest interceptedRequest =
                StartChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "StartChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StartChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, StartChannelResponse>
                transformer =
                        StartChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartChannelRequest, StartChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartChannelRequest, StartChannelResponse>,
                        java.util.concurrent.Future<StartChannelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartChannelRequest, StartChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopChannelResponse> stopChannel(
            StopChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopChannelRequest, StopChannelResponse>
                    handler) {
        LOG.trace("Called async stopChannel");
        final StopChannelRequest interceptedRequest =
                StopChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "StopChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StopChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, StopChannelResponse>
                transformer =
                        StopChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopChannelRequest, StopChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopChannelRequest, StopChannelResponse>,
                        java.util.concurrent.Future<StopChannelResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopChannelRequest, StopChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthenticationProviderResponse>
            updateAuthenticationProvider(
                    UpdateAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuthenticationProviderRequest,
                                    UpdateAuthenticationProviderResponse>
                            handler) {
        LOG.trace("Called async updateAuthenticationProvider");
        final UpdateAuthenticationProviderRequest interceptedRequest =
                UpdateAuthenticationProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuthenticationProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateAuthenticationProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/UpdateAuthenticationProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateAuthenticationProviderResponse>
                transformer =
                        UpdateAuthenticationProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAuthenticationProviderRequest, UpdateAuthenticationProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAuthenticationProviderRequest,
                                UpdateAuthenticationProviderResponse>,
                        java.util.concurrent.Future<UpdateAuthenticationProviderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAuthenticationProviderDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAuthenticationProviderRequest, UpdateAuthenticationProviderResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResponse> updateChannel(
            UpdateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateChannelRequest, UpdateChannelResponse>
                    handler) {
        LOG.trace("Called async updateChannel");
        final UpdateChannelRequest interceptedRequest =
                UpdateChannelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateChannelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateChannel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/UpdateChannel");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateChannelResponse>
                transformer =
                        UpdateChannelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateChannelRequest, UpdateChannelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateChannelRequest, UpdateChannelResponse>,
                        java.util.concurrent.Future<UpdateChannelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateChannelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateChannelRequest, UpdateChannelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalAssistantResponse> updateDigitalAssistant(
            UpdateDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>
                    handler) {
        LOG.trace("Called async updateDigitalAssistant");
        final UpdateDigitalAssistantRequest interceptedRequest =
                UpdateDigitalAssistantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalAssistantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateDigitalAssistant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/UpdateDigitalAssistant");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDigitalAssistantResponse>
                transformer =
                        UpdateDigitalAssistantConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>,
                        java.util.concurrent.Future<UpdateDigitalAssistantResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalAssistantDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalAssistantParameterResponse>
            updateDigitalAssistantParameter(
                    UpdateDigitalAssistantParameterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalAssistantParameterRequest,
                                    UpdateDigitalAssistantParameterResponse>
                            handler) {
        LOG.trace("Called async updateDigitalAssistantParameter");
        final UpdateDigitalAssistantParameterRequest interceptedRequest =
                UpdateDigitalAssistantParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDigitalAssistantParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateDigitalAssistantParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/UpdateDigitalAssistantParameter");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDigitalAssistantParameterResponse>
                transformer =
                        UpdateDigitalAssistantParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDigitalAssistantParameterRequest,
                        UpdateDigitalAssistantParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDigitalAssistantParameterRequest,
                                UpdateDigitalAssistantParameterResponse>,
                        java.util.concurrent.Future<UpdateDigitalAssistantParameterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDigitalAssistantParameterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDigitalAssistantParameterRequest,
                    UpdateDigitalAssistantParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillResponse> updateSkill(
            UpdateSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSkillRequest, UpdateSkillResponse>
                    handler) {
        LOG.trace("Called async updateSkill");
        final UpdateSkillRequest interceptedRequest =
                UpdateSkillConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSkillConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateSkill",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/UpdateSkill");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSkillResponse>
                transformer =
                        UpdateSkillConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSkillRequest, UpdateSkillResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSkillRequest, UpdateSkillResponse>,
                        java.util.concurrent.Future<UpdateSkillResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSkillDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSkillRequest, UpdateSkillResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillParameterResponse> updateSkillParameter(
            UpdateSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSkillParameterRequest, UpdateSkillParameterResponse>
                    handler) {
        LOG.trace("Called async updateSkillParameter");
        final UpdateSkillParameterRequest interceptedRequest =
                UpdateSkillParameterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSkillParameterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateSkillParameter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/UpdateSkillParameter");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSkillParameterResponse>
                transformer =
                        UpdateSkillParameterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSkillParameterRequest, UpdateSkillParameterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSkillParameterRequest, UpdateSkillParameterResponse>,
                        java.util.concurrent.Future<UpdateSkillParameterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSkillParameterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSkillParameterRequest, UpdateSkillParameterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTranslatorResponse> updateTranslator(
            UpdateTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTranslatorRequest, UpdateTranslatorResponse>
                    handler) {
        LOG.trace("Called async updateTranslator");
        final UpdateTranslatorRequest interceptedRequest =
                UpdateTranslatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTranslatorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Management",
                        "UpdateTranslator",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/UpdateTranslator");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateTranslatorResponse>
                transformer =
                        UpdateTranslatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateTranslatorRequest, UpdateTranslatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTranslatorRequest, UpdateTranslatorResponse>,
                        java.util.concurrent.Future<UpdateTranslatorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTranslatorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTranslatorRequest, UpdateTranslatorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
