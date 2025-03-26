/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.networkfirewall.internal.http.*;
import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;

/**
 * Async client implementation for NetworkFirewall service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class NetworkFirewallAsyncClient implements NetworkFirewallAsync {
    /**
     * Service instance for NetworkFirewall.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKFIREWALL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-firewall.{region}.ocs.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkFirewallAsyncClient.class);

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
    public NetworkFirewallAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
    public NetworkFirewallAsyncClient(
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
                    Builder, NetworkFirewallAsyncClient> {
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
        public NetworkFirewallAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new NetworkFirewallAsyncClient(
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
    public java.util.concurrent.Future<ApplyNetworkFirewallPolicyResponse>
            applyNetworkFirewallPolicy(
                    ApplyNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApplyNetworkFirewallPolicyRequest,
                                    ApplyNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async applyNetworkFirewallPolicy");
        final ApplyNetworkFirewallPolicyRequest interceptedRequest =
                ApplyNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplyNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ApplyNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ApplyNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ApplyNetworkFirewallPolicyResponse>
                transformer =
                        ApplyNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ApplyNetworkFirewallPolicyRequest, ApplyNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ApplyNetworkFirewallPolicyRequest,
                                ApplyNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<ApplyNetworkFirewallPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApplyNetworkFirewallPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ApplyNetworkFirewallPolicyRequest, ApplyNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadAddressListsResponse> bulkUploadAddressLists(
            BulkUploadAddressListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadAddressListsRequest, BulkUploadAddressListsResponse>
                    handler) {
        LOG.trace("Called async bulkUploadAddressLists");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadAddressListsRequest.builder());
        }
        final BulkUploadAddressListsRequest interceptedRequest =
                BulkUploadAddressListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadAddressListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadAddressLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/BulkUploadAddressLists");
        final java.util.function.Function<javax.ws.rs.core.Response, BulkUploadAddressListsResponse>
                transformer =
                        BulkUploadAddressListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadAddressListsRequest, BulkUploadAddressListsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadAddressListsRequest, BulkUploadAddressListsResponse>,
                        java.util.concurrent.Future<BulkUploadAddressListsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadAddressListsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadAddressListsRequest, BulkUploadAddressListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadAddressListsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadApplicationGroupsResponse>
            bulkUploadApplicationGroups(
                    BulkUploadApplicationGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkUploadApplicationGroupsRequest,
                                    BulkUploadApplicationGroupsResponse>
                            handler) {
        LOG.trace("Called async bulkUploadApplicationGroups");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadApplicationGroupsRequest.builder());
        }
        final BulkUploadApplicationGroupsRequest interceptedRequest =
                BulkUploadApplicationGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadApplicationGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadApplicationGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/BulkUploadApplicationGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadApplicationGroupsResponse>
                transformer =
                        BulkUploadApplicationGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadApplicationGroupsRequest, BulkUploadApplicationGroupsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadApplicationGroupsRequest,
                                BulkUploadApplicationGroupsResponse>,
                        java.util.concurrent.Future<BulkUploadApplicationGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadApplicationGroupsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadApplicationGroupsRequest, BulkUploadApplicationGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadApplicationGroupsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadApplicationsResponse> bulkUploadApplications(
            BulkUploadApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadApplicationsRequest, BulkUploadApplicationsResponse>
                    handler) {
        LOG.trace("Called async bulkUploadApplications");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadApplicationsRequest.builder());
        }
        final BulkUploadApplicationsRequest interceptedRequest =
                BulkUploadApplicationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadApplicationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/BulkUploadApplications");
        final java.util.function.Function<javax.ws.rs.core.Response, BulkUploadApplicationsResponse>
                transformer =
                        BulkUploadApplicationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadApplicationsRequest, BulkUploadApplicationsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadApplicationsRequest, BulkUploadApplicationsResponse>,
                        java.util.concurrent.Future<BulkUploadApplicationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadApplicationsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadApplicationsRequest, BulkUploadApplicationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadApplicationsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadDecryptionProfilesResponse>
            bulkUploadDecryptionProfiles(
                    BulkUploadDecryptionProfilesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkUploadDecryptionProfilesRequest,
                                    BulkUploadDecryptionProfilesResponse>
                            handler) {
        LOG.trace("Called async bulkUploadDecryptionProfiles");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadDecryptionProfilesRequest.builder());
        }
        final BulkUploadDecryptionProfilesRequest interceptedRequest =
                BulkUploadDecryptionProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadDecryptionProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadDecryptionProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/BulkUploadDecryptionProfiles");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadDecryptionProfilesResponse>
                transformer =
                        BulkUploadDecryptionProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadDecryptionProfilesRequest, BulkUploadDecryptionProfilesResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadDecryptionProfilesRequest,
                                BulkUploadDecryptionProfilesResponse>,
                        java.util.concurrent.Future<BulkUploadDecryptionProfilesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadDecryptionProfilesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadDecryptionProfilesRequest, BulkUploadDecryptionProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadDecryptionProfilesDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadDecryptionRulesResponse> bulkUploadDecryptionRules(
            BulkUploadDecryptionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadDecryptionRulesRequest, BulkUploadDecryptionRulesResponse>
                    handler) {
        LOG.trace("Called async bulkUploadDecryptionRules");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadDecryptionRulesRequest.builder());
        }
        final BulkUploadDecryptionRulesRequest interceptedRequest =
                BulkUploadDecryptionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadDecryptionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadDecryptionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/BulkUploadDecryptionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadDecryptionRulesResponse>
                transformer =
                        BulkUploadDecryptionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadDecryptionRulesRequest, BulkUploadDecryptionRulesResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadDecryptionRulesRequest,
                                BulkUploadDecryptionRulesResponse>,
                        java.util.concurrent.Future<BulkUploadDecryptionRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadDecryptionRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadDecryptionRulesRequest, BulkUploadDecryptionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadDecryptionRulesDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadMappedSecretsResponse> bulkUploadMappedSecrets(
            BulkUploadMappedSecretsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadMappedSecretsRequest, BulkUploadMappedSecretsResponse>
                    handler) {
        LOG.trace("Called async bulkUploadMappedSecrets");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadMappedSecretsRequest.builder());
        }
        final BulkUploadMappedSecretsRequest interceptedRequest =
                BulkUploadMappedSecretsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadMappedSecretsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadMappedSecrets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/BulkUploadMappedSecrets");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadMappedSecretsResponse>
                transformer =
                        BulkUploadMappedSecretsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadMappedSecretsRequest, BulkUploadMappedSecretsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadMappedSecretsRequest, BulkUploadMappedSecretsResponse>,
                        java.util.concurrent.Future<BulkUploadMappedSecretsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadMappedSecretsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadMappedSecretsRequest, BulkUploadMappedSecretsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadMappedSecretsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadSecurityRulesResponse> bulkUploadSecurityRules(
            BulkUploadSecurityRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadSecurityRulesRequest, BulkUploadSecurityRulesResponse>
                    handler) {
        LOG.trace("Called async bulkUploadSecurityRules");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadSecurityRulesRequest.builder());
        }
        final BulkUploadSecurityRulesRequest interceptedRequest =
                BulkUploadSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadSecurityRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/BulkUploadSecurityRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadSecurityRulesResponse>
                transformer =
                        BulkUploadSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadSecurityRulesRequest, BulkUploadSecurityRulesResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadSecurityRulesRequest, BulkUploadSecurityRulesResponse>,
                        java.util.concurrent.Future<BulkUploadSecurityRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadSecurityRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadSecurityRulesRequest, BulkUploadSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadSecurityRulesDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadServiceListsResponse> bulkUploadServiceLists(
            BulkUploadServiceListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadServiceListsRequest, BulkUploadServiceListsResponse>
                    handler) {
        LOG.trace("Called async bulkUploadServiceLists");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadServiceListsRequest.builder());
        }
        final BulkUploadServiceListsRequest interceptedRequest =
                BulkUploadServiceListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadServiceListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadServiceLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/BulkUploadServiceLists");
        final java.util.function.Function<javax.ws.rs.core.Response, BulkUploadServiceListsResponse>
                transformer =
                        BulkUploadServiceListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadServiceListsRequest, BulkUploadServiceListsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadServiceListsRequest, BulkUploadServiceListsResponse>,
                        java.util.concurrent.Future<BulkUploadServiceListsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadServiceListsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadServiceListsRequest, BulkUploadServiceListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadServiceListsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadServicesResponse> bulkUploadServices(
            BulkUploadServicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadServicesRequest, BulkUploadServicesResponse>
                    handler) {
        LOG.trace("Called async bulkUploadServices");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadServicesRequest.builder());
        }
        final BulkUploadServicesRequest interceptedRequest =
                BulkUploadServicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadServicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/BulkUploadServices");
        final java.util.function.Function<javax.ws.rs.core.Response, BulkUploadServicesResponse>
                transformer =
                        BulkUploadServicesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BulkUploadServicesRequest, BulkUploadServicesResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadServicesRequest, BulkUploadServicesResponse>,
                        java.util.concurrent.Future<BulkUploadServicesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadServicesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadServicesRequest, BulkUploadServicesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadServicesDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadTunnelInspectionRulesResponse>
            bulkUploadTunnelInspectionRules(
                    BulkUploadTunnelInspectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkUploadTunnelInspectionRulesRequest,
                                    BulkUploadTunnelInspectionRulesResponse>
                            handler) {
        LOG.trace("Called async bulkUploadTunnelInspectionRules");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadTunnelInspectionRulesRequest.builder());
        }
        final BulkUploadTunnelInspectionRulesRequest interceptedRequest =
                BulkUploadTunnelInspectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadTunnelInspectionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadTunnelInspectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/BulkUploadTunnelInspectionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, BulkUploadTunnelInspectionRulesResponse>
                transformer =
                        BulkUploadTunnelInspectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        BulkUploadTunnelInspectionRulesRequest,
                        BulkUploadTunnelInspectionRulesResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadTunnelInspectionRulesRequest,
                                BulkUploadTunnelInspectionRulesResponse>,
                        java.util.concurrent.Future<BulkUploadTunnelInspectionRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadTunnelInspectionRulesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadTunnelInspectionRulesRequest,
                    BulkUploadTunnelInspectionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadTunnelInspectionRulesDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<BulkUploadUrlListsResponse> bulkUploadUrlLists(
            BulkUploadUrlListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadUrlListsRequest, BulkUploadUrlListsResponse>
                    handler) {
        LOG.trace("Called async bulkUploadUrlLists");
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request =
                    com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                            request, BulkUploadUrlListsRequest.builder());
        }
        final BulkUploadUrlListsRequest interceptedRequest =
                BulkUploadUrlListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                BulkUploadUrlListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "BulkUploadUrlLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/BulkUploadUrlLists");
        final java.util.function.Function<javax.ws.rs.core.Response, BulkUploadUrlListsResponse>
                transformer =
                        BulkUploadUrlListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<BulkUploadUrlListsRequest, BulkUploadUrlListsResponse>
                handlerToUse =
                        new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                BulkUploadUrlListsRequest, BulkUploadUrlListsResponse>,
                        java.util.concurrent.Future<BulkUploadUrlListsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getBulkUploadUrlListsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    BulkUploadUrlListsRequest, BulkUploadUrlListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {
                    LOG.debug("Resetting stream");
                    com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                            interceptedRequest.getBulkUploadUrlListsDetails(), true);
                }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
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
                        "NetworkFirewall",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/CancelWorkRequest");
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
    public java.util.concurrent.Future<ChangeNetworkFirewallCompartmentResponse>
            changeNetworkFirewallCompartment(
                    ChangeNetworkFirewallCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallCompartmentRequest,
                                    ChangeNetworkFirewallCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNetworkFirewallCompartment");
        final ChangeNetworkFirewallCompartmentRequest interceptedRequest =
                ChangeNetworkFirewallCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkFirewallCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ChangeNetworkFirewallCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkFirewallCompartmentResponse>
                transformer =
                        ChangeNetworkFirewallCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNetworkFirewallCompartmentRequest,
                        ChangeNetworkFirewallCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNetworkFirewallCompartmentRequest,
                                ChangeNetworkFirewallCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNetworkFirewallCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeNetworkFirewallCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNetworkFirewallCompartmentRequest,
                    ChangeNetworkFirewallCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeNetworkFirewallPolicyCompartmentResponse>
            changeNetworkFirewallPolicyCompartment(
                    ChangeNetworkFirewallPolicyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallPolicyCompartmentRequest,
                                    ChangeNetworkFirewallPolicyCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeNetworkFirewallPolicyCompartment");
        final ChangeNetworkFirewallPolicyCompartmentRequest interceptedRequest =
                ChangeNetworkFirewallPolicyCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeNetworkFirewallPolicyCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ChangeNetworkFirewallPolicyCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeNetworkFirewallPolicyCompartmentResponse>
                transformer =
                        ChangeNetworkFirewallPolicyCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeNetworkFirewallPolicyCompartmentRequest,
                        ChangeNetworkFirewallPolicyCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeNetworkFirewallPolicyCompartmentRequest,
                                ChangeNetworkFirewallPolicyCompartmentResponse>,
                        java.util.concurrent.Future<ChangeNetworkFirewallPolicyCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeNetworkFirewallPolicyCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeNetworkFirewallPolicyCompartmentRequest,
                    ChangeNetworkFirewallPolicyCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CloneNetworkFirewallPolicyResponse>
            cloneNetworkFirewallPolicy(
                    CloneNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CloneNetworkFirewallPolicyRequest,
                                    CloneNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async cloneNetworkFirewallPolicy");
        final CloneNetworkFirewallPolicyRequest interceptedRequest =
                CloneNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CloneNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CloneNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CloneNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CloneNetworkFirewallPolicyResponse>
                transformer =
                        CloneNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CloneNetworkFirewallPolicyRequest, CloneNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CloneNetworkFirewallPolicyRequest,
                                CloneNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<CloneNetworkFirewallPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloneNetworkFirewallPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CloneNetworkFirewallPolicyRequest, CloneNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAddressListResponse> createAddressList(
            CreateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAddressListRequest, CreateAddressListResponse>
                    handler) {
        LOG.trace("Called async createAddressList");
        final CreateAddressListRequest interceptedRequest =
                CreateAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/CreateAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAddressListResponse>
                transformer =
                        CreateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAddressListRequest, CreateAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAddressListRequest, CreateAddressListResponse>,
                        java.util.concurrent.Future<CreateAddressListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateAddressListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAddressListRequest, CreateAddressListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "CreateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/CreateApplication");
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
    public java.util.concurrent.Future<CreateApplicationGroupResponse> createApplicationGroup(
            CreateApplicationGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationGroupRequest, CreateApplicationGroupResponse>
                    handler) {
        LOG.trace("Called async createApplicationGroup");
        final CreateApplicationGroupRequest interceptedRequest =
                CreateApplicationGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/CreateApplicationGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateApplicationGroupResponse>
                transformer =
                        CreateApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateApplicationGroupRequest, CreateApplicationGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApplicationGroupRequest, CreateApplicationGroupResponse>,
                        java.util.concurrent.Future<CreateApplicationGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateApplicationGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApplicationGroupRequest, CreateApplicationGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDecryptionProfileResponse> createDecryptionProfile(
            CreateDecryptionProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDecryptionProfileRequest, CreateDecryptionProfileResponse>
                    handler) {
        LOG.trace("Called async createDecryptionProfile");
        final CreateDecryptionProfileRequest interceptedRequest =
                CreateDecryptionProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDecryptionProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/CreateDecryptionProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDecryptionProfileResponse>
                transformer =
                        CreateDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDecryptionProfileRequest, CreateDecryptionProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDecryptionProfileRequest, CreateDecryptionProfileResponse>,
                        java.util.concurrent.Future<CreateDecryptionProfileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDecryptionProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDecryptionProfileRequest, CreateDecryptionProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDecryptionRuleResponse> createDecryptionRule(
            CreateDecryptionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDecryptionRuleRequest, CreateDecryptionRuleResponse>
                    handler) {
        LOG.trace("Called async createDecryptionRule");
        final CreateDecryptionRuleRequest interceptedRequest =
                CreateDecryptionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDecryptionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/CreateDecryptionRule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDecryptionRuleResponse>
                transformer =
                        CreateDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDecryptionRuleRequest, CreateDecryptionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDecryptionRuleRequest, CreateDecryptionRuleResponse>,
                        java.util.concurrent.Future<CreateDecryptionRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDecryptionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDecryptionRuleRequest, CreateDecryptionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMappedSecretResponse> createMappedSecret(
            CreateMappedSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMappedSecretRequest, CreateMappedSecretResponse>
                    handler) {
        LOG.trace("Called async createMappedSecret");
        final CreateMappedSecretRequest interceptedRequest =
                CreateMappedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMappedSecretConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/CreateMappedSecret");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMappedSecretResponse>
                transformer =
                        CreateMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMappedSecretRequest, CreateMappedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMappedSecretRequest, CreateMappedSecretResponse>,
                        java.util.concurrent.Future<CreateMappedSecretResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMappedSecretDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMappedSecretRequest, CreateMappedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkFirewallResponse> createNetworkFirewall(
            CreateNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>
                    handler) {
        LOG.trace("Called async createNetworkFirewall");
        final CreateNetworkFirewallRequest interceptedRequest =
                CreateNetworkFirewallConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkFirewallConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/CreateNetworkFirewall");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateNetworkFirewallResponse>
                transformer =
                        CreateNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>,
                        java.util.concurrent.Future<CreateNetworkFirewallResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNetworkFirewallDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkFirewallPolicyResponse>
            createNetworkFirewallPolicy(
                    CreateNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNetworkFirewallPolicyRequest,
                                    CreateNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async createNetworkFirewallPolicy");
        final CreateNetworkFirewallPolicyRequest interceptedRequest =
                CreateNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CreateNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateNetworkFirewallPolicyResponse>
                transformer =
                        CreateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkFirewallPolicyRequest, CreateNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkFirewallPolicyRequest,
                                CreateNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<CreateNetworkFirewallPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateNetworkFirewallPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkFirewallPolicyRequest, CreateNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityRuleResponse> createSecurityRule(
            CreateSecurityRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityRuleRequest, CreateSecurityRuleResponse>
                    handler) {
        LOG.trace("Called async createSecurityRule");
        final CreateSecurityRuleRequest interceptedRequest =
                CreateSecurityRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/CreateSecurityRule");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityRuleResponse>
                transformer =
                        CreateSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateSecurityRuleRequest, CreateSecurityRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityRuleRequest, CreateSecurityRuleResponse>,
                        java.util.concurrent.Future<CreateSecurityRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateSecurityRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityRuleRequest, CreateSecurityRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResponse> createService(
            CreateServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateServiceRequest, CreateServiceResponse>
                    handler) {
        LOG.trace("Called async createService");
        final CreateServiceRequest interceptedRequest =
                CreateServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/CreateService");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateServiceResponse>
                transformer =
                        CreateServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateServiceRequest, CreateServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateServiceRequest, CreateServiceResponse>,
                        java.util.concurrent.Future<CreateServiceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateServiceRequest, CreateServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateServiceListResponse> createServiceList(
            CreateServiceListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceListRequest, CreateServiceListResponse>
                    handler) {
        LOG.trace("Called async createServiceList");
        final CreateServiceListRequest interceptedRequest =
                CreateServiceListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateServiceListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/CreateServiceList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateServiceListResponse>
                transformer =
                        CreateServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateServiceListRequest, CreateServiceListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateServiceListRequest, CreateServiceListResponse>,
                        java.util.concurrent.Future<CreateServiceListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateServiceListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateServiceListRequest, CreateServiceListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTunnelInspectionRuleResponse>
            createTunnelInspectionRule(
                    CreateTunnelInspectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTunnelInspectionRuleRequest,
                                    CreateTunnelInspectionRuleResponse>
                            handler) {
        LOG.trace("Called async createTunnelInspectionRule");
        final CreateTunnelInspectionRuleRequest interceptedRequest =
                CreateTunnelInspectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTunnelInspectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateTunnelInspectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/CreateTunnelInspectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateTunnelInspectionRuleResponse>
                transformer =
                        CreateTunnelInspectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateTunnelInspectionRuleRequest, CreateTunnelInspectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTunnelInspectionRuleRequest,
                                CreateTunnelInspectionRuleResponse>,
                        java.util.concurrent.Future<CreateTunnelInspectionRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTunnelInspectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTunnelInspectionRuleRequest, CreateTunnelInspectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateUrlListResponse> createUrlList(
            CreateUrlListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUrlListRequest, CreateUrlListResponse>
                    handler) {
        LOG.trace("Called async createUrlList");
        final CreateUrlListRequest interceptedRequest =
                CreateUrlListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUrlListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "CreateUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/CreateUrlList");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateUrlListResponse>
                transformer =
                        CreateUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateUrlListRequest, CreateUrlListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUrlListRequest, CreateUrlListResponse>,
                        java.util.concurrent.Future<CreateUrlListResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateUrlListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUrlListRequest, CreateUrlListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAddressListResponse> deleteAddressList(
            DeleteAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAddressListRequest, DeleteAddressListResponse>
                    handler) {
        LOG.trace("Called async deleteAddressList");
        final DeleteAddressListRequest interceptedRequest =
                DeleteAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/DeleteAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAddressListResponse>
                transformer =
                        DeleteAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAddressListRequest, DeleteAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAddressListRequest, DeleteAddressListResponse>,
                        java.util.concurrent.Future<DeleteAddressListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAddressListRequest, DeleteAddressListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "DeleteApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/DeleteApplication");
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
    public java.util.concurrent.Future<DeleteApplicationGroupResponse> deleteApplicationGroup(
            DeleteApplicationGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>
                    handler) {
        LOG.trace("Called async deleteApplicationGroup");
        final DeleteApplicationGroupRequest interceptedRequest =
                DeleteApplicationGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/DeleteApplicationGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteApplicationGroupResponse>
                transformer =
                        DeleteApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>,
                        java.util.concurrent.Future<DeleteApplicationGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDecryptionProfileResponse> deleteDecryptionProfile(
            DeleteDecryptionProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDecryptionProfileRequest, DeleteDecryptionProfileResponse>
                    handler) {
        LOG.trace("Called async deleteDecryptionProfile");
        final DeleteDecryptionProfileRequest interceptedRequest =
                DeleteDecryptionProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDecryptionProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/DeleteDecryptionProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDecryptionProfileResponse>
                transformer =
                        DeleteDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDecryptionProfileRequest, DeleteDecryptionProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDecryptionProfileRequest, DeleteDecryptionProfileResponse>,
                        java.util.concurrent.Future<DeleteDecryptionProfileResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDecryptionProfileRequest, DeleteDecryptionProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDecryptionRuleResponse> deleteDecryptionRule(
            DeleteDecryptionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDecryptionRuleRequest, DeleteDecryptionRuleResponse>
                    handler) {
        LOG.trace("Called async deleteDecryptionRule");
        final DeleteDecryptionRuleRequest interceptedRequest =
                DeleteDecryptionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDecryptionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/DeleteDecryptionRule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDecryptionRuleResponse>
                transformer =
                        DeleteDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDecryptionRuleRequest, DeleteDecryptionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDecryptionRuleRequest, DeleteDecryptionRuleResponse>,
                        java.util.concurrent.Future<DeleteDecryptionRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDecryptionRuleRequest, DeleteDecryptionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMappedSecretResponse> deleteMappedSecret(
            DeleteMappedSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMappedSecretRequest, DeleteMappedSecretResponse>
                    handler) {
        LOG.trace("Called async deleteMappedSecret");
        final DeleteMappedSecretRequest interceptedRequest =
                DeleteMappedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMappedSecretConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/DeleteMappedSecret");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMappedSecretResponse>
                transformer =
                        DeleteMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMappedSecretRequest, DeleteMappedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMappedSecretRequest, DeleteMappedSecretResponse>,
                        java.util.concurrent.Future<DeleteMappedSecretResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMappedSecretRequest, DeleteMappedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkFirewallResponse> deleteNetworkFirewall(
            DeleteNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>
                    handler) {
        LOG.trace("Called async deleteNetworkFirewall");
        final DeleteNetworkFirewallRequest interceptedRequest =
                DeleteNetworkFirewallConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkFirewallConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/DeleteNetworkFirewall");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNetworkFirewallResponse>
                transformer =
                        DeleteNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>,
                        java.util.concurrent.Future<DeleteNetworkFirewallResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkFirewallPolicyResponse>
            deleteNetworkFirewallPolicy(
                    DeleteNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNetworkFirewallPolicyRequest,
                                    DeleteNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async deleteNetworkFirewallPolicy");
        final DeleteNetworkFirewallPolicyRequest interceptedRequest =
                DeleteNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/DeleteNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteNetworkFirewallPolicyResponse>
                transformer =
                        DeleteNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkFirewallPolicyRequest, DeleteNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkFirewallPolicyRequest,
                                DeleteNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<DeleteNetworkFirewallPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkFirewallPolicyRequest, DeleteNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityRuleResponse> deleteSecurityRule(
            DeleteSecurityRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityRuleRequest, DeleteSecurityRuleResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityRule");
        final DeleteSecurityRuleRequest interceptedRequest =
                DeleteSecurityRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/DeleteSecurityRule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityRuleResponse>
                transformer =
                        DeleteSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteSecurityRuleRequest, DeleteSecurityRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityRuleRequest, DeleteSecurityRuleResponse>,
                        java.util.concurrent.Future<DeleteSecurityRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityRuleRequest, DeleteSecurityRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResponse> deleteService(
            DeleteServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteServiceRequest, DeleteServiceResponse>
                    handler) {
        LOG.trace("Called async deleteService");
        final DeleteServiceRequest interceptedRequest =
                DeleteServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/DeleteService");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteServiceResponse>
                transformer =
                        DeleteServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteServiceRequest, DeleteServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteServiceRequest, DeleteServiceResponse>,
                        java.util.concurrent.Future<DeleteServiceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteServiceRequest, DeleteServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceListResponse> deleteServiceList(
            DeleteServiceListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceListRequest, DeleteServiceListResponse>
                    handler) {
        LOG.trace("Called async deleteServiceList");
        final DeleteServiceListRequest interceptedRequest =
                DeleteServiceListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteServiceListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/DeleteServiceList");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteServiceListResponse>
                transformer =
                        DeleteServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteServiceListRequest, DeleteServiceListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteServiceListRequest, DeleteServiceListResponse>,
                        java.util.concurrent.Future<DeleteServiceListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteServiceListRequest, DeleteServiceListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteTunnelInspectionRuleResponse>
            deleteTunnelInspectionRule(
                    DeleteTunnelInspectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTunnelInspectionRuleRequest,
                                    DeleteTunnelInspectionRuleResponse>
                            handler) {
        LOG.trace("Called async deleteTunnelInspectionRule");
        final DeleteTunnelInspectionRuleRequest interceptedRequest =
                DeleteTunnelInspectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTunnelInspectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteTunnelInspectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/DeleteTunnelInspectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteTunnelInspectionRuleResponse>
                transformer =
                        DeleteTunnelInspectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteTunnelInspectionRuleRequest, DeleteTunnelInspectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteTunnelInspectionRuleRequest,
                                DeleteTunnelInspectionRuleResponse>,
                        java.util.concurrent.Future<DeleteTunnelInspectionRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteTunnelInspectionRuleRequest, DeleteTunnelInspectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteUrlListResponse> deleteUrlList(
            DeleteUrlListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUrlListRequest, DeleteUrlListResponse>
                    handler) {
        LOG.trace("Called async deleteUrlList");
        final DeleteUrlListRequest interceptedRequest =
                DeleteUrlListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUrlListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "DeleteUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/DeleteUrlList");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteUrlListResponse>
                transformer =
                        DeleteUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteUrlListRequest, DeleteUrlListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUrlListRequest, DeleteUrlListResponse>,
                        java.util.concurrent.Future<DeleteUrlListResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUrlListRequest, DeleteUrlListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAddressListResponse> getAddressList(
            GetAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAddressListRequest, GetAddressListResponse>
                    handler) {
        LOG.trace("Called async getAddressList");
        final GetAddressListRequest interceptedRequest =
                GetAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/GetAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAddressListResponse>
                transformer =
                        GetAddressListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAddressListRequest, GetAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAddressListRequest, GetAddressListResponse>,
                        java.util.concurrent.Future<GetAddressListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAddressListRequest, GetAddressListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "GetApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/GetApplication");
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
    public java.util.concurrent.Future<GetApplicationGroupResponse> getApplicationGroup(
            GetApplicationGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationGroupRequest, GetApplicationGroupResponse>
                    handler) {
        LOG.trace("Called async getApplicationGroup");
        final GetApplicationGroupRequest interceptedRequest =
                GetApplicationGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/GetApplicationGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, GetApplicationGroupResponse>
                transformer =
                        GetApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetApplicationGroupRequest, GetApplicationGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApplicationGroupRequest, GetApplicationGroupResponse>,
                        java.util.concurrent.Future<GetApplicationGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApplicationGroupRequest, GetApplicationGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDecryptionProfileResponse> getDecryptionProfile(
            GetDecryptionProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDecryptionProfileRequest, GetDecryptionProfileResponse>
                    handler) {
        LOG.trace("Called async getDecryptionProfile");
        final GetDecryptionProfileRequest interceptedRequest =
                GetDecryptionProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDecryptionProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/GetDecryptionProfile");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDecryptionProfileResponse>
                transformer =
                        GetDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDecryptionProfileRequest, GetDecryptionProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDecryptionProfileRequest, GetDecryptionProfileResponse>,
                        java.util.concurrent.Future<GetDecryptionProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDecryptionProfileRequest, GetDecryptionProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDecryptionRuleResponse> getDecryptionRule(
            GetDecryptionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDecryptionRuleRequest, GetDecryptionRuleResponse>
                    handler) {
        LOG.trace("Called async getDecryptionRule");
        final GetDecryptionRuleRequest interceptedRequest =
                GetDecryptionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDecryptionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/GetDecryptionRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDecryptionRuleResponse>
                transformer =
                        GetDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDecryptionRuleRequest, GetDecryptionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDecryptionRuleRequest, GetDecryptionRuleResponse>,
                        java.util.concurrent.Future<GetDecryptionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDecryptionRuleRequest, GetDecryptionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMappedSecretResponse> getMappedSecret(
            GetMappedSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMappedSecretRequest, GetMappedSecretResponse>
                    handler) {
        LOG.trace("Called async getMappedSecret");
        final GetMappedSecretRequest interceptedRequest =
                GetMappedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMappedSecretConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/GetMappedSecret");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMappedSecretResponse>
                transformer =
                        GetMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMappedSecretRequest, GetMappedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMappedSecretRequest, GetMappedSecretResponse>,
                        java.util.concurrent.Future<GetMappedSecretResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMappedSecretRequest, GetMappedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkFirewallResponse> getNetworkFirewall(
            GetNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallRequest, GetNetworkFirewallResponse>
                    handler) {
        LOG.trace("Called async getNetworkFirewall");
        final GetNetworkFirewallRequest interceptedRequest =
                GetNetworkFirewallConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkFirewallConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/GetNetworkFirewall");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNetworkFirewallResponse>
                transformer =
                        GetNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetNetworkFirewallRequest, GetNetworkFirewallResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkFirewallRequest, GetNetworkFirewallResponse>,
                        java.util.concurrent.Future<GetNetworkFirewallResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkFirewallRequest, GetNetworkFirewallResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetNetworkFirewallPolicyResponse> getNetworkFirewallPolicy(
            GetNetworkFirewallPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>
                    handler) {
        LOG.trace("Called async getNetworkFirewallPolicy");
        final GetNetworkFirewallPolicyRequest interceptedRequest =
                GetNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/GetNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetNetworkFirewallPolicyResponse>
                transformer =
                        GetNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<GetNetworkFirewallPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetSecurityRuleResponse> getSecurityRule(
            GetSecurityRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityRuleRequest, GetSecurityRuleResponse>
                    handler) {
        LOG.trace("Called async getSecurityRule");
        final GetSecurityRuleRequest interceptedRequest =
                GetSecurityRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/GetSecurityRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityRuleResponse>
                transformer =
                        GetSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSecurityRuleRequest, GetSecurityRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityRuleRequest, GetSecurityRuleResponse>,
                        java.util.concurrent.Future<GetSecurityRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityRuleRequest, GetSecurityRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "GetService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/GetService");
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
    public java.util.concurrent.Future<GetServiceListResponse> getServiceList(
            GetServiceListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetServiceListRequest, GetServiceListResponse>
                    handler) {
        LOG.trace("Called async getServiceList");
        final GetServiceListRequest interceptedRequest =
                GetServiceListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetServiceListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/GetServiceList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetServiceListResponse>
                transformer =
                        GetServiceListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetServiceListRequest, GetServiceListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetServiceListRequest, GetServiceListResponse>,
                        java.util.concurrent.Future<GetServiceListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetServiceListRequest, GetServiceListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTunnelInspectionRuleResponse> getTunnelInspectionRule(
            GetTunnelInspectionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTunnelInspectionRuleRequest, GetTunnelInspectionRuleResponse>
                    handler) {
        LOG.trace("Called async getTunnelInspectionRule");
        final GetTunnelInspectionRuleRequest interceptedRequest =
                GetTunnelInspectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTunnelInspectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetTunnelInspectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/GetTunnelInspectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetTunnelInspectionRuleResponse>
                transformer =
                        GetTunnelInspectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetTunnelInspectionRuleRequest, GetTunnelInspectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTunnelInspectionRuleRequest, GetTunnelInspectionRuleResponse>,
                        java.util.concurrent.Future<GetTunnelInspectionRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTunnelInspectionRuleRequest, GetTunnelInspectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUrlListResponse> getUrlList(
            GetUrlListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUrlListRequest, GetUrlListResponse>
                    handler) {
        LOG.trace("Called async getUrlList");
        final GetUrlListRequest interceptedRequest = GetUrlListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUrlListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "GetUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/GetUrlList");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUrlListResponse>
                transformer =
                        GetUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUrlListRequest, GetUrlListResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUrlListRequest, GetUrlListResponse>,
                        java.util.concurrent.Future<GetUrlListResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUrlListRequest, GetUrlListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListAddressListsResponse> listAddressLists(
            ListAddressListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAddressListsRequest, ListAddressListsResponse>
                    handler) {
        LOG.trace("Called async listAddressLists");
        final ListAddressListsRequest interceptedRequest =
                ListAddressListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAddressListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListAddressLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/ListAddressLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAddressListsResponse>
                transformer =
                        ListAddressListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAddressListsRequest, ListAddressListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAddressListsRequest, ListAddressListsResponse>,
                        java.util.concurrent.Future<ListAddressListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAddressListsRequest, ListAddressListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListApplicationGroupsResponse> listApplicationGroups(
            ListApplicationGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationGroupsRequest, ListApplicationGroupsResponse>
                    handler) {
        LOG.trace("Called async listApplicationGroups");
        final ListApplicationGroupsRequest interceptedRequest =
                ListApplicationGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListApplicationGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/ListApplicationGroups");
        final java.util.function.Function<javax.ws.rs.core.Response, ListApplicationGroupsResponse>
                transformer =
                        ListApplicationGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListApplicationGroupsRequest, ListApplicationGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApplicationGroupsRequest, ListApplicationGroupsResponse>,
                        java.util.concurrent.Future<ListApplicationGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApplicationGroupsRequest, ListApplicationGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "ListApplications",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/ListApplications");
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
    public java.util.concurrent.Future<ListDecryptionProfilesResponse> listDecryptionProfiles(
            ListDecryptionProfilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>
                    handler) {
        LOG.trace("Called async listDecryptionProfiles");
        final ListDecryptionProfilesRequest interceptedRequest =
                ListDecryptionProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDecryptionProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListDecryptionProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/ListDecryptionProfiles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDecryptionProfilesResponse>
                transformer =
                        ListDecryptionProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>,
                        java.util.concurrent.Future<ListDecryptionProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDecryptionRulesResponse> listDecryptionRules(
            ListDecryptionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDecryptionRulesRequest, ListDecryptionRulesResponse>
                    handler) {
        LOG.trace("Called async listDecryptionRules");
        final ListDecryptionRulesRequest interceptedRequest =
                ListDecryptionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDecryptionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListDecryptionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/ListDecryptionRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDecryptionRulesResponse>
                transformer =
                        ListDecryptionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDecryptionRulesRequest, ListDecryptionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDecryptionRulesRequest, ListDecryptionRulesResponse>,
                        java.util.concurrent.Future<ListDecryptionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDecryptionRulesRequest, ListDecryptionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMappedSecretsResponse> listMappedSecrets(
            ListMappedSecretsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMappedSecretsRequest, ListMappedSecretsResponse>
                    handler) {
        LOG.trace("Called async listMappedSecrets");
        final ListMappedSecretsRequest interceptedRequest =
                ListMappedSecretsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMappedSecretsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListMappedSecrets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/ListMappedSecrets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMappedSecretsResponse>
                transformer =
                        ListMappedSecretsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMappedSecretsRequest, ListMappedSecretsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMappedSecretsRequest, ListMappedSecretsResponse>,
                        java.util.concurrent.Future<ListMappedSecretsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMappedSecretsRequest, ListMappedSecretsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkFirewallPoliciesResponse>
            listNetworkFirewallPolicies(
                    ListNetworkFirewallPoliciesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkFirewallPoliciesRequest,
                                    ListNetworkFirewallPoliciesResponse>
                            handler) {
        LOG.trace("Called async listNetworkFirewallPolicies");
        final ListNetworkFirewallPoliciesRequest interceptedRequest =
                ListNetworkFirewallPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkFirewallPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewallPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ListNetworkFirewallPolicies");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNetworkFirewallPoliciesResponse>
                transformer =
                        ListNetworkFirewallPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkFirewallPoliciesRequest, ListNetworkFirewallPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkFirewallPoliciesRequest,
                                ListNetworkFirewallPoliciesResponse>,
                        java.util.concurrent.Future<ListNetworkFirewallPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkFirewallPoliciesRequest, ListNetworkFirewallPoliciesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListNetworkFirewallsResponse> listNetworkFirewalls(
            ListNetworkFirewallsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>
                    handler) {
        LOG.trace("Called async listNetworkFirewalls");
        final ListNetworkFirewallsRequest interceptedRequest =
                ListNetworkFirewallsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkFirewallsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewalls",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ListNetworkFirewalls");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNetworkFirewallsResponse>
                transformer =
                        ListNetworkFirewallsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>,
                        java.util.concurrent.Future<ListNetworkFirewallsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSecurityRulesResponse> listSecurityRules(
            ListSecurityRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityRulesRequest, ListSecurityRulesResponse>
                    handler) {
        LOG.trace("Called async listSecurityRules");
        final ListSecurityRulesRequest interceptedRequest =
                ListSecurityRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListSecurityRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/ListSecurityRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityRulesResponse>
                transformer =
                        ListSecurityRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSecurityRulesRequest, ListSecurityRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityRulesRequest, ListSecurityRulesResponse>,
                        java.util.concurrent.Future<ListSecurityRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityRulesRequest, ListSecurityRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListServiceListsResponse> listServiceLists(
            ListServiceListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListServiceListsRequest, ListServiceListsResponse>
                    handler) {
        LOG.trace("Called async listServiceLists");
        final ListServiceListsRequest interceptedRequest =
                ListServiceListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListServiceListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListServiceLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/ListServiceLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListServiceListsResponse>
                transformer =
                        ListServiceListsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListServiceListsRequest, ListServiceListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListServiceListsRequest, ListServiceListsResponse>,
                        java.util.concurrent.Future<ListServiceListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListServiceListsRequest, ListServiceListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "ListServices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/ListServices");
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
    public java.util.concurrent.Future<ListTunnelInspectionRulesResponse> listTunnelInspectionRules(
            ListTunnelInspectionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>
                    handler) {
        LOG.trace("Called async listTunnelInspectionRules");
        final ListTunnelInspectionRulesRequest interceptedRequest =
                ListTunnelInspectionRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTunnelInspectionRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListTunnelInspectionRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/ListTunnelInspectionRules");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListTunnelInspectionRulesResponse>
                transformer =
                        ListTunnelInspectionRulesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTunnelInspectionRulesRequest,
                                ListTunnelInspectionRulesResponse>,
                        java.util.concurrent.Future<ListTunnelInspectionRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUrlListsResponse> listUrlLists(
            ListUrlListsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUrlListsRequest, ListUrlListsResponse>
                    handler) {
        LOG.trace("Called async listUrlLists");
        final ListUrlListsRequest interceptedRequest =
                ListUrlListsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUrlListsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "ListUrlLists",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/ListUrlLists");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUrlListsResponse>
                transformer =
                        ListUrlListsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListUrlListsRequest, ListUrlListsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUrlListsRequest, ListUrlListsResponse>,
                        java.util.concurrent.Future<ListUrlListsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUrlListsRequest, ListUrlListsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestError/ListWorkRequestErrors");
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
                        "NetworkFirewall",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestLogEntry/ListWorkRequestLogs");
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
                        "NetworkFirewall",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/ListWorkRequests");
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
    public java.util.concurrent.Future<MigrateNetworkFirewallPolicyResponse>
            migrateNetworkFirewallPolicy(
                    MigrateNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MigrateNetworkFirewallPolicyRequest,
                                    MigrateNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async migrateNetworkFirewallPolicy");
        final MigrateNetworkFirewallPolicyRequest interceptedRequest =
                MigrateNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MigrateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "MigrateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/MigrateNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, MigrateNetworkFirewallPolicyResponse>
                transformer =
                        MigrateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        MigrateNetworkFirewallPolicyRequest, MigrateNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                MigrateNetworkFirewallPolicyRequest,
                                MigrateNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<MigrateNetworkFirewallPolicyResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    MigrateNetworkFirewallPolicyRequest, MigrateNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAddressListResponse> updateAddressList(
            UpdateAddressListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAddressListRequest, UpdateAddressListResponse>
                    handler) {
        LOG.trace("Called async updateAddressList");
        final UpdateAddressListRequest interceptedRequest =
                UpdateAddressListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAddressListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateAddressList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/UpdateAddressList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAddressListResponse>
                transformer =
                        UpdateAddressListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateAddressListRequest, UpdateAddressListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAddressListRequest, UpdateAddressListResponse>,
                        java.util.concurrent.Future<UpdateAddressListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAddressListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAddressListRequest, UpdateAddressListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "NetworkFirewall",
                        "UpdateApplication",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/UpdateApplication");
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
    public java.util.concurrent.Future<UpdateApplicationGroupResponse> updateApplicationGroup(
            UpdateApplicationGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>
                    handler) {
        LOG.trace("Called async updateApplicationGroup");
        final UpdateApplicationGroupRequest interceptedRequest =
                UpdateApplicationGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateApplicationGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/UpdateApplicationGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateApplicationGroupResponse>
                transformer =
                        UpdateApplicationGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>,
                        java.util.concurrent.Future<UpdateApplicationGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateApplicationGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDecryptionProfileResponse> updateDecryptionProfile(
            UpdateDecryptionProfileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDecryptionProfileRequest, UpdateDecryptionProfileResponse>
                    handler) {
        LOG.trace("Called async updateDecryptionProfile");
        final UpdateDecryptionProfileRequest interceptedRequest =
                UpdateDecryptionProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDecryptionProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/UpdateDecryptionProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateDecryptionProfileResponse>
                transformer =
                        UpdateDecryptionProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDecryptionProfileRequest, UpdateDecryptionProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDecryptionProfileRequest, UpdateDecryptionProfileResponse>,
                        java.util.concurrent.Future<UpdateDecryptionProfileResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDecryptionProfileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDecryptionProfileRequest, UpdateDecryptionProfileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDecryptionRuleResponse> updateDecryptionRule(
            UpdateDecryptionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDecryptionRuleRequest, UpdateDecryptionRuleResponse>
                    handler) {
        LOG.trace("Called async updateDecryptionRule");
        final UpdateDecryptionRuleRequest interceptedRequest =
                UpdateDecryptionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDecryptionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/UpdateDecryptionRule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateDecryptionRuleResponse>
                transformer =
                        UpdateDecryptionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDecryptionRuleRequest, UpdateDecryptionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDecryptionRuleRequest, UpdateDecryptionRuleResponse>,
                        java.util.concurrent.Future<UpdateDecryptionRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDecryptionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDecryptionRuleRequest, UpdateDecryptionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMappedSecretResponse> updateMappedSecret(
            UpdateMappedSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMappedSecretRequest, UpdateMappedSecretResponse>
                    handler) {
        LOG.trace("Called async updateMappedSecret");
        final UpdateMappedSecretRequest interceptedRequest =
                UpdateMappedSecretConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMappedSecretConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateMappedSecret",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/UpdateMappedSecret");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMappedSecretResponse>
                transformer =
                        UpdateMappedSecretConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateMappedSecretRequest, UpdateMappedSecretResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMappedSecretRequest, UpdateMappedSecretResponse>,
                        java.util.concurrent.Future<UpdateMappedSecretResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMappedSecretDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMappedSecretRequest, UpdateMappedSecretResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkFirewallResponse> updateNetworkFirewall(
            UpdateNetworkFirewallRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>
                    handler) {
        LOG.trace("Called async updateNetworkFirewall");
        final UpdateNetworkFirewallRequest interceptedRequest =
                UpdateNetworkFirewallConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkFirewallConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewall",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/UpdateNetworkFirewall");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateNetworkFirewallResponse>
                transformer =
                        UpdateNetworkFirewallConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>,
                        java.util.concurrent.Future<UpdateNetworkFirewallResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkFirewallDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkFirewallPolicyResponse>
            updateNetworkFirewallPolicy(
                    UpdateNetworkFirewallPolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkFirewallPolicyRequest,
                                    UpdateNetworkFirewallPolicyResponse>
                            handler) {
        LOG.trace("Called async updateNetworkFirewallPolicy");
        final UpdateNetworkFirewallPolicyRequest interceptedRequest =
                UpdateNetworkFirewallPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNetworkFirewallPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewallPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/UpdateNetworkFirewallPolicy");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateNetworkFirewallPolicyResponse>
                transformer =
                        UpdateNetworkFirewallPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateNetworkFirewallPolicyRequest, UpdateNetworkFirewallPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateNetworkFirewallPolicyRequest,
                                UpdateNetworkFirewallPolicyResponse>,
                        java.util.concurrent.Future<UpdateNetworkFirewallPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateNetworkFirewallPolicyDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateNetworkFirewallPolicyRequest, UpdateNetworkFirewallPolicyResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityRuleResponse> updateSecurityRule(
            UpdateSecurityRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityRuleRequest, UpdateSecurityRuleResponse>
                    handler) {
        LOG.trace("Called async updateSecurityRule");
        final UpdateSecurityRuleRequest interceptedRequest =
                UpdateSecurityRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateSecurityRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/UpdateSecurityRule");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateSecurityRuleResponse>
                transformer =
                        UpdateSecurityRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateSecurityRuleRequest, UpdateSecurityRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateSecurityRuleRequest, UpdateSecurityRuleResponse>,
                        java.util.concurrent.Future<UpdateSecurityRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateSecurityRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateSecurityRuleRequest, UpdateSecurityRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResponse> updateService(
            UpdateServiceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateServiceRequest, UpdateServiceResponse>
                    handler) {
        LOG.trace("Called async updateService");
        final UpdateServiceRequest interceptedRequest =
                UpdateServiceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateServiceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateService",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/UpdateService");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateServiceResponse>
                transformer =
                        UpdateServiceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateServiceRequest, UpdateServiceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateServiceRequest, UpdateServiceResponse>,
                        java.util.concurrent.Future<UpdateServiceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateServiceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateServiceRequest, UpdateServiceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceListResponse> updateServiceList(
            UpdateServiceListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceListRequest, UpdateServiceListResponse>
                    handler) {
        LOG.trace("Called async updateServiceList");
        final UpdateServiceListRequest interceptedRequest =
                UpdateServiceListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateServiceListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateServiceList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/UpdateServiceList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateServiceListResponse>
                transformer =
                        UpdateServiceListConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateServiceListRequest, UpdateServiceListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateServiceListRequest, UpdateServiceListResponse>,
                        java.util.concurrent.Future<UpdateServiceListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateServiceListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateServiceListRequest, UpdateServiceListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTunnelInspectionRuleResponse>
            updateTunnelInspectionRule(
                    UpdateTunnelInspectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTunnelInspectionRuleRequest,
                                    UpdateTunnelInspectionRuleResponse>
                            handler) {
        LOG.trace("Called async updateTunnelInspectionRule");
        final UpdateTunnelInspectionRuleRequest interceptedRequest =
                UpdateTunnelInspectionRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTunnelInspectionRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateTunnelInspectionRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/TunnelInspectionRule/UpdateTunnelInspectionRule");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateTunnelInspectionRuleResponse>
                transformer =
                        UpdateTunnelInspectionRuleConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateTunnelInspectionRuleRequest, UpdateTunnelInspectionRuleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTunnelInspectionRuleRequest,
                                UpdateTunnelInspectionRuleResponse>,
                        java.util.concurrent.Future<UpdateTunnelInspectionRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTunnelInspectionRuleDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTunnelInspectionRuleRequest, UpdateTunnelInspectionRuleResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateUrlListResponse> updateUrlList(
            UpdateUrlListRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateUrlListRequest, UpdateUrlListResponse>
                    handler) {
        LOG.trace("Called async updateUrlList");
        final UpdateUrlListRequest interceptedRequest =
                UpdateUrlListConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUrlListConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "NetworkFirewall",
                        "UpdateUrlList",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/UpdateUrlList");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateUrlListResponse>
                transformer =
                        UpdateUrlListConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateUrlListRequest, UpdateUrlListResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateUrlListRequest, UpdateUrlListResponse>,
                        java.util.concurrent.Future<UpdateUrlListResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateUrlListDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateUrlListRequest, UpdateUrlListResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
