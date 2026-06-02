/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.databasetools.internal.http.*;
import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for DatabaseTools service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class DatabaseToolsAsyncClient implements DatabaseToolsAsync {
    /**
     * Service instance for DatabaseTools.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsAsyncClient.class);

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
    public DatabaseToolsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
    public DatabaseToolsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseToolsAsyncClient> {
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
        public DatabaseToolsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DatabaseToolsAsyncClient(
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
    public java.util.concurrent.Future<AddDatabaseToolsConnectionLockResponse>
            addDatabaseToolsConnectionLock(
                    AddDatabaseToolsConnectionLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsConnectionLockRequest,
                                    AddDatabaseToolsConnectionLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsConnectionLock");
        final AddDatabaseToolsConnectionLockRequest interceptedRequest =
                AddDatabaseToolsConnectionLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsConnectionLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsConnectionLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsConnectionLockResponse>
                transformer =
                        AddDatabaseToolsConnectionLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsConnectionLockRequest,
                        AddDatabaseToolsConnectionLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsConnectionLockRequest,
                                AddDatabaseToolsConnectionLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsConnectionLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsConnectionLockRequest, AddDatabaseToolsConnectionLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
            addDatabaseToolsDatabaseApiGatewayConfigLock(
                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                    AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsDatabaseApiGatewayConfigLock");
        final AddDatabaseToolsDatabaseApiGatewayConfigLockRequest interceptedRequest =
                AddDatabaseToolsDatabaseApiGatewayConfigLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsDatabaseApiGatewayConfigLockConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsDatabaseApiGatewayConfigLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                transformer =
                        AddDatabaseToolsDatabaseApiGatewayConfigLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                        AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>,
                        java.util.concurrent.Future<
                                AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                    AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsIdentityLockResponse>
            addDatabaseToolsIdentityLock(
                    AddDatabaseToolsIdentityLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsIdentityLockRequest,
                                    AddDatabaseToolsIdentityLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsIdentityLock");
        final AddDatabaseToolsIdentityLockRequest interceptedRequest =
                AddDatabaseToolsIdentityLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsIdentityLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsIdentityLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsIdentityLockResponse>
                transformer =
                        AddDatabaseToolsIdentityLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsIdentityLockRequest, AddDatabaseToolsIdentityLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsIdentityLockRequest,
                                AddDatabaseToolsIdentityLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsIdentityLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsIdentityLockRequest, AddDatabaseToolsIdentityLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsMcpServerLockResponse>
            addDatabaseToolsMcpServerLock(
                    AddDatabaseToolsMcpServerLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsMcpServerLockRequest,
                                    AddDatabaseToolsMcpServerLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsMcpServerLock");
        final AddDatabaseToolsMcpServerLockRequest interceptedRequest =
                AddDatabaseToolsMcpServerLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsMcpServerLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsMcpServerLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsMcpServerLockResponse>
                transformer =
                        AddDatabaseToolsMcpServerLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsMcpServerLockRequest, AddDatabaseToolsMcpServerLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsMcpServerLockRequest,
                                AddDatabaseToolsMcpServerLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsMcpServerLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsMcpServerLockRequest, AddDatabaseToolsMcpServerLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsMcpToolsetLockResponse>
            addDatabaseToolsMcpToolsetLock(
                    AddDatabaseToolsMcpToolsetLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsMcpToolsetLockRequest,
                                    AddDatabaseToolsMcpToolsetLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsMcpToolsetLock");
        final AddDatabaseToolsMcpToolsetLockRequest interceptedRequest =
                AddDatabaseToolsMcpToolsetLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsMcpToolsetLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsMcpToolsetLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsMcpToolsetLockResponse>
                transformer =
                        AddDatabaseToolsMcpToolsetLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsMcpToolsetLockRequest,
                        AddDatabaseToolsMcpToolsetLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsMcpToolsetLockRequest,
                                AddDatabaseToolsMcpToolsetLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsMcpToolsetLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsMcpToolsetLockRequest, AddDatabaseToolsMcpToolsetLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsPrivateEndpointLockResponse>
            addDatabaseToolsPrivateEndpointLock(
                    AddDatabaseToolsPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsPrivateEndpointLockRequest,
                                    AddDatabaseToolsPrivateEndpointLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsPrivateEndpointLock");
        final AddDatabaseToolsPrivateEndpointLockRequest interceptedRequest =
                AddDatabaseToolsPrivateEndpointLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsPrivateEndpointLockConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsPrivateEndpointLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsPrivateEndpointLockResponse>
                transformer =
                        AddDatabaseToolsPrivateEndpointLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsPrivateEndpointLockRequest,
                        AddDatabaseToolsPrivateEndpointLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsPrivateEndpointLockRequest,
                                AddDatabaseToolsPrivateEndpointLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsPrivateEndpointLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsPrivateEndpointLockRequest,
                    AddDatabaseToolsPrivateEndpointLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDatabaseToolsSqlReportLockResponse>
            addDatabaseToolsSqlReportLock(
                    AddDatabaseToolsSqlReportLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsSqlReportLockRequest,
                                    AddDatabaseToolsSqlReportLockResponse>
                            handler) {
        LOG.trace("Called async addDatabaseToolsSqlReportLock");
        final AddDatabaseToolsSqlReportLockRequest interceptedRequest =
                AddDatabaseToolsSqlReportLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDatabaseToolsSqlReportLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "AddDatabaseToolsSqlReportLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDatabaseToolsSqlReportLockResponse>
                transformer =
                        AddDatabaseToolsSqlReportLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDatabaseToolsSqlReportLockRequest, AddDatabaseToolsSqlReportLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDatabaseToolsSqlReportLockRequest,
                                AddDatabaseToolsSqlReportLockResponse>,
                        java.util.concurrent.Future<AddDatabaseToolsSqlReportLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDatabaseToolsSqlReportLockRequest, AddDatabaseToolsSqlReportLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CascadingDeleteDatabaseToolsMcpServerResponse>
            cascadingDeleteDatabaseToolsMcpServer(
                    CascadingDeleteDatabaseToolsMcpServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteDatabaseToolsMcpServerRequest,
                                    CascadingDeleteDatabaseToolsMcpServerResponse>
                            handler) {
        LOG.trace("Called async cascadingDeleteDatabaseToolsMcpServer");
        final CascadingDeleteDatabaseToolsMcpServerRequest interceptedRequest =
                CascadingDeleteDatabaseToolsMcpServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CascadingDeleteDatabaseToolsMcpServerConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CascadingDeleteDatabaseToolsMcpServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CascadingDeleteDatabaseToolsMcpServerResponse>
                transformer =
                        CascadingDeleteDatabaseToolsMcpServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CascadingDeleteDatabaseToolsMcpServerRequest,
                        CascadingDeleteDatabaseToolsMcpServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CascadingDeleteDatabaseToolsMcpServerRequest,
                                CascadingDeleteDatabaseToolsMcpServerResponse>,
                        java.util.concurrent.Future<CascadingDeleteDatabaseToolsMcpServerResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CascadingDeleteDatabaseToolsMcpServerRequest,
                    CascadingDeleteDatabaseToolsMcpServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsConnectionCompartmentResponse>
            changeDatabaseToolsConnectionCompartment(
                    ChangeDatabaseToolsConnectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsConnectionCompartmentRequest,
                                    ChangeDatabaseToolsConnectionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsConnectionCompartment");
        final ChangeDatabaseToolsConnectionCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsConnectionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsConnectionCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsConnectionCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseToolsConnectionCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsConnectionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsConnectionCompartmentRequest,
                        ChangeDatabaseToolsConnectionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsConnectionCompartmentRequest,
                                ChangeDatabaseToolsConnectionCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsConnectionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsConnectionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsConnectionCompartmentRequest,
                    ChangeDatabaseToolsConnectionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
            changeDatabaseToolsDatabaseApiGatewayConfigCompartment(
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest,
                                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsDatabaseApiGatewayConfigCompartment");
        final ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsDatabaseApiGatewayConfigCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest,
                        ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest,
                                ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest,
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsIdentityCompartmentResponse>
            changeDatabaseToolsIdentityCompartment(
                    ChangeDatabaseToolsIdentityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsIdentityCompartmentRequest,
                                    ChangeDatabaseToolsIdentityCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsIdentityCompartment");
        final ChangeDatabaseToolsIdentityCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsIdentityCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsIdentityCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsIdentityCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseToolsIdentityCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsIdentityCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsIdentityCompartmentRequest,
                        ChangeDatabaseToolsIdentityCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsIdentityCompartmentRequest,
                                ChangeDatabaseToolsIdentityCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDatabaseToolsIdentityCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsIdentityCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsIdentityCompartmentRequest,
                    ChangeDatabaseToolsIdentityCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsMcpServerCompartmentResponse>
            changeDatabaseToolsMcpServerCompartment(
                    ChangeDatabaseToolsMcpServerCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsMcpServerCompartmentRequest,
                                    ChangeDatabaseToolsMcpServerCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsMcpServerCompartment");
        final ChangeDatabaseToolsMcpServerCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsMcpServerCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsMcpServerCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsMcpServerCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseToolsMcpServerCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsMcpServerCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsMcpServerCompartmentRequest,
                        ChangeDatabaseToolsMcpServerCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsMcpServerCompartmentRequest,
                                ChangeDatabaseToolsMcpServerCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsMcpServerCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsMcpServerCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsMcpServerCompartmentRequest,
                    ChangeDatabaseToolsMcpServerCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsMcpToolsetCompartmentResponse>
            changeDatabaseToolsMcpToolsetCompartment(
                    ChangeDatabaseToolsMcpToolsetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsMcpToolsetCompartmentRequest,
                                    ChangeDatabaseToolsMcpToolsetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsMcpToolsetCompartment");
        final ChangeDatabaseToolsMcpToolsetCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsMcpToolsetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsMcpToolsetCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsMcpToolsetCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseToolsMcpToolsetCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsMcpToolsetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsMcpToolsetCompartmentRequest,
                        ChangeDatabaseToolsMcpToolsetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsMcpToolsetCompartmentRequest,
                                ChangeDatabaseToolsMcpToolsetCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsMcpToolsetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsMcpToolsetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsMcpToolsetCompartmentRequest,
                    ChangeDatabaseToolsMcpToolsetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
            changeDatabaseToolsPrivateEndpointCompartment(
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                                    ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsPrivateEndpointCompartment");
        final ChangeDatabaseToolsPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsPrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsPrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsPrivateEndpointCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                        ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                                ChangeDatabaseToolsPrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsPrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsPrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                    ChangeDatabaseToolsPrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseToolsSqlReportCompartmentResponse>
            changeDatabaseToolsSqlReportCompartment(
                    ChangeDatabaseToolsSqlReportCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsSqlReportCompartmentRequest,
                                    ChangeDatabaseToolsSqlReportCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDatabaseToolsSqlReportCompartment");
        final ChangeDatabaseToolsSqlReportCompartmentRequest interceptedRequest =
                ChangeDatabaseToolsSqlReportCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseToolsSqlReportCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ChangeDatabaseToolsSqlReportCompartment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseToolsSqlReportCompartmentResponse>
                transformer =
                        ChangeDatabaseToolsSqlReportCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseToolsSqlReportCompartmentRequest,
                        ChangeDatabaseToolsSqlReportCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseToolsSqlReportCompartmentRequest,
                                ChangeDatabaseToolsSqlReportCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDatabaseToolsSqlReportCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDatabaseToolsSqlReportCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseToolsSqlReportCompartmentRequest,
                    ChangeDatabaseToolsSqlReportCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsConnectionResponse>
            createDatabaseToolsConnection(
                    CreateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsConnectionRequest,
                                    CreateDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsConnection");
        final CreateDatabaseToolsConnectionRequest interceptedRequest =
                CreateDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsConnectionResponse>
                transformer =
                        CreateDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsConnectionRequest, CreateDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsConnectionRequest,
                                CreateDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsConnectionRequest, CreateDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
            createDatabaseToolsDatabaseApiGatewayConfig(
                    CreateDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsDatabaseApiGatewayConfig");
        final CreateDatabaseToolsDatabaseApiGatewayConfigRequest interceptedRequest =
                CreateDatabaseToolsDatabaseApiGatewayConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsDatabaseApiGatewayConfigConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsDatabaseApiGatewayConfig",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
                transformer =
                        CreateDatabaseToolsDatabaseApiGatewayConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsDatabaseApiGatewayConfigRequest,
                        CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                CreateDatabaseToolsDatabaseApiGatewayConfigResponse>,
                        java.util.concurrent.Future<
                                CreateDatabaseToolsDatabaseApiGatewayConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getCreateDatabaseToolsDatabaseApiGatewayConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsDatabaseApiGatewayConfigRequest,
                    CreateDatabaseToolsDatabaseApiGatewayConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsIdentityResponse>
            createDatabaseToolsIdentity(
                    CreateDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsIdentityRequest,
                                    CreateDatabaseToolsIdentityResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsIdentity");
        final CreateDatabaseToolsIdentityRequest interceptedRequest =
                CreateDatabaseToolsIdentityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsIdentityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsIdentity",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsIdentityResponse>
                transformer =
                        CreateDatabaseToolsIdentityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsIdentityRequest, CreateDatabaseToolsIdentityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsIdentityRequest,
                                CreateDatabaseToolsIdentityResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsIdentityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsIdentityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsIdentityRequest, CreateDatabaseToolsIdentityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsMcpServerResponse>
            createDatabaseToolsMcpServer(
                    CreateDatabaseToolsMcpServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsMcpServerRequest,
                                    CreateDatabaseToolsMcpServerResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsMcpServer");
        final CreateDatabaseToolsMcpServerRequest interceptedRequest =
                CreateDatabaseToolsMcpServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsMcpServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsMcpServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsMcpServerResponse>
                transformer =
                        CreateDatabaseToolsMcpServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsMcpServerRequest, CreateDatabaseToolsMcpServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsMcpServerRequest,
                                CreateDatabaseToolsMcpServerResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsMcpServerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsMcpServerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsMcpServerRequest, CreateDatabaseToolsMcpServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsMcpToolsetResponse>
            createDatabaseToolsMcpToolset(
                    CreateDatabaseToolsMcpToolsetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsMcpToolsetRequest,
                                    CreateDatabaseToolsMcpToolsetResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsMcpToolset");
        final CreateDatabaseToolsMcpToolsetRequest interceptedRequest =
                CreateDatabaseToolsMcpToolsetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsMcpToolsetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsMcpToolset",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsMcpToolsetResponse>
                transformer =
                        CreateDatabaseToolsMcpToolsetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsMcpToolsetRequest, CreateDatabaseToolsMcpToolsetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsMcpToolsetRequest,
                                CreateDatabaseToolsMcpToolsetResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsMcpToolsetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsMcpToolsetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsMcpToolsetRequest, CreateDatabaseToolsMcpToolsetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsPrivateEndpointResponse>
            createDatabaseToolsPrivateEndpoint(
                    CreateDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsPrivateEndpointRequest,
                                    CreateDatabaseToolsPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsPrivateEndpoint");
        final CreateDatabaseToolsPrivateEndpointRequest interceptedRequest =
                CreateDatabaseToolsPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsPrivateEndpointResponse>
                transformer =
                        CreateDatabaseToolsPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsPrivateEndpointRequest,
                        CreateDatabaseToolsPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsPrivateEndpointRequest,
                                CreateDatabaseToolsPrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsPrivateEndpointRequest,
                    CreateDatabaseToolsPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsSqlReportResponse>
            createDatabaseToolsSqlReport(
                    CreateDatabaseToolsSqlReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsSqlReportRequest,
                                    CreateDatabaseToolsSqlReportResponse>
                            handler) {
        LOG.trace("Called async createDatabaseToolsSqlReport");
        final CreateDatabaseToolsSqlReportRequest interceptedRequest =
                CreateDatabaseToolsSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDatabaseToolsSqlReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "CreateDatabaseToolsSqlReport",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDatabaseToolsSqlReportResponse>
                transformer =
                        CreateDatabaseToolsSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDatabaseToolsSqlReportRequest, CreateDatabaseToolsSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDatabaseToolsSqlReportRequest,
                                CreateDatabaseToolsSqlReportResponse>,
                        java.util.concurrent.Future<CreateDatabaseToolsSqlReportResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDatabaseToolsSqlReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDatabaseToolsSqlReportRequest, CreateDatabaseToolsSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsConnectionResponse>
            deleteDatabaseToolsConnection(
                    DeleteDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsConnectionRequest,
                                    DeleteDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsConnection");
        final DeleteDatabaseToolsConnectionRequest interceptedRequest =
                DeleteDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsConnectionResponse>
                transformer =
                        DeleteDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsConnectionRequest, DeleteDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsConnectionRequest,
                                DeleteDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsConnectionRequest, DeleteDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfig(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsDatabaseApiGatewayConfig");
        final DeleteDatabaseToolsDatabaseApiGatewayConfigRequest interceptedRequest =
                DeleteDatabaseToolsDatabaseApiGatewayConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsDatabaseApiGatewayConfigConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfig",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
                transformer =
                        DeleteDatabaseToolsDatabaseApiGatewayConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsDatabaseApiGatewayConfigRequest,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigRequest,
                                DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>,
                        java.util.concurrent.Future<
                                DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigRequest,
                    DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsIdentityResponse>
            deleteDatabaseToolsIdentity(
                    DeleteDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsIdentityRequest,
                                    DeleteDatabaseToolsIdentityResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsIdentity");
        final DeleteDatabaseToolsIdentityRequest interceptedRequest =
                DeleteDatabaseToolsIdentityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsIdentityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsIdentity",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsIdentityResponse>
                transformer =
                        DeleteDatabaseToolsIdentityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsIdentityRequest, DeleteDatabaseToolsIdentityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsIdentityRequest,
                                DeleteDatabaseToolsIdentityResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsIdentityResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsIdentityRequest, DeleteDatabaseToolsIdentityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsMcpServerResponse>
            deleteDatabaseToolsMcpServer(
                    DeleteDatabaseToolsMcpServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsMcpServerRequest,
                                    DeleteDatabaseToolsMcpServerResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsMcpServer");
        final DeleteDatabaseToolsMcpServerRequest interceptedRequest =
                DeleteDatabaseToolsMcpServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsMcpServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsMcpServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsMcpServerResponse>
                transformer =
                        DeleteDatabaseToolsMcpServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsMcpServerRequest, DeleteDatabaseToolsMcpServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsMcpServerRequest,
                                DeleteDatabaseToolsMcpServerResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsMcpServerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsMcpServerRequest, DeleteDatabaseToolsMcpServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsMcpToolsetResponse>
            deleteDatabaseToolsMcpToolset(
                    DeleteDatabaseToolsMcpToolsetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsMcpToolsetRequest,
                                    DeleteDatabaseToolsMcpToolsetResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsMcpToolset");
        final DeleteDatabaseToolsMcpToolsetRequest interceptedRequest =
                DeleteDatabaseToolsMcpToolsetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsMcpToolsetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsMcpToolset",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsMcpToolsetResponse>
                transformer =
                        DeleteDatabaseToolsMcpToolsetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsMcpToolsetRequest, DeleteDatabaseToolsMcpToolsetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsMcpToolsetRequest,
                                DeleteDatabaseToolsMcpToolsetResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsMcpToolsetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsMcpToolsetRequest, DeleteDatabaseToolsMcpToolsetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsPrivateEndpointResponse>
            deleteDatabaseToolsPrivateEndpoint(
                    DeleteDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsPrivateEndpointRequest,
                                    DeleteDatabaseToolsPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsPrivateEndpoint");
        final DeleteDatabaseToolsPrivateEndpointRequest interceptedRequest =
                DeleteDatabaseToolsPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsPrivateEndpointResponse>
                transformer =
                        DeleteDatabaseToolsPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsPrivateEndpointRequest,
                        DeleteDatabaseToolsPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsPrivateEndpointRequest,
                                DeleteDatabaseToolsPrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsPrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsPrivateEndpointRequest,
                    DeleteDatabaseToolsPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsSqlReportResponse>
            deleteDatabaseToolsSqlReport(
                    DeleteDatabaseToolsSqlReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsSqlReportRequest,
                                    DeleteDatabaseToolsSqlReportResponse>
                            handler) {
        LOG.trace("Called async deleteDatabaseToolsSqlReport");
        final DeleteDatabaseToolsSqlReportRequest interceptedRequest =
                DeleteDatabaseToolsSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDatabaseToolsSqlReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "DeleteDatabaseToolsSqlReport",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDatabaseToolsSqlReportResponse>
                transformer =
                        DeleteDatabaseToolsSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDatabaseToolsSqlReportRequest, DeleteDatabaseToolsSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDatabaseToolsSqlReportRequest,
                                DeleteDatabaseToolsSqlReportResponse>,
                        java.util.concurrent.Future<DeleteDatabaseToolsSqlReportResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDatabaseToolsSqlReportRequest, DeleteDatabaseToolsSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsConnectionResponse>
            getDatabaseToolsConnection(
                    GetDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsConnectionRequest,
                                    GetDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsConnection");
        final GetDatabaseToolsConnectionRequest interceptedRequest =
                GetDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsConnectionResponse>
                transformer =
                        GetDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsConnectionRequest, GetDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsConnectionRequest,
                                GetDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsConnectionRequest, GetDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigResponse>
            getDatabaseToolsDatabaseApiGatewayConfig(
                    GetDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsDatabaseApiGatewayConfig");
        final GetDatabaseToolsDatabaseApiGatewayConfigRequest interceptedRequest =
                GetDatabaseToolsDatabaseApiGatewayConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsDatabaseApiGatewayConfigConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsDatabaseApiGatewayConfig",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsDatabaseApiGatewayConfigResponse>
                transformer =
                        GetDatabaseToolsDatabaseApiGatewayConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsDatabaseApiGatewayConfigRequest,
                        GetDatabaseToolsDatabaseApiGatewayConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsDatabaseApiGatewayConfigRequest,
                                GetDatabaseToolsDatabaseApiGatewayConfigResponse>,
                        java.util.concurrent.Future<
                                GetDatabaseToolsDatabaseApiGatewayConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsDatabaseApiGatewayConfigRequest,
                    GetDatabaseToolsDatabaseApiGatewayConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsEndpointServiceResponse>
            getDatabaseToolsEndpointService(
                    GetDatabaseToolsEndpointServiceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsEndpointServiceRequest,
                                    GetDatabaseToolsEndpointServiceResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsEndpointService");
        final GetDatabaseToolsEndpointServiceRequest interceptedRequest =
                GetDatabaseToolsEndpointServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsEndpointServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsEndpointService",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsEndpointServiceResponse>
                transformer =
                        GetDatabaseToolsEndpointServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsEndpointServiceRequest,
                        GetDatabaseToolsEndpointServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsEndpointServiceRequest,
                                GetDatabaseToolsEndpointServiceResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsEndpointServiceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsEndpointServiceRequest,
                    GetDatabaseToolsEndpointServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsIdentityResponse> getDatabaseToolsIdentity(
            GetDatabaseToolsIdentityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>
                    handler) {
        LOG.trace("Called async getDatabaseToolsIdentity");
        final GetDatabaseToolsIdentityRequest interceptedRequest =
                GetDatabaseToolsIdentityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsIdentityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsIdentity",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsIdentityResponse>
                transformer =
                        GetDatabaseToolsIdentityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsIdentityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsMcpServerResponse> getDatabaseToolsMcpServer(
            GetDatabaseToolsMcpServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsMcpServerRequest, GetDatabaseToolsMcpServerResponse>
                    handler) {
        LOG.trace("Called async getDatabaseToolsMcpServer");
        final GetDatabaseToolsMcpServerRequest interceptedRequest =
                GetDatabaseToolsMcpServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsMcpServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsMcpServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsMcpServerResponse>
                transformer =
                        GetDatabaseToolsMcpServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsMcpServerRequest, GetDatabaseToolsMcpServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsMcpServerRequest,
                                GetDatabaseToolsMcpServerResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsMcpServerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsMcpServerRequest, GetDatabaseToolsMcpServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsMcpToolsetResponse>
            getDatabaseToolsMcpToolset(
                    GetDatabaseToolsMcpToolsetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsMcpToolsetRequest,
                                    GetDatabaseToolsMcpToolsetResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsMcpToolset");
        final GetDatabaseToolsMcpToolsetRequest interceptedRequest =
                GetDatabaseToolsMcpToolsetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsMcpToolsetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsMcpToolset",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsMcpToolsetResponse>
                transformer =
                        GetDatabaseToolsMcpToolsetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsMcpToolsetRequest, GetDatabaseToolsMcpToolsetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsMcpToolsetRequest,
                                GetDatabaseToolsMcpToolsetResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsMcpToolsetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsMcpToolsetRequest, GetDatabaseToolsMcpToolsetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsPrivateEndpointResponse>
            getDatabaseToolsPrivateEndpoint(
                    GetDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsPrivateEndpointRequest,
                                    GetDatabaseToolsPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDatabaseToolsPrivateEndpoint");
        final GetDatabaseToolsPrivateEndpointRequest interceptedRequest =
                GetDatabaseToolsPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsPrivateEndpointResponse>
                transformer =
                        GetDatabaseToolsPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsPrivateEndpointRequest,
                        GetDatabaseToolsPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsPrivateEndpointRequest,
                                GetDatabaseToolsPrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsPrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsPrivateEndpointRequest,
                    GetDatabaseToolsPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsSqlReportResponse> getDatabaseToolsSqlReport(
            GetDatabaseToolsSqlReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsSqlReportRequest, GetDatabaseToolsSqlReportResponse>
                    handler) {
        LOG.trace("Called async getDatabaseToolsSqlReport");
        final GetDatabaseToolsSqlReportRequest interceptedRequest =
                GetDatabaseToolsSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseToolsSqlReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "GetDatabaseToolsSqlReport",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDatabaseToolsSqlReportResponse>
                transformer =
                        GetDatabaseToolsSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseToolsSqlReportRequest, GetDatabaseToolsSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseToolsSqlReportRequest,
                                GetDatabaseToolsSqlReportResponse>,
                        java.util.concurrent.Future<GetDatabaseToolsSqlReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseToolsSqlReportRequest, GetDatabaseToolsSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DatabaseTools", "GetWorkRequest", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<ListDatabaseToolsConnectionsResponse>
            listDatabaseToolsConnections(
                    ListDatabaseToolsConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsConnectionsRequest,
                                    ListDatabaseToolsConnectionsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsConnections");
        final ListDatabaseToolsConnectionsRequest interceptedRequest =
                ListDatabaseToolsConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsConnections",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsConnectionsResponse>
                transformer =
                        ListDatabaseToolsConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsConnectionsRequest, ListDatabaseToolsConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsConnectionsRequest,
                                ListDatabaseToolsConnectionsResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsConnectionsRequest, ListDatabaseToolsConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigs(
                    ListDatabaseToolsDatabaseApiGatewayConfigsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsDatabaseApiGatewayConfigs");
        final ListDatabaseToolsDatabaseApiGatewayConfigsRequest interceptedRequest =
                ListDatabaseToolsDatabaseApiGatewayConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsDatabaseApiGatewayConfigsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsDatabaseApiGatewayConfigs",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
                transformer =
                        ListDatabaseToolsDatabaseApiGatewayConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsDatabaseApiGatewayConfigsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsDatabaseApiGatewayConfigsRequest,
                                ListDatabaseToolsDatabaseApiGatewayConfigsResponse>,
                        java.util.concurrent.Future<
                                ListDatabaseToolsDatabaseApiGatewayConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsDatabaseApiGatewayConfigsRequest,
                    ListDatabaseToolsDatabaseApiGatewayConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsEndpointServicesResponse>
            listDatabaseToolsEndpointServices(
                    ListDatabaseToolsEndpointServicesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsEndpointServicesRequest,
                                    ListDatabaseToolsEndpointServicesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsEndpointServices");
        final ListDatabaseToolsEndpointServicesRequest interceptedRequest =
                ListDatabaseToolsEndpointServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsEndpointServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsEndpointServices",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsEndpointServicesResponse>
                transformer =
                        ListDatabaseToolsEndpointServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsEndpointServicesRequest,
                        ListDatabaseToolsEndpointServicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsEndpointServicesRequest,
                                ListDatabaseToolsEndpointServicesResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsEndpointServicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsEndpointServicesRequest,
                    ListDatabaseToolsEndpointServicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsIdentitiesResponse>
            listDatabaseToolsIdentities(
                    ListDatabaseToolsIdentitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsIdentitiesRequest,
                                    ListDatabaseToolsIdentitiesResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsIdentities");
        final ListDatabaseToolsIdentitiesRequest interceptedRequest =
                ListDatabaseToolsIdentitiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsIdentitiesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsIdentities",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsIdentitiesResponse>
                transformer =
                        ListDatabaseToolsIdentitiesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsIdentitiesRequest, ListDatabaseToolsIdentitiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsIdentitiesRequest,
                                ListDatabaseToolsIdentitiesResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsIdentitiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsIdentitiesRequest, ListDatabaseToolsIdentitiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsMcpServersResponse>
            listDatabaseToolsMcpServers(
                    ListDatabaseToolsMcpServersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsMcpServersRequest,
                                    ListDatabaseToolsMcpServersResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsMcpServers");
        final ListDatabaseToolsMcpServersRequest interceptedRequest =
                ListDatabaseToolsMcpServersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsMcpServersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsMcpServers",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsMcpServersResponse>
                transformer =
                        ListDatabaseToolsMcpServersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsMcpServersRequest, ListDatabaseToolsMcpServersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsMcpServersRequest,
                                ListDatabaseToolsMcpServersResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsMcpServersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsMcpServersRequest, ListDatabaseToolsMcpServersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsMcpToolsetVersionsResponse>
            listDatabaseToolsMcpToolsetVersions(
                    ListDatabaseToolsMcpToolsetVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsMcpToolsetVersionsRequest,
                                    ListDatabaseToolsMcpToolsetVersionsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsMcpToolsetVersions");
        final ListDatabaseToolsMcpToolsetVersionsRequest interceptedRequest =
                ListDatabaseToolsMcpToolsetVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsMcpToolsetVersionsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsMcpToolsetVersions",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsMcpToolsetVersionsResponse>
                transformer =
                        ListDatabaseToolsMcpToolsetVersionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsMcpToolsetVersionsRequest,
                        ListDatabaseToolsMcpToolsetVersionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsMcpToolsetVersionsRequest,
                                ListDatabaseToolsMcpToolsetVersionsResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsMcpToolsetVersionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsMcpToolsetVersionsRequest,
                    ListDatabaseToolsMcpToolsetVersionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsMcpToolsetsResponse>
            listDatabaseToolsMcpToolsets(
                    ListDatabaseToolsMcpToolsetsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsMcpToolsetsRequest,
                                    ListDatabaseToolsMcpToolsetsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsMcpToolsets");
        final ListDatabaseToolsMcpToolsetsRequest interceptedRequest =
                ListDatabaseToolsMcpToolsetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsMcpToolsetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsMcpToolsets",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsMcpToolsetsResponse>
                transformer =
                        ListDatabaseToolsMcpToolsetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsMcpToolsetsRequest, ListDatabaseToolsMcpToolsetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsMcpToolsetsRequest,
                                ListDatabaseToolsMcpToolsetsResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsMcpToolsetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsMcpToolsetsRequest, ListDatabaseToolsMcpToolsetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsPrivateEndpointsResponse>
            listDatabaseToolsPrivateEndpoints(
                    ListDatabaseToolsPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsPrivateEndpointsRequest,
                                    ListDatabaseToolsPrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsPrivateEndpoints");
        final ListDatabaseToolsPrivateEndpointsRequest interceptedRequest =
                ListDatabaseToolsPrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsPrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsPrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsPrivateEndpointsResponse>
                transformer =
                        ListDatabaseToolsPrivateEndpointsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsPrivateEndpointsRequest,
                        ListDatabaseToolsPrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsPrivateEndpointsRequest,
                                ListDatabaseToolsPrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsPrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsPrivateEndpointsRequest,
                    ListDatabaseToolsPrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsSqlReportsResponse>
            listDatabaseToolsSqlReports(
                    ListDatabaseToolsSqlReportsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsSqlReportsRequest,
                                    ListDatabaseToolsSqlReportsResponse>
                            handler) {
        LOG.trace("Called async listDatabaseToolsSqlReports");
        final ListDatabaseToolsSqlReportsRequest interceptedRequest =
                ListDatabaseToolsSqlReportsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseToolsSqlReportsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "ListDatabaseToolsSqlReports",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDatabaseToolsSqlReportsResponse>
                transformer =
                        ListDatabaseToolsSqlReportsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseToolsSqlReportsRequest, ListDatabaseToolsSqlReportsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseToolsSqlReportsRequest,
                                ListDatabaseToolsSqlReportsResponse>,
                        java.util.concurrent.Future<ListDatabaseToolsSqlReportsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseToolsSqlReportsRequest, ListDatabaseToolsSqlReportsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DatabaseTools",
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
                        "DatabaseTools", "ListWorkRequestLogs", ib.getRequestUri().toString(), "");
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
                        "DatabaseTools", "ListWorkRequests", ib.getRequestUri().toString(), "");
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
    public java.util.concurrent.Future<RefreshDatabaseToolsIdentityCredentialResponse>
            refreshDatabaseToolsIdentityCredential(
                    RefreshDatabaseToolsIdentityCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshDatabaseToolsIdentityCredentialRequest,
                                    RefreshDatabaseToolsIdentityCredentialResponse>
                            handler) {
        LOG.trace("Called async refreshDatabaseToolsIdentityCredential");
        final RefreshDatabaseToolsIdentityCredentialRequest interceptedRequest =
                RefreshDatabaseToolsIdentityCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshDatabaseToolsIdentityCredentialConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RefreshDatabaseToolsIdentityCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshDatabaseToolsIdentityCredentialResponse>
                transformer =
                        RefreshDatabaseToolsIdentityCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshDatabaseToolsIdentityCredentialRequest,
                        RefreshDatabaseToolsIdentityCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshDatabaseToolsIdentityCredentialRequest,
                                RefreshDatabaseToolsIdentityCredentialResponse>,
                        java.util.concurrent.Future<RefreshDatabaseToolsIdentityCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRefreshDatabaseToolsIdentityCredentialDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshDatabaseToolsIdentityCredentialRequest,
                    RefreshDatabaseToolsIdentityCredentialResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsConnectionLockResponse>
            removeDatabaseToolsConnectionLock(
                    RemoveDatabaseToolsConnectionLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsConnectionLockRequest,
                                    RemoveDatabaseToolsConnectionLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsConnectionLock");
        final RemoveDatabaseToolsConnectionLockRequest interceptedRequest =
                RemoveDatabaseToolsConnectionLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsConnectionLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsConnectionLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsConnectionLockResponse>
                transformer =
                        RemoveDatabaseToolsConnectionLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsConnectionLockRequest,
                        RemoveDatabaseToolsConnectionLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsConnectionLockRequest,
                                RemoveDatabaseToolsConnectionLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsConnectionLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsConnectionLockRequest,
                    RemoveDatabaseToolsConnectionLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
            removeDatabaseToolsDatabaseApiGatewayConfigLock(
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsDatabaseApiGatewayConfigLock");
        final RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest interceptedRequest =
                RemoveDatabaseToolsDatabaseApiGatewayConfigLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsDatabaseApiGatewayConfigLockConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsDatabaseApiGatewayConfigLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                transformer =
                        RemoveDatabaseToolsDatabaseApiGatewayConfigLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                        RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>,
                        java.util.concurrent.Future<
                                RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsIdentityLockResponse>
            removeDatabaseToolsIdentityLock(
                    RemoveDatabaseToolsIdentityLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsIdentityLockRequest,
                                    RemoveDatabaseToolsIdentityLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsIdentityLock");
        final RemoveDatabaseToolsIdentityLockRequest interceptedRequest =
                RemoveDatabaseToolsIdentityLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsIdentityLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsIdentityLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsIdentityLockResponse>
                transformer =
                        RemoveDatabaseToolsIdentityLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsIdentityLockRequest,
                        RemoveDatabaseToolsIdentityLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsIdentityLockRequest,
                                RemoveDatabaseToolsIdentityLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsIdentityLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsIdentityLockRequest,
                    RemoveDatabaseToolsIdentityLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsMcpServerLockResponse>
            removeDatabaseToolsMcpServerLock(
                    RemoveDatabaseToolsMcpServerLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsMcpServerLockRequest,
                                    RemoveDatabaseToolsMcpServerLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsMcpServerLock");
        final RemoveDatabaseToolsMcpServerLockRequest interceptedRequest =
                RemoveDatabaseToolsMcpServerLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsMcpServerLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsMcpServerLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsMcpServerLockResponse>
                transformer =
                        RemoveDatabaseToolsMcpServerLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsMcpServerLockRequest,
                        RemoveDatabaseToolsMcpServerLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsMcpServerLockRequest,
                                RemoveDatabaseToolsMcpServerLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsMcpServerLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsMcpServerLockRequest,
                    RemoveDatabaseToolsMcpServerLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsMcpToolsetLockResponse>
            removeDatabaseToolsMcpToolsetLock(
                    RemoveDatabaseToolsMcpToolsetLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsMcpToolsetLockRequest,
                                    RemoveDatabaseToolsMcpToolsetLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsMcpToolsetLock");
        final RemoveDatabaseToolsMcpToolsetLockRequest interceptedRequest =
                RemoveDatabaseToolsMcpToolsetLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsMcpToolsetLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsMcpToolsetLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsMcpToolsetLockResponse>
                transformer =
                        RemoveDatabaseToolsMcpToolsetLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsMcpToolsetLockRequest,
                        RemoveDatabaseToolsMcpToolsetLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsMcpToolsetLockRequest,
                                RemoveDatabaseToolsMcpToolsetLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsMcpToolsetLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsMcpToolsetLockRequest,
                    RemoveDatabaseToolsMcpToolsetLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsPrivateEndpointLockResponse>
            removeDatabaseToolsPrivateEndpointLock(
                    RemoveDatabaseToolsPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsPrivateEndpointLockRequest,
                                    RemoveDatabaseToolsPrivateEndpointLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsPrivateEndpointLock");
        final RemoveDatabaseToolsPrivateEndpointLockRequest interceptedRequest =
                RemoveDatabaseToolsPrivateEndpointLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsPrivateEndpointLockConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsPrivateEndpointLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsPrivateEndpointLockResponse>
                transformer =
                        RemoveDatabaseToolsPrivateEndpointLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsPrivateEndpointLockRequest,
                        RemoveDatabaseToolsPrivateEndpointLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsPrivateEndpointLockRequest,
                                RemoveDatabaseToolsPrivateEndpointLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsPrivateEndpointLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsPrivateEndpointLockRequest,
                    RemoveDatabaseToolsPrivateEndpointLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDatabaseToolsSqlReportLockResponse>
            removeDatabaseToolsSqlReportLock(
                    RemoveDatabaseToolsSqlReportLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsSqlReportLockRequest,
                                    RemoveDatabaseToolsSqlReportLockResponse>
                            handler) {
        LOG.trace("Called async removeDatabaseToolsSqlReportLock");
        final RemoveDatabaseToolsSqlReportLockRequest interceptedRequest =
                RemoveDatabaseToolsSqlReportLockConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDatabaseToolsSqlReportLockConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "RemoveDatabaseToolsSqlReportLock",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDatabaseToolsSqlReportLockResponse>
                transformer =
                        RemoveDatabaseToolsSqlReportLockConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDatabaseToolsSqlReportLockRequest,
                        RemoveDatabaseToolsSqlReportLockResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDatabaseToolsSqlReportLockRequest,
                                RemoveDatabaseToolsSqlReportLockResponse>,
                        java.util.concurrent.Future<RemoveDatabaseToolsSqlReportLockResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourceLockDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDatabaseToolsSqlReportLockRequest,
                    RemoveDatabaseToolsSqlReportLockResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsConnectionResponse>
            updateDatabaseToolsConnection(
                    UpdateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsConnectionRequest,
                                    UpdateDatabaseToolsConnectionResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsConnection");
        final UpdateDatabaseToolsConnectionRequest interceptedRequest =
                UpdateDatabaseToolsConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsConnectionResponse>
                transformer =
                        UpdateDatabaseToolsConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsConnectionRequest, UpdateDatabaseToolsConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsConnectionRequest,
                                UpdateDatabaseToolsConnectionResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsConnectionRequest, UpdateDatabaseToolsConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
            updateDatabaseToolsDatabaseApiGatewayConfig(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsDatabaseApiGatewayConfig");
        final UpdateDatabaseToolsDatabaseApiGatewayConfigRequest interceptedRequest =
                UpdateDatabaseToolsDatabaseApiGatewayConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsDatabaseApiGatewayConfigConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfig",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
                transformer =
                        UpdateDatabaseToolsDatabaseApiGatewayConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsDatabaseApiGatewayConfigRequest,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>,
                        java.util.concurrent.Future<
                                UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateDatabaseToolsDatabaseApiGatewayConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigRequest,
                    UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsIdentityResponse>
            updateDatabaseToolsIdentity(
                    UpdateDatabaseToolsIdentityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsIdentityRequest,
                                    UpdateDatabaseToolsIdentityResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsIdentity");
        final UpdateDatabaseToolsIdentityRequest interceptedRequest =
                UpdateDatabaseToolsIdentityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsIdentityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsIdentity",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsIdentityResponse>
                transformer =
                        UpdateDatabaseToolsIdentityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsIdentityRequest, UpdateDatabaseToolsIdentityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsIdentityRequest,
                                UpdateDatabaseToolsIdentityResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsIdentityResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsIdentityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsIdentityRequest, UpdateDatabaseToolsIdentityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsMcpServerResponse>
            updateDatabaseToolsMcpServer(
                    UpdateDatabaseToolsMcpServerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsMcpServerRequest,
                                    UpdateDatabaseToolsMcpServerResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsMcpServer");
        final UpdateDatabaseToolsMcpServerRequest interceptedRequest =
                UpdateDatabaseToolsMcpServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsMcpServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsMcpServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsMcpServerResponse>
                transformer =
                        UpdateDatabaseToolsMcpServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsMcpServerRequest, UpdateDatabaseToolsMcpServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsMcpServerRequest,
                                UpdateDatabaseToolsMcpServerResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsMcpServerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsMcpServerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsMcpServerRequest, UpdateDatabaseToolsMcpServerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsMcpToolsetResponse>
            updateDatabaseToolsMcpToolset(
                    UpdateDatabaseToolsMcpToolsetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsMcpToolsetRequest,
                                    UpdateDatabaseToolsMcpToolsetResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsMcpToolset");
        final UpdateDatabaseToolsMcpToolsetRequest interceptedRequest =
                UpdateDatabaseToolsMcpToolsetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsMcpToolsetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsMcpToolset",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsMcpToolsetResponse>
                transformer =
                        UpdateDatabaseToolsMcpToolsetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsMcpToolsetRequest, UpdateDatabaseToolsMcpToolsetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsMcpToolsetRequest,
                                UpdateDatabaseToolsMcpToolsetResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsMcpToolsetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsMcpToolsetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsMcpToolsetRequest, UpdateDatabaseToolsMcpToolsetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsPrivateEndpointResponse>
            updateDatabaseToolsPrivateEndpoint(
                    UpdateDatabaseToolsPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsPrivateEndpointRequest,
                                    UpdateDatabaseToolsPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsPrivateEndpoint");
        final UpdateDatabaseToolsPrivateEndpointRequest interceptedRequest =
                UpdateDatabaseToolsPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsPrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsPrivateEndpointResponse>
                transformer =
                        UpdateDatabaseToolsPrivateEndpointConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsPrivateEndpointRequest,
                        UpdateDatabaseToolsPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsPrivateEndpointRequest,
                                UpdateDatabaseToolsPrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsPrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsPrivateEndpointRequest,
                    UpdateDatabaseToolsPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsSqlReportResponse>
            updateDatabaseToolsSqlReport(
                    UpdateDatabaseToolsSqlReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsSqlReportRequest,
                                    UpdateDatabaseToolsSqlReportResponse>
                            handler) {
        LOG.trace("Called async updateDatabaseToolsSqlReport");
        final UpdateDatabaseToolsSqlReportRequest interceptedRequest =
                UpdateDatabaseToolsSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDatabaseToolsSqlReportConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DatabaseTools",
                        "UpdateDatabaseToolsSqlReport",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDatabaseToolsSqlReportResponse>
                transformer =
                        UpdateDatabaseToolsSqlReportConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDatabaseToolsSqlReportRequest, UpdateDatabaseToolsSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDatabaseToolsSqlReportRequest,
                                UpdateDatabaseToolsSqlReportResponse>,
                        java.util.concurrent.Future<UpdateDatabaseToolsSqlReportResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDatabaseToolsSqlReportDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDatabaseToolsSqlReportRequest, UpdateDatabaseToolsSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "DatabaseTools",
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
                        "DatabaseTools",
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
