/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.internal.http.*;
import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Async client implementation for CostAd service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class CostAdAsyncClient implements CostAdAsync {
    /**
     * Service instance for CostAd.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(CostAdClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CostAdAsyncClient.class);

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
    public CostAdAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CostAdAsyncClient> {
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
        public CostAdAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new CostAdAsyncClient(
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
    public java.util.concurrent.Future<CreateCostAlertSubscriptionResponse>
            createCostAlertSubscription(
                    CreateCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCostAlertSubscriptionRequest,
                                    CreateCostAlertSubscriptionResponse>
                            handler) {
        LOG.trace("Called async createCostAlertSubscription");
        final CreateCostAlertSubscriptionRequest interceptedRequest =
                CreateCostAlertSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCostAlertSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "CreateCostAlertSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/CreateCostAlertSubscription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCostAlertSubscriptionResponse>
                transformer =
                        CreateCostAlertSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCostAlertSubscriptionRequest, CreateCostAlertSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCostAlertSubscriptionRequest,
                                CreateCostAlertSubscriptionResponse>,
                        java.util.concurrent.Future<CreateCostAlertSubscriptionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCostAlertSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCostAlertSubscriptionRequest, CreateCostAlertSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCostAnomalyMonitorResponse> createCostAnomalyMonitor(
            CreateCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async createCostAnomalyMonitor");
        final CreateCostAnomalyMonitorRequest interceptedRequest =
                CreateCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "CreateCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/CreateCostAnomalyMonitor");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCostAnomalyMonitorResponse>
                transformer =
                        CreateCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<CreateCostAnomalyMonitorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCostAnomalyMonitorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCostAlertSubscriptionResponse>
            deleteCostAlertSubscription(
                    DeleteCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCostAlertSubscriptionRequest,
                                    DeleteCostAlertSubscriptionResponse>
                            handler) {
        LOG.trace("Called async deleteCostAlertSubscription");
        final DeleteCostAlertSubscriptionRequest interceptedRequest =
                DeleteCostAlertSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCostAlertSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "DeleteCostAlertSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/DeleteCostAlertSubscription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCostAlertSubscriptionResponse>
                transformer =
                        DeleteCostAlertSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCostAlertSubscriptionRequest, DeleteCostAlertSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCostAlertSubscriptionRequest,
                                DeleteCostAlertSubscriptionResponse>,
                        java.util.concurrent.Future<DeleteCostAlertSubscriptionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCostAlertSubscriptionRequest, DeleteCostAlertSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteCostAnomalyMonitorResponse> deleteCostAnomalyMonitor(
            DeleteCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async deleteCostAnomalyMonitor");
        final DeleteCostAnomalyMonitorRequest interceptedRequest =
                DeleteCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "DeleteCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/DeleteCostAnomalyMonitor");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCostAnomalyMonitorResponse>
                transformer =
                        DeleteCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<DeleteCostAnomalyMonitorResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableCostAnomalyMonitorResponse> disableCostAnomalyMonitor(
            DisableCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableCostAnomalyMonitorRequest, DisableCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async disableCostAnomalyMonitor");
        final DisableCostAnomalyMonitorRequest interceptedRequest =
                DisableCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "DisableCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/DisableCostAnomalyMonitor");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableCostAnomalyMonitorResponse>
                transformer =
                        DisableCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableCostAnomalyMonitorRequest, DisableCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableCostAnomalyMonitorRequest,
                                DisableCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<DisableCostAnomalyMonitorResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableCostAnomalyMonitorRequest, DisableCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableCostAnomalyMonitorResponse> enableCostAnomalyMonitor(
            EnableCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async enableCostAnomalyMonitor");
        final EnableCostAnomalyMonitorRequest interceptedRequest =
                EnableCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "EnableCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/EnableCostAnomalyMonitor");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EnableCostAnomalyMonitorResponse>
                transformer =
                        EnableCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<EnableCostAnomalyMonitorResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCostAlertSubscriptionResponse> getCostAlertSubscription(
            GetCostAlertSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
                    handler) {
        LOG.trace("Called async getCostAlertSubscription");
        final GetCostAlertSubscriptionRequest interceptedRequest =
                GetCostAlertSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCostAlertSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "GetCostAlertSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/GetCostAlertSubscription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetCostAlertSubscriptionResponse>
                transformer =
                        GetCostAlertSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>,
                        java.util.concurrent.Future<GetCostAlertSubscriptionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCostAnomalyEventResponse> getCostAnomalyEvent(
            GetCostAnomalyEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
                    handler) {
        LOG.trace("Called async getCostAnomalyEvent");
        final GetCostAnomalyEventRequest interceptedRequest =
                GetCostAnomalyEventConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCostAnomalyEventConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "GetCostAnomalyEvent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/GetCostAnomalyEvent");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCostAnomalyEventResponse>
                transformer =
                        GetCostAnomalyEventConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>,
                        java.util.concurrent.Future<GetCostAnomalyEventResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetCostAnomalyMonitorResponse> getCostAnomalyMonitor(
            GetCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async getCostAnomalyMonitor");
        final GetCostAnomalyMonitorRequest interceptedRequest =
                GetCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "GetCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/GetCostAnomalyMonitor");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCostAnomalyMonitorResponse>
                transformer =
                        GetCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<GetCostAnomalyMonitorResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCostAlertSubscriptionsResponse>
            listCostAlertSubscriptions(
                    ListCostAlertSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCostAlertSubscriptionsRequest,
                                    ListCostAlertSubscriptionsResponse>
                            handler) {
        LOG.trace("Called async listCostAlertSubscriptions");
        final ListCostAlertSubscriptionsRequest interceptedRequest =
                ListCostAlertSubscriptionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCostAlertSubscriptionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "ListCostAlertSubscriptions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscriptionCollection/ListCostAlertSubscriptions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCostAlertSubscriptionsResponse>
                transformer =
                        ListCostAlertSubscriptionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCostAlertSubscriptionsRequest, ListCostAlertSubscriptionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCostAlertSubscriptionsRequest,
                                ListCostAlertSubscriptionsResponse>,
                        java.util.concurrent.Future<ListCostAlertSubscriptionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCostAlertSubscriptionsRequest, ListCostAlertSubscriptionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCostAnomalyEventsResponse> listCostAnomalyEvents(
            ListCostAnomalyEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>
                    handler) {
        LOG.trace("Called async listCostAnomalyEvents");
        final ListCostAnomalyEventsRequest interceptedRequest =
                ListCostAnomalyEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCostAnomalyEventsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "ListCostAnomalyEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEventCollection/ListCostAnomalyEvents");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCostAnomalyEventsResponse>
                transformer =
                        ListCostAnomalyEventsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>,
                        java.util.concurrent.Future<ListCostAnomalyEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListCostAnomalyMonitorsResponse> listCostAnomalyMonitors(
            ListCostAnomalyMonitorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>
                    handler) {
        LOG.trace("Called async listCostAnomalyMonitors");
        final ListCostAnomalyMonitorsRequest interceptedRequest =
                ListCostAnomalyMonitorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCostAnomalyMonitorsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "ListCostAnomalyMonitors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitorCollection/ListCostAnomalyMonitors");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListCostAnomalyMonitorsResponse>
                transformer =
                        ListCostAnomalyMonitorsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>,
                        java.util.concurrent.Future<ListCostAnomalyMonitorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeCostAnomalyEventAnalyticsResponse>
            summarizeCostAnomalyEventAnalytics(
                    SummarizeCostAnomalyEventAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeCostAnomalyEventAnalyticsRequest,
                                    SummarizeCostAnomalyEventAnalyticsResponse>
                            handler) {
        LOG.trace("Called async summarizeCostAnomalyEventAnalytics");
        final SummarizeCostAnomalyEventAnalyticsRequest interceptedRequest =
                SummarizeCostAnomalyEventAnalyticsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeCostAnomalyEventAnalyticsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "SummarizeCostAnomalyEventAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/SummarizeCostAnomalyEventAnalytics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SummarizeCostAnomalyEventAnalyticsResponse>
                transformer =
                        SummarizeCostAnomalyEventAnalyticsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeCostAnomalyEventAnalyticsRequest,
                        SummarizeCostAnomalyEventAnalyticsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeCostAnomalyEventAnalyticsRequest,
                                SummarizeCostAnomalyEventAnalyticsResponse>,
                        java.util.concurrent.Future<SummarizeCostAnomalyEventAnalyticsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeCostAnomalyEventAnalyticsRequest,
                    SummarizeCostAnomalyEventAnalyticsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAlertSubscriptionResponse>
            updateCostAlertSubscription(
                    UpdateCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCostAlertSubscriptionRequest,
                                    UpdateCostAlertSubscriptionResponse>
                            handler) {
        LOG.trace("Called async updateCostAlertSubscription");
        final UpdateCostAlertSubscriptionRequest interceptedRequest =
                UpdateCostAlertSubscriptionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCostAlertSubscriptionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "UpdateCostAlertSubscription",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/UpdateCostAlertSubscription");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCostAlertSubscriptionResponse>
                transformer =
                        UpdateCostAlertSubscriptionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCostAlertSubscriptionRequest, UpdateCostAlertSubscriptionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCostAlertSubscriptionRequest,
                                UpdateCostAlertSubscriptionResponse>,
                        java.util.concurrent.Future<UpdateCostAlertSubscriptionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCostAlertSubscriptionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCostAlertSubscriptionRequest, UpdateCostAlertSubscriptionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAnomalyEventResponse> updateCostAnomalyEvent(
            UpdateCostAnomalyEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>
                    handler) {
        LOG.trace("Called async updateCostAnomalyEvent");
        final UpdateCostAnomalyEventRequest interceptedRequest =
                UpdateCostAnomalyEventConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCostAnomalyEventConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "UpdateCostAnomalyEvent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/UpdateCostAnomalyEvent");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateCostAnomalyEventResponse>
                transformer =
                        UpdateCostAnomalyEventConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>,
                        java.util.concurrent.Future<UpdateCostAnomalyEventResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCostAnomalyEventDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAnomalyMonitorResponse> updateCostAnomalyMonitor(
            UpdateCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>
                    handler) {
        LOG.trace("Called async updateCostAnomalyMonitor");
        final UpdateCostAnomalyMonitorRequest interceptedRequest =
                UpdateCostAnomalyMonitorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCostAnomalyMonitorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "CostAd",
                        "UpdateCostAnomalyMonitor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/UpdateCostAnomalyMonitor");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateCostAnomalyMonitorResponse>
                transformer =
                        UpdateCostAnomalyMonitorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>,
                        java.util.concurrent.Future<UpdateCostAnomalyMonitorResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateCostAnomalyMonitorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
