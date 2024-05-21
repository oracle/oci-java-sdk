/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for VirtualNetwork service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VirtualNetworkAsyncClient implements VirtualNetworkAsync {
    /**
     * Service instance for VirtualNetwork.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VIRTUALNETWORK")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VirtualNetworkAsyncClient.class);

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
    public VirtualNetworkAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
    public VirtualNetworkAsyncClient(
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
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                            "VirtualNetworkAsyncClient",
                            "getCpeDeviceConfigContent,getIpsecCpeDeviceConfigContent,getTunnelCpeDeviceConfigContent"));
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
                    Builder, VirtualNetworkAsyncClient> {
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
        public VirtualNetworkAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new VirtualNetworkAsyncClient(
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
    public java.util.concurrent.Future<AddDrgRouteDistributionStatementsResponse>
            addDrgRouteDistributionStatements(
                    AddDrgRouteDistributionStatementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddDrgRouteDistributionStatementsRequest,
                                    AddDrgRouteDistributionStatementsResponse>
                            handler) {
        LOG.trace("Called async addDrgRouteDistributionStatements");
        final AddDrgRouteDistributionStatementsRequest interceptedRequest =
                AddDrgRouteDistributionStatementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDrgRouteDistributionStatementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddDrgRouteDistributionStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/AddDrgRouteDistributionStatements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddDrgRouteDistributionStatementsResponse>
                transformer =
                        AddDrgRouteDistributionStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddDrgRouteDistributionStatementsRequest,
                        AddDrgRouteDistributionStatementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDrgRouteDistributionStatementsRequest,
                                AddDrgRouteDistributionStatementsResponse>,
                        java.util.concurrent.Future<AddDrgRouteDistributionStatementsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddDrgRouteDistributionStatementsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDrgRouteDistributionStatementsRequest,
                    AddDrgRouteDistributionStatementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddDrgRouteRulesResponse> addDrgRouteRules(
            AddDrgRouteRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddDrgRouteRulesRequest, AddDrgRouteRulesResponse>
                    handler) {
        LOG.trace("Called async addDrgRouteRules");
        final AddDrgRouteRulesRequest interceptedRequest =
                AddDrgRouteRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDrgRouteRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddDrgRouteRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/AddDrgRouteRules");
        final java.util.function.Function<javax.ws.rs.core.Response, AddDrgRouteRulesResponse>
                transformer =
                        AddDrgRouteRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddDrgRouteRulesRequest, AddDrgRouteRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDrgRouteRulesRequest, AddDrgRouteRulesResponse>,
                        java.util.concurrent.Future<AddDrgRouteRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddDrgRouteRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDrgRouteRulesRequest, AddDrgRouteRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddIpv6SubnetCidrResponse> addIpv6SubnetCidr(
            AddIpv6SubnetCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>
                    handler) {
        LOG.trace("Called async addIpv6SubnetCidr");
        final AddIpv6SubnetCidrRequest interceptedRequest =
                AddIpv6SubnetCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddIpv6SubnetCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddIpv6SubnetCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/AddIpv6SubnetCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, AddIpv6SubnetCidrResponse>
                transformer =
                        AddIpv6SubnetCidrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>,
                        java.util.concurrent.Future<AddIpv6SubnetCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddSubnetIpv6CidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddIpv6VcnCidrResponse> addIpv6VcnCidr(
            AddIpv6VcnCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>
                    handler) {
        LOG.trace("Called async addIpv6VcnCidr");
        final AddIpv6VcnCidrRequest interceptedRequest =
                AddIpv6VcnCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddIpv6VcnCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddIpv6VcnCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/AddIpv6VcnCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, AddIpv6VcnCidrResponse>
                transformer =
                        AddIpv6VcnCidrConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>,
                        java.util.concurrent.Future<AddIpv6VcnCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddVcnIpv6CidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddNetworkSecurityGroupSecurityRulesResponse>
            addNetworkSecurityGroupSecurityRules(
                    AddNetworkSecurityGroupSecurityRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddNetworkSecurityGroupSecurityRulesRequest,
                                    AddNetworkSecurityGroupSecurityRulesResponse>
                            handler) {
        LOG.trace("Called async addNetworkSecurityGroupSecurityRules");
        final AddNetworkSecurityGroupSecurityRulesRequest interceptedRequest =
                AddNetworkSecurityGroupSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddNetworkSecurityGroupSecurityRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddNetworkSecurityGroupSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/AddNetworkSecurityGroupSecurityRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddNetworkSecurityGroupSecurityRulesResponse>
                transformer =
                        AddNetworkSecurityGroupSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddNetworkSecurityGroupSecurityRulesRequest,
                        AddNetworkSecurityGroupSecurityRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddNetworkSecurityGroupSecurityRulesRequest,
                                AddNetworkSecurityGroupSecurityRulesResponse>,
                        java.util.concurrent.Future<AddNetworkSecurityGroupSecurityRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddNetworkSecurityGroupSecurityRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddNetworkSecurityGroupSecurityRulesRequest,
                    AddNetworkSecurityGroupSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddPublicIpPoolCapacityResponse> addPublicIpPoolCapacity(
            AddPublicIpPoolCapacityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddPublicIpPoolCapacityRequest, AddPublicIpPoolCapacityResponse>
                    handler) {
        LOG.trace("Called async addPublicIpPoolCapacity");
        final AddPublicIpPoolCapacityRequest interceptedRequest =
                AddPublicIpPoolCapacityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddPublicIpPoolCapacityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddPublicIpPoolCapacity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/AddPublicIpPoolCapacity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AddPublicIpPoolCapacityResponse>
                transformer =
                        AddPublicIpPoolCapacityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AddPublicIpPoolCapacityRequest, AddPublicIpPoolCapacityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddPublicIpPoolCapacityRequest, AddPublicIpPoolCapacityResponse>,
                        java.util.concurrent.Future<AddPublicIpPoolCapacityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddPublicIpPoolCapacityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddPublicIpPoolCapacityRequest, AddPublicIpPoolCapacityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddVcnCidrResponse> addVcnCidr(
            AddVcnCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddVcnCidrRequest, AddVcnCidrResponse>
                    handler) {
        LOG.trace("Called async addVcnCidr");
        final AddVcnCidrRequest interceptedRequest = AddVcnCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddVcnCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AddVcnCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/AddVcnCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, AddVcnCidrResponse>
                transformer =
                        AddVcnCidrConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AddVcnCidrRequest, AddVcnCidrResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddVcnCidrRequest, AddVcnCidrResponse>,
                        java.util.concurrent.Future<AddVcnCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddVcnCidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddVcnCidrRequest, AddVcnCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipRangeResponse> advertiseByoipRange(
            AdvertiseByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AdvertiseByoipRangeRequest, AdvertiseByoipRangeResponse>
                    handler) {
        LOG.trace("Called async advertiseByoipRange");
        final AdvertiseByoipRangeRequest interceptedRequest =
                AdvertiseByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AdvertiseByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AdvertiseByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/AdvertiseByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, AdvertiseByoipRangeResponse>
                transformer =
                        AdvertiseByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AdvertiseByoipRangeRequest, AdvertiseByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AdvertiseByoipRangeRequest, AdvertiseByoipRangeResponse>,
                        java.util.concurrent.Future<AdvertiseByoipRangeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AdvertiseByoipRangeRequest, AdvertiseByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachServiceIdResponse> attachServiceId(
            AttachServiceIdRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AttachServiceIdRequest, AttachServiceIdResponse>
                    handler) {
        LOG.trace("Called async attachServiceId");
        final AttachServiceIdRequest interceptedRequest =
                AttachServiceIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachServiceIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "AttachServiceId",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/AttachServiceId");
        final java.util.function.Function<javax.ws.rs.core.Response, AttachServiceIdResponse>
                transformer =
                        AttachServiceIdConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AttachServiceIdRequest, AttachServiceIdResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachServiceIdRequest, AttachServiceIdResponse>,
                        java.util.concurrent.Future<AttachServiceIdResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachServiceIdRequest, AttachServiceIdResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkAddVirtualCircuitPublicPrefixesResponse>
            bulkAddVirtualCircuitPublicPrefixes(
                    BulkAddVirtualCircuitPublicPrefixesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkAddVirtualCircuitPublicPrefixesRequest,
                                    BulkAddVirtualCircuitPublicPrefixesResponse>
                            handler) {
        LOG.trace("Called async bulkAddVirtualCircuitPublicPrefixes");
        final BulkAddVirtualCircuitPublicPrefixesRequest interceptedRequest =
                BulkAddVirtualCircuitPublicPrefixesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkAddVirtualCircuitPublicPrefixesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "BulkAddVirtualCircuitPublicPrefixes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/BulkAddVirtualCircuitPublicPrefixes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkAddVirtualCircuitPublicPrefixesResponse>
                transformer =
                        BulkAddVirtualCircuitPublicPrefixesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkAddVirtualCircuitPublicPrefixesRequest,
                        BulkAddVirtualCircuitPublicPrefixesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkAddVirtualCircuitPublicPrefixesRequest,
                                BulkAddVirtualCircuitPublicPrefixesResponse>,
                        java.util.concurrent.Future<BulkAddVirtualCircuitPublicPrefixesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkAddVirtualCircuitPublicPrefixesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkAddVirtualCircuitPublicPrefixesRequest,
                    BulkAddVirtualCircuitPublicPrefixesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkDeleteVirtualCircuitPublicPrefixesResponse>
            bulkDeleteVirtualCircuitPublicPrefixes(
                    BulkDeleteVirtualCircuitPublicPrefixesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkDeleteVirtualCircuitPublicPrefixesRequest,
                                    BulkDeleteVirtualCircuitPublicPrefixesResponse>
                            handler) {
        LOG.trace("Called async bulkDeleteVirtualCircuitPublicPrefixes");
        final BulkDeleteVirtualCircuitPublicPrefixesRequest interceptedRequest =
                BulkDeleteVirtualCircuitPublicPrefixesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkDeleteVirtualCircuitPublicPrefixesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "BulkDeleteVirtualCircuitPublicPrefixes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/BulkDeleteVirtualCircuitPublicPrefixes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkDeleteVirtualCircuitPublicPrefixesResponse>
                transformer =
                        BulkDeleteVirtualCircuitPublicPrefixesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkDeleteVirtualCircuitPublicPrefixesRequest,
                        BulkDeleteVirtualCircuitPublicPrefixesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkDeleteVirtualCircuitPublicPrefixesRequest,
                                BulkDeleteVirtualCircuitPublicPrefixesResponse>,
                        java.util.concurrent.Future<BulkDeleteVirtualCircuitPublicPrefixesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getBulkDeleteVirtualCircuitPublicPrefixesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkDeleteVirtualCircuitPublicPrefixesRequest,
                    BulkDeleteVirtualCircuitPublicPrefixesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeByoipRangeCompartmentResponse>
            changeByoipRangeCompartment(
                    ChangeByoipRangeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeByoipRangeCompartmentRequest,
                                    ChangeByoipRangeCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeByoipRangeCompartment");
        final ChangeByoipRangeCompartmentRequest interceptedRequest =
                ChangeByoipRangeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeByoipRangeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeByoipRangeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ChangeByoipRangeCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeByoipRangeCompartmentResponse>
                transformer =
                        ChangeByoipRangeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeByoipRangeCompartmentRequest, ChangeByoipRangeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeByoipRangeCompartmentRequest,
                                ChangeByoipRangeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeByoipRangeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeByoipRangeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeByoipRangeCompartmentRequest, ChangeByoipRangeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCaptureFilterCompartmentResponse>
            changeCaptureFilterCompartment(
                    ChangeCaptureFilterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCaptureFilterCompartmentRequest,
                                    ChangeCaptureFilterCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCaptureFilterCompartment");
        final ChangeCaptureFilterCompartmentRequest interceptedRequest =
                ChangeCaptureFilterCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCaptureFilterCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeCaptureFilterCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/ChangeCaptureFilterCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeCaptureFilterCompartmentResponse>
                transformer =
                        ChangeCaptureFilterCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCaptureFilterCompartmentRequest,
                        ChangeCaptureFilterCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCaptureFilterCompartmentRequest,
                                ChangeCaptureFilterCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCaptureFilterCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCaptureFilterCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCaptureFilterCompartmentRequest, ChangeCaptureFilterCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCpeCompartmentResponse> changeCpeCompartment(
            ChangeCpeCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCpeCompartmentRequest, ChangeCpeCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeCpeCompartment");
        final ChangeCpeCompartmentRequest interceptedRequest =
                ChangeCpeCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCpeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeCpeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/ChangeCpeCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeCpeCompartmentResponse>
                transformer =
                        ChangeCpeCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCpeCompartmentRequest, ChangeCpeCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCpeCompartmentRequest, ChangeCpeCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCpeCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCpeCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCpeCompartmentRequest, ChangeCpeCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCrossConnectCompartmentResponse>
            changeCrossConnectCompartment(
                    ChangeCrossConnectCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCrossConnectCompartmentRequest,
                                    ChangeCrossConnectCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCrossConnectCompartment");
        final ChangeCrossConnectCompartmentRequest interceptedRequest =
                ChangeCrossConnectCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCrossConnectCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeCrossConnectCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/ChangeCrossConnectCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeCrossConnectCompartmentResponse>
                transformer =
                        ChangeCrossConnectCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCrossConnectCompartmentRequest, ChangeCrossConnectCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCrossConnectCompartmentRequest,
                                ChangeCrossConnectCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCrossConnectCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCrossConnectCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCrossConnectCompartmentRequest, ChangeCrossConnectCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeCrossConnectGroupCompartmentResponse>
            changeCrossConnectGroupCompartment(
                    ChangeCrossConnectGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCrossConnectGroupCompartmentRequest,
                                    ChangeCrossConnectGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeCrossConnectGroupCompartment");
        final ChangeCrossConnectGroupCompartmentRequest interceptedRequest =
                ChangeCrossConnectGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCrossConnectGroupCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeCrossConnectGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/ChangeCrossConnectGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeCrossConnectGroupCompartmentResponse>
                transformer =
                        ChangeCrossConnectGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeCrossConnectGroupCompartmentRequest,
                        ChangeCrossConnectGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeCrossConnectGroupCompartmentRequest,
                                ChangeCrossConnectGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeCrossConnectGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeCrossConnectGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeCrossConnectGroupCompartmentRequest,
                    ChangeCrossConnectGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDhcpOptionsCompartmentResponse>
            changeDhcpOptionsCompartment(
                    ChangeDhcpOptionsCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDhcpOptionsCompartmentRequest,
                                    ChangeDhcpOptionsCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDhcpOptionsCompartment");
        final ChangeDhcpOptionsCompartmentRequest interceptedRequest =
                ChangeDhcpOptionsCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDhcpOptionsCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeDhcpOptionsCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/ChangeDhcpOptionsCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeDhcpOptionsCompartmentResponse>
                transformer =
                        ChangeDhcpOptionsCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDhcpOptionsCompartmentRequest, ChangeDhcpOptionsCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDhcpOptionsCompartmentRequest,
                                ChangeDhcpOptionsCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDhcpOptionsCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDhcpOptionsCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDhcpOptionsCompartmentRequest, ChangeDhcpOptionsCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDrgCompartmentResponse> changeDrgCompartment(
            ChangeDrgCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeDrgCompartment");
        final ChangeDrgCompartmentRequest interceptedRequest =
                ChangeDrgCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDrgCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeDrgCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/ChangeDrgCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeDrgCompartmentResponse>
                transformer =
                        ChangeDrgCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>,
                        java.util.concurrent.Future<ChangeDrgCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDrgCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeIPSecConnectionCompartmentResponse>
            changeIPSecConnectionCompartment(
                    ChangeIPSecConnectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIPSecConnectionCompartmentRequest,
                                    ChangeIPSecConnectionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeIPSecConnectionCompartment");
        final ChangeIPSecConnectionCompartmentRequest interceptedRequest =
                ChangeIPSecConnectionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeIPSecConnectionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeIPSecConnectionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/ChangeIPSecConnectionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeIPSecConnectionCompartmentResponse>
                transformer =
                        ChangeIPSecConnectionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeIPSecConnectionCompartmentRequest,
                        ChangeIPSecConnectionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeIPSecConnectionCompartmentRequest,
                                ChangeIPSecConnectionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeIPSecConnectionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeIPSecConnectionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeIPSecConnectionCompartmentRequest,
                    ChangeIPSecConnectionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeInternetGatewayCompartmentResponse>
            changeInternetGatewayCompartment(
                    ChangeInternetGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInternetGatewayCompartmentRequest,
                                    ChangeInternetGatewayCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeInternetGatewayCompartment");
        final ChangeInternetGatewayCompartmentRequest interceptedRequest =
                ChangeInternetGatewayCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInternetGatewayCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeInternetGatewayCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/ChangeInternetGatewayCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeInternetGatewayCompartmentResponse>
                transformer =
                        ChangeInternetGatewayCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInternetGatewayCompartmentRequest,
                        ChangeInternetGatewayCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInternetGatewayCompartmentRequest,
                                ChangeInternetGatewayCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInternetGatewayCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeInternetGatewayCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInternetGatewayCompartmentRequest,
                    ChangeInternetGatewayCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeLocalPeeringGatewayCompartmentResponse>
            changeLocalPeeringGatewayCompartment(
                    ChangeLocalPeeringGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLocalPeeringGatewayCompartmentRequest,
                                    ChangeLocalPeeringGatewayCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeLocalPeeringGatewayCompartment");
        final ChangeLocalPeeringGatewayCompartmentRequest interceptedRequest =
                ChangeLocalPeeringGatewayCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLocalPeeringGatewayCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeLocalPeeringGatewayCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ChangeLocalPeeringGatewayCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeLocalPeeringGatewayCompartmentResponse>
                transformer =
                        ChangeLocalPeeringGatewayCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeLocalPeeringGatewayCompartmentRequest,
                        ChangeLocalPeeringGatewayCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeLocalPeeringGatewayCompartmentRequest,
                                ChangeLocalPeeringGatewayCompartmentResponse>,
                        java.util.concurrent.Future<ChangeLocalPeeringGatewayCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeLocalPeeringGatewayCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeLocalPeeringGatewayCompartmentRequest,
                    ChangeLocalPeeringGatewayCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNatGatewayCompartmentResponse>
            changeNatGatewayCompartment(
                    ChangeNatGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNatGatewayCompartmentRequest,
                                    ChangeNatGatewayCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNatGatewayCompartment");
        final ChangeNatGatewayCompartmentRequest interceptedRequest =
                ChangeNatGatewayCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNatGatewayCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeNatGatewayCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/ChangeNatGatewayCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNatGatewayCompartmentResponse>
                transformer =
                        ChangeNatGatewayCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNatGatewayCompartmentRequest, ChangeNatGatewayCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNatGatewayCompartmentRequest,
                                ChangeNatGatewayCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNatGatewayCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNatGatewayCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNatGatewayCompartmentRequest, ChangeNatGatewayCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNetworkSecurityGroupCompartmentResponse>
            changeNetworkSecurityGroupCompartment(
                    ChangeNetworkSecurityGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkSecurityGroupCompartmentRequest,
                                    ChangeNetworkSecurityGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNetworkSecurityGroupCompartment");
        final ChangeNetworkSecurityGroupCompartmentRequest interceptedRequest =
                ChangeNetworkSecurityGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkSecurityGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeNetworkSecurityGroupCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/ChangeNetworkSecurityGroupCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkSecurityGroupCompartmentResponse>
                transformer =
                        ChangeNetworkSecurityGroupCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNetworkSecurityGroupCompartmentRequest,
                        ChangeNetworkSecurityGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNetworkSecurityGroupCompartmentRequest,
                                ChangeNetworkSecurityGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNetworkSecurityGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeNetworkSecurityGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNetworkSecurityGroupCompartmentRequest,
                    ChangeNetworkSecurityGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangePublicIpCompartmentResponse> changePublicIpCompartment(
            ChangePublicIpCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePublicIpCompartmentRequest, ChangePublicIpCompartmentResponse>
                    handler) {
        LOG.trace("Called async changePublicIpCompartment");
        final ChangePublicIpCompartmentRequest interceptedRequest =
                ChangePublicIpCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePublicIpCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangePublicIpCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/ChangePublicIpCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangePublicIpCompartmentResponse>
                transformer =
                        ChangePublicIpCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangePublicIpCompartmentRequest, ChangePublicIpCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangePublicIpCompartmentRequest,
                                ChangePublicIpCompartmentResponse>,
                        java.util.concurrent.Future<ChangePublicIpCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangePublicIpCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangePublicIpCompartmentRequest, ChangePublicIpCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangePublicIpPoolCompartmentResponse>
            changePublicIpPoolCompartment(
                    ChangePublicIpPoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePublicIpPoolCompartmentRequest,
                                    ChangePublicIpPoolCompartmentResponse>
                            handler) {
        LOG.trace("Called async changePublicIpPoolCompartment");
        final ChangePublicIpPoolCompartmentRequest interceptedRequest =
                ChangePublicIpPoolCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangePublicIpPoolCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangePublicIpPoolCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/ChangePublicIpPoolCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangePublicIpPoolCompartmentResponse>
                transformer =
                        ChangePublicIpPoolCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangePublicIpPoolCompartmentRequest, ChangePublicIpPoolCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangePublicIpPoolCompartmentRequest,
                                ChangePublicIpPoolCompartmentResponse>,
                        java.util.concurrent.Future<ChangePublicIpPoolCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangePublicIpPoolCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangePublicIpPoolCompartmentRequest, ChangePublicIpPoolCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeRemotePeeringConnectionCompartmentResponse>
            changeRemotePeeringConnectionCompartment(
                    ChangeRemotePeeringConnectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRemotePeeringConnectionCompartmentRequest,
                                    ChangeRemotePeeringConnectionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeRemotePeeringConnectionCompartment");
        final ChangeRemotePeeringConnectionCompartmentRequest interceptedRequest =
                ChangeRemotePeeringConnectionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRemotePeeringConnectionCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeRemotePeeringConnectionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ChangeRemotePeeringConnectionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeRemotePeeringConnectionCompartmentResponse>
                transformer =
                        ChangeRemotePeeringConnectionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeRemotePeeringConnectionCompartmentRequest,
                        ChangeRemotePeeringConnectionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeRemotePeeringConnectionCompartmentRequest,
                                ChangeRemotePeeringConnectionCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeRemotePeeringConnectionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeRemotePeeringConnectionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeRemotePeeringConnectionCompartmentRequest,
                    ChangeRemotePeeringConnectionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeRouteTableCompartmentResponse>
            changeRouteTableCompartment(
                    ChangeRouteTableCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRouteTableCompartmentRequest,
                                    ChangeRouteTableCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeRouteTableCompartment");
        final ChangeRouteTableCompartmentRequest interceptedRequest =
                ChangeRouteTableCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRouteTableCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeRouteTableCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/ChangeRouteTableCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeRouteTableCompartmentResponse>
                transformer =
                        ChangeRouteTableCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeRouteTableCompartmentRequest, ChangeRouteTableCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeRouteTableCompartmentRequest,
                                ChangeRouteTableCompartmentResponse>,
                        java.util.concurrent.Future<ChangeRouteTableCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeRouteTableCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeRouteTableCompartmentRequest, ChangeRouteTableCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSecurityListCompartmentResponse>
            changeSecurityListCompartment(
                    ChangeSecurityListCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityListCompartmentRequest,
                                    ChangeSecurityListCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeSecurityListCompartment");
        final ChangeSecurityListCompartmentRequest interceptedRequest =
                ChangeSecurityListCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityListCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeSecurityListCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/ChangeSecurityListCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSecurityListCompartmentResponse>
                transformer =
                        ChangeSecurityListCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSecurityListCompartmentRequest, ChangeSecurityListCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSecurityListCompartmentRequest,
                                ChangeSecurityListCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSecurityListCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSecurityListCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSecurityListCompartmentRequest, ChangeSecurityListCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeServiceGatewayCompartmentResponse>
            changeServiceGatewayCompartment(
                    ChangeServiceGatewayCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeServiceGatewayCompartmentRequest,
                                    ChangeServiceGatewayCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeServiceGatewayCompartment");
        final ChangeServiceGatewayCompartmentRequest interceptedRequest =
                ChangeServiceGatewayCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeServiceGatewayCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeServiceGatewayCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/ChangeServiceGatewayCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeServiceGatewayCompartmentResponse>
                transformer =
                        ChangeServiceGatewayCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeServiceGatewayCompartmentRequest,
                        ChangeServiceGatewayCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeServiceGatewayCompartmentRequest,
                                ChangeServiceGatewayCompartmentResponse>,
                        java.util.concurrent.Future<ChangeServiceGatewayCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeServiceGatewayCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeServiceGatewayCompartmentRequest,
                    ChangeServiceGatewayCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeSubnetCompartmentResponse> changeSubnetCompartment(
            ChangeSubnetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeSubnetCompartment");
        final ChangeSubnetCompartmentRequest interceptedRequest =
                ChangeSubnetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSubnetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeSubnetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/ChangeSubnetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeSubnetCompartmentResponse>
                transformer =
                        ChangeSubnetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeSubnetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeSubnetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVcnCompartmentResponse> changeVcnCompartment(
            ChangeVcnCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeVcnCompartment");
        final ChangeVcnCompartmentRequest interceptedRequest =
                ChangeVcnCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVcnCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeVcnCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ChangeVcnCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeVcnCompartmentResponse>
                transformer =
                        ChangeVcnCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVcnCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVcnCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVirtualCircuitCompartmentResponse>
            changeVirtualCircuitCompartment(
                    ChangeVirtualCircuitCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualCircuitCompartmentRequest,
                                    ChangeVirtualCircuitCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeVirtualCircuitCompartment");
        final ChangeVirtualCircuitCompartmentRequest interceptedRequest =
                ChangeVirtualCircuitCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVirtualCircuitCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeVirtualCircuitCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/ChangeVirtualCircuitCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeVirtualCircuitCompartmentResponse>
                transformer =
                        ChangeVirtualCircuitCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVirtualCircuitCompartmentRequest,
                        ChangeVirtualCircuitCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVirtualCircuitCompartmentRequest,
                                ChangeVirtualCircuitCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVirtualCircuitCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVirtualCircuitCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVirtualCircuitCompartmentRequest,
                    ChangeVirtualCircuitCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVlanCompartmentResponse> changeVlanCompartment(
            ChangeVlanCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeVlanCompartment");
        final ChangeVlanCompartmentRequest interceptedRequest =
                ChangeVlanCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVlanCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeVlanCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/ChangeVlanCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeVlanCompartmentResponse>
                transformer =
                        ChangeVlanCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVlanCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVlanCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeVtapCompartmentResponse> changeVtapCompartment(
            ChangeVtapCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeVtapCompartment");
        final ChangeVtapCompartmentRequest interceptedRequest =
                ChangeVtapCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeVtapCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ChangeVtapCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/ChangeVtapCompartment");
        final java.util.function.Function<javax.ws.rs.core.Response, ChangeVtapCompartmentResponse>
                transformer =
                        ChangeVtapCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>,
                        java.util.concurrent.Future<ChangeVtapCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeVtapCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConnectLocalPeeringGatewaysResponse>
            connectLocalPeeringGateways(
                    ConnectLocalPeeringGatewaysRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConnectLocalPeeringGatewaysRequest,
                                    ConnectLocalPeeringGatewaysResponse>
                            handler) {
        LOG.trace("Called async connectLocalPeeringGateways");
        final ConnectLocalPeeringGatewaysRequest interceptedRequest =
                ConnectLocalPeeringGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConnectLocalPeeringGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ConnectLocalPeeringGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ConnectLocalPeeringGateways");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConnectLocalPeeringGatewaysResponse>
                transformer =
                        ConnectLocalPeeringGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConnectLocalPeeringGatewaysRequest, ConnectLocalPeeringGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConnectLocalPeeringGatewaysRequest,
                                ConnectLocalPeeringGatewaysResponse>,
                        java.util.concurrent.Future<ConnectLocalPeeringGatewaysResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConnectLocalPeeringGatewaysDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConnectLocalPeeringGatewaysRequest, ConnectLocalPeeringGatewaysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConnectRemotePeeringConnectionsResponse>
            connectRemotePeeringConnections(
                    ConnectRemotePeeringConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConnectRemotePeeringConnectionsRequest,
                                    ConnectRemotePeeringConnectionsResponse>
                            handler) {
        LOG.trace("Called async connectRemotePeeringConnections");
        final ConnectRemotePeeringConnectionsRequest interceptedRequest =
                ConnectRemotePeeringConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConnectRemotePeeringConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ConnectRemotePeeringConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ConnectRemotePeeringConnections");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ConnectRemotePeeringConnectionsResponse>
                transformer =
                        ConnectRemotePeeringConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ConnectRemotePeeringConnectionsRequest,
                        ConnectRemotePeeringConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConnectRemotePeeringConnectionsRequest,
                                ConnectRemotePeeringConnectionsResponse>,
                        java.util.concurrent.Future<ConnectRemotePeeringConnectionsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConnectRemotePeeringConnectionsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConnectRemotePeeringConnectionsRequest,
                    ConnectRemotePeeringConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateByoipRangeResponse> createByoipRange(
            CreateByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateByoipRangeRequest, CreateByoipRangeResponse>
                    handler) {
        LOG.trace("Called async createByoipRange");
        final CreateByoipRangeRequest interceptedRequest =
                CreateByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/CreateByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateByoipRangeResponse>
                transformer =
                        CreateByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateByoipRangeRequest, CreateByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateByoipRangeRequest, CreateByoipRangeResponse>,
                        java.util.concurrent.Future<CreateByoipRangeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateByoipRangeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateByoipRangeRequest, CreateByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCaptureFilterResponse> createCaptureFilter(
            CreateCaptureFilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCaptureFilterRequest, CreateCaptureFilterResponse>
                    handler) {
        LOG.trace("Called async createCaptureFilter");
        final CreateCaptureFilterRequest interceptedRequest =
                CreateCaptureFilterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCaptureFilterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateCaptureFilter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/CreateCaptureFilter");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCaptureFilterResponse>
                transformer =
                        CreateCaptureFilterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCaptureFilterRequest, CreateCaptureFilterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCaptureFilterRequest, CreateCaptureFilterResponse>,
                        java.util.concurrent.Future<CreateCaptureFilterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCaptureFilterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCaptureFilterRequest, CreateCaptureFilterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCpeResponse> createCpe(
            CreateCpeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateCpeRequest, CreateCpeResponse>
                    handler) {
        LOG.trace("Called async createCpe");
        final CreateCpeRequest interceptedRequest = CreateCpeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCpeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateCpe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/CreateCpe");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCpeResponse>
                transformer =
                        CreateCpeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCpeRequest, CreateCpeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateCpeRequest, CreateCpeResponse>,
                        java.util.concurrent.Future<CreateCpeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCpeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCpeRequest, CreateCpeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCrossConnectResponse> createCrossConnect(
            CreateCrossConnectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCrossConnectRequest, CreateCrossConnectResponse>
                    handler) {
        LOG.trace("Called async createCrossConnect");
        final CreateCrossConnectRequest interceptedRequest =
                CreateCrossConnectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCrossConnectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateCrossConnect",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/CreateCrossConnect");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCrossConnectResponse>
                transformer =
                        CreateCrossConnectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCrossConnectRequest, CreateCrossConnectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCrossConnectRequest, CreateCrossConnectResponse>,
                        java.util.concurrent.Future<CreateCrossConnectResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCrossConnectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCrossConnectRequest, CreateCrossConnectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCrossConnectGroupResponse> createCrossConnectGroup(
            CreateCrossConnectGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCrossConnectGroupRequest, CreateCrossConnectGroupResponse>
                    handler) {
        LOG.trace("Called async createCrossConnectGroup");
        final CreateCrossConnectGroupRequest interceptedRequest =
                CreateCrossConnectGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCrossConnectGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateCrossConnectGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/CreateCrossConnectGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCrossConnectGroupResponse>
                transformer =
                        CreateCrossConnectGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCrossConnectGroupRequest, CreateCrossConnectGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCrossConnectGroupRequest, CreateCrossConnectGroupResponse>,
                        java.util.concurrent.Future<CreateCrossConnectGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCrossConnectGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCrossConnectGroupRequest, CreateCrossConnectGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDhcpOptionsResponse> createDhcpOptions(
            CreateDhcpOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDhcpOptionsRequest, CreateDhcpOptionsResponse>
                    handler) {
        LOG.trace("Called async createDhcpOptions");
        final CreateDhcpOptionsRequest interceptedRequest =
                CreateDhcpOptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDhcpOptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateDhcpOptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/CreateDhcpOptions");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDhcpOptionsResponse>
                transformer =
                        CreateDhcpOptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDhcpOptionsRequest, CreateDhcpOptionsResponse>,
                        java.util.concurrent.Future<CreateDhcpOptionsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDhcpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDhcpOptionsRequest, CreateDhcpOptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrgResponse> createDrg(
            CreateDrgRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDrgRequest, CreateDrgResponse>
                    handler) {
        LOG.trace("Called async createDrg");
        final CreateDrgRequest interceptedRequest = CreateDrgConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateDrg",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/CreateDrg");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDrgResponse>
                transformer =
                        CreateDrgConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDrgRequest, CreateDrgResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateDrgRequest, CreateDrgResponse>,
                        java.util.concurrent.Future<CreateDrgResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrgDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrgRequest, CreateDrgResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrgAttachmentResponse> createDrgAttachment(
            CreateDrgAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrgAttachmentRequest, CreateDrgAttachmentResponse>
                    handler) {
        LOG.trace("Called async createDrgAttachment");
        final CreateDrgAttachmentRequest interceptedRequest =
                CreateDrgAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateDrgAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/CreateDrgAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDrgAttachmentResponse>
                transformer =
                        CreateDrgAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDrgAttachmentRequest, CreateDrgAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrgAttachmentRequest, CreateDrgAttachmentResponse>,
                        java.util.concurrent.Future<CreateDrgAttachmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrgAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrgAttachmentRequest, CreateDrgAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrgRouteDistributionResponse>
            createDrgRouteDistribution(
                    CreateDrgRouteDistributionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDrgRouteDistributionRequest,
                                    CreateDrgRouteDistributionResponse>
                            handler) {
        LOG.trace("Called async createDrgRouteDistribution");
        final CreateDrgRouteDistributionRequest interceptedRequest =
                CreateDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/CreateDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDrgRouteDistributionResponse>
                transformer =
                        CreateDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDrgRouteDistributionRequest, CreateDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrgRouteDistributionRequest,
                                CreateDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<CreateDrgRouteDistributionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrgRouteDistributionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrgRouteDistributionRequest, CreateDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDrgRouteTableResponse> createDrgRouteTable(
            CreateDrgRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDrgRouteTableRequest, CreateDrgRouteTableResponse>
                    handler) {
        LOG.trace("Called async createDrgRouteTable");
        final CreateDrgRouteTableRequest interceptedRequest =
                CreateDrgRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDrgRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateDrgRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/CreateDrgRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDrgRouteTableResponse>
                transformer =
                        CreateDrgRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDrgRouteTableRequest, CreateDrgRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDrgRouteTableRequest, CreateDrgRouteTableResponse>,
                        java.util.concurrent.Future<CreateDrgRouteTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDrgRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDrgRouteTableRequest, CreateDrgRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIPSecConnectionResponse> createIPSecConnection(
            CreateIPSecConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIPSecConnectionRequest, CreateIPSecConnectionResponse>
                    handler) {
        LOG.trace("Called async createIPSecConnection");
        final CreateIPSecConnectionRequest interceptedRequest =
                CreateIPSecConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIPSecConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateIPSecConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/CreateIPSecConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIPSecConnectionResponse>
                transformer =
                        CreateIPSecConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIPSecConnectionRequest, CreateIPSecConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIPSecConnectionRequest, CreateIPSecConnectionResponse>,
                        java.util.concurrent.Future<CreateIPSecConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIPSecConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIPSecConnectionRequest, CreateIPSecConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateInternetGatewayResponse> createInternetGateway(
            CreateInternetGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInternetGatewayRequest, CreateInternetGatewayResponse>
                    handler) {
        LOG.trace("Called async createInternetGateway");
        final CreateInternetGatewayRequest interceptedRequest =
                CreateInternetGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInternetGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateInternetGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/CreateInternetGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateInternetGatewayResponse>
                transformer =
                        CreateInternetGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateInternetGatewayRequest, CreateInternetGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInternetGatewayRequest, CreateInternetGatewayResponse>,
                        java.util.concurrent.Future<CreateInternetGatewayResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateInternetGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInternetGatewayRequest, CreateInternetGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateIpv6Response> createIpv6(
            CreateIpv6Request request,
            final com.oracle.bmc.responses.AsyncHandler<CreateIpv6Request, CreateIpv6Response>
                    handler) {
        LOG.trace("Called async createIpv6");
        final CreateIpv6Request interceptedRequest = CreateIpv6Converter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIpv6Converter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateIpv6",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/CreateIpv6");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIpv6Response>
                transformer =
                        CreateIpv6Converter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateIpv6Request, CreateIpv6Response> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIpv6Request, CreateIpv6Response>,
                        java.util.concurrent.Future<CreateIpv6Response>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateIpv6Details(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIpv6Request, CreateIpv6Response>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateLocalPeeringGatewayResponse> createLocalPeeringGateway(
            CreateLocalPeeringGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLocalPeeringGatewayRequest, CreateLocalPeeringGatewayResponse>
                    handler) {
        LOG.trace("Called async createLocalPeeringGateway");
        final CreateLocalPeeringGatewayRequest interceptedRequest =
                CreateLocalPeeringGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLocalPeeringGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateLocalPeeringGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/CreateLocalPeeringGateway");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateLocalPeeringGatewayResponse>
                transformer =
                        CreateLocalPeeringGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateLocalPeeringGatewayRequest, CreateLocalPeeringGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateLocalPeeringGatewayRequest,
                                CreateLocalPeeringGatewayResponse>,
                        java.util.concurrent.Future<CreateLocalPeeringGatewayResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateLocalPeeringGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateLocalPeeringGatewayRequest, CreateLocalPeeringGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNatGatewayResponse> createNatGateway(
            CreateNatGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNatGatewayRequest, CreateNatGatewayResponse>
                    handler) {
        LOG.trace("Called async createNatGateway");
        final CreateNatGatewayRequest interceptedRequest =
                CreateNatGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNatGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateNatGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/CreateNatGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateNatGatewayResponse>
                transformer =
                        CreateNatGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNatGatewayRequest, CreateNatGatewayResponse>,
                        java.util.concurrent.Future<CreateNatGatewayResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNatGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNatGatewayRequest, CreateNatGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSecurityGroupResponse>
            createNetworkSecurityGroup(
                    CreateNetworkSecurityGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNetworkSecurityGroupRequest,
                                    CreateNetworkSecurityGroupResponse>
                            handler) {
        LOG.trace("Called async createNetworkSecurityGroup");
        final CreateNetworkSecurityGroupRequest interceptedRequest =
                CreateNetworkSecurityGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkSecurityGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateNetworkSecurityGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/CreateNetworkSecurityGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateNetworkSecurityGroupResponse>
                transformer =
                        CreateNetworkSecurityGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkSecurityGroupRequest, CreateNetworkSecurityGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkSecurityGroupRequest,
                                CreateNetworkSecurityGroupResponse>,
                        java.util.concurrent.Future<CreateNetworkSecurityGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNetworkSecurityGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkSecurityGroupRequest, CreateNetworkSecurityGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateIpResponse> createPrivateIp(
            CreatePrivateIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateIpRequest, CreatePrivateIpResponse>
                    handler) {
        LOG.trace("Called async createPrivateIp");
        final CreatePrivateIpRequest interceptedRequest =
                CreatePrivateIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePrivateIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreatePrivateIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/CreatePrivateIp");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePrivateIpResponse>
                transformer =
                        CreatePrivateIpConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePrivateIpRequest, CreatePrivateIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePrivateIpRequest, CreatePrivateIpResponse>,
                        java.util.concurrent.Future<CreatePrivateIpResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePrivateIpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePrivateIpRequest, CreatePrivateIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePublicIpResponse> createPublicIp(
            CreatePublicIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePublicIpRequest, CreatePublicIpResponse>
                    handler) {
        LOG.trace("Called async createPublicIp");
        final CreatePublicIpRequest interceptedRequest =
                CreatePublicIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePublicIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreatePublicIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/CreatePublicIp");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePublicIpResponse>
                transformer =
                        CreatePublicIpConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePublicIpRequest, CreatePublicIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePublicIpRequest, CreatePublicIpResponse>,
                        java.util.concurrent.Future<CreatePublicIpResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePublicIpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePublicIpRequest, CreatePublicIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreatePublicIpPoolResponse> createPublicIpPool(
            CreatePublicIpPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePublicIpPoolRequest, CreatePublicIpPoolResponse>
                    handler) {
        LOG.trace("Called async createPublicIpPool");
        final CreatePublicIpPoolRequest interceptedRequest =
                CreatePublicIpPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePublicIpPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreatePublicIpPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/CreatePublicIpPool");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePublicIpPoolResponse>
                transformer =
                        CreatePublicIpPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePublicIpPoolRequest, CreatePublicIpPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePublicIpPoolRequest, CreatePublicIpPoolResponse>,
                        java.util.concurrent.Future<CreatePublicIpPoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreatePublicIpPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePublicIpPoolRequest, CreatePublicIpPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRemotePeeringConnectionResponse>
            createRemotePeeringConnection(
                    CreateRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateRemotePeeringConnectionRequest,
                                    CreateRemotePeeringConnectionResponse>
                            handler) {
        LOG.trace("Called async createRemotePeeringConnection");
        final CreateRemotePeeringConnectionRequest interceptedRequest =
                CreateRemotePeeringConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRemotePeeringConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateRemotePeeringConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/CreateRemotePeeringConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateRemotePeeringConnectionResponse>
                transformer =
                        CreateRemotePeeringConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateRemotePeeringConnectionRequest, CreateRemotePeeringConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRemotePeeringConnectionRequest,
                                CreateRemotePeeringConnectionResponse>,
                        java.util.concurrent.Future<CreateRemotePeeringConnectionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRemotePeeringConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRemotePeeringConnectionRequest, CreateRemotePeeringConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateRouteTableResponse> createRouteTable(
            CreateRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRouteTableRequest, CreateRouteTableResponse>
                    handler) {
        LOG.trace("Called async createRouteTable");
        final CreateRouteTableRequest interceptedRequest =
                CreateRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/CreateRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRouteTableResponse>
                transformer =
                        CreateRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRouteTableRequest, CreateRouteTableResponse>,
                        java.util.concurrent.Future<CreateRouteTableResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRouteTableRequest, CreateRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityListResponse> createSecurityList(
            CreateSecurityListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityListRequest, CreateSecurityListResponse>
                    handler) {
        LOG.trace("Called async createSecurityList");
        final CreateSecurityListRequest interceptedRequest =
                CreateSecurityListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateSecurityList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/CreateSecurityList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityListResponse>
                transformer =
                        CreateSecurityListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSecurityListRequest, CreateSecurityListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityListRequest, CreateSecurityListResponse>,
                        java.util.concurrent.Future<CreateSecurityListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityListRequest, CreateSecurityListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateServiceGatewayResponse> createServiceGateway(
            CreateServiceGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceGatewayRequest, CreateServiceGatewayResponse>
                    handler) {
        LOG.trace("Called async createServiceGateway");
        final CreateServiceGatewayRequest interceptedRequest =
                CreateServiceGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateServiceGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/CreateServiceGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateServiceGatewayResponse>
                transformer =
                        CreateServiceGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateServiceGatewayRequest, CreateServiceGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateServiceGatewayRequest, CreateServiceGatewayResponse>,
                        java.util.concurrent.Future<CreateServiceGatewayResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateServiceGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateServiceGatewayRequest, CreateServiceGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetResponse> createSubnet(
            CreateSubnetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSubnetRequest, CreateSubnetResponse>
                    handler) {
        LOG.trace("Called async createSubnet");
        final CreateSubnetRequest interceptedRequest =
                CreateSubnetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSubnetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateSubnet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/CreateSubnet");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSubnetResponse>
                transformer =
                        CreateSubnetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSubnetRequest, CreateSubnetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSubnetRequest, CreateSubnetResponse>,
                        java.util.concurrent.Future<CreateSubnetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSubnetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSubnetRequest, CreateSubnetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVcnResponse> createVcn(
            CreateVcnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVcnRequest, CreateVcnResponse>
                    handler) {
        LOG.trace("Called async createVcn");
        final CreateVcnRequest interceptedRequest = CreateVcnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVcnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateVcn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/CreateVcn");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateVcnResponse>
                transformer =
                        CreateVcnConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateVcnRequest, CreateVcnResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateVcnRequest, CreateVcnResponse>,
                        java.util.concurrent.Future<CreateVcnResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVcnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVcnRequest, CreateVcnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualCircuitResponse> createVirtualCircuit(
            CreateVirtualCircuitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualCircuitRequest, CreateVirtualCircuitResponse>
                    handler) {
        LOG.trace("Called async createVirtualCircuit");
        final CreateVirtualCircuitRequest interceptedRequest =
                CreateVirtualCircuitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVirtualCircuitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateVirtualCircuit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/CreateVirtualCircuit");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateVirtualCircuitResponse>
                transformer =
                        CreateVirtualCircuitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateVirtualCircuitRequest, CreateVirtualCircuitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVirtualCircuitRequest, CreateVirtualCircuitResponse>,
                        java.util.concurrent.Future<CreateVirtualCircuitResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVirtualCircuitDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVirtualCircuitRequest, CreateVirtualCircuitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVlanResponse> createVlan(
            CreateVlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVlanRequest, CreateVlanResponse>
                    handler) {
        LOG.trace("Called async createVlan");
        final CreateVlanRequest interceptedRequest = CreateVlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateVlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/CreateVlan");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateVlanResponse>
                transformer =
                        CreateVlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateVlanRequest, CreateVlanResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVlanRequest, CreateVlanResponse>,
                        java.util.concurrent.Future<CreateVlanResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVlanDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVlanRequest, CreateVlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateVtapResponse> createVtap(
            CreateVtapRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVtapRequest, CreateVtapResponse>
                    handler) {
        LOG.trace("Called async createVtap");
        final CreateVtapRequest interceptedRequest = CreateVtapConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateVtapConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "CreateVtap",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/CreateVtap");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateVtapResponse>
                transformer =
                        CreateVtapConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateVtapRequest, CreateVtapResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateVtapRequest, CreateVtapResponse>,
                        java.util.concurrent.Future<CreateVtapResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateVtapDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateVtapRequest, CreateVtapResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteByoipRangeResponse> deleteByoipRange(
            DeleteByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteByoipRangeRequest, DeleteByoipRangeResponse>
                    handler) {
        LOG.trace("Called async deleteByoipRange");
        final DeleteByoipRangeRequest interceptedRequest =
                DeleteByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/DeleteByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteByoipRangeResponse>
                transformer =
                        DeleteByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteByoipRangeRequest, DeleteByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteByoipRangeRequest, DeleteByoipRangeResponse>,
                        java.util.concurrent.Future<DeleteByoipRangeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteByoipRangeRequest, DeleteByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCaptureFilterResponse> deleteCaptureFilter(
            DeleteCaptureFilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCaptureFilterRequest, DeleteCaptureFilterResponse>
                    handler) {
        LOG.trace("Called async deleteCaptureFilter");
        final DeleteCaptureFilterRequest interceptedRequest =
                DeleteCaptureFilterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCaptureFilterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteCaptureFilter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/DeleteCaptureFilter");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCaptureFilterResponse>
                transformer =
                        DeleteCaptureFilterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCaptureFilterRequest, DeleteCaptureFilterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCaptureFilterRequest, DeleteCaptureFilterResponse>,
                        java.util.concurrent.Future<DeleteCaptureFilterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCaptureFilterRequest, DeleteCaptureFilterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCpeResponse> deleteCpe(
            DeleteCpeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteCpeRequest, DeleteCpeResponse>
                    handler) {
        LOG.trace("Called async deleteCpe");
        final DeleteCpeRequest interceptedRequest = DeleteCpeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCpeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteCpe", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCpeResponse>
                transformer =
                        DeleteCpeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCpeRequest, DeleteCpeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteCpeRequest, DeleteCpeResponse>,
                        java.util.concurrent.Future<DeleteCpeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCpeRequest, DeleteCpeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCrossConnectResponse> deleteCrossConnect(
            DeleteCrossConnectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCrossConnectRequest, DeleteCrossConnectResponse>
                    handler) {
        LOG.trace("Called async deleteCrossConnect");
        final DeleteCrossConnectRequest interceptedRequest =
                DeleteCrossConnectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCrossConnectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteCrossConnect", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCrossConnectResponse>
                transformer =
                        DeleteCrossConnectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCrossConnectRequest, DeleteCrossConnectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCrossConnectRequest, DeleteCrossConnectResponse>,
                        java.util.concurrent.Future<DeleteCrossConnectResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCrossConnectRequest, DeleteCrossConnectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCrossConnectGroupResponse> deleteCrossConnectGroup(
            DeleteCrossConnectGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCrossConnectGroupRequest, DeleteCrossConnectGroupResponse>
                    handler) {
        LOG.trace("Called async deleteCrossConnectGroup");
        final DeleteCrossConnectGroupRequest interceptedRequest =
                DeleteCrossConnectGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCrossConnectGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteCrossConnectGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCrossConnectGroupResponse>
                transformer =
                        DeleteCrossConnectGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCrossConnectGroupRequest, DeleteCrossConnectGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCrossConnectGroupRequest, DeleteCrossConnectGroupResponse>,
                        java.util.concurrent.Future<DeleteCrossConnectGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCrossConnectGroupRequest, DeleteCrossConnectGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDhcpOptionsResponse> deleteDhcpOptions(
            DeleteDhcpOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse>
                    handler) {
        LOG.trace("Called async deleteDhcpOptions");
        final DeleteDhcpOptionsRequest interceptedRequest =
                DeleteDhcpOptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDhcpOptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteDhcpOptions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDhcpOptionsResponse>
                transformer =
                        DeleteDhcpOptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse>,
                        java.util.concurrent.Future<DeleteDhcpOptionsResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrgResponse> deleteDrg(
            DeleteDrgRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDrgRequest, DeleteDrgResponse>
                    handler) {
        LOG.trace("Called async deleteDrg");
        final DeleteDrgRequest interceptedRequest = DeleteDrgConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteDrg", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDrgResponse>
                transformer =
                        DeleteDrgConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDrgRequest, DeleteDrgResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteDrgRequest, DeleteDrgResponse>,
                        java.util.concurrent.Future<DeleteDrgResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrgRequest, DeleteDrgResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrgAttachmentResponse> deleteDrgAttachment(
            DeleteDrgAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse>
                    handler) {
        LOG.trace("Called async deleteDrgAttachment");
        final DeleteDrgAttachmentRequest interceptedRequest =
                DeleteDrgAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteDrgAttachment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDrgAttachmentResponse>
                transformer =
                        DeleteDrgAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse>,
                        java.util.concurrent.Future<DeleteDrgAttachmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrgRouteDistributionResponse>
            deleteDrgRouteDistribution(
                    DeleteDrgRouteDistributionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDrgRouteDistributionRequest,
                                    DeleteDrgRouteDistributionResponse>
                            handler) {
        LOG.trace("Called async deleteDrgRouteDistribution");
        final DeleteDrgRouteDistributionRequest interceptedRequest =
                DeleteDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/DeleteDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDrgRouteDistributionResponse>
                transformer =
                        DeleteDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDrgRouteDistributionRequest, DeleteDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrgRouteDistributionRequest,
                                DeleteDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<DeleteDrgRouteDistributionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrgRouteDistributionRequest, DeleteDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDrgRouteTableResponse> deleteDrgRouteTable(
            DeleteDrgRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrgRouteTableRequest, DeleteDrgRouteTableResponse>
                    handler) {
        LOG.trace("Called async deleteDrgRouteTable");
        final DeleteDrgRouteTableRequest interceptedRequest =
                DeleteDrgRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDrgRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteDrgRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternalPublicIp/DeleteDrgRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDrgRouteTableResponse>
                transformer =
                        DeleteDrgRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDrgRouteTableRequest, DeleteDrgRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDrgRouteTableRequest, DeleteDrgRouteTableResponse>,
                        java.util.concurrent.Future<DeleteDrgRouteTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDrgRouteTableRequest, DeleteDrgRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSecConnectionResponse> deleteIPSecConnection(
            DeleteIPSecConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse>
                    handler) {
        LOG.trace("Called async deleteIPSecConnection");
        final DeleteIPSecConnectionRequest interceptedRequest =
                DeleteIPSecConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIPSecConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteIPSecConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIPSecConnectionResponse>
                transformer =
                        DeleteIPSecConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse>,
                        java.util.concurrent.Future<DeleteIPSecConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteInternetGatewayResponse> deleteInternetGateway(
            DeleteInternetGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteInternetGatewayRequest, DeleteInternetGatewayResponse>
                    handler) {
        LOG.trace("Called async deleteInternetGateway");
        final DeleteInternetGatewayRequest interceptedRequest =
                DeleteInternetGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInternetGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteInternetGateway",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteInternetGatewayResponse>
                transformer =
                        DeleteInternetGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteInternetGatewayRequest, DeleteInternetGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteInternetGatewayRequest, DeleteInternetGatewayResponse>,
                        java.util.concurrent.Future<DeleteInternetGatewayResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteInternetGatewayRequest, DeleteInternetGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteIpv6Response> deleteIpv6(
            DeleteIpv6Request request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteIpv6Request, DeleteIpv6Response>
                    handler) {
        LOG.trace("Called async deleteIpv6");
        final DeleteIpv6Request interceptedRequest = DeleteIpv6Converter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIpv6Converter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteIpv6", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIpv6Response>
                transformer =
                        DeleteIpv6Converter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteIpv6Request, DeleteIpv6Response> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIpv6Request, DeleteIpv6Response>,
                        java.util.concurrent.Future<DeleteIpv6Response>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIpv6Request, DeleteIpv6Response>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteLocalPeeringGatewayResponse> deleteLocalPeeringGateway(
            DeleteLocalPeeringGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLocalPeeringGatewayRequest, DeleteLocalPeeringGatewayResponse>
                    handler) {
        LOG.trace("Called async deleteLocalPeeringGateway");
        final DeleteLocalPeeringGatewayRequest interceptedRequest =
                DeleteLocalPeeringGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLocalPeeringGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteLocalPeeringGateway",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteLocalPeeringGatewayResponse>
                transformer =
                        DeleteLocalPeeringGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteLocalPeeringGatewayRequest, DeleteLocalPeeringGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteLocalPeeringGatewayRequest,
                                DeleteLocalPeeringGatewayResponse>,
                        java.util.concurrent.Future<DeleteLocalPeeringGatewayResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteLocalPeeringGatewayRequest, DeleteLocalPeeringGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNatGatewayResponse> deleteNatGateway(
            DeleteNatGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNatGatewayRequest, DeleteNatGatewayResponse>
                    handler) {
        LOG.trace("Called async deleteNatGateway");
        final DeleteNatGatewayRequest interceptedRequest =
                DeleteNatGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNatGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteNatGateway", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNatGatewayResponse>
                transformer =
                        DeleteNatGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNatGatewayRequest, DeleteNatGatewayResponse>,
                        java.util.concurrent.Future<DeleteNatGatewayResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNatGatewayRequest, DeleteNatGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSecurityGroupResponse>
            deleteNetworkSecurityGroup(
                    DeleteNetworkSecurityGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNetworkSecurityGroupRequest,
                                    DeleteNetworkSecurityGroupResponse>
                            handler) {
        LOG.trace("Called async deleteNetworkSecurityGroup");
        final DeleteNetworkSecurityGroupRequest interceptedRequest =
                DeleteNetworkSecurityGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkSecurityGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteNetworkSecurityGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/DeleteNetworkSecurityGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteNetworkSecurityGroupResponse>
                transformer =
                        DeleteNetworkSecurityGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkSecurityGroupRequest, DeleteNetworkSecurityGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkSecurityGroupRequest,
                                DeleteNetworkSecurityGroupResponse>,
                        java.util.concurrent.Future<DeleteNetworkSecurityGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkSecurityGroupRequest, DeleteNetworkSecurityGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePrivateIpResponse> deletePrivateIp(
            DeletePrivateIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateIpRequest, DeletePrivateIpResponse>
                    handler) {
        LOG.trace("Called async deletePrivateIp");
        final DeletePrivateIpRequest interceptedRequest =
                DeletePrivateIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePrivateIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeletePrivateIp", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePrivateIpResponse>
                transformer =
                        DeletePrivateIpConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePrivateIpRequest, DeletePrivateIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePrivateIpRequest, DeletePrivateIpResponse>,
                        java.util.concurrent.Future<DeletePrivateIpResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePrivateIpRequest, DeletePrivateIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePublicIpResponse> deletePublicIp(
            DeletePublicIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePublicIpRequest, DeletePublicIpResponse>
                    handler) {
        LOG.trace("Called async deletePublicIp");
        final DeletePublicIpRequest interceptedRequest =
                DeletePublicIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePublicIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeletePublicIp", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePublicIpResponse>
                transformer =
                        DeletePublicIpConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePublicIpRequest, DeletePublicIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePublicIpRequest, DeletePublicIpResponse>,
                        java.util.concurrent.Future<DeletePublicIpResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePublicIpRequest, DeletePublicIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeletePublicIpPoolResponse> deletePublicIpPool(
            DeletePublicIpPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePublicIpPoolRequest, DeletePublicIpPoolResponse>
                    handler) {
        LOG.trace("Called async deletePublicIpPool");
        final DeletePublicIpPoolRequest interceptedRequest =
                DeletePublicIpPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePublicIpPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeletePublicIpPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/DeletePublicIpPool");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePublicIpPoolResponse>
                transformer =
                        DeletePublicIpPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePublicIpPoolRequest, DeletePublicIpPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePublicIpPoolRequest, DeletePublicIpPoolResponse>,
                        java.util.concurrent.Future<DeletePublicIpPoolResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePublicIpPoolRequest, DeletePublicIpPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRemotePeeringConnectionResponse>
            deleteRemotePeeringConnection(
                    DeleteRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteRemotePeeringConnectionRequest,
                                    DeleteRemotePeeringConnectionResponse>
                            handler) {
        LOG.trace("Called async deleteRemotePeeringConnection");
        final DeleteRemotePeeringConnectionRequest interceptedRequest =
                DeleteRemotePeeringConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRemotePeeringConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteRemotePeeringConnection",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteRemotePeeringConnectionResponse>
                transformer =
                        DeleteRemotePeeringConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteRemotePeeringConnectionRequest, DeleteRemotePeeringConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRemotePeeringConnectionRequest,
                                DeleteRemotePeeringConnectionResponse>,
                        java.util.concurrent.Future<DeleteRemotePeeringConnectionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRemotePeeringConnectionRequest, DeleteRemotePeeringConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteTableResponse> deleteRouteTable(
            DeleteRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRouteTableRequest, DeleteRouteTableResponse>
                    handler) {
        LOG.trace("Called async deleteRouteTable");
        final DeleteRouteTableRequest interceptedRequest =
                DeleteRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteRouteTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRouteTableResponse>
                transformer =
                        DeleteRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRouteTableRequest, DeleteRouteTableResponse>,
                        java.util.concurrent.Future<DeleteRouteTableResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRouteTableRequest, DeleteRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityListResponse> deleteSecurityList(
            DeleteSecurityListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityListRequest, DeleteSecurityListResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityList");
        final DeleteSecurityListRequest interceptedRequest =
                DeleteSecurityListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteSecurityList", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityListResponse>
                transformer =
                        DeleteSecurityListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSecurityListRequest, DeleteSecurityListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityListRequest, DeleteSecurityListResponse>,
                        java.util.concurrent.Future<DeleteSecurityListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityListRequest, DeleteSecurityListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceGatewayResponse> deleteServiceGateway(
            DeleteServiceGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceGatewayRequest, DeleteServiceGatewayResponse>
                    handler) {
        LOG.trace("Called async deleteServiceGateway");
        final DeleteServiceGatewayRequest interceptedRequest =
                DeleteServiceGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteServiceGateway",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteServiceGatewayResponse>
                transformer =
                        DeleteServiceGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteServiceGatewayRequest, DeleteServiceGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteServiceGatewayRequest, DeleteServiceGatewayResponse>,
                        java.util.concurrent.Future<DeleteServiceGatewayResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteServiceGatewayRequest, DeleteServiceGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetResponse> deleteSubnet(
            DeleteSubnetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResponse>
                    handler) {
        LOG.trace("Called async deleteSubnet");
        final DeleteSubnetRequest interceptedRequest =
                DeleteSubnetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSubnetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteSubnet", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSubnetResponse>
                transformer =
                        DeleteSubnetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSubnetRequest, DeleteSubnetResponse>,
                        java.util.concurrent.Future<DeleteSubnetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSubnetRequest, DeleteSubnetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVcnResponse> deleteVcn(
            DeleteVcnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteVcnRequest, DeleteVcnResponse>
                    handler) {
        LOG.trace("Called async deleteVcn");
        final DeleteVcnRequest interceptedRequest = DeleteVcnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVcnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "DeleteVcn", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteVcnResponse>
                transformer =
                        DeleteVcnConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteVcnRequest, DeleteVcnResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteVcnRequest, DeleteVcnResponse>,
                        java.util.concurrent.Future<DeleteVcnResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVcnRequest, DeleteVcnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualCircuitResponse> deleteVirtualCircuit(
            DeleteVirtualCircuitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualCircuitRequest, DeleteVirtualCircuitResponse>
                    handler) {
        LOG.trace("Called async deleteVirtualCircuit");
        final DeleteVirtualCircuitRequest interceptedRequest =
                DeleteVirtualCircuitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVirtualCircuitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteVirtualCircuit",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteVirtualCircuitResponse>
                transformer =
                        DeleteVirtualCircuitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteVirtualCircuitRequest, DeleteVirtualCircuitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVirtualCircuitRequest, DeleteVirtualCircuitResponse>,
                        java.util.concurrent.Future<DeleteVirtualCircuitResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVirtualCircuitRequest, DeleteVirtualCircuitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVlanResponse> deleteVlan(
            DeleteVlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteVlanRequest, DeleteVlanResponse>
                    handler) {
        LOG.trace("Called async deleteVlan");
        final DeleteVlanRequest interceptedRequest = DeleteVlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteVlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/DeleteVlan");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteVlanResponse>
                transformer =
                        DeleteVlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteVlanRequest, DeleteVlanResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVlanRequest, DeleteVlanResponse>,
                        java.util.concurrent.Future<DeleteVlanResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVlanRequest, DeleteVlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteVtapResponse> deleteVtap(
            DeleteVtapRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteVtapRequest, DeleteVtapResponse>
                    handler) {
        LOG.trace("Called async deleteVtap");
        final DeleteVtapRequest interceptedRequest = DeleteVtapConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteVtapConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DeleteVtap",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/DeleteVtap");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteVtapResponse>
                transformer =
                        DeleteVtapConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteVtapRequest, DeleteVtapResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteVtapRequest, DeleteVtapResponse>,
                        java.util.concurrent.Future<DeleteVtapResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteVtapRequest, DeleteVtapResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachServiceIdResponse> detachServiceId(
            DetachServiceIdRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetachServiceIdRequest, DetachServiceIdResponse>
                    handler) {
        LOG.trace("Called async detachServiceId");
        final DetachServiceIdRequest interceptedRequest =
                DetachServiceIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachServiceIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "DetachServiceId",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/DetachServiceId");
        final java.util.function.Function<javax.ws.rs.core.Response, DetachServiceIdResponse>
                transformer =
                        DetachServiceIdConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DetachServiceIdRequest, DetachServiceIdResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachServiceIdRequest, DetachServiceIdResponse>,
                        java.util.concurrent.Future<DetachServiceIdResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetachServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachServiceIdRequest, DetachServiceIdResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAllDrgAttachmentsResponse> getAllDrgAttachments(
            GetAllDrgAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>
                    handler) {
        LOG.trace("Called async getAllDrgAttachments");
        final GetAllDrgAttachmentsRequest interceptedRequest =
                GetAllDrgAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAllDrgAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetAllDrgAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetAllDrgAttachments");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAllDrgAttachmentsResponse>
                transformer =
                        GetAllDrgAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>,
                        java.util.concurrent.Future<GetAllDrgAttachmentsResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAllowedIkeIPSecParametersResponse>
            getAllowedIkeIPSecParameters(
                    GetAllowedIkeIPSecParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAllowedIkeIPSecParametersRequest,
                                    GetAllowedIkeIPSecParametersResponse>
                            handler) {
        LOG.trace("Called async getAllowedIkeIPSecParameters");
        final GetAllowedIkeIPSecParametersRequest interceptedRequest =
                GetAllowedIkeIPSecParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAllowedIkeIPSecParametersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetAllowedIkeIPSecParameters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AllowedIkeIPSecParameters/GetAllowedIkeIPSecParameters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAllowedIkeIPSecParametersResponse>
                transformer =
                        GetAllowedIkeIPSecParametersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAllowedIkeIPSecParametersRequest, GetAllowedIkeIPSecParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAllowedIkeIPSecParametersRequest,
                                GetAllowedIkeIPSecParametersResponse>,
                        java.util.concurrent.Future<GetAllowedIkeIPSecParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAllowedIkeIPSecParametersRequest, GetAllowedIkeIPSecParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetByoipRangeResponse> getByoipRange(
            GetByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetByoipRangeRequest, GetByoipRangeResponse>
                    handler) {
        LOG.trace("Called async getByoipRange");
        final GetByoipRangeRequest interceptedRequest =
                GetByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/GetByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, GetByoipRangeResponse>
                transformer =
                        GetByoipRangeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetByoipRangeRequest, GetByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetByoipRangeRequest, GetByoipRangeResponse>,
                        java.util.concurrent.Future<GetByoipRangeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetByoipRangeRequest, GetByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCaptureFilterResponse> getCaptureFilter(
            GetCaptureFilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCaptureFilterRequest, GetCaptureFilterResponse>
                    handler) {
        LOG.trace("Called async getCaptureFilter");
        final GetCaptureFilterRequest interceptedRequest =
                GetCaptureFilterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCaptureFilterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCaptureFilter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/GetCaptureFilter");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCaptureFilterResponse>
                transformer =
                        GetCaptureFilterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCaptureFilterRequest, GetCaptureFilterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCaptureFilterRequest, GetCaptureFilterResponse>,
                        java.util.concurrent.Future<GetCaptureFilterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCaptureFilterRequest, GetCaptureFilterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCpeResponse> getCpe(
            GetCpeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCpeRequest, GetCpeResponse> handler) {
        LOG.trace("Called async getCpe");
        final GetCpeRequest interceptedRequest = GetCpeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCpeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCpe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/GetCpe");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCpeResponse> transformer =
                GetCpeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCpeRequest, GetCpeResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetCpeRequest, GetCpeResponse>,
                        java.util.concurrent.Future<GetCpeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCpeRequest, GetCpeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCpeDeviceConfigContentResponse> getCpeDeviceConfigContent(
            GetCpeDeviceConfigContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCpeDeviceConfigContentRequest, GetCpeDeviceConfigContentResponse>
                    handler) {
        LOG.trace("Called async getCpeDeviceConfigContent");
        final GetCpeDeviceConfigContentRequest interceptedRequest =
                GetCpeDeviceConfigContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCpeDeviceConfigContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCpeDeviceConfigContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/GetCpeDeviceConfigContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCpeDeviceConfigContentResponse>
                transformer =
                        GetCpeDeviceConfigContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCpeDeviceConfigContentRequest, GetCpeDeviceConfigContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCpeDeviceConfigContentRequest,
                                GetCpeDeviceConfigContentResponse>,
                        java.util.concurrent.Future<GetCpeDeviceConfigContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCpeDeviceConfigContentRequest, GetCpeDeviceConfigContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCpeDeviceShapeResponse> getCpeDeviceShape(
            GetCpeDeviceShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCpeDeviceShapeRequest, GetCpeDeviceShapeResponse>
                    handler) {
        LOG.trace("Called async getCpeDeviceShape");
        final GetCpeDeviceShapeRequest interceptedRequest =
                GetCpeDeviceShapeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCpeDeviceShapeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCpeDeviceShape",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CpeDeviceShapeDetail/GetCpeDeviceShape");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCpeDeviceShapeResponse>
                transformer =
                        GetCpeDeviceShapeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCpeDeviceShapeRequest, GetCpeDeviceShapeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCpeDeviceShapeRequest, GetCpeDeviceShapeResponse>,
                        java.util.concurrent.Future<GetCpeDeviceShapeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCpeDeviceShapeRequest, GetCpeDeviceShapeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCrossConnectResponse> getCrossConnect(
            GetCrossConnectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCrossConnectRequest, GetCrossConnectResponse>
                    handler) {
        LOG.trace("Called async getCrossConnect");
        final GetCrossConnectRequest interceptedRequest =
                GetCrossConnectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCrossConnect",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/GetCrossConnect");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCrossConnectResponse>
                transformer =
                        GetCrossConnectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCrossConnectRequest, GetCrossConnectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCrossConnectRequest, GetCrossConnectResponse>,
                        java.util.concurrent.Future<GetCrossConnectResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCrossConnectRequest, GetCrossConnectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCrossConnectGroupResponse> getCrossConnectGroup(
            GetCrossConnectGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
                    handler) {
        LOG.trace("Called async getCrossConnectGroup");
        final GetCrossConnectGroupRequest interceptedRequest =
                GetCrossConnectGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/GetCrossConnectGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCrossConnectGroupResponse>
                transformer =
                        GetCrossConnectGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>,
                        java.util.concurrent.Future<GetCrossConnectGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCrossConnectLetterOfAuthorityResponse>
            getCrossConnectLetterOfAuthority(
                    GetCrossConnectLetterOfAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCrossConnectLetterOfAuthorityRequest,
                                    GetCrossConnectLetterOfAuthorityResponse>
                            handler) {
        LOG.trace("Called async getCrossConnectLetterOfAuthority");
        final GetCrossConnectLetterOfAuthorityRequest interceptedRequest =
                GetCrossConnectLetterOfAuthorityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectLetterOfAuthorityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectLetterOfAuthority",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LetterOfAuthority/GetCrossConnectLetterOfAuthority");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCrossConnectLetterOfAuthorityResponse>
                transformer =
                        GetCrossConnectLetterOfAuthorityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCrossConnectLetterOfAuthorityRequest,
                        GetCrossConnectLetterOfAuthorityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCrossConnectLetterOfAuthorityRequest,
                                GetCrossConnectLetterOfAuthorityResponse>,
                        java.util.concurrent.Future<GetCrossConnectLetterOfAuthorityResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCrossConnectLetterOfAuthorityRequest,
                    GetCrossConnectLetterOfAuthorityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCrossConnectStatusResponse> getCrossConnectStatus(
            GetCrossConnectStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCrossConnectStatusRequest, GetCrossConnectStatusResponse>
                    handler) {
        LOG.trace("Called async getCrossConnectStatus");
        final GetCrossConnectStatusRequest interceptedRequest =
                GetCrossConnectStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCrossConnectStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectStatus/GetCrossConnectStatus");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCrossConnectStatusResponse>
                transformer =
                        GetCrossConnectStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCrossConnectStatusRequest, GetCrossConnectStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCrossConnectStatusRequest, GetCrossConnectStatusResponse>,
                        java.util.concurrent.Future<GetCrossConnectStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCrossConnectStatusRequest, GetCrossConnectStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDhcpOptionsResponse> getDhcpOptions(
            GetDhcpOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDhcpOptionsRequest, GetDhcpOptionsResponse>
                    handler) {
        LOG.trace("Called async getDhcpOptions");
        final GetDhcpOptionsRequest interceptedRequest =
                GetDhcpOptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDhcpOptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDhcpOptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/GetDhcpOptions");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDhcpOptionsResponse>
                transformer =
                        GetDhcpOptionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDhcpOptionsRequest, GetDhcpOptionsResponse>,
                        java.util.concurrent.Future<GetDhcpOptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDhcpOptionsRequest, GetDhcpOptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrgResponse> getDrg(
            GetDrgRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDrgRequest, GetDrgResponse> handler) {
        LOG.trace("Called async getDrg");
        final GetDrgRequest interceptedRequest = GetDrgConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDrg",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetDrg");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrgResponse> transformer =
                GetDrgConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDrgRequest, GetDrgResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetDrgRequest, GetDrgResponse>,
                        java.util.concurrent.Future<GetDrgResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrgRequest, GetDrgResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrgAttachmentResponse> getDrgAttachment(
            GetDrgAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrgAttachmentRequest, GetDrgAttachmentResponse>
                    handler) {
        LOG.trace("Called async getDrgAttachment");
        final GetDrgAttachmentRequest interceptedRequest =
                GetDrgAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDrgAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/GetDrgAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrgAttachmentResponse>
                transformer =
                        GetDrgAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrgAttachmentRequest, GetDrgAttachmentResponse>,
                        java.util.concurrent.Future<GetDrgAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrgAttachmentRequest, GetDrgAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrgRedundancyStatusResponse> getDrgRedundancyStatus(
            GetDrgRedundancyStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrgRedundancyStatusRequest, GetDrgRedundancyStatusResponse>
                    handler) {
        LOG.trace("Called async getDrgRedundancyStatus");
        final GetDrgRedundancyStatusRequest interceptedRequest =
                GetDrgRedundancyStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgRedundancyStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDrgRedundancyStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRedundancyStatus/GetDrgRedundancyStatus");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrgRedundancyStatusResponse>
                transformer =
                        GetDrgRedundancyStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDrgRedundancyStatusRequest, GetDrgRedundancyStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrgRedundancyStatusRequest, GetDrgRedundancyStatusResponse>,
                        java.util.concurrent.Future<GetDrgRedundancyStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrgRedundancyStatusRequest, GetDrgRedundancyStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrgRouteDistributionResponse> getDrgRouteDistribution(
            GetDrgRouteDistributionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
                    handler) {
        LOG.trace("Called async getDrgRouteDistribution");
        final GetDrgRouteDistributionRequest interceptedRequest =
                GetDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/GetDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDrgRouteDistributionResponse>
                transformer =
                        GetDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<GetDrgRouteDistributionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDrgRouteTableResponse> getDrgRouteTable(
            GetDrgRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDrgRouteTableRequest, GetDrgRouteTableResponse>
                    handler) {
        LOG.trace("Called async getDrgRouteTable");
        final GetDrgRouteTableRequest interceptedRequest =
                GetDrgRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDrgRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetDrgRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/GetDrgRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDrgRouteTableResponse>
                transformer =
                        GetDrgRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDrgRouteTableRequest, GetDrgRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDrgRouteTableRequest, GetDrgRouteTableResponse>,
                        java.util.concurrent.Future<GetDrgRouteTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDrgRouteTableRequest, GetDrgRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFastConnectProviderServiceResponse>
            getFastConnectProviderService(
                    GetFastConnectProviderServiceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFastConnectProviderServiceRequest,
                                    GetFastConnectProviderServiceResponse>
                            handler) {
        LOG.trace("Called async getFastConnectProviderService");
        final GetFastConnectProviderServiceRequest interceptedRequest =
                GetFastConnectProviderServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFastConnectProviderServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetFastConnectProviderService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/GetFastConnectProviderService");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFastConnectProviderServiceResponse>
                transformer =
                        GetFastConnectProviderServiceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFastConnectProviderServiceRequest, GetFastConnectProviderServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFastConnectProviderServiceRequest,
                                GetFastConnectProviderServiceResponse>,
                        java.util.concurrent.Future<GetFastConnectProviderServiceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFastConnectProviderServiceRequest, GetFastConnectProviderServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetFastConnectProviderServiceKeyResponse>
            getFastConnectProviderServiceKey(
                    GetFastConnectProviderServiceKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetFastConnectProviderServiceKeyRequest,
                                    GetFastConnectProviderServiceKeyResponse>
                            handler) {
        LOG.trace("Called async getFastConnectProviderServiceKey");
        final GetFastConnectProviderServiceKeyRequest interceptedRequest =
                GetFastConnectProviderServiceKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFastConnectProviderServiceKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetFastConnectProviderServiceKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderServiceKey/GetFastConnectProviderServiceKey");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetFastConnectProviderServiceKeyResponse>
                transformer =
                        GetFastConnectProviderServiceKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetFastConnectProviderServiceKeyRequest,
                        GetFastConnectProviderServiceKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetFastConnectProviderServiceKeyRequest,
                                GetFastConnectProviderServiceKeyResponse>,
                        java.util.concurrent.Future<GetFastConnectProviderServiceKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetFastConnectProviderServiceKeyRequest,
                    GetFastConnectProviderServiceKeyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionResponse> getIPSecConnection(
            GetIPSecConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIPSecConnectionRequest, GetIPSecConnectionResponse>
                    handler) {
        LOG.trace("Called async getIPSecConnection");
        final GetIPSecConnectionRequest interceptedRequest =
                GetIPSecConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/GetIPSecConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIPSecConnectionResponse>
                transformer =
                        GetIPSecConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionRequest, GetIPSecConnectionResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionRequest, GetIPSecConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionDeviceConfigResponse>
            getIPSecConnectionDeviceConfig(
                    GetIPSecConnectionDeviceConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionDeviceConfigRequest,
                                    GetIPSecConnectionDeviceConfigResponse>
                            handler) {
        LOG.trace("Called async getIPSecConnectionDeviceConfig");
        final GetIPSecConnectionDeviceConfigRequest interceptedRequest =
                GetIPSecConnectionDeviceConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionDeviceConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionDeviceConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionDeviceConfig/GetIPSecConnectionDeviceConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionDeviceConfigResponse>
                transformer =
                        GetIPSecConnectionDeviceConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIPSecConnectionDeviceConfigRequest,
                        GetIPSecConnectionDeviceConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionDeviceConfigRequest,
                                GetIPSecConnectionDeviceConfigResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionDeviceConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionDeviceConfigRequest, GetIPSecConnectionDeviceConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionDeviceStatusResponse>
            getIPSecConnectionDeviceStatus(
                    GetIPSecConnectionDeviceStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionDeviceStatusRequest,
                                    GetIPSecConnectionDeviceStatusResponse>
                            handler) {
        LOG.trace("Called async getIPSecConnectionDeviceStatus");
        final GetIPSecConnectionDeviceStatusRequest interceptedRequest =
                GetIPSecConnectionDeviceStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionDeviceStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionDeviceStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionDeviceStatus/GetIPSecConnectionDeviceStatus");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionDeviceStatusResponse>
                transformer =
                        GetIPSecConnectionDeviceStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIPSecConnectionDeviceStatusRequest,
                        GetIPSecConnectionDeviceStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionDeviceStatusRequest,
                                GetIPSecConnectionDeviceStatusResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionDeviceStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionDeviceStatusRequest, GetIPSecConnectionDeviceStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionTunnelResponse> getIPSecConnectionTunnel(
            GetIPSecConnectionTunnelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
                    handler) {
        LOG.trace("Called async getIPSecConnectionTunnel");
        final GetIPSecConnectionTunnelRequest interceptedRequest =
                GetIPSecConnectionTunnelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionTunnelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/GetIPSecConnectionTunnel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionTunnelResponse>
                transformer =
                        GetIPSecConnectionTunnelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionTunnelResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionTunnelErrorResponse>
            getIPSecConnectionTunnelError(
                    GetIPSecConnectionTunnelErrorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionTunnelErrorRequest,
                                    GetIPSecConnectionTunnelErrorResponse>
                            handler) {
        LOG.trace("Called async getIPSecConnectionTunnelError");
        final GetIPSecConnectionTunnelErrorRequest interceptedRequest =
                GetIPSecConnectionTunnelErrorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionTunnelErrorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnelError",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelErrorDetails/GetIPSecConnectionTunnelError");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionTunnelErrorResponse>
                transformer =
                        GetIPSecConnectionTunnelErrorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIPSecConnectionTunnelErrorRequest, GetIPSecConnectionTunnelErrorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionTunnelErrorRequest,
                                GetIPSecConnectionTunnelErrorResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionTunnelErrorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionTunnelErrorRequest, GetIPSecConnectionTunnelErrorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIPSecConnectionTunnelSharedSecretResponse>
            getIPSecConnectionTunnelSharedSecret(
                    GetIPSecConnectionTunnelSharedSecretRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionTunnelSharedSecretRequest,
                                    GetIPSecConnectionTunnelSharedSecretResponse>
                            handler) {
        LOG.trace("Called async getIPSecConnectionTunnelSharedSecret");
        final GetIPSecConnectionTunnelSharedSecretRequest interceptedRequest =
                GetIPSecConnectionTunnelSharedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIPSecConnectionTunnelSharedSecretConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnelSharedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelSharedSecret/GetIPSecConnectionTunnelSharedSecret");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIPSecConnectionTunnelSharedSecretResponse>
                transformer =
                        GetIPSecConnectionTunnelSharedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIPSecConnectionTunnelSharedSecretRequest,
                        GetIPSecConnectionTunnelSharedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIPSecConnectionTunnelSharedSecretRequest,
                                GetIPSecConnectionTunnelSharedSecretResponse>,
                        java.util.concurrent.Future<GetIPSecConnectionTunnelSharedSecretResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIPSecConnectionTunnelSharedSecretRequest,
                    GetIPSecConnectionTunnelSharedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInternetGatewayResponse> getInternetGateway(
            GetInternetGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInternetGatewayRequest, GetInternetGatewayResponse>
                    handler) {
        LOG.trace("Called async getInternetGateway");
        final GetInternetGatewayRequest interceptedRequest =
                GetInternetGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInternetGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetInternetGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/GetInternetGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, GetInternetGatewayResponse>
                transformer =
                        GetInternetGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetInternetGatewayRequest, GetInternetGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInternetGatewayRequest, GetInternetGatewayResponse>,
                        java.util.concurrent.Future<GetInternetGatewayResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInternetGatewayRequest, GetInternetGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIpsecCpeDeviceConfigContentResponse>
            getIpsecCpeDeviceConfigContent(
                    GetIpsecCpeDeviceConfigContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIpsecCpeDeviceConfigContentRequest,
                                    GetIpsecCpeDeviceConfigContentResponse>
                            handler) {
        LOG.trace("Called async getIpsecCpeDeviceConfigContent");
        final GetIpsecCpeDeviceConfigContentRequest interceptedRequest =
                GetIpsecCpeDeviceConfigContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIpsecCpeDeviceConfigContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIpsecCpeDeviceConfigContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/GetIpsecCpeDeviceConfigContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIpsecCpeDeviceConfigContentResponse>
                transformer =
                        GetIpsecCpeDeviceConfigContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIpsecCpeDeviceConfigContentRequest,
                        GetIpsecCpeDeviceConfigContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIpsecCpeDeviceConfigContentRequest,
                                GetIpsecCpeDeviceConfigContentResponse>,
                        java.util.concurrent.Future<GetIpsecCpeDeviceConfigContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIpsecCpeDeviceConfigContentRequest, GetIpsecCpeDeviceConfigContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetIpv6Response> getIpv6(
            GetIpv6Request request,
            final com.oracle.bmc.responses.AsyncHandler<GetIpv6Request, GetIpv6Response> handler) {
        LOG.trace("Called async getIpv6");
        final GetIpv6Request interceptedRequest = GetIpv6Converter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIpv6Converter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetIpv6",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/GetIpv6");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIpv6Response> transformer =
                GetIpv6Converter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIpv6Request, GetIpv6Response> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetIpv6Request, GetIpv6Response>,
                        java.util.concurrent.Future<GetIpv6Response>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIpv6Request, GetIpv6Response>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetLocalPeeringGatewayResponse> getLocalPeeringGateway(
            GetLocalPeeringGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
                    handler) {
        LOG.trace("Called async getLocalPeeringGateway");
        final GetLocalPeeringGatewayRequest interceptedRequest =
                GetLocalPeeringGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLocalPeeringGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetLocalPeeringGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/GetLocalPeeringGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, GetLocalPeeringGatewayResponse>
                transformer =
                        GetLocalPeeringGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>,
                        java.util.concurrent.Future<GetLocalPeeringGatewayResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNatGatewayResponse> getNatGateway(
            GetNatGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNatGatewayRequest, GetNatGatewayResponse>
                    handler) {
        LOG.trace("Called async getNatGateway");
        final GetNatGatewayRequest interceptedRequest =
                GetNatGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNatGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetNatGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/GetNatGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNatGatewayResponse>
                transformer =
                        GetNatGatewayConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNatGatewayRequest, GetNatGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNatGatewayRequest, GetNatGatewayResponse>,
                        java.util.concurrent.Future<GetNatGatewayResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNatGatewayRequest, GetNatGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSecurityGroupResponse> getNetworkSecurityGroup(
            GetNetworkSecurityGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
                    handler) {
        LOG.trace("Called async getNetworkSecurityGroup");
        final GetNetworkSecurityGroupRequest interceptedRequest =
                GetNetworkSecurityGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkSecurityGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetNetworkSecurityGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/GetNetworkSecurityGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetNetworkSecurityGroupResponse>
                transformer =
                        GetNetworkSecurityGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>,
                        java.util.concurrent.Future<GetNetworkSecurityGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkingTopologyResponse> getNetworkingTopology(
            GetNetworkingTopologyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkingTopologyRequest, GetNetworkingTopologyResponse>
                    handler) {
        LOG.trace("Called async getNetworkingTopology");
        final GetNetworkingTopologyRequest interceptedRequest =
                GetNetworkingTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkingTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetNetworkingTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkingTopology/GetNetworkingTopology");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNetworkingTopologyResponse>
                transformer =
                        GetNetworkingTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkingTopologyRequest, GetNetworkingTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkingTopologyRequest, GetNetworkingTopologyResponse>,
                        java.util.concurrent.Future<GetNetworkingTopologyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkingTopologyRequest, GetNetworkingTopologyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPrivateIpResponse> getPrivateIp(
            GetPrivateIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPrivateIpRequest, GetPrivateIpResponse>
                    handler) {
        LOG.trace("Called async getPrivateIp");
        final GetPrivateIpRequest interceptedRequest =
                GetPrivateIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPrivateIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetPrivateIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/GetPrivateIp");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPrivateIpResponse>
                transformer =
                        GetPrivateIpConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPrivateIpRequest, GetPrivateIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPrivateIpRequest, GetPrivateIpResponse>,
                        java.util.concurrent.Future<GetPrivateIpResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPrivateIpRequest, GetPrivateIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublicIpResponse> getPublicIp(
            GetPublicIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPublicIpRequest, GetPublicIpResponse>
                    handler) {
        LOG.trace("Called async getPublicIp");
        final GetPublicIpRequest interceptedRequest =
                GetPublicIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublicIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetPublicIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIp");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPublicIpResponse>
                transformer =
                        GetPublicIpConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPublicIpRequest, GetPublicIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublicIpRequest, GetPublicIpResponse>,
                        java.util.concurrent.Future<GetPublicIpResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublicIpRequest, GetPublicIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublicIpByIpAddressResponse> getPublicIpByIpAddress(
            GetPublicIpByIpAddressRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublicIpByIpAddressRequest, GetPublicIpByIpAddressResponse>
                    handler) {
        LOG.trace("Called async getPublicIpByIpAddress");
        final GetPublicIpByIpAddressRequest interceptedRequest =
                GetPublicIpByIpAddressConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublicIpByIpAddressConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetPublicIpByIpAddress",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIpByIpAddress");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPublicIpByIpAddressResponse>
                transformer =
                        GetPublicIpByIpAddressConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPublicIpByIpAddressRequest, GetPublicIpByIpAddressResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublicIpByIpAddressRequest, GetPublicIpByIpAddressResponse>,
                        java.util.concurrent.Future<GetPublicIpByIpAddressResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGetPublicIpByIpAddressDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublicIpByIpAddressRequest, GetPublicIpByIpAddressResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublicIpByPrivateIpIdResponse> getPublicIpByPrivateIpId(
            GetPublicIpByPrivateIpIdRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublicIpByPrivateIpIdRequest, GetPublicIpByPrivateIpIdResponse>
                    handler) {
        LOG.trace("Called async getPublicIpByPrivateIpId");
        final GetPublicIpByPrivateIpIdRequest interceptedRequest =
                GetPublicIpByPrivateIpIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublicIpByPrivateIpIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetPublicIpByPrivateIpId",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIpByPrivateIpId");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetPublicIpByPrivateIpIdResponse>
                transformer =
                        GetPublicIpByPrivateIpIdConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetPublicIpByPrivateIpIdRequest, GetPublicIpByPrivateIpIdResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublicIpByPrivateIpIdRequest, GetPublicIpByPrivateIpIdResponse>,
                        java.util.concurrent.Future<GetPublicIpByPrivateIpIdResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGetPublicIpByPrivateIpIdDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublicIpByPrivateIpIdRequest, GetPublicIpByPrivateIpIdResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPublicIpPoolResponse> getPublicIpPool(
            GetPublicIpPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublicIpPoolRequest, GetPublicIpPoolResponse>
                    handler) {
        LOG.trace("Called async getPublicIpPool");
        final GetPublicIpPoolRequest interceptedRequest =
                GetPublicIpPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublicIpPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetPublicIpPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/GetPublicIpPool");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPublicIpPoolResponse>
                transformer =
                        GetPublicIpPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPublicIpPoolRequest, GetPublicIpPoolResponse>,
                        java.util.concurrent.Future<GetPublicIpPoolResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPublicIpPoolRequest, GetPublicIpPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRemotePeeringConnectionResponse>
            getRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetRemotePeeringConnectionRequest,
                                    GetRemotePeeringConnectionResponse>
                            handler) {
        LOG.trace("Called async getRemotePeeringConnection");
        final GetRemotePeeringConnectionRequest interceptedRequest =
                GetRemotePeeringConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRemotePeeringConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetRemotePeeringConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/GetRemotePeeringConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetRemotePeeringConnectionResponse>
                transformer =
                        GetRemotePeeringConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRemotePeeringConnectionRequest,
                                GetRemotePeeringConnectionResponse>,
                        java.util.concurrent.Future<GetRemotePeeringConnectionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetResourceIpInventoryResponse> getResourceIpInventory(
            GetResourceIpInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetResourceIpInventoryRequest, GetResourceIpInventoryResponse>
                    handler) {
        LOG.trace("Called async getResourceIpInventory");
        final GetResourceIpInventoryRequest interceptedRequest =
                GetResourceIpInventoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetResourceIpInventoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetResourceIpInventory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IpInventoryCollection/GetResourceIpInventory");
        final java.util.function.Function<javax.ws.rs.core.Response, GetResourceIpInventoryResponse>
                transformer =
                        GetResourceIpInventoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetResourceIpInventoryRequest, GetResourceIpInventoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetResourceIpInventoryRequest, GetResourceIpInventoryResponse>,
                        java.util.concurrent.Future<GetResourceIpInventoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetResourceIpInventoryRequest, GetResourceIpInventoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetRouteTableResponse> getRouteTable(
            GetRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRouteTableRequest, GetRouteTableResponse>
                    handler) {
        LOG.trace("Called async getRouteTable");
        final GetRouteTableRequest interceptedRequest =
                GetRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/GetRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRouteTableResponse>
                transformer =
                        GetRouteTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRouteTableRequest, GetRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetRouteTableRequest, GetRouteTableResponse>,
                        java.util.concurrent.Future<GetRouteTableResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRouteTableRequest, GetRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityListResponse> getSecurityList(
            GetSecurityListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityListRequest, GetSecurityListResponse>
                    handler) {
        LOG.trace("Called async getSecurityList");
        final GetSecurityListRequest interceptedRequest =
                GetSecurityListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetSecurityList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/GetSecurityList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityListResponse>
                transformer =
                        GetSecurityListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityListRequest, GetSecurityListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityListRequest, GetSecurityListResponse>,
                        java.util.concurrent.Future<GetSecurityListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityListRequest, GetSecurityListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetServiceResponse> getService(
            GetServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetServiceRequest, GetServiceResponse>
                    handler) {
        LOG.trace("Called async getService");
        final GetServiceRequest interceptedRequest = GetServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Service/GetService");
        final java.util.function.Function<javax.ws.rs.core.Response, GetServiceResponse>
                transformer =
                        GetServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetServiceRequest, GetServiceResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetServiceRequest, GetServiceResponse>,
                        java.util.concurrent.Future<GetServiceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetServiceRequest, GetServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetServiceGatewayResponse> getServiceGateway(
            GetServiceGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetServiceGatewayRequest, GetServiceGatewayResponse>
                    handler) {
        LOG.trace("Called async getServiceGateway");
        final GetServiceGatewayRequest interceptedRequest =
                GetServiceGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetServiceGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/GetServiceGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, GetServiceGatewayResponse>
                transformer =
                        GetServiceGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetServiceGatewayRequest, GetServiceGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetServiceGatewayRequest, GetServiceGatewayResponse>,
                        java.util.concurrent.Future<GetServiceGatewayResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetServiceGatewayRequest, GetServiceGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSubnetResponse> getSubnet(
            GetSubnetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSubnetRequest, GetSubnetResponse>
                    handler) {
        LOG.trace("Called async getSubnet");
        final GetSubnetRequest interceptedRequest = GetSubnetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSubnetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetSubnet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/GetSubnet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSubnetResponse>
                transformer =
                        GetSubnetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSubnetRequest, GetSubnetResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetSubnetRequest, GetSubnetResponse>,
                        java.util.concurrent.Future<GetSubnetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSubnetRequest, GetSubnetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSubnetCidrUtilizationResponse> getSubnetCidrUtilization(
            GetSubnetCidrUtilizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSubnetCidrUtilizationRequest, GetSubnetCidrUtilizationResponse>
                    handler) {
        LOG.trace("Called async getSubnetCidrUtilization");
        final GetSubnetCidrUtilizationRequest interceptedRequest =
                GetSubnetCidrUtilizationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSubnetCidrUtilizationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetSubnetCidrUtilization",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IpInventoryCidrUtilizationCollection/GetSubnetCidrUtilization");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSubnetCidrUtilizationResponse>
                transformer =
                        GetSubnetCidrUtilizationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSubnetCidrUtilizationRequest, GetSubnetCidrUtilizationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSubnetCidrUtilizationRequest, GetSubnetCidrUtilizationResponse>,
                        java.util.concurrent.Future<GetSubnetCidrUtilizationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSubnetCidrUtilizationRequest, GetSubnetCidrUtilizationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSubnetIpInventoryResponse> getSubnetIpInventory(
            GetSubnetIpInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSubnetIpInventoryRequest, GetSubnetIpInventoryResponse>
                    handler) {
        LOG.trace("Called async getSubnetIpInventory");
        final GetSubnetIpInventoryRequest interceptedRequest =
                GetSubnetIpInventoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSubnetIpInventoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetSubnetIpInventory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IpInventorySubnetResourceCollection/GetSubnetIpInventory");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSubnetIpInventoryResponse>
                transformer =
                        GetSubnetIpInventoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSubnetIpInventoryRequest, GetSubnetIpInventoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSubnetIpInventoryRequest, GetSubnetIpInventoryResponse>,
                        java.util.concurrent.Future<GetSubnetIpInventoryResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSubnetIpInventoryRequest, GetSubnetIpInventoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSubnetTopologyResponse> getSubnetTopology(
            GetSubnetTopologyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSubnetTopologyRequest, GetSubnetTopologyResponse>
                    handler) {
        LOG.trace("Called async getSubnetTopology");
        final GetSubnetTopologyRequest interceptedRequest =
                GetSubnetTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSubnetTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetSubnetTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SubnetTopology/GetSubnetTopology");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSubnetTopologyResponse>
                transformer =
                        GetSubnetTopologyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSubnetTopologyRequest, GetSubnetTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSubnetTopologyRequest, GetSubnetTopologyResponse>,
                        java.util.concurrent.Future<GetSubnetTopologyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSubnetTopologyRequest, GetSubnetTopologyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTunnelCpeDeviceConfigResponse> getTunnelCpeDeviceConfig(
            GetTunnelCpeDeviceConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTunnelCpeDeviceConfigRequest, GetTunnelCpeDeviceConfigResponse>
                    handler) {
        LOG.trace("Called async getTunnelCpeDeviceConfig");
        final GetTunnelCpeDeviceConfigRequest interceptedRequest =
                GetTunnelCpeDeviceConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTunnelCpeDeviceConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetTunnelCpeDeviceConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/GetTunnelCpeDeviceConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTunnelCpeDeviceConfigResponse>
                transformer =
                        GetTunnelCpeDeviceConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTunnelCpeDeviceConfigRequest, GetTunnelCpeDeviceConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTunnelCpeDeviceConfigRequest, GetTunnelCpeDeviceConfigResponse>,
                        java.util.concurrent.Future<GetTunnelCpeDeviceConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTunnelCpeDeviceConfigRequest, GetTunnelCpeDeviceConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTunnelCpeDeviceConfigContentResponse>
            getTunnelCpeDeviceConfigContent(
                    GetTunnelCpeDeviceConfigContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTunnelCpeDeviceConfigContentRequest,
                                    GetTunnelCpeDeviceConfigContentResponse>
                            handler) {
        LOG.trace("Called async getTunnelCpeDeviceConfigContent");
        final GetTunnelCpeDeviceConfigContentRequest interceptedRequest =
                GetTunnelCpeDeviceConfigContentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTunnelCpeDeviceConfigContentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetTunnelCpeDeviceConfigContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/GetTunnelCpeDeviceConfigContent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTunnelCpeDeviceConfigContentResponse>
                transformer =
                        GetTunnelCpeDeviceConfigContentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTunnelCpeDeviceConfigContentRequest,
                        GetTunnelCpeDeviceConfigContentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTunnelCpeDeviceConfigContentRequest,
                                GetTunnelCpeDeviceConfigContentResponse>,
                        java.util.concurrent.Future<GetTunnelCpeDeviceConfigContentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTunnelCpeDeviceConfigContentRequest,
                    GetTunnelCpeDeviceConfigContentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeStatusResponse> getUpgradeStatus(
            GetUpgradeStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUpgradeStatusRequest, GetUpgradeStatusResponse>
                    handler) {
        LOG.trace("Called async getUpgradeStatus");
        final GetUpgradeStatusRequest interceptedRequest =
                GetUpgradeStatusConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUpgradeStatusConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetUpgradeStatus",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetUpgradeStatus");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUpgradeStatusResponse>
                transformer =
                        GetUpgradeStatusConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUpgradeStatusRequest, GetUpgradeStatusResponse>,
                        java.util.concurrent.Future<GetUpgradeStatusResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUpgradeStatusRequest, GetUpgradeStatusResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVcnResponse> getVcn(
            GetVcnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVcnRequest, GetVcnResponse> handler) {
        LOG.trace("Called async getVcn");
        final GetVcnRequest interceptedRequest = GetVcnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVcnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVcn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/GetVcn");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVcnResponse> transformer =
                GetVcnConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVcnRequest, GetVcnResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetVcnRequest, GetVcnResponse>,
                        java.util.concurrent.Future<GetVcnResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVcnRequest, GetVcnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVcnDnsResolverAssociationResponse>
            getVcnDnsResolverAssociation(
                    GetVcnDnsResolverAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetVcnDnsResolverAssociationRequest,
                                    GetVcnDnsResolverAssociationResponse>
                            handler) {
        LOG.trace("Called async getVcnDnsResolverAssociation");
        final GetVcnDnsResolverAssociationRequest interceptedRequest =
                GetVcnDnsResolverAssociationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVcnDnsResolverAssociationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVcnDnsResolverAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VcnDnsResolverAssociation/GetVcnDnsResolverAssociation");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetVcnDnsResolverAssociationResponse>
                transformer =
                        GetVcnDnsResolverAssociationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVcnDnsResolverAssociationRequest,
                                GetVcnDnsResolverAssociationResponse>,
                        java.util.concurrent.Future<GetVcnDnsResolverAssociationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVcnOverlapResponse> getVcnOverlap(
            GetVcnOverlapRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVcnOverlapRequest, GetVcnOverlapResponse>
                    handler) {
        LOG.trace("Called async getVcnOverlap");
        final GetVcnOverlapRequest interceptedRequest =
                GetVcnOverlapConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVcnOverlapConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVcnOverlap",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IpInventoryVcnOverlapCollection/GetVcnOverlap");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVcnOverlapResponse>
                transformer =
                        GetVcnOverlapConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVcnOverlapRequest, GetVcnOverlapResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVcnOverlapRequest, GetVcnOverlapResponse>,
                        java.util.concurrent.Future<GetVcnOverlapResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGetVcnOverlapDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVcnOverlapRequest, GetVcnOverlapResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVcnTopologyResponse> getVcnTopology(
            GetVcnTopologyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVcnTopologyRequest, GetVcnTopologyResponse>
                    handler) {
        LOG.trace("Called async getVcnTopology");
        final GetVcnTopologyRequest interceptedRequest =
                GetVcnTopologyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVcnTopologyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVcnTopology",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VcnTopology/GetVcnTopology");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVcnTopologyResponse>
                transformer =
                        GetVcnTopologyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVcnTopologyRequest, GetVcnTopologyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVcnTopologyRequest, GetVcnTopologyResponse>,
                        java.util.concurrent.Future<GetVcnTopologyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVcnTopologyRequest, GetVcnTopologyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVirtualCircuitResponse> getVirtualCircuit(
            GetVirtualCircuitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualCircuitRequest, GetVirtualCircuitResponse>
                    handler) {
        LOG.trace("Called async getVirtualCircuit");
        final GetVirtualCircuitRequest interceptedRequest =
                GetVirtualCircuitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVirtualCircuitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVirtualCircuit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/GetVirtualCircuit");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVirtualCircuitResponse>
                transformer =
                        GetVirtualCircuitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetVirtualCircuitRequest, GetVirtualCircuitResponse>,
                        java.util.concurrent.Future<GetVirtualCircuitResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVirtualCircuitRequest, GetVirtualCircuitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVlanResponse> getVlan(
            GetVlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVlanRequest, GetVlanResponse> handler) {
        LOG.trace("Called async getVlan");
        final GetVlanRequest interceptedRequest = GetVlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/GetVlan");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVlanResponse> transformer =
                GetVlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVlanRequest, GetVlanResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetVlanRequest, GetVlanResponse>,
                        java.util.concurrent.Future<GetVlanResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVlanRequest, GetVlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVnicResponse> getVnic(
            GetVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVnicRequest, GetVnicResponse> handler) {
        LOG.trace("Called async getVnic");
        final GetVnicRequest interceptedRequest = GetVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVnicConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVnic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vnic/GetVnic");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVnicResponse> transformer =
                GetVnicConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVnicRequest, GetVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetVnicRequest, GetVnicResponse>,
                        java.util.concurrent.Future<GetVnicResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVnicRequest, GetVnicResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetVtapResponse> getVtap(
            GetVtapRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVtapRequest, GetVtapResponse> handler) {
        LOG.trace("Called async getVtap");
        final GetVtapRequest interceptedRequest = GetVtapConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetVtapConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "GetVtap",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/GetVtap");
        final java.util.function.Function<javax.ws.rs.core.Response, GetVtapResponse> transformer =
                GetVtapConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetVtapRequest, GetVtapResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetVtapRequest, GetVtapResponse>,
                        java.util.concurrent.Future<GetVtapResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetVtapRequest, GetVtapResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAllowedPeerRegionsForRemotePeeringResponse>
            listAllowedPeerRegionsForRemotePeering(
                    ListAllowedPeerRegionsForRemotePeeringRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAllowedPeerRegionsForRemotePeeringRequest,
                                    ListAllowedPeerRegionsForRemotePeeringResponse>
                            handler) {
        LOG.trace("Called async listAllowedPeerRegionsForRemotePeering");
        final ListAllowedPeerRegionsForRemotePeeringRequest interceptedRequest =
                ListAllowedPeerRegionsForRemotePeeringConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAllowedPeerRegionsForRemotePeeringConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListAllowedPeerRegionsForRemotePeering",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PeerRegionForRemotePeering/ListAllowedPeerRegionsForRemotePeering");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAllowedPeerRegionsForRemotePeeringResponse>
                transformer =
                        ListAllowedPeerRegionsForRemotePeeringConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAllowedPeerRegionsForRemotePeeringRequest,
                        ListAllowedPeerRegionsForRemotePeeringResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAllowedPeerRegionsForRemotePeeringRequest,
                                ListAllowedPeerRegionsForRemotePeeringResponse>,
                        java.util.concurrent.Future<ListAllowedPeerRegionsForRemotePeeringResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAllowedPeerRegionsForRemotePeeringRequest,
                    ListAllowedPeerRegionsForRemotePeeringResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListByoipAllocatedRangesResponse> listByoipAllocatedRanges(
            ListByoipAllocatedRangesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>
                    handler) {
        LOG.trace("Called async listByoipAllocatedRanges");
        final ListByoipAllocatedRangesRequest interceptedRequest =
                ListByoipAllocatedRangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListByoipAllocatedRangesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListByoipAllocatedRanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipAllocatedRangeSummary/ListByoipAllocatedRanges");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListByoipAllocatedRangesResponse>
                transformer =
                        ListByoipAllocatedRangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>,
                        java.util.concurrent.Future<ListByoipAllocatedRangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListByoipRangesResponse> listByoipRanges(
            ListByoipRangesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListByoipRangesRequest, ListByoipRangesResponse>
                    handler) {
        LOG.trace("Called async listByoipRanges");
        final ListByoipRangesRequest interceptedRequest =
                ListByoipRangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListByoipRangesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListByoipRanges",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ListByoipRanges");
        final java.util.function.Function<javax.ws.rs.core.Response, ListByoipRangesResponse>
                transformer =
                        ListByoipRangesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListByoipRangesRequest, ListByoipRangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListByoipRangesRequest, ListByoipRangesResponse>,
                        java.util.concurrent.Future<ListByoipRangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListByoipRangesRequest, ListByoipRangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCaptureFiltersResponse> listCaptureFilters(
            ListCaptureFiltersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCaptureFiltersRequest, ListCaptureFiltersResponse>
                    handler) {
        LOG.trace("Called async listCaptureFilters");
        final ListCaptureFiltersRequest interceptedRequest =
                ListCaptureFiltersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCaptureFiltersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCaptureFilters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/ListCaptureFilters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCaptureFiltersResponse>
                transformer =
                        ListCaptureFiltersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCaptureFiltersRequest, ListCaptureFiltersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCaptureFiltersRequest, ListCaptureFiltersResponse>,
                        java.util.concurrent.Future<ListCaptureFiltersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCaptureFiltersRequest, ListCaptureFiltersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCpeDeviceShapesResponse> listCpeDeviceShapes(
            ListCpeDeviceShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>
                    handler) {
        LOG.trace("Called async listCpeDeviceShapes");
        final ListCpeDeviceShapesRequest interceptedRequest =
                ListCpeDeviceShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCpeDeviceShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCpeDeviceShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CpeDeviceShapeSummary/ListCpeDeviceShapes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCpeDeviceShapesResponse>
                transformer =
                        ListCpeDeviceShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>,
                        java.util.concurrent.Future<ListCpeDeviceShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCpesResponse> listCpes(
            ListCpesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCpesRequest, ListCpesResponse>
                    handler) {
        LOG.trace("Called async listCpes");
        final ListCpesRequest interceptedRequest = ListCpesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCpesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCpes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/ListCpes");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCpesResponse> transformer =
                ListCpesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCpesRequest, ListCpesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListCpesRequest, ListCpesResponse>,
                        java.util.concurrent.Future<ListCpesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCpesRequest, ListCpesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCrossConnectGroupsResponse> listCrossConnectGroups(
            ListCrossConnectGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>
                    handler) {
        LOG.trace("Called async listCrossConnectGroups");
        final ListCrossConnectGroupsRequest interceptedRequest =
                ListCrossConnectGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/ListCrossConnectGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCrossConnectGroupsResponse>
                transformer =
                        ListCrossConnectGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>,
                        java.util.concurrent.Future<ListCrossConnectGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCrossConnectLocationsResponse> listCrossConnectLocations(
            ListCrossConnectLocationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>
                    handler) {
        LOG.trace("Called async listCrossConnectLocations");
        final ListCrossConnectLocationsRequest interceptedRequest =
                ListCrossConnectLocationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectLocationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectLocations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectLocation/ListCrossConnectLocations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCrossConnectLocationsResponse>
                transformer =
                        ListCrossConnectLocationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCrossConnectLocationsRequest,
                                ListCrossConnectLocationsResponse>,
                        java.util.concurrent.Future<ListCrossConnectLocationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCrossConnectMappingsResponse> listCrossConnectMappings(
            ListCrossConnectMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectMappingsRequest, ListCrossConnectMappingsResponse>
                    handler) {
        LOG.trace("Called async listCrossConnectMappings");
        final ListCrossConnectMappingsRequest interceptedRequest =
                ListCrossConnectMappingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectMappingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectMappingDetailsCollection/ListCrossConnectMappings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCrossConnectMappingsResponse>
                transformer =
                        ListCrossConnectMappingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCrossConnectMappingsRequest, ListCrossConnectMappingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCrossConnectMappingsRequest, ListCrossConnectMappingsResponse>,
                        java.util.concurrent.Future<ListCrossConnectMappingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCrossConnectMappingsRequest, ListCrossConnectMappingsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCrossConnectsResponse> listCrossConnects(
            ListCrossConnectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectsRequest, ListCrossConnectsResponse>
                    handler) {
        LOG.trace("Called async listCrossConnects");
        final ListCrossConnectsRequest interceptedRequest =
                ListCrossConnectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossConnectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCrossConnects",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/ListCrossConnects");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCrossConnectsResponse>
                transformer =
                        ListCrossConnectsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCrossConnectsRequest, ListCrossConnectsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCrossConnectsRequest, ListCrossConnectsResponse>,
                        java.util.concurrent.Future<ListCrossConnectsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCrossConnectsRequest, ListCrossConnectsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCrossconnectPortSpeedShapesResponse>
            listCrossconnectPortSpeedShapes(
                    ListCrossconnectPortSpeedShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCrossconnectPortSpeedShapesRequest,
                                    ListCrossconnectPortSpeedShapesResponse>
                            handler) {
        LOG.trace("Called async listCrossconnectPortSpeedShapes");
        final ListCrossconnectPortSpeedShapesRequest interceptedRequest =
                ListCrossconnectPortSpeedShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCrossconnectPortSpeedShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListCrossconnectPortSpeedShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectPortSpeedShape/ListCrossconnectPortSpeedShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCrossconnectPortSpeedShapesResponse>
                transformer =
                        ListCrossconnectPortSpeedShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCrossconnectPortSpeedShapesRequest,
                        ListCrossconnectPortSpeedShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCrossconnectPortSpeedShapesRequest,
                                ListCrossconnectPortSpeedShapesResponse>,
                        java.util.concurrent.Future<ListCrossconnectPortSpeedShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCrossconnectPortSpeedShapesRequest,
                    ListCrossconnectPortSpeedShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDhcpOptionsResponse> listDhcpOptions(
            ListDhcpOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDhcpOptionsRequest, ListDhcpOptionsResponse>
                    handler) {
        LOG.trace("Called async listDhcpOptions");
        final ListDhcpOptionsRequest interceptedRequest =
                ListDhcpOptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDhcpOptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDhcpOptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/ListDhcpOptions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDhcpOptionsResponse>
                transformer =
                        ListDhcpOptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDhcpOptionsRequest, ListDhcpOptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDhcpOptionsRequest, ListDhcpOptionsResponse>,
                        java.util.concurrent.Future<ListDhcpOptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDhcpOptionsRequest, ListDhcpOptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgAttachmentsResponse> listDrgAttachments(
            ListDrgAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listDrgAttachments");
        final ListDrgAttachmentsRequest interceptedRequest =
                ListDrgAttachmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgAttachmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgAttachments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/ListDrgAttachments");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrgAttachmentsResponse>
                transformer =
                        ListDrgAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>,
                        java.util.concurrent.Future<ListDrgAttachmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgRouteDistributionStatementsResponse>
            listDrgRouteDistributionStatements(
                    ListDrgRouteDistributionStatementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDrgRouteDistributionStatementsRequest,
                                    ListDrgRouteDistributionStatementsResponse>
                            handler) {
        LOG.trace("Called async listDrgRouteDistributionStatements");
        final ListDrgRouteDistributionStatementsRequest interceptedRequest =
                ListDrgRouteDistributionStatementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgRouteDistributionStatementsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteDistributionStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/ListDrgRouteDistributionStatements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDrgRouteDistributionStatementsResponse>
                transformer =
                        ListDrgRouteDistributionStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDrgRouteDistributionStatementsRequest,
                        ListDrgRouteDistributionStatementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrgRouteDistributionStatementsRequest,
                                ListDrgRouteDistributionStatementsResponse>,
                        java.util.concurrent.Future<ListDrgRouteDistributionStatementsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgRouteDistributionStatementsRequest,
                    ListDrgRouteDistributionStatementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgRouteDistributionsResponse> listDrgRouteDistributions(
            ListDrgRouteDistributionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrgRouteDistributionsRequest, ListDrgRouteDistributionsResponse>
                    handler) {
        LOG.trace("Called async listDrgRouteDistributions");
        final ListDrgRouteDistributionsRequest interceptedRequest =
                ListDrgRouteDistributionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgRouteDistributionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteDistributions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/ListDrgRouteDistributions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDrgRouteDistributionsResponse>
                transformer =
                        ListDrgRouteDistributionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDrgRouteDistributionsRequest, ListDrgRouteDistributionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrgRouteDistributionsRequest,
                                ListDrgRouteDistributionsResponse>,
                        java.util.concurrent.Future<ListDrgRouteDistributionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgRouteDistributionsRequest, ListDrgRouteDistributionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgRouteRulesResponse> listDrgRouteRules(
            ListDrgRouteRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>
                    handler) {
        LOG.trace("Called async listDrgRouteRules");
        final ListDrgRouteRulesRequest interceptedRequest =
                ListDrgRouteRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgRouteRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/ListDrgRouteRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrgRouteRulesResponse>
                transformer =
                        ListDrgRouteRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>,
                        java.util.concurrent.Future<ListDrgRouteRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgRouteTablesResponse> listDrgRouteTables(
            ListDrgRouteTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>
                    handler) {
        LOG.trace("Called async listDrgRouteTables");
        final ListDrgRouteTablesRequest interceptedRequest =
                ListDrgRouteTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgRouteTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/ListDrgRouteTables");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrgRouteTablesResponse>
                transformer =
                        ListDrgRouteTablesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>,
                        java.util.concurrent.Future<ListDrgRouteTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDrgsResponse> listDrgs(
            ListDrgsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDrgsRequest, ListDrgsResponse>
                    handler) {
        LOG.trace("Called async listDrgs");
        final ListDrgsRequest interceptedRequest = ListDrgsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDrgsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListDrgs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/ListDrgs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDrgsResponse> transformer =
                ListDrgsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDrgsRequest, ListDrgsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListDrgsRequest, ListDrgsResponse>,
                        java.util.concurrent.Future<ListDrgsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDrgsRequest, ListDrgsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFastConnectProviderServicesResponse>
            listFastConnectProviderServices(
                    ListFastConnectProviderServicesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFastConnectProviderServicesRequest,
                                    ListFastConnectProviderServicesResponse>
                            handler) {
        LOG.trace("Called async listFastConnectProviderServices");
        final ListFastConnectProviderServicesRequest interceptedRequest =
                ListFastConnectProviderServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFastConnectProviderServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListFastConnectProviderServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/ListFastConnectProviderServices");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListFastConnectProviderServicesResponse>
                transformer =
                        ListFastConnectProviderServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFastConnectProviderServicesRequest,
                        ListFastConnectProviderServicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFastConnectProviderServicesRequest,
                                ListFastConnectProviderServicesResponse>,
                        java.util.concurrent.Future<ListFastConnectProviderServicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFastConnectProviderServicesRequest,
                    ListFastConnectProviderServicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
            listFastConnectProviderVirtualCircuitBandwidthShapes(
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                                    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
                            handler) {
        LOG.trace("Called async listFastConnectProviderVirtualCircuitBandwidthShapes");
        final ListFastConnectProviderVirtualCircuitBandwidthShapesRequest interceptedRequest =
                ListFastConnectProviderVirtualCircuitBandwidthShapesConverter.interceptRequest(
                        request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFastConnectProviderVirtualCircuitBandwidthShapesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListFastConnectProviderVirtualCircuitBandwidthShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/ListFastConnectProviderVirtualCircuitBandwidthShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
                transformer =
                        ListFastConnectProviderVirtualCircuitBandwidthShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>,
                        java.util.concurrent.Future<
                                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIPSecConnectionTunnelRoutesResponse>
            listIPSecConnectionTunnelRoutes(
                    ListIPSecConnectionTunnelRoutesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIPSecConnectionTunnelRoutesRequest,
                                    ListIPSecConnectionTunnelRoutesResponse>
                            handler) {
        LOG.trace("Called async listIPSecConnectionTunnelRoutes");
        final ListIPSecConnectionTunnelRoutesRequest interceptedRequest =
                ListIPSecConnectionTunnelRoutesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIPSecConnectionTunnelRoutesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnelRoutes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelRouteSummary/ListIPSecConnectionTunnelRoutes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListIPSecConnectionTunnelRoutesResponse>
                transformer =
                        ListIPSecConnectionTunnelRoutesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIPSecConnectionTunnelRoutesRequest,
                        ListIPSecConnectionTunnelRoutesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIPSecConnectionTunnelRoutesRequest,
                                ListIPSecConnectionTunnelRoutesResponse>,
                        java.util.concurrent.Future<ListIPSecConnectionTunnelRoutesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIPSecConnectionTunnelRoutesRequest,
                    ListIPSecConnectionTunnelRoutesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIPSecConnectionTunnelSecurityAssociationsResponse>
            listIPSecConnectionTunnelSecurityAssociations(
                    ListIPSecConnectionTunnelSecurityAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIPSecConnectionTunnelSecurityAssociationsRequest,
                                    ListIPSecConnectionTunnelSecurityAssociationsResponse>
                            handler) {
        LOG.trace("Called async listIPSecConnectionTunnelSecurityAssociations");
        final ListIPSecConnectionTunnelSecurityAssociationsRequest interceptedRequest =
                ListIPSecConnectionTunnelSecurityAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIPSecConnectionTunnelSecurityAssociationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnelSecurityAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelSecurityAssociationSummary/ListIPSecConnectionTunnelSecurityAssociations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListIPSecConnectionTunnelSecurityAssociationsResponse>
                transformer =
                        ListIPSecConnectionTunnelSecurityAssociationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIPSecConnectionTunnelSecurityAssociationsRequest,
                        ListIPSecConnectionTunnelSecurityAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIPSecConnectionTunnelSecurityAssociationsRequest,
                                ListIPSecConnectionTunnelSecurityAssociationsResponse>,
                        java.util.concurrent.Future<
                                ListIPSecConnectionTunnelSecurityAssociationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIPSecConnectionTunnelSecurityAssociationsRequest,
                    ListIPSecConnectionTunnelSecurityAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIPSecConnectionTunnelsResponse>
            listIPSecConnectionTunnels(
                    ListIPSecConnectionTunnelsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIPSecConnectionTunnelsRequest,
                                    ListIPSecConnectionTunnelsResponse>
                            handler) {
        LOG.trace("Called async listIPSecConnectionTunnels");
        final ListIPSecConnectionTunnelsRequest interceptedRequest =
                ListIPSecConnectionTunnelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIPSecConnectionTunnelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/ListIPSecConnectionTunnels");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListIPSecConnectionTunnelsResponse>
                transformer =
                        ListIPSecConnectionTunnelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIPSecConnectionTunnelsRequest,
                                ListIPSecConnectionTunnelsResponse>,
                        java.util.concurrent.Future<ListIPSecConnectionTunnelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIPSecConnectionsResponse> listIPSecConnections(
            ListIPSecConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>
                    handler) {
        LOG.trace("Called async listIPSecConnections");
        final ListIPSecConnectionsRequest interceptedRequest =
                ListIPSecConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIPSecConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/ListIPSecConnections");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIPSecConnectionsResponse>
                transformer =
                        ListIPSecConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>,
                        java.util.concurrent.Future<ListIPSecConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInternetGatewaysResponse> listInternetGateways(
            ListInternetGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInternetGatewaysRequest, ListInternetGatewaysResponse>
                    handler) {
        LOG.trace("Called async listInternetGateways");
        final ListInternetGatewaysRequest interceptedRequest =
                ListInternetGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInternetGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListInternetGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/ListInternetGateways");
        final java.util.function.Function<javax.ws.rs.core.Response, ListInternetGatewaysResponse>
                transformer =
                        ListInternetGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInternetGatewaysRequest, ListInternetGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInternetGatewaysRequest, ListInternetGatewaysResponse>,
                        java.util.concurrent.Future<ListInternetGatewaysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInternetGatewaysRequest, ListInternetGatewaysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIpInventoryResponse> listIpInventory(
            ListIpInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIpInventoryRequest, ListIpInventoryResponse>
                    handler) {
        LOG.trace("Called async listIpInventory");
        final ListIpInventoryRequest interceptedRequest =
                ListIpInventoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIpInventoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIpInventory",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ListIpInventory");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIpInventoryResponse>
                transformer =
                        ListIpInventoryConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListIpInventoryRequest, ListIpInventoryResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIpInventoryRequest, ListIpInventoryResponse>,
                        java.util.concurrent.Future<ListIpInventoryResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getListIpInventoryDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIpInventoryRequest, ListIpInventoryResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListIpv6sResponse> listIpv6s(
            ListIpv6sRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListIpv6sRequest, ListIpv6sResponse>
                    handler) {
        LOG.trace("Called async listIpv6s");
        final ListIpv6sRequest interceptedRequest = ListIpv6sConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIpv6sConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListIpv6s",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/ListIpv6s");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIpv6sResponse>
                transformer =
                        ListIpv6sConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListIpv6sRequest, ListIpv6sResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListIpv6sRequest, ListIpv6sResponse>,
                        java.util.concurrent.Future<ListIpv6sResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIpv6sRequest, ListIpv6sResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListLocalPeeringGatewaysResponse> listLocalPeeringGateways(
            ListLocalPeeringGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>
                    handler) {
        LOG.trace("Called async listLocalPeeringGateways");
        final ListLocalPeeringGatewaysRequest interceptedRequest =
                ListLocalPeeringGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLocalPeeringGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListLocalPeeringGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ListLocalPeeringGateways");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListLocalPeeringGatewaysResponse>
                transformer =
                        ListLocalPeeringGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>,
                        java.util.concurrent.Future<ListLocalPeeringGatewaysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNatGatewaysResponse> listNatGateways(
            ListNatGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNatGatewaysRequest, ListNatGatewaysResponse>
                    handler) {
        LOG.trace("Called async listNatGateways");
        final ListNatGatewaysRequest interceptedRequest =
                ListNatGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNatGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListNatGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/ListNatGateways");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNatGatewaysResponse>
                transformer =
                        ListNatGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListNatGatewaysRequest, ListNatGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNatGatewaysRequest, ListNatGatewaysResponse>,
                        java.util.concurrent.Future<ListNatGatewaysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNatGatewaysRequest, ListNatGatewaysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSecurityGroupSecurityRulesResponse>
            listNetworkSecurityGroupSecurityRules(
                    ListNetworkSecurityGroupSecurityRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkSecurityGroupSecurityRulesRequest,
                                    ListNetworkSecurityGroupSecurityRulesResponse>
                            handler) {
        LOG.trace("Called async listNetworkSecurityGroupSecurityRules");
        final ListNetworkSecurityGroupSecurityRulesRequest interceptedRequest =
                ListNetworkSecurityGroupSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkSecurityGroupSecurityRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroupSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/ListNetworkSecurityGroupSecurityRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkSecurityGroupSecurityRulesResponse>
                transformer =
                        ListNetworkSecurityGroupSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkSecurityGroupSecurityRulesRequest,
                        ListNetworkSecurityGroupSecurityRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkSecurityGroupSecurityRulesRequest,
                                ListNetworkSecurityGroupSecurityRulesResponse>,
                        java.util.concurrent.Future<ListNetworkSecurityGroupSecurityRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkSecurityGroupSecurityRulesRequest,
                    ListNetworkSecurityGroupSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSecurityGroupVnicsResponse>
            listNetworkSecurityGroupVnics(
                    ListNetworkSecurityGroupVnicsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkSecurityGroupVnicsRequest,
                                    ListNetworkSecurityGroupVnicsResponse>
                            handler) {
        LOG.trace("Called async listNetworkSecurityGroupVnics");
        final ListNetworkSecurityGroupVnicsRequest interceptedRequest =
                ListNetworkSecurityGroupVnicsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkSecurityGroupVnicsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroupVnics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroupVnic/ListNetworkSecurityGroupVnics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkSecurityGroupVnicsResponse>
                transformer =
                        ListNetworkSecurityGroupVnicsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkSecurityGroupVnicsRequest, ListNetworkSecurityGroupVnicsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkSecurityGroupVnicsRequest,
                                ListNetworkSecurityGroupVnicsResponse>,
                        java.util.concurrent.Future<ListNetworkSecurityGroupVnicsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkSecurityGroupVnicsRequest, ListNetworkSecurityGroupVnicsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSecurityGroupsResponse> listNetworkSecurityGroups(
            ListNetworkSecurityGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>
                    handler) {
        LOG.trace("Called async listNetworkSecurityGroups");
        final ListNetworkSecurityGroupsRequest interceptedRequest =
                ListNetworkSecurityGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkSecurityGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/ListNetworkSecurityGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkSecurityGroupsResponse>
                transformer =
                        ListNetworkSecurityGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkSecurityGroupsRequest,
                                ListNetworkSecurityGroupsResponse>,
                        java.util.concurrent.Future<ListNetworkSecurityGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPrivateIpsResponse> listPrivateIps(
            ListPrivateIpsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateIpsRequest, ListPrivateIpsResponse>
                    handler) {
        LOG.trace("Called async listPrivateIps");
        final ListPrivateIpsRequest interceptedRequest =
                ListPrivateIpsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPrivateIpsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListPrivateIps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/ListPrivateIps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPrivateIpsResponse>
                transformer =
                        ListPrivateIpsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPrivateIpsRequest, ListPrivateIpsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPrivateIpsRequest, ListPrivateIpsResponse>,
                        java.util.concurrent.Future<ListPrivateIpsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPrivateIpsRequest, ListPrivateIpsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPublicIpPoolsResponse> listPublicIpPools(
            ListPublicIpPoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>
                    handler) {
        LOG.trace("Called async listPublicIpPools");
        final ListPublicIpPoolsRequest interceptedRequest =
                ListPublicIpPoolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublicIpPoolsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListPublicIpPools",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/ListPublicIpPools");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPublicIpPoolsResponse>
                transformer =
                        ListPublicIpPoolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>,
                        java.util.concurrent.Future<ListPublicIpPoolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListPublicIpsResponse> listPublicIps(
            ListPublicIpsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPublicIpsRequest, ListPublicIpsResponse>
                    handler) {
        LOG.trace("Called async listPublicIps");
        final ListPublicIpsRequest interceptedRequest =
                ListPublicIpsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublicIpsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListPublicIps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/ListPublicIps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPublicIpsResponse>
                transformer =
                        ListPublicIpsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPublicIpsRequest, ListPublicIpsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPublicIpsRequest, ListPublicIpsResponse>,
                        java.util.concurrent.Future<ListPublicIpsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPublicIpsRequest, ListPublicIpsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRemotePeeringConnectionsResponse>
            listRemotePeeringConnections(
                    ListRemotePeeringConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListRemotePeeringConnectionsRequest,
                                    ListRemotePeeringConnectionsResponse>
                            handler) {
        LOG.trace("Called async listRemotePeeringConnections");
        final ListRemotePeeringConnectionsRequest interceptedRequest =
                ListRemotePeeringConnectionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRemotePeeringConnectionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListRemotePeeringConnections",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ListRemotePeeringConnections");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListRemotePeeringConnectionsResponse>
                transformer =
                        ListRemotePeeringConnectionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListRemotePeeringConnectionsRequest, ListRemotePeeringConnectionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRemotePeeringConnectionsRequest,
                                ListRemotePeeringConnectionsResponse>,
                        java.util.concurrent.Future<ListRemotePeeringConnectionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRemotePeeringConnectionsRequest, ListRemotePeeringConnectionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRouteTablesResponse> listRouteTables(
            ListRouteTablesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRouteTablesRequest, ListRouteTablesResponse>
                    handler) {
        LOG.trace("Called async listRouteTables");
        final ListRouteTablesRequest interceptedRequest =
                ListRouteTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRouteTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListRouteTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/ListRouteTables");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRouteTablesResponse>
                transformer =
                        ListRouteTablesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRouteTablesRequest, ListRouteTablesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListRouteTablesRequest, ListRouteTablesResponse>,
                        java.util.concurrent.Future<ListRouteTablesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRouteTablesRequest, ListRouteTablesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityListsResponse> listSecurityLists(
            ListSecurityListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityListsRequest, ListSecurityListsResponse>
                    handler) {
        LOG.trace("Called async listSecurityLists");
        final ListSecurityListsRequest interceptedRequest =
                ListSecurityListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListSecurityLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/ListSecurityLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityListsResponse>
                transformer =
                        ListSecurityListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSecurityListsRequest, ListSecurityListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityListsRequest, ListSecurityListsResponse>,
                        java.util.concurrent.Future<ListSecurityListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityListsRequest, ListSecurityListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListServiceGatewaysResponse> listServiceGateways(
            ListServiceGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListServiceGatewaysRequest, ListServiceGatewaysResponse>
                    handler) {
        LOG.trace("Called async listServiceGateways");
        final ListServiceGatewaysRequest interceptedRequest =
                ListServiceGatewaysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServiceGatewaysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListServiceGateways",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/ListServiceGateways");
        final java.util.function.Function<javax.ws.rs.core.Response, ListServiceGatewaysResponse>
                transformer =
                        ListServiceGatewaysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListServiceGatewaysRequest, ListServiceGatewaysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListServiceGatewaysRequest, ListServiceGatewaysResponse>,
                        java.util.concurrent.Future<ListServiceGatewaysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListServiceGatewaysRequest, ListServiceGatewaysResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler) {
        LOG.trace("Called async listServices");
        final ListServicesRequest interceptedRequest =
                ListServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Service/ListServices");
        final java.util.function.Function<javax.ws.rs.core.Response, ListServicesResponse>
                transformer =
                        ListServicesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListServicesRequest, ListServicesResponse>,
                        java.util.concurrent.Future<ListServicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListServicesRequest, ListServicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSubnetsResponse> listSubnets(
            ListSubnetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSubnetsRequest, ListSubnetsResponse>
                    handler) {
        LOG.trace("Called async listSubnets");
        final ListSubnetsRequest interceptedRequest =
                ListSubnetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSubnetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListSubnets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/ListSubnets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSubnetsResponse>
                transformer =
                        ListSubnetsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSubnetsRequest, ListSubnetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSubnetsRequest, ListSubnetsResponse>,
                        java.util.concurrent.Future<ListSubnetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSubnetsRequest, ListSubnetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVcnsResponse> listVcns(
            ListVcnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVcnsRequest, ListVcnsResponse>
                    handler) {
        LOG.trace("Called async listVcns");
        final ListVcnsRequest interceptedRequest = ListVcnsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVcnsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVcns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ListVcns");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVcnsResponse> transformer =
                ListVcnsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListVcnsRequest, ListVcnsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListVcnsRequest, ListVcnsResponse>,
                        java.util.concurrent.Future<ListVcnsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVcnsRequest, ListVcnsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVirtualCircuitAssociatedTunnelsResponse>
            listVirtualCircuitAssociatedTunnels(
                    ListVirtualCircuitAssociatedTunnelsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualCircuitAssociatedTunnelsRequest,
                                    ListVirtualCircuitAssociatedTunnelsResponse>
                            handler) {
        LOG.trace("Called async listVirtualCircuitAssociatedTunnels");
        final ListVirtualCircuitAssociatedTunnelsRequest interceptedRequest =
                ListVirtualCircuitAssociatedTunnelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitAssociatedTunnelsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitAssociatedTunnels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitAssociatedTunnelDetails/ListVirtualCircuitAssociatedTunnels");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVirtualCircuitAssociatedTunnelsResponse>
                transformer =
                        ListVirtualCircuitAssociatedTunnelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualCircuitAssociatedTunnelsRequest,
                        ListVirtualCircuitAssociatedTunnelsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualCircuitAssociatedTunnelsRequest,
                                ListVirtualCircuitAssociatedTunnelsResponse>,
                        java.util.concurrent.Future<ListVirtualCircuitAssociatedTunnelsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualCircuitAssociatedTunnelsRequest,
                    ListVirtualCircuitAssociatedTunnelsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVirtualCircuitBandwidthShapesResponse>
            listVirtualCircuitBandwidthShapes(
                    ListVirtualCircuitBandwidthShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualCircuitBandwidthShapesRequest,
                                    ListVirtualCircuitBandwidthShapesResponse>
                            handler) {
        LOG.trace("Called async listVirtualCircuitBandwidthShapes");
        final ListVirtualCircuitBandwidthShapesRequest interceptedRequest =
                ListVirtualCircuitBandwidthShapesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitBandwidthShapesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitBandwidthShapes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitBandwidthShape/ListVirtualCircuitBandwidthShapes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVirtualCircuitBandwidthShapesResponse>
                transformer =
                        ListVirtualCircuitBandwidthShapesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualCircuitBandwidthShapesRequest,
                        ListVirtualCircuitBandwidthShapesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualCircuitBandwidthShapesRequest,
                                ListVirtualCircuitBandwidthShapesResponse>,
                        java.util.concurrent.Future<ListVirtualCircuitBandwidthShapesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualCircuitBandwidthShapesRequest,
                    ListVirtualCircuitBandwidthShapesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVirtualCircuitPublicPrefixesResponse>
            listVirtualCircuitPublicPrefixes(
                    ListVirtualCircuitPublicPrefixesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualCircuitPublicPrefixesRequest,
                                    ListVirtualCircuitPublicPrefixesResponse>
                            handler) {
        LOG.trace("Called async listVirtualCircuitPublicPrefixes");
        final ListVirtualCircuitPublicPrefixesRequest interceptedRequest =
                ListVirtualCircuitPublicPrefixesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitPublicPrefixesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitPublicPrefixes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/ListVirtualCircuitPublicPrefixes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListVirtualCircuitPublicPrefixesResponse>
                transformer =
                        ListVirtualCircuitPublicPrefixesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualCircuitPublicPrefixesRequest,
                        ListVirtualCircuitPublicPrefixesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualCircuitPublicPrefixesRequest,
                                ListVirtualCircuitPublicPrefixesResponse>,
                        java.util.concurrent.Future<ListVirtualCircuitPublicPrefixesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualCircuitPublicPrefixesRequest,
                    ListVirtualCircuitPublicPrefixesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVirtualCircuitsResponse> listVirtualCircuits(
            ListVirtualCircuitsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>
                    handler) {
        LOG.trace("Called async listVirtualCircuits");
        final ListVirtualCircuitsRequest interceptedRequest =
                ListVirtualCircuitsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVirtualCircuitsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuits",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/ListVirtualCircuits");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVirtualCircuitsResponse>
                transformer =
                        ListVirtualCircuitsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>,
                        java.util.concurrent.Future<ListVirtualCircuitsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVlansResponse> listVlans(
            ListVlansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVlansRequest, ListVlansResponse>
                    handler) {
        LOG.trace("Called async listVlans");
        final ListVlansRequest interceptedRequest = ListVlansConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVlansConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVlans",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/ListVlans");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVlansResponse>
                transformer =
                        ListVlansConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListVlansRequest, ListVlansResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListVlansRequest, ListVlansResponse>,
                        java.util.concurrent.Future<ListVlansResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVlansRequest, ListVlansResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListVtapsResponse> listVtaps(
            ListVtapsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVtapsRequest, ListVtapsResponse>
                    handler) {
        LOG.trace("Called async listVtaps");
        final ListVtapsRequest interceptedRequest = ListVtapsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListVtapsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ListVtaps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/ListVtaps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListVtapsResponse>
                transformer =
                        ListVtapsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListVtapsRequest, ListVtapsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListVtapsRequest, ListVtapsResponse>,
                        java.util.concurrent.Future<ListVtapsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListVtapsRequest, ListVtapsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ModifyVcnCidrResponse> modifyVcnCidr(
            ModifyVcnCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ModifyVcnCidrRequest, ModifyVcnCidrResponse>
                    handler) {
        LOG.trace("Called async modifyVcnCidr");
        final ModifyVcnCidrRequest interceptedRequest =
                ModifyVcnCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyVcnCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ModifyVcnCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ModifyVcnCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, ModifyVcnCidrResponse>
                transformer =
                        ModifyVcnCidrConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ModifyVcnCidrRequest, ModifyVcnCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ModifyVcnCidrRequest, ModifyVcnCidrResponse>,
                        java.util.concurrent.Future<ModifyVcnCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getModifyVcnCidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ModifyVcnCidrRequest, ModifyVcnCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDrgRouteDistributionStatementsResponse>
            removeDrgRouteDistributionStatements(
                    RemoveDrgRouteDistributionStatementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDrgRouteDistributionStatementsRequest,
                                    RemoveDrgRouteDistributionStatementsResponse>
                            handler) {
        LOG.trace("Called async removeDrgRouteDistributionStatements");
        final RemoveDrgRouteDistributionStatementsRequest interceptedRequest =
                RemoveDrgRouteDistributionStatementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDrgRouteDistributionStatementsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveDrgRouteDistributionStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/RemoveDrgRouteDistributionStatements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveDrgRouteDistributionStatementsResponse>
                transformer =
                        RemoveDrgRouteDistributionStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDrgRouteDistributionStatementsRequest,
                        RemoveDrgRouteDistributionStatementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDrgRouteDistributionStatementsRequest,
                                RemoveDrgRouteDistributionStatementsResponse>,
                        java.util.concurrent.Future<RemoveDrgRouteDistributionStatementsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveDrgRouteDistributionStatementsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDrgRouteDistributionStatementsRequest,
                    RemoveDrgRouteDistributionStatementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDrgRouteRulesResponse> removeDrgRouteRules(
            RemoveDrgRouteRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDrgRouteRulesRequest, RemoveDrgRouteRulesResponse>
                    handler) {
        LOG.trace("Called async removeDrgRouteRules");
        final RemoveDrgRouteRulesRequest interceptedRequest =
                RemoveDrgRouteRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDrgRouteRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveDrgRouteRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/RemoveDrgRouteRules");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveDrgRouteRulesResponse>
                transformer =
                        RemoveDrgRouteRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveDrgRouteRulesRequest, RemoveDrgRouteRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDrgRouteRulesRequest, RemoveDrgRouteRulesResponse>,
                        java.util.concurrent.Future<RemoveDrgRouteRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveDrgRouteRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDrgRouteRulesRequest, RemoveDrgRouteRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveExportDrgRouteDistributionResponse>
            removeExportDrgRouteDistribution(
                    RemoveExportDrgRouteDistributionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveExportDrgRouteDistributionRequest,
                                    RemoveExportDrgRouteDistributionResponse>
                            handler) {
        LOG.trace("Called async removeExportDrgRouteDistribution");
        final RemoveExportDrgRouteDistributionRequest interceptedRequest =
                RemoveExportDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveExportDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveExportDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/RemoveExportDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveExportDrgRouteDistributionResponse>
                transformer =
                        RemoveExportDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveExportDrgRouteDistributionRequest,
                        RemoveExportDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveExportDrgRouteDistributionRequest,
                                RemoveExportDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<RemoveExportDrgRouteDistributionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveExportDrgRouteDistributionRequest,
                    RemoveExportDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveImportDrgRouteDistributionResponse>
            removeImportDrgRouteDistribution(
                    RemoveImportDrgRouteDistributionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveImportDrgRouteDistributionRequest,
                                    RemoveImportDrgRouteDistributionResponse>
                            handler) {
        LOG.trace("Called async removeImportDrgRouteDistribution");
        final RemoveImportDrgRouteDistributionRequest interceptedRequest =
                RemoveImportDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveImportDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveImportDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/RemoveImportDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveImportDrgRouteDistributionResponse>
                transformer =
                        RemoveImportDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveImportDrgRouteDistributionRequest,
                        RemoveImportDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveImportDrgRouteDistributionRequest,
                                RemoveImportDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<RemoveImportDrgRouteDistributionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveImportDrgRouteDistributionRequest,
                    RemoveImportDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveIpv6SubnetCidrResponse> removeIpv6SubnetCidr(
            RemoveIpv6SubnetCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>
                    handler) {
        LOG.trace("Called async removeIpv6SubnetCidr");
        final RemoveIpv6SubnetCidrRequest interceptedRequest =
                RemoveIpv6SubnetCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveIpv6SubnetCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveIpv6SubnetCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/RemoveIpv6SubnetCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveIpv6SubnetCidrResponse>
                transformer =
                        RemoveIpv6SubnetCidrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>,
                        java.util.concurrent.Future<RemoveIpv6SubnetCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveSubnetIpv6CidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveIpv6VcnCidrResponse> removeIpv6VcnCidr(
            RemoveIpv6VcnCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>
                    handler) {
        LOG.trace("Called async removeIpv6VcnCidr");
        final RemoveIpv6VcnCidrRequest interceptedRequest =
                RemoveIpv6VcnCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveIpv6VcnCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveIpv6VcnCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/RemoveIpv6VcnCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveIpv6VcnCidrResponse>
                transformer =
                        RemoveIpv6VcnCidrConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>,
                        java.util.concurrent.Future<RemoveIpv6VcnCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveVcnIpv6CidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveNetworkSecurityGroupSecurityRulesResponse>
            removeNetworkSecurityGroupSecurityRules(
                    RemoveNetworkSecurityGroupSecurityRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveNetworkSecurityGroupSecurityRulesRequest,
                                    RemoveNetworkSecurityGroupSecurityRulesResponse>
                            handler) {
        LOG.trace("Called async removeNetworkSecurityGroupSecurityRules");
        final RemoveNetworkSecurityGroupSecurityRulesRequest interceptedRequest =
                RemoveNetworkSecurityGroupSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveNetworkSecurityGroupSecurityRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveNetworkSecurityGroupSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/RemoveNetworkSecurityGroupSecurityRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemoveNetworkSecurityGroupSecurityRulesResponse>
                transformer =
                        RemoveNetworkSecurityGroupSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemoveNetworkSecurityGroupSecurityRulesRequest,
                        RemoveNetworkSecurityGroupSecurityRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveNetworkSecurityGroupSecurityRulesRequest,
                                RemoveNetworkSecurityGroupSecurityRulesResponse>,
                        java.util.concurrent.Future<
                                RemoveNetworkSecurityGroupSecurityRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRemoveNetworkSecurityGroupSecurityRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveNetworkSecurityGroupSecurityRulesRequest,
                    RemoveNetworkSecurityGroupSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemovePublicIpPoolCapacityResponse>
            removePublicIpPoolCapacity(
                    RemovePublicIpPoolCapacityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemovePublicIpPoolCapacityRequest,
                                    RemovePublicIpPoolCapacityResponse>
                            handler) {
        LOG.trace("Called async removePublicIpPoolCapacity");
        final RemovePublicIpPoolCapacityRequest interceptedRequest =
                RemovePublicIpPoolCapacityConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePublicIpPoolCapacityConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemovePublicIpPoolCapacity",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/RemovePublicIpPoolCapacity");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RemovePublicIpPoolCapacityResponse>
                transformer =
                        RemovePublicIpPoolCapacityConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RemovePublicIpPoolCapacityRequest, RemovePublicIpPoolCapacityResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemovePublicIpPoolCapacityRequest,
                                RemovePublicIpPoolCapacityResponse>,
                        java.util.concurrent.Future<RemovePublicIpPoolCapacityResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemovePublicIpPoolCapacityDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemovePublicIpPoolCapacityRequest, RemovePublicIpPoolCapacityResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveVcnCidrResponse> removeVcnCidr(
            RemoveVcnCidrRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveVcnCidrRequest, RemoveVcnCidrResponse>
                    handler) {
        LOG.trace("Called async removeVcnCidr");
        final RemoveVcnCidrRequest interceptedRequest =
                RemoveVcnCidrConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveVcnCidrConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "RemoveVcnCidr",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/RemoveVcnCidr");
        final java.util.function.Function<javax.ws.rs.core.Response, RemoveVcnCidrResponse>
                transformer =
                        RemoveVcnCidrConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<RemoveVcnCidrRequest, RemoveVcnCidrResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveVcnCidrRequest, RemoveVcnCidrResponse>,
                        java.util.concurrent.Future<RemoveVcnCidrResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveVcnCidrDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveVcnCidrRequest, RemoveVcnCidrResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateByoipRangeResponse> updateByoipRange(
            UpdateByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateByoipRangeRequest, UpdateByoipRangeResponse>
                    handler) {
        LOG.trace("Called async updateByoipRange");
        final UpdateByoipRangeRequest interceptedRequest =
                UpdateByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/UpdateByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateByoipRangeResponse>
                transformer =
                        UpdateByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateByoipRangeRequest, UpdateByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateByoipRangeRequest, UpdateByoipRangeResponse>,
                        java.util.concurrent.Future<UpdateByoipRangeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateByoipRangeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateByoipRangeRequest, UpdateByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCaptureFilterResponse> updateCaptureFilter(
            UpdateCaptureFilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCaptureFilterRequest, UpdateCaptureFilterResponse>
                    handler) {
        LOG.trace("Called async updateCaptureFilter");
        final UpdateCaptureFilterRequest interceptedRequest =
                UpdateCaptureFilterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCaptureFilterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateCaptureFilter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/UpdateCaptureFilter");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCaptureFilterResponse>
                transformer =
                        UpdateCaptureFilterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCaptureFilterRequest, UpdateCaptureFilterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCaptureFilterRequest, UpdateCaptureFilterResponse>,
                        java.util.concurrent.Future<UpdateCaptureFilterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCaptureFilterDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCaptureFilterRequest, UpdateCaptureFilterResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCpeResponse> updateCpe(
            UpdateCpeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateCpeRequest, UpdateCpeResponse>
                    handler) {
        LOG.trace("Called async updateCpe");
        final UpdateCpeRequest interceptedRequest = UpdateCpeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCpeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateCpe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/UpdateCpe");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCpeResponse>
                transformer =
                        UpdateCpeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCpeRequest, UpdateCpeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateCpeRequest, UpdateCpeResponse>,
                        java.util.concurrent.Future<UpdateCpeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCpeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCpeRequest, UpdateCpeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCrossConnectResponse> updateCrossConnect(
            UpdateCrossConnectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCrossConnectRequest, UpdateCrossConnectResponse>
                    handler) {
        LOG.trace("Called async updateCrossConnect");
        final UpdateCrossConnectRequest interceptedRequest =
                UpdateCrossConnectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCrossConnectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateCrossConnect",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/UpdateCrossConnect");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCrossConnectResponse>
                transformer =
                        UpdateCrossConnectConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateCrossConnectRequest, UpdateCrossConnectResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCrossConnectRequest, UpdateCrossConnectResponse>,
                        java.util.concurrent.Future<UpdateCrossConnectResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCrossConnectDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCrossConnectRequest, UpdateCrossConnectResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCrossConnectGroupResponse> updateCrossConnectGroup(
            UpdateCrossConnectGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCrossConnectGroupRequest, UpdateCrossConnectGroupResponse>
                    handler) {
        LOG.trace("Called async updateCrossConnectGroup");
        final UpdateCrossConnectGroupRequest interceptedRequest =
                UpdateCrossConnectGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCrossConnectGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateCrossConnectGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/UpdateCrossConnectGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCrossConnectGroupResponse>
                transformer =
                        UpdateCrossConnectGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCrossConnectGroupRequest, UpdateCrossConnectGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCrossConnectGroupRequest, UpdateCrossConnectGroupResponse>,
                        java.util.concurrent.Future<UpdateCrossConnectGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCrossConnectGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCrossConnectGroupRequest, UpdateCrossConnectGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDhcpOptionsResponse> updateDhcpOptions(
            UpdateDhcpOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse>
                    handler) {
        LOG.trace("Called async updateDhcpOptions");
        final UpdateDhcpOptionsRequest interceptedRequest =
                UpdateDhcpOptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDhcpOptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDhcpOptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/UpdateDhcpOptions");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDhcpOptionsResponse>
                transformer =
                        UpdateDhcpOptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse>,
                        java.util.concurrent.Future<UpdateDhcpOptionsResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDhcpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgResponse> updateDrg(
            UpdateDrgRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDrgRequest, UpdateDrgResponse>
                    handler) {
        LOG.trace("Called async updateDrg");
        final UpdateDrgRequest interceptedRequest = UpdateDrgConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrg",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/UpdateDrg");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrgResponse>
                transformer =
                        UpdateDrgConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateDrgRequest, UpdateDrgResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateDrgRequest, UpdateDrgResponse>,
                        java.util.concurrent.Future<UpdateDrgResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgRequest, UpdateDrgResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgAttachmentResponse> updateDrgAttachment(
            UpdateDrgAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse>
                    handler) {
        LOG.trace("Called async updateDrgAttachment");
        final UpdateDrgAttachmentRequest interceptedRequest =
                UpdateDrgAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgAttachmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrgAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/UpdateDrgAttachment");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrgAttachmentResponse>
                transformer =
                        UpdateDrgAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse>,
                        java.util.concurrent.Future<UpdateDrgAttachmentResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgAttachmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgRouteDistributionResponse>
            updateDrgRouteDistribution(
                    UpdateDrgRouteDistributionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDrgRouteDistributionRequest,
                                    UpdateDrgRouteDistributionResponse>
                            handler) {
        LOG.trace("Called async updateDrgRouteDistribution");
        final UpdateDrgRouteDistributionRequest interceptedRequest =
                UpdateDrgRouteDistributionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgRouteDistributionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteDistribution",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/UpdateDrgRouteDistribution");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDrgRouteDistributionResponse>
                transformer =
                        UpdateDrgRouteDistributionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrgRouteDistributionRequest, UpdateDrgRouteDistributionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrgRouteDistributionRequest,
                                UpdateDrgRouteDistributionResponse>,
                        java.util.concurrent.Future<UpdateDrgRouteDistributionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgRouteDistributionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgRouteDistributionRequest, UpdateDrgRouteDistributionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgRouteDistributionStatementsResponse>
            updateDrgRouteDistributionStatements(
                    UpdateDrgRouteDistributionStatementsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDrgRouteDistributionStatementsRequest,
                                    UpdateDrgRouteDistributionStatementsResponse>
                            handler) {
        LOG.trace("Called async updateDrgRouteDistributionStatements");
        final UpdateDrgRouteDistributionStatementsRequest interceptedRequest =
                UpdateDrgRouteDistributionStatementsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgRouteDistributionStatementsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteDistributionStatements",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/UpdateDrgRouteDistributionStatements");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDrgRouteDistributionStatementsResponse>
                transformer =
                        UpdateDrgRouteDistributionStatementsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrgRouteDistributionStatementsRequest,
                        UpdateDrgRouteDistributionStatementsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrgRouteDistributionStatementsRequest,
                                UpdateDrgRouteDistributionStatementsResponse>,
                        java.util.concurrent.Future<UpdateDrgRouteDistributionStatementsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgRouteDistributionStatementsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgRouteDistributionStatementsRequest,
                    UpdateDrgRouteDistributionStatementsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgRouteRulesResponse> updateDrgRouteRules(
            UpdateDrgRouteRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrgRouteRulesRequest, UpdateDrgRouteRulesResponse>
                    handler) {
        LOG.trace("Called async updateDrgRouteRules");
        final UpdateDrgRouteRulesRequest interceptedRequest =
                UpdateDrgRouteRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgRouteRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/UpdateDrgRouteRules");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrgRouteRulesResponse>
                transformer =
                        UpdateDrgRouteRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrgRouteRulesRequest, UpdateDrgRouteRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrgRouteRulesRequest, UpdateDrgRouteRulesResponse>,
                        java.util.concurrent.Future<UpdateDrgRouteRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgRouteRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgRouteRulesRequest, UpdateDrgRouteRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDrgRouteTableResponse> updateDrgRouteTable(
            UpdateDrgRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrgRouteTableRequest, UpdateDrgRouteTableResponse>
                    handler) {
        LOG.trace("Called async updateDrgRouteTable");
        final UpdateDrgRouteTableRequest interceptedRequest =
                UpdateDrgRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDrgRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/UpdateDrgRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDrgRouteTableResponse>
                transformer =
                        UpdateDrgRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDrgRouteTableRequest, UpdateDrgRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDrgRouteTableRequest, UpdateDrgRouteTableResponse>,
                        java.util.concurrent.Future<UpdateDrgRouteTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDrgRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDrgRouteTableRequest, UpdateDrgRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSecConnectionResponse> updateIPSecConnection(
            UpdateIPSecConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>
                    handler) {
        LOG.trace("Called async updateIPSecConnection");
        final UpdateIPSecConnectionRequest interceptedRequest =
                UpdateIPSecConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIPSecConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/UpdateIPSecConnection");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateIPSecConnectionResponse>
                transformer =
                        UpdateIPSecConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>,
                        java.util.concurrent.Future<UpdateIPSecConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIPSecConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSecConnectionTunnelResponse>
            updateIPSecConnectionTunnel(
                    UpdateIPSecConnectionTunnelRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIPSecConnectionTunnelRequest,
                                    UpdateIPSecConnectionTunnelResponse>
                            handler) {
        LOG.trace("Called async updateIPSecConnectionTunnel");
        final UpdateIPSecConnectionTunnelRequest interceptedRequest =
                UpdateIPSecConnectionTunnelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIPSecConnectionTunnelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnectionTunnel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/UpdateIPSecConnectionTunnel");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateIPSecConnectionTunnelResponse>
                transformer =
                        UpdateIPSecConnectionTunnelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIPSecConnectionTunnelRequest, UpdateIPSecConnectionTunnelResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIPSecConnectionTunnelRequest,
                                UpdateIPSecConnectionTunnelResponse>,
                        java.util.concurrent.Future<UpdateIPSecConnectionTunnelResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIPSecConnectionTunnelDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIPSecConnectionTunnelRequest, UpdateIPSecConnectionTunnelResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSecConnectionTunnelSharedSecretResponse>
            updateIPSecConnectionTunnelSharedSecret(
                    UpdateIPSecConnectionTunnelSharedSecretRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIPSecConnectionTunnelSharedSecretRequest,
                                    UpdateIPSecConnectionTunnelSharedSecretResponse>
                            handler) {
        LOG.trace("Called async updateIPSecConnectionTunnelSharedSecret");
        final UpdateIPSecConnectionTunnelSharedSecretRequest interceptedRequest =
                UpdateIPSecConnectionTunnelSharedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIPSecConnectionTunnelSharedSecretConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnectionTunnelSharedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelSharedSecret/UpdateIPSecConnectionTunnelSharedSecret");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateIPSecConnectionTunnelSharedSecretResponse>
                transformer =
                        UpdateIPSecConnectionTunnelSharedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateIPSecConnectionTunnelSharedSecretRequest,
                        UpdateIPSecConnectionTunnelSharedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIPSecConnectionTunnelSharedSecretRequest,
                                UpdateIPSecConnectionTunnelSharedSecretResponse>,
                        java.util.concurrent.Future<
                                UpdateIPSecConnectionTunnelSharedSecretResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateIPSecConnectionTunnelSharedSecretDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIPSecConnectionTunnelSharedSecretRequest,
                    UpdateIPSecConnectionTunnelSharedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateInternetGatewayResponse> updateInternetGateway(
            UpdateInternetGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInternetGatewayRequest, UpdateInternetGatewayResponse>
                    handler) {
        LOG.trace("Called async updateInternetGateway");
        final UpdateInternetGatewayRequest interceptedRequest =
                UpdateInternetGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInternetGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateInternetGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/UpdateInternetGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateInternetGatewayResponse>
                transformer =
                        UpdateInternetGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInternetGatewayRequest, UpdateInternetGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInternetGatewayRequest, UpdateInternetGatewayResponse>,
                        java.util.concurrent.Future<UpdateInternetGatewayResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInternetGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInternetGatewayRequest, UpdateInternetGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateIpv6Response> updateIpv6(
            UpdateIpv6Request request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateIpv6Request, UpdateIpv6Response>
                    handler) {
        LOG.trace("Called async updateIpv6");
        final UpdateIpv6Request interceptedRequest = UpdateIpv6Converter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateIpv6Converter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateIpv6",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/UpdateIpv6");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateIpv6Response>
                transformer =
                        UpdateIpv6Converter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateIpv6Request, UpdateIpv6Response> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateIpv6Request, UpdateIpv6Response>,
                        java.util.concurrent.Future<UpdateIpv6Response>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateIpv6Details(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateIpv6Request, UpdateIpv6Response>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateLocalPeeringGatewayResponse> updateLocalPeeringGateway(
            UpdateLocalPeeringGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLocalPeeringGatewayRequest, UpdateLocalPeeringGatewayResponse>
                    handler) {
        LOG.trace("Called async updateLocalPeeringGateway");
        final UpdateLocalPeeringGatewayRequest interceptedRequest =
                UpdateLocalPeeringGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLocalPeeringGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateLocalPeeringGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/UpdateLocalPeeringGateway");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateLocalPeeringGatewayResponse>
                transformer =
                        UpdateLocalPeeringGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateLocalPeeringGatewayRequest, UpdateLocalPeeringGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateLocalPeeringGatewayRequest,
                                UpdateLocalPeeringGatewayResponse>,
                        java.util.concurrent.Future<UpdateLocalPeeringGatewayResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateLocalPeeringGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateLocalPeeringGatewayRequest, UpdateLocalPeeringGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNatGatewayResponse> updateNatGateway(
            UpdateNatGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNatGatewayRequest, UpdateNatGatewayResponse>
                    handler) {
        LOG.trace("Called async updateNatGateway");
        final UpdateNatGatewayRequest interceptedRequest =
                UpdateNatGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNatGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateNatGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/UpdateNatGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateNatGatewayResponse>
                transformer =
                        UpdateNatGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateNatGatewayRequest, UpdateNatGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNatGatewayRequest, UpdateNatGatewayResponse>,
                        java.util.concurrent.Future<UpdateNatGatewayResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNatGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNatGatewayRequest, UpdateNatGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSecurityGroupResponse>
            updateNetworkSecurityGroup(
                    UpdateNetworkSecurityGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkSecurityGroupRequest,
                                    UpdateNetworkSecurityGroupResponse>
                            handler) {
        LOG.trace("Called async updateNetworkSecurityGroup");
        final UpdateNetworkSecurityGroupRequest interceptedRequest =
                UpdateNetworkSecurityGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkSecurityGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateNetworkSecurityGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/UpdateNetworkSecurityGroup");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSecurityGroupResponse>
                transformer =
                        UpdateNetworkSecurityGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkSecurityGroupRequest, UpdateNetworkSecurityGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkSecurityGroupRequest,
                                UpdateNetworkSecurityGroupResponse>,
                        java.util.concurrent.Future<UpdateNetworkSecurityGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkSecurityGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkSecurityGroupRequest, UpdateNetworkSecurityGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSecurityGroupSecurityRulesResponse>
            updateNetworkSecurityGroupSecurityRules(
                    UpdateNetworkSecurityGroupSecurityRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkSecurityGroupSecurityRulesRequest,
                                    UpdateNetworkSecurityGroupSecurityRulesResponse>
                            handler) {
        LOG.trace("Called async updateNetworkSecurityGroupSecurityRules");
        final UpdateNetworkSecurityGroupSecurityRulesRequest interceptedRequest =
                UpdateNetworkSecurityGroupSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkSecurityGroupSecurityRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateNetworkSecurityGroupSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/UpdateNetworkSecurityGroupSecurityRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSecurityGroupSecurityRulesResponse>
                transformer =
                        UpdateNetworkSecurityGroupSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkSecurityGroupSecurityRulesRequest,
                        UpdateNetworkSecurityGroupSecurityRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkSecurityGroupSecurityRulesRequest,
                                UpdateNetworkSecurityGroupSecurityRulesResponse>,
                        java.util.concurrent.Future<
                                UpdateNetworkSecurityGroupSecurityRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getUpdateNetworkSecurityGroupSecurityRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkSecurityGroupSecurityRulesRequest,
                    UpdateNetworkSecurityGroupSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivateIpResponse> updatePrivateIp(
            UpdatePrivateIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateIpRequest, UpdatePrivateIpResponse>
                    handler) {
        LOG.trace("Called async updatePrivateIp");
        final UpdatePrivateIpRequest interceptedRequest =
                UpdatePrivateIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePrivateIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdatePrivateIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePrivateIpResponse>
                transformer =
                        UpdatePrivateIpConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePrivateIpRequest, UpdatePrivateIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePrivateIpRequest, UpdatePrivateIpResponse>,
                        java.util.concurrent.Future<UpdatePrivateIpResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePrivateIpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePrivateIpRequest, UpdatePrivateIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePublicIpResponse> updatePublicIp(
            UpdatePublicIpRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePublicIpRequest, UpdatePublicIpResponse>
                    handler) {
        LOG.trace("Called async updatePublicIp");
        final UpdatePublicIpRequest interceptedRequest =
                UpdatePublicIpConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePublicIpConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdatePublicIp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/UpdatePublicIp");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePublicIpResponse>
                transformer =
                        UpdatePublicIpConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePublicIpRequest, UpdatePublicIpResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePublicIpRequest, UpdatePublicIpResponse>,
                        java.util.concurrent.Future<UpdatePublicIpResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePublicIpDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePublicIpRequest, UpdatePublicIpResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdatePublicIpPoolResponse> updatePublicIpPool(
            UpdatePublicIpPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePublicIpPoolRequest, UpdatePublicIpPoolResponse>
                    handler) {
        LOG.trace("Called async updatePublicIpPool");
        final UpdatePublicIpPoolRequest interceptedRequest =
                UpdatePublicIpPoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePublicIpPoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdatePublicIpPool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/UpdatePublicIpPool");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdatePublicIpPoolResponse>
                transformer =
                        UpdatePublicIpPoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdatePublicIpPoolRequest, UpdatePublicIpPoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdatePublicIpPoolRequest, UpdatePublicIpPoolResponse>,
                        java.util.concurrent.Future<UpdatePublicIpPoolResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdatePublicIpPoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdatePublicIpPoolRequest, UpdatePublicIpPoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRemotePeeringConnectionResponse>
            updateRemotePeeringConnection(
                    UpdateRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateRemotePeeringConnectionRequest,
                                    UpdateRemotePeeringConnectionResponse>
                            handler) {
        LOG.trace("Called async updateRemotePeeringConnection");
        final UpdateRemotePeeringConnectionRequest interceptedRequest =
                UpdateRemotePeeringConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRemotePeeringConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateRemotePeeringConnection",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/UpdateRemotePeeringConnection");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateRemotePeeringConnectionResponse>
                transformer =
                        UpdateRemotePeeringConnectionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateRemotePeeringConnectionRequest, UpdateRemotePeeringConnectionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRemotePeeringConnectionRequest,
                                UpdateRemotePeeringConnectionResponse>,
                        java.util.concurrent.Future<UpdateRemotePeeringConnectionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRemotePeeringConnectionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRemotePeeringConnectionRequest, UpdateRemotePeeringConnectionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteTableResponse> updateRouteTable(
            UpdateRouteTableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRouteTableRequest, UpdateRouteTableResponse>
                    handler) {
        LOG.trace("Called async updateRouteTable");
        final UpdateRouteTableRequest interceptedRequest =
                UpdateRouteTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateRouteTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateRouteTable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/UpdateRouteTable");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRouteTableResponse>
                transformer =
                        UpdateRouteTableConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateRouteTableRequest, UpdateRouteTableResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateRouteTableRequest, UpdateRouteTableResponse>,
                        java.util.concurrent.Future<UpdateRouteTableResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateRouteTableDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateRouteTableRequest, UpdateRouteTableResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityListResponse> updateSecurityList(
            UpdateSecurityListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityListRequest, UpdateSecurityListResponse>
                    handler) {
        LOG.trace("Called async updateSecurityList");
        final UpdateSecurityListRequest interceptedRequest =
                UpdateSecurityListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateSecurityList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/UpdateSecurityList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityListResponse>
                transformer =
                        UpdateSecurityListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSecurityListRequest, UpdateSecurityListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityListRequest, UpdateSecurityListResponse>,
                        java.util.concurrent.Future<UpdateSecurityListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityListRequest, UpdateSecurityListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceGatewayResponse> updateServiceGateway(
            UpdateServiceGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceGatewayRequest, UpdateServiceGatewayResponse>
                    handler) {
        LOG.trace("Called async updateServiceGateway");
        final UpdateServiceGatewayRequest interceptedRequest =
                UpdateServiceGatewayConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateServiceGatewayConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateServiceGateway",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/UpdateServiceGateway");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateServiceGatewayResponse>
                transformer =
                        UpdateServiceGatewayConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateServiceGatewayRequest, UpdateServiceGatewayResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateServiceGatewayRequest, UpdateServiceGatewayResponse>,
                        java.util.concurrent.Future<UpdateServiceGatewayResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateServiceGatewayDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateServiceGatewayRequest, UpdateServiceGatewayResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetResponse> updateSubnet(
            UpdateSubnetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSubnetRequest, UpdateSubnetResponse>
                    handler) {
        LOG.trace("Called async updateSubnet");
        final UpdateSubnetRequest interceptedRequest =
                UpdateSubnetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSubnetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateSubnet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/UpdateSubnet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSubnetResponse>
                transformer =
                        UpdateSubnetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSubnetRequest, UpdateSubnetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSubnetRequest, UpdateSubnetResponse>,
                        java.util.concurrent.Future<UpdateSubnetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSubnetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSubnetRequest, UpdateSubnetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTunnelCpeDeviceConfigResponse>
            updateTunnelCpeDeviceConfig(
                    UpdateTunnelCpeDeviceConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTunnelCpeDeviceConfigRequest,
                                    UpdateTunnelCpeDeviceConfigResponse>
                            handler) {
        LOG.trace("Called async updateTunnelCpeDeviceConfig");
        final UpdateTunnelCpeDeviceConfigRequest interceptedRequest =
                UpdateTunnelCpeDeviceConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTunnelCpeDeviceConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateTunnelCpeDeviceConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/UpdateTunnelCpeDeviceConfig");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTunnelCpeDeviceConfigResponse>
                transformer =
                        UpdateTunnelCpeDeviceConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTunnelCpeDeviceConfigRequest, UpdateTunnelCpeDeviceConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTunnelCpeDeviceConfigRequest,
                                UpdateTunnelCpeDeviceConfigResponse>,
                        java.util.concurrent.Future<UpdateTunnelCpeDeviceConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTunnelCpeDeviceConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTunnelCpeDeviceConfigRequest, UpdateTunnelCpeDeviceConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVcnResponse> updateVcn(
            UpdateVcnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVcnRequest, UpdateVcnResponse>
                    handler) {
        LOG.trace("Called async updateVcn");
        final UpdateVcnRequest interceptedRequest = UpdateVcnConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVcnConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateVcn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/UpdateVcn");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVcnResponse>
                transformer =
                        UpdateVcnConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateVcnRequest, UpdateVcnResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateVcnRequest, UpdateVcnResponse>,
                        java.util.concurrent.Future<UpdateVcnResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVcnDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVcnRequest, UpdateVcnResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualCircuitResponse> updateVirtualCircuit(
            UpdateVirtualCircuitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualCircuitRequest, UpdateVirtualCircuitResponse>
                    handler) {
        LOG.trace("Called async updateVirtualCircuit");
        final UpdateVirtualCircuitRequest interceptedRequest =
                UpdateVirtualCircuitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVirtualCircuitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateVirtualCircuit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/UpdateVirtualCircuit");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVirtualCircuitResponse>
                transformer =
                        UpdateVirtualCircuitConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateVirtualCircuitRequest, UpdateVirtualCircuitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVirtualCircuitRequest, UpdateVirtualCircuitResponse>,
                        java.util.concurrent.Future<UpdateVirtualCircuitResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVirtualCircuitDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVirtualCircuitRequest, UpdateVirtualCircuitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVlanResponse> updateVlan(
            UpdateVlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVlanRequest, UpdateVlanResponse>
                    handler) {
        LOG.trace("Called async updateVlan");
        final UpdateVlanRequest interceptedRequest = UpdateVlanConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVlanConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateVlan",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/UpdateVlan");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVlanResponse>
                transformer =
                        UpdateVlanConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateVlanRequest, UpdateVlanResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVlanRequest, UpdateVlanResponse>,
                        java.util.concurrent.Future<UpdateVlanResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVlanDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVlanRequest, UpdateVlanResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVnicResponse> updateVnic(
            UpdateVnicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVnicRequest, UpdateVnicResponse>
                    handler) {
        LOG.trace("Called async updateVnic");
        final UpdateVnicRequest interceptedRequest = UpdateVnicConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVnicConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpdateVnic",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vnic/UpdateVnic");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVnicResponse>
                transformer =
                        UpdateVnicConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateVnicRequest, UpdateVnicResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVnicRequest, UpdateVnicResponse>,
                        java.util.concurrent.Future<UpdateVnicResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVnicDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVnicRequest, UpdateVnicResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateVtapResponse> updateVtap(
            UpdateVtapRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVtapRequest, UpdateVtapResponse>
                    handler) {
        LOG.trace("Called async updateVtap");
        final UpdateVtapRequest interceptedRequest = UpdateVtapConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateVtapConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork", "UpdateVtap", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateVtapResponse>
                transformer =
                        UpdateVtapConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateVtapRequest, UpdateVtapResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateVtapRequest, UpdateVtapResponse>,
                        java.util.concurrent.Future<UpdateVtapResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateVtapDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateVtapRequest, UpdateVtapResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpgradeDrgResponse> upgradeDrg(
            UpgradeDrgRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpgradeDrgRequest, UpgradeDrgResponse>
                    handler) {
        LOG.trace("Called async upgradeDrg");
        final UpgradeDrgRequest interceptedRequest = UpgradeDrgConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpgradeDrgConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "UpgradeDrg",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/UpgradeDrg");
        final java.util.function.Function<javax.ws.rs.core.Response, UpgradeDrgResponse>
                transformer =
                        UpgradeDrgConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpgradeDrgRequest, UpgradeDrgResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpgradeDrgRequest, UpgradeDrgResponse>,
                        java.util.concurrent.Future<UpgradeDrgResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpgradeDrgRequest, UpgradeDrgResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ValidateByoipRangeResponse> validateByoipRange(
            ValidateByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateByoipRangeRequest, ValidateByoipRangeResponse>
                    handler) {
        LOG.trace("Called async validateByoipRange");
        final ValidateByoipRangeRequest interceptedRequest =
                ValidateByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ValidateByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "ValidateByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ValidateByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, ValidateByoipRangeResponse>
                transformer =
                        ValidateByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ValidateByoipRangeRequest, ValidateByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ValidateByoipRangeRequest, ValidateByoipRangeResponse>,
                        java.util.concurrent.Future<ValidateByoipRangeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ValidateByoipRangeRequest, ValidateByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<WithdrawByoipRangeResponse> withdrawByoipRange(
            WithdrawByoipRangeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            WithdrawByoipRangeRequest, WithdrawByoipRangeResponse>
                    handler) {
        LOG.trace("Called async withdrawByoipRange");
        final WithdrawByoipRangeRequest interceptedRequest =
                WithdrawByoipRangeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                WithdrawByoipRangeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "VirtualNetwork",
                        "WithdrawByoipRange",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/WithdrawByoipRange");
        final java.util.function.Function<javax.ws.rs.core.Response, WithdrawByoipRangeResponse>
                transformer =
                        WithdrawByoipRangeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<WithdrawByoipRangeRequest, WithdrawByoipRangeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                WithdrawByoipRangeRequest, WithdrawByoipRangeResponse>,
                        java.util.concurrent.Future<WithdrawByoipRangeResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    WithdrawByoipRangeRequest, WithdrawByoipRangeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
