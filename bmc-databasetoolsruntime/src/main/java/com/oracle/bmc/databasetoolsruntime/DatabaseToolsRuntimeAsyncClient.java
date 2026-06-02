/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.databasetoolsruntime.internal.http.*;
import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for DatabaseToolsRuntime service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class DatabaseToolsRuntimeAsyncClient implements DatabaseToolsRuntimeAsync {
    /**
     * Service instance for DatabaseToolsRuntime.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsRuntimeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsRuntimeAsyncClient.class);

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
    public DatabaseToolsRuntimeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                            "DatabaseToolsRuntimeAsyncClient",
                            "getDatabaseToolsDatabaseApiGatewayConfigContent"));
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
                    Builder, DatabaseToolsRuntimeAsyncClient> {
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
        public DatabaseToolsRuntimeAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DatabaseToolsRuntimeAsyncClient(
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
    public void close() {
        client.close();
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
                        "DatabaseToolsRuntime",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "");
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
    public java.util.concurrent.Future<CreateCredentialResponse> createCredential(
            CreateCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCredentialRequest, CreateCredentialResponse>
                    handler) {
        LOG.trace("Called async createCredential");
        final CreateCredentialRequest interceptedRequest =
                CreateCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCredentialResponse>
                transformer =
                        CreateCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCredentialRequest, CreateCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCredentialRequest, CreateCredentialResponse>,
                        java.util.concurrent.Future<CreateCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCredentialRequest, CreateCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCredentialExecuteGranteeResponse>
            createCredentialExecuteGrantee(
                    CreateCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialExecuteGranteeRequest,
                                    CreateCredentialExecuteGranteeResponse>
                            handler) {
        LOG.trace("Called async createCredentialExecuteGrantee");
        final CreateCredentialExecuteGranteeRequest interceptedRequest =
                CreateCredentialExecuteGranteeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCredentialExecuteGranteeResponse>
                transformer =
                        CreateCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCredentialExecuteGranteeRequest,
                        CreateCredentialExecuteGranteeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCredentialExecuteGranteeRequest,
                                CreateCredentialExecuteGranteeResponse>,
                        java.util.concurrent.Future<CreateCredentialExecuteGranteeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCredentialExecuteGranteeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCredentialExecuteGranteeRequest, CreateCredentialExecuteGranteeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCredentialPublicSynonymResponse>
            createCredentialPublicSynonym(
                    CreateCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialPublicSynonymRequest,
                                    CreateCredentialPublicSynonymResponse>
                            handler) {
        LOG.trace("Called async createCredentialPublicSynonym");
        final CreateCredentialPublicSynonymRequest interceptedRequest =
                CreateCredentialPublicSynonymConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCredentialPublicSynonymResponse>
                transformer =
                        CreateCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCredentialPublicSynonymRequest, CreateCredentialPublicSynonymResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCredentialPublicSynonymRequest,
                                CreateCredentialPublicSynonymResponse>,
                        java.util.concurrent.Future<CreateCredentialPublicSynonymResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCredentialPublicSynonymDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCredentialPublicSynonymRequest, CreateCredentialPublicSynonymResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsDatabaseApiGatewayConfigPool");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>,
                        java.util.concurrent.Future<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>,
                        java.util.concurrent.Future<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>,
                        java.util.concurrent.Future<
                                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialResponse> deleteCredential(
            DeleteCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCredentialRequest, DeleteCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteCredential");
        final DeleteCredentialRequest interceptedRequest =
                DeleteCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCredentialResponse>
                transformer =
                        DeleteCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCredentialRequest, DeleteCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCredentialRequest, DeleteCredentialResponse>,
                        java.util.concurrent.Future<DeleteCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCredentialRequest, DeleteCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialExecuteGranteeResponse>
            deleteCredentialExecuteGrantee(
                    DeleteCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialExecuteGranteeRequest,
                                    DeleteCredentialExecuteGranteeResponse>
                            handler) {
        LOG.trace("Called async deleteCredentialExecuteGrantee");
        final DeleteCredentialExecuteGranteeRequest interceptedRequest =
                DeleteCredentialExecuteGranteeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCredentialExecuteGranteeResponse>
                transformer =
                        DeleteCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCredentialExecuteGranteeRequest,
                        DeleteCredentialExecuteGranteeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCredentialExecuteGranteeRequest,
                                DeleteCredentialExecuteGranteeResponse>,
                        java.util.concurrent.Future<DeleteCredentialExecuteGranteeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCredentialExecuteGranteeRequest, DeleteCredentialExecuteGranteeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialPublicSynonymResponse>
            deleteCredentialPublicSynonym(
                    DeleteCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialPublicSynonymRequest,
                                    DeleteCredentialPublicSynonymResponse>
                            handler) {
        LOG.trace("Called async deleteCredentialPublicSynonym");
        final DeleteCredentialPublicSynonymRequest interceptedRequest =
                DeleteCredentialPublicSynonymConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCredentialPublicSynonymResponse>
                transformer =
                        DeleteCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCredentialPublicSynonymRequest, DeleteCredentialPublicSynonymResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCredentialPublicSynonymRequest,
                                DeleteCredentialPublicSynonymResponse>,
                        java.util.concurrent.Future<DeleteCredentialPublicSynonymResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCredentialPublicSynonymRequest, DeleteCredentialPublicSynonymResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsDatabaseApiGatewayConfigPool");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>,
                        java.util.concurrent.Future<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>,
                        java.util.concurrent.Future<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>,
                        java.util.concurrent.Future<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExecuteSqlDatabaseToolsConnectionResponse>
            executeSqlDatabaseToolsConnection(
                    ExecuteSqlDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExecuteSqlDatabaseToolsConnectionRequest,
                                    ExecuteSqlDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async executeSqlDatabaseToolsConnection");
        final ExecuteSqlDatabaseToolsConnectionRequest interceptedRequest =
                ExecuteSqlDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExecuteSqlDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ExecuteSqlDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ExecuteSqlDatabaseToolsConnectionResponse>
                transformer =
                        ExecuteSqlDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExecuteSqlDatabaseToolsConnectionRequest,
                        ExecuteSqlDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExecuteSqlDatabaseToolsConnectionRequest,
                                ExecuteSqlDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<ExecuteSqlDatabaseToolsConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExecuteSqlDatabaseToolsConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExecuteSqlDatabaseToolsConnectionRequest,
                    ExecuteSqlDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCredentialResponse> getCredential(
            GetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCredentialRequest, GetCredentialResponse>
                    handler) {
        LOG.trace("Called async getCredential");
        final GetCredentialRequest interceptedRequest =
                GetCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime", "GetCredential", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCredentialResponse>
                transformer =
                        GetCredentialConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCredentialRequest, GetCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCredentialRequest, GetCredentialResponse>,
                        java.util.concurrent.Future<GetCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCredentialRequest, GetCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCredentialExecuteGranteeResponse>
            getCredentialExecuteGrantee(
                    GetCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCredentialExecuteGranteeRequest,
                                    GetCredentialExecuteGranteeResponse>
                            handler) {
        LOG.trace("Called async getCredentialExecuteGrantee");
        final GetCredentialExecuteGranteeRequest interceptedRequest =
                GetCredentialExecuteGranteeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialExecuteGranteeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialExecuteGrantee",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCredentialExecuteGranteeResponse>
                transformer =
                        GetCredentialExecuteGranteeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCredentialExecuteGranteeRequest, GetCredentialExecuteGranteeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCredentialExecuteGranteeRequest,
                                GetCredentialExecuteGranteeResponse>,
                        java.util.concurrent.Future<GetCredentialExecuteGranteeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCredentialExecuteGranteeRequest, GetCredentialExecuteGranteeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCredentialPublicSynonymResponse>
            getCredentialPublicSynonym(
                    GetCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCredentialPublicSynonymRequest,
                                    GetCredentialPublicSynonymResponse>
                            handler) {
        LOG.trace("Called async getCredentialPublicSynonym");
        final GetCredentialPublicSynonymRequest interceptedRequest =
                GetCredentialPublicSynonymConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCredentialPublicSynonymConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialPublicSynonym",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCredentialPublicSynonymResponse>
                transformer =
                        GetCredentialPublicSynonymConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCredentialPublicSynonymRequest, GetCredentialPublicSynonymResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCredentialPublicSynonymRequest,
                                GetCredentialPublicSynonymResponse>,
                        java.util.concurrent.Future<GetCredentialPublicSynonymResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCredentialPublicSynonymRequest, GetCredentialPublicSynonymResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfigContent");
        final GetDatabaseToolsDatabaseApiGatewayConfigContentRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigContent",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfigGlobal");
        final GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfigPool");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPropertySetResponse> getPropertySet(
            GetPropertySetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPropertySetRequest, GetPropertySetResponse>
                    handler) {
        LOG.trace("Called async getPropertySet");
        final GetPropertySetRequest interceptedRequest =
                GetPropertySetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPropertySetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetPropertySet",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPropertySetResponse>
                transformer =
                        GetPropertySetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPropertySetRequest, GetPropertySetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPropertySetRequest, GetPropertySetResponse>,
                        java.util.concurrent.Future<GetPropertySetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPropertySetRequest, GetPropertySetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserCredentialResponse> getUserCredential(
            GetUserCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserCredentialRequest, GetUserCredentialResponse>
                    handler) {
        LOG.trace("Called async getUserCredential");
        final GetUserCredentialRequest interceptedRequest =
                GetUserCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "GetUserCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserCredentialResponse>
                transformer =
                        GetUserCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUserCredentialRequest, GetUserCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserCredentialRequest, GetUserCredentialResponse>,
                        java.util.concurrent.Future<GetUserCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserCredentialRequest, GetUserCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DatabaseToolsRuntime",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "");
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
    public java.util.concurrent.Future<ListCredentialExecuteGranteesResponse>
            listCredentialExecuteGrantees(
                    ListCredentialExecuteGranteesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCredentialExecuteGranteesRequest,
                                    ListCredentialExecuteGranteesResponse>
                            handler) {
        LOG.trace("Called async listCredentialExecuteGrantees");
        final ListCredentialExecuteGranteesRequest interceptedRequest =
                ListCredentialExecuteGranteesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialExecuteGranteesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialExecuteGrantees",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCredentialExecuteGranteesResponse>
                transformer =
                        ListCredentialExecuteGranteesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCredentialExecuteGranteesRequest, ListCredentialExecuteGranteesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCredentialExecuteGranteesRequest,
                                ListCredentialExecuteGranteesResponse>,
                        java.util.concurrent.Future<ListCredentialExecuteGranteesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCredentialExecuteGranteesRequest, ListCredentialExecuteGranteesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCredentialPublicSynonymsResponse>
            listCredentialPublicSynonyms(
                    ListCredentialPublicSynonymsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCredentialPublicSynonymsRequest,
                                    ListCredentialPublicSynonymsResponse>
                            handler) {
        LOG.trace("Called async listCredentialPublicSynonyms");
        final ListCredentialPublicSynonymsRequest interceptedRequest =
                ListCredentialPublicSynonymsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialPublicSynonymsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialPublicSynonyms",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCredentialPublicSynonymsResponse>
                transformer =
                        ListCredentialPublicSynonymsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCredentialPublicSynonymsRequest, ListCredentialPublicSynonymsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCredentialPublicSynonymsRequest,
                                ListCredentialPublicSynonymsResponse>,
                        java.util.concurrent.Future<ListCredentialPublicSynonymsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCredentialPublicSynonymsRequest, ListCredentialPublicSynonymsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCredentialsResponse> listCredentials(
            ListCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCredentialsRequest, ListCredentialsResponse>
                    handler) {
        LOG.trace("Called async listCredentials");
        final ListCredentialsRequest interceptedRequest =
                ListCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCredentialsResponse>
                transformer =
                        ListCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCredentialsRequest, ListCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCredentialsRequest, ListCredentialsResponse>,
                        java.util.concurrent.Future<ListCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCredentialsRequest, ListCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties");
        final ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest
                interceptedRequest =
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter
                                .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                                ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>,
                        java.util.concurrent.Future<
                                ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>,
                        java.util.concurrent.Future<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>,
                        java.util.concurrent.Future<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsDatabaseApiGatewayConfigPools");
        final ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPools",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>,
                        java.util.concurrent.Future<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUserCredentialsResponse> listUserCredentials(
            ListUserCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserCredentialsRequest, ListUserCredentialsResponse>
                    handler) {
        LOG.trace("Called async listUserCredentials");
        final ListUserCredentialsRequest interceptedRequest =
                ListUserCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ListUserCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUserCredentialsResponse>
                transformer =
                        ListUserCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserCredentialsRequest, ListUserCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserCredentialsRequest, ListUserCredentialsResponse>,
                        java.util.concurrent.Future<ListUserCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserCredentialsRequest, ListUserCredentialsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "");
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "");
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "");
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
    public java.util.concurrent.Future<UpdateCredentialResponse> updateCredential(
            UpdateCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCredentialRequest, UpdateCredentialResponse>
                    handler) {
        LOG.trace("Called async updateCredential");
        final UpdateCredentialRequest interceptedRequest =
                UpdateCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCredentialResponse>
                transformer =
                        UpdateCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCredentialRequest, UpdateCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCredentialRequest, UpdateCredentialResponse>,
                        java.util.concurrent.Future<UpdateCredentialResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCredentialRequest, UpdateCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsDatabaseApiGatewayConfigGlobal");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>,
                        java.util.concurrent.Future<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigGlobalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsDatabaseApiGatewayConfigPool");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPool",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>,
                        java.util.concurrent.Future<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>,
                        java.util.concurrent.Future<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                        .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>,
                        java.util.concurrent.Future<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePropertySetResponse> updatePropertySet(
            UpdatePropertySetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePropertySetRequest, UpdatePropertySetResponse>
                    handler) {
        LOG.trace("Called async updatePropertySet");
        final UpdatePropertySetRequest interceptedRequest =
                UpdatePropertySetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePropertySetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "UpdatePropertySet",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePropertySetResponse>
                transformer =
                        UpdatePropertySetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePropertySetRequest, UpdatePropertySetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePropertySetRequest, UpdatePropertySetResponse>,
                        java.util.concurrent.Future<UpdatePropertySetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePropertySetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePropertySetRequest, UpdatePropertySetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsConnectionResponse>
            validateDatabaseToolsConnection(
                    ValidateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsConnectionRequest,
                                    ValidateDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async validateDatabaseToolsConnection");
        final ValidateDatabaseToolsConnectionRequest interceptedRequest =
                ValidateDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateDatabaseToolsConnectionResponse>
                transformer =
                        ValidateDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateDatabaseToolsConnectionRequest,
                        ValidateDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateDatabaseToolsConnectionRequest,
                                ValidateDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<ValidateDatabaseToolsConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getValidateDatabaseToolsConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateDatabaseToolsConnectionRequest,
                    ValidateDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsIdentityCredentialResponse>
            validateDatabaseToolsIdentityCredential(
                    ValidateDatabaseToolsIdentityCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsIdentityCredentialRequest,
                                    ValidateDatabaseToolsIdentityCredentialResponse>
                            handler) {
        LOG.trace("Called async validateDatabaseToolsIdentityCredential");
        final ValidateDatabaseToolsIdentityCredentialRequest interceptedRequest =
                ValidateDatabaseToolsIdentityCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDatabaseToolsIdentityCredentialConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsIdentityCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateDatabaseToolsIdentityCredentialResponse>
                transformer =
                        ValidateDatabaseToolsIdentityCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateDatabaseToolsIdentityCredentialRequest,
                        ValidateDatabaseToolsIdentityCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateDatabaseToolsIdentityCredentialRequest,
                                ValidateDatabaseToolsIdentityCredentialResponse>,
                        java.util.concurrent.Future<
                                ValidateDatabaseToolsIdentityCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getValidateDatabaseToolsIdentityCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateDatabaseToolsIdentityCredentialRequest,
                    ValidateDatabaseToolsIdentityCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
