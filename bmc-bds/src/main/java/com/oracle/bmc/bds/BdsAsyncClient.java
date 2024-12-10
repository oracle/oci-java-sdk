/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.bds.internal.http.*;
import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

/**
 * Async client implementation for Bds service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class BdsAsyncClient implements BdsAsync {
    /**
     * Service instance for Bds.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BDS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://bigdataservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BdsAsyncClient.class);

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
    public BdsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BdsAsyncClient> {
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
        public BdsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new BdsAsyncClient(
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
    public java.util.concurrent.Future<ActivateBdsMetastoreConfigurationResponse>
            activateBdsMetastoreConfiguration(
                    ActivateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateBdsMetastoreConfigurationRequest,
                                    ActivateBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async activateBdsMetastoreConfiguration");
        final ActivateBdsMetastoreConfigurationRequest interceptedRequest =
                ActivateBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ActivateBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/ActivateBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ActivateBdsMetastoreConfigurationResponse>
                transformer =
                        ActivateBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ActivateBdsMetastoreConfigurationRequest,
                        ActivateBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ActivateBdsMetastoreConfigurationRequest,
                                ActivateBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<ActivateBdsMetastoreConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getActivateBdsMetastoreConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ActivateBdsMetastoreConfigurationRequest,
                    ActivateBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddAutoScalingConfigurationResponse>
            addAutoScalingConfiguration(
                    AddAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddAutoScalingConfigurationRequest,
                                    AddAutoScalingConfigurationResponse>
                            handler) {
        LOG.trace("Called async addAutoScalingConfiguration");
        final AddAutoScalingConfigurationRequest interceptedRequest =
                AddAutoScalingConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddAutoScalingConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddAutoScalingConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddAutoScalingConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddAutoScalingConfigurationResponse>
                transformer =
                        AddAutoScalingConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddAutoScalingConfigurationRequest, AddAutoScalingConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddAutoScalingConfigurationRequest,
                                AddAutoScalingConfigurationResponse>,
                        java.util.concurrent.Future<AddAutoScalingConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddAutoScalingConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddAutoScalingConfigurationRequest, AddAutoScalingConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddBlockStorageResponse> addBlockStorage(
            AddBlockStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddBlockStorageRequest, AddBlockStorageResponse>
                    handler) {
        LOG.trace("Called async addBlockStorage");
        final AddBlockStorageRequest interceptedRequest =
                AddBlockStorageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddBlockStorageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddBlockStorage",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddBlockStorage");
        final java.util.function.Function<javax.ws.rs.core.Response, AddBlockStorageResponse>
                transformer =
                        AddBlockStorageConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddBlockStorageRequest, AddBlockStorageResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddBlockStorageRequest, AddBlockStorageResponse>,
                        java.util.concurrent.Future<AddBlockStorageResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddBlockStorageDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddBlockStorageRequest, AddBlockStorageResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddCloudSqlResponse> addCloudSql(
            AddCloudSqlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddCloudSqlRequest, AddCloudSqlResponse>
                    handler) {
        LOG.trace("Called async addCloudSql");
        final AddCloudSqlRequest interceptedRequest =
                AddCloudSqlConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddCloudSqlConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddCloudSql",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddCloudSql");
        final java.util.function.Function<javax.ws.rs.core.Response, AddCloudSqlResponse>
                transformer =
                        AddCloudSqlConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddCloudSqlRequest, AddCloudSqlResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddCloudSqlRequest, AddCloudSqlResponse>,
                        java.util.concurrent.Future<AddCloudSqlResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddCloudSqlDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddCloudSqlRequest, AddCloudSqlResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddKafkaResponse> addKafka(
            AddKafkaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddKafkaRequest, AddKafkaResponse>
                    handler) {
        LOG.trace("Called async addKafka");
        final AddKafkaRequest interceptedRequest = AddKafkaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddKafkaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddKafka",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddKafka");
        final java.util.function.Function<javax.ws.rs.core.Response, AddKafkaResponse> transformer =
                AddKafkaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddKafkaRequest, AddKafkaResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<AddKafkaRequest, AddKafkaResponse>,
                        java.util.concurrent.Future<AddKafkaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddKafkaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddKafkaRequest, AddKafkaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddMasterNodesResponse> addMasterNodes(
            AddMasterNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMasterNodesRequest, AddMasterNodesResponse>
                    handler) {
        LOG.trace("Called async addMasterNodes");
        final AddMasterNodesRequest interceptedRequest =
                AddMasterNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddMasterNodesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddMasterNodes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddMasterNodes");
        final java.util.function.Function<javax.ws.rs.core.Response, AddMasterNodesResponse>
                transformer =
                        AddMasterNodesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddMasterNodesRequest, AddMasterNodesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddMasterNodesRequest, AddMasterNodesResponse>,
                        java.util.concurrent.Future<AddMasterNodesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddMasterNodesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddMasterNodesRequest, AddMasterNodesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddUtilityNodesResponse> addUtilityNodes(
            AddUtilityNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddUtilityNodesRequest, AddUtilityNodesResponse>
                    handler) {
        LOG.trace("Called async addUtilityNodes");
        final AddUtilityNodesRequest interceptedRequest =
                AddUtilityNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddUtilityNodesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddUtilityNodes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddUtilityNodes");
        final java.util.function.Function<javax.ws.rs.core.Response, AddUtilityNodesResponse>
                transformer =
                        AddUtilityNodesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddUtilityNodesRequest, AddUtilityNodesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddUtilityNodesRequest, AddUtilityNodesResponse>,
                        java.util.concurrent.Future<AddUtilityNodesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddUtilityNodesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddUtilityNodesRequest, AddUtilityNodesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddWorkerNodesResponse> addWorkerNodes(
            AddWorkerNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddWorkerNodesRequest, AddWorkerNodesResponse>
                    handler) {
        LOG.trace("Called async addWorkerNodes");
        final AddWorkerNodesRequest interceptedRequest =
                AddWorkerNodesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddWorkerNodesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "AddWorkerNodes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddWorkerNodes");
        final java.util.function.Function<javax.ws.rs.core.Response, AddWorkerNodesResponse>
                transformer =
                        AddWorkerNodesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddWorkerNodesRequest, AddWorkerNodesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddWorkerNodesRequest, AddWorkerNodesResponse>,
                        java.util.concurrent.Future<AddWorkerNodesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddWorkerNodesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddWorkerNodesRequest, AddWorkerNodesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BackupNodeResponse> backupNode(
            BackupNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BackupNodeRequest, BackupNodeResponse>
                    handler) {
        LOG.trace("Called async backupNode");
        final BackupNodeRequest interceptedRequest = BackupNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BackupNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "BackupNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/BackupNode");
        final java.util.function.Function<javax.ws.rs.core.Response, BackupNodeResponse>
                transformer =
                        BackupNodeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BackupNodeRequest, BackupNodeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BackupNodeRequest, BackupNodeResponse>,
                        java.util.concurrent.Future<BackupNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBackupNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BackupNodeRequest, BackupNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CertificateServiceInfoResponse> certificateServiceInfo(
            CertificateServiceInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CertificateServiceInfoRequest, CertificateServiceInfoResponse>
                    handler) {
        LOG.trace("Called async certificateServiceInfo");
        final CertificateServiceInfoRequest interceptedRequest =
                CertificateServiceInfoConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CertificateServiceInfoConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CertificateServiceInfo",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CertificateServiceInfo");
        final java.util.function.Function<javax.ws.rs.core.Response, CertificateServiceInfoResponse>
                transformer =
                        CertificateServiceInfoConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CertificateServiceInfoRequest, CertificateServiceInfoResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CertificateServiceInfoRequest, CertificateServiceInfoResponse>,
                        java.util.concurrent.Future<CertificateServiceInfoResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCertificateServiceInfoDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CertificateServiceInfoRequest, CertificateServiceInfoResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeBdsInstanceCompartmentResponse>
            changeBdsInstanceCompartment(
                    ChangeBdsInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBdsInstanceCompartmentRequest,
                                    ChangeBdsInstanceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeBdsInstanceCompartment");
        final ChangeBdsInstanceCompartmentRequest interceptedRequest =
                ChangeBdsInstanceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeBdsInstanceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ChangeBdsInstanceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ChangeBdsInstanceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeBdsInstanceCompartmentResponse>
                transformer =
                        ChangeBdsInstanceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeBdsInstanceCompartmentRequest, ChangeBdsInstanceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeBdsInstanceCompartmentRequest,
                                ChangeBdsInstanceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeBdsInstanceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeBdsInstanceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeBdsInstanceCompartmentRequest, ChangeBdsInstanceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeShapeResponse> changeShape(
            ChangeShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ChangeShapeRequest, ChangeShapeResponse>
                    handler) {
        LOG.trace("Called async changeShape");
        final ChangeShapeRequest interceptedRequest =
                ChangeShapeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeShapeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ChangeShape",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ChangeShape");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeShapeResponse>
                transformer =
                        ChangeShapeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ChangeShapeRequest, ChangeShapeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeShapeRequest, ChangeShapeResponse>,
                        java.util.concurrent.Future<ChangeShapeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeShapeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeShapeRequest, ChangeShapeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBdsApiKeyResponse> createBdsApiKey(
            CreateBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>
                    handler) {
        LOG.trace("Called async createBdsApiKey");
        final CreateBdsApiKeyRequest interceptedRequest =
                CreateBdsApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBdsApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateBdsApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/CreateBdsApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBdsApiKeyResponse>
                transformer =
                        CreateBdsApiKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>,
                        java.util.concurrent.Future<CreateBdsApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBdsApiKeyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBdsInstanceResponse> createBdsInstance(
            CreateBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsInstanceRequest, CreateBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async createBdsInstance");
        final CreateBdsInstanceRequest interceptedRequest =
                CreateBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateBdsInstanceResponse>
                transformer =
                        CreateBdsInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateBdsInstanceRequest, CreateBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBdsInstanceRequest, CreateBdsInstanceResponse>,
                        java.util.concurrent.Future<CreateBdsInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBdsInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBdsInstanceRequest, CreateBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBdsMetastoreConfigurationResponse>
            createBdsMetastoreConfiguration(
                    CreateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateBdsMetastoreConfigurationRequest,
                                    CreateBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async createBdsMetastoreConfiguration");
        final CreateBdsMetastoreConfigurationRequest interceptedRequest =
                CreateBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/CreateBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateBdsMetastoreConfigurationResponse>
                transformer =
                        CreateBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBdsMetastoreConfigurationRequest,
                        CreateBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBdsMetastoreConfigurationRequest,
                                CreateBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<CreateBdsMetastoreConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBdsMetastoreConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBdsMetastoreConfigurationRequest,
                    CreateBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNodeBackupConfigurationResponse>
            createNodeBackupConfiguration(
                    CreateNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeBackupConfigurationRequest,
                                    CreateNodeBackupConfigurationResponse>
                            handler) {
        LOG.trace("Called async createNodeBackupConfiguration");
        final CreateNodeBackupConfigurationRequest interceptedRequest =
                CreateNodeBackupConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNodeBackupConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateNodeBackupConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateNodeBackupConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateNodeBackupConfigurationResponse>
                transformer =
                        CreateNodeBackupConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNodeBackupConfigurationRequest, CreateNodeBackupConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNodeBackupConfigurationRequest,
                                CreateNodeBackupConfigurationResponse>,
                        java.util.concurrent.Future<CreateNodeBackupConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNodeBackupConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNodeBackupConfigurationRequest, CreateNodeBackupConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNodeReplaceConfigurationResponse>
            createNodeReplaceConfiguration(
                    CreateNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeReplaceConfigurationRequest,
                                    CreateNodeReplaceConfigurationResponse>
                            handler) {
        LOG.trace("Called async createNodeReplaceConfiguration");
        final CreateNodeReplaceConfigurationRequest interceptedRequest =
                CreateNodeReplaceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNodeReplaceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateNodeReplaceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateNodeReplaceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateNodeReplaceConfigurationResponse>
                transformer =
                        CreateNodeReplaceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNodeReplaceConfigurationRequest,
                        CreateNodeReplaceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNodeReplaceConfigurationRequest,
                                CreateNodeReplaceConfigurationResponse>,
                        java.util.concurrent.Future<CreateNodeReplaceConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNodeReplaceConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNodeReplaceConfigurationRequest, CreateNodeReplaceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateResourcePrincipalConfigurationResponse>
            createResourcePrincipalConfiguration(
                    CreateResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateResourcePrincipalConfigurationRequest,
                                    CreateResourcePrincipalConfigurationResponse>
                            handler) {
        LOG.trace("Called async createResourcePrincipalConfiguration");
        final CreateResourcePrincipalConfigurationRequest interceptedRequest =
                CreateResourcePrincipalConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateResourcePrincipalConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "CreateResourcePrincipalConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateResourcePrincipalConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateResourcePrincipalConfigurationResponse>
                transformer =
                        CreateResourcePrincipalConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateResourcePrincipalConfigurationRequest,
                        CreateResourcePrincipalConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateResourcePrincipalConfigurationRequest,
                                CreateResourcePrincipalConfigurationResponse>,
                        java.util.concurrent.Future<CreateResourcePrincipalConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateResourcePrincipalConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateResourcePrincipalConfigurationRequest,
                    CreateResourcePrincipalConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsApiKeyResponse> deleteBdsApiKey(
            DeleteBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteBdsApiKey");
        final DeleteBdsApiKeyRequest interceptedRequest =
                DeleteBdsApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBdsApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DeleteBdsApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/DeleteBdsApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBdsApiKeyResponse>
                transformer =
                        DeleteBdsApiKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>,
                        java.util.concurrent.Future<DeleteBdsApiKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsInstanceResponse> deleteBdsInstance(
            DeleteBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async deleteBdsInstance");
        final DeleteBdsInstanceRequest interceptedRequest =
                DeleteBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DeleteBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/DeleteBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteBdsInstanceResponse>
                transformer =
                        DeleteBdsInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>,
                        java.util.concurrent.Future<DeleteBdsInstanceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsMetastoreConfigurationResponse>
            deleteBdsMetastoreConfiguration(
                    DeleteBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteBdsMetastoreConfigurationRequest,
                                    DeleteBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async deleteBdsMetastoreConfiguration");
        final DeleteBdsMetastoreConfigurationRequest interceptedRequest =
                DeleteBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DeleteBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/DeleteBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteBdsMetastoreConfigurationResponse>
                transformer =
                        DeleteBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBdsMetastoreConfigurationRequest,
                        DeleteBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBdsMetastoreConfigurationRequest,
                                DeleteBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<DeleteBdsMetastoreConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBdsMetastoreConfigurationRequest,
                    DeleteBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeBackupResponse> deleteNodeBackup(
            DeleteNodeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNodeBackupRequest, DeleteNodeBackupResponse>
                    handler) {
        LOG.trace("Called async deleteNodeBackup");
        final DeleteNodeBackupRequest interceptedRequest =
                DeleteNodeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNodeBackupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DeleteNodeBackup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeBackup/DeleteNodeBackup");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNodeBackupResponse>
                transformer =
                        DeleteNodeBackupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteNodeBackupRequest, DeleteNodeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNodeBackupRequest, DeleteNodeBackupResponse>,
                        java.util.concurrent.Future<DeleteNodeBackupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNodeBackupRequest, DeleteNodeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeBackupConfigurationResponse>
            deleteNodeBackupConfiguration(
                    DeleteNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNodeBackupConfigurationRequest,
                                    DeleteNodeBackupConfigurationResponse>
                            handler) {
        LOG.trace("Called async deleteNodeBackupConfiguration");
        final DeleteNodeBackupConfigurationRequest interceptedRequest =
                DeleteNodeBackupConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNodeBackupConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DeleteNodeBackupConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeBackupConfiguration/DeleteNodeBackupConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteNodeBackupConfigurationResponse>
                transformer =
                        DeleteNodeBackupConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNodeBackupConfigurationRequest, DeleteNodeBackupConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNodeBackupConfigurationRequest,
                                DeleteNodeBackupConfigurationResponse>,
                        java.util.concurrent.Future<DeleteNodeBackupConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNodeBackupConfigurationRequest, DeleteNodeBackupConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableCertificateResponse> disableCertificate(
            DisableCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableCertificateRequest, DisableCertificateResponse>
                    handler) {
        LOG.trace("Called async disableCertificate");
        final DisableCertificateRequest interceptedRequest =
                DisableCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "DisableCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/DisableCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, DisableCertificateResponse>
                transformer =
                        DisableCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DisableCertificateRequest, DisableCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableCertificateRequest, DisableCertificateResponse>,
                        java.util.concurrent.Future<DisableCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableCertificateRequest, DisableCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableCertificateResponse> enableCertificate(
            EnableCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableCertificateRequest, EnableCertificateResponse>
                    handler) {
        LOG.trace("Called async enableCertificate");
        final EnableCertificateRequest interceptedRequest =
                EnableCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "EnableCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/EnableCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, EnableCertificateResponse>
                transformer =
                        EnableCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<EnableCertificateRequest, EnableCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableCertificateRequest, EnableCertificateResponse>,
                        java.util.concurrent.Future<EnableCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableCertificateRequest, EnableCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExecuteBootstrapScriptResponse> executeBootstrapScript(
            ExecuteBootstrapScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>
                    handler) {
        LOG.trace("Called async executeBootstrapScript");
        final ExecuteBootstrapScriptRequest interceptedRequest =
                ExecuteBootstrapScriptConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExecuteBootstrapScriptConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ExecuteBootstrapScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ExecuteBootstrapScript");
        final java.util.function.Function<javax.ws.rs.core.Response, ExecuteBootstrapScriptResponse>
                transformer =
                        ExecuteBootstrapScriptConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>,
                        java.util.concurrent.Future<ExecuteBootstrapScriptResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getExecuteBootstrapScriptDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ForceRefreshResourcePrincipalResponse>
            forceRefreshResourcePrincipal(
                    ForceRefreshResourcePrincipalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ForceRefreshResourcePrincipalRequest,
                                    ForceRefreshResourcePrincipalResponse>
                            handler) {
        LOG.trace("Called async forceRefreshResourcePrincipal");
        final ForceRefreshResourcePrincipalRequest interceptedRequest =
                ForceRefreshResourcePrincipalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ForceRefreshResourcePrincipalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ForceRefreshResourcePrincipal",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ForceRefreshResourcePrincipal");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ForceRefreshResourcePrincipalResponse>
                transformer =
                        ForceRefreshResourcePrincipalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ForceRefreshResourcePrincipalRequest, ForceRefreshResourcePrincipalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ForceRefreshResourcePrincipalRequest,
                                ForceRefreshResourcePrincipalResponse>,
                        java.util.concurrent.Future<ForceRefreshResourcePrincipalResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getForceRefreshResourcePrincipalDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ForceRefreshResourcePrincipalRequest, ForceRefreshResourcePrincipalResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAutoScalingConfigurationResponse>
            getAutoScalingConfiguration(
                    GetAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutoScalingConfigurationRequest,
                                    GetAutoScalingConfigurationResponse>
                            handler) {
        LOG.trace("Called async getAutoScalingConfiguration");
        final GetAutoScalingConfigurationRequest interceptedRequest =
                GetAutoScalingConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAutoScalingConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetAutoScalingConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetAutoScalingConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAutoScalingConfigurationResponse>
                transformer =
                        GetAutoScalingConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAutoScalingConfigurationRequest,
                                GetAutoScalingConfigurationResponse>,
                        java.util.concurrent.Future<GetAutoScalingConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBdsApiKeyResponse> getBdsApiKey(
            GetBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBdsApiKeyRequest, GetBdsApiKeyResponse>
                    handler) {
        LOG.trace("Called async getBdsApiKey");
        final GetBdsApiKeyRequest interceptedRequest =
                GetBdsApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBdsApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetBdsApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/GetBdsApiKey");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBdsApiKeyResponse>
                transformer =
                        GetBdsApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBdsApiKeyRequest, GetBdsApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBdsApiKeyRequest, GetBdsApiKeyResponse>,
                        java.util.concurrent.Future<GetBdsApiKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBdsApiKeyRequest, GetBdsApiKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBdsInstanceResponse> getBdsInstance(
            GetBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBdsInstanceRequest, GetBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async getBdsInstance");
        final GetBdsInstanceRequest interceptedRequest =
                GetBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBdsInstanceResponse>
                transformer =
                        GetBdsInstanceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBdsInstanceRequest, GetBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBdsInstanceRequest, GetBdsInstanceResponse>,
                        java.util.concurrent.Future<GetBdsInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBdsInstanceRequest, GetBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBdsMetastoreConfigurationResponse>
            getBdsMetastoreConfiguration(
                    GetBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetBdsMetastoreConfigurationRequest,
                                    GetBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async getBdsMetastoreConfiguration");
        final GetBdsMetastoreConfigurationRequest interceptedRequest =
                GetBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/GetBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetBdsMetastoreConfigurationResponse>
                transformer =
                        GetBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBdsMetastoreConfigurationRequest,
                                GetBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<GetBdsMetastoreConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNodeBackupResponse> getNodeBackup(
            GetNodeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNodeBackupRequest, GetNodeBackupResponse>
                    handler) {
        LOG.trace("Called async getNodeBackup");
        final GetNodeBackupRequest interceptedRequest =
                GetNodeBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNodeBackupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetNodeBackup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeBackup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNodeBackupResponse>
                transformer =
                        GetNodeBackupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNodeBackupRequest, GetNodeBackupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNodeBackupRequest, GetNodeBackupResponse>,
                        java.util.concurrent.Future<GetNodeBackupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNodeBackupRequest, GetNodeBackupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNodeBackupConfigurationResponse>
            getNodeBackupConfiguration(
                    GetNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNodeBackupConfigurationRequest,
                                    GetNodeBackupConfigurationResponse>
                            handler) {
        LOG.trace("Called async getNodeBackupConfiguration");
        final GetNodeBackupConfigurationRequest interceptedRequest =
                GetNodeBackupConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNodeBackupConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetNodeBackupConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeBackupConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetNodeBackupConfigurationResponse>
                transformer =
                        GetNodeBackupConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNodeBackupConfigurationRequest,
                                GetNodeBackupConfigurationResponse>,
                        java.util.concurrent.Future<GetNodeBackupConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNodeReplaceConfigurationResponse>
            getNodeReplaceConfiguration(
                    GetNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNodeReplaceConfigurationRequest,
                                    GetNodeReplaceConfigurationResponse>
                            handler) {
        LOG.trace("Called async getNodeReplaceConfiguration");
        final GetNodeReplaceConfigurationRequest interceptedRequest =
                GetNodeReplaceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNodeReplaceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetNodeReplaceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeReplaceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetNodeReplaceConfigurationResponse>
                transformer =
                        GetNodeReplaceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNodeReplaceConfigurationRequest,
                                GetNodeReplaceConfigurationResponse>,
                        java.util.concurrent.Future<GetNodeReplaceConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetOsPatchDetailsResponse> getOsPatchDetails(
            GetOsPatchDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>
                    handler) {
        LOG.trace("Called async getOsPatchDetails");
        final GetOsPatchDetailsRequest interceptedRequest =
                GetOsPatchDetailsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOsPatchDetailsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetOsPatchDetails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetOsPatchDetails");
        final java.util.function.Function<javax.ws.rs.core.Response, GetOsPatchDetailsResponse>
                transformer =
                        GetOsPatchDetailsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>,
                        java.util.concurrent.Future<GetOsPatchDetailsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResourcePrincipalConfigurationResponse>
            getResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetResourcePrincipalConfigurationRequest,
                                    GetResourcePrincipalConfigurationResponse>
                            handler) {
        LOG.trace("Called async getResourcePrincipalConfiguration");
        final GetResourcePrincipalConfigurationRequest interceptedRequest =
                GetResourcePrincipalConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResourcePrincipalConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "GetResourcePrincipalConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetResourcePrincipalConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetResourcePrincipalConfigurationResponse>
                transformer =
                        GetResourcePrincipalConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetResourcePrincipalConfigurationRequest,
                        GetResourcePrincipalConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResourcePrincipalConfigurationRequest,
                                GetResourcePrincipalConfigurationResponse>,
                        java.util.concurrent.Future<GetResourcePrincipalConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResourcePrincipalConfigurationRequest,
                    GetResourcePrincipalConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Bds",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<InstallOsPatchResponse> installOsPatch(
            InstallOsPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InstallOsPatchRequest, InstallOsPatchResponse>
                    handler) {
        LOG.trace("Called async installOsPatch");
        final InstallOsPatchRequest interceptedRequest =
                InstallOsPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallOsPatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "InstallOsPatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/InstallOsPatch");
        final java.util.function.Function<javax.ws.rs.core.Response, InstallOsPatchResponse>
                transformer =
                        InstallOsPatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<InstallOsPatchRequest, InstallOsPatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallOsPatchRequest, InstallOsPatchResponse>,
                        java.util.concurrent.Future<InstallOsPatchResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstallOsPatchDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallOsPatchRequest, InstallOsPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<InstallPatchResponse> installPatch(
            InstallPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<InstallPatchRequest, InstallPatchResponse>
                    handler) {
        LOG.trace("Called async installPatch");
        final InstallPatchRequest interceptedRequest =
                InstallPatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "InstallPatch",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/InstallPatch");
        final java.util.function.Function<javax.ws.rs.core.Response, InstallPatchResponse>
                transformer =
                        InstallPatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<InstallPatchRequest, InstallPatchResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                InstallPatchRequest, InstallPatchResponse>,
                        java.util.concurrent.Future<InstallPatchResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstallPatchDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    InstallPatchRequest, InstallPatchResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurations(
                    ListAutoScalingConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutoScalingConfigurationsRequest,
                                    ListAutoScalingConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listAutoScalingConfigurations");
        final ListAutoScalingConfigurationsRequest interceptedRequest =
                ListAutoScalingConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAutoScalingConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListAutoScalingConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListAutoScalingConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAutoScalingConfigurationsResponse>
                transformer =
                        ListAutoScalingConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAutoScalingConfigurationsRequest, ListAutoScalingConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAutoScalingConfigurationsRequest,
                                ListAutoScalingConfigurationsResponse>,
                        java.util.concurrent.Future<ListAutoScalingConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAutoScalingConfigurationsRequest, ListAutoScalingConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBdsApiKeysResponse> listBdsApiKeys(
            ListBdsApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBdsApiKeysRequest, ListBdsApiKeysResponse>
                    handler) {
        LOG.trace("Called async listBdsApiKeys");
        final ListBdsApiKeysRequest interceptedRequest =
                ListBdsApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBdsApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListBdsApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/ListBdsApiKeys");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBdsApiKeysResponse>
                transformer =
                        ListBdsApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBdsApiKeysRequest, ListBdsApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBdsApiKeysRequest, ListBdsApiKeysResponse>,
                        java.util.concurrent.Future<ListBdsApiKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBdsApiKeysRequest, ListBdsApiKeysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBdsInstancesResponse> listBdsInstances(
            ListBdsInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBdsInstancesRequest, ListBdsInstancesResponse>
                    handler) {
        LOG.trace("Called async listBdsInstances");
        final ListBdsInstancesRequest interceptedRequest =
                ListBdsInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBdsInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListBdsInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstanceSummary/ListBdsInstances");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBdsInstancesResponse>
                transformer =
                        ListBdsInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListBdsInstancesRequest, ListBdsInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBdsInstancesRequest, ListBdsInstancesResponse>,
                        java.util.concurrent.Future<ListBdsInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBdsInstancesRequest, ListBdsInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBdsMetastoreConfigurationsResponse>
            listBdsMetastoreConfigurations(
                    ListBdsMetastoreConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBdsMetastoreConfigurationsRequest,
                                    ListBdsMetastoreConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listBdsMetastoreConfigurations");
        final ListBdsMetastoreConfigurationsRequest interceptedRequest =
                ListBdsMetastoreConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBdsMetastoreConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListBdsMetastoreConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/ListBdsMetastoreConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListBdsMetastoreConfigurationsResponse>
                transformer =
                        ListBdsMetastoreConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBdsMetastoreConfigurationsRequest,
                        ListBdsMetastoreConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBdsMetastoreConfigurationsRequest,
                                ListBdsMetastoreConfigurationsResponse>,
                        java.util.concurrent.Future<ListBdsMetastoreConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBdsMetastoreConfigurationsRequest, ListBdsMetastoreConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNodeBackupConfigurationsResponse>
            listNodeBackupConfigurations(
                    ListNodeBackupConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNodeBackupConfigurationsRequest,
                                    ListNodeBackupConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listNodeBackupConfigurations");
        final ListNodeBackupConfigurationsRequest interceptedRequest =
                ListNodeBackupConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNodeBackupConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListNodeBackupConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeBackupConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNodeBackupConfigurationsResponse>
                transformer =
                        ListNodeBackupConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNodeBackupConfigurationsRequest, ListNodeBackupConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNodeBackupConfigurationsRequest,
                                ListNodeBackupConfigurationsResponse>,
                        java.util.concurrent.Future<ListNodeBackupConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNodeBackupConfigurationsRequest, ListNodeBackupConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNodeBackupsResponse> listNodeBackups(
            ListNodeBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNodeBackupsRequest, ListNodeBackupsResponse>
                    handler) {
        LOG.trace("Called async listNodeBackups");
        final ListNodeBackupsRequest interceptedRequest =
                ListNodeBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNodeBackupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListNodeBackups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeBackups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNodeBackupsResponse>
                transformer =
                        ListNodeBackupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListNodeBackupsRequest, ListNodeBackupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNodeBackupsRequest, ListNodeBackupsResponse>,
                        java.util.concurrent.Future<ListNodeBackupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNodeBackupsRequest, ListNodeBackupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNodeReplaceConfigurationsResponse>
            listNodeReplaceConfigurations(
                    ListNodeReplaceConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNodeReplaceConfigurationsRequest,
                                    ListNodeReplaceConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listNodeReplaceConfigurations");
        final ListNodeReplaceConfigurationsRequest interceptedRequest =
                ListNodeReplaceConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNodeReplaceConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListNodeReplaceConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeReplaceConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNodeReplaceConfigurationsResponse>
                transformer =
                        ListNodeReplaceConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNodeReplaceConfigurationsRequest, ListNodeReplaceConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNodeReplaceConfigurationsRequest,
                                ListNodeReplaceConfigurationsResponse>,
                        java.util.concurrent.Future<ListNodeReplaceConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNodeReplaceConfigurationsRequest, ListNodeReplaceConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListOsPatchesResponse> listOsPatches(
            ListOsPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListOsPatchesRequest, ListOsPatchesResponse>
                    handler) {
        LOG.trace("Called async listOsPatches");
        final ListOsPatchesRequest interceptedRequest =
                ListOsPatchesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOsPatchesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListOsPatches",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListOsPatches");
        final java.util.function.Function<javax.ws.rs.core.Response, ListOsPatchesResponse>
                transformer =
                        ListOsPatchesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListOsPatchesRequest, ListOsPatchesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOsPatchesRequest, ListOsPatchesResponse>,
                        java.util.concurrent.Future<ListOsPatchesResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOsPatchesRequest, ListOsPatchesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPatchHistoriesResponse> listPatchHistories(
            ListPatchHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPatchHistoriesRequest, ListPatchHistoriesResponse>
                    handler) {
        LOG.trace("Called async listPatchHistories");
        final ListPatchHistoriesRequest interceptedRequest =
                ListPatchHistoriesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatchHistoriesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListPatchHistories",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListPatchHistories");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPatchHistoriesResponse>
                transformer =
                        ListPatchHistoriesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPatchHistoriesRequest, ListPatchHistoriesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPatchHistoriesRequest, ListPatchHistoriesResponse>,
                        java.util.concurrent.Future<ListPatchHistoriesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPatchHistoriesRequest, ListPatchHistoriesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Bds",
                        "ListPatches",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListPatches");
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
    public java.util.concurrent.Future<ListResourcePrincipalConfigurationsResponse>
            listResourcePrincipalConfigurations(
                    ListResourcePrincipalConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourcePrincipalConfigurationsRequest,
                                    ListResourcePrincipalConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listResourcePrincipalConfigurations");
        final ListResourcePrincipalConfigurationsRequest interceptedRequest =
                ListResourcePrincipalConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourcePrincipalConfigurationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ListResourcePrincipalConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListResourcePrincipalConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourcePrincipalConfigurationsResponse>
                transformer =
                        ListResourcePrincipalConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourcePrincipalConfigurationsRequest,
                        ListResourcePrincipalConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourcePrincipalConfigurationsRequest,
                                ListResourcePrincipalConfigurationsResponse>,
                        java.util.concurrent.Future<ListResourcePrincipalConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourcePrincipalConfigurationsRequest,
                    ListResourcePrincipalConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "Bds",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequestError/ListWorkRequestErrors");
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
                        "Bds",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "Bds",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<RemoveAutoScalingConfigurationResponse>
            removeAutoScalingConfiguration(
                    RemoveAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveAutoScalingConfigurationRequest,
                                    RemoveAutoScalingConfigurationResponse>
                            handler) {
        LOG.trace("Called async removeAutoScalingConfiguration");
        final RemoveAutoScalingConfigurationRequest interceptedRequest =
                RemoveAutoScalingConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveAutoScalingConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveAutoScalingConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveAutoScalingConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveAutoScalingConfigurationResponse>
                transformer =
                        RemoveAutoScalingConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveAutoScalingConfigurationRequest,
                        RemoveAutoScalingConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveAutoScalingConfigurationRequest,
                                RemoveAutoScalingConfigurationResponse>,
                        java.util.concurrent.Future<RemoveAutoScalingConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveAutoScalingConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveAutoScalingConfigurationRequest, RemoveAutoScalingConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveCloudSqlResponse> removeCloudSql(
            RemoveCloudSqlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCloudSqlRequest, RemoveCloudSqlResponse>
                    handler) {
        LOG.trace("Called async removeCloudSql");
        final RemoveCloudSqlRequest interceptedRequest =
                RemoveCloudSqlConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveCloudSqlConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveCloudSql",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveCloudSql");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveCloudSqlResponse>
                transformer =
                        RemoveCloudSqlConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveCloudSqlRequest, RemoveCloudSqlResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveCloudSqlRequest, RemoveCloudSqlResponse>,
                        java.util.concurrent.Future<RemoveCloudSqlResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveCloudSqlDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveCloudSqlRequest, RemoveCloudSqlResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveKafkaResponse> removeKafka(
            RemoveKafkaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveKafkaRequest, RemoveKafkaResponse>
                    handler) {
        LOG.trace("Called async removeKafka");
        final RemoveKafkaRequest interceptedRequest =
                RemoveKafkaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveKafkaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveKafka",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveKafka");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveKafkaResponse>
                transformer =
                        RemoveKafkaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveKafkaRequest, RemoveKafkaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveKafkaRequest, RemoveKafkaResponse>,
                        java.util.concurrent.Future<RemoveKafkaResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveKafkaDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveKafkaRequest, RemoveKafkaResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveNodeResponse> removeNode(
            RemoveNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveNodeRequest, RemoveNodeResponse>
                    handler) {
        LOG.trace("Called async removeNode");
        final RemoveNodeRequest interceptedRequest = RemoveNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveNode");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveNodeResponse>
                transformer =
                        RemoveNodeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveNodeRequest, RemoveNodeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveNodeRequest, RemoveNodeResponse>,
                        java.util.concurrent.Future<RemoveNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveNodeRequest, RemoveNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveNodeReplaceConfigurationResponse>
            removeNodeReplaceConfiguration(
                    RemoveNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveNodeReplaceConfigurationRequest,
                                    RemoveNodeReplaceConfigurationResponse>
                            handler) {
        LOG.trace("Called async removeNodeReplaceConfiguration");
        final RemoveNodeReplaceConfigurationRequest interceptedRequest =
                RemoveNodeReplaceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveNodeReplaceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveNodeReplaceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeReplaceConfiguration/RemoveNodeReplaceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveNodeReplaceConfigurationResponse>
                transformer =
                        RemoveNodeReplaceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveNodeReplaceConfigurationRequest,
                        RemoveNodeReplaceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveNodeReplaceConfigurationRequest,
                                RemoveNodeReplaceConfigurationResponse>,
                        java.util.concurrent.Future<RemoveNodeReplaceConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveNodeReplaceConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveNodeReplaceConfigurationRequest, RemoveNodeReplaceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveResourcePrincipalConfigurationResponse>
            removeResourcePrincipalConfiguration(
                    RemoveResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveResourcePrincipalConfigurationRequest,
                                    RemoveResourcePrincipalConfigurationResponse>
                            handler) {
        LOG.trace("Called async removeResourcePrincipalConfiguration");
        final RemoveResourcePrincipalConfigurationRequest interceptedRequest =
                RemoveResourcePrincipalConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveResourcePrincipalConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RemoveResourcePrincipalConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/ResourcePrincipalConfiguration/RemoveResourcePrincipalConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveResourcePrincipalConfigurationResponse>
                transformer =
                        RemoveResourcePrincipalConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveResourcePrincipalConfigurationRequest,
                        RemoveResourcePrincipalConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveResourcePrincipalConfigurationRequest,
                                RemoveResourcePrincipalConfigurationResponse>,
                        java.util.concurrent.Future<RemoveResourcePrincipalConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveResourcePrincipalConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveResourcePrincipalConfigurationRequest,
                    RemoveResourcePrincipalConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RenewCertificateResponse> renewCertificate(
            RenewCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RenewCertificateRequest, RenewCertificateResponse>
                    handler) {
        LOG.trace("Called async renewCertificate");
        final RenewCertificateRequest interceptedRequest =
                RenewCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RenewCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RenewCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RenewCertificate");
        final java.util.function.Function<javax.ws.rs.core.Response, RenewCertificateResponse>
                transformer =
                        RenewCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RenewCertificateRequest, RenewCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RenewCertificateRequest, RenewCertificateResponse>,
                        java.util.concurrent.Future<RenewCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRenewCertificateDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RenewCertificateRequest, RenewCertificateResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ReplaceNodeResponse> replaceNode(
            ReplaceNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ReplaceNodeRequest, ReplaceNodeResponse>
                    handler) {
        LOG.trace("Called async replaceNode");
        final ReplaceNodeRequest interceptedRequest =
                ReplaceNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ReplaceNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "ReplaceNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ReplaceNode");
        final java.util.function.Function<javax.ws.rs.core.Response, ReplaceNodeResponse>
                transformer =
                        ReplaceNodeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ReplaceNodeRequest, ReplaceNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ReplaceNodeRequest, ReplaceNodeResponse>,
                        java.util.concurrent.Future<ReplaceNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getReplaceNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ReplaceNodeRequest, ReplaceNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RestartNodeResponse> restartNode(
            RestartNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RestartNodeRequest, RestartNodeResponse>
                    handler) {
        LOG.trace("Called async restartNode");
        final RestartNodeRequest interceptedRequest =
                RestartNodeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestartNodeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "RestartNode",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RestartNode");
        final java.util.function.Function<javax.ws.rs.core.Response, RestartNodeResponse>
                transformer =
                        RestartNodeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RestartNodeRequest, RestartNodeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RestartNodeRequest, RestartNodeResponse>,
                        java.util.concurrent.Future<RestartNodeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRestartNodeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RestartNodeRequest, RestartNodeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartBdsInstanceResponse> startBdsInstance(
            StartBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBdsInstanceRequest, StartBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async startBdsInstance");
        final StartBdsInstanceRequest interceptedRequest =
                StartBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "StartBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/StartBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, StartBdsInstanceResponse>
                transformer =
                        StartBdsInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartBdsInstanceRequest, StartBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartBdsInstanceRequest, StartBdsInstanceResponse>,
                        java.util.concurrent.Future<StartBdsInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStartBdsInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartBdsInstanceRequest, StartBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopBdsInstanceResponse> stopBdsInstance(
            StopBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBdsInstanceRequest, StopBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async stopBdsInstance");
        final StopBdsInstanceRequest interceptedRequest =
                StopBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "StopBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/StopBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, StopBdsInstanceResponse>
                transformer =
                        StopBdsInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopBdsInstanceRequest, StopBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopBdsInstanceRequest, StopBdsInstanceResponse>,
                        java.util.concurrent.Future<StopBdsInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getStopBdsInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopBdsInstanceRequest, StopBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestBdsMetastoreConfigurationResponse>
            testBdsMetastoreConfiguration(
                    TestBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsMetastoreConfigurationRequest,
                                    TestBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async testBdsMetastoreConfiguration");
        final TestBdsMetastoreConfigurationRequest interceptedRequest =
                TestBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "TestBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/TestBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TestBdsMetastoreConfigurationResponse>
                transformer =
                        TestBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TestBdsMetastoreConfigurationRequest, TestBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestBdsMetastoreConfigurationRequest,
                                TestBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<TestBdsMetastoreConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestBdsMetastoreConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestBdsMetastoreConfigurationRequest, TestBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestBdsObjectStorageConnectionResponse>
            testBdsObjectStorageConnection(
                    TestBdsObjectStorageConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsObjectStorageConnectionRequest,
                                    TestBdsObjectStorageConnectionResponse>
                            handler) {
        LOG.trace("Called async testBdsObjectStorageConnection");
        final TestBdsObjectStorageConnectionRequest interceptedRequest =
                TestBdsObjectStorageConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestBdsObjectStorageConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "TestBdsObjectStorageConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/TestBdsObjectStorageConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TestBdsObjectStorageConnectionResponse>
                transformer =
                        TestBdsObjectStorageConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TestBdsObjectStorageConnectionRequest,
                        TestBdsObjectStorageConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestBdsObjectStorageConnectionRequest,
                                TestBdsObjectStorageConnectionResponse>,
                        java.util.concurrent.Future<TestBdsObjectStorageConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestBdsObjectStorageConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestBdsObjectStorageConnectionRequest, TestBdsObjectStorageConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAutoScalingConfigurationResponse>
            updateAutoScalingConfiguration(
                    UpdateAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutoScalingConfigurationRequest,
                                    UpdateAutoScalingConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateAutoScalingConfiguration");
        final UpdateAutoScalingConfigurationRequest interceptedRequest =
                UpdateAutoScalingConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAutoScalingConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateAutoScalingConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateAutoScalingConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateAutoScalingConfigurationResponse>
                transformer =
                        UpdateAutoScalingConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAutoScalingConfigurationRequest,
                        UpdateAutoScalingConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAutoScalingConfigurationRequest,
                                UpdateAutoScalingConfigurationResponse>,
                        java.util.concurrent.Future<UpdateAutoScalingConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAutoScalingConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAutoScalingConfigurationRequest, UpdateAutoScalingConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBdsInstanceResponse> updateBdsInstance(
            UpdateBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>
                    handler) {
        LOG.trace("Called async updateBdsInstance");
        final UpdateBdsInstanceRequest interceptedRequest =
                UpdateBdsInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBdsInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateBdsInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateBdsInstance");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateBdsInstanceResponse>
                transformer =
                        UpdateBdsInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>,
                        java.util.concurrent.Future<UpdateBdsInstanceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBdsInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBdsMetastoreConfigurationResponse>
            updateBdsMetastoreConfiguration(
                    UpdateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateBdsMetastoreConfigurationRequest,
                                    UpdateBdsMetastoreConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateBdsMetastoreConfiguration");
        final UpdateBdsMetastoreConfigurationRequest interceptedRequest =
                UpdateBdsMetastoreConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBdsMetastoreConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateBdsMetastoreConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/UpdateBdsMetastoreConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateBdsMetastoreConfigurationResponse>
                transformer =
                        UpdateBdsMetastoreConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBdsMetastoreConfigurationRequest,
                        UpdateBdsMetastoreConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBdsMetastoreConfigurationRequest,
                                UpdateBdsMetastoreConfigurationResponse>,
                        java.util.concurrent.Future<UpdateBdsMetastoreConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBdsMetastoreConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBdsMetastoreConfigurationRequest,
                    UpdateBdsMetastoreConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNodeBackupConfigurationResponse>
            updateNodeBackupConfiguration(
                    UpdateNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeBackupConfigurationRequest,
                                    UpdateNodeBackupConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateNodeBackupConfiguration");
        final UpdateNodeBackupConfigurationRequest interceptedRequest =
                UpdateNodeBackupConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNodeBackupConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateNodeBackupConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateNodeBackupConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNodeBackupConfigurationResponse>
                transformer =
                        UpdateNodeBackupConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNodeBackupConfigurationRequest, UpdateNodeBackupConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNodeBackupConfigurationRequest,
                                UpdateNodeBackupConfigurationResponse>,
                        java.util.concurrent.Future<UpdateNodeBackupConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNodeBackupConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNodeBackupConfigurationRequest, UpdateNodeBackupConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNodeReplaceConfigurationResponse>
            updateNodeReplaceConfiguration(
                    UpdateNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeReplaceConfigurationRequest,
                                    UpdateNodeReplaceConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateNodeReplaceConfiguration");
        final UpdateNodeReplaceConfigurationRequest interceptedRequest =
                UpdateNodeReplaceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNodeReplaceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateNodeReplaceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateNodeReplaceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNodeReplaceConfigurationResponse>
                transformer =
                        UpdateNodeReplaceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNodeReplaceConfigurationRequest,
                        UpdateNodeReplaceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNodeReplaceConfigurationRequest,
                                UpdateNodeReplaceConfigurationResponse>,
                        java.util.concurrent.Future<UpdateNodeReplaceConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNodeReplaceConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNodeReplaceConfigurationRequest, UpdateNodeReplaceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateResourcePrincipalConfigurationResponse>
            updateResourcePrincipalConfiguration(
                    UpdateResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResourcePrincipalConfigurationRequest,
                                    UpdateResourcePrincipalConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateResourcePrincipalConfiguration");
        final UpdateResourcePrincipalConfigurationRequest interceptedRequest =
                UpdateResourcePrincipalConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateResourcePrincipalConfigurationConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Bds",
                        "UpdateResourcePrincipalConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateResourcePrincipalConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateResourcePrincipalConfigurationResponse>
                transformer =
                        UpdateResourcePrincipalConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateResourcePrincipalConfigurationRequest,
                        UpdateResourcePrincipalConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateResourcePrincipalConfigurationRequest,
                                UpdateResourcePrincipalConfigurationResponse>,
                        java.util.concurrent.Future<UpdateResourcePrincipalConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateResourcePrincipalConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateResourcePrincipalConfigurationRequest,
                    UpdateResourcePrincipalConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
