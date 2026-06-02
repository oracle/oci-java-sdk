/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai;

import com.oracle.bmc.generativeai.internal.http.*;
import com.oracle.bmc.generativeai.requests.*;
import com.oracle.bmc.generativeai.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for GenerativeAi service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiAsyncClient implements GenerativeAiAsync {
    /**
     * Service instance for GenerativeAi.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://generativeai.{region}.{dualStack?ds.:}oci.{secondLevelDomain}")
                    .endpointServiceName("generativeai")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiAsyncClient.class);

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
    private final java.util.Map<String, Boolean> optionsMap = new java.util.HashMap<>();

    // This pattern matches substrings that are enclosed within curly braces {}
    private static final Pattern PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES =
            Pattern.compile("\\{([^}]+)\\}");

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
    public GenerativeAiAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
    public GenerativeAiAsyncClient(
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
        java.util.List<com.oracle.bmc.internal.SpiClientConfigurator>
                additionalSpiClientConfigurators =
                        com.oracle.bmc.util.internal.SpiClientConfiguratorUtils
                                .getEnabledSpiClientConfigurators();
        allConfigurators.addAll(additionalSpiClientConfigurators);
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
        enableDualStackEndpoints(
                com.oracle.bmc.util.internal.EndpointTemplateForOptionsUtils
                        .isDualStackEnabledForClientDefault(SERVICE));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GenerativeAiAsyncClient> {
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
        public GenerativeAiAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new GenerativeAiAsyncClient(
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
        String value = client.getEndpoint();
        if (value.contains("{")) {
            Matcher matcher = PATTERN_FOR_SUBSTRINGS_IN_CURLY_BRACES.matcher(value);
            java.lang.StringBuilder params = new java.lang.StringBuilder();
            while (matcher.find()) {
                if (params.length() > 0) {
                    params.append(", ");
                }
                params.append("{").append(matcher.group(1)).append("}");
            }
            LOG.warn(
                    "Parameters like {} get replaced with appropriate values at request time.",
                    params.toString());
        }
        return client.getEndpoint();
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

    @Override
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        setEndpoint(
                com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils
                        .getRealmSpecificEndpointTemplate(
                                useOfRealmSpecificEndpointTemplateEnabled, this.regionId, SERVICE));
    }

    @Override
    public synchronized void enableDualStackEndpoints(boolean dualStackEndpointTemplateEnabled) {
        optionsMap.put(
                com.oracle.bmc.util.internal.EndpointTemplateForOptionsUtils.DUAL_STACK_OPTION,
                dualStackEndpointTemplateEnabled);
        client.setOptionsMap(optionsMap);
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AddArtifactResponse> addArtifact(
            AddArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddArtifactRequest, AddArtifactResponse>
                    handler) {
        LOG.trace("Called async addArtifact");
        final AddArtifactRequest interceptedRequest =
                AddArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "AddArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/AddArtifact");
        final java.util.function.Function<javax.ws.rs.core.Response, AddArtifactResponse>
                transformer =
                        AddArtifactConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddArtifactRequest, AddArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddArtifactRequest, AddArtifactResponse>,
                        java.util.concurrent.Future<AddArtifactResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddArtifactDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddArtifactRequest, AddArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CancelVectorStoreConnectorFileSyncResponse>
            cancelVectorStoreConnectorFileSync(
                    CancelVectorStoreConnectorFileSyncRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelVectorStoreConnectorFileSyncRequest,
                                    CancelVectorStoreConnectorFileSyncResponse>
                            handler) {
        LOG.trace("Called async cancelVectorStoreConnectorFileSync");
        final CancelVectorStoreConnectorFileSyncRequest interceptedRequest =
                CancelVectorStoreConnectorFileSyncConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelVectorStoreConnectorFileSyncConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CancelVectorStoreConnectorFileSync",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/CancelVectorStoreConnectorFileSync");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CancelVectorStoreConnectorFileSyncResponse>
                transformer =
                        CancelVectorStoreConnectorFileSyncConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CancelVectorStoreConnectorFileSyncRequest,
                        CancelVectorStoreConnectorFileSyncResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CancelVectorStoreConnectorFileSyncRequest,
                                CancelVectorStoreConnectorFileSyncResponse>,
                        java.util.concurrent.Future<CancelVectorStoreConnectorFileSyncResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CancelVectorStoreConnectorFileSyncRequest,
                    CancelVectorStoreConnectorFileSyncResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeApiKeyCompartmentResponse> changeApiKeyCompartment(
            ChangeApiKeyCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeApiKeyCompartmentRequest, ChangeApiKeyCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeApiKeyCompartment");
        final ChangeApiKeyCompartmentRequest interceptedRequest =
                ChangeApiKeyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeApiKeyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeApiKeyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/ChangeApiKeyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeApiKeyCompartmentResponse>
                transformer =
                        ChangeApiKeyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeApiKeyCompartmentRequest, ChangeApiKeyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeApiKeyCompartmentRequest, ChangeApiKeyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeApiKeyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeApiKeyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeApiKeyCompartmentRequest, ChangeApiKeyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDedicatedAiClusterCompartmentResponse>
            changeDedicatedAiClusterCompartment(
                    ChangeDedicatedAiClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedAiClusterCompartmentRequest,
                                    ChangeDedicatedAiClusterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDedicatedAiClusterCompartment");
        final ChangeDedicatedAiClusterCompartmentRequest interceptedRequest =
                ChangeDedicatedAiClusterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDedicatedAiClusterCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeDedicatedAiClusterCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/ChangeDedicatedAiClusterCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDedicatedAiClusterCompartmentResponse>
                transformer =
                        ChangeDedicatedAiClusterCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDedicatedAiClusterCompartmentRequest,
                        ChangeDedicatedAiClusterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDedicatedAiClusterCompartmentRequest,
                                ChangeDedicatedAiClusterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDedicatedAiClusterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDedicatedAiClusterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDedicatedAiClusterCompartmentRequest,
                    ChangeDedicatedAiClusterCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeEndpointCompartmentResponse> changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeEndpointCompartment");
        final ChangeEndpointCompartmentRequest interceptedRequest =
                ChangeEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeEndpointCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/ChangeEndpointCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeEndpointCompartmentResponse>
                transformer =
                        ChangeEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeEndpointCompartmentRequest,
                                ChangeEndpointCompartmentResponse>,
                        java.util.concurrent.Future<ChangeEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeGenerativeAiPrivateEndpointCompartmentResponse>
            changeGenerativeAiPrivateEndpointCompartment(
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                                    ChangeGenerativeAiPrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeGenerativeAiPrivateEndpointCompartment");
        final ChangeGenerativeAiPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeGenerativeAiPrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeGenerativeAiPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeGenerativeAiPrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/ChangeGenerativeAiPrivateEndpointCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeGenerativeAiPrivateEndpointCompartmentResponse>
                transformer =
                        ChangeGenerativeAiPrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                        ChangeGenerativeAiPrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                                ChangeGenerativeAiPrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeGenerativeAiPrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeGenerativeAiPrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest,
                    ChangeGenerativeAiPrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeGenerativeAiProjectCompartmentResponse>
            changeGenerativeAiProjectCompartment(
                    ChangeGenerativeAiProjectCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGenerativeAiProjectCompartmentRequest,
                                    ChangeGenerativeAiProjectCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeGenerativeAiProjectCompartment");
        final ChangeGenerativeAiProjectCompartmentRequest interceptedRequest =
                ChangeGenerativeAiProjectCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeGenerativeAiProjectCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeGenerativeAiProjectCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/ChangeGenerativeAiProjectCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeGenerativeAiProjectCompartmentResponse>
                transformer =
                        ChangeGenerativeAiProjectCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeGenerativeAiProjectCompartmentRequest,
                        ChangeGenerativeAiProjectCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeGenerativeAiProjectCompartmentRequest,
                                ChangeGenerativeAiProjectCompartmentResponse>,
                        java.util.concurrent.Future<ChangeGenerativeAiProjectCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeGenerativeAiProjectCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeGenerativeAiProjectCompartmentRequest,
                    ChangeGenerativeAiProjectCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeHostedApplicationCompartmentResponse>
            changeHostedApplicationCompartment(
                    ChangeHostedApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostedApplicationCompartmentRequest,
                                    ChangeHostedApplicationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeHostedApplicationCompartment");
        final ChangeHostedApplicationCompartmentRequest interceptedRequest =
                ChangeHostedApplicationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeHostedApplicationCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeHostedApplicationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/ChangeHostedApplicationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeHostedApplicationCompartmentResponse>
                transformer =
                        ChangeHostedApplicationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeHostedApplicationCompartmentRequest,
                        ChangeHostedApplicationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeHostedApplicationCompartmentRequest,
                                ChangeHostedApplicationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeHostedApplicationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeHostedApplicationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeHostedApplicationCompartmentRequest,
                    ChangeHostedApplicationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeHostedApplicationStorageCompartmentResponse>
            changeHostedApplicationStorageCompartment(
                    ChangeHostedApplicationStorageCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHostedApplicationStorageCompartmentRequest,
                                    ChangeHostedApplicationStorageCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeHostedApplicationStorageCompartment");
        final ChangeHostedApplicationStorageCompartmentRequest interceptedRequest =
                ChangeHostedApplicationStorageCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeHostedApplicationStorageCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeHostedApplicationStorageCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/ChangeHostedApplicationStorageCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeHostedApplicationStorageCompartmentResponse>
                transformer =
                        ChangeHostedApplicationStorageCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeHostedApplicationStorageCompartmentRequest,
                        ChangeHostedApplicationStorageCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeHostedApplicationStorageCompartmentRequest,
                                ChangeHostedApplicationStorageCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeHostedApplicationStorageCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeHostedApplicationStorageCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeHostedApplicationStorageCompartmentRequest,
                    ChangeHostedApplicationStorageCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeImportedModelCompartmentResponse>
            changeImportedModelCompartment(
                    ChangeImportedModelCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeImportedModelCompartmentRequest,
                                    ChangeImportedModelCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeImportedModelCompartment");
        final ChangeImportedModelCompartmentRequest interceptedRequest =
                ChangeImportedModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeImportedModelCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeImportedModelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/ChangeImportedModelCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeImportedModelCompartmentResponse>
                transformer =
                        ChangeImportedModelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeImportedModelCompartmentRequest,
                        ChangeImportedModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeImportedModelCompartmentRequest,
                                ChangeImportedModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeImportedModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeImportedModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeImportedModelCompartmentRequest, ChangeImportedModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeModelCompartment");
        final ChangeModelCompartmentRequest interceptedRequest =
                ChangeModelCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeModelCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeModelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/ChangeModelCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeModelCompartmentResponse>
                transformer =
                        ChangeModelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>,
                        java.util.concurrent.Future<ChangeModelCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeModelCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSemanticStoreCompartmentResponse>
            changeSemanticStoreCompartment(
                    ChangeSemanticStoreCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSemanticStoreCompartmentRequest,
                                    ChangeSemanticStoreCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSemanticStoreCompartment");
        final ChangeSemanticStoreCompartmentRequest interceptedRequest =
                ChangeSemanticStoreCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSemanticStoreCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ChangeSemanticStoreCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/ChangeSemanticStoreCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSemanticStoreCompartmentResponse>
                transformer =
                        ChangeSemanticStoreCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSemanticStoreCompartmentRequest,
                        ChangeSemanticStoreCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSemanticStoreCompartmentRequest,
                                ChangeSemanticStoreCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSemanticStoreCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSemanticStoreCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSemanticStoreCompartmentRequest, ChangeSemanticStoreCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResponse> createApiKey(
            CreateApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                    handler) {
        LOG.trace("Called async createApiKey");
        final CreateApiKeyRequest interceptedRequest =
                CreateApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/CreateApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateApiKeyResponse>
                transformer =
                        CreateApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApiKeyRequest, CreateApiKeyResponse>,
                        java.util.concurrent.Future<CreateApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateApiKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApiKeyRequest, CreateApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDedicatedAiClusterResponse> createDedicatedAiCluster(
            CreateDedicatedAiClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedAiClusterRequest, CreateDedicatedAiClusterResponse>
                    handler) {
        LOG.trace("Called async createDedicatedAiCluster");
        final CreateDedicatedAiClusterRequest interceptedRequest =
                CreateDedicatedAiClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDedicatedAiClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateDedicatedAiCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/CreateDedicatedAiCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDedicatedAiClusterResponse>
                transformer =
                        CreateDedicatedAiClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDedicatedAiClusterRequest, CreateDedicatedAiClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDedicatedAiClusterRequest, CreateDedicatedAiClusterResponse>,
                        java.util.concurrent.Future<CreateDedicatedAiClusterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDedicatedAiClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDedicatedAiClusterRequest, CreateDedicatedAiClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResponse> createEndpoint(
            CreateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEndpointRequest, CreateEndpointResponse>
                    handler) {
        LOG.trace("Called async createEndpoint");
        final CreateEndpointRequest interceptedRequest =
                CreateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/CreateEndpoint");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateEndpointResponse>
                transformer =
                        CreateEndpointConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateEndpointRequest, CreateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateEndpointRequest, CreateEndpointResponse>,
                        java.util.concurrent.Future<CreateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateEndpointRequest, CreateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGenerativeAiPrivateEndpointResponse>
            createGenerativeAiPrivateEndpoint(
                    CreateGenerativeAiPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateGenerativeAiPrivateEndpointRequest,
                                    CreateGenerativeAiPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createGenerativeAiPrivateEndpoint");
        final CreateGenerativeAiPrivateEndpointRequest interceptedRequest =
                CreateGenerativeAiPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGenerativeAiPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateGenerativeAiPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateGenerativeAiPrivateEndpointResponse>
                transformer =
                        CreateGenerativeAiPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateGenerativeAiPrivateEndpointRequest,
                        CreateGenerativeAiPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGenerativeAiPrivateEndpointRequest,
                                CreateGenerativeAiPrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateGenerativeAiPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateGenerativeAiPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGenerativeAiPrivateEndpointRequest,
                    CreateGenerativeAiPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGenerativeAiProjectResponse> createGenerativeAiProject(
            CreateGenerativeAiProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGenerativeAiProjectRequest, CreateGenerativeAiProjectResponse>
                    handler) {
        LOG.trace("Called async createGenerativeAiProject");
        final CreateGenerativeAiProjectRequest interceptedRequest =
                CreateGenerativeAiProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGenerativeAiProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateGenerativeAiProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/CreateGenerativeAiProject");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateGenerativeAiProjectResponse>
                transformer =
                        CreateGenerativeAiProjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateGenerativeAiProjectRequest, CreateGenerativeAiProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGenerativeAiProjectRequest,
                                CreateGenerativeAiProjectResponse>,
                        java.util.concurrent.Future<CreateGenerativeAiProjectResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateGenerativeAiProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGenerativeAiProjectRequest, CreateGenerativeAiProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateHostedApplicationResponse> createHostedApplication(
            CreateHostedApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostedApplicationRequest, CreateHostedApplicationResponse>
                    handler) {
        LOG.trace("Called async createHostedApplication");
        final CreateHostedApplicationRequest interceptedRequest =
                CreateHostedApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostedApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateHostedApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/CreateHostedApplication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateHostedApplicationResponse>
                transformer =
                        CreateHostedApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateHostedApplicationRequest, CreateHostedApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateHostedApplicationRequest, CreateHostedApplicationResponse>,
                        java.util.concurrent.Future<CreateHostedApplicationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateHostedApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateHostedApplicationRequest, CreateHostedApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateHostedApplicationStorageResponse>
            createHostedApplicationStorage(
                    CreateHostedApplicationStorageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateHostedApplicationStorageRequest,
                                    CreateHostedApplicationStorageResponse>
                            handler) {
        LOG.trace("Called async createHostedApplicationStorage");
        final CreateHostedApplicationStorageRequest interceptedRequest =
                CreateHostedApplicationStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostedApplicationStorageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateHostedApplicationStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/CreateHostedApplicationStorage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateHostedApplicationStorageResponse>
                transformer =
                        CreateHostedApplicationStorageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateHostedApplicationStorageRequest,
                        CreateHostedApplicationStorageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateHostedApplicationStorageRequest,
                                CreateHostedApplicationStorageResponse>,
                        java.util.concurrent.Future<CreateHostedApplicationStorageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateHostedApplicationStorageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateHostedApplicationStorageRequest, CreateHostedApplicationStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateHostedDeploymentResponse> createHostedDeployment(
            CreateHostedDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHostedDeploymentRequest, CreateHostedDeploymentResponse>
                    handler) {
        LOG.trace("Called async createHostedDeployment");
        final CreateHostedDeploymentRequest interceptedRequest =
                CreateHostedDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateHostedDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateHostedDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/CreateHostedDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateHostedDeploymentResponse>
                transformer =
                        CreateHostedDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateHostedDeploymentRequest, CreateHostedDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateHostedDeploymentRequest, CreateHostedDeploymentResponse>,
                        java.util.concurrent.Future<CreateHostedDeploymentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateHostedDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateHostedDeploymentRequest, CreateHostedDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateImportedModelResponse> createImportedModel(
            CreateImportedModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateImportedModelRequest, CreateImportedModelResponse>
                    handler) {
        LOG.trace("Called async createImportedModel");
        final CreateImportedModelRequest interceptedRequest =
                CreateImportedModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateImportedModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateImportedModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/CreateImportedModel");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateImportedModelResponse>
                transformer =
                        CreateImportedModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateImportedModelRequest, CreateImportedModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateImportedModelRequest, CreateImportedModelResponse>,
                        java.util.concurrent.Future<CreateImportedModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateImportedModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateImportedModelRequest, CreateImportedModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                    handler) {
        LOG.trace("Called async createModel");
        final CreateModelRequest interceptedRequest =
                CreateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/CreateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelResponse>
                transformer =
                        CreateModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateModelRequest, CreateModelResponse>,
                        java.util.concurrent.Future<CreateModelResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateModelRequest, CreateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSemanticStoreResponse> createSemanticStore(
            CreateSemanticStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSemanticStoreRequest, CreateSemanticStoreResponse>
                    handler) {
        LOG.trace("Called async createSemanticStore");
        final CreateSemanticStoreRequest interceptedRequest =
                CreateSemanticStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSemanticStoreConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateSemanticStore",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/CreateSemanticStore");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSemanticStoreResponse>
                transformer =
                        CreateSemanticStoreConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSemanticStoreRequest, CreateSemanticStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSemanticStoreRequest, CreateSemanticStoreResponse>,
                        java.util.concurrent.Future<CreateSemanticStoreResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSemanticStoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSemanticStoreRequest, CreateSemanticStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVectorStoreConnectorResponse>
            createVectorStoreConnector(
                    CreateVectorStoreConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVectorStoreConnectorRequest,
                                    CreateVectorStoreConnectorResponse>
                            handler) {
        LOG.trace("Called async createVectorStoreConnector");
        final CreateVectorStoreConnectorRequest interceptedRequest =
                CreateVectorStoreConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVectorStoreConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateVectorStoreConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/CreateVectorStoreConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateVectorStoreConnectorResponse>
                transformer =
                        CreateVectorStoreConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVectorStoreConnectorRequest, CreateVectorStoreConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVectorStoreConnectorRequest,
                                CreateVectorStoreConnectorResponse>,
                        java.util.concurrent.Future<CreateVectorStoreConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVectorStoreConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVectorStoreConnectorRequest, CreateVectorStoreConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVectorStoreConnectorFileSyncResponse>
            createVectorStoreConnectorFileSync(
                    CreateVectorStoreConnectorFileSyncRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVectorStoreConnectorFileSyncRequest,
                                    CreateVectorStoreConnectorFileSyncResponse>
                            handler) {
        LOG.trace("Called async createVectorStoreConnectorFileSync");
        final CreateVectorStoreConnectorFileSyncRequest interceptedRequest =
                CreateVectorStoreConnectorFileSyncConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVectorStoreConnectorFileSyncConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "CreateVectorStoreConnectorFileSync",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/CreateVectorStoreConnectorFileSync");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateVectorStoreConnectorFileSyncResponse>
                transformer =
                        CreateVectorStoreConnectorFileSyncConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVectorStoreConnectorFileSyncRequest,
                        CreateVectorStoreConnectorFileSyncResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVectorStoreConnectorFileSyncRequest,
                                CreateVectorStoreConnectorFileSyncResponse>,
                        java.util.concurrent.Future<CreateVectorStoreConnectorFileSyncResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVectorStoreConnectorFileSyncDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVectorStoreConnectorFileSyncRequest,
                    CreateVectorStoreConnectorFileSyncResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteApiKey");
        final DeleteApiKeyRequest interceptedRequest =
                DeleteApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/DeleteApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer =
                        DeleteApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApiKeyRequest, DeleteApiKeyResponse>,
                        java.util.concurrent.Future<DeleteApiKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApiKeyRequest, DeleteApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDedicatedAiClusterResponse> deleteDedicatedAiCluster(
            DeleteDedicatedAiClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedAiClusterRequest, DeleteDedicatedAiClusterResponse>
                    handler) {
        LOG.trace("Called async deleteDedicatedAiCluster");
        final DeleteDedicatedAiClusterRequest interceptedRequest =
                DeleteDedicatedAiClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDedicatedAiClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteDedicatedAiCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/DeleteDedicatedAiCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDedicatedAiClusterResponse>
                transformer =
                        DeleteDedicatedAiClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDedicatedAiClusterRequest, DeleteDedicatedAiClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDedicatedAiClusterRequest, DeleteDedicatedAiClusterResponse>,
                        java.util.concurrent.Future<DeleteDedicatedAiClusterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDedicatedAiClusterRequest, DeleteDedicatedAiClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResponse> deleteEndpoint(
            DeleteEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEndpointRequest, DeleteEndpointResponse>
                    handler) {
        LOG.trace("Called async deleteEndpoint");
        final DeleteEndpointRequest interceptedRequest =
                DeleteEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/DeleteEndpoint");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteEndpointResponse>
                transformer =
                        DeleteEndpointConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteEndpointRequest, DeleteEndpointResponse>,
                        java.util.concurrent.Future<DeleteEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteEndpointRequest, DeleteEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteGenerativeAiPrivateEndpointResponse>
            deleteGenerativeAiPrivateEndpoint(
                    DeleteGenerativeAiPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteGenerativeAiPrivateEndpointRequest,
                                    DeleteGenerativeAiPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteGenerativeAiPrivateEndpoint");
        final DeleteGenerativeAiPrivateEndpointRequest interceptedRequest =
                DeleteGenerativeAiPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGenerativeAiPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteGenerativeAiPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/DeleteGenerativeAiPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteGenerativeAiPrivateEndpointResponse>
                transformer =
                        DeleteGenerativeAiPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteGenerativeAiPrivateEndpointRequest,
                        DeleteGenerativeAiPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGenerativeAiPrivateEndpointRequest,
                                DeleteGenerativeAiPrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteGenerativeAiPrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGenerativeAiPrivateEndpointRequest,
                    DeleteGenerativeAiPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteGenerativeAiProjectResponse> deleteGenerativeAiProject(
            DeleteGenerativeAiProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGenerativeAiProjectRequest, DeleteGenerativeAiProjectResponse>
                    handler) {
        LOG.trace("Called async deleteGenerativeAiProject");
        final DeleteGenerativeAiProjectRequest interceptedRequest =
                DeleteGenerativeAiProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGenerativeAiProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteGenerativeAiProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/DeleteGenerativeAiProject");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteGenerativeAiProjectResponse>
                transformer =
                        DeleteGenerativeAiProjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteGenerativeAiProjectRequest, DeleteGenerativeAiProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGenerativeAiProjectRequest,
                                DeleteGenerativeAiProjectResponse>,
                        java.util.concurrent.Future<DeleteGenerativeAiProjectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGenerativeAiProjectRequest, DeleteGenerativeAiProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedApplicationResponse> deleteHostedApplication(
            DeleteHostedApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostedApplicationRequest, DeleteHostedApplicationResponse>
                    handler) {
        LOG.trace("Called async deleteHostedApplication");
        final DeleteHostedApplicationRequest interceptedRequest =
                DeleteHostedApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostedApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteHostedApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/DeleteHostedApplication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteHostedApplicationResponse>
                transformer =
                        DeleteHostedApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteHostedApplicationRequest, DeleteHostedApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostedApplicationRequest, DeleteHostedApplicationResponse>,
                        java.util.concurrent.Future<DeleteHostedApplicationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostedApplicationRequest, DeleteHostedApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedApplicationStorageResponse>
            deleteHostedApplicationStorage(
                    DeleteHostedApplicationStorageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteHostedApplicationStorageRequest,
                                    DeleteHostedApplicationStorageResponse>
                            handler) {
        LOG.trace("Called async deleteHostedApplicationStorage");
        final DeleteHostedApplicationStorageRequest interceptedRequest =
                DeleteHostedApplicationStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostedApplicationStorageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteHostedApplicationStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/DeleteHostedApplicationStorage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteHostedApplicationStorageResponse>
                transformer =
                        DeleteHostedApplicationStorageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteHostedApplicationStorageRequest,
                        DeleteHostedApplicationStorageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostedApplicationStorageRequest,
                                DeleteHostedApplicationStorageResponse>,
                        java.util.concurrent.Future<DeleteHostedApplicationStorageResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostedApplicationStorageRequest, DeleteHostedApplicationStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedDeploymentResponse> deleteHostedDeployment(
            DeleteHostedDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostedDeploymentRequest, DeleteHostedDeploymentResponse>
                    handler) {
        LOG.trace("Called async deleteHostedDeployment");
        final DeleteHostedDeploymentRequest interceptedRequest =
                DeleteHostedDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostedDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteHostedDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/DeleteHostedDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteHostedDeploymentResponse>
                transformer =
                        DeleteHostedDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteHostedDeploymentRequest, DeleteHostedDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostedDeploymentRequest, DeleteHostedDeploymentResponse>,
                        java.util.concurrent.Future<DeleteHostedDeploymentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostedDeploymentRequest, DeleteHostedDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedDeploymentArtifactResponse>
            deleteHostedDeploymentArtifact(
                    DeleteHostedDeploymentArtifactRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteHostedDeploymentArtifactRequest,
                                    DeleteHostedDeploymentArtifactResponse>
                            handler) {
        LOG.trace("Called async deleteHostedDeploymentArtifact");
        final DeleteHostedDeploymentArtifactRequest interceptedRequest =
                DeleteHostedDeploymentArtifactConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteHostedDeploymentArtifactConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteHostedDeploymentArtifact",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/DeleteHostedDeploymentArtifact");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteHostedDeploymentArtifactResponse>
                transformer =
                        DeleteHostedDeploymentArtifactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteHostedDeploymentArtifactRequest,
                        DeleteHostedDeploymentArtifactResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteHostedDeploymentArtifactRequest,
                                DeleteHostedDeploymentArtifactResponse>,
                        java.util.concurrent.Future<DeleteHostedDeploymentArtifactResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteHostedDeploymentArtifactRequest, DeleteHostedDeploymentArtifactResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteImportedModelResponse> deleteImportedModel(
            DeleteImportedModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteImportedModelRequest, DeleteImportedModelResponse>
                    handler) {
        LOG.trace("Called async deleteImportedModel");
        final DeleteImportedModelRequest interceptedRequest =
                DeleteImportedModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteImportedModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteImportedModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/DeleteImportedModel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteImportedModelResponse>
                transformer =
                        DeleteImportedModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteImportedModelRequest, DeleteImportedModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteImportedModelRequest, DeleteImportedModelResponse>,
                        java.util.concurrent.Future<DeleteImportedModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteImportedModelRequest, DeleteImportedModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                    handler) {
        LOG.trace("Called async deleteModel");
        final DeleteModelRequest interceptedRequest =
                DeleteModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/DeleteModel");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelResponse>
                transformer =
                        DeleteModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteModelRequest, DeleteModelResponse>,
                        java.util.concurrent.Future<DeleteModelResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteModelRequest, DeleteModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSemanticStoreResponse> deleteSemanticStore(
            DeleteSemanticStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSemanticStoreRequest, DeleteSemanticStoreResponse>
                    handler) {
        LOG.trace("Called async deleteSemanticStore");
        final DeleteSemanticStoreRequest interceptedRequest =
                DeleteSemanticStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSemanticStoreConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteSemanticStore",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/DeleteSemanticStore");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSemanticStoreResponse>
                transformer =
                        DeleteSemanticStoreConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSemanticStoreRequest, DeleteSemanticStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSemanticStoreRequest, DeleteSemanticStoreResponse>,
                        java.util.concurrent.Future<DeleteSemanticStoreResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSemanticStoreRequest, DeleteSemanticStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVectorStoreConnectorResponse>
            deleteVectorStoreConnector(
                    DeleteVectorStoreConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVectorStoreConnectorRequest,
                                    DeleteVectorStoreConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteVectorStoreConnector");
        final DeleteVectorStoreConnectorRequest interceptedRequest =
                DeleteVectorStoreConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVectorStoreConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "DeleteVectorStoreConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/DeleteVectorStoreConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteVectorStoreConnectorResponse>
                transformer =
                        DeleteVectorStoreConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVectorStoreConnectorRequest, DeleteVectorStoreConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVectorStoreConnectorRequest,
                                DeleteVectorStoreConnectorResponse>,
                        java.util.concurrent.Future<DeleteVectorStoreConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVectorStoreConnectorRequest, DeleteVectorStoreConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResponse> getApiKey(
            GetApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse>
                    handler) {
        LOG.trace("Called async getApiKey");
        final GetApiKeyRequest interceptedRequest = GetApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/GetApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, GetApiKeyResponse>
                transformer =
                        GetApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse>,
                        java.util.concurrent.Future<GetApiKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApiKeyRequest, GetApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDedicatedAiClusterResponse> getDedicatedAiCluster(
            GetDedicatedAiClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
                    handler) {
        LOG.trace("Called async getDedicatedAiCluster");
        final GetDedicatedAiClusterRequest interceptedRequest =
                GetDedicatedAiClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDedicatedAiClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetDedicatedAiCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/GetDedicatedAiCluster");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDedicatedAiClusterResponse>
                transformer =
                        GetDedicatedAiClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>,
                        java.util.concurrent.Future<GetDedicatedAiClusterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetEndpointResponse> getEndpoint(
            GetEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse>
                    handler) {
        LOG.trace("Called async getEndpoint");
        final GetEndpointRequest interceptedRequest =
                GetEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/GetEndpoint");
        final java.util.function.Function<javax.ws.rs.core.Response, GetEndpointResponse>
                transformer =
                        GetEndpointConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetEndpointRequest, GetEndpointResponse>,
                        java.util.concurrent.Future<GetEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetEndpointRequest, GetEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetGenerativeAiPrivateEndpointResponse>
            getGenerativeAiPrivateEndpoint(
                    GetGenerativeAiPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetGenerativeAiPrivateEndpointRequest,
                                    GetGenerativeAiPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getGenerativeAiPrivateEndpoint");
        final GetGenerativeAiPrivateEndpointRequest interceptedRequest =
                GetGenerativeAiPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGenerativeAiPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetGenerativeAiPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/GetGenerativeAiPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetGenerativeAiPrivateEndpointResponse>
                transformer =
                        GetGenerativeAiPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetGenerativeAiPrivateEndpointRequest,
                        GetGenerativeAiPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetGenerativeAiPrivateEndpointRequest,
                                GetGenerativeAiPrivateEndpointResponse>,
                        java.util.concurrent.Future<GetGenerativeAiPrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGenerativeAiPrivateEndpointRequest, GetGenerativeAiPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetGenerativeAiProjectResponse> getGenerativeAiProject(
            GetGenerativeAiProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
                    handler) {
        LOG.trace("Called async getGenerativeAiProject");
        final GetGenerativeAiProjectRequest interceptedRequest =
                GetGenerativeAiProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGenerativeAiProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetGenerativeAiProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/GetGenerativeAiProject");
        final java.util.function.Function<javax.ws.rs.core.Response, GetGenerativeAiProjectResponse>
                transformer =
                        GetGenerativeAiProjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>,
                        java.util.concurrent.Future<GetGenerativeAiProjectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHostedApplicationResponse> getHostedApplication(
            GetHostedApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHostedApplicationRequest, GetHostedApplicationResponse>
                    handler) {
        LOG.trace("Called async getHostedApplication");
        final GetHostedApplicationRequest interceptedRequest =
                GetHostedApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostedApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetHostedApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/GetHostedApplication");
        final java.util.function.Function<javax.ws.rs.core.Response, GetHostedApplicationResponse>
                transformer =
                        GetHostedApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetHostedApplicationRequest, GetHostedApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHostedApplicationRequest, GetHostedApplicationResponse>,
                        java.util.concurrent.Future<GetHostedApplicationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHostedApplicationRequest, GetHostedApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHostedApplicationStorageResponse>
            getHostedApplicationStorage(
                    GetHostedApplicationStorageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetHostedApplicationStorageRequest,
                                    GetHostedApplicationStorageResponse>
                            handler) {
        LOG.trace("Called async getHostedApplicationStorage");
        final GetHostedApplicationStorageRequest interceptedRequest =
                GetHostedApplicationStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostedApplicationStorageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetHostedApplicationStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/GetHostedApplicationStorage");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetHostedApplicationStorageResponse>
                transformer =
                        GetHostedApplicationStorageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHostedApplicationStorageRequest,
                                GetHostedApplicationStorageResponse>,
                        java.util.concurrent.Future<GetHostedApplicationStorageResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetHostedDeploymentResponse> getHostedDeployment(
            GetHostedDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHostedDeploymentRequest, GetHostedDeploymentResponse>
                    handler) {
        LOG.trace("Called async getHostedDeployment");
        final GetHostedDeploymentRequest interceptedRequest =
                GetHostedDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHostedDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetHostedDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/GetHostedDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetHostedDeploymentResponse>
                transformer =
                        GetHostedDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetHostedDeploymentRequest, GetHostedDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetHostedDeploymentRequest, GetHostedDeploymentResponse>,
                        java.util.concurrent.Future<GetHostedDeploymentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetHostedDeploymentRequest, GetHostedDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetImportedModelResponse> getImportedModel(
            GetImportedModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetImportedModelRequest, GetImportedModelResponse>
                    handler) {
        LOG.trace("Called async getImportedModel");
        final GetImportedModelRequest interceptedRequest =
                GetImportedModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetImportedModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetImportedModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/GetImportedModel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetImportedModelResponse>
                transformer =
                        GetImportedModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetImportedModelRequest, GetImportedModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetImportedModelRequest, GetImportedModelResponse>,
                        java.util.concurrent.Future<GetImportedModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetImportedModelRequest, GetImportedModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>
                    handler) {
        LOG.trace("Called async getModel");
        final GetModelRequest interceptedRequest = GetModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/GetModel");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelResponse> transformer =
                GetModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>,
                        java.util.concurrent.Future<GetModelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetModelRequest, GetModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSemanticStoreResponse> getSemanticStore(
            GetSemanticStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSemanticStoreRequest, GetSemanticStoreResponse>
                    handler) {
        LOG.trace("Called async getSemanticStore");
        final GetSemanticStoreRequest interceptedRequest =
                GetSemanticStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSemanticStoreConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetSemanticStore",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/GetSemanticStore");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSemanticStoreResponse>
                transformer =
                        GetSemanticStoreConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSemanticStoreRequest, GetSemanticStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSemanticStoreRequest, GetSemanticStoreResponse>,
                        java.util.concurrent.Future<GetSemanticStoreResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSemanticStoreRequest, GetSemanticStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVectorStoreConnectorResponse> getVectorStoreConnector(
            GetVectorStoreConnectorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
                    handler) {
        LOG.trace("Called async getVectorStoreConnector");
        final GetVectorStoreConnectorRequest interceptedRequest =
                GetVectorStoreConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVectorStoreConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/GetVectorStoreConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetVectorStoreConnectorResponse>
                transformer =
                        GetVectorStoreConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>,
                        java.util.concurrent.Future<GetVectorStoreConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVectorStoreConnectorFileSyncResponse>
            getVectorStoreConnectorFileSync(
                    GetVectorStoreConnectorFileSyncRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVectorStoreConnectorFileSyncRequest,
                                    GetVectorStoreConnectorFileSyncResponse>
                            handler) {
        LOG.trace("Called async getVectorStoreConnectorFileSync");
        final GetVectorStoreConnectorFileSyncRequest interceptedRequest =
                GetVectorStoreConnectorFileSyncConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVectorStoreConnectorFileSyncConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnectorFileSync",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/GetVectorStoreConnectorFileSync");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetVectorStoreConnectorFileSyncResponse>
                transformer =
                        GetVectorStoreConnectorFileSyncConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVectorStoreConnectorFileSyncRequest,
                        GetVectorStoreConnectorFileSyncResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVectorStoreConnectorFileSyncRequest,
                                GetVectorStoreConnectorFileSyncResponse>,
                        java.util.concurrent.Future<GetVectorStoreConnectorFileSyncResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVectorStoreConnectorFileSyncRequest,
                    GetVectorStoreConnectorFileSyncResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVectorStoreConnectorStatsResponse>
            getVectorStoreConnectorStats(
                    GetVectorStoreConnectorStatsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVectorStoreConnectorStatsRequest,
                                    GetVectorStoreConnectorStatsResponse>
                            handler) {
        LOG.trace("Called async getVectorStoreConnectorStats");
        final GetVectorStoreConnectorStatsRequest interceptedRequest =
                GetVectorStoreConnectorStatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVectorStoreConnectorStatsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnectorStats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorStats/GetVectorStoreConnectorStats");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetVectorStoreConnectorStatsResponse>
                transformer =
                        GetVectorStoreConnectorStatsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVectorStoreConnectorStatsRequest, GetVectorStoreConnectorStatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVectorStoreConnectorStatsRequest,
                                GetVectorStoreConnectorStatsResponse>,
                        java.util.concurrent.Future<GetVectorStoreConnectorStatsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVectorStoreConnectorStatsRequest, GetVectorStoreConnectorStatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "GenerativeAi",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {
        LOG.trace("Called async listApiKeys");
        final ListApiKeysRequest interceptedRequest =
                ListApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKeyCollection/ListApiKeys");
        final java.util.function.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer =
                        ListApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApiKeysRequest, ListApiKeysResponse>,
                        java.util.concurrent.Future<ListApiKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApiKeysRequest, ListApiKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDedicatedAiClustersResponse> listDedicatedAiClusters(
            ListDedicatedAiClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>
                    handler) {
        LOG.trace("Called async listDedicatedAiClusters");
        final ListDedicatedAiClustersRequest interceptedRequest =
                ListDedicatedAiClustersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDedicatedAiClustersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListDedicatedAiClusters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiClusterCollection/ListDedicatedAiClusters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDedicatedAiClustersResponse>
                transformer =
                        ListDedicatedAiClustersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>,
                        java.util.concurrent.Future<ListDedicatedAiClustersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDedicatedAiClustersRequest, ListDedicatedAiClustersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResponse> listEndpoints(
            ListEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                    handler) {
        LOG.trace("Called async listEndpoints");
        final ListEndpointsRequest interceptedRequest =
                ListEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/EndpointCollection/ListEndpoints");
        final java.util.function.Function<javax.ws.rs.core.Response, ListEndpointsResponse>
                transformer =
                        ListEndpointsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListEndpointsRequest, ListEndpointsResponse>,
                        java.util.concurrent.Future<ListEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListEndpointsRequest, ListEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGenerativeAiPrivateEndpointsResponse>
            listGenerativeAiPrivateEndpoints(
                    ListGenerativeAiPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListGenerativeAiPrivateEndpointsRequest,
                                    ListGenerativeAiPrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listGenerativeAiPrivateEndpoints");
        final ListGenerativeAiPrivateEndpointsRequest interceptedRequest =
                ListGenerativeAiPrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGenerativeAiPrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListGenerativeAiPrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpointCollection/ListGenerativeAiPrivateEndpoints");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListGenerativeAiPrivateEndpointsResponse>
                transformer =
                        ListGenerativeAiPrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListGenerativeAiPrivateEndpointsRequest,
                        ListGenerativeAiPrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGenerativeAiPrivateEndpointsRequest,
                                ListGenerativeAiPrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListGenerativeAiPrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGenerativeAiPrivateEndpointsRequest,
                    ListGenerativeAiPrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListGenerativeAiProjectsResponse> listGenerativeAiProjects(
            ListGenerativeAiProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>
                    handler) {
        LOG.trace("Called async listGenerativeAiProjects");
        final ListGenerativeAiProjectsRequest interceptedRequest =
                ListGenerativeAiProjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGenerativeAiProjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListGenerativeAiProjects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProjectCollection/ListGenerativeAiProjects");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListGenerativeAiProjectsResponse>
                transformer =
                        ListGenerativeAiProjectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>,
                        java.util.concurrent.Future<ListGenerativeAiProjectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGenerativeAiProjectsRequest, ListGenerativeAiProjectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListHostedApplicationStoragesResponse>
            listHostedApplicationStorages(
                    ListHostedApplicationStoragesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListHostedApplicationStoragesRequest,
                                    ListHostedApplicationStoragesResponse>
                            handler) {
        LOG.trace("Called async listHostedApplicationStorages");
        final ListHostedApplicationStoragesRequest interceptedRequest =
                ListHostedApplicationStoragesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostedApplicationStoragesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListHostedApplicationStorages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorageCollection/ListHostedApplicationStorages");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListHostedApplicationStoragesResponse>
                transformer =
                        ListHostedApplicationStoragesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListHostedApplicationStoragesRequest, ListHostedApplicationStoragesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostedApplicationStoragesRequest,
                                ListHostedApplicationStoragesResponse>,
                        java.util.concurrent.Future<ListHostedApplicationStoragesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostedApplicationStoragesRequest, ListHostedApplicationStoragesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListHostedApplicationsResponse> listHostedApplications(
            ListHostedApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostedApplicationsRequest, ListHostedApplicationsResponse>
                    handler) {
        LOG.trace("Called async listHostedApplications");
        final ListHostedApplicationsRequest interceptedRequest =
                ListHostedApplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostedApplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListHostedApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationCollection/ListHostedApplications");
        final java.util.function.Function<javax.ws.rs.core.Response, ListHostedApplicationsResponse>
                transformer =
                        ListHostedApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListHostedApplicationsRequest, ListHostedApplicationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostedApplicationsRequest, ListHostedApplicationsResponse>,
                        java.util.concurrent.Future<ListHostedApplicationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostedApplicationsRequest, ListHostedApplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListHostedDeploymentsResponse> listHostedDeployments(
            ListHostedDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>
                    handler) {
        LOG.trace("Called async listHostedDeployments");
        final ListHostedDeploymentsRequest interceptedRequest =
                ListHostedDeploymentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListHostedDeploymentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListHostedDeployments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeploymentCollection/ListHostedDeployments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListHostedDeploymentsResponse>
                transformer =
                        ListHostedDeploymentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>,
                        java.util.concurrent.Future<ListHostedDeploymentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListHostedDeploymentsRequest, ListHostedDeploymentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListImportedModelsResponse> listImportedModels(
            ListImportedModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImportedModelsRequest, ListImportedModelsResponse>
                    handler) {
        LOG.trace("Called async listImportedModels");
        final ListImportedModelsRequest interceptedRequest =
                ListImportedModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListImportedModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListImportedModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModelCollection/ListImportedModels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListImportedModelsResponse>
                transformer =
                        ListImportedModelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListImportedModelsRequest, ListImportedModelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListImportedModelsRequest, ListImportedModelsResponse>,
                        java.util.concurrent.Future<ListImportedModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListImportedModelsRequest, ListImportedModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse>
                    handler) {
        LOG.trace("Called async listModels");
        final ListModelsRequest interceptedRequest = ListModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ModelCollection/ListModels");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelsResponse>
                transformer =
                        ListModelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListModelsRequest, ListModelsResponse>,
                        java.util.concurrent.Future<ListModelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListModelsRequest, ListModelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSemanticStoresResponse> listSemanticStores(
            ListSemanticStoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSemanticStoresRequest, ListSemanticStoresResponse>
                    handler) {
        LOG.trace("Called async listSemanticStores");
        final ListSemanticStoresRequest interceptedRequest =
                ListSemanticStoresConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSemanticStoresConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListSemanticStores",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStoreCollection/ListSemanticStores");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSemanticStoresResponse>
                transformer =
                        ListSemanticStoresConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSemanticStoresRequest, ListSemanticStoresResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSemanticStoresRequest, ListSemanticStoresResponse>,
                        java.util.concurrent.Future<ListSemanticStoresResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSemanticStoresRequest, ListSemanticStoresResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVectorStoreConnectorFileSyncIngestionLogsResponse>
            listVectorStoreConnectorFileSyncIngestionLogs(
                    ListVectorStoreConnectorFileSyncIngestionLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                                    ListVectorStoreConnectorFileSyncIngestionLogsResponse>
                            handler) {
        LOG.trace("Called async listVectorStoreConnectorFileSyncIngestionLogs");
        final ListVectorStoreConnectorFileSyncIngestionLogsRequest interceptedRequest =
                ListVectorStoreConnectorFileSyncIngestionLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVectorStoreConnectorFileSyncIngestionLogsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorFileSyncIngestionLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/FileSyncIngestionLogsCollection/ListVectorStoreConnectorFileSyncIngestionLogs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse>
                transformer =
                        ListVectorStoreConnectorFileSyncIngestionLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                                ListVectorStoreConnectorFileSyncIngestionLogsResponse>,
                        java.util.concurrent.Future<
                                ListVectorStoreConnectorFileSyncIngestionLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVectorStoreConnectorFileSyncIngestionLogsRequest,
                    ListVectorStoreConnectorFileSyncIngestionLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVectorStoreConnectorFileSyncsResponse>
            listVectorStoreConnectorFileSyncs(
                    ListVectorStoreConnectorFileSyncsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorFileSyncsRequest,
                                    ListVectorStoreConnectorFileSyncsResponse>
                            handler) {
        LOG.trace("Called async listVectorStoreConnectorFileSyncs");
        final ListVectorStoreConnectorFileSyncsRequest interceptedRequest =
                ListVectorStoreConnectorFileSyncsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVectorStoreConnectorFileSyncsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorFileSyncs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSyncCollection/ListVectorStoreConnectorFileSyncs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVectorStoreConnectorFileSyncsResponse>
                transformer =
                        ListVectorStoreConnectorFileSyncsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVectorStoreConnectorFileSyncsRequest,
                        ListVectorStoreConnectorFileSyncsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVectorStoreConnectorFileSyncsRequest,
                                ListVectorStoreConnectorFileSyncsResponse>,
                        java.util.concurrent.Future<ListVectorStoreConnectorFileSyncsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVectorStoreConnectorFileSyncsRequest,
                    ListVectorStoreConnectorFileSyncsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVectorStoreConnectorIngestionLogsResponse>
            listVectorStoreConnectorIngestionLogs(
                    ListVectorStoreConnectorIngestionLogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVectorStoreConnectorIngestionLogsRequest,
                                    ListVectorStoreConnectorIngestionLogsResponse>
                            handler) {
        LOG.trace("Called async listVectorStoreConnectorIngestionLogs");
        final ListVectorStoreConnectorIngestionLogsRequest interceptedRequest =
                ListVectorStoreConnectorIngestionLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVectorStoreConnectorIngestionLogsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorIngestionLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorIngestionLogsCollection/ListVectorStoreConnectorIngestionLogs");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVectorStoreConnectorIngestionLogsResponse>
                transformer =
                        ListVectorStoreConnectorIngestionLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVectorStoreConnectorIngestionLogsRequest,
                        ListVectorStoreConnectorIngestionLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVectorStoreConnectorIngestionLogsRequest,
                                ListVectorStoreConnectorIngestionLogsResponse>,
                        java.util.concurrent.Future<ListVectorStoreConnectorIngestionLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVectorStoreConnectorIngestionLogsRequest,
                    ListVectorStoreConnectorIngestionLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVectorStoreConnectorsResponse> listVectorStoreConnectors(
            ListVectorStoreConnectorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>
                    handler) {
        LOG.trace("Called async listVectorStoreConnectors");
        final ListVectorStoreConnectorsRequest interceptedRequest =
                ListVectorStoreConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVectorStoreConnectorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorCollection/ListVectorStoreConnectors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVectorStoreConnectorsResponse>
                transformer =
                        ListVectorStoreConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVectorStoreConnectorsRequest,
                                ListVectorStoreConnectorsResponse>,
                        java.util.concurrent.Future<ListVectorStoreConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVectorStoreConnectorsRequest, ListVectorStoreConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "GenerativeAi",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestError/ListWorkRequestErrors");
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
                        "GenerativeAi",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "GenerativeAi",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RenewApiKeyResponse> renewApiKey(
            RenewApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RenewApiKeyRequest, RenewApiKeyResponse>
                    handler) {
        LOG.trace("Called async renewApiKey");
        final RenewApiKeyRequest interceptedRequest =
                RenewApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RenewApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "RenewApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/RenewApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, RenewApiKeyResponse>
                transformer =
                        RenewApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RenewApiKeyRequest, RenewApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RenewApiKeyRequest, RenewApiKeyResponse>,
                        java.util.concurrent.Future<RenewApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRenewApiKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RenewApiKeyRequest, RenewApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SetApiKeyStateResponse> setApiKeyState(
            SetApiKeyStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetApiKeyStateRequest, SetApiKeyStateResponse>
                    handler) {
        LOG.trace("Called async setApiKeyState");
        final SetApiKeyStateRequest interceptedRequest =
                SetApiKeyStateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetApiKeyStateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "SetApiKeyState",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/SetApiKeyState");
        final java.util.function.Function<javax.ws.rs.core.Response, SetApiKeyStateResponse>
                transformer =
                        SetApiKeyStateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SetApiKeyStateRequest, SetApiKeyStateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SetApiKeyStateRequest, SetApiKeyStateResponse>,
                        java.util.concurrent.Future<SetApiKeyStateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSetApiKeyStateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SetApiKeyStateRequest, SetApiKeyStateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResponse> updateApiKey(
            UpdateApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResponse>
                    handler) {
        LOG.trace("Called async updateApiKey");
        final UpdateApiKeyRequest interceptedRequest =
                UpdateApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/UpdateApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateApiKeyResponse>
                transformer =
                        UpdateApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateApiKeyRequest, UpdateApiKeyResponse>,
                        java.util.concurrent.Future<UpdateApiKeyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateApiKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateApiKeyRequest, UpdateApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDedicatedAiClusterResponse> updateDedicatedAiCluster(
            UpdateDedicatedAiClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedAiClusterRequest, UpdateDedicatedAiClusterResponse>
                    handler) {
        LOG.trace("Called async updateDedicatedAiCluster");
        final UpdateDedicatedAiClusterRequest interceptedRequest =
                UpdateDedicatedAiClusterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDedicatedAiClusterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateDedicatedAiCluster",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/UpdateDedicatedAiCluster");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDedicatedAiClusterResponse>
                transformer =
                        UpdateDedicatedAiClusterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDedicatedAiClusterRequest, UpdateDedicatedAiClusterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDedicatedAiClusterRequest, UpdateDedicatedAiClusterResponse>,
                        java.util.concurrent.Future<UpdateDedicatedAiClusterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDedicatedAiClusterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDedicatedAiClusterRequest, UpdateDedicatedAiClusterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResponse> updateEndpoint(
            UpdateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEndpointRequest, UpdateEndpointResponse>
                    handler) {
        LOG.trace("Called async updateEndpoint");
        final UpdateEndpointRequest interceptedRequest =
                UpdateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/UpdateEndpoint");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateEndpointResponse>
                transformer =
                        UpdateEndpointConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateEndpointRequest, UpdateEndpointResponse>,
                        java.util.concurrent.Future<UpdateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateEndpointRequest, UpdateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGenerativeAiPrivateEndpointResponse>
            updateGenerativeAiPrivateEndpoint(
                    UpdateGenerativeAiPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateGenerativeAiPrivateEndpointRequest,
                                    UpdateGenerativeAiPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateGenerativeAiPrivateEndpoint");
        final UpdateGenerativeAiPrivateEndpointRequest interceptedRequest =
                UpdateGenerativeAiPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGenerativeAiPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateGenerativeAiPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/UpdateGenerativeAiPrivateEndpoint");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateGenerativeAiPrivateEndpointResponse>
                transformer =
                        UpdateGenerativeAiPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateGenerativeAiPrivateEndpointRequest,
                        UpdateGenerativeAiPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGenerativeAiPrivateEndpointRequest,
                                UpdateGenerativeAiPrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateGenerativeAiPrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateGenerativeAiPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGenerativeAiPrivateEndpointRequest,
                    UpdateGenerativeAiPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGenerativeAiProjectResponse> updateGenerativeAiProject(
            UpdateGenerativeAiProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGenerativeAiProjectRequest, UpdateGenerativeAiProjectResponse>
                    handler) {
        LOG.trace("Called async updateGenerativeAiProject");
        final UpdateGenerativeAiProjectRequest interceptedRequest =
                UpdateGenerativeAiProjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGenerativeAiProjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateGenerativeAiProject",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/UpdateGenerativeAiProject");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateGenerativeAiProjectResponse>
                transformer =
                        UpdateGenerativeAiProjectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateGenerativeAiProjectRequest, UpdateGenerativeAiProjectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGenerativeAiProjectRequest,
                                UpdateGenerativeAiProjectResponse>,
                        java.util.concurrent.Future<UpdateGenerativeAiProjectResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateGenerativeAiProjectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGenerativeAiProjectRequest, UpdateGenerativeAiProjectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateHostedApplicationResponse> updateHostedApplication(
            UpdateHostedApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostedApplicationRequest, UpdateHostedApplicationResponse>
                    handler) {
        LOG.trace("Called async updateHostedApplication");
        final UpdateHostedApplicationRequest interceptedRequest =
                UpdateHostedApplicationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHostedApplicationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateHostedApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/UpdateHostedApplication");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateHostedApplicationResponse>
                transformer =
                        UpdateHostedApplicationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateHostedApplicationRequest, UpdateHostedApplicationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHostedApplicationRequest, UpdateHostedApplicationResponse>,
                        java.util.concurrent.Future<UpdateHostedApplicationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHostedApplicationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHostedApplicationRequest, UpdateHostedApplicationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateHostedDeploymentResponse> updateHostedDeployment(
            UpdateHostedDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostedDeploymentRequest, UpdateHostedDeploymentResponse>
                    handler) {
        LOG.trace("Called async updateHostedDeployment");
        final UpdateHostedDeploymentRequest interceptedRequest =
                UpdateHostedDeploymentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHostedDeploymentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateHostedDeployment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/UpdateHostedDeployment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateHostedDeploymentResponse>
                transformer =
                        UpdateHostedDeploymentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateHostedDeploymentRequest, UpdateHostedDeploymentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateHostedDeploymentRequest, UpdateHostedDeploymentResponse>,
                        java.util.concurrent.Future<UpdateHostedDeploymentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateHostedDeploymentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateHostedDeploymentRequest, UpdateHostedDeploymentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateImportedModelResponse> updateImportedModel(
            UpdateImportedModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateImportedModelRequest, UpdateImportedModelResponse>
                    handler) {
        LOG.trace("Called async updateImportedModel");
        final UpdateImportedModelRequest interceptedRequest =
                UpdateImportedModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateImportedModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateImportedModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/UpdateImportedModel");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateImportedModelResponse>
                transformer =
                        UpdateImportedModelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateImportedModelRequest, UpdateImportedModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateImportedModelRequest, UpdateImportedModelResponse>,
                        java.util.concurrent.Future<UpdateImportedModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateImportedModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateImportedModelRequest, UpdateImportedModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                    handler) {
        LOG.trace("Called async updateModel");
        final UpdateModelRequest interceptedRequest =
                UpdateModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/UpdateModel");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelResponse>
                transformer =
                        UpdateModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateModelRequest, UpdateModelResponse>,
                        java.util.concurrent.Future<UpdateModelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateModelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateModelRequest, UpdateModelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSemanticStoreResponse> updateSemanticStore(
            UpdateSemanticStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSemanticStoreRequest, UpdateSemanticStoreResponse>
                    handler) {
        LOG.trace("Called async updateSemanticStore");
        final UpdateSemanticStoreRequest interceptedRequest =
                UpdateSemanticStoreConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSemanticStoreConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateSemanticStore",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/UpdateSemanticStore");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSemanticStoreResponse>
                transformer =
                        UpdateSemanticStoreConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateSemanticStoreRequest, UpdateSemanticStoreResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSemanticStoreRequest, UpdateSemanticStoreResponse>,
                        java.util.concurrent.Future<UpdateSemanticStoreResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSemanticStoreDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSemanticStoreRequest, UpdateSemanticStoreResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVectorStoreConnectorResponse>
            updateVectorStoreConnector(
                    UpdateVectorStoreConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVectorStoreConnectorRequest,
                                    UpdateVectorStoreConnectorResponse>
                            handler) {
        LOG.trace("Called async updateVectorStoreConnector");
        final UpdateVectorStoreConnectorRequest interceptedRequest =
                UpdateVectorStoreConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVectorStoreConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "GenerativeAi",
                        "UpdateVectorStoreConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/UpdateVectorStoreConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateVectorStoreConnectorResponse>
                transformer =
                        UpdateVectorStoreConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVectorStoreConnectorRequest, UpdateVectorStoreConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVectorStoreConnectorRequest,
                                UpdateVectorStoreConnectorResponse>,
                        java.util.concurrent.Future<UpdateVectorStoreConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVectorStoreConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVectorStoreConnectorRequest, UpdateVectorStoreConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
