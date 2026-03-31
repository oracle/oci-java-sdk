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
 * Async client implementation for DistributedAutonomousDbService service. <br/>
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
public class DistributedAutonomousDbServiceAsyncClient
        implements DistributedAutonomousDbServiceAsync {
    /**
     * Service instance for DistributedAutonomousDbService.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DistributedAutonomousDbServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedAutonomousDbServiceAsyncClient.class);

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
    public DistributedAutonomousDbServiceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
    public DistributedAutonomousDbServiceAsyncClient(
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
                            "DistributedAutonomousDbServiceAsyncClient",
                            "downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest,generateDistributedAutonomousDatabaseWallet"));
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
                    Builder, DistributedAutonomousDbServiceAsyncClient> {
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
        public DistributedAutonomousDbServiceAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DistributedAutonomousDbServiceAsyncClient(
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
    public java.util.concurrent.Future<AddDistributedAutonomousDatabaseGdsControlNodeResponse>
            addDistributedAutonomousDatabaseGdsControlNode(
                    AddDistributedAutonomousDatabaseGdsControlNodeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                                    AddDistributedAutonomousDatabaseGdsControlNodeResponse>
                            handler) {
        LOG.trace("Called async addDistributedAutonomousDatabaseGdsControlNode");
        final AddDistributedAutonomousDatabaseGdsControlNodeRequest interceptedRequest =
                AddDistributedAutonomousDatabaseGdsControlNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDistributedAutonomousDatabaseGdsControlNodeConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "AddDistributedAutonomousDatabaseGdsControlNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/AddDistributedAutonomousDatabaseGdsControlNode");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        AddDistributedAutonomousDatabaseGdsControlNodeResponse>
                transformer =
                        AddDistributedAutonomousDatabaseGdsControlNodeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                        AddDistributedAutonomousDatabaseGdsControlNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                                AddDistributedAutonomousDatabaseGdsControlNodeResponse>,
                        java.util.concurrent.Future<
                                AddDistributedAutonomousDatabaseGdsControlNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAddDistributedAutonomousDatabaseGdsControlNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDistributedAutonomousDatabaseGdsControlNodeRequest,
                    AddDistributedAutonomousDatabaseGdsControlNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedAutonomousDatabaseCompartmentResponse>
            changeDistributedAutonomousDatabaseCompartment(
                    ChangeDistributedAutonomousDatabaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedAutonomousDatabaseCompartmentRequest,
                                    ChangeDistributedAutonomousDatabaseCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDistributedAutonomousDatabaseCompartment");
        final ChangeDistributedAutonomousDatabaseCompartmentRequest interceptedRequest =
                ChangeDistributedAutonomousDatabaseCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDistributedAutonomousDatabaseCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ChangeDistributedAutonomousDatabaseCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ChangeDistributedAutonomousDatabaseCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDistributedAutonomousDatabaseCompartmentResponse>
                transformer =
                        ChangeDistributedAutonomousDatabaseCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDistributedAutonomousDatabaseCompartmentRequest,
                        ChangeDistributedAutonomousDatabaseCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDistributedAutonomousDatabaseCompartmentRequest,
                                ChangeDistributedAutonomousDatabaseCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDistributedAutonomousDatabaseCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDistributedAutonomousDatabaseCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDistributedAutonomousDatabaseCompartmentRequest,
                    ChangeDistributedAutonomousDatabaseCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDistributedAutonomousDbBackupConfigResponse>
            changeDistributedAutonomousDbBackupConfig(
                    ChangeDistributedAutonomousDbBackupConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedAutonomousDbBackupConfigRequest,
                                    ChangeDistributedAutonomousDbBackupConfigResponse>
                            handler) {
        LOG.trace("Called async changeDistributedAutonomousDbBackupConfig");
        final ChangeDistributedAutonomousDbBackupConfigRequest interceptedRequest =
                ChangeDistributedAutonomousDbBackupConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDistributedAutonomousDbBackupConfigConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ChangeDistributedAutonomousDbBackupConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ChangeDistributedAutonomousDbBackupConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeDistributedAutonomousDbBackupConfigResponse>
                transformer =
                        ChangeDistributedAutonomousDbBackupConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDistributedAutonomousDbBackupConfigRequest,
                        ChangeDistributedAutonomousDbBackupConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDistributedAutonomousDbBackupConfigRequest,
                                ChangeDistributedAutonomousDbBackupConfigResponse>,
                        java.util.concurrent.Future<
                                ChangeDistributedAutonomousDbBackupConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDistributedAutonomousDbBackupConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDistributedAutonomousDbBackupConfigRequest,
                    ChangeDistributedAutonomousDbBackupConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseGsmWalletResponse>
            configureDistributedAutonomousDatabaseGsmWallet(
                    ConfigureDistributedAutonomousDatabaseGsmWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseGsmWalletRequest,
                                    ConfigureDistributedAutonomousDatabaseGsmWalletResponse>
                            handler) {
        LOG.trace("Called async configureDistributedAutonomousDatabaseGsmWallet");
        final ConfigureDistributedAutonomousDatabaseGsmWalletRequest interceptedRequest =
                ConfigureDistributedAutonomousDatabaseGsmWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDistributedAutonomousDatabaseGsmWalletConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ConfigureDistributedAutonomousDatabaseGsmWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ConfigureDistributedAutonomousDatabaseGsmWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ConfigureDistributedAutonomousDatabaseGsmWalletResponse>
                transformer =
                        ConfigureDistributedAutonomousDatabaseGsmWalletConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDistributedAutonomousDatabaseGsmWalletRequest,
                        ConfigureDistributedAutonomousDatabaseGsmWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDistributedAutonomousDatabaseGsmWalletRequest,
                                ConfigureDistributedAutonomousDatabaseGsmWalletResponse>,
                        java.util.concurrent.Future<
                                ConfigureDistributedAutonomousDatabaseGsmWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getConfigureDistributedAutonomousDatabaseGsmWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDistributedAutonomousDatabaseGsmWalletRequest,
                    ConfigureDistributedAutonomousDatabaseGsmWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseGsmsResponse>
            configureDistributedAutonomousDatabaseGsms(
                    ConfigureDistributedAutonomousDatabaseGsmsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseGsmsRequest,
                                    ConfigureDistributedAutonomousDatabaseGsmsResponse>
                            handler) {
        LOG.trace("Called async configureDistributedAutonomousDatabaseGsms");
        final ConfigureDistributedAutonomousDatabaseGsmsRequest interceptedRequest =
                ConfigureDistributedAutonomousDatabaseGsmsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDistributedAutonomousDatabaseGsmsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ConfigureDistributedAutonomousDatabaseGsms",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ConfigureDistributedAutonomousDatabaseGsms");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ConfigureDistributedAutonomousDatabaseGsmsResponse>
                transformer =
                        ConfigureDistributedAutonomousDatabaseGsmsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDistributedAutonomousDatabaseGsmsRequest,
                        ConfigureDistributedAutonomousDatabaseGsmsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDistributedAutonomousDatabaseGsmsRequest,
                                ConfigureDistributedAutonomousDatabaseGsmsResponse>,
                        java.util.concurrent.Future<
                                ConfigureDistributedAutonomousDatabaseGsmsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getConfigureDistributedAutonomousDatabaseGsmsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDistributedAutonomousDatabaseGsmsRequest,
                    ConfigureDistributedAutonomousDatabaseGsmsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConfigureDistributedAutonomousDatabaseShardingResponse>
            configureDistributedAutonomousDatabaseSharding(
                    ConfigureDistributedAutonomousDatabaseShardingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDistributedAutonomousDatabaseShardingRequest,
                                    ConfigureDistributedAutonomousDatabaseShardingResponse>
                            handler) {
        LOG.trace("Called async configureDistributedAutonomousDatabaseSharding");
        final ConfigureDistributedAutonomousDatabaseShardingRequest interceptedRequest =
                ConfigureDistributedAutonomousDatabaseShardingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConfigureDistributedAutonomousDatabaseShardingConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ConfigureDistributedAutonomousDatabaseSharding",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ConfigureDistributedAutonomousDatabaseSharding");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ConfigureDistributedAutonomousDatabaseShardingResponse>
                transformer =
                        ConfigureDistributedAutonomousDatabaseShardingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConfigureDistributedAutonomousDatabaseShardingRequest,
                        ConfigureDistributedAutonomousDatabaseShardingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConfigureDistributedAutonomousDatabaseShardingRequest,
                                ConfigureDistributedAutonomousDatabaseShardingResponse>,
                        java.util.concurrent.Future<
                                ConfigureDistributedAutonomousDatabaseShardingResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConfigureDistributedAutonomousDatabaseShardingRequest,
                    ConfigureDistributedAutonomousDatabaseShardingResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDistributedAutonomousDatabaseResponse>
            createDistributedAutonomousDatabase(
                    CreateDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDistributedAutonomousDatabaseRequest,
                                    CreateDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async createDistributedAutonomousDatabase");
        final CreateDistributedAutonomousDatabaseRequest interceptedRequest =
                CreateDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDistributedAutonomousDatabaseConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "CreateDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDistributedAutonomousDatabaseResponse>
                transformer =
                        CreateDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDistributedAutonomousDatabaseRequest,
                        CreateDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDistributedAutonomousDatabaseRequest,
                                CreateDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<CreateDistributedAutonomousDatabaseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDistributedAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDistributedAutonomousDatabaseRequest,
                    CreateDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributedAutonomousDatabaseResponse>
            deleteDistributedAutonomousDatabase(
                    DeleteDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDistributedAutonomousDatabaseRequest,
                                    DeleteDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async deleteDistributedAutonomousDatabase");
        final DeleteDistributedAutonomousDatabaseRequest interceptedRequest =
                DeleteDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDistributedAutonomousDatabaseConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "DeleteDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/DeleteDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDistributedAutonomousDatabaseResponse>
                transformer =
                        DeleteDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDistributedAutonomousDatabaseRequest,
                        DeleteDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDistributedAutonomousDatabaseRequest,
                                DeleteDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<DeleteDistributedAutonomousDatabaseResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDistributedAutonomousDatabaseRequest,
                    DeleteDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler) {
        LOG.trace("Called async downloadDistributedAutonomousDatabaseGsmCertificateSigningRequest");
        final DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                interceptedRequest =
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                                .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                        .fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                transformer =
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                        DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>,
                        java.util.concurrent.Future<
                                DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                    DownloadDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
            generateDistributedAutonomousDatabaseGsmCertificateSigningRequest(
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                            handler) {
        LOG.trace("Called async generateDistributedAutonomousDatabaseGsmCertificateSigningRequest");
        final GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest
                interceptedRequest =
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                                .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                        .fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequest");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                transformer =
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                        GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                                GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>,
                        java.util.concurrent.Future<
                                GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestRequest,
                    GenerateDistributedAutonomousDatabaseGsmCertificateSigningRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateDistributedAutonomousDatabaseWalletResponse>
            generateDistributedAutonomousDatabaseWallet(
                    GenerateDistributedAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDistributedAutonomousDatabaseWalletRequest,
                                    GenerateDistributedAutonomousDatabaseWalletResponse>
                            handler) {
        LOG.trace("Called async generateDistributedAutonomousDatabaseWallet");
        final GenerateDistributedAutonomousDatabaseWalletRequest interceptedRequest =
                GenerateDistributedAutonomousDatabaseWalletConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDistributedAutonomousDatabaseWalletConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "GenerateDistributedAutonomousDatabaseWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/GenerateDistributedAutonomousDatabaseWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GenerateDistributedAutonomousDatabaseWalletResponse>
                transformer =
                        GenerateDistributedAutonomousDatabaseWalletConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GenerateDistributedAutonomousDatabaseWalletRequest,
                        GenerateDistributedAutonomousDatabaseWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateDistributedAutonomousDatabaseWalletRequest,
                                GenerateDistributedAutonomousDatabaseWalletResponse>,
                        java.util.concurrent.Future<
                                GenerateDistributedAutonomousDatabaseWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getGenerateDistributedAutonomousDatabaseWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateDistributedAutonomousDatabaseWalletRequest,
                    GenerateDistributedAutonomousDatabaseWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDistributedAutonomousDatabaseResponse>
            getDistributedAutonomousDatabase(
                    GetDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedAutonomousDatabaseRequest,
                                    GetDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async getDistributedAutonomousDatabase");
        final GetDistributedAutonomousDatabaseRequest interceptedRequest =
                GetDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDistributedAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "GetDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/GetDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDistributedAutonomousDatabaseResponse>
                transformer =
                        GetDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDistributedAutonomousDatabaseRequest,
                        GetDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDistributedAutonomousDatabaseRequest,
                                GetDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<GetDistributedAutonomousDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDistributedAutonomousDatabaseRequest,
                    GetDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDistributedAutonomousDatabaseRaftMetricResponse>
            getDistributedAutonomousDatabaseRaftMetric(
                    GetDistributedAutonomousDatabaseRaftMetricRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedAutonomousDatabaseRaftMetricRequest,
                                    GetDistributedAutonomousDatabaseRaftMetricResponse>
                            handler) {
        LOG.trace("Called async getDistributedAutonomousDatabaseRaftMetric");
        final GetDistributedAutonomousDatabaseRaftMetricRequest interceptedRequest =
                GetDistributedAutonomousDatabaseRaftMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDistributedAutonomousDatabaseRaftMetricConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "GetDistributedAutonomousDatabaseRaftMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabase/GetDistributedAutonomousDatabaseRaftMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetDistributedAutonomousDatabaseRaftMetricResponse>
                transformer =
                        GetDistributedAutonomousDatabaseRaftMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDistributedAutonomousDatabaseRaftMetricRequest,
                        GetDistributedAutonomousDatabaseRaftMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDistributedAutonomousDatabaseRaftMetricRequest,
                                GetDistributedAutonomousDatabaseRaftMetricResponse>,
                        java.util.concurrent.Future<
                                GetDistributedAutonomousDatabaseRaftMetricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDistributedAutonomousDatabaseRaftMetricRequest,
                    GetDistributedAutonomousDatabaseRaftMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDistributedAutonomousDatabasesResponse>
            listDistributedAutonomousDatabases(
                    ListDistributedAutonomousDatabasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDistributedAutonomousDatabasesRequest,
                                    ListDistributedAutonomousDatabasesResponse>
                            handler) {
        LOG.trace("Called async listDistributedAutonomousDatabases");
        final ListDistributedAutonomousDatabasesRequest interceptedRequest =
                ListDistributedAutonomousDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDistributedAutonomousDatabasesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ListDistributedAutonomousDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabaseCollection/ListDistributedAutonomousDatabases");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDistributedAutonomousDatabasesResponse>
                transformer =
                        ListDistributedAutonomousDatabasesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDistributedAutonomousDatabasesRequest,
                        ListDistributedAutonomousDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDistributedAutonomousDatabasesRequest,
                                ListDistributedAutonomousDatabasesResponse>,
                        java.util.concurrent.Future<ListDistributedAutonomousDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDistributedAutonomousDatabasesRequest,
                    ListDistributedAutonomousDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<MoveDistributedAutonomousDatabaseReplicationUnitResponse>
            moveDistributedAutonomousDatabaseReplicationUnit(
                    MoveDistributedAutonomousDatabaseReplicationUnitRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MoveDistributedAutonomousDatabaseReplicationUnitRequest,
                                    MoveDistributedAutonomousDatabaseReplicationUnitResponse>
                            handler) {
        LOG.trace("Called async moveDistributedAutonomousDatabaseReplicationUnit");
        final MoveDistributedAutonomousDatabaseReplicationUnitRequest interceptedRequest =
                MoveDistributedAutonomousDatabaseReplicationUnitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MoveDistributedAutonomousDatabaseReplicationUnitConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "MoveDistributedAutonomousDatabaseReplicationUnit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/MoveDistributedAutonomousDatabaseReplicationUnit");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        MoveDistributedAutonomousDatabaseReplicationUnitResponse>
                transformer =
                        MoveDistributedAutonomousDatabaseReplicationUnitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        MoveDistributedAutonomousDatabaseReplicationUnitRequest,
                        MoveDistributedAutonomousDatabaseReplicationUnitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MoveDistributedAutonomousDatabaseReplicationUnitRequest,
                                MoveDistributedAutonomousDatabaseReplicationUnitResponse>,
                        java.util.concurrent.Future<
                                MoveDistributedAutonomousDatabaseReplicationUnitResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getMoveDistributedAutonomousDatabaseReplicationUnitDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MoveDistributedAutonomousDatabaseReplicationUnitRequest,
                    MoveDistributedAutonomousDatabaseReplicationUnitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PatchDistributedAutonomousDatabaseResponse>
            patchDistributedAutonomousDatabase(
                    PatchDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchDistributedAutonomousDatabaseRequest,
                                    PatchDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async patchDistributedAutonomousDatabase");
        final PatchDistributedAutonomousDatabaseRequest interceptedRequest =
                PatchDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDistributedAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "PatchDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/PatchDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchDistributedAutonomousDatabaseResponse>
                transformer =
                        PatchDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchDistributedAutonomousDatabaseRequest,
                        PatchDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDistributedAutonomousDatabaseRequest,
                                PatchDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<PatchDistributedAutonomousDatabaseResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchDistributedAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDistributedAutonomousDatabaseRequest,
                    PatchDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RecreateFailedDistributedAutonomousDatabaseResourceResponse>
            recreateFailedDistributedAutonomousDatabaseResource(
                    RecreateFailedDistributedAutonomousDatabaseResourceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RecreateFailedDistributedAutonomousDatabaseResourceRequest,
                                    RecreateFailedDistributedAutonomousDatabaseResourceResponse>
                            handler) {
        LOG.trace("Called async recreateFailedDistributedAutonomousDatabaseResource");
        final RecreateFailedDistributedAutonomousDatabaseResourceRequest interceptedRequest =
                RecreateFailedDistributedAutonomousDatabaseResourceConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RecreateFailedDistributedAutonomousDatabaseResourceConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "RecreateFailedDistributedAutonomousDatabaseResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/RecreateFailedDistributedAutonomousDatabaseResource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RecreateFailedDistributedAutonomousDatabaseResourceResponse>
                transformer =
                        RecreateFailedDistributedAutonomousDatabaseResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RecreateFailedDistributedAutonomousDatabaseResourceRequest,
                        RecreateFailedDistributedAutonomousDatabaseResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RecreateFailedDistributedAutonomousDatabaseResourceRequest,
                                RecreateFailedDistributedAutonomousDatabaseResourceResponse>,
                        java.util.concurrent.Future<
                                RecreateFailedDistributedAutonomousDatabaseResourceResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RecreateFailedDistributedAutonomousDatabaseResourceRequest,
                    RecreateFailedDistributedAutonomousDatabaseResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RotateDistributedAutonomousDatabasePasswordsResponse>
            rotateDistributedAutonomousDatabasePasswords(
                    RotateDistributedAutonomousDatabasePasswordsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RotateDistributedAutonomousDatabasePasswordsRequest,
                                    RotateDistributedAutonomousDatabasePasswordsResponse>
                            handler) {
        LOG.trace("Called async rotateDistributedAutonomousDatabasePasswords");
        final RotateDistributedAutonomousDatabasePasswordsRequest interceptedRequest =
                RotateDistributedAutonomousDatabasePasswordsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RotateDistributedAutonomousDatabasePasswordsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "RotateDistributedAutonomousDatabasePasswords",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/RotateDistributedAutonomousDatabasePasswords");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        RotateDistributedAutonomousDatabasePasswordsResponse>
                transformer =
                        RotateDistributedAutonomousDatabasePasswordsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RotateDistributedAutonomousDatabasePasswordsRequest,
                        RotateDistributedAutonomousDatabasePasswordsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RotateDistributedAutonomousDatabasePasswordsRequest,
                                RotateDistributedAutonomousDatabasePasswordsResponse>,
                        java.util.concurrent.Future<
                                RotateDistributedAutonomousDatabasePasswordsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RotateDistributedAutonomousDatabasePasswordsRequest,
                    RotateDistributedAutonomousDatabasePasswordsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartDistributedAutonomousDatabaseResponse>
            startDistributedAutonomousDatabase(
                    StartDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    StartDistributedAutonomousDatabaseRequest,
                                    StartDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async startDistributedAutonomousDatabase");
        final StartDistributedAutonomousDatabaseRequest interceptedRequest =
                StartDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartDistributedAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "StartDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/StartDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, StartDistributedAutonomousDatabaseResponse>
                transformer =
                        StartDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        StartDistributedAutonomousDatabaseRequest,
                        StartDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartDistributedAutonomousDatabaseRequest,
                                StartDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<StartDistributedAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartDistributedAutonomousDatabaseRequest,
                    StartDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopDistributedAutonomousDatabaseResponse>
            stopDistributedAutonomousDatabase(
                    StopDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    StopDistributedAutonomousDatabaseRequest,
                                    StopDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async stopDistributedAutonomousDatabase");
        final StopDistributedAutonomousDatabaseRequest interceptedRequest =
                StopDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopDistributedAutonomousDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "StopDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/StopDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, StopDistributedAutonomousDatabaseResponse>
                transformer =
                        StopDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        StopDistributedAutonomousDatabaseRequest,
                        StopDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopDistributedAutonomousDatabaseRequest,
                                StopDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<StopDistributedAutonomousDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopDistributedAutonomousDatabaseRequest,
                    StopDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributedAutonomousDatabaseResponse>
            updateDistributedAutonomousDatabase(
                    UpdateDistributedAutonomousDatabaseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDistributedAutonomousDatabaseRequest,
                                    UpdateDistributedAutonomousDatabaseResponse>
                            handler) {
        LOG.trace("Called async updateDistributedAutonomousDatabase");
        final UpdateDistributedAutonomousDatabaseRequest interceptedRequest =
                UpdateDistributedAutonomousDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDistributedAutonomousDatabaseConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "UpdateDistributedAutonomousDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/UpdateDistributedAutonomousDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDistributedAutonomousDatabaseResponse>
                transformer =
                        UpdateDistributedAutonomousDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDistributedAutonomousDatabaseRequest,
                        UpdateDistributedAutonomousDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDistributedAutonomousDatabaseRequest,
                                UpdateDistributedAutonomousDatabaseResponse>,
                        java.util.concurrent.Future<UpdateDistributedAutonomousDatabaseResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDistributedAutonomousDatabaseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDistributedAutonomousDatabaseRequest,
                    UpdateDistributedAutonomousDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
            uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet(
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest
                            request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
                            handler) {
        LOG.trace(
                "Called async uploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet");
        final UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest
                interceptedRequest =
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletConverter
                                .interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletConverter
                        .fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWallet");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
                transformer =
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletConverter
                                .fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                        UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                                UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>,
                        java.util.concurrent.Future<
                                UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletRequest,
                    UploadDistributedAutonomousDatabaseSignedCertificateAndGenerateWalletResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateDistributedAutonomousDatabaseCaBundleResponse>
            validateDistributedAutonomousDatabaseCaBundle(
                    ValidateDistributedAutonomousDatabaseCaBundleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedAutonomousDatabaseCaBundleRequest,
                                    ValidateDistributedAutonomousDatabaseCaBundleResponse>
                            handler) {
        LOG.trace("Called async validateDistributedAutonomousDatabaseCaBundle");
        final ValidateDistributedAutonomousDatabaseCaBundleRequest interceptedRequest =
                ValidateDistributedAutonomousDatabaseCaBundleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDistributedAutonomousDatabaseCaBundleConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ValidateDistributedAutonomousDatabaseCaBundle",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ValidateDistributedAutonomousDatabaseCaBundle");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ValidateDistributedAutonomousDatabaseCaBundleResponse>
                transformer =
                        ValidateDistributedAutonomousDatabaseCaBundleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateDistributedAutonomousDatabaseCaBundleRequest,
                        ValidateDistributedAutonomousDatabaseCaBundleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateDistributedAutonomousDatabaseCaBundleRequest,
                                ValidateDistributedAutonomousDatabaseCaBundleResponse>,
                        java.util.concurrent.Future<
                                ValidateDistributedAutonomousDatabaseCaBundleResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateDistributedAutonomousDatabaseCaBundleRequest,
                    ValidateDistributedAutonomousDatabaseCaBundleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateDistributedAutonomousDatabaseNetworkResponse>
            validateDistributedAutonomousDatabaseNetwork(
                    ValidateDistributedAutonomousDatabaseNetworkRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDistributedAutonomousDatabaseNetworkRequest,
                                    ValidateDistributedAutonomousDatabaseNetworkResponse>
                            handler) {
        LOG.trace("Called async validateDistributedAutonomousDatabaseNetwork");
        final ValidateDistributedAutonomousDatabaseNetworkRequest interceptedRequest =
                ValidateDistributedAutonomousDatabaseNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateDistributedAutonomousDatabaseNetworkConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DistributedAutonomousDbService",
                        "ValidateDistributedAutonomousDatabaseNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedAutonomousDatabase/ValidateDistributedAutonomousDatabaseNetwork");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ValidateDistributedAutonomousDatabaseNetworkResponse>
                transformer =
                        ValidateDistributedAutonomousDatabaseNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ValidateDistributedAutonomousDatabaseNetworkRequest,
                        ValidateDistributedAutonomousDatabaseNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateDistributedAutonomousDatabaseNetworkRequest,
                                ValidateDistributedAutonomousDatabaseNetworkResponse>,
                        java.util.concurrent.Future<
                                ValidateDistributedAutonomousDatabaseNetworkResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateDistributedAutonomousDatabaseNetworkRequest,
                    ValidateDistributedAutonomousDatabaseNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
