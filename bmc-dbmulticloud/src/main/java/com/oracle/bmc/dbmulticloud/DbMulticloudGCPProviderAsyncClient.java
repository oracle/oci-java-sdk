/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.internal.http.*;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for DbMulticloudGCPProvider service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class DbMulticloudGCPProviderAsyncClient implements DbMulticloudGCPProviderAsync {
    /**
     * Service instance for DbMulticloudGCPProvider.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbMulticloudGCPProviderClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbMulticloudGCPProviderAsyncClient.class);

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
    public DbMulticloudGCPProviderAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
    public DbMulticloudGCPProviderAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, DbMulticloudGCPProviderAsyncClient> {
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
        public DbMulticloudGCPProviderAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DbMulticloudGCPProviderAsyncClient(
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
    public java.util.concurrent.Future<ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
            changeOracleDbGcpIdentityConnectorCompartment(
                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest,
                                    ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeOracleDbGcpIdentityConnectorCompartment");
        final ChangeOracleDbGcpIdentityConnectorCompartmentRequest interceptedRequest =
                ChangeOracleDbGcpIdentityConnectorCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOracleDbGcpIdentityConnectorCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpIdentityConnectorCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ChangeOracleDbGcpIdentityConnectorCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
                transformer =
                        ChangeOracleDbGcpIdentityConnectorCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeOracleDbGcpIdentityConnectorCompartmentRequest,
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeOracleDbGcpIdentityConnectorCompartmentRequest,
                                ChangeOracleDbGcpIdentityConnectorCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeOracleDbGcpIdentityConnectorCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeOracleDbGcpIdentityConnectorCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest,
                    ChangeOracleDbGcpIdentityConnectorCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeOracleDbGcpKeyRingCompartmentResponse>
            changeOracleDbGcpKeyRingCompartment(
                    ChangeOracleDbGcpKeyRingCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbGcpKeyRingCompartmentRequest,
                                    ChangeOracleDbGcpKeyRingCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeOracleDbGcpKeyRingCompartment");
        final ChangeOracleDbGcpKeyRingCompartmentRequest interceptedRequest =
                ChangeOracleDbGcpKeyRingCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOracleDbGcpKeyRingCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpKeyRingCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ChangeOracleDbGcpKeyRingCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeOracleDbGcpKeyRingCompartmentResponse>
                transformer =
                        ChangeOracleDbGcpKeyRingCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeOracleDbGcpKeyRingCompartmentRequest,
                        ChangeOracleDbGcpKeyRingCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeOracleDbGcpKeyRingCompartmentRequest,
                                ChangeOracleDbGcpKeyRingCompartmentResponse>,
                        java.util.concurrent.Future<ChangeOracleDbGcpKeyRingCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeOracleDbGcpKeyRingCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeOracleDbGcpKeyRingCompartmentRequest,
                    ChangeOracleDbGcpKeyRingCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbGcpIdentityConnectorResponse>
            createOracleDbGcpIdentityConnector(
                    CreateOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOracleDbGcpIdentityConnectorRequest,
                                    CreateOracleDbGcpIdentityConnectorResponse>
                            handler) {
        LOG.trace("Called async createOracleDbGcpIdentityConnector");
        final CreateOracleDbGcpIdentityConnectorRequest interceptedRequest =
                CreateOracleDbGcpIdentityConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOracleDbGcpIdentityConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpIdentityConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/CreateOracleDbGcpIdentityConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOracleDbGcpIdentityConnectorResponse>
                transformer =
                        CreateOracleDbGcpIdentityConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOracleDbGcpIdentityConnectorRequest,
                        CreateOracleDbGcpIdentityConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOracleDbGcpIdentityConnectorRequest,
                                CreateOracleDbGcpIdentityConnectorResponse>,
                        java.util.concurrent.Future<CreateOracleDbGcpIdentityConnectorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOracleDbGcpIdentityConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOracleDbGcpIdentityConnectorRequest,
                    CreateOracleDbGcpIdentityConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateOracleDbGcpKeyRingResponse> createOracleDbGcpKeyRing(
            CreateOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOracleDbGcpKeyRingRequest, CreateOracleDbGcpKeyRingResponse>
                    handler) {
        LOG.trace("Called async createOracleDbGcpKeyRing");
        final CreateOracleDbGcpKeyRingRequest interceptedRequest =
                CreateOracleDbGcpKeyRingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOracleDbGcpKeyRingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpKeyRing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/CreateOracleDbGcpKeyRing");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOracleDbGcpKeyRingResponse>
                transformer =
                        CreateOracleDbGcpKeyRingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOracleDbGcpKeyRingRequest, CreateOracleDbGcpKeyRingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOracleDbGcpKeyRingRequest, CreateOracleDbGcpKeyRingResponse>,
                        java.util.concurrent.Future<CreateOracleDbGcpKeyRingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateOracleDbGcpKeyRingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOracleDbGcpKeyRingRequest, CreateOracleDbGcpKeyRingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbGcpIdentityConnectorResponse>
            deleteOracleDbGcpIdentityConnector(
                    DeleteOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOracleDbGcpIdentityConnectorRequest,
                                    DeleteOracleDbGcpIdentityConnectorResponse>
                            handler) {
        LOG.trace("Called async deleteOracleDbGcpIdentityConnector");
        final DeleteOracleDbGcpIdentityConnectorRequest interceptedRequest =
                DeleteOracleDbGcpIdentityConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOracleDbGcpIdentityConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpIdentityConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/DeleteOracleDbGcpIdentityConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOracleDbGcpIdentityConnectorResponse>
                transformer =
                        DeleteOracleDbGcpIdentityConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOracleDbGcpIdentityConnectorRequest,
                        DeleteOracleDbGcpIdentityConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOracleDbGcpIdentityConnectorRequest,
                                DeleteOracleDbGcpIdentityConnectorResponse>,
                        java.util.concurrent.Future<DeleteOracleDbGcpIdentityConnectorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOracleDbGcpIdentityConnectorRequest,
                    DeleteOracleDbGcpIdentityConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteOracleDbGcpKeyRingResponse> deleteOracleDbGcpKeyRing(
            DeleteOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOracleDbGcpKeyRingRequest, DeleteOracleDbGcpKeyRingResponse>
                    handler) {
        LOG.trace("Called async deleteOracleDbGcpKeyRing");
        final DeleteOracleDbGcpKeyRingRequest interceptedRequest =
                DeleteOracleDbGcpKeyRingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOracleDbGcpKeyRingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpKeyRing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/DeleteOracleDbGcpKeyRing");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOracleDbGcpKeyRingResponse>
                transformer =
                        DeleteOracleDbGcpKeyRingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOracleDbGcpKeyRingRequest, DeleteOracleDbGcpKeyRingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOracleDbGcpKeyRingRequest, DeleteOracleDbGcpKeyRingResponse>,
                        java.util.concurrent.Future<DeleteOracleDbGcpKeyRingResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOracleDbGcpKeyRingRequest, DeleteOracleDbGcpKeyRingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpIdentityConnectorResponse>
            getOracleDbGcpIdentityConnector(
                    GetOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOracleDbGcpIdentityConnectorRequest,
                                    GetOracleDbGcpIdentityConnectorResponse>
                            handler) {
        LOG.trace("Called async getOracleDbGcpIdentityConnector");
        final GetOracleDbGcpIdentityConnectorRequest interceptedRequest =
                GetOracleDbGcpIdentityConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOracleDbGcpIdentityConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpIdentityConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/GetOracleDbGcpIdentityConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOracleDbGcpIdentityConnectorResponse>
                transformer =
                        GetOracleDbGcpIdentityConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOracleDbGcpIdentityConnectorRequest,
                        GetOracleDbGcpIdentityConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOracleDbGcpIdentityConnectorRequest,
                                GetOracleDbGcpIdentityConnectorResponse>,
                        java.util.concurrent.Future<GetOracleDbGcpIdentityConnectorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOracleDbGcpIdentityConnectorRequest,
                    GetOracleDbGcpIdentityConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpKeyResponse> getOracleDbGcpKey(
            GetOracleDbGcpKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbGcpKeyRequest, GetOracleDbGcpKeyResponse>
                    handler) {
        LOG.trace("Called async getOracleDbGcpKey");
        final GetOracleDbGcpKeyRequest interceptedRequest =
                GetOracleDbGcpKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOracleDbGcpKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/GetOracleDbGcpKey");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOracleDbGcpKeyResponse>
                transformer =
                        GetOracleDbGcpKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetOracleDbGcpKeyRequest, GetOracleDbGcpKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOracleDbGcpKeyRequest, GetOracleDbGcpKeyResponse>,
                        java.util.concurrent.Future<GetOracleDbGcpKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOracleDbGcpKeyRequest, GetOracleDbGcpKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOracleDbGcpKeyRingResponse> getOracleDbGcpKeyRing(
            GetOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbGcpKeyRingRequest, GetOracleDbGcpKeyRingResponse>
                    handler) {
        LOG.trace("Called async getOracleDbGcpKeyRing");
        final GetOracleDbGcpKeyRingRequest interceptedRequest =
                GetOracleDbGcpKeyRingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOracleDbGcpKeyRingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKeyRing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/GetOracleDbGcpKeyRing");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOracleDbGcpKeyRingResponse>
                transformer =
                        GetOracleDbGcpKeyRingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOracleDbGcpKeyRingRequest, GetOracleDbGcpKeyRingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOracleDbGcpKeyRingRequest, GetOracleDbGcpKeyRingResponse>,
                        java.util.concurrent.Future<GetOracleDbGcpKeyRingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOracleDbGcpKeyRingRequest, GetOracleDbGcpKeyRingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpIdentityConnectorsResponse>
            listOracleDbGcpIdentityConnectors(
                    ListOracleDbGcpIdentityConnectorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOracleDbGcpIdentityConnectorsRequest,
                                    ListOracleDbGcpIdentityConnectorsResponse>
                            handler) {
        LOG.trace("Called async listOracleDbGcpIdentityConnectors");
        final ListOracleDbGcpIdentityConnectorsRequest interceptedRequest =
                ListOracleDbGcpIdentityConnectorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOracleDbGcpIdentityConnectorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpIdentityConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ListOracleDbGcpIdentityConnectors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOracleDbGcpIdentityConnectorsResponse>
                transformer =
                        ListOracleDbGcpIdentityConnectorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOracleDbGcpIdentityConnectorsRequest,
                        ListOracleDbGcpIdentityConnectorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOracleDbGcpIdentityConnectorsRequest,
                                ListOracleDbGcpIdentityConnectorsResponse>,
                        java.util.concurrent.Future<ListOracleDbGcpIdentityConnectorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOracleDbGcpIdentityConnectorsRequest,
                    ListOracleDbGcpIdentityConnectorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpKeyRingsResponse> listOracleDbGcpKeyRings(
            ListOracleDbGcpKeyRingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>
                    handler) {
        LOG.trace("Called async listOracleDbGcpKeyRings");
        final ListOracleDbGcpKeyRingsRequest interceptedRequest =
                ListOracleDbGcpKeyRingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOracleDbGcpKeyRingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeyRings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ListOracleDbGcpKeyRings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOracleDbGcpKeyRingsResponse>
                transformer =
                        ListOracleDbGcpKeyRingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>,
                        java.util.concurrent.Future<ListOracleDbGcpKeyRingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOracleDbGcpKeysResponse> listOracleDbGcpKeys(
            ListOracleDbGcpKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>
                    handler) {
        LOG.trace("Called async listOracleDbGcpKeys");
        final ListOracleDbGcpKeysRequest interceptedRequest =
                ListOracleDbGcpKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOracleDbGcpKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/ListOracleDbGcpKeys");
        final java.util.function.Function<javax.ws.rs.core.Response, ListOracleDbGcpKeysResponse>
                transformer =
                        ListOracleDbGcpKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>,
                        java.util.concurrent.Future<ListOracleDbGcpKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbGcpIdentityConnectorResponse>
            refreshOracleDbGcpIdentityConnector(
                    RefreshOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshOracleDbGcpIdentityConnectorRequest,
                                    RefreshOracleDbGcpIdentityConnectorResponse>
                            handler) {
        LOG.trace("Called async refreshOracleDbGcpIdentityConnector");
        final RefreshOracleDbGcpIdentityConnectorRequest interceptedRequest =
                RefreshOracleDbGcpIdentityConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshOracleDbGcpIdentityConnectorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpIdentityConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/RefreshOracleDbGcpIdentityConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshOracleDbGcpIdentityConnectorResponse>
                transformer =
                        RefreshOracleDbGcpIdentityConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshOracleDbGcpIdentityConnectorRequest,
                        RefreshOracleDbGcpIdentityConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshOracleDbGcpIdentityConnectorRequest,
                                RefreshOracleDbGcpIdentityConnectorResponse>,
                        java.util.concurrent.Future<RefreshOracleDbGcpIdentityConnectorResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshOracleDbGcpIdentityConnectorRequest,
                    RefreshOracleDbGcpIdentityConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshOracleDbGcpKeyRingResponse> refreshOracleDbGcpKeyRing(
            RefreshOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshOracleDbGcpKeyRingRequest, RefreshOracleDbGcpKeyRingResponse>
                    handler) {
        LOG.trace("Called async refreshOracleDbGcpKeyRing");
        final RefreshOracleDbGcpKeyRingRequest interceptedRequest =
                RefreshOracleDbGcpKeyRingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshOracleDbGcpKeyRingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpKeyRing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/RefreshOracleDbGcpKeyRing");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RefreshOracleDbGcpKeyRingResponse>
                transformer =
                        RefreshOracleDbGcpKeyRingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RefreshOracleDbGcpKeyRingRequest, RefreshOracleDbGcpKeyRingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RefreshOracleDbGcpKeyRingRequest,
                                RefreshOracleDbGcpKeyRingResponse>,
                        java.util.concurrent.Future<RefreshOracleDbGcpKeyRingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRefreshOracleDbGcpKeyRingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RefreshOracleDbGcpKeyRingRequest, RefreshOracleDbGcpKeyRingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbGcpIdentityConnectorResponse>
            updateOracleDbGcpIdentityConnector(
                    UpdateOracleDbGcpIdentityConnectorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOracleDbGcpIdentityConnectorRequest,
                                    UpdateOracleDbGcpIdentityConnectorResponse>
                            handler) {
        LOG.trace("Called async updateOracleDbGcpIdentityConnector");
        final UpdateOracleDbGcpIdentityConnectorRequest interceptedRequest =
                UpdateOracleDbGcpIdentityConnectorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOracleDbGcpIdentityConnectorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpIdentityConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/UpdateOracleDbGcpIdentityConnector");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateOracleDbGcpIdentityConnectorResponse>
                transformer =
                        UpdateOracleDbGcpIdentityConnectorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOracleDbGcpIdentityConnectorRequest,
                        UpdateOracleDbGcpIdentityConnectorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOracleDbGcpIdentityConnectorRequest,
                                UpdateOracleDbGcpIdentityConnectorResponse>,
                        java.util.concurrent.Future<UpdateOracleDbGcpIdentityConnectorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOracleDbGcpIdentityConnectorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOracleDbGcpIdentityConnectorRequest,
                    UpdateOracleDbGcpIdentityConnectorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateOracleDbGcpKeyRingResponse> updateOracleDbGcpKeyRing(
            UpdateOracleDbGcpKeyRingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOracleDbGcpKeyRingRequest, UpdateOracleDbGcpKeyRingResponse>
                    handler) {
        LOG.trace("Called async updateOracleDbGcpKeyRing");
        final UpdateOracleDbGcpKeyRingRequest interceptedRequest =
                UpdateOracleDbGcpKeyRingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOracleDbGcpKeyRingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpKeyRing",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/UpdateOracleDbGcpKeyRing");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateOracleDbGcpKeyRingResponse>
                transformer =
                        UpdateOracleDbGcpKeyRingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateOracleDbGcpKeyRingRequest, UpdateOracleDbGcpKeyRingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateOracleDbGcpKeyRingRequest, UpdateOracleDbGcpKeyRingResponse>,
                        java.util.concurrent.Future<UpdateOracleDbGcpKeyRingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateOracleDbGcpKeyRingDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateOracleDbGcpKeyRingRequest, UpdateOracleDbGcpKeyRingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
