/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase;

import com.oracle.bmc.distributeddatabase.internal.http.*;
import com.oracle.bmc.distributeddatabase.requests.*;
import com.oracle.bmc.distributeddatabase.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for DistributedDbService service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class DistributedDbServiceAsyncClient implements DistributedDbServiceAsync {
    /**
     * Service instance for DistributedDbService.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DistributedDbServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedDbServiceAsyncClient.class);

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
    public DistributedDbServiceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
    public DistributedDbServiceAsyncClient(
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
                            "DistributedDbServiceAsyncClient",
                            "downloadDistributedDatabaseGsmCertificateSigningRequest,generateDistributedDatabaseWallet"));
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
                    Builder, DistributedDbServiceAsyncClient> {
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
        public DistributedDbServiceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DistributedDbServiceAsyncClient(
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
    public java.util.concurrent.Future<AddDistributedDatabaseGdsControlNodeResponse>
            addDistributedDatabaseGdsControlNode(
                    AddDistributedDatabaseGdsControlNodeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedDatabaseGdsControlNodeRequest,
                                    AddDistributedDatabaseGdsControlNodeResponse>
                            handler) {
        LOG.trace("Called async addDistributedDatabaseGdsControlNode");
        final AddDistributedDatabaseGdsControlNodeRequest interceptedRequest =
                AddDistributedDatabaseGdsControlNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDistributedDatabaseGdsControlNodeConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "AddDistributedDatabaseGdsControlNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/AddDistributedDatabaseGdsControlNode");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDistributedDatabaseGdsControlNodeResponse>
                transformer =
                        AddDistributedDatabaseGdsControlNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDistributedDatabaseGdsControlNodeRequest,
                        AddDistributedDatabaseGdsControlNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDistributedDatabaseGdsControlNodeRequest,
                                AddDistributedDatabaseGdsControlNodeResponse>,
                        java.util.concurrent.Future<AddDistributedDatabaseGdsControlNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddDistributedDatabaseGdsControlNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDistributedDatabaseGdsControlNodeRequest,
                    AddDistributedDatabaseGdsControlNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedDatabaseCompartmentResponse>
            changeDistributedDatabaseCompartment(
                    ChangeDistributedDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDatabaseCompartmentRequest,
                                    ChangeDistributedDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDistributedDatabaseCompartment");
        final ChangeDistributedDatabaseCompartmentRequest interceptedRequest =
                ChangeDistributedDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDistributedDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ChangeDistributedDatabaseCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ChangeDistributedDatabaseCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDistributedDatabaseCompartmentResponse>
                transformer =
                        ChangeDistributedDatabaseCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDistributedDatabaseCompartmentRequest,
                        ChangeDistributedDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDistributedDatabaseCompartmentRequest,
                                ChangeDistributedDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDistributedDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDistributedDatabaseCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDistributedDatabaseCompartmentRequest,
                    ChangeDistributedDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedDbBackupConfigResponse>
            changeDistributedDbBackupConfig(
                    ChangeDistributedDbBackupConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDbBackupConfigRequest,
                                    ChangeDistributedDbBackupConfigResponse>
                            handler) {
        LOG.trace("Called async changeDistributedDbBackupConfig");
        final ChangeDistributedDbBackupConfigRequest interceptedRequest =
                ChangeDistributedDbBackupConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDistributedDbBackupConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ChangeDistributedDbBackupConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ChangeDistributedDbBackupConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDistributedDbBackupConfigResponse>
                transformer =
                        ChangeDistributedDbBackupConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDistributedDbBackupConfigRequest,
                        ChangeDistributedDbBackupConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDistributedDbBackupConfigRequest,
                                ChangeDistributedDbBackupConfigResponse>,
                        java.util.concurrent.Future<ChangeDistributedDbBackupConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDistributedDbBackupConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDistributedDbBackupConfigRequest,
                    ChangeDistributedDbBackupConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedDatabaseGsmsResponse>
            configureDistributedDatabaseGsms(
                    ConfigureDistributedDatabaseGsmsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseGsmsRequest,
                                    ConfigureDistributedDatabaseGsmsResponse>
                            handler) {
        LOG.trace("Called async configureDistributedDatabaseGsms");
        final ConfigureDistributedDatabaseGsmsRequest interceptedRequest =
                ConfigureDistributedDatabaseGsmsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDistributedDatabaseGsmsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ConfigureDistributedDatabaseGsms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ConfigureDistributedDatabaseGsms");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureDistributedDatabaseGsmsResponse>
                transformer =
                        ConfigureDistributedDatabaseGsmsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDistributedDatabaseGsmsRequest,
                        ConfigureDistributedDatabaseGsmsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDistributedDatabaseGsmsRequest,
                                ConfigureDistributedDatabaseGsmsResponse>,
                        java.util.concurrent.Future<ConfigureDistributedDatabaseGsmsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConfigureDistributedDatabaseGsmsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDistributedDatabaseGsmsRequest,
                    ConfigureDistributedDatabaseGsmsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedDatabaseShardingResponse>
            configureDistributedDatabaseSharding(
                    ConfigureDistributedDatabaseShardingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedDatabaseShardingRequest,
                                    ConfigureDistributedDatabaseShardingResponse>
                            handler) {
        LOG.trace("Called async configureDistributedDatabaseSharding");
        final ConfigureDistributedDatabaseShardingRequest interceptedRequest =
                ConfigureDistributedDatabaseShardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDistributedDatabaseShardingConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ConfigureDistributedDatabaseSharding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ConfigureDistributedDatabaseSharding");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConfigureDistributedDatabaseShardingResponse>
                transformer =
                        ConfigureDistributedDatabaseShardingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDistributedDatabaseShardingRequest,
                        ConfigureDistributedDatabaseShardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDistributedDatabaseShardingRequest,
                                ConfigureDistributedDatabaseShardingResponse>,
                        java.util.concurrent.Future<ConfigureDistributedDatabaseShardingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDistributedDatabaseShardingRequest,
                    ConfigureDistributedDatabaseShardingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDistributedDatabaseResponse> createDistributedDatabase(
            CreateDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDistributedDatabaseRequest, CreateDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async createDistributedDatabase");
        final CreateDistributedDatabaseRequest interceptedRequest =
                CreateDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "CreateDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDistributedDatabaseResponse>
                transformer =
                        CreateDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDistributedDatabaseRequest, CreateDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDistributedDatabaseRequest,
                                CreateDistributedDatabaseResponse>,
                        java.util.concurrent.Future<CreateDistributedDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDistributedDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDistributedDatabaseRequest, CreateDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributedDatabaseResponse> deleteDistributedDatabase(
            DeleteDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDistributedDatabaseRequest, DeleteDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async deleteDistributedDatabase");
        final DeleteDistributedDatabaseRequest interceptedRequest =
                DeleteDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "DeleteDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/DeleteDistributedDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDistributedDatabaseResponse>
                transformer =
                        DeleteDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDistributedDatabaseRequest, DeleteDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDistributedDatabaseRequest,
                                DeleteDistributedDatabaseResponse>,
                        java.util.concurrent.Future<DeleteDistributedDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDistributedDatabaseRequest, DeleteDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler) {
        LOG.trace("Called async downloadDistributedDatabaseGsmCertificateSigningRequest");
        final DownloadDistributedDatabaseGsmCertificateSigningRequestRequest interceptedRequest =
                DownloadDistributedDatabaseGsmCertificateSigningRequestConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadDistributedDatabaseGsmCertificateSigningRequestConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "DownloadDistributedDatabaseGsmCertificateSigningRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/DownloadDistributedDatabaseGsmCertificateSigningRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
                transformer =
                        DownloadDistributedDatabaseGsmCertificateSigningRequestConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                        DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                                DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>,
                        java.util.concurrent.Future<
                                DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadDistributedDatabaseGsmCertificateSigningRequestRequest,
                    DownloadDistributedDatabaseGsmCertificateSigningRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
                            handler) {
        LOG.trace("Called async generateDistributedDatabaseGsmCertificateSigningRequest");
        final GenerateDistributedDatabaseGsmCertificateSigningRequestRequest interceptedRequest =
                GenerateDistributedDatabaseGsmCertificateSigningRequestConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDistributedDatabaseGsmCertificateSigningRequestConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "GenerateDistributedDatabaseGsmCertificateSigningRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GenerateDistributedDatabaseGsmCertificateSigningRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
                transformer =
                        GenerateDistributedDatabaseGsmCertificateSigningRequestConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                        GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                                GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>,
                        java.util.concurrent.Future<
                                GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDistributedDatabaseGsmCertificateSigningRequestRequest,
                    GenerateDistributedDatabaseGsmCertificateSigningRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateDistributedDatabaseWalletResponse>
            generateDistributedDatabaseWallet(
                    GenerateDistributedDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedDatabaseWalletRequest,
                                    GenerateDistributedDatabaseWalletResponse>
                            handler) {
        LOG.trace("Called async generateDistributedDatabaseWallet");
        final GenerateDistributedDatabaseWalletRequest interceptedRequest =
                GenerateDistributedDatabaseWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDistributedDatabaseWalletConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "GenerateDistributedDatabaseWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GenerateDistributedDatabaseWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GenerateDistributedDatabaseWalletResponse>
                transformer =
                        GenerateDistributedDatabaseWalletConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDistributedDatabaseWalletRequest,
                        GenerateDistributedDatabaseWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDistributedDatabaseWalletRequest,
                                GenerateDistributedDatabaseWalletResponse>,
                        java.util.concurrent.Future<GenerateDistributedDatabaseWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGenerateDistributedDatabaseWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDistributedDatabaseWalletRequest,
                    GenerateDistributedDatabaseWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDistributedDatabaseResponse> getDistributedDatabase(
            GetDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async getDistributedDatabase");
        final GetDistributedDatabaseRequest interceptedRequest =
                GetDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "GetDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GetDistributedDatabase");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDistributedDatabaseResponse>
                transformer =
                        GetDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>,
                        java.util.concurrent.Future<GetDistributedDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDistributedDatabaseRequest, GetDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDistributedDatabaseRaftMetricResponse>
            getDistributedDatabaseRaftMetric(
                    GetDistributedDatabaseRaftMetricRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedDatabaseRaftMetricRequest,
                                    GetDistributedDatabaseRaftMetricResponse>
                            handler) {
        LOG.trace("Called async getDistributedDatabaseRaftMetric");
        final GetDistributedDatabaseRaftMetricRequest interceptedRequest =
                GetDistributedDatabaseRaftMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDistributedDatabaseRaftMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "GetDistributedDatabaseRaftMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GetDistributedDatabaseRaftMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDistributedDatabaseRaftMetricResponse>
                transformer =
                        GetDistributedDatabaseRaftMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDistributedDatabaseRaftMetricRequest,
                        GetDistributedDatabaseRaftMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDistributedDatabaseRaftMetricRequest,
                                GetDistributedDatabaseRaftMetricResponse>,
                        java.util.concurrent.Future<GetDistributedDatabaseRaftMetricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDistributedDatabaseRaftMetricRequest,
                    GetDistributedDatabaseRaftMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDistributedDatabasesResponse> listDistributedDatabases(
            ListDistributedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>
                    handler) {
        LOG.trace("Called async listDistributedDatabases");
        final ListDistributedDatabasesRequest interceptedRequest =
                ListDistributedDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDistributedDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ListDistributedDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabaseCollection/ListDistributedDatabases");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDistributedDatabasesResponse>
                transformer =
                        ListDistributedDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>,
                        java.util.concurrent.Future<ListDistributedDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDistributedDatabasesRequest, ListDistributedDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<MoveDistributedDatabaseReplicationUnitResponse>
            moveDistributedDatabaseReplicationUnit(
                    MoveDistributedDatabaseReplicationUnitRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MoveDistributedDatabaseReplicationUnitRequest,
                                    MoveDistributedDatabaseReplicationUnitResponse>
                            handler) {
        LOG.trace("Called async moveDistributedDatabaseReplicationUnit");
        final MoveDistributedDatabaseReplicationUnitRequest interceptedRequest =
                MoveDistributedDatabaseReplicationUnitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MoveDistributedDatabaseReplicationUnitConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "MoveDistributedDatabaseReplicationUnit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/MoveDistributedDatabaseReplicationUnit");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, MoveDistributedDatabaseReplicationUnitResponse>
                transformer =
                        MoveDistributedDatabaseReplicationUnitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        MoveDistributedDatabaseReplicationUnitRequest,
                        MoveDistributedDatabaseReplicationUnitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MoveDistributedDatabaseReplicationUnitRequest,
                                MoveDistributedDatabaseReplicationUnitResponse>,
                        java.util.concurrent.Future<MoveDistributedDatabaseReplicationUnitResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getMoveDistributedDatabaseReplicationUnitDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MoveDistributedDatabaseReplicationUnitRequest,
                    MoveDistributedDatabaseReplicationUnitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchDistributedDatabaseResponse> patchDistributedDatabase(
            PatchDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async patchDistributedDatabase");
        final PatchDistributedDatabaseRequest interceptedRequest =
                PatchDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "PatchDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/PatchDistributedDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchDistributedDatabaseResponse>
                transformer =
                        PatchDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>,
                        java.util.concurrent.Future<PatchDistributedDatabaseResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchDistributedDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDistributedDatabaseRequest, PatchDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecreateFailedDistributedDatabaseResourceResponse>
            recreateFailedDistributedDatabaseResource(
                    RecreateFailedDistributedDatabaseResourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RecreateFailedDistributedDatabaseResourceRequest,
                                    RecreateFailedDistributedDatabaseResourceResponse>
                            handler) {
        LOG.trace("Called async recreateFailedDistributedDatabaseResource");
        final RecreateFailedDistributedDatabaseResourceRequest interceptedRequest =
                RecreateFailedDistributedDatabaseResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecreateFailedDistributedDatabaseResourceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "RecreateFailedDistributedDatabaseResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/RecreateFailedDistributedDatabaseResource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RecreateFailedDistributedDatabaseResourceResponse>
                transformer =
                        RecreateFailedDistributedDatabaseResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RecreateFailedDistributedDatabaseResourceRequest,
                        RecreateFailedDistributedDatabaseResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecreateFailedDistributedDatabaseResourceRequest,
                                RecreateFailedDistributedDatabaseResourceResponse>,
                        java.util.concurrent.Future<
                                RecreateFailedDistributedDatabaseResourceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecreateFailedDistributedDatabaseResourceRequest,
                    RecreateFailedDistributedDatabaseResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateDistributedDatabasePasswordsResponse>
            rotateDistributedDatabasePasswords(
                    RotateDistributedDatabasePasswordsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedDatabasePasswordsRequest,
                                    RotateDistributedDatabasePasswordsResponse>
                            handler) {
        LOG.trace("Called async rotateDistributedDatabasePasswords");
        final RotateDistributedDatabasePasswordsRequest interceptedRequest =
                RotateDistributedDatabasePasswordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateDistributedDatabasePasswordsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "RotateDistributedDatabasePasswords",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/RotateDistributedDatabasePasswords");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RotateDistributedDatabasePasswordsResponse>
                transformer =
                        RotateDistributedDatabasePasswordsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RotateDistributedDatabasePasswordsRequest,
                        RotateDistributedDatabasePasswordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateDistributedDatabasePasswordsRequest,
                                RotateDistributedDatabasePasswordsResponse>,
                        java.util.concurrent.Future<RotateDistributedDatabasePasswordsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateDistributedDatabasePasswordsRequest,
                    RotateDistributedDatabasePasswordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartDistributedDatabaseResponse> startDistributedDatabase(
            StartDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async startDistributedDatabase");
        final StartDistributedDatabaseRequest interceptedRequest =
                StartDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "StartDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/StartDistributedDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, StartDistributedDatabaseResponse>
                transformer =
                        StartDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>,
                        java.util.concurrent.Future<StartDistributedDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartDistributedDatabaseRequest, StartDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopDistributedDatabaseResponse> stopDistributedDatabase(
            StopDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async stopDistributedDatabase");
        final StopDistributedDatabaseRequest interceptedRequest =
                StopDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "StopDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/StopDistributedDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, StopDistributedDatabaseResponse>
                transformer =
                        StopDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>,
                        java.util.concurrent.Future<StopDistributedDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopDistributedDatabaseRequest, StopDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributedDatabaseResponse> updateDistributedDatabase(
            UpdateDistributedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDistributedDatabaseRequest, UpdateDistributedDatabaseResponse>
                    handler) {
        LOG.trace("Called async updateDistributedDatabase");
        final UpdateDistributedDatabaseRequest interceptedRequest =
                UpdateDistributedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDistributedDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "UpdateDistributedDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/UpdateDistributedDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDistributedDatabaseResponse>
                transformer =
                        UpdateDistributedDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDistributedDatabaseRequest, UpdateDistributedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDistributedDatabaseRequest,
                                UpdateDistributedDatabaseResponse>,
                        java.util.concurrent.Future<UpdateDistributedDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDistributedDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDistributedDatabaseRequest, UpdateDistributedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler) {
        LOG.trace("Called async uploadDistributedDatabaseSignedCertificateAndGenerateWallet");
        final UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest
                interceptedRequest =
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletConverter
                                .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadDistributedDatabaseSignedCertificateAndGenerateWalletConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "UploadDistributedDatabaseSignedCertificateAndGenerateWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/UploadDistributedDatabaseSignedCertificateAndGenerateWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
                transformer =
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                        UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                                UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>,
                        java.util.concurrent.Future<
                                UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletRequest,
                    UploadDistributedDatabaseSignedCertificateAndGenerateWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateDistributedDatabaseNetworkResponse>
            validateDistributedDatabaseNetwork(
                    ValidateDistributedDatabaseNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedDatabaseNetworkRequest,
                                    ValidateDistributedDatabaseNetworkResponse>
                            handler) {
        LOG.trace("Called async validateDistributedDatabaseNetwork");
        final ValidateDistributedDatabaseNetworkRequest interceptedRequest =
                ValidateDistributedDatabaseNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDistributedDatabaseNetworkConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedDbService",
                        "ValidateDistributedDatabaseNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/ValidateDistributedDatabaseNetwork");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ValidateDistributedDatabaseNetworkResponse>
                transformer =
                        ValidateDistributedDatabaseNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateDistributedDatabaseNetworkRequest,
                        ValidateDistributedDatabaseNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateDistributedDatabaseNetworkRequest,
                                ValidateDistributedDatabaseNetworkResponse>,
                        java.util.concurrent.Future<ValidateDistributedDatabaseNetworkResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateDistributedDatabaseNetworkRequest,
                    ValidateDistributedDatabaseNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
